package android.support.constraint.p005a;

import android.support.constraint.p005a.C0069h;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.d */
public class C0065d {

    /* renamed from: a */
    ArrayList<C0069h> f363a = new ArrayList<>();

    /* renamed from: b */
    private void m291b(C0066e eVar) {
        this.f363a.clear();
        for (int i = 1; i < eVar.f372i; i++) {
            C0069h hVar = eVar.f375l.f362c[i];
            for (int i2 = 0; i2 < 6; i2++) {
                hVar.f386f[i2] = 0.0f;
            }
            hVar.f386f[hVar.f384d] = 1.0f;
            if (hVar.f387g == C0069h.C0070a.ERROR) {
                this.f363a.add(hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0069h mo240a() {
        int size = this.f363a.size();
        int i = 0;
        C0069h hVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C0069h hVar2 = this.f363a.get(i2);
            for (int i3 = 5; i3 >= 0; i3--) {
                float f = hVar2.f386f[i3];
                if (hVar == null && f < 0.0f && i3 >= i) {
                    hVar = hVar2;
                    i = i3;
                }
                if (f > 0.0f && i3 > i) {
                    hVar = null;
                    i = i3;
                }
            }
        }
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo241a(C0066e eVar) {
        m291b(eVar);
        int size = this.f363a.size();
        for (int i = 0; i < size; i++) {
            C0069h hVar = this.f363a.get(i);
            int i2 = hVar.f383c;
            if (i2 != -1) {
                C0046a aVar = eVar.mo243a(i2).f358d;
                int i3 = aVar.f203a;
                for (int i4 = 0; i4 < i3; i4++) {
                    C0069h a = aVar.mo99a(i4);
                    if (a != null) {
                        float b = aVar.mo107b(i4);
                        for (int i5 = 0; i5 < 6; i5++) {
                            float[] fArr = a.f386f;
                            fArr[i5] = fArr[i5] + (hVar.f386f[i5] * b);
                        }
                        if (!this.f363a.contains(a)) {
                            this.f363a.add(a);
                        }
                    }
                }
                hVar.mo262a();
            }
        }
    }

    public String toString() {
        String str = "Goal: ";
        for (int i = 0; i < this.f363a.size(); i++) {
            str = str + this.f363a.get(i).mo267c();
        }
        return str;
    }
}
