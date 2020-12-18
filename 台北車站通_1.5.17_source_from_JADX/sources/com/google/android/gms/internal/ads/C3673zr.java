package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import org.apache.http.message.TokenParser;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.zr */
public final class C3673zr {

    /* renamed from: a */
    private final int f10692a;

    /* renamed from: b */
    private final int f10693b;

    /* renamed from: c */
    private final int f10694c;

    /* renamed from: d */
    private final C2525Mr f10695d;

    /* renamed from: e */
    private final C2816Wr f10696e;

    /* renamed from: f */
    private final Object f10697f = new Object();

    /* renamed from: g */
    private ArrayList<String> f10698g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<String> f10699h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<C2467Kr> f10700i = new ArrayList<>();

    /* renamed from: j */
    private int f10701j = 0;

    /* renamed from: k */
    private int f10702k = 0;

    /* renamed from: l */
    private int f10703l = 0;

    /* renamed from: m */
    private int f10704m;

    /* renamed from: n */
    private String f10705n = "";

    /* renamed from: o */
    private String f10706o = "";

    /* renamed from: p */
    private String f10707p = "";

    public C3673zr(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f10692a = i;
        this.f10693b = i2;
        this.f10694c = i3;
        this.f10695d = new C2525Mr(i4);
        this.f10696e = new C2816Wr(i5, i6, i7);
    }

    /* renamed from: a */
    private static String m14724a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList.get(i2);
            i2++;
            sb.append(str);
            sb.append(TokenParser.f19315SP);
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    /* renamed from: c */
    private final void m14725c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f10694c) {
            synchronized (this.f10697f) {
                this.f10698g.add(str);
                this.f10701j += str.length();
                if (z) {
                    this.f10699h.add(str);
                    this.f10700i.add(new C2467Kr(f, f2, f3, f4, this.f10699h.size() - 1));
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo10268a() {
        return this.f10704m;
    }

    /* renamed from: a */
    public final void mo10269a(int i) {
        this.f10702k = i;
    }

    /* renamed from: a */
    public final void mo10270a(String str, boolean z, float f, float f2, float f3, float f4) {
        m14725c(str, z, f, f2, f3, f4);
        synchronized (this.f10697f) {
            if (this.f10703l < 0) {
                C2227Cf.m9532b("ActivityContent: negative number of WebViews.");
            }
            mo10281i();
        }
    }

    /* renamed from: b */
    public final String mo10271b() {
        return this.f10705n;
    }

    /* renamed from: b */
    public final void mo10272b(String str, boolean z, float f, float f2, float f3, float f4) {
        m14725c(str, z, f, f2, f3, f4);
    }

    /* renamed from: c */
    public final boolean mo10273c() {
        boolean z;
        synchronized (this.f10697f) {
            z = this.f10703l == 0;
        }
        return z;
    }

    /* renamed from: d */
    public final String mo10274d() {
        return this.f10706o;
    }

    /* renamed from: e */
    public final String mo10275e() {
        return this.f10707p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3673zr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C3673zr) obj).f10705n;
        return str != null && str.equals(this.f10705n);
    }

    /* renamed from: f */
    public final void mo10277f() {
        synchronized (this.f10697f) {
            this.f10704m -= 100;
        }
    }

    /* renamed from: g */
    public final void mo10278g() {
        synchronized (this.f10697f) {
            this.f10703l--;
        }
    }

    /* renamed from: h */
    public final void mo10279h() {
        synchronized (this.f10697f) {
            this.f10703l++;
        }
    }

    public final int hashCode() {
        return this.f10705n.hashCode();
    }

    /* renamed from: i */
    public final void mo10281i() {
        synchronized (this.f10697f) {
            int i = (this.f10701j * this.f10692a) + (this.f10702k * this.f10693b);
            if (i > this.f10704m) {
                this.f10704m = i;
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7954qa)).booleanValue() && !C1697X.m7702i().mo8333m().mo9146b()) {
                    this.f10705n = this.f10695d.mo8557a(this.f10698g);
                    this.f10706o = this.f10695d.mo8557a(this.f10699h);
                }
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7966sa)).booleanValue() && !C1697X.m7702i().mo8333m().mo9152d()) {
                    this.f10707p = this.f10696e.mo9010a(this.f10699h, this.f10700i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo10282j() {
        return this.f10701j;
    }

    public final String toString() {
        int i = this.f10702k;
        int i2 = this.f10704m;
        int i3 = this.f10701j;
        String a = m14724a(this.f10698g, 100);
        String a2 = m14724a(this.f10699h, 100);
        String str = this.f10705n;
        String str2 = this.f10706o;
        String str3 = this.f10707p;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 165 + String.valueOf(a2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(a);
        sb.append("\n viewableText");
        sb.append(a2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
