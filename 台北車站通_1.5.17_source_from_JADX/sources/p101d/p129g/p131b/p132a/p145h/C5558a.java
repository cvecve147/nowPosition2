package p101d.p129g.p131b.p132a.p145h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.google.android.gms.common.p070a.C1846a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: d.g.b.a.h.a */
public class C5558a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f15491a;

    /* renamed from: b */
    private final Object f15492b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Camera f15493c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f15494d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f15495e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1846a f15496f;

    /* renamed from: g */
    private float f15497g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f15498h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f15499i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f15500j;

    /* renamed from: k */
    private boolean f15501k;

    /* renamed from: l */
    private Thread f15502l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C5561c f15503m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Map<byte[], ByteBuffer> f15504n;

    /* renamed from: d.g.b.a.h.a$a */
    public static class C5559a {

        /* renamed from: a */
        private final C5563b<?> f15505a;

        /* renamed from: b */
        private C5558a f15506b = new C5558a();

        public C5559a(Context context, C5563b<?> bVar) {
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (bVar != null) {
                this.f15505a = bVar;
                Context unused = this.f15506b.f15491a = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        /* renamed from: a */
        public C5559a mo15022a(int i) {
            if (i == 0 || i == 1) {
                int unused = this.f15506b.f15494d = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(27);
            sb.append("Invalid camera: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C5559a mo15023a(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Invalid preview size: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            int unused = this.f15506b.f15498h = i;
            int unused2 = this.f15506b.f15499i = i2;
            return this;
        }

        /* renamed from: a */
        public C5559a mo15024a(boolean z) {
            boolean unused = this.f15506b.f15500j = z;
            return this;
        }

        /* renamed from: a */
        public C5558a mo15025a() {
            C5558a aVar = this.f15506b;
            aVar.getClass();
            C5561c unused = aVar.f15503m = new C5561c(this.f15505a);
            return this.f15506b;
        }
    }

    /* renamed from: d.g.b.a.h.a$b */
    private class C5560b implements Camera.PreviewCallback {
        private C5560b() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            C5558a.this.f15503m.mo15029a(bArr, camera);
        }
    }

    /* renamed from: d.g.b.a.h.a$c */
    private class C5561c implements Runnable {

        /* renamed from: a */
        private C5563b<?> f15508a;

        /* renamed from: b */
        private long f15509b = SystemClock.elapsedRealtime();

        /* renamed from: c */
        private final Object f15510c = new Object();

        /* renamed from: d */
        private boolean f15511d = true;

        /* renamed from: e */
        private long f15512e;

        /* renamed from: f */
        private int f15513f = 0;

        /* renamed from: g */
        private ByteBuffer f15514g;

        C5561c(C5563b<?> bVar) {
            this.f15508a = bVar;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"Assert"})
        /* renamed from: a */
        public final void mo15027a() {
            this.f15508a.mo11386b();
            this.f15508a = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo15028a(boolean z) {
            synchronized (this.f15510c) {
                this.f15511d = z;
                this.f15510c.notifyAll();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo15029a(byte[] bArr, Camera camera) {
            synchronized (this.f15510c) {
                if (this.f15514g != null) {
                    camera.addCallbackBuffer(this.f15514g.array());
                    this.f15514g = null;
                }
                if (!C5558a.this.f15504n.containsKey(bArr)) {
                    Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                    return;
                }
                this.f15512e = SystemClock.elapsedRealtime() - this.f15509b;
                this.f15513f++;
                this.f15514g = (ByteBuffer) C5558a.this.f15504n.get(bArr);
                this.f15510c.notifyAll();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r6.f15508a.mo15034b(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            android.util.Log.e("CameraSource", "Exception thrown from receiver.", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
            p101d.p129g.p131b.p132a.p145h.C5558a.m21130a(r6.f15515h).addCallbackBuffer(r2.array());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
            throw r0;
         */
        @android.annotation.SuppressLint({"InlinedApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
            L_0x0000:
                java.lang.Object r0 = r6.f15510c
                monitor-enter(r0)
            L_0x0003:
                boolean r1 = r6.f15511d     // Catch:{ all -> 0x008a }
                if (r1 == 0) goto L_0x001b
                java.nio.ByteBuffer r1 = r6.f15514g     // Catch:{ all -> 0x008a }
                if (r1 != 0) goto L_0x001b
                java.lang.Object r1 = r6.f15510c     // Catch:{ InterruptedException -> 0x0011 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0011 }
                goto L_0x0003
            L_0x0011:
                r1 = move-exception
                java.lang.String r2 = "CameraSource"
                java.lang.String r3 = "Frame processing loop terminated."
                android.util.Log.d(r2, r3, r1)     // Catch:{ all -> 0x008a }
                monitor-exit(r0)     // Catch:{ all -> 0x008a }
                return
            L_0x001b:
                boolean r1 = r6.f15511d     // Catch:{ all -> 0x008a }
                if (r1 != 0) goto L_0x0021
                monitor-exit(r0)     // Catch:{ all -> 0x008a }
                return
            L_0x0021:
                d.g.b.a.h.c$a r1 = new d.g.b.a.h.c$a     // Catch:{ all -> 0x008a }
                r1.<init>()     // Catch:{ all -> 0x008a }
                java.nio.ByteBuffer r2 = r6.f15514g     // Catch:{ all -> 0x008a }
                d.g.b.a.h.a r3 = p101d.p129g.p131b.p132a.p145h.C5558a.this     // Catch:{ all -> 0x008a }
                com.google.android.gms.common.a.a r3 = r3.f15496f     // Catch:{ all -> 0x008a }
                int r3 = r3.mo7236b()     // Catch:{ all -> 0x008a }
                d.g.b.a.h.a r4 = p101d.p129g.p131b.p132a.p145h.C5558a.this     // Catch:{ all -> 0x008a }
                com.google.android.gms.common.a.a r4 = r4.f15496f     // Catch:{ all -> 0x008a }
                int r4 = r4.mo7235a()     // Catch:{ all -> 0x008a }
                r5 = 17
                r1.mo15041a(r2, r3, r4, r5)     // Catch:{ all -> 0x008a }
                int r2 = r6.f15513f     // Catch:{ all -> 0x008a }
                r1.mo15039a((int) r2)     // Catch:{ all -> 0x008a }
                long r2 = r6.f15512e     // Catch:{ all -> 0x008a }
                r1.mo15040a((long) r2)     // Catch:{ all -> 0x008a }
                d.g.b.a.h.a r2 = p101d.p129g.p131b.p132a.p145h.C5558a.this     // Catch:{ all -> 0x008a }
                int r2 = r2.f15495e     // Catch:{ all -> 0x008a }
                r1.mo15043b(r2)     // Catch:{ all -> 0x008a }
                d.g.b.a.h.c r1 = r1.mo15042a()     // Catch:{ all -> 0x008a }
                java.nio.ByteBuffer r2 = r6.f15514g     // Catch:{ all -> 0x008a }
                r3 = 0
                r6.f15514g = r3     // Catch:{ all -> 0x008a }
                monitor-exit(r0)     // Catch:{ all -> 0x008a }
                d.g.b.a.h.b<?> r0 = r6.f15508a     // Catch:{ Throwable -> 0x0073 }
                r0.mo15034b(r1)     // Catch:{ Throwable -> 0x0073 }
            L_0x0063:
                d.g.b.a.h.a r0 = p101d.p129g.p131b.p132a.p145h.C5558a.this
                android.hardware.Camera r0 = r0.f15493c
                byte[] r1 = r2.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x0071:
                r0 = move-exception
                goto L_0x007c
            L_0x0073:
                r0 = move-exception
                java.lang.String r1 = "CameraSource"
                java.lang.String r3 = "Exception thrown from receiver."
                android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0071 }
                goto L_0x0063
            L_0x007c:
                d.g.b.a.h.a r1 = p101d.p129g.p131b.p132a.p145h.C5558a.this
                android.hardware.Camera r1 = r1.f15493c
                byte[] r2 = r2.array()
                r1.addCallbackBuffer(r2)
                throw r0
            L_0x008a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x008a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p131b.p132a.p145h.C5558a.C5561c.run():void");
        }
    }

    /* renamed from: d.g.b.a.h.a$d */
    static class C5562d {

        /* renamed from: a */
        private C1846a f15516a;

        /* renamed from: b */
        private C1846a f15517b;

        public C5562d(Camera.Size size, Camera.Size size2) {
            this.f15516a = new C1846a(size.width, size.height);
            if (size2 != null) {
                this.f15517b = new C1846a(size2.width, size2.height);
            }
        }

        /* renamed from: a */
        public final C1846a mo15031a() {
            return this.f15516a;
        }

        /* renamed from: b */
        public final C1846a mo15032b() {
            return this.f15517b;
        }
    }

    private C5558a() {
        this.f15492b = new Object();
        this.f15494d = 0;
        this.f15497g = 30.0f;
        this.f15498h = 1024;
        this.f15499i = 768;
        this.f15500j = false;
        this.f15504n = new HashMap();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private final byte[] m21133a(C1846a aVar) {
        byte[] bArr = new byte[(((int) Math.ceil(((double) ((long) ((aVar.mo7235a() * aVar.mo7236b()) * ImageFormat.getBitsPerPixel(17)))) / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.f15504n.put(bArr, wrap);
        return bArr;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: c */
    private final Camera m21137c() {
        int i;
        int i2;
        int i3 = this.f15494d;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= Camera.getNumberOfCameras()) {
                i5 = -1;
                break;
            }
            Camera.getCameraInfo(i5, cameraInfo);
            if (cameraInfo.facing == i3) {
                break;
            }
            i5++;
        }
        if (i5 != -1) {
            Camera open = Camera.open(i5);
            int i6 = this.f15498h;
            int i7 = this.f15499i;
            Camera.Parameters parameters = open.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Camera.Size next : supportedPreviewSizes) {
                float f = ((float) next.width) / ((float) next.height);
                Iterator<Camera.Size> it = supportedPictureSizes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Camera.Size next2 = it.next();
                    if (Math.abs(f - (((float) next2.width) / ((float) next2.height))) < 0.01f) {
                        arrayList.add(new C5562d(next, next2));
                        break;
                    }
                }
            }
            if (arrayList.size() == 0) {
                Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
                for (Camera.Size dVar : supportedPreviewSizes) {
                    arrayList.add(new C5562d(dVar, (Camera.Size) null));
                }
            }
            int size = arrayList.size();
            int i8 = 0;
            int i9 = Integer.MAX_VALUE;
            C5562d dVar2 = null;
            while (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                C5562d dVar3 = (C5562d) obj;
                C1846a a = dVar3.mo15031a();
                int abs = Math.abs(a.mo7236b() - i6) + Math.abs(a.mo7235a() - i7);
                if (abs < i9) {
                    dVar2 = dVar3;
                    i9 = abs;
                }
            }
            if (dVar2 != null) {
                C1846a b = dVar2.mo15032b();
                this.f15496f = dVar2.mo15031a();
                int i10 = (int) (this.f15497g * 1000.0f);
                int i11 = Integer.MAX_VALUE;
                int[] iArr = null;
                for (int[] next3 : open.getParameters().getSupportedPreviewFpsRange()) {
                    int abs2 = Math.abs(i10 - next3[0]) + Math.abs(i10 - next3[1]);
                    if (abs2 < i11) {
                        iArr = next3;
                        i11 = abs2;
                    }
                }
                if (iArr != null) {
                    Camera.Parameters parameters2 = open.getParameters();
                    if (b != null) {
                        parameters2.setPictureSize(b.mo7236b(), b.mo7235a());
                    }
                    parameters2.setPreviewSize(this.f15496f.mo7236b(), this.f15496f.mo7235a());
                    parameters2.setPreviewFpsRange(iArr[0], iArr[1]);
                    parameters2.setPreviewFormat(17);
                    int rotation = ((WindowManager) this.f15491a.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        if (rotation == 1) {
                            i4 = 90;
                        } else if (rotation == 2) {
                            i4 = 180;
                        } else if (rotation != 3) {
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("Bad rotation value: ");
                            sb.append(rotation);
                            Log.e("CameraSource", sb.toString());
                        } else {
                            i4 = 270;
                        }
                    }
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    Camera.getCameraInfo(i5, cameraInfo2);
                    if (cameraInfo2.facing == 1) {
                        i2 = (cameraInfo2.orientation + i4) % 360;
                        i = (360 - i2) % 360;
                    } else {
                        i2 = ((cameraInfo2.orientation - i4) + 360) % 360;
                        i = i2;
                    }
                    this.f15495e = i2 / 90;
                    open.setDisplayOrientation(i);
                    parameters2.setRotation(i2);
                    if (this.f15500j) {
                        if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                            parameters2.setFocusMode("continuous-video");
                        } else {
                            Log.i("CameraSource", "Camera auto focus is not supported on this device.");
                        }
                    }
                    open.setParameters(parameters2);
                    open.setPreviewCallbackWithBuffer(new C5560b());
                    open.addCallbackBuffer(m21133a(this.f15496f));
                    open.addCallbackBuffer(m21133a(this.f15496f));
                    open.addCallbackBuffer(m21133a(this.f15496f));
                    open.addCallbackBuffer(m21133a(this.f15496f));
                    return open;
                }
                throw new IOException("Could not find suitable preview frames per second range.");
            }
            throw new IOException("Could not find suitable preview size.");
        }
        throw new IOException("Could not find requested camera.");
    }

    /* renamed from: a */
    public C5558a mo15019a(SurfaceHolder surfaceHolder) {
        synchronized (this.f15492b) {
            if (this.f15493c != null) {
                return this;
            }
            this.f15493c = m21137c();
            this.f15493c.setPreviewDisplay(surfaceHolder);
            this.f15493c.startPreview();
            this.f15502l = new Thread(this.f15503m);
            this.f15503m.mo15028a(true);
            this.f15502l.start();
            this.f15501k = false;
            return this;
        }
    }

    /* renamed from: a */
    public void mo15020a() {
        synchronized (this.f15492b) {
            mo15021b();
            this.f15503m.mo15027a();
        }
    }

    /* renamed from: b */
    public void mo15021b() {
        synchronized (this.f15492b) {
            this.f15503m.mo15028a(false);
            if (this.f15502l != null) {
                try {
                    this.f15502l.join();
                } catch (InterruptedException unused) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.f15502l = null;
            }
            if (this.f15493c != null) {
                this.f15493c.stopPreview();
                this.f15493c.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                try {
                    if (this.f15501k) {
                        this.f15493c.setPreviewTexture((SurfaceTexture) null);
                    } else {
                        this.f15493c.setPreviewDisplay((SurfaceHolder) null);
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Failed to clear camera preview: ");
                    sb.append(valueOf);
                    Log.e("CameraSource", sb.toString());
                }
                this.f15493c.release();
                this.f15493c = null;
            }
            this.f15504n.clear();
        }
    }
}
