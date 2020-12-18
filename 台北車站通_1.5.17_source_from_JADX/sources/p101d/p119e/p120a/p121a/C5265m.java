package p101d.p119e.p120a.p121a;

import java.io.UnsupportedEncodingException;
import p101d.p119e.p120a.C5279l;
import p101d.p119e.p120a.C5284q;
import p101d.p119e.p120a.C5288s;

/* renamed from: d.e.a.a.m */
public class C5265m extends C5284q<String> {

    /* renamed from: q */
    private C5288s.C5290b<String> f14897q;

    public C5265m(int i, String str, C5288s.C5290b<String> bVar, C5288s.C5289a aVar) {
        super(i, str, aVar);
        this.f14897q = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo14591B() {
        super.mo14591B();
        this.f14897q = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5288s<String> mo14590a(C5279l lVar) {
        String str;
        try {
            str = new String(lVar.f14931b, C5258g.m20366a(lVar.f14932c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(lVar.f14931b);
        }
        return C5288s.m20458a(str, C5258g.m20365a(lVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14592a(String str) {
        C5288s.C5290b<String> bVar = this.f14897q;
        if (bVar != null) {
            bVar.mo14126a(str);
        }
    }
}
