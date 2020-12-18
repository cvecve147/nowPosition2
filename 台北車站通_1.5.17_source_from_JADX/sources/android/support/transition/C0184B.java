package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.B */
class C0184B<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f946a;

    /* renamed from: b */
    private final PathMeasure f947b;

    /* renamed from: c */
    private final float f948c;

    /* renamed from: d */
    private final float[] f949d = new float[2];

    /* renamed from: e */
    private final PointF f950e = new PointF();

    /* renamed from: f */
    private float f951f;

    C0184B(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f946a = property;
        this.f947b = new PathMeasure(path, false);
        this.f948c = this.f947b.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f951f = f.floatValue();
        this.f947b.getPosTan(this.f948c * f.floatValue(), this.f949d, (float[]) null);
        PointF pointF = this.f950e;
        float[] fArr = this.f949d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f946a.set(t, pointF);
    }

    public Float get(T t) {
        return Float.valueOf(this.f951f);
    }
}
