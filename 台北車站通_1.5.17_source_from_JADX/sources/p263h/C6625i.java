package p263h;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;
import p263h.C6626j;

/* renamed from: h.i */
class C6625i extends ForwardingSource {

    /* renamed from: a */
    final /* synthetic */ C6626j.C6627a f18334a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6625i(C6626j.C6627a aVar, Source source) {
        super(source);
        this.f18334a = aVar;
    }

    public long read(Buffer buffer, long j) {
        try {
            return super.read(buffer, j);
        } catch (IOException e) {
            this.f18334a.f18342b = e;
            throw e;
        }
    }
}
