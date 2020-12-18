package com.openlife.checkme.checkme_special.home;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.BaseActivity;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4947j;
import java.util.ArrayList;
import java.util.List;
import p101d.p108c.p109a.C5197l;

public class SpMainActivity extends BaseActivity {

    /* renamed from: f */
    private List<C5197l> f14001f = new ArrayList();

    /* renamed from: a */
    private void m19278a() {
        C4947j.m19536a().mo13554e().mo13530d();
        setTitle("");
        mo12577b(true);
        mo12578c(false);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, SpMainFragment.m19312g()).commit();
    }

    /* renamed from: a */
    public static void m19279a(Activity activity) {
        activity.startActivityForResult(new Intent(activity, SpMainActivity.class), 9999);
        if (activity instanceof SpMainActivity) {
            activity.finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_main_cm_s;
    }

    public void onBackPressed() {
        C4883m.m19235b((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null || !defaultAdapter.isEnabled()) {
            defaultAdapter.enable();
        }
        m19278a();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        for (C5197l next : this.f14001f) {
            if (next != null) {
                next.dismiss();
            }
        }
        this.f14001f.clear();
    }
}
