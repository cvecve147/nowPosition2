package com.openlife.checkme.activity.scanner.p089a;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.vision.barcode.C4011a;
import java.io.IOException;
import java.lang.reflect.Field;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p129g.p131b.p132a.p145h.C5558a;

/* renamed from: com.openlife.checkme.activity.scanner.a.d */
public class C4763d {

    /* renamed from: a */
    private final String f13739a;

    /* renamed from: b */
    private final int f13740b;

    /* renamed from: c */
    private final int f13741c;

    /* renamed from: d */
    private final int f13742d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4766e f13743e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f13744f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SurfaceView f13745g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C5558a f13746h;

    /* renamed from: i */
    private C4011a f13747i;

    /* renamed from: j */
    private boolean f13748j;

    /* renamed from: k */
    private boolean f13749k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f13750l;

    /* renamed from: m */
    private final SurfaceHolder.Callback f13751m;

    /* renamed from: com.openlife.checkme.activity.scanner.a.d$a */
    public static class C4764a {

        /* renamed from: a */
        private static C4011a f13752a;

        /* renamed from: a */
        static C4011a m18809a(Context context) {
            if (f13752a == null) {
                C4011a.C4012a aVar = new C4011a.C4012a(context.getApplicationContext());
                aVar.mo11387a(0);
                f13752a = aVar.mo11388a();
            }
            return f13752a;
        }
    }

    /* renamed from: com.openlife.checkme.activity.scanner.a.d$b */
    public static class C4765b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C4766e f13753a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Context f13754b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final SurfaceView f13755c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f13756d = true;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f13757e = 800;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f13758f = 800;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f13759g = 0;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C4011a f13760h;

        public C4765b(Context context, SurfaceView surfaceView, C4766e eVar) {
            this.f13753a = eVar;
            this.f13754b = context;
            this.f13755c = surfaceView;
        }

        /* renamed from: a */
        public C4765b mo13201a(int i) {
            if (i != 0) {
                this.f13757e = i;
            }
            return this;
        }

        /* renamed from: a */
        public C4765b mo13202a(boolean z) {
            this.f13756d = z;
            return this;
        }

        /* renamed from: a */
        public C4763d mo13203a() {
            return new C4763d(this, (C4760a) null);
        }

        /* renamed from: b */
        public C4765b mo13204b(int i) {
            if (i != 0) {
                this.f13758f = i;
            }
            return this;
        }

        /* renamed from: c */
        public C4765b mo13205c(int i) {
            this.f13759g = i;
            return this;
        }
    }

    private C4763d(C4765b bVar) {
        this.f13739a = C4763d.class.getSimpleName();
        this.f13746h = null;
        this.f13747i = null;
        this.f13749k = false;
        this.f13750l = false;
        this.f13751m = new C4760a(this);
        this.f13748j = bVar.f13756d;
        this.f13740b = bVar.f13757e;
        this.f13741c = bVar.f13758f;
        this.f13742d = bVar.f13759g;
        this.f13743e = bVar.f13753a;
        this.f13744f = bVar.f13754b;
        this.f13745g = bVar.f13755c;
        this.f13747i = bVar.f13760h == null ? C4764a.m18809a(this.f13744f) : bVar.f13760h;
    }

    /* synthetic */ C4763d(C4765b bVar, C4760a aVar) {
        this(bVar);
    }

    /* renamed from: a */
    public static Camera m18789a(C5558a aVar) {
        Field[] declaredFields = C5558a.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            if (field.getType() == Camera.class) {
                field.setAccessible(true);
                try {
                    Camera camera = (Camera) field.get(aVar);
                    if (camera != null) {
                        return camera;
                    }
                    return null;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else {
                i++;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18790a(Context context, C5558a aVar, SurfaceView surfaceView) {
        if (!this.f13749k) {
            try {
                if (C1006a.m5387a(context, "android.permission.CAMERA") != 0) {
                    Log.e(this.f13739a, "Permission not granted!");
                } else if (!this.f13749k && aVar != null && surfaceView != null) {
                    aVar.mo15019a(surfaceView.getHolder());
                    this.f13749k = true;
                }
            } catch (IOException e) {
                Log.e(this.f13739a, e.getMessage());
                e.printStackTrace();
            }
        } else {
            throw new IllegalStateException("Camera already started!");
        }
    }

    /* renamed from: a */
    private boolean m18793a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera.autofocus");
    }

    /* access modifiers changed from: private */
    @TargetApi(16)
    /* renamed from: b */
    public static void m18796b(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (Build.VERSION.SDK_INT < 16) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
        } else {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: b */
    private boolean m18797b(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    /* renamed from: c */
    private boolean m18799c(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.CAMERA") == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m18802e() {
        String str;
        String str2;
        if (!m18793a(this.f13744f)) {
            Log.e(this.f13739a, "Do not have autofocus feature, disabling autofocus feature in the library!");
            this.f13748j = false;
        }
        if (!m18797b(this.f13744f)) {
            str = this.f13739a;
            str2 = "Does not have camera hardware!";
        } else if (!m18799c(this.f13744f)) {
            str = this.f13739a;
            str2 = "Do not have camera permission!";
        } else if (this.f13747i.mo11385a()) {
            this.f13747i.mo15033a(new C4762c(this));
            C5558a.C5559a aVar = new C5558a.C5559a(this.f13744f, this.f13747i);
            aVar.mo15024a(this.f13748j);
            aVar.mo15022a(this.f13742d);
            aVar.mo15023a(this.f13740b, this.f13741c);
            this.f13746h = aVar.mo15025a();
            return;
        } else {
            Log.e(this.f13739a, "Barcode recognition libs are not downloaded and are not operational");
            return;
        }
        Log.e(str, str2);
    }

    /* renamed from: a */
    public void mo13195a() {
        SurfaceView surfaceView = this.f13745g;
        if (surfaceView != null && this.f13751m != null) {
            if (this.f13750l) {
                m18790a(this.f13744f, this.f13746h, surfaceView);
            } else {
                surfaceView.getHolder().addCallback(this.f13751m);
            }
        }
    }

    /* renamed from: a */
    public void mo13196a(SurfaceView surfaceView) {
        surfaceView.getViewTreeObserver().addOnGlobalLayoutListener(new C4761b(this, surfaceView));
    }

    /* renamed from: a */
    public void mo13197a(boolean z) {
        Camera a = m18789a(this.f13746h);
        if (a != null) {
            try {
                Camera.Parameters parameters = a.getParameters();
                parameters.setFlashMode(z ? "torch" : "off");
                a.setParameters(parameters);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public boolean mo13198b() {
        return this.f13749k;
    }

    /* renamed from: c */
    public void mo13199c() {
        mo13200d();
        C5558a aVar = this.f13746h;
        if (aVar != null) {
            aVar.mo15020a();
            this.f13746h = null;
        }
    }

    /* renamed from: d */
    public void mo13200d() {
        try {
            if (this.f13749k && this.f13746h != null) {
                this.f13746h.mo15021b();
                this.f13749k = false;
            }
        } catch (Exception e) {
            Log.e(this.f13739a, e.getMessage());
            e.printStackTrace();
        }
    }
}
