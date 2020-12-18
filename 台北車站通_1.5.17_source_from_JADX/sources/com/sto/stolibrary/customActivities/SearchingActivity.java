package com.sto.stolibrary.customActivities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.p011v7.app.C0623m;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import p101d.p191i.p192a.C5982b;
import p101d.p191i.p192a.C6005c;
import p101d.p191i.p192a.C6009d;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.p193a.C5934B;

public class SearchingActivity extends C0623m {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f14396d = "SearchingActivity";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5934B f14397e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f14398f = "lpr";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f14399g = "";

    /* renamed from: com.sto.stolibrary.customActivities.SearchingActivity$a */
    private class C5066a implements View.OnClickListener {
        private C5066a() {
        }

        /* synthetic */ C5066a(SearchingActivity searchingActivity, C5092z zVar) {
            this();
        }

        public void onClick(View view) {
            String obj = ((EditText) SearchingActivity.this.findViewById(C6005c.building_selection_keyword)).getText().toString();
            Log.d(SearchingActivity.f14396d, "BuildingID: " + SearchingActivity.this.f14399g + ", SearchType: " + SearchingActivity.this.f14398f + ", keyword: " + obj);
            if (obj.length() == 0) {
                SearchingActivity searchingActivity = SearchingActivity.this;
                Toast.makeText(searchingActivity, searchingActivity.getString(C6024f.null_keyword), 0).show();
                return;
            }
            boolean z = true;
            if ((SearchingActivity.this.f14398f == "lpr") && (obj.length() < 3)) {
                SearchingActivity searchingActivity2 = SearchingActivity.this;
                Toast.makeText(searchingActivity2, searchingActivity2.getString(C6024f.hint_car_licence), 0).show();
                return;
            }
            boolean z2 = SearchingActivity.this.f14398f == "pnr";
            if (obj.length() >= 2) {
                z = false;
            }
            if (z2 && z) {
                SearchingActivity searchingActivity3 = SearchingActivity.this;
                Toast.makeText(searchingActivity3, searchingActivity3.getString(C6024f.hint_lot_code), 0).show();
                return;
            }
            SearchingActivity.this.f14397e.mo15737a(SearchingActivity.this.f14399g, SearchingActivity.this.f14398f, obj, new C5056D(this), new C5060E(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19938a(String str) {
        EditText editText;
        int i;
        if (str.compareTo("lot") == 0) {
            this.f14398f = "pnr";
            ((ImageView) findViewById(C6005c.searching_type_btn_lot)).setImageResource(C5982b.icon_parkinggrid_white);
            ((TextView) findViewById(C6005c.searching_type_btn_lot_text)).setTextColor(Color.parseColor("#FFFFFF"));
            findViewById(C6005c.serarching_container_lot).setBackgroundResource(C5982b.shape_rectangle_blue_stroke);
            ((ImageView) findViewById(C6005c.searching_type_btn_licence)).setImageResource(C5982b.icon_carlicense_blue);
            ((TextView) findViewById(C6005c.searching_type_btn_licence_text)).setTextColor(Color.parseColor("#000000"));
            findViewById(C6005c.serarching_container_licence).setBackgroundResource(C5982b.shape_rectangle_white_stroke);
            ((EditText) findViewById(C6005c.building_selection_keyword)).setText("");
            ((EditText) findViewById(C6005c.building_selection_keyword)).setHint(C6024f.hint_lot_code);
            editText = (EditText) findViewById(C6005c.building_selection_keyword);
            i = 3;
        } else {
            this.f14398f = "lpr";
            ((ImageView) findViewById(C6005c.searching_type_btn_lot)).setImageResource(C5982b.icon_parkinggrid_blue);
            ((TextView) findViewById(C6005c.searching_type_btn_lot_text)).setTextColor(Color.parseColor("#000000"));
            findViewById(C6005c.serarching_container_lot).setBackgroundResource(C5982b.shape_rectangle_white_stroke);
            ((ImageView) findViewById(C6005c.searching_type_btn_licence)).setImageResource(C5982b.icon_carlicense_white);
            ((TextView) findViewById(C6005c.searching_type_btn_licence_text)).setTextColor(Color.parseColor("#FFFFFF"));
            findViewById(C6005c.serarching_container_licence).setBackgroundResource(C5982b.shape_rectangle_blue_stroke);
            ((EditText) findViewById(C6005c.building_selection_keyword)).setText("");
            ((EditText) findViewById(C6005c.building_selection_keyword)).setHint(C6024f.hint_car_licence);
            editText = (EditText) findViewById(C6005c.building_selection_keyword);
            i = 4097;
        }
        editText.setInputType(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6009d.activity_searching);
        mo2624j().mo2522b(16);
        mo2624j().mo2514a(C6009d.layout_action_bar);
        ((TextView) findViewById(C6005c.action_bar_title)).setText(getString(C6024f.search_car2));
        findViewById(C6005c.action_bar_back_view).setOnClickListener(new C5092z(this));
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(Color.parseColor("#254E98"));
        this.f14399g = getIntent().getStringExtra("buildingID");
        if (this.f14399g == null) {
            finish();
        }
        m19938a("lot");
        findViewById(C6005c.serarching_container_lot).setOnClickListener(new C5046A(this));
        findViewById(C6005c.serarching_container_licence).setOnClickListener(new C5047B(this));
        this.f14397e = new C5934B(this);
        this.f14397e.mo15739b(true, true);
        findViewById(C6005c.searching_confirm_btn).setOnClickListener(new C5066a(this, (C5092z) null));
        findViewById(C6005c.activity_container).addOnLayoutChangeListener(new C5055C(this));
    }
}
