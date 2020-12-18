package com.sto.stolibrary.customActivities;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p011v7.app.C0623m;
import android.util.Log;
import android.widget.TextView;
import org.json.JSONObject;
import p000a.p001a.p002a.C0006e;
import p000a.p001a.p002a.C0007f;
import p101d.p191i.p192a.C5931a;
import p101d.p191i.p192a.C6005c;
import p101d.p191i.p192a.C6009d;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.p193a.C5979x;
import p101d.p191i.p192a.p200e.C6019c;
import p101d.p191i.p192a.p200e.C6023g;

public class FunctionSelectionActivity extends C0623m {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f14367d = "FuncSelectAct";

    /* renamed from: e */
    private Context f14368e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f14369f = "";

    /* renamed from: g */
    private String f14370g = "";

    /* renamed from: h */
    private C5979x f14371h;

    /* renamed from: i */
    private C0007f f14372i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6019c f14373j = new C6019c();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(C6009d.activity_function_selection);
        mo2624j().mo2522b(16);
        mo2624j().mo2514a(C6009d.layout_action_bar);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(Color.parseColor("#254E98"));
        this.f14369f = getIntent().getStringExtra("buildingID");
        if (this.f14369f == null) {
            Log.e(f14367d, "Empty BuildingID");
            C6023g.m22858a(this, getResources().getString(C6024f.unknown_searching_error));
            finish();
        }
        if (this.f14369f.compareTo("tms_parking_tc") == 0) {
            i = C6024f.tc_part;
        } else if (this.f14369f.compareTo("tms_parking_gc") == 0) {
            i = C6024f.gc_part;
        } else {
            finish();
            JSONObject f = new C5931a(this).mo15732f(this.f14369f);
            ((TextView) findViewById(C6005c.action_bar_title)).setText(this.f14370g);
            findViewById(C6005c.action_bar_back_view).setOnClickListener(new C5078l(this));
            this.f14368e = this;
            this.f14372i = new C5079m(this, f);
            findViewById(C6005c.func1).setOnClickListener(new C5080n(this));
            findViewById(C6005c.func2).setOnClickListener(new C5081o(this));
            findViewById(C6005c.func3).setOnClickListener(new C5082p(this));
            findViewById(C6005c.func4).setOnClickListener(new C5083q(this));
            findViewById(C6005c.func1).getViewTreeObserver().addOnPreDrawListener(new C5084r(this));
        }
        this.f14370g = getString(i);
        JSONObject f2 = new C5931a(this).mo15732f(this.f14369f);
        ((TextView) findViewById(C6005c.action_bar_title)).setText(this.f14370g);
        findViewById(C6005c.action_bar_back_view).setOnClickListener(new C5078l(this));
        this.f14368e = this;
        this.f14372i = new C5079m(this, f2);
        findViewById(C6005c.func1).setOnClickListener(new C5080n(this));
        findViewById(C6005c.func2).setOnClickListener(new C5081o(this));
        findViewById(C6005c.func3).setOnClickListener(new C5082p(this));
        findViewById(C6005c.func4).setOnClickListener(new C5083q(this));
        findViewById(C6005c.func1).getViewTreeObserver().addOnPreDrawListener(new C5084r(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f14371h.mo15804a((Boolean) false);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f14371h == null) {
            this.f14371h = new C5979x(this.f14368e, this.f14369f, this.f14372i, (C0006e) null);
        }
        this.f14371h.mo15806b();
        this.f14371h.mo15803a(this.f14372i);
    }
}
