package p208e.p209a.p210a.p211a.p212a.p218e;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import p208e.p209a.p210a.p211a.p212a.p218e.C6149f;

/* renamed from: e.a.a.a.a.e.e */
class C6148e extends C6149f.C6150a<C6149f> {

    /* renamed from: c */
    final /* synthetic */ InputStream f17152c;

    /* renamed from: d */
    final /* synthetic */ OutputStream f17153d;

    /* renamed from: e */
    final /* synthetic */ C6149f f17154e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6148e(C6149f fVar, Closeable closeable, boolean z, InputStream inputStream, OutputStream outputStream) {
        super(closeable, z);
        this.f17154e = fVar;
        this.f17152c = inputStream;
        this.f17153d = outputStream;
    }

    /* renamed from: b */
    public C6149f m23247b() {
        byte[] bArr = new byte[this.f17154e.f17164j];
        while (true) {
            int read = this.f17152c.read(bArr);
            if (read == -1) {
                return this.f17154e;
            }
            this.f17153d.write(bArr, 0, read);
        }
    }
}
