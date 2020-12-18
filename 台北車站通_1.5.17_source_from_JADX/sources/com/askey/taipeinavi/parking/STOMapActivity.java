package com.askey.taipeinavi.parking;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p011v7.app.C0623m;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.askey.taipeinavi.R;
import com.sto.stolibrary.customActivities.C5061F;
import com.sto.stolibrary.customActivities.HelpPopActivity;
import p101d.p191i.p192a.p193a.C5975w;
import p101d.p191i.p192a.p200e.C6023g;

public class STOMapActivity extends C0623m {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f4513d = "STOMapActivity";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f4514e = "";

    /* renamed from: f */
    private String f4515f = "";

    /* renamed from: g */
    private String f4516g = "";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C5975w f4517h;

    /* renamed from: com.askey.taipeinavi.parking.STOMapActivity$a */
    private class C1267a implements View.OnClickListener {
        private C1267a() {
        }

        /* synthetic */ C1267a(STOMapActivity sTOMapActivity, C1272c cVar) {
            this();
        }

        public void onClick(View view) {
            Log.d(STOMapActivity.f4513d, "SOS");
            Intent intent = new Intent(STOMapActivity.this, HelpPopActivity.class);
            intent.putExtra("buildingID", STOMapActivity.this.f4514e);
            intent.putExtra("position", STOMapActivity.this.f4517h.getCurrentPos().mo15922g());
            intent.putExtra("floorID", STOMapActivity.this.f4517h.getCurrentPos().mo15918c());
            STOMapActivity.this.startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        StringBuilder sb;
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_stomap);
        this.f4514e = getIntent().getStringExtra("buildingID");
        this.f4515f = getIntent().getStringExtra("lotCode");
        this.f4516g = getIntent().getStringExtra("mode");
        if (this.f4516g == null) {
            this.f4516g = "";
        }
        if (this.f4514e == null) {
            Log.e(f4513d, "Empty BuildingID");
            C6023g.m22858a(this, getResources().getString(R.string.unknown_searching_error));
            finish();
        }
        if (this.f4514e.compareTo("tms_parking_tc") == 0) {
            sb = new StringBuilder();
            i = R.string.tc_part;
        } else {
            sb = new StringBuilder();
            i = R.string.gc_part;
        }
        sb.append(getString(i));
        sb.append(getString(R.string.under_ground));
        String sb2 = sb.toString();
        mo2624j().mo2522b(16);
        mo2624j().mo2514a((int) R.layout.layout_action_bar);
        ((TextView) findViewById(R.id.action_bar_title)).setText(sb2);
        findViewById(R.id.action_bar_back_view).setOnClickListener(new C1272c(this));
        getWindow().setStatusBarColor(Color.parseColor("#254E98"));
        this.f4517h = new C5975w(this, this.f4514e, this.f4516g);
        this.f4517h.mo15795a((C5975w.C5976a) new C1273d(this));
        this.f4517h.setContainer((ConstraintLayout) findViewById(R.id.container));
        String str = this.f4515f;
        if (str != null) {
            this.f4517h.setDestination(str);
        }
        findViewById(R.id.stomap_sos_btn).setOnClickListener(new C1267a(this, (C1272c) null));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C5061F.C5062a a = C5061F.m19898b().mo14132a();
        if (a != null) {
            a.mo5621a((String) null, (String) null, (String) null);
        }
        this.f4517h.mo15796a((Boolean) false);
    }
}
