package p101d.p129g.p131b.p132a.p145h;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

/* renamed from: d.g.b.a.h.c */
public class C5566c {

    /* renamed from: a */
    private C5568b f15523a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ByteBuffer f15524b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Bitmap f15525c;

    /* renamed from: d.g.b.a.h.c$a */
    public static class C5567a {

        /* renamed from: a */
        private C5566c f15526a = new C5566c();

        /* renamed from: a */
        public C5567a mo15039a(int i) {
            int unused = this.f15526a.mo15038c().f15529c = i;
            return this;
        }

        /* renamed from: a */
        public C5567a mo15040a(long j) {
            long unused = this.f15526a.mo15038c().f15530d = j;
            return this;
        }

        /* renamed from: a */
        public C5567a mo15041a(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (byteBuffer.capacity() < i * i2) {
                throw new IllegalArgumentException("Invalid image data size.");
            } else if (i3 == 16 || i3 == 17 || i3 == 842094169) {
                ByteBuffer unused = this.f15526a.f15524b = byteBuffer;
                C5568b c = this.f15526a.mo15038c();
                int unused2 = c.f15527a = i;
                int unused3 = c.f15528b = i2;
                int unused4 = c.f15532f = i3;
                return this;
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unsupported image format: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: a */
        public C5566c mo15042a() {
            if (this.f15526a.f15524b != null || this.f15526a.f15525c != null) {
                return this.f15526a;
            }
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        /* renamed from: b */
        public C5567a mo15043b(int i) {
            int unused = this.f15526a.mo15038c().f15531e = i;
            return this;
        }
    }

    /* renamed from: d.g.b.a.h.c$b */
    public static class C5568b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f15527a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f15528b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f15529c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f15530d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f15531e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f15532f = -1;

        public C5568b() {
        }

        public C5568b(C5568b bVar) {
            this.f15527a = bVar.mo15048e();
            this.f15528b = bVar.mo15044a();
            this.f15529c = bVar.mo15045b();
            this.f15530d = bVar.mo15047d();
            this.f15531e = bVar.mo15046c();
        }

        /* renamed from: a */
        public int mo15044a() {
            return this.f15528b;
        }

        /* renamed from: b */
        public int mo15045b() {
            return this.f15529c;
        }

        /* renamed from: c */
        public int mo15046c() {
            return this.f15531e;
        }

        /* renamed from: d */
        public long mo15047d() {
            return this.f15530d;
        }

        /* renamed from: e */
        public int mo15048e() {
            return this.f15527a;
        }

        /* renamed from: f */
        public final void mo15049f() {
            if (this.f15531e % 2 != 0) {
                int i = this.f15527a;
                this.f15527a = this.f15528b;
                this.f15528b = i;
            }
            this.f15531e = 0;
        }
    }

    private C5566c() {
        this.f15523a = new C5568b();
        this.f15524b = null;
        this.f15525c = null;
    }

    /* renamed from: a */
    public Bitmap mo15036a() {
        return this.f15525c;
    }

    /* renamed from: b */
    public ByteBuffer mo15037b() {
        Bitmap bitmap = this.f15525c;
        if (bitmap == null) {
            return this.f15524b;
        }
        int width = bitmap.getWidth();
        int height = this.f15525c.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        this.f15525c.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            bArr[i2] = (byte) ((int) ((((float) Color.red(iArr[i2])) * 0.299f) + (((float) Color.green(iArr[i2])) * 0.587f) + (((float) Color.blue(iArr[i2])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public C5568b mo15038c() {
        return this.f15523a;
    }
}
