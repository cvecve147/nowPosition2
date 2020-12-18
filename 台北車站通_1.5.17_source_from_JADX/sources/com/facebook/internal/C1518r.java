package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.support.p007v4.app.C0336i;
import android.support.p007v4.app.C0344n;
import com.facebook.C1574p;
import com.facebook.C1601x;
import com.facebook.internal.C1496ha;

/* renamed from: com.facebook.internal.r */
public class C1518r extends C0336i {

    /* renamed from: fa */
    private Dialog f5205fa;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7069a(Bundle bundle, C1574p pVar) {
        C0344n a = mo1337a();
        a.setResult(pVar == null ? -1 : 0, C1461S.m6857a(a.getIntent(), bundle, pVar));
        a.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m7072o(Bundle bundle) {
        C0344n a = mo1337a();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        a.setResult(-1, intent);
        a.finish();
    }

    /* renamed from: M */
    public void mo1293M() {
        if (mo1304ea() != null && mo1417u()) {
            mo1304ea().setDismissMessage((Message) null);
        }
        super.mo1293M();
    }

    /* renamed from: P */
    public void mo1327P() {
        super.mo1327P();
        Dialog dialog = this.f5205fa;
        if (dialog instanceof C1496ha) {
            ((C1496ha) dialog).mo6204d();
        }
    }

    /* renamed from: a */
    public void mo6242a(Dialog dialog) {
        this.f5205fa = dialog;
    }

    /* renamed from: c */
    public void mo1301c(Bundle bundle) {
        C1496ha haVar;
        String str;
        super.mo1301c(bundle);
        if (this.f5205fa == null) {
            C0344n a = mo1337a();
            Bundle b = C1461S.m6868b(a.getIntent());
            if (!b.getBoolean("is_fallback", false)) {
                String string = b.getString("action");
                Bundle bundle2 = b.getBundle("params");
                if (C1480ba.m6958b(string)) {
                    str = "Cannot start a WebDialog with an empty/missing 'actionName'";
                } else {
                    C1496ha.C1497a aVar = new C1496ha.C1497a(a, string, bundle2);
                    aVar.mo6212a(new C1516p(this));
                    haVar = aVar.mo6213a();
                    this.f5205fa = haVar;
                    return;
                }
            } else {
                String string2 = b.getString("url");
                if (C1480ba.m6958b(string2)) {
                    str = "Cannot start a fallback WebDialog with an empty/missing 'url'";
                } else {
                    C1524x xVar = new C1524x(a, string2, String.format("fb%s://bridge/", new Object[]{C1601x.m7389c()}));
                    xVar.mo6198a((C1496ha.C1499c) new C1517q(this));
                    haVar = xVar;
                    this.f5205fa = haVar;
                    return;
                }
            }
            C1480ba.m6943a("FacebookDialogFragment", str);
            a.finish();
        }
    }

    /* renamed from: n */
    public Dialog mo1307n(Bundle bundle) {
        if (this.f5205fa == null) {
            m7069a((Bundle) null, (C1574p) null);
            mo1306i(false);
        }
        return this.f5205fa;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f5205fa instanceof C1496ha) && mo1321H()) {
            ((C1496ha) this.f5205fa).mo6204d();
        }
    }
}
