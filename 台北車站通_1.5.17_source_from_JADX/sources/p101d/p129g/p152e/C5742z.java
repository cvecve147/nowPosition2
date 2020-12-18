package p101d.p129g.p152e;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import p101d.p129g.p152e.p154b.C5603B;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5719e;

/* renamed from: d.g.e.z */
public final class C5742z {
    /* renamed from: a */
    public C5737u mo15325a(C5716b bVar) {
        boolean h = bVar.mo15274h();
        bVar.mo15272a(true);
        try {
            C5737u a = C5603B.m21254a(bVar);
            bVar.mo15272a(h);
            return a;
        } catch (StackOverflowError e) {
            throw new C5741y("Failed parsing JSON source: " + bVar + " to Json", e);
        } catch (OutOfMemoryError e2) {
            throw new C5741y("Failed parsing JSON source: " + bVar + " to Json", e2);
        } catch (Throwable th) {
            bVar.mo15272a(h);
            throw th;
        }
    }

    /* renamed from: a */
    public C5737u mo15326a(Reader reader) {
        try {
            C5716b bVar = new C5716b(reader);
            C5737u a = mo15325a(bVar);
            if (!a.mo15314f()) {
                if (bVar.mo15165p() != C5717c.END_DOCUMENT) {
                    throw new C5588D("Did not consume the entire document.");
                }
            }
            return a;
        } catch (C5719e e) {
            throw new C5588D((Throwable) e);
        } catch (IOException e2) {
            throw new C5738v((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new C5588D((Throwable) e3);
        }
    }

    /* renamed from: a */
    public C5737u mo15327a(String str) {
        return mo15326a((Reader) new StringReader(str));
    }
}
