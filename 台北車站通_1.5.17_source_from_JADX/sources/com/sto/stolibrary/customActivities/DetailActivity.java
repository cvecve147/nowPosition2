package com.sto.stolibrary.customActivities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.p011v7.app.C0623m;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.sto.stolibrary.customActivities.C5061F;
import java.util.Locale;
import org.json.JSONObject;
import p101d.p119e.p120a.p121a.C5262j;
import p101d.p191i.p192a.C5931a;
import p101d.p191i.p192a.C6005c;
import p101d.p191i.p192a.C6009d;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.p193a.C5934B;
import p101d.p191i.p192a.p200e.C6023g;

public class DetailActivity extends C0623m {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f14347d = "DetailActivity";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f14348e = "";

    /* renamed from: f */
    private String f14349f = "";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f14350g = "";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Context f14351h;

    /* renamed from: i */
    private C5934B f14352i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5931a f14353j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f14354k = 0;

    /* renamed from: com.sto.stolibrary.customActivities.DetailActivity$a */
    private class C5057a implements View.OnClickListener {
        private C5057a() {
        }

        /* synthetic */ C5057a(DetailActivity detailActivity, C5071e eVar) {
            this();
        }

        public void onClick(View view) {
            String str = (String) ((TextView) DetailActivity.this.findViewById(C6005c.detail_lot_code)).getText();
            C5061F.C5062a a = C5061F.m19898b().mo14132a();
            if (a != null) {
                a.mo5621a(DetailActivity.this.f14348e, "parking", str);
            }
        }
    }

    /* renamed from: com.sto.stolibrary.customActivities.DetailActivity$b */
    private class C5058b implements View.OnClickListener {
        private C5058b() {
        }

        /* synthetic */ C5058b(DetailActivity detailActivity, C5071e eVar) {
            this();
        }

        public void onClick(View view) {
            if (DetailActivity.this.f14354k == 2) {
                C6023g.m22858a(DetailActivity.this.f14351h, DetailActivity.this.getString(C6024f.notification_enabled));
                return;
            }
            String c = DetailActivity.this.f14353j.mo15726c(DetailActivity.this.f14350g, DetailActivity.this.f14348e);
            String d = DetailActivity.this.f14353j.mo15730d(DetailActivity.this.f14350g, DetailActivity.this.f14348e);
            C5262j jVar = new C5262j(0, c, new C5074h(this), new C5075i(this));
            C5262j jVar2 = new C5262j(0, d, new C5076j(this), new C5077k(this));
            DetailActivity.this.f14353j.mo15714a().mo15734a(jVar);
            DetailActivity.this.f14353j.mo15714a().mo15734a(jVar2);
            Log.d(DetailActivity.f14347d, c);
            Log.d(DetailActivity.f14347d, d);
        }
    }

    /* renamed from: com.sto.stolibrary.customActivities.DetailActivity$c */
    private class C5059c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private String f14357a;

        public C5059c(String str) {
            this.f14357a = str;
        }

