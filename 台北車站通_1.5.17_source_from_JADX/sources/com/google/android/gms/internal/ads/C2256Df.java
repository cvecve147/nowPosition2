package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Df */
public final class C2256Df implements C3518uf {

    /* renamed from: a */
    private final String f6890a;

    public C2256Df() {
        this((String) null);
    }

    public C2256Df(String str) {
        this.f6890a = str;
    }

    /* renamed from: a */
    public final void mo7980a(String str) {
        String sb;
        String message;
        StringBuilder sb2;
        HttpURLConnection httpURLConnection;
        try {
            String valueOf = String.valueOf(str);
            C2227Cf.m9532b(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            C3390pt.m13453a();
            C3432rf.m13603a(true, httpURLConnection, this.f6890a);
            C3548vf vfVar = new C3548vf();
            vfVar.mo10125a(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            vfVar.mo10124a(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 65);
                sb3.append("Received non-success response code ");
                sb3.append(responseCode);
                sb3.append(" from pinging URL: ");
                sb3.append(str);
                C2227Cf.m9536d(sb3.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            String message2 = e.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb4.append("Error while parsing ping URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            sb = sb4.toString();
            C2227Cf.m9536d(sb);
        } catch (IOException e2) {
            message = e2.getMessage();
            sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            sb = sb2.toString();
            C2227Cf.m9536d(sb);
        } catch (RuntimeException e3) {
            message = e3.getMessage();
            sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            sb = sb2.toString();
            C2227Cf.m9536d(sb);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
