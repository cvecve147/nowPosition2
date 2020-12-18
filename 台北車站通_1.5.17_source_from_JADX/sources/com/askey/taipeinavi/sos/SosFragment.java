package com.askey.taipeinavi.sos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p007v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TextView;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1194a;

public class SosFragment extends C1194a {
    FragmentTabHost tabHost;

    @SuppressLint({"InflateParams"})
    /* renamed from: a */
    private TabHost.TabSpec m6379a(String str, int i) {
        View inflate = LayoutInflater.from(mo1337a()).inflate(R.layout.tab_button_sos, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.txtTitle)).setText(i);
        return this.tabHost.newTabSpec(str).setIndicator(inflate);
    }

    /* renamed from: fa */
    private void m6380fa() {
        this.tabHost.mo1138a((Context) mo1337a(), mo1393h(), 16908305);
        this.tabHost.getTabWidget().setDividerDrawable((Drawable) null);
        this.tabHost.mo1139a(m6379a("contact", R.string.txt_sos_contact), (Class<?>) SosContactFragment.class, (Bundle) null);
        this.tabHost.mo1139a(m6379a("equipment", R.string.txt_sos_equipment), (Class<?>) SosEquipmentFragment.class, (Bundle) null);
    }

    /* renamed from: K */
    public void mo1324K() {
        super.mo1324K();
    }

    /* renamed from: O */
    public void mo1326O() {
        super.mo1326O();
        FragmentTabHost fragmentTabHost = this.tabHost;
        if (fragmentTabHost != null) {
            fragmentTabHost.setOnTabChangedListener((TabHost.OnTabChangeListener) null);
        }
    }

    /* renamed from: P */
    public void mo1327P() {
        this.f4380a.mo5533g(R.string.txt_sos);
        this.f4380a.mo5527b(true, (int) R.string.txt_back);
        super.mo1327P();
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        m6380fa();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public int mo1304ea() {
        return R.layout.fragment_sos;
    }
}
