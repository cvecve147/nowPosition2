package com.openlife.checkme.activity.exploration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;

public class ExplorationActivity extends BaseActivity {

    /* renamed from: f */
    private int f13274f;

    /* renamed from: g */
    private String f13275g;

    /* renamed from: a */
    private void m17960a() {
        this.f13274f = getIntent().getIntExtra("ID", -1);
        this.f13275g = getIntent().getStringExtra("LAUNCH_API_TYPE");
    }

    /* renamed from: a */
    public static void m17961a(Activity activity) {
        Intent intent = new Intent(activity, ExplorationActivity.class);
        intent.putExtra("LAUNCH_API_TYPE", "SURROUND");
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: a */
    public static void m17962a(Activity activity, String str, int i) {
        Intent intent = new Intent(activity, ExplorationActivity.class);
        intent.putExtra("ID", i);
        intent.putExtra("LAUNCH_API_TYPE", str);
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: p */
    private void m17963p() {
        setTitle(C4961l.exploration_title);
        int i = this.f13274f;
        getFragmentManager().beginTransaction().replace(C4956g.content_view, i == -1 ? ExplorationFragment.m17978a(this.f13275g) : ExplorationFragment.m17984b(this.f13275g, i)).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_exploration_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m17960a();
        m17963p();
    }
}
