package com.openlife.checkme.activity.mission.list;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;
import com.openlife.checkme.p094d.C4947j;

public class MissionListActivity extends BaseActivity {

    /* renamed from: a */
    MissionListFragment f13640a;

    /* renamed from: b */
    private int f13641b;

    /* renamed from: c */
    private int f13642c;
    ImageButton mode;
    Button store;

    /* renamed from: a */
    private void m18612a() {
        int i;
        String queryParameter;
        if (getIntent() == null) {
            finish();
        }
        Uri data = getIntent().getData();
        if (data == null) {
            i = getIntent().getIntExtra("id", 0);
        } else if (!data.getHost().equals(getString(C4961l.host_assignment)) || !data.getPath().equals(getString(C4961l.path_corp)) || (queryParameter = data.getQueryParameter("id")) == null || queryParameter.isEmpty()) {
            finish();
            this.f13642c = getIntent().getIntExtra("DISPLAY_MODE", 111);
        } else {
            i = Integer.parseInt(queryParameter);
        }
        this.f13641b = i;
        this.f13642c = getIntent().getIntExtra("DISPLAY_MODE", 111);
    }

    /* renamed from: a */
    public static void m18613a(Activity activity, int i) {
        Intent intent = new Intent(activity, MissionListActivity.class);
        intent.putExtra("id", i);
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: a */
    public static void m18614a(Activity activity, int i, int i2) {
        Intent intent = new Intent(activity, MissionListActivity.class);
        intent.putExtra("id", i);
        intent.putExtra("DISPLAY_MODE", i2);
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: d */
    private void m18615d(boolean z) {
        setTitle((CharSequence) null);
        mo12577b(true);
        mo12578c(z);
        m18616p();
        this.store.setClickable(false);
        this.f13640a = MissionListFragment.m18641a(this.f13641b, z, this.f13642c);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, this.f13640a).commit();
    }

    /* renamed from: p */
    private void m18616p() {
        int i;
        ImageButton imageButton;
        switch (this.f13642c) {
            case 111:
                imageButton = this.mode;
                i = C4959j.icon_list_medium;
                break;
            case 112:
                imageButton = this.mode;
                i = C4959j.icon_list_large;
                break;
            case 113:
                imageButton = this.mode;
                i = C4959j.icon_list_small;
                break;
            default:
                return;
        }
        imageButton.setImageResource(i);
    }

    /* renamed from: a */
    public void mo13088a(String str) {
        this.store.setText(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_mission_list_cm;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        MissionListFragment missionListFragment = this.f13640a;
        if (missionListFragment != null) {
            missionListFragment.onActivityResult(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18612a();
        boolean booleanExtra = getIntent().getBooleanExtra("SHOW_TITLE_BAR", false);
        if (C4947j.m19536a().mo13554e().mo13527c() == 3) {
            booleanExtra = false;
        }
        m18615d(booleanExtra);
    }

    /* access modifiers changed from: package-private */
    public void onModeClick() {
        int i;
        switch (this.f13642c) {
            case 111:
                i = 113;
                break;
            case 112:
                i = 111;
                break;
            case 113:
                i = 112;
                break;
            default:
                this.f13640a.mo13099a(this.f13642c);
                m18616p();
        }
        this.f13642c = i;
        this.f13640a.mo13099a(this.f13642c);
        m18616p();
    }
}
