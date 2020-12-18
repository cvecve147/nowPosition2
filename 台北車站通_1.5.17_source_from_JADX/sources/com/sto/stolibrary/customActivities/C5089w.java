package com.sto.stolibrary.customActivities;

import android.widget.TextView;
import com.sto.stolibrary.customActivities.HelpPopActivity;
import p101d.p191i.p192a.C6005c;
import p101d.p191i.p192a.C6024f;

/* renamed from: com.sto.stolibrary.customActivities.w */
class C5089w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ HelpPopActivity f14424a;

    /* renamed from: b */
    final /* synthetic */ HelpPopActivity.C5063a f14425b;

    C5089w(HelpPopActivity.C5063a aVar, HelpPopActivity helpPopActivity) {
        this.f14425b = aVar;
        this.f14424a = helpPopActivity;
    }

    public void run() {
        HelpPopActivity.C5063a.m19921b(this.f14425b);
        String string = HelpPopActivity.this.getString(C6024f.sos_context);
        ((TextView) HelpPopActivity.this.findViewById(C6005c.help_pop_context)).setText(string.replace("SEC", this.f14425b.f14382b + ""));
        if (!this.f14425b.f14383c) {
            if (this.f14425b.f14382b != 0) {
                this.f14425b.f14381a.postDelayed(this, 1000);
                return;
            }
            HelpPopActivity helpPopActivity = HelpPopActivity.this;
            helpPopActivity.m19915a(helpPopActivity.f14375b, HelpPopActivity.this.f14378e[0], HelpPopActivity.this.f14378e[1], HelpPopActivity.this.f14376c);
            HelpPopActivity.this.finish();
        }
    }
}
