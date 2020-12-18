package com.openlife.checkme.activity.guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.BaseActivity;

public class GuideActivity extends BaseActivity {

    /* renamed from: f */
    private int f13410f;

    /* renamed from: g */
    private C4616a f13411g;

    /* renamed from: com.openlife.checkme.activity.guide.GuideActivity$a */
    public interface C4616a {
        /* renamed from: a */
        void mo12853a();
    }

    /* renamed from: a */
    private void m18192a() {
        if (getIntent() == null) {
            finish();
        }
        this.f13410f = getIntent().getIntExtra("LAUNCH_TYPE", 22);
    }

    /* renamed from: a */
    public static void m18193a(Activity activity) {
        Intent intent = new Intent(activity, GuideActivity.class);
        intent.putExtra("LAUNCH_TYPE", 23);
        activity.startActivity(intent);
    }

    /* renamed from: b */
    public static void m18194b(Activity activity) {
        Intent intent = new Intent(activity, GuideActivity.class);
        intent.setFlags(1073741824);
        intent.putExtra("LAUNCH_TYPE", 22);
        activity.startActivity(intent);
    }

    /* renamed from: p */
    private void m18195p() {
        getFragmentManager().beginTransaction().replace(C4956g.content_view, GuideFragment.m18203h(this.f13410f)).commit();
    }

    /* renamed from: a */
    public void mo12852a(C4616a aVar) {
        this.f13411g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_guide_cm;
    }

    public void onBackPressed() {
        C4616a aVar = this.f13411g;
        if (aVar != null) {
            aVar.mo12853a();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18192a();
        m18195p();
    }
}