        public void onGlobalLayout() {
            DetailActivity.this.findViewById(C6005c.detail_pay_rule).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            DetailActivity detailActivity = DetailActivity.this;
            String a = detailActivity.m19887a((TextView) detailActivity.findViewById(C6005c.detail_pay_rule), this.f14357a);
            if (!TextUtils.isEmpty(a)) {
                ((TextView) DetailActivity.this.findViewById(C6005c.detail_pay_rule)).setText(a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m19887a(TextView textView, String str) {
        String country = Locale.getDefault().getCountry();
        if (country == null) {
            country = "TW";
        }
        if (((country.compareTo("TW") != 0) & (country.compareTo("CN") != 0) & (country.compareTo("KR") != 0)) && (country.compareTo("JP") != 0)) {
            country = "EN";
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        float paddingLeft = (float) ((point.x - textView.getPaddingLeft()) - textView.getPaddingRight());
        TextPaint paint = textView.getPaint();
        String replaceAll = str.replaceAll("\r", "").replaceAll("\n", "");
        StringBuilder sb = new StringBuilder();
        if (country.compareTo("EN") == 0) {
            float f = 0.0f;
            for (int i = 0; i < replaceAll.length(); i++) {
                char charAt = replaceAll.charAt(i);
                f += paint.measureText(String.valueOf(charAt));
                if ((f > paddingLeft) && (charAt == ' ')) {
                    sb.append("\n");
                    f = 0.0f;
                } else {
                    sb.append(charAt);
                }
            }
        } else {
            float f2 = 0.0f;
            for (int i2 = 0; i2 < replaceAll.length(); i2++) {
                char charAt2 = replaceAll.charAt(i2);
                f2 += paint.measureText(String.valueOf(charAt2));
                if (f2 > paddingLeft) {
                    sb.append("\n");
                    f2 = 0.0f;
                }
                sb.append(charAt2);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m19891a(String str) {
        this.f14352i.mo15736a(this.f14348e, str, new C5072f(this), new C5073g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19892a(JSONObject jSONObject) {
        Log.d(f14347d, "data: " + jSONObject.toString());
        String string = jSONObject.getString("CheckInDate");
        String string2 = jSONObject.getString("CheckInTime");
        String string3 = jSONObject.getString("AccumulatedTime");
        String string4 = jSONObject.getString("AccumulatedFee");
        String string5 = jSONObject.getString("PayRule");
        String string6 = jSONObject.getString("ServiceTel");
        String string7 = jSONObject.getString("MonthlyRental");
        if (string7 == null) {
            string7 = "0";
        }
        boolean z = true;
        boolean z2 = string != null;
        if (string2 == null) {
            z = false;
        }
        if (z && z2) {
            ((TextView) findViewById(C6005c.detail_entry_datetime)).setText(string + " " + string2);
        }
        if (string3 != null) {
            ((TextView) findViewById(C6005c.detail_acc_time)).setText(string3);
        }
        if (string4 != null) {
            if (string7.compareTo("1") == 0) {
                ((TextView) findViewById(C6005c.detail_acc_pay)).setText(string4 + "(" + getString(C6024f.monthly_rental) + ")");
            } else {
                ((TextView) findViewById(C6005c.detail_acc_pay)).setText(string4);
            }
        }
        if (string5 != null) {
            ((TextView) findViewById(C6005c.detail_pay_rule)).setText(string5);
            findViewById(C6005c.detail_pay_rule).getViewTreeObserver().addOnGlobalLayoutListener(new C5059c(string5));
        }
        if (string6 != null) {
            ((TextView) findViewById(C6005c.detail_contact_phone)).setText(string6);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6009d.activity_detail);
        mo2624j().mo2522b(16);
        mo2624j().mo2514a(C6009d.layout_action_bar);
        ((TextView) findViewById(C6005c.action_bar_title)).setText(C6024f.vehicle_detail);
        findViewById(C6005c.action_bar_back_view).setOnClickListener(new C5071e(this));
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(Color.parseColor("#254E98"));
        this.f14348e = getIntent().getStringExtra("buildingID");
        if (this.f14348e == null) {
            Log.e(f14347d, "Empty BuildingID");
            C6023g.m22858a(this, getResources().getString(C6024f.unknown_searching_error));
            finish();
        }
        this.f14349f = getString(this.f14348e.compareTo("tms_parking_tc") == 0 ? C6024f.tc_part : C6024f.gc_part);
        this.f14351h = this;
        this.f14352i = new C5934B(this);
        this.f14353j = new C5931a(this);
        try {
            JSONObject jSONObject = new JSONObject(getIntent().getStringExtra("info"));
            this.f14350g = jSONObject.getString("LicensePlate");
            String string = jSONObject.getString("ParkingNumber");
            String string2 = jSONObject.getString("Floor");
            String string3 = jSONObject.getString("ParkingType");
            if (this.f14350g.compareTo("") == 0) {
                this.f14350g = getString(C6024f.null_info);
            }
            ((TextView) findViewById(C6005c.detail_licence)).setText(this.f14350g);
            ((TextView) findViewById(C6005c.detail_lot_code)).setText(string);
            ((TextView) findViewById(C6005c.detail_lot_type)).setText(string3);
            ((TextView) findViewById(C6005c.detail_building_id)).setText(this.f14349f + string2);
            findViewById(C6005c.detail_btn_map_guide).setOnClickListener(new C5057a(this, (C5071e) null));
            findViewById(C6005c.detail_btn_out_notify).setOnClickListener(new C5058b(this, (C5071e) null));
            m19891a(this.f14350g);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C5061F.C5062a a = C5061F.m19898b().mo14132a();
        if (a != null) {
            a.mo5619a(false);
        }
    }
}
