package p263h.p264a.p265a;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import org.apache.http.protocol.HTTP;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p158d.C5718d;
import p263h.C6618d;

/* renamed from: h.a.a.b */
final class C6594b<T> implements C6618d<T, RequestBody> {

    /* renamed from: a */
    private static final MediaType f18320a = MediaType.parse("application/json; charset=UTF-8");

    /* renamed from: b */
    private static final Charset f18321b = Charset.forName(HTTP.UTF_8);

    /* renamed from: c */
    private final C5731p f18322c;

    /* renamed from: d */
    private final C5593I<T> f18323d;

    C6594b(C5731p pVar, C5593I<T> i) {
        this.f18322c = pVar;
        this.f18323d = i;
    }

    /* renamed from: a */
    public RequestBody m25186a(T t) {
        Buffer buffer = new Buffer();
        C5718d a = this.f18322c.mo15291a((Writer) new OutputStreamWriter(buffer.outputStream(), f18321b));
        this.f18323d.mo15097a(a, t);
        a.close();
        return RequestBody.create(f18320a, buffer.readByteString());
    }
}
