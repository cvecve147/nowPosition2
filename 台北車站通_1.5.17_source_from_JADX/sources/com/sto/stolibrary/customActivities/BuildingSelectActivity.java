package com.sto.stolibrary.customActivities;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.p011v7.app.C0623m;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.sto.stolibrary.customActivities.C5061F;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p191i.p192a.C5982b;
import p101d.p191i.p192a.C6005c;
import p101d.p191i.p192a.C6009d;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.p193a.C5934B;

public class BuildingSelectActivity extends C0623m {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f14327d = "BuildingSelection";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f14328e = "tms_parking_tc";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f14329f = "lpr";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5934B f14330g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f14331h = 10000;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f14332i = new Handler();

    /* renamed from: com.sto.stolibrary.customActivities.BuildingSelectActivity$a */
    private class C5048a implements View.OnClickListener {
        private C5048a() {
        }

        /* synthetic */ C5048a(BuildingSelectActivity buildingSelectActivity, C5067a aVar) {
            this();
        }

        public void onClick(View view) {
            BuildingSelectActivity buildingSelectActivity;
            String str;
            BuildingSelectActivity.this.findViewById(C6005c.building_selection_tc_select_btn).setBackgroundResource(0);
            BuildingSelectActivity.this.findViewById(C6005c.building_selection_gc_select_btn).setBackgroundResource(0);
            view.setBackgroundResource(C5982b.selsct_red_l);
            if (view.getId() == C6005c.building_selection_tc_select_btn) {
                buildingSelectActivity = BuildingSelectActivity.this;
                str = "tms_parking_tc";
            } else {
                buildingSelectActivity = BuildingSelectActivity.this;
                str = "tms_parking_gc";
            }
            String unused = buildingSelectActivity.f14328e = str;
        }
    }

    /* renamed from: com.sto.stolibrary.customActivities.BuildingSelectActivity$b */
    private class C5049b implements View.OnClickListener {
        private C5049b() {
        }

        /* synthetic */ C5049b(BuildingSelectActivity buildingSelectActivity, C5067a aVar) {
            this();
        }

        public void onClick(View view) {
            String str = view.getId() == C6005c.building_selection_tc_map_guide_btn ? "tms_parking_tc" : "tms_parking_gc";
            C5061F.C5062a a = C5061F.m19898b().mo14132a();
            if (a != null) {
                a.mo5621a(str, "", (String) null);
            }
        }
    }

    /* renamed from: com.sto.stolibrary.customActivities.BuildingSelectActivity$c */
    private class C5050c implements View.OnClickListener {
        private C5050c() {
        }

        /* synthetic */ C5050c(BuildingSelectActivity buildingSelectActivity, C5067a aVar) {
            this();
        }

        public void onClick(View view) {
            BuildingSelectActivity buildingSelectActivity;
            String str;
            ((TextView) BuildingSelectActivity.this.findViewById(C6005c.building_selection_search_type_lot_code)).setTypeface((Typeface) null, 0);
            ((TextView) BuildingSelectActivity.this.findViewById(C6005c.building_selection_search_type_licence)).setTypeface((Typeface) null, 0);
            ((TextView) view).setTypeface((Typeface) null, 1);
            if (view.getId() == C6005c.building_selection_search_type_licence) {
                ((EditText) BuildingSelectActivity.this.findViewById(C6005c.building_selection_keyword)).setText("");
                ((EditText) BuildingSelectActivity.this.findViewById(C6005c.building_selection_keyword)).setHint(C6024f.hint_car_licence);
                ((EditText) BuildingSelectActivity.this.findViewById(C6005c.building_selection_keyword)).setInputType(4097);
                buildingSelectActivity = BuildingSelectActivity.this;
                str = "lpr";
            } else {
                ((EditText) BuildingSelectActivity.this.findViewById(C6005c.building_selection_keyword)).setText("");
                ((EditText) BuildingSelectActivity.this.findViewById(C6005c.building_selection_keyword)).setHint(C6024f.hint_lot_code);
                ((EditText) BuildingSelectActivity.this.findViewById(C6005c.building_selection_keyword)).setInputType(3);
                buildingSelectActivity = BuildingSelectActivity.this;
                str = "pnr";
            }
            String unused = buildingSelectActivity.f14329f = str;
        }
    }

