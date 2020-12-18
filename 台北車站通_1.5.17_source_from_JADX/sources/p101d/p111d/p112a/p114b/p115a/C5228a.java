package p101d.p111d.p112a.p114b.p115a;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: d.d.a.b.a.a */
public class C5228a {

    /* renamed from: a */
    private final C5229a f14751a;

    /* renamed from: b */
    private float f14752b;

    /* renamed from: c */
    private float f14753c;

    /* renamed from: d */
    private float f14754d;

    /* renamed from: e */
    private float f14755e;

    /* renamed from: f */
    private float f14756f;

    /* renamed from: g */
    private boolean f14757g;

    /* renamed from: h */
    private boolean f14758h;

    /* renamed from: d.d.a.b.a.a$a */
    public interface C5229a {
        /* renamed from: a */
        boolean mo14446a(C5228a aVar);

        /* renamed from: b */
        boolean mo14447b(C5228a aVar);

        /* renamed from: c */
        void mo14448c(C5228a aVar);
    }

    public C5228a(Context context, C5229a aVar) {
        this.f14751a = aVar;
    }

    /* renamed from: b */
    private float m20181b(MotionEvent motionEvent) {
        return (float) Math.toDegrees(Math.atan2((double) (motionEvent.getY(1) - motionEvent.getY(0)), (double) (motionEvent.getX(1) - motionEvent.getX(0))));
    }

    /* renamed from: d */
    private void m20182d() {
        if (this.f14757g) {
            this.f14757g = false;
            if (this.f14758h) {
                this.f14751a.mo14448c(this);
                this.f14758h = false;
            }
        }
    }

    /* renamed from: e */
    private boolean m20183e() {
        return this.f14757g && this.f14758h && this.f14751a.mo14446a(this);
    }

    /* renamed from: f */
    private void m20184f() {
        if (!this.f14757g && Math.abs(this.f14754d - this.f14755e) >= 5.0f) {
            this.f14757g = true;
            this.f14758h = this.f14751a.mo14447b(this);
        }
    }

    /* renamed from: a */
    public float mo14473a() {
        return this.f14752b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r5.getPointerCount() != 2) goto L_0x0075;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14474a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x0072
            if (r0 == r1) goto L_0x0072
            r2 = 2
            if (r0 == r2) goto L_0x002e
            r3 = 3
            if (r0 == r3) goto L_0x0072
            r3 = 5
            if (r0 == r3) goto L_0x001d
            r3 = 6
            if (r0 == r3) goto L_0x0016
            goto L_0x0075
        L_0x0016:
            int r5 = r5.getPointerCount()
            if (r5 != r2) goto L_0x0075
            goto L_0x0072
        L_0x001d:
            int r0 = r5.getPointerCount()
            if (r0 != r2) goto L_0x0075
            float r5 = r4.m20181b(r5)
            r4.f14755e = r5
            r4.f14756f = r5
            r4.f14754d = r5
            goto L_0x0075
        L_0x002e:
            int r0 = r5.getPointerCount()
            if (r0 < r2) goto L_0x0075
            boolean r0 = r4.f14757g
            if (r0 == 0) goto L_0x003c
            boolean r0 = r4.f14758h
            if (r0 == 0) goto L_0x0075
        L_0x003c:
            float r0 = r4.m20181b(r5)
            r4.f14755e = r0
            float r0 = r5.getX(r1)
            r2 = 0
            float r3 = r5.getX(r2)
            float r0 = r0 + r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r3
            r4.f14752b = r0
            float r0 = r5.getY(r1)
            float r5 = r5.getY(r2)
            float r0 = r0 + r5
            float r0 = r0 * r3
            r4.f14753c = r0
            boolean r5 = r4.f14757g
            r4.m20184f()
            if (r5 == 0) goto L_0x006a
            boolean r5 = r4.m20183e()
            if (r5 == 0) goto L_0x006b
        L_0x006a:
            r2 = r1
        L_0x006b:
            if (r2 == 0) goto L_0x0075
            float r5 = r4.f14755e
            r4.f14756f = r5
            goto L_0x0075
        L_0x0072:
            r4.m20182d()
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p111d.p112a.p114b.p115a.C5228a.mo14474a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public float mo14475b() {
        return this.f14753c;
    }

    /* renamed from: c */
    public float mo14476c() {
        return this.f14755e - this.f14756f;
    }
}
