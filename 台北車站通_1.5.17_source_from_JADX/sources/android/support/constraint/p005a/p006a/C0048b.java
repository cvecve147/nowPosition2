package android.support.constraint.p005a.p006a;

import android.support.constraint.p005a.C0064c;
import android.support.constraint.p005a.C0069h;
import java.util.HashSet;

/* renamed from: android.support.constraint.a.a.b */
public class C0048b {

    /* renamed from: a */
    final C0053d f215a;

    /* renamed from: b */
    final C0051c f216b;

    /* renamed from: c */
    C0048b f217c;

    /* renamed from: d */
    public int f218d = 0;

    /* renamed from: e */
    int f219e = -1;

    /* renamed from: f */
    private C0050b f220f = C0050b.NONE;

    /* renamed from: g */
    private C0049a f221g = C0049a.RELAXED;

    /* renamed from: h */
    private int f222h = 0;

    /* renamed from: i */
    C0069h f223i;

    /* renamed from: j */
    int f224j = Integer.MAX_VALUE;

    /* renamed from: android.support.constraint.a.a.b$a */
    public enum C0049a {
        RELAXED,
        STRICT
    }

    /* renamed from: android.support.constraint.a.a.b$b */
    public enum C0050b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: android.support.constraint.a.a.b$c */
    public enum C0051c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0048b(C0053d dVar, C0051c cVar) {
        this.f215a = dVar;
        this.f216b = cVar;
    }

    /* renamed from: a */
    private String m142a(HashSet<C0048b> hashSet) {
        String str;
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f215a.mo162e());
        sb.append(":");
        sb.append(this.f216b.toString());
        if (this.f217c != null) {
            str = " connected to " + this.f217c.m142a(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public int mo114a() {
        return this.f222h;
    }

    /* renamed from: a */
    public void mo115a(C0049a aVar) {
        this.f221g = aVar;
    }

    /* renamed from: a */
    public void mo116a(C0064c cVar) {
        C0069h hVar = this.f223i;
        if (hVar == null) {
            this.f223i = new C0069h(C0069h.C0070a.UNRESTRICTED);
        } else {
            hVar.mo265b();
        }
    }

    /* renamed from: a */
    public boolean mo117a(C0048b bVar) {
        if (bVar == null) {
            return false;
        }
        C0051c h = bVar.mo126h();
        C0051c cVar = this.f216b;
        if (h != cVar) {
            int i = C0047a.f214a[cVar.ordinal()];
            if (i == 1) {
                return (h == C0051c.BASELINE || h == C0051c.CENTER_X || h == C0051c.CENTER_Y) ? false : true;
            }
            if (i == 2 || i == 3) {
                boolean z = h == C0051c.LEFT || h == C0051c.RIGHT;
                return bVar.mo122d() instanceof C0057g ? z || h == C0051c.CENTER_X : z;
            } else if (i != 4 && i != 5) {
                return false;
            } else {
                boolean z2 = h == C0051c.TOP || h == C0051c.BOTTOM;
                return bVar.mo122d() instanceof C0057g ? z2 || h == C0051c.CENTER_Y : z2;
            }
        } else if (cVar == C0051c.CENTER) {
            return false;
        } else {
            return cVar != C0051c.BASELINE || (bVar.mo122d().mo191y() && mo122d().mo191y());
        }
    }

    /* renamed from: a */
    public boolean mo118a(C0048b bVar, int i, int i2, C0050b bVar2, int i3, boolean z) {
        if (bVar == null) {
            this.f217c = null;
            this.f218d = 0;
            this.f219e = -1;
            this.f220f = C0050b.NONE;
            this.f222h = 2;
            return true;
        } else if (!z && !mo117a(bVar)) {
            return false;
        } else {
            this.f217c = bVar;
            if (i > 0) {
                this.f218d = i;
            } else {
                this.f218d = 0;
            }
            this.f219e = i2;
            this.f220f = bVar2;
            this.f222h = i3;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo119a(C0048b bVar, int i, C0050b bVar2, int i2) {
        return mo118a(bVar, i, -1, bVar2, i2, false);
    }

    /* renamed from: b */
    public C0049a mo120b() {
        return this.f221g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = r3.f217c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo121c() {
        /*
            r3 = this;
            android.support.constraint.a.a.d r0 = r3.f215a
            int r0 = r0.mo184s()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f219e
            r2 = -1
            if (r0 <= r2) goto L_0x0020
            android.support.constraint.a.a.b r0 = r3.f217c
            if (r0 == 0) goto L_0x0020
            android.support.constraint.a.a.d r0 = r0.f215a
            int r0 = r0.mo184s()
            if (r0 != r1) goto L_0x0020
            int r0 = r3.f219e
            return r0
        L_0x0020:
            int r0 = r3.f218d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.p006a.C0048b.mo121c():int");
    }

    /* renamed from: d */
    public C0053d mo122d() {
        return this.f215a;
    }

    /* renamed from: e */
    public C0069h mo123e() {
        return this.f223i;
    }

    /* renamed from: f */
    public C0050b mo124f() {
        return this.f220f;
    }

    /* renamed from: g */
    public C0048b mo125g() {
        return this.f217c;
    }

    /* renamed from: h */
    public C0051c mo126h() {
        return this.f216b;
    }

    /* renamed from: i */
    public boolean mo127i() {
        return this.f217c != null;
    }

    /* renamed from: j */
    public void mo128j() {
        this.f217c = null;
        this.f218d = 0;
        this.f219e = -1;
        this.f220f = C0050b.STRONG;
        this.f222h = 0;
        this.f221g = C0049a.RELAXED;
    }

    public String toString() {
        String str;
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f215a.mo162e());
        sb.append(":");
        sb.append(this.f216b.toString());
        if (this.f217c != null) {
            str = " connected to " + this.f217c.m142a((HashSet<C0048b>) hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
