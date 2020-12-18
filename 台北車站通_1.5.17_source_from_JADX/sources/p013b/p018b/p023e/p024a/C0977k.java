package p013b.p018b.p023e.p024a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p013b.p018b.p028h.p029a.p030a.C1016e;
import p013b.p018b.p028h.p031b.C1036b;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: b.b.e.a.k */
public class C0977k extends C0976j {

    /* renamed from: b */
    static final PorterDuff.Mode f3809b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private C0983f f3810c;

    /* renamed from: d */
    private PorterDuffColorFilter f3811d;

    /* renamed from: e */
    private ColorFilter f3812e;

    /* renamed from: f */
    private boolean f3813f;

    /* renamed from: g */
    private boolean f3814g;

    /* renamed from: h */
    private Drawable.ConstantState f3815h;

    /* renamed from: i */
    private final float[] f3816i;

    /* renamed from: j */
    private final Matrix f3817j;

    /* renamed from: k */
    private final Rect f3818k;

    /* renamed from: b.b.e.a.k$a */
    private static class C0978a extends C0981d {
        public C0978a() {
        }

        public C0978a(C0978a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        private void m5302a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3846b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3845a = C1036b.m5481a(string2);
            }
        }

        /* renamed from: a */
        public void mo4934a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C1016e.m5423a(xmlPullParser, "pathData")) {
                TypedArray a = C1016e.m5420a(resources, theme, attributeSet, C0964a.f3782d);
                m5302a(a);
                a.recycle();
            }
        }

        /* renamed from: a */
        public boolean mo4935a() {
            return true;
        }
    }

    /* renamed from: b.b.e.a.k$b */
    private static class C0979b extends C0981d {

        /* renamed from: d */
        private int[] f3819d;

        /* renamed from: e */
        int f3820e = 0;

        /* renamed from: f */
        float f3821f = 0.0f;

        /* renamed from: g */
        int f3822g = 0;

        /* renamed from: h */
        float f3823h = 1.0f;

        /* renamed from: i */
        int f3824i = 0;

        /* renamed from: j */
        float f3825j = 1.0f;

        /* renamed from: k */
        float f3826k = 0.0f;

        /* renamed from: l */
        float f3827l = 1.0f;

        /* renamed from: m */
        float f3828m = 0.0f;

        /* renamed from: n */
        Paint.Cap f3829n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f3830o = Paint.Join.MITER;

        /* renamed from: p */
        float f3831p = 4.0f;

        public C0979b() {
        }

        public C0979b(C0979b bVar) {
            super(bVar);
            this.f3819d = bVar.f3819d;
            this.f3820e = bVar.f3820e;
            this.f3821f = bVar.f3821f;
            this.f3823h = bVar.f3823h;
            this.f3822g = bVar.f3822g;
            this.f3824i = bVar.f3824i;
            this.f3825j = bVar.f3825j;
            this.f3826k = bVar.f3826k;
            this.f3827l = bVar.f3827l;
            this.f3828m = bVar.f3828m;
            this.f3829n = bVar.f3829n;
            this.f3830o = bVar.f3830o;
            this.f3831p = bVar.f3831p;
        }

        /* renamed from: a */
        private Paint.Cap m5305a(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: a */
        private Paint.Join m5306a(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: a */
        private void m5307a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3819d = null;
            if (C1016e.m5423a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3846b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3845a = C1036b.m5481a(string2);
                }
                this.f3822g = C1016e.m5419a(typedArray, xmlPullParser, "fillColor", 1, this.f3822g);
                this.f3825j = C1016e.m5418a(typedArray, xmlPullParser, "fillAlpha", 12, this.f3825j);
                this.f3829n = m5305a(C1016e.m5424b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3829n);
                this.f3830o = m5306a(C1016e.m5424b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3830o);
                this.f3831p = C1016e.m5418a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3831p);
                this.f3820e = C1016e.m5419a(typedArray, xmlPullParser, "strokeColor", 3, this.f3820e);
                this.f3823h = C1016e.m5418a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3823h);
                this.f3821f = C1016e.m5418a(typedArray, xmlPullParser, "strokeWidth", 4, this.f3821f);
                this.f3827l = C1016e.m5418a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3827l);
                this.f3828m = C1016e.m5418a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3828m);
                this.f3826k = C1016e.m5418a(typedArray, xmlPullParser, "trimPathStart", 5, this.f3826k);
                this.f3824i = C1016e.m5424b(typedArray, xmlPullParser, "fillType", 13, this.f3824i);
            }
        }

        /* renamed from: a */
        public void mo4936a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C1016e.m5420a(resources, theme, attributeSet, C0964a.f3781c);
            m5307a(a, xmlPullParser);
            a.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f3825j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f3822g;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f3823h;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f3820e;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f3821f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f3827l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f3828m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f3826k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f3825j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f3822g = i;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f3823h = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f3820e = i;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f3821f = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f3827l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f3828m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f3826k = f;
        }
    }

    /* renamed from: b.b.e.a.k$c */
    private static class C0980c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Matrix f3832a = new Matrix();

        /* renamed from: b */
        final ArrayList<Object> f3833b = new ArrayList<>();

        /* renamed from: c */
        float f3834c = 0.0f;

        /* renamed from: d */
        private float f3835d = 0.0f;

        /* renamed from: e */
        private float f3836e = 0.0f;

        /* renamed from: f */
        private float f3837f = 1.0f;

        /* renamed from: g */
        private float f3838g = 1.0f;

        /* renamed from: h */
        private float f3839h = 0.0f;

        /* renamed from: i */
        private float f3840i = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final Matrix f3841j = new Matrix();

        /* renamed from: k */
        int f3842k;

        /* renamed from: l */
        private int[] f3843l;

        /* renamed from: m */
        private String f3844m = null;

        public C0980c() {
        }

        public C0980c(C0980c cVar, C1080b<String, Object> bVar) {
            C0981d dVar;
            this.f3834c = cVar.f3834c;
            this.f3835d = cVar.f3835d;
            this.f3836e = cVar.f3836e;
            this.f3837f = cVar.f3837f;
            this.f3838g = cVar.f3838g;
            this.f3839h = cVar.f3839h;
            this.f3840i = cVar.f3840i;
            this.f3843l = cVar.f3843l;
            this.f3844m = cVar.f3844m;
            this.f3842k = cVar.f3842k;
            String str = this.f3844m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f3841j.set(cVar.f3841j);
            ArrayList<Object> arrayList = cVar.f3833b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0980c) {
                    this.f3833b.add(new C0980c((C0980c) obj, bVar));
                } else {
                    if (obj instanceof C0979b) {
                        dVar = new C0979b((C0979b) obj);
                    } else if (obj instanceof C0978a) {
                        dVar = new C0978a((C0978a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3833b.add(dVar);
                    String str2 = dVar.f3846b;
                    if (str2 != null) {
                        bVar.put(str2, dVar);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m5310a() {
            this.f3841j.reset();
            this.f3841j.postTranslate(-this.f3835d, -this.f3836e);
            this.f3841j.postScale(this.f3837f, this.f3838g);
            this.f3841j.postRotate(this.f3834c, 0.0f, 0.0f);
            this.f3841j.postTranslate(this.f3839h + this.f3835d, this.f3840i + this.f3836e);
        }

        /* renamed from: a */
        private void m5311a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3843l = null;
            this.f3834c = C1016e.m5418a(typedArray, xmlPullParser, "rotation", 5, this.f3834c);
            this.f3835d = typedArray.getFloat(1, this.f3835d);
            this.f3836e = typedArray.getFloat(2, this.f3836e);
            this.f3837f = C1016e.m5418a(typedArray, xmlPullParser, "scaleX", 3, this.f3837f);
            this.f3838g = C1016e.m5418a(typedArray, xmlPullParser, "scaleY", 4, this.f3838g);
            this.f3839h = C1016e.m5418a(typedArray, xmlPullParser, "translateX", 6, this.f3839h);
            this.f3840i = C1016e.m5418a(typedArray, xmlPullParser, "translateY", 7, this.f3840i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3844m = string;
            }
            m5310a();
        }

        /* renamed from: a */
        public void mo4953a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C1016e.m5420a(resources, theme, attributeSet, C0964a.f3780b);
            m5311a(a, xmlPullParser);
            a.recycle();
        }

        public String getGroupName() {
            return this.f3844m;
        }

        public Matrix getLocalMatrix() {
            return this.f3841j;
        }

        public float getPivotX() {
            return this.f3835d;
        }

        public float getPivotY() {
            return this.f3836e;
        }

        public float getRotation() {
            return this.f3834c;
        }

        public float getScaleX() {
            return this.f3837f;
        }

        public float getScaleY() {
            return this.f3838g;
        }

        public float getTranslateX() {
            return this.f3839h;
        }

        public float getTranslateY() {
            return this.f3840i;
        }

        public void setPivotX(float f) {
            if (f != this.f3835d) {
                this.f3835d = f;
                m5310a();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f3836e) {
                this.f3836e = f;
                m5310a();
            }
        }

        public void setRotation(float f) {
            if (f != this.f3834c) {
                this.f3834c = f;
                m5310a();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f3837f) {
                this.f3837f = f;
                m5310a();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f3838g) {
                this.f3838g = f;
                m5310a();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f3839h) {
                this.f3839h = f;
                m5310a();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f3840i) {
                this.f3840i = f;
                m5310a();
            }
        }
    }

    /* renamed from: b.b.e.a.k$d */
    private static class C0981d {

        /* renamed from: a */
        protected C1036b.C1038b[] f3845a = null;

        /* renamed from: b */
        String f3846b;

        /* renamed from: c */
        int f3847c;

        public C0981d() {
        }

        public C0981d(C0981d dVar) {
            this.f3846b = dVar.f3846b;
            this.f3847c = dVar.f3847c;
            this.f3845a = C1036b.m5482a(dVar.f3845a);
        }

        /* renamed from: a */
        public void mo4970a(Path path) {
            path.reset();
            C1036b.C1038b[] bVarArr = this.f3845a;
            if (bVarArr != null) {
                C1036b.C1038b.m5489a(bVarArr, path);
            }
        }

        /* renamed from: a */
        public boolean mo4935a() {
            return false;
        }

        public C1036b.C1038b[] getPathData() {
            return this.f3845a;
        }

        public String getPathName() {
            return this.f3846b;
        }

        public void setPathData(C1036b.C1038b[] bVarArr) {
            if (!C1036b.m5479a(this.f3845a, bVarArr)) {
                this.f3845a = C1036b.m5482a(bVarArr);
            } else {
                C1036b.m5484b(this.f3845a, bVarArr);
            }
        }
    }

    /* renamed from: b.b.e.a.k$e */
    private static class C0982e {

        /* renamed from: a */
        private static final Matrix f3848a = new Matrix();

        /* renamed from: b */
        private final Path f3849b;

        /* renamed from: c */
        private final Path f3850c;

        /* renamed from: d */
        private final Matrix f3851d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Paint f3852e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Paint f3853f;

        /* renamed from: g */
        private PathMeasure f3854g;

        /* renamed from: h */
        private int f3855h;

        /* renamed from: i */
        final C0980c f3856i;

        /* renamed from: j */
        float f3857j;

        /* renamed from: k */
        float f3858k;

        /* renamed from: l */
        float f3859l;

        /* renamed from: m */
        float f3860m;

        /* renamed from: n */
        int f3861n;

        /* renamed from: o */
        String f3862o;

        /* renamed from: p */
        final C1080b<String, Object> f3863p;

        public C0982e() {
            this.f3851d = new Matrix();
            this.f3857j = 0.0f;
            this.f3858k = 0.0f;
            this.f3859l = 0.0f;
            this.f3860m = 0.0f;
            this.f3861n = 255;
            this.f3862o = null;
            this.f3863p = new C1080b<>();
            this.f3856i = new C0980c();
            this.f3849b = new Path();
            this.f3850c = new Path();
        }

        public C0982e(C0982e eVar) {
            this.f3851d = new Matrix();
            this.f3857j = 0.0f;
            this.f3858k = 0.0f;
            this.f3859l = 0.0f;
            this.f3860m = 0.0f;
            this.f3861n = 255;
            this.f3862o = null;
            this.f3863p = new C1080b<>();
            this.f3856i = new C0980c(eVar.f3856i, this.f3863p);
            this.f3849b = new Path(eVar.f3849b);
            this.f3850c = new Path(eVar.f3850c);
            this.f3857j = eVar.f3857j;
            this.f3858k = eVar.f3858k;
            this.f3859l = eVar.f3859l;
            this.f3860m = eVar.f3860m;
            this.f3855h = eVar.f3855h;
            this.f3861n = eVar.f3861n;
            this.f3862o = eVar.f3862o;
            String str = eVar.f3862o;
            if (str != null) {
                this.f3863p.put(str, this);
            }
        }

        /* renamed from: a */
        private static float m5316a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m5317a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m5316a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m5320a(C0980c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f3832a.set(matrix);
            cVar.f3832a.preConcat(cVar.f3841j);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f3833b.size(); i3++) {
                Object obj = cVar.f3833b.get(i3);
                if (obj instanceof C0980c) {
                    m5320a((C0980c) obj, cVar.f3832a, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0981d) {
                    m5321a(cVar, (C0981d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        private void m5321a(C0980c cVar, C0981d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f3859l;
            float f2 = ((float) i2) / this.f3860m;
            float min = Math.min(f, f2);
            Matrix a = cVar.f3832a;
            this.f3851d.set(a);
            this.f3851d.postScale(f, f2);
            float a2 = m5317a(a);
            if (a2 != 0.0f) {
                dVar.mo4970a(this.f3849b);
                Path path = this.f3849b;
                this.f3850c.reset();
                if (dVar.mo4935a()) {
                    this.f3850c.addPath(path, this.f3851d);
                    canvas.clipPath(this.f3850c);
                    return;
                }
                C0979b bVar = (C0979b) dVar;
                if (!(bVar.f3826k == 0.0f && bVar.f3827l == 1.0f)) {
                    float f3 = bVar.f3826k;
                    float f4 = bVar.f3828m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (bVar.f3827l + f4) % 1.0f;
                    if (this.f3854g == null) {
                        this.f3854g = new PathMeasure();
                    }
                    this.f3854g.setPath(this.f3849b, false);
                    float length = this.f3854g.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f3854g.getSegment(f7, length, path, true);
                        this.f3854g.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f3854g.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f3850c.addPath(path, this.f3851d);
                if (bVar.f3822g != 0) {
                    if (this.f3853f == null) {
                        this.f3853f = new Paint();
                        this.f3853f.setStyle(Paint.Style.FILL);
                        this.f3853f.setAntiAlias(true);
                    }
                    Paint paint = this.f3853f;
                    paint.setColor(C0977k.m5293a(bVar.f3822g, bVar.f3825j));
                    paint.setColorFilter(colorFilter);
                    this.f3850c.setFillType(bVar.f3824i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f3850c, paint);
                }
                if (bVar.f3820e != 0) {
                    if (this.f3852e == null) {
                        this.f3852e = new Paint();
                        this.f3852e.setStyle(Paint.Style.STROKE);
                        this.f3852e.setAntiAlias(true);
                    }
                    Paint paint2 = this.f3852e;
                    Paint.Join join = bVar.f3830o;
                    if (join != null) {
                        paint2.setStrokeJoin(join);
                    }
                    Paint.Cap cap = bVar.f3829n;
                    if (cap != null) {
                        paint2.setStrokeCap(cap);
                    }
                    paint2.setStrokeMiter(bVar.f3831p);
                    paint2.setColor(C0977k.m5293a(bVar.f3820e, bVar.f3823h));
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(bVar.f3821f * min * a2);
                    canvas.drawPath(this.f3850c, paint2);
                }
            }
        }

        /* renamed from: a */
        public void mo4974a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m5320a(this.f3856i, f3848a, canvas, i, i2, colorFilter);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3861n;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f3861n = i;
        }
    }

    /* renamed from: b.b.e.a.k$f */
    private static class C0983f extends Drawable.ConstantState {

        /* renamed from: a */
        int f3864a;

        /* renamed from: b */
        C0982e f3865b;

        /* renamed from: c */
        ColorStateList f3866c;

        /* renamed from: d */
        PorterDuff.Mode f3867d;

        /* renamed from: e */
        boolean f3868e;

        /* renamed from: f */
        Bitmap f3869f;

        /* renamed from: g */
        ColorStateList f3870g;

        /* renamed from: h */
        PorterDuff.Mode f3871h;

        /* renamed from: i */
        int f3872i;

        /* renamed from: j */
        boolean f3873j;

        /* renamed from: k */
        boolean f3874k;

        /* renamed from: l */
        Paint f3875l;

        public C0983f() {
            this.f3866c = null;
            this.f3867d = C0977k.f3809b;
            this.f3865b = new C0982e();
        }

        public C0983f(C0983f fVar) {
            this.f3866c = null;
            this.f3867d = C0977k.f3809b;
            if (fVar != null) {
                this.f3864a = fVar.f3864a;
                this.f3865b = new C0982e(fVar.f3865b);
                if (fVar.f3865b.f3853f != null) {
                    Paint unused = this.f3865b.f3853f = new Paint(fVar.f3865b.f3853f);
                }
                if (fVar.f3865b.f3852e != null) {
                    Paint unused2 = this.f3865b.f3852e = new Paint(fVar.f3865b.f3852e);
                }
                this.f3866c = fVar.f3866c;
                this.f3867d = fVar.f3867d;
                this.f3868e = fVar.f3868e;
            }
        }

        /* renamed from: a */
        public Paint mo4979a(ColorFilter colorFilter) {
            if (!mo4984b() && colorFilter == null) {
                return null;
            }
            if (this.f3875l == null) {
                this.f3875l = new Paint();
                this.f3875l.setFilterBitmap(true);
            }
            this.f3875l.setAlpha(this.f3865b.getRootAlpha());
            this.f3875l.setColorFilter(colorFilter);
            return this.f3875l;
        }

        /* renamed from: a */
        public void mo4980a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3869f, (Rect) null, rect, mo4979a(colorFilter));
        }

        /* renamed from: a */
        public boolean mo4981a() {
            return !this.f3874k && this.f3870g == this.f3866c && this.f3871h == this.f3867d && this.f3873j == this.f3868e && this.f3872i == this.f3865b.getRootAlpha();
        }

        /* renamed from: a */
        public boolean mo4982a(int i, int i2) {
            return i == this.f3869f.getWidth() && i2 == this.f3869f.getHeight();
        }

        /* renamed from: b */
        public void mo4983b(int i, int i2) {
            if (this.f3869f == null || !mo4982a(i, i2)) {
                this.f3869f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f3874k = true;
            }
        }

        /* renamed from: b */
        public boolean mo4984b() {
            return this.f3865b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void mo4985c() {
            this.f3870g = this.f3866c;
            this.f3871h = this.f3867d;
            this.f3872i = this.f3865b.getRootAlpha();
            this.f3873j = this.f3868e;
            this.f3874k = false;
        }

        /* renamed from: c */
        public void mo4986c(int i, int i2) {
            this.f3869f.eraseColor(0);
            this.f3865b.mo4974a(new Canvas(this.f3869f), i, i2, (ColorFilter) null);
        }

        public int getChangingConfigurations() {
            return this.f3864a;
        }

        public Drawable newDrawable() {
            return new C0977k(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0977k(this);
        }
    }

    /* renamed from: b.b.e.a.k$g */
    private static class C0984g extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f3876a;

        public C0984g(Drawable.ConstantState constantState) {
            this.f3876a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3876a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3876a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0977k kVar = new C0977k();
            kVar.f3808a = (VectorDrawable) this.f3876a.newDrawable();
            return kVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0977k kVar = new C0977k();
            kVar.f3808a = (VectorDrawable) this.f3876a.newDrawable(resources);
            return kVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0977k kVar = new C0977k();
            kVar.f3808a = (VectorDrawable) this.f3876a.newDrawable(resources, theme);
            return kVar;
        }
    }

    C0977k() {
        this.f3814g = true;
        this.f3816i = new float[9];
        this.f3817j = new Matrix();
        this.f3818k = new Rect();
        this.f3810c = new C0983f();
    }

    C0977k(C0983f fVar) {
        this.f3814g = true;
        this.f3816i = new float[9];
        this.f3817j = new Matrix();
        this.f3818k = new Rect();
        this.f3810c = fVar;
        this.f3811d = mo4909a(this.f3811d, fVar.f3866c, fVar.f3867d);
    }

    /* renamed from: a */
    static int m5293a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m5294a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p013b.p018b.p023e.p024a.C0977k m5295a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            b.b.e.a.k r0 = new b.b.e.a.k
            r0.<init>()
            android.graphics.drawable.Drawable r6 = p013b.p018b.p028h.p029a.p030a.C1014d.m5413a(r6, r7, r8)
            r0.f3808a = r6
            b.b.e.a.k$g r6 = new b.b.e.a.k$g
            android.graphics.drawable.Drawable r7 = r0.f3808a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f3815h = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            b.b.e.a.k r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0048
        L_0x0047:
            r6 = move-exception
        L_0x0048:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p023e.p024a.C0977k.m5295a(android.content.res.Resources, int, android.content.res.Resources$Theme):b.b.e.a.k");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: b.b.e.a.k$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: b.b.e.a.k$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: b.b.e.a.k$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: b.b.e.a.k$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: b.b.e.a.k$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5296a(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) {
        /*
            r10 = this;
            b.b.e.a.k$f r0 = r10.f3810c
            b.b.e.a.k$e r1 = r0.f3865b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            b.b.e.a.k$c r3 = r1.f3856i
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = r5
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            b.b.e.a.k$c r7 = (p013b.p018b.p023e.p024a.C0977k.C0980c) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            b.b.e.a.k$b r3 = new b.b.e.a.k$b
            r3.<init>()
            r3.mo4936a(r11, r13, r14, r12)
            java.util.ArrayList<java.lang.Object> r6 = r7.f3833b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            b.b.h.h.b<java.lang.String, java.lang.Object> r6 = r1.f3863p
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            b.b.e.a.k$a r3 = new b.b.e.a.k$a
            r3.<init>()
            r3.mo4934a(r11, r13, r14, r12)
            java.util.ArrayList<java.lang.Object> r7 = r7.f3833b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            b.b.h.h.b<java.lang.String, java.lang.Object> r7 = r1.f3863p
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f3864a
            int r3 = r3.f3847c
        L_0x0081:
            r3 = r3 | r7
            r0.f3864a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            b.b.e.a.k$c r3 = new b.b.e.a.k$c
            r3.<init>()
            r3.mo4953a(r11, r13, r14, r12)
            java.util.ArrayList<java.lang.Object> r7 = r7.f3833b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            b.b.h.h.b<java.lang.String, java.lang.Object> r7 = r1.f3863p
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f3864a
            int r3 = r3.f3842k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p023e.p024a.C0977k.m5296a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    private void m5297a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0983f fVar = this.f3810c;
        C0982e eVar = fVar.f3865b;
        fVar.f3867d = m5294a(C1016e.m5424b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.f3866c = colorStateList;
        }
        fVar.f3868e = C1016e.m5422a(typedArray, xmlPullParser, "autoMirrored", 5, fVar.f3868e);
        eVar.f3859l = C1016e.m5418a(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f3859l);
        eVar.f3860m = C1016e.m5418a(typedArray, xmlPullParser, "viewportHeight", 8, eVar.f3860m);
        if (eVar.f3859l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (eVar.f3860m > 0.0f) {
            eVar.f3857j = typedArray.getDimension(3, eVar.f3857j);
            eVar.f3858k = typedArray.getDimension(2, eVar.f3858k);
            if (eVar.f3857j <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (eVar.f3858k > 0.0f) {
                eVar.setAlpha(C1016e.m5418a(typedArray, xmlPullParser, "alpha", 4, eVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    eVar.f3862o = string;
                    eVar.f3863p.put(string, eVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: a */
    private boolean m5298a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C1026a.m5458e(this) == 1;
    }

    public static C0977k createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0977k kVar = new C0977k();
        kVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuffColorFilter mo4909a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo4910a(String str) {
        return this.f3810c.f3865b.f3863p.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4911a(boolean z) {
        this.f3814g = z;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3808a;
        if (drawable == null) {
            return false;
        }
        C1026a.m5452a(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3818k);
        if (this.f3818k.width() > 0 && this.f3818k.height() > 0) {
            ColorFilter colorFilter = this.f3812e;
            if (colorFilter == null) {
                colorFilter = this.f3811d;
            }
            canvas.getMatrix(this.f3817j);
            this.f3817j.getValues(this.f3816i);
            float abs = Math.abs(this.f3816i[0]);
            float abs2 = Math.abs(this.f3816i[4]);
            float abs3 = Math.abs(this.f3816i[1]);
            float abs4 = Math.abs(this.f3816i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f3818k.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f3818k.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f3818k;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m5298a()) {
                    canvas.translate((float) this.f3818k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f3818k.offsetTo(0, 0);
                this.f3810c.mo4983b(min, min2);
                if (!this.f3814g) {
                    this.f3810c.mo4986c(min, min2);
                } else if (!this.f3810c.mo4981a()) {
                    this.f3810c.mo4986c(min, min2);
                    this.f3810c.mo4985c();
                }
                this.f3810c.mo4980a(canvas, colorFilter, this.f3818k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3808a;
        return drawable != null ? C1026a.m5456c(drawable) : this.f3810c.f3865b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3810c.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f3808a;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new C0984g(drawable.getConstantState());
        }
        this.f3810c.f3864a = getChangingConfigurations();
        return this.f3810c;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3810c.f3865b.f3858k;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3810c.f3865b.f3857j;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5449a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0983f fVar = this.f3810c;
        fVar.f3865b = new C0982e();
        TypedArray a = C1016e.m5420a(resources, theme, attributeSet, C0964a.f3779a);
        m5297a(a, xmlPullParser);
        a.recycle();
        fVar.f3864a = getChangingConfigurations();
        fVar.f3874k = true;
        m5296a(resources, xmlPullParser, attributeSet, theme);
        this.f3811d = mo4909a(this.f3811d, fVar.f3866c, fVar.f3867d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3808a;
        return drawable != null ? C1026a.m5459f(drawable) : this.f3810c.f3868e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r0 = (r0 = r1.f3810c).f3866c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3808a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0020
            b.b.e.a.k$f r0 = r1.f3810c
            if (r0 == 0) goto L_0x001e
            android.content.res.ColorStateList r0 = r0.f3866c
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p023e.p024a.C0977k.isStateful():boolean");
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3813f && super.mutate() == this) {
            this.f3810c = new C0983f(this.f3810c);
            this.f3813f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0983f fVar = this.f3810c;
        ColorStateList colorStateList = fVar.f3866c;
        if (colorStateList == null || (mode = fVar.f3867d) == null) {
            return false;
        }
        this.f3811d = mo4909a(this.f3811d, colorStateList, mode);
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3810c.f3865b.getRootAlpha() != i) {
            this.f3810c.f3865b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5451a(drawable, z);
        } else {
            this.f3810c.f3868e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f3812e = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5455b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5447a(drawable, colorStateList);
            return;
        }
        C0983f fVar = this.f3810c;
        if (fVar.f3866c != colorStateList) {
            fVar.f3866c = colorStateList;
            this.f3811d = mo4909a(this.f3811d, colorStateList, fVar.f3867d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            C1026a.m5450a(drawable, mode);
            return;
        }
        C0983f fVar = this.f3810c;
        if (fVar.f3867d != mode) {
            fVar.f3867d = mode;
            this.f3811d = mo4909a(this.f3811d, fVar.f3866c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3808a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3808a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
