package com.journeyapps.barcodescanner.p077a;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.journeyapps.barcodescanner.C4101C;
import com.journeyapps.barcodescanner.C4102D;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p159f.p163b.p164a.C5755b;
import p101d.p129g.p159f.p163b.p164a.p165a.C5753a;
import p101d.p129g.p159f.p163b.p164a.p165a.p166a.C5754a;

/* renamed from: com.journeyapps.barcodescanner.a.l */
public final class C4119l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f12224a = "l";

    /* renamed from: b */
    private Camera f12225b;

    /* renamed from: c */
    private Camera.CameraInfo f12226c;

    /* renamed from: d */
    private C4111d f12227d;

    /* renamed from: e */
    private C5755b f12228e;

    /* renamed from: f */
    private boolean f12229f;

    /* renamed from: g */
    private String f12230g;

    /* renamed from: h */
    private C4121m f12231h = new C4121m();

    /* renamed from: i */
    private C4126q f12232i;

    /* renamed from: j */
    private C4101C f12233j;

    /* renamed from: k */
    private C4101C f12234k;

    /* renamed from: l */
    private int f12235l = -1;

    /* renamed from: m */
    private Context f12236m;

    /* renamed from: n */
    private final C4120a f12237n;

    /* renamed from: com.journeyapps.barcodescanner.a.l$a */
    private final class C4120a implements Camera.PreviewCallback {

        /* renamed from: a */
        private C4129t f12238a;

        /* renamed from: b */
        private C4101C f12239b;

        public C4120a() {
        }

        /* renamed from: a */
        public void mo11643a(C4101C c) {
            this.f12239b = c;
        }

        /* renamed from: a */
        public void mo11644a(C4129t tVar) {
            this.f12238a = tVar;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e;
            C4101C c = this.f12239b;
            C4129t tVar = this.f12238a;
            if (c == null || tVar == null) {
                Log.d(C4119l.f12224a, "Got preview callback, but no handler or resolution available");
                if (tVar != null) {
                    e = new Exception("No resolution available");
                } else {
                    return;
                }
            } else {
                try {
                    tVar.mo11666a(new C4102D(bArr, c.f12161a, c.f12162b, camera.getParameters().getPreviewFormat(), C4119l.this.mo11636d()));
                    return;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    Log.e(C4119l.f12224a, "Camera preview failed", e);
                }
            }
            tVar.mo11667a(e);
        }
    }

    public C4119l(Context context) {
        this.f12236m = context;
        this.f12237n = new C4120a();
    }

    /* renamed from: a */
    private static List<C4101C> m16449a(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new C4101C(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size next : supportedPreviewSizes) {
            arrayList.add(new C4101C(next.width, next.height));
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m16450a(int i) {
        this.f12225b.setDisplayOrientation(i);
    }

    /* renamed from: b */
    private void m16451b(boolean z) {
        Camera.Parameters l = m16453l();
        if (l == null) {
            Log.w(f12224a, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f12224a;
        Log.i(str, "Initial camera parameters: " + l.flatten());
        if (z) {
            Log.w(f12224a, "In camera config safe mode -- most settings will not be honored");
        }
        C5753a.m21747a(l, this.f12231h.mo11646a(), z);
        if (!z) {
            C5753a.m21750b(l, false);
            if (this.f12231h.mo11654h()) {
                C5753a.m21752d(l);
            }
            if (this.f12231h.mo11651e()) {
                C5753a.m21745a(l);
            }
            if (this.f12231h.mo11653g() && Build.VERSION.SDK_INT >= 15) {
                C5753a.m21754f(l);
                C5753a.m21751c(l);
                C5753a.m21753e(l);
            }
        }
        List<C4101C> a = m16449a(l);
        if (a.size() == 0) {
            this.f12233j = null;
        } else {
            this.f12233j = this.f12232i.mo11663a(a, mo11638f());
            C4101C c = this.f12233j;
            l.setPreviewSize(c.f12161a, c.f12162b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            C5753a.m21749b(l);
        }
        String str2 = f12224a;
        Log.i(str2, "Final camera parameters: " + l.flatten());
        this.f12225b.setParameters(l);
    }

    /* renamed from: k */
    private int m16452k() {
        int a = this.f12232i.mo11661a();
        int i = 0;
        if (a != 0) {
            if (a == 1) {
                i = 90;
            } else if (a == 2) {
                i = 180;
            } else if (a == 3) {
                i = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f12226c;
        int i2 = (cameraInfo.facing == 1 ? 360 - ((cameraInfo.orientation + i) % 360) : (cameraInfo.orientation - i) + 360) % 360;
        String str = f12224a;
        Log.i(str, "Camera Display Orientation: " + i2);
        return i2;
    }

    /* renamed from: l */
    private Camera.Parameters m16453l() {
        Camera.Parameters parameters = this.f12225b.getParameters();
        String str = this.f12230g;
        if (str == null) {
            this.f12230g = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    /* renamed from: m */
    private void m16454m() {
        try {
            this.f12235l = m16452k();
            m16450a(this.f12235l);
        } catch (Exception unused) {
            Log.w(f12224a, "Failed to set rotation.");
        }
        try {
            m16451b(false);
        } catch (Exception unused2) {
            try {
                m16451b(true);
            } catch (Exception unused3) {
                Log.w(f12224a, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f12225b.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f12234k = this.f12233j;
        } else {
            this.f12234k = new C4101C(previewSize.width, previewSize.height);
        }
        this.f12237n.mo11643a(this.f12234k);
    }

    /* renamed from: a */
    public void mo11629a(C4121m mVar) {
        this.f12231h = mVar;
    }

    /* renamed from: a */
    public void mo11630a(C4123n nVar) {
        nVar.mo11655a(this.f12225b);
    }

    /* renamed from: a */
    public void mo11631a(C4126q qVar) {
        this.f12232i = qVar;
    }

    /* renamed from: a */
    public void mo11632a(C4129t tVar) {
        Camera camera = this.f12225b;
        if (camera != null && this.f12229f) {
            this.f12237n.mo11644a(tVar);
            camera.setOneShotPreviewCallback(this.f12237n);
        }
    }

    /* renamed from: a */
    public void mo11633a(boolean z) {
        if (this.f12225b != null && z != mo11639g()) {
            C4111d dVar = this.f12227d;
            if (dVar != null) {
                dVar.mo11610b();
            }
            Camera.Parameters parameters = this.f12225b.getParameters();
            C5753a.m21750b(parameters, z);
            if (this.f12231h.mo11652f()) {
                C5753a.m21748a(parameters, z);
            }
            this.f12225b.setParameters(parameters);
            C4111d dVar2 = this.f12227d;
            if (dVar2 != null) {
                dVar2.mo11609a();
            }
        }
    }

    /* renamed from: b */
    public void mo11634b() {
        Camera camera = this.f12225b;
        if (camera != null) {
            camera.release();
            this.f12225b = null;
        }
    }

    /* renamed from: c */
    public void mo11635c() {
        if (this.f12225b != null) {
            m16454m();
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    /* renamed from: d */
    public int mo11636d() {
        return this.f12235l;
    }

    /* renamed from: e */
    public C4101C mo11637e() {
        if (this.f12234k == null) {
            return null;
        }
        return mo11638f() ? this.f12234k.mo11563a() : this.f12234k;
    }

    /* renamed from: f */
    public boolean mo11638f() {
        int i = this.f12235l;
        if (i != -1) {
            return i % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    /* renamed from: g */
    public boolean mo11639g() {
        String flashMode;
        Camera.Parameters parameters = this.f12225b.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* renamed from: h */
    public void mo11640h() {
        this.f12225b = C5754a.m21756b(this.f12231h.mo11648b());
        if (this.f12225b != null) {
            int a = C5754a.m21755a(this.f12231h.mo11648b());
            this.f12226c = new Camera.CameraInfo();
            Camera.getCameraInfo(a, this.f12226c);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    /* renamed from: i */
    public void mo11641i() {
        Camera camera = this.f12225b;
        if (camera != null && !this.f12229f) {
            camera.startPreview();
            this.f12229f = true;
            this.f12227d = new C4111d(this.f12225b, this.f12231h);
            this.f12228e = new C5755b(this.f12236m, this, this.f12231h);
            this.f12228e.mo15347a();
        }
    }

    /* renamed from: j */
    public void mo11642j() {
        C4111d dVar = this.f12227d;
        if (dVar != null) {
            dVar.mo11610b();
            this.f12227d = null;
        }
        C5755b bVar = this.f12228e;
        if (bVar != null) {
            bVar.mo15348b();
            this.f12228e = null;
        }
        Camera camera = this.f12225b;
        if (camera != null && this.f12229f) {
            camera.stopPreview();
            this.f12237n.mo11644a((C4129t) null);
            this.f12229f = false;
        }
    }
}
