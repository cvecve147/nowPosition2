package com.openlife.checkme.activity.home;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.BaseActivity;
import com.openlife.checkme.p093c.C4883m;
import java.util.ArrayList;
import java.util.List;
import p101d.p108c.p109a.C5197l;

public class MainActivity extends BaseActivity {

    /* renamed from: f */
    private List<C5197l> f13446f = new ArrayList();

    /* renamed from: a */
    private void m18284a() {
        getFragmentManager().beginTransaction().replace(C4956g.content_view, MainFragment.m18325g()).commit();
    }

    /* renamed from: a */
    public static void m18285a(Activity activity) {
        activity.startActivityForResult(new Intent(activity, MainActivity.class), 9999);
        if (activity instanceof MainActivity) {
            activity.finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_main_cm;
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
        m18284a();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        for (C5197l next : this.f13446f) {
            if (next != null) {
                next.dismiss();
            }
        }
        this.f13446f.clear();
    }
}
