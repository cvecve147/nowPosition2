package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.Sg */
public final class C2692Sg extends Thread implements SurfaceTexture.OnFrameAvailableListener, C2661Rg {

    /* renamed from: a */
    private static final float[] f8248a = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private volatile boolean f8249A;

    /* renamed from: B */
    private volatile boolean f8250B;

    /* renamed from: b */
    private final C2603Pg f8251b;

    /* renamed from: c */
    private final float[] f8252c;

    /* renamed from: d */
    private final float[] f8253d;

    /* renamed from: e */
    private final float[] f8254e;

    /* renamed from: f */
    private final float[] f8255f;

    /* renamed from: g */
    private final float[] f8256g;

    /* renamed from: h */
    private final float[] f8257h;

    /* renamed from: i */
    private final float[] f8258i;

    /* renamed from: j */
    private float f8259j;

    /* renamed from: k */
    private float f8260k;

    /* renamed from: l */
    private float f8261l;

    /* renamed from: m */
    private int f8262m;

    /* renamed from: n */
    private int f8263n;

    /* renamed from: o */
    private SurfaceTexture f8264o;

    /* renamed from: p */
    private SurfaceTexture f8265p;

    /* renamed from: q */
    private int f8266q;

    /* renamed from: r */
    private int f8267r;

    /* renamed from: s */
    private int f8268s;

