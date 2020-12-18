package com.openlife.checkme.activity.scanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.BaseActivity;
import java.util.ArrayList;
import java.util.List;

public class ScannerActivity extends BaseActivity {

    /* renamed from: f */
    private int f13715f;

    /* renamed from: g */
    private int f13716g;

    /* renamed from: h */
    ScannerFragment f13717h;

    /* renamed from: i */
    ArrayList<String> f13718i;

    /* renamed from: a */
    private void m18736a() {
        if (getIntent() == null) {
            finish();
        }
        this.f13715f = getIntent().getIntExtra("LAUNCH_TYPE", 0);
        this.f13716g = getIntent().getIntExtra("ID", 0);
        this.f13718i = getIntent().getStringArrayListExtra("BEACON_LIST");
    }

    /* renamed from: a */
    public static void m18737a(Activity activity, int i, int i2) {
        Intent intent = new Intent(activity, ScannerActivity.class);
        intent.putExtra("ID", i);
        intent.putExtra("LAUNCH_TYPE", i2);
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: a */
    public static void m18738a(Activity activity, int i, int i2, List<String> list) {
        Intent intent = new Intent(activity, ScannerActivity.class);
        intent.putExtra("ID", i);
        intent.putExtra("LAUNCH_TYPE", i2);
        intent.putStringArrayListExtra("BEACON_LIST", (ArrayList) list);
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: p */
    private void m18739p() {
        ScannerFragment scannerFragment;
        mo12577b(true);
        setTitle((CharSequence) null);
        int i = this.f13715f;
        if (i != 112) {
            if (i == 113) {
                scannerFragment = ScannerFragment.m18742a(this.f13716g, i);
            }
            getFragmentManager().beginTransaction().replace(C4956g.content_view, this.f13717h).commit();
        }
        scannerFragment = ScannerFragment.m18743a(this.f13716g, i, this.f13718i);
        this.f13717h = scannerFragment;
        getFragmentManager().beginTransaction().replace(C4956g.content_view, this.f13717h).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_scanner_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18736a();
        m18739p();
    }
}
