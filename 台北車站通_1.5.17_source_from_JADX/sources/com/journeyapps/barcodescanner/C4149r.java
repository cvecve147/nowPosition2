package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.p007v4.app.C0308b;
import android.util.Log;
import com.journeyapps.barcodescanner.C4140j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p129g.p159f.C5918n;
import p101d.p129g.p159f.p163b.p164a.C5758e;
import p101d.p129g.p159f.p163b.p164a.C5763j;
import p101d.p129g.p159f.p163b.p164a.C5769o;

/* renamed from: com.journeyapps.barcodescanner.r */
public class C4149r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f12316a = "r";

    /* renamed from: b */
    private static int f12317b = 250;

    /* renamed from: c */
    private Activity f12318c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public DecoratedBarcodeView f12319d;

    /* renamed from: e */
    private int f12320e = -1;

    /* renamed from: f */
    private boolean f12321f = false;

    /* renamed from: g */
    private boolean f12322g = false;

    /* renamed from: h */
    private C5763j f12323h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5758e f12324i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f12325j;

    /* renamed from: k */
    private C4107a f12326k = new C4143l(this);

    /* renamed from: l */
    private final C4140j.C4141a f12327l = new C4144m(this);

    /* renamed from: m */
    private boolean f12328m = false;

    public C4149r(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        this.f12318c = activity;
        this.f12319d = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().mo11691a(this.f12327l);
        this.f12325j = new Handler();
        this.f12323h = new C5763j(activity, new C4145n(this));
        this.f12324i = new C5758e(activity);
    }

    /* renamed from: a */
    public static Intent m16553a(C4132b bVar, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", bVar.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", bVar.mo11672a().toString());
        byte[] c = bVar.mo11674c();
        if (c != null && c.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", c);
        }
        Map<C5918n, Object> d = bVar.mo11675d();
        if (d != null) {
            if (d.containsKey(C5918n.UPC_EAN_EXTENSION)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", d.get(C5918n.UPC_EAN_EXTENSION).toString());
            }
            Number number = (Number) d.get(C5918n.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) d.get(C5918n.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable<byte[]> iterable = (Iterable) d.get(C5918n.BYTE_SEGMENTS);
            if (iterable != null) {
                int i = 0;
                for (byte[] putExtra : iterable) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i, putExtra);
                    i++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    /* renamed from: b */
    private String m16557b(C4132b bVar) {
        if (this.f12321f) {
            Bitmap b = bVar.mo11673b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f12318c.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                b.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e) {
                String str = f12316a;
                Log.w(str, "Unable to create temporary file and store bitmap! " + e);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m16560i() {
        this.f12318c.finish();
    }

    @TargetApi(23)
    /* renamed from: j */
    private void m16561j() {
        if (C1006a.m5387a((Context) this.f12318c, "android.permission.CAMERA") == 0) {
            this.f12319d.mo11585b();
        } else if (!this.f12328m) {
            C0308b.m1391a(this.f12318c, new String[]{"android.permission.CAMERA"}, f12317b);
            this.f12328m = true;
        }
    }

    /* renamed from: a */
    public void mo11718a(int i, String[] strArr, int[] iArr) {
        if (i != f12317b) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            mo11723c();
        } else {
            this.f12319d.mo11585b();
        }
    }

    /* renamed from: a */
    public void mo11719a(Intent intent, Bundle bundle) {
        this.f12318c.getWindow().addFlags(128);
        if (bundle != null) {
            this.f12320e = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                mo11724d();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f12319d.mo11583a(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f12324i.mo15353a(false);
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f12325j.postDelayed(new C4146o(this), intent.getLongExtra("TIMEOUT", 0));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f12321f = true;
            }
        }
    }

    /* renamed from: a */
    public void mo11720a(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f12320e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11721a(C4132b bVar) {
        this.f12318c.setResult(-1, m16553a(bVar, m16557b(bVar)));
        m16560i();
    }

    /* renamed from: b */
    public void mo11722b() {
        this.f12319d.mo11584a(this.f12326k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11723c() {
        if (!this.f12318c.isFinishing() && !this.f12322g) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f12318c);
            builder.setTitle(this.f12318c.getString(C5769o.zxing_app_name));
            builder.setMessage(this.f12318c.getString(C5769o.zxing_msg_camera_framework_bug));
            builder.setPositiveButton(C5769o.zxing_button_ok, new C4147p(this));
            builder.setOnCancelListener(new C4148q(this));
            builder.show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11724d() {
        if (this.f12320e == -1) {
            int rotation = this.f12318c.getWindowManager().getDefaultDisplay().getRotation();
            int i = this.f12318c.getResources().getConfiguration().orientation;
            int i2 = 0;
            if (i == 2) {
                if (!(rotation == 0 || rotation == 1)) {
                    i2 = 8;
                }
            } else if (i == 1) {
                i2 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f12320e = i2;
        }
        this.f12318c.setRequestedOrientation(this.f12320e);
    }

    /* renamed from: e */
    public void mo11725e() {
        this.f12322g = true;
        this.f12323h.mo15358b();
    }

    /* renamed from: f */
    public void mo11726f() {
        this.f12319d.mo11582a();
        this.f12323h.mo15358b();
    }

    /* renamed from: g */
    public void mo11727g() {
        if (Build.VERSION.SDK_INT >= 23) {
            m16561j();
        } else {
            this.f12319d.mo11585b();
        }
        this.f12323h.mo15359c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo11728h() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f12318c.setResult(0, intent);
        m16560i();
    }
}