    /* renamed from: t */
    private FloatBuffer f8269t = ByteBuffer.allocateDirect(f8248a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: u */
    private final CountDownLatch f8270u;

    /* renamed from: v */
    private final Object f8271v;

    /* renamed from: w */
    private EGL10 f8272w;

    /* renamed from: x */
    private EGLDisplay f8273x;

    /* renamed from: y */
    private EGLContext f8274y;

    /* renamed from: z */
    private EGLSurface f8275z;

    public C2692Sg(Context context) {
        super("SphericalVideoProcessor");
        this.f8269t.put(f8248a).position(0);
        this.f8252c = new float[9];
        this.f8253d = new float[9];
        this.f8254e = new float[9];
        this.f8255f = new float[9];
        this.f8256g = new float[9];
        this.f8257h = new float[9];
        this.f8258i = new float[9];
        this.f8259j = Float.NaN;
        this.f8251b = new C2603Pg(context);
        this.f8251b.mo8667a((C2661Rg) this);
        this.f8270u = new CountDownLatch(1);
        this.f8271v = new Object();
    }

    /* renamed from: a */
    private static int m11155a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m11156a("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        m11156a("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        m11156a("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        m11156a("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        m11156a("deleteShader");
        return 0;
    }

    /* renamed from: a */
    private static void m11156a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    /* renamed from: a */
    private static void m11157a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: a */
    private static void m11158a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: b */
    private static void m11159b(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: d */
    private final boolean m11160d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f8275z;
        boolean z = false;
        if (!(eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE))) {
            z = this.f8272w.eglDestroySurface(this.f8273x, this.f8275z) | this.f8272w.eglMakeCurrent(this.f8273x, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.f8275z = null;
        }
        EGLContext eGLContext = this.f8274y;
        if (eGLContext != null) {
            z |= this.f8272w.eglDestroyContext(this.f8273x, eGLContext);
            this.f8274y = null;
        }
        EGLDisplay eGLDisplay = this.f8273x;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = z | this.f8272w.eglTerminate(eGLDisplay);
        this.f8273x = null;
        return eglTerminate;
    }

    /* renamed from: a */
    public final void mo8781a() {
        synchronized (this.f8271v) {
            this.f8271v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo8821a(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = this.f8263n;
        int i2 = this.f8262m;
        if (i > i2) {
            f4 = (f * 1.7453293f) / ((float) i);
            f3 = f2 * 1.7453293f;
            f5 = (float) i;
        } else {
            f4 = (f * 1.7453293f) / ((float) i2);
            f3 = f2 * 1.7453293f;
            f5 = (float) i2;
        }
        this.f8260k -= f4;
        this.f8261l -= f3 / f5;
        if (this.f8261l < -1.5707964f) {
            this.f8261l = -1.5707964f;
        }
        if (this.f8261l > 1.5707964f) {
            this.f8261l = 1.5707964f;
        }
    }

    /* renamed from: a */
    public final void mo8822a(int i, int i2) {
        synchronized (this.f8271v) {
            this.f8263n = i;
            this.f8262m = i2;
            this.f8249A = true;
            this.f8271v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo8823a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f8263n = i;
        this.f8262m = i2;
        this.f8265p = surfaceTexture;
    }

    /* renamed from: b */
    public final void mo8824b() {
        synchronized (this.f8271v) {
            this.f8250B = true;
            this.f8265p = null;
            this.f8271v.notifyAll();
        }
    }

    /* renamed from: c */
    public final SurfaceTexture mo8825c() {
        if (this.f8265p == null) {
            return null;
        }
        try {
            this.f8270u.await();
        } catch (InterruptedException unused) {
        }
        return this.f8264o;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f8268s++;
        synchronized (this.f8271v) {
            this.f8271v.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01db A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            android.graphics.SurfaceTexture r0 = r14.f8265p
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.C2227Cf.m9529a((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r14.f8270u
            r0.countDown()
            return
        L_0x000f:
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r14.f8272w = r0
            javax.microedition.khronos.egl.EGL10 r0 = r14.f8272w
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r14.f8273x = r0
            javax.microedition.khronos.egl.EGLDisplay r0 = r14.f8273x
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x002f
        L_0x002c:
            r0 = r6
            goto L_0x009a
        L_0x002f:
            int[] r1 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r7 = r14.f8272w
            boolean r0 = r7.eglInitialize(r0, r1)
            if (r0 != 0) goto L_0x003a
            goto L_0x002c
        L_0x003a:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.f8272w
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f8273x
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x0059
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x0059
            r0 = r1[r6]
            goto L_0x005a
        L_0x0059:
            r0 = r4
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            goto L_0x002c
        L_0x005d:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.f8272w
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f8273x
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r14.f8274y = r1
            javax.microedition.khronos.egl.EGLContext r1 = r14.f8274y
            if (r1 == 0) goto L_0x002c
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x0077
            goto L_0x002c
        L_0x0077:
            javax.microedition.khronos.egl.EGL10 r1 = r14.f8272w
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.f8273x
            android.graphics.SurfaceTexture r8 = r14.f8265p
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r14.f8275z = r0
            javax.microedition.khronos.egl.EGLSurface r0 = r14.f8275z
            if (r0 == 0) goto L_0x002c
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x008c
            goto L_0x002c
        L_0x008c:
            javax.microedition.khronos.egl.EGL10 r1 = r14.f8272w
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.f8273x
            javax.microedition.khronos.egl.EGLContext r8 = r14.f8274y
            boolean r0 = r1.eglMakeCurrent(r7, r0, r0, r8)
            if (r0 != 0) goto L_0x0099
            goto L_0x002c
        L_0x0099:
            r0 = r5
        L_0x009a:
            r1 = 35633(0x8b31, float:4.9932E-41)
            com.google.android.gms.internal.ads.Du<java.lang.String> r7 = com.google.android.gms.internal.ads.C2558Nu.f7790Ob
            com.google.android.gms.internal.ads.Lu r8 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r8 = r8.mo8515a(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.mo8017c()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00be
            com.google.android.gms.internal.ads.Lu r8 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r7 = r8.mo8515a(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00c0
        L_0x00be:
            java.lang.String r7 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00c0:
            int r1 = m11155a((int) r1, (java.lang.String) r7)
            if (r1 != 0) goto L_0x00c9
        L_0x00c6:
            r8 = r6
            goto L_0x014b
        L_0x00c9:
            r7 = 35632(0x8b30, float:4.9931E-41)
            com.google.android.gms.internal.ads.Du<java.lang.String> r8 = com.google.android.gms.internal.ads.C2558Nu.f7796Pb
            com.google.android.gms.internal.ads.Lu r9 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r9 = r9.mo8515a(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.mo8017c()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00ed
            com.google.android.gms.internal.ads.Lu r9 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r8 = r9.mo8515a(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00ef
        L_0x00ed:
            java.lang.String r8 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00ef:
            int r7 = m11155a((int) r7, (java.lang.String) r8)
            if (r7 != 0) goto L_0x00f6
            goto L_0x00c6
        L_0x00f6:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            m11156a(r9)
            if (r8 == 0) goto L_0x014b
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            m11156a(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            m11156a(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            m11156a(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            m11156a(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x0143
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r8)
            java.lang.String r7 = "SphericalVideoRenderer"
            android.util.Log.e(r7, r1)
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            m11156a(r1)
            goto L_0x00c6
        L_0x0143:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            m11156a(r1)
        L_0x014b:
            r14.f8266q = r8
            int r1 = r14.f8266q
            android.opengl.GLES20.glUseProgram(r1)
            java.lang.String r1 = "useProgram"
            m11156a(r1)
            int r1 = r14.f8266q
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r14.f8269t
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            m11156a(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            m11156a(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            m11156a(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            m11156a(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m11156a(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m11156a(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m11156a(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            m11156a(r7)
            int r7 = r14.f8266q
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r14.f8267r = r7
            r7 = 9
            float[] r7 = new float[r7]
            r7 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            int r8 = r14.f8267r
            android.opengl.GLES20.glUniformMatrix3fv(r8, r5, r6, r7, r6)
            int r7 = r14.f8266q
            if (r7 == 0) goto L_0x01d8
            r7 = r5
            goto L_0x01d9
        L_0x01d8:
            r7 = r6
        L_0x01d9:
            if (r0 == 0) goto L_0x0390
            if (r7 != 0) goto L_0x01df
            goto L_0x0390
        L_0x01df:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r14.f8264o = r0
            android.graphics.SurfaceTexture r0 = r14.f8264o
            r0.setOnFrameAvailableListener(r14)
            java.util.concurrent.CountDownLatch r0 = r14.f8270u
            r0.countDown()
            com.google.android.gms.internal.ads.Pg r0 = r14.f8251b
            r0.mo8666a()
            r14.f8249A = r5     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
        L_0x01f7:
            boolean r0 = r14.f8250B     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            if (r0 != 0) goto L_0x033a
        L_0x01fb:
            int r0 = r14.f8268s     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            if (r0 <= 0) goto L_0x020a
            android.graphics.SurfaceTexture r0 = r14.f8264o     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            int r0 = r14.f8268s     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            int r0 = r0 - r5
            r14.f8268s = r0     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            goto L_0x01fb
        L_0x020a:
            com.google.android.gms.internal.ads.Pg r0 = r14.f8251b     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r1 = r14.f8252c     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            boolean r0 = r0.mo8668a((float[]) r1)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r1 = 5
            r7 = 4
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            if (r0 == 0) goto L_0x0287
            float r0 = r14.f8259j     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            if (r0 == 0) goto L_0x027c
            float[] r0 = r14.f8252c     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r10 = 0
            r9[r6] = r10     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r5] = r11     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r9[r3] = r10     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r11 = r11 * r12
            r12 = r0[r5]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r3]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r11 = r11 * r12
            r12 = r0[r7]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r1]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r0 = r0 - r8
            float r0 = -r0
            r14.f8259j = r0     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
        L_0x027c:
            float[] r0 = r14.f8257h     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r9 = r14.f8259j     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r10 = r14.f8260k     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r9 = r9 + r10
            m11159b(r0, r9)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            goto L_0x0296
        L_0x0287:
            float[] r0 = r14.f8252c     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r9 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            m11157a((float[]) r0, (float) r9)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r0 = r14.f8257h     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r9 = r14.f8260k     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            m11159b(r0, r9)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
        L_0x0296:
            float[] r0 = r14.f8253d     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            m11157a((float[]) r0, (float) r8)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r0 = r14.f8254e     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r8 = r14.f8257h     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r9 = r14.f8253d     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            m11158a((float[]) r0, (float[]) r8, (float[]) r9)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r0 = r14.f8255f     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r8 = r14.f8252c     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r9 = r14.f8254e     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            m11158a((float[]) r0, (float[]) r8, (float[]) r9)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r0 = r14.f8256g     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r8 = r14.f8261l     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            m11157a((float[]) r0, (float) r8)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r0 = r14.f8258i     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r8 = r14.f8256g     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r9 = r14.f8255f     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            m11158a((float[]) r0, (float[]) r8, (float[]) r9)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            int r0 = r14.f8267r     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float[] r8 = r14.f8258i     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            java.lang.String r0 = "drawArrays"
            m11156a(r0)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            javax.microedition.khronos.egl.EGL10 r0 = r14.f8272w     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            javax.microedition.khronos.egl.EGLDisplay r1 = r14.f8273x     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            javax.microedition.khronos.egl.EGLSurface r7 = r14.f8275z     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            boolean r0 = r14.f8249A     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            if (r0 == 0) goto L_0x0320
            int r0 = r14.f8263n     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            int r1 = r14.f8262m     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            java.lang.String r0 = "viewport"
            m11156a(r0)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            int r0 = r14.f8266q     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            int r1 = r14.f8266q     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            int r7 = r14.f8263n     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            int r8 = r14.f8262m     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x0310
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            int r0 = r14.f8262m     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r0 = r0 * r9
            int r7 = r14.f8263n     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            goto L_0x031e
        L_0x0310:
            int r7 = r14.f8263n     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r7 = r7 * r9
            int r8 = r14.f8262m     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
        L_0x031e:
            r14.f8249A = r6     // Catch:{ IllegalStateException -> 0x036b, Throwable -> 0x034c }
        L_0x0320:
            java.lang.Object r0 = r14.f8271v     // Catch:{ InterruptedException -> 0x01f7 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x01f7 }
            boolean r1 = r14.f8250B     // Catch:{ all -> 0x0337 }
            if (r1 != 0) goto L_0x0334
            boolean r1 = r14.f8249A     // Catch:{ all -> 0x0337 }
            if (r1 != 0) goto L_0x0334
            int r1 = r14.f8268s     // Catch:{ all -> 0x0337 }
            if (r1 != 0) goto L_0x0334
            java.lang.Object r1 = r14.f8271v     // Catch:{ all -> 0x0337 }
            r1.wait()     // Catch:{ all -> 0x0337 }
        L_0x0334:
            monitor-exit(r0)     // Catch:{ all -> 0x0337 }
            goto L_0x01f7
        L_0x0337:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0337 }
            throw r1     // Catch:{ InterruptedException -> 0x01f7 }
        L_0x033a:
            com.google.android.gms.internal.ads.Pg r0 = r14.f8251b
            r0.mo8669b()
            android.graphics.SurfaceTexture r0 = r14.f8264o
            r0.setOnFrameAvailableListener(r4)
            r14.f8264o = r4
            r14.m11160d()
            return
        L_0x034a:
            r0 = move-exception
            goto L_0x0380
        L_0x034c:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r1, r0)     // Catch:{ all -> 0x034a }
            com.google.android.gms.internal.ads.Id r1 = com.google.android.gms.ads.internal.C1697X.m7702i()     // Catch:{ all -> 0x034a }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.mo8319a((java.lang.Throwable) r0, (java.lang.String) r2)     // Catch:{ all -> 0x034a }
            com.google.android.gms.internal.ads.Pg r0 = r14.f8251b
            r0.mo8669b()
            android.graphics.SurfaceTexture r0 = r14.f8264o
            r0.setOnFrameAvailableListener(r4)
            r14.f8264o = r4
            r14.m11160d()
            return
        L_0x036b:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)     // Catch:{ all -> 0x034a }
            com.google.android.gms.internal.ads.Pg r0 = r14.f8251b
            r0.mo8669b()
            android.graphics.SurfaceTexture r0 = r14.f8264o
            r0.setOnFrameAvailableListener(r4)
            r14.f8264o = r4
            r14.m11160d()
            return
        L_0x0380:
            com.google.android.gms.internal.ads.Pg r1 = r14.f8251b
            r1.mo8669b()
            android.graphics.SurfaceTexture r1 = r14.f8264o
            r1.setOnFrameAvailableListener(r4)
            r14.f8264o = r4
            r14.m11160d()
            throw r0
        L_0x0390:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f8272w
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r1 = "EGL initialization failed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03ab
            java.lang.String r0 = r1.concat(r0)
            goto L_0x03b0
        L_0x03ab:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x03b0:
            com.google.android.gms.internal.ads.C2227Cf.m9529a((java.lang.String) r0)
            com.google.android.gms.internal.ads.Id r1 = com.google.android.gms.ads.internal.C1697X.m7702i()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.mo8319a((java.lang.Throwable) r2, (java.lang.String) r0)
            r14.m11160d()
            java.util.concurrent.CountDownLatch r0 = r14.f8270u
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2692Sg.run():void");
    }
}
