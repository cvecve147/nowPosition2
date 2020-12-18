package p101d.p122f.p123a.p126c;

import java.io.InputStream;
import p208e.p209a.p210a.p211a.p212a.p214b.C6096y;

/* renamed from: d.f.a.c.da */
class C5404da implements C6096y.C6099c {

    /* renamed from: a */
    final /* synthetic */ byte[] f15251a;

    /* renamed from: b */
    final /* synthetic */ int[] f15252b;

    /* renamed from: c */
    final /* synthetic */ C5406ea f15253c;

    C5404da(C5406ea eaVar, byte[] bArr, int[] iArr) {
        this.f15253c = eaVar;
        this.f15251a = bArr;
        this.f15252b = iArr;
    }

    /* renamed from: a */
    public void mo14825a(InputStream inputStream, int i) {
        try {
            inputStream.read(this.f15251a, this.f15252b[0], i);
            int[] iArr = this.f15252b;
            iArr[0] = iArr[0] + i;
        } finally {
            inputStream.close();
        }
    }
}