    /* renamed from: com.sto.stolibrary.customActivities.BuildingSelectActivity$d */
    private class C5051d implements View.OnClickListener {
        private C5051d() {
        }

        /* synthetic */ C5051d(BuildingSelectActivity buildingSelectActivity, C5067a aVar) {
            this();
        }

        public void onClick(View view) {
            String obj = ((EditText) BuildingSelectActivity.this.findViewById(C6005c.building_selection_keyword)).getText().toString();
            String a = BuildingSelectActivity.f14327d;
            Log.d(a, "BuildingID: " + BuildingSelectActivity.this.f14328e + ", SearchType: " + BuildingSelectActivity.this.f14329f + ", keyword: " + obj);
            if (obj.length() == 0) {
                BuildingSelectActivity buildingSelectActivity = BuildingSelectActivity.this;
                Toast.makeText(buildingSelectActivity, buildingSelectActivity.getString(C6024f.null_keyword), 0).show();
                return;
            }
            BuildingSelectActivity.this.f14330g.mo15737a(BuildingSelectActivity.this.f14328e, BuildingSelectActivity.this.f14329f, obj, new C5068b(this), new C5069c(this));
        }
    }

    /* renamed from: com.sto.stolibrary.customActivities.BuildingSelectActivity$e */
    private class C5052e implements Runnable {
        private C5052e() {
        }

        /* synthetic */ C5052e(BuildingSelectActivity buildingSelectActivity, C5067a aVar) {
            this();
        }

        public void run() {
            Boolean unused = BuildingSelectActivity.this.m19876m();
            BuildingSelectActivity.this.f14332i.postDelayed(this, (long) BuildingSelectActivity.this.f14331h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public Boolean m19876m() {
        Log.d(f14327d, this.f14330g.mo15738b().toString());
        JSONObject b = this.f14330g.mo15738b();
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
        this.f14331h = !bool.booleanValue() ? 1000 : 10000;
        return bool;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6009d.activity_building_select);
        mo2624j().mo2522b(16);
        mo2624j().mo2514a(C6009d.layout_action_bar);
        ((TextView) findViewById(C6005c.action_bar_title)).setText(C6024f.title_smart_searching);
        findViewById(C6005c.action_bar_back_view).setOnClickListener(new C5067a(this));
        this.f14330g = new C5934B(this);
        this.f14330g.mo15739b(true, true);
        findViewById(C6005c.building_selection_search_btn).setOnClickListener(new C5051d(this, (C5067a) null));
        findViewById(C6005c.building_selection_tc_select_btn).setOnClickListener(new C5048a(this, (C5067a) null));
        findViewById(C6005c.building_selection_gc_select_btn).setOnClickListener(new C5048a(this, (C5067a) null));
        findViewById(C6005c.building_selection_search_type_licence).setOnClickListener(new C5050c(this, (C5067a) null));
        findViewById(C6005c.building_selection_search_type_lot_code).setOnClickListener(new C5050c(this, (C5067a) null));
        findViewById(C6005c.building_selection_tc_map_guide_btn).setOnClickListener(new C5049b(this, (C5067a) null));
        findViewById(C6005c.building_selection_gc_map_guide_btn).setOnClickListener(new C5049b(this, (C5067a) null));
        m19876m();
        this.f14332i.postDelayed(new C5052e(this, (C5067a) null), (long) this.f14331h);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C5061F.C5062a a = C5061F.m19898b().mo14132a();
        if (a != null) {
            a.mo5620a(false, "");
        }
    }
}
