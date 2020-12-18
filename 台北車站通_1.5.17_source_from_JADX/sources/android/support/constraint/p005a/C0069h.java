package android.support.constraint.p005a;

import java.util.Arrays;

/* renamed from: android.support.constraint.a.h */
public class C0069h {

    /* renamed from: a */
    private String f381a;

    /* renamed from: b */
    public int f382b = -1;

    /* renamed from: c */
    int f383c = -1;

    /* renamed from: d */
    public int f384d = 0;

    /* renamed from: e */
    public float f385e;

    /* renamed from: f */
    float[] f386f = new float[6];

    /* renamed from: g */
    C0070a f387g;

    /* renamed from: h */
    C0063b[] f388h = new C0063b[8];

    /* renamed from: i */
    int f389i = 0;

    /* renamed from: android.support.constraint.a.h$a */
    public enum C0070a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0069h(C0070a aVar) {
        this.f387g = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo262a() {
        for (int i = 0; i < 6; i++) {
            this.f386f[i] = 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo263a(C0063b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f389i;
            if (i >= i2) {
                C0063b[] bVarArr = this.f388h;
                if (i2 >= bVarArr.length) {
                    this.f388h = (C0063b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0063b[] bVarArr2 = this.f388h;
                int i3 = this.f389i;
                bVarArr2[i3] = bVar;
                this.f389i = i3 + 1;
                return;
            } else if (this.f388h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo264a(C0070a aVar) {
        this.f387g = aVar;
    }

    /* renamed from: b */
    public void mo265b() {
        this.f381a = null;
        this.f387g = C0070a.UNKNOWN;
        this.f384d = 0;
        this.f382b = -1;
        this.f383c = -1;
        this.f385e = 0.0f;
        this.f389i = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo266b(C0063b bVar) {
        int i = 0;
        int i2 = 0;
        while (i2 < this.f389i) {
            if (this.f388h[i2] == bVar) {
                while (true) {
                    int i3 = this.f389i;
                    if (i < (i3 - i2) - 1) {
                        C0063b[] bVarArr = this.f388h;
                        int i4 = i2 + i;
                        bVarArr[i4] = bVarArr[i4 + 1];
                        i++;
                    } else {
                        this.f389i = i3 - 1;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo267c() {
        StringBuilder sb;
        String str;
        String str2 = this + "[";
        for (int i = 0; i < this.f386f.length; i++) {
            String str3 = str2 + this.f386f[i];
            if (i < this.f386f.length - 1) {
                sb = new StringBuilder();
                sb.append(str3);
                str = ", ";
            } else {
                sb = new StringBuilder();
                sb.append(str3);
                str = "] ";
            }
            sb.append(str);
            str2 = sb.toString();
        }
        return str2;
    }

    public String toString() {
        return "" + this.f381a;
    }
}
