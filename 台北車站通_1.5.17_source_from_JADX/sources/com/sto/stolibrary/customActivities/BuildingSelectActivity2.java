package com.sto.stolibrary.customActivities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.p011v7.app.C0623m;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.sto.stolibrary.customActivities.C5061F;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p191i.p192a.C6005c;
import p101d.p191i.p192a.C6009d;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.p193a.C5934B;

public class BuildingSelectActivity2 extends C0623m {

    /* renamed from: d */
    private String f14338d = "BuildingSelectActivity2";

    /* renamed from: e */
    private C5934B f14339e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f14340f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f14341g = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f14342h = 1000;

    /* renamed from: com.sto.stolibrary.customActivities.BuildingSelectActivity2$a */
    private class C5053a implements View.OnClickListener {
        private C5053a() {
        }

        /* synthetic */ C5053a(BuildingSelectActivity2 buildingSelectActivity2, C5070d dVar) {
            this();
        }

        public void onClick(View view) {
            BuildingSelectActivity2 buildingSelectActivity2;
            String str;
            if (view.getId() == C6005c.func1) {
                buildingSelectActivity2 = BuildingSelectActivity2.this;
                str = "tms_parking_tc";
            } else {
                buildingSelectActivity2 = BuildingSelectActivity2.this;
                str = "tms_parking_gc";
            }
            String unused = buildingSelectActivity2.f14340f = str;
            Intent intent = new Intent(BuildingSelectActivity2.this, FunctionSelectionActivity.class);
            intent.putExtra("buildingID", BuildingSelectActivity2.this.f14340f);
            BuildingSelectActivity2.this.startActivity(intent);
            C5061F.C5062a a = C5061F.m19898b().mo14132a();
            if (a != null) {
                a.mo5620a(true, BuildingSelectActivity2.this.f14340f);
            }
        }
    }

    /* renamed from: com.sto.stolibrary.customActivities.BuildingSelectActivity2$b */
    private class C5054b implements Runnable {
        private C5054b() {
        }

        /* synthetic */ C5054b(BuildingSelectActivity2 buildingSelectActivity2, C5070d dVar) {
            this();
        }

        public void run() {
            Boolean unused = BuildingSelectActivity2.this.m19877a();
            BuildingSelectActivity2.this.f14341g.postDelayed(this, (long) BuildingSelectActivity2.this.f14342h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Boolean m19877a() {
        Log.d(this.f14338d, this.f14339e.mo15738b().toString());
        JSONObject b = this.f14339e.mo15738b();
        Boolean bool = true;
        try {
            ((TextView) findViewById(C6005c.building_selection_remain_tc)).setText(b.getString("tms_parking_tc"));
        } catch (JSONException unused) {
            ((TextView) findViewById(C6005c.building_selection_remain_tc)).setText("--");
            bool = false;
        }
        try {
            ((TextView) findViewById(C6005c.building_selection_remain_gc)).setText(b.getString("tms_parking_gc"));
        } catch (JSONException unused2) {
            ((TextView) findViewById(C6005c.building_selection_remain_gc)).setText("--");
            bool = false;
        }
        this.f14342h = !bool.booleanValue() ? 1000 : 50000;
        return bool;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6009d.activity_building_select2);
        mo2624j().mo2522b(16);
        mo2624j().mo2514a(C6009d.layout_action_bar);
        ((TextView) findViewById(C6005c.action_bar_title)).setText(C6024f.title_smart_searching);
        findViewById(C6005c.action_bar_back_view).setOnClickListener(new C5070d(this));
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(Color.parseColor("#254E98"));
        this.f14339e = new C5934B(this);
        this.f14339e.mo15739b(true, true);
        findViewById(C6005c.func1).setOnClickListener(new C5053a(this, (C5070d) null));
        findViewById(C6005c.func2).setOnClickListener(new C5053a(this, (C5070d) null));
        m19877a();
        this.f14341g.postDelayed(new C5054b(this, (C5070d) null), (long) this.f14342h);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }
}
