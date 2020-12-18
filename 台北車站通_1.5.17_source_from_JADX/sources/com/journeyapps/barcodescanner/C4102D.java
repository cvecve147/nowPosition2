package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import p101d.p129g.p159f.C5914j;

/* renamed from: com.journeyapps.barcodescanner.D */
public class C4102D {

    /* renamed from: a */
    private byte[] f12165a;

    /* renamed from: b */
    private int f12166b;

    /* renamed from: c */
    private int f12167c;

    /* renamed from: d */
    private int f12168d;

    /* renamed from: e */
    private int f12169e;

    /* renamed from: f */
    private Rect f12170f;

    public C4102D(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f12165a = bArr;
        this.f12166b = i;
        this.f12167c = i2;
        this.f12169e = i4;
        this.f12168d = i3;
        if (i * i2 > bArr.length) {
            throw new IllegalArgumentException("Image data does not match the resolution. " + i + "x" + i2 + " > " + bArr.length);
        }
    }

    /* renamed from: a */
    private Bitmap m16385a(Rect rect, int i) {
        if (mo11581b()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f12165a, this.f12168d, this.f12166b, this.f12167c, (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f12169e == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) this.f12169e);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    /* renamed from: a */
    public static byte[] m16386a(int i, byte[] bArr, int i2, int i3) {
        return i != 0 ? i != 90 ? i != 180 ? i != 270 ? bArr : m16388b(bArr, i2, i3) : m16387a(bArr, i2, i3) : m16389c(bArr, i2, i3) : bArr;
    }

    /* renamed from: a */
    public static byte[] m16387a(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i4] = bArr[i5];
            i4--;
        }
        return bArr2;
    }

    /* renamed from: b */
    public static byte[] m16388b(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i6 * i) + i5];
                i4--;
            }
        }
        return bArr2;
    }

    /* renamed from: c */
    public static byte[] m16389c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = i2 - 1; i5 >= 0; i5--) {
                bArr2[i3] = bArr[(i5 * i) + i4];
                i3++;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public Bitmap mo11578a(int i) {
        return m16385a(this.f12170f, i);
    }

    /* renamed from: a */
    public C5914j mo11579a() {
        byte[] a = m16386a(this.f12169e, this.f12165a, this.f12166b, this.f12167c);
        if (mo11581b()) {
            int i = this.f12167c;
            int i2 = this.f12166b;
            Rect rect = this.f12170f;
            return new C5914j(a, i, i2, rect.left, rect.top, rect.width(), this.f12170f.height(), false);
        }
        int i3 = this.f12166b;
        int i4 = this.f12167c;
        Rect rect2 = this.f12170f;
        return new C5914j(a, i3, i4, rect2.left, rect2.top, rect2.width(), this.f12170f.height(), false);
    }

    /* renamed from: a */
    public void mo11580a(Rect rect) {
        this.f12170f = rect;
    }

    /* renamed from: b */
    public boolean mo11581b() {
        return this.f12169e % 180 != 0;
    }
}
