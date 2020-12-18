package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import p101d.p129g.p159f.p163b.p164a.C5766l;
import p101d.p129g.p159f.p163b.p164a.C5767m;

public class CaptureActivity extends Activity {

    /* renamed from: a */
    private C4149r f12163a;

    /* renamed from: b */
    private DecoratedBarcodeView f12164b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public DecoratedBarcodeView mo11570a() {
        setContentView(C5767m.zxing_capture);
        return (DecoratedBarcodeView) findViewById(C5766l.zxing_barcode_scanner);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12164b = mo11570a();
        this.f12163a = new C4149r(this, this.f12164b);
        this.f12163a.mo11719a(getIntent(), bundle);
        this.f12163a.mo11722b();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f12163a.mo11725e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f12164b.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f12163a.mo11726f();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f12163a.mo11718a(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f12163a.mo11727g();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f12163a.mo11720a(bundle);
    }
}
