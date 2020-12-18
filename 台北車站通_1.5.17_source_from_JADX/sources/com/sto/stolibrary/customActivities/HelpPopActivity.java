package com.sto.stolibrary.customActivities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import com.sto.stolibrary.customActivities.C5061F;
import p101d.p119e.p120a.p121a.C5265m;
import p101d.p191i.p192a.C5931a;
import p101d.p191i.p192a.C6005c;
import p101d.p191i.p192a.C6009d;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.p200e.C6023g;

public class HelpPopActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f14374a = "HelpPopActivity";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f14375b = "";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f14376c = "";

    /* renamed from: d */
    private String f14377d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String[] f14378e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f14379f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5063a f14380g;

    /* renamed from: com.sto.stolibrary.customActivities.HelpPopActivity$a */
    private class C5063a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Handler f14381a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f14382b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f14383c = false;

        public C5063a(int i) {
            this.f14382b = i;
            String string = HelpPopActivity.this.getString(C6024f.sos_context);
            ((TextView) HelpPopActivity.this.findViewById(C6005c.help_pop_context)).setText(string.replace("SEC", this.f14382b + ""));
            this.f14381a = new Handler();
            this.f14381a.postDelayed(new C5089w(this, HelpPopActivity.this), 1000);
        }

        /* renamed from: b */
        static /* synthetic */ int m19921b(C5063a aVar) {
            int i = aVar.f14382b;
            aVar.f14382b = i - 1;
            return i;
        }

        /* renamed from: a */
        public void mo14137a() {
            this.f14383c = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19915a(String str, String str2, String str3, String str4) {
        C5061F.C5062a a = C5061F.m19898b().mo14132a();
        if (a != null) {
            a.mo5618a();
        }
        String str5 = f14374a;
        Log.d(str5, "SOS FROM: " + str2 + "," + str3 + "," + str4 + "," + str);
        new C5931a(this).mo15714a().mo15734a(new C5265m(0, new C5931a(this).mo15724b(str, str2, str3, str4), new C5087u(this), new C5088v(this)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6009d.activity_help_pop);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(Color.parseColor("#254E98"));
        this.f14379f = this;
        this.f14375b = getIntent().getStringExtra("buildingID");
        this.f14377d = getIntent().getStringExtra("position");
        this.f14376c = getIntent().getStringExtra("floorID");
        this.f14378e = this.f14377d.split(",");
        Log.d(f14374a, this.f14377d);
        if (this.f14376c == null) {
            finish();
            C6023g.m22858a(this.f14379f, getString(C6024f.loss_loc));
            return;
        }
        findViewById(C6005c.help_pop_btn_cancel).setOnClickListener(new C5085s(this));
        findViewById(C6005c.help_pop_btn_submit).setOnClickListener(new C5086t(this));
        this.f14380g = new C5063a(5);
    }
}
