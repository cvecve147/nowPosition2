package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.NTCredentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
public class NTLMScheme extends AuthSchemeBase {
    private String challenge;
    private final NTLMEngine engine;
    private State state;

    enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    public NTLMScheme() {
        this(new NTLMEngineImpl());
    }

    public NTLMScheme(NTLMEngine nTLMEngine) {
        Args.notNull(nTLMEngine, "NTLM engine");
        this.engine = nTLMEngine;
        this.state = State.UNINITIATED;
        this.challenge = null;
    }

    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        String generateType3Msg;
        State state2;
        try {
            NTCredentials nTCredentials = (NTCredentials) credentials;
            State state3 = this.state;
            if (state3 != State.FAILED) {
                if (state3 == State.CHALLENGE_RECEIVED) {
                    generateType3Msg = this.engine.generateType1Msg(nTCredentials.getDomain(), nTCredentials.getWorkstation());
                    state2 = State.MSG_TYPE1_GENERATED;
                } else if (state3 == State.MSG_TYPE2_RECEVIED) {
                    generateType3Msg = this.engine.generateType3Msg(nTCredentials.getUserName(), nTCredentials.getPassword(), nTCredentials.getDomain(), nTCredentials.getWorkstation(), this.challenge);
                    state2 = State.MSG_TYPE3_GENERATED;
                } else {
                    throw new AuthenticationException("Unexpected state: " + this.state);
                }
                this.state = state2;
                CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
                charArrayBuffer.append(isProxy() ? "Proxy-Authorization" : "Authorization");
                charArrayBuffer.append(": NTLM ");
                charArrayBuffer.append(generateType3Msg);
                return new BufferedHeader(charArrayBuffer);
            }
            throw new AuthenticationException("NTLM authentication failed");
        } catch (ClassCastException unused) {
            throw new InvalidCredentialsException("Credentials cannot be used for NTLM authentication: " + credentials.getClass().getName());
        }
    }

    public String getParameter(String str) {
        return null;
    }

    public String getRealm() {
        return null;
    }

    public String getSchemeName() {
        return "ntlm";
    }

    public boolean isComplete() {
        State state2 = this.state;
        return state2 == State.MSG_TYPE3_GENERATED || state2 == State.FAILED;
    }

    public boolean isConnectionBased() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) {
        State state2;
        this.challenge = charArrayBuffer.substringTrimmed(i, i2);
        if (this.challenge.isEmpty()) {
            state2 = this.state == State.UNINITIATED ? State.CHALLENGE_RECEIVED : State.FAILED;
        } else if (this.state.compareTo(State.MSG_TYPE1_GENERATED) < 0) {
            this.state = State.FAILED;
            throw new MalformedChallengeException("Out of sequence NTLM response message");
        } else if (this.state == State.MSG_TYPE1_GENERATED) {
            state2 = State.MSG_TYPE2_RECEVIED;
        } else {
            return;
        }
        this.state = state2;
    }
}
