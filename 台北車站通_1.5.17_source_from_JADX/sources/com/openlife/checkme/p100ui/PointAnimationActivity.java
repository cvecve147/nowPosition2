package com.openlife.checkme.p100ui;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.openlife.checkme.C4869c;
import com.openlife.checkme.C4937d;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4960k;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4947j;
import java.util.concurrent.TimeUnit;
import p208e.p221b.C6247e;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p227d.C6242d;
import p250g.p262c.C6585c;

/* renamed from: com.openlife.checkme.ui.PointAnimationActivity */
public class PointAnimationActivity extends BaseActivity {

    /* renamed from: a */
    private C4458a f14257a = new C4458a();

    /* renamed from: b */
    MediaPlayer f14258b;

    /* renamed from: c */
    int f14259c;
    ImageView cover;

    /* renamed from: d */
    Integer[] f14260d;

    /* renamed from: e */
    C6585c f14261e;

    /* renamed from: f */
    private C6223b f14262f;
    TextView pointTv;

    /* renamed from: a */
    private void m19813a() {
        if (getIntent() == null) {
            finish();
        }
        this.f14259c = getIntent().getIntExtra("POINT", 0);
        this.f14260d = C4883m.m19230a(getResources(), C4937d.point_animation_array);
    }

    /* renamed from: a */
    public static void m19814a(Activity activity, int i) {
        Intent intent = new Intent(activity, PointAnimationActivity.class);
        intent.putExtra("POINT", i);
        activity.startActivityForResult(intent, 101);
        activity.overridePendingTransition(C4869c.bg_fade_in, C4869c.bg_fade_out);
    }

    /* renamed from: p */
    private void m19815p() {
        if (C4947j.m19536a().mo13554e().mo13527c() != 2) {
            this.pointTv.setText(getString(C4961l.g_p_getpoint, new Object[]{Integer.valueOf(this.f14259c)}));
        } else {
            this.pointTv.setVisibility(4);
        }
        this.f14258b = MediaPlayer.create(this, C4960k.coin);
        this.cover.setImageResource(this.f14260d[0].intValue());
    }

    /* renamed from: q */
    private void m19816q() {
        this.f14262f = C6247e.m23536a(100, TimeUnit.MILLISECONDS, C6216b.m23500a()).mo16356d().mo16344a((C6242d<? super C6585c>) new C5032p(this)).mo16347a(C6216b.m23500a()).mo16351b(new C5031o(this));
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C4869c.bg_fade_in, C4869c.bg_fade_out);
        this.f14258b.release();
        this.f14257a.mo12585a();
        C6223b bVar = this.f14262f;
        if (bVar != null) {
            bVar.mo15709a();
        }
        this.f14262f = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.view_point_animation_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m19813a();
        m19815p();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m19816q();
    }
}
