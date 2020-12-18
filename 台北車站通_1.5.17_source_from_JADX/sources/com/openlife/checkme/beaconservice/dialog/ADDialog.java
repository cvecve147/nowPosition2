package com.openlife.checkme.beaconservice.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p007v4.view.ViewPager;
import android.support.p011v7.app.C0591E;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.beaconservice.dialog.p092a.C4845a;
import com.openlife.checkme.net.model.BeaconNotificationData;
import com.openlife.checkme.p094d.C4939b;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;

public class ADDialog extends C0591E {

    /* renamed from: a */
    private Context f13903a;

    /* renamed from: b */
    private C4843a f13904b;

    /* renamed from: c */
    private List<BeaconNotificationData> f13905c = new ArrayList();
    TextView close;

    /* renamed from: d */
    private List<Boolean> f13906d = new ArrayList();
    CheckBox dontShow;

    /* renamed from: e */
    private String f13907e;

    /* renamed from: f */
    private String f13908f;

    /* renamed from: g */
    private String f13909g;

    /* renamed from: h */
    private ViewPager.C0440f f13910h = new C4844a(this);
    CirclePageIndicator indicator;
    ViewPager mImagePager;
    TextView open;

    /* renamed from: com.openlife.checkme.beaconservice.dialog.ADDialog$a */
    public interface C4843a {
        /* renamed from: a */
        void mo13353a(String str);

        /* renamed from: a */
        void mo13354a(List<BeaconNotificationData> list);
    }

    public ADDialog(Context context, List<BeaconNotificationData> list) {
        super(context);
        this.f13903a = context;
        this.f13905c = list;
        setCancelable(false);
    }

    public ADDialog(Context context, List<BeaconNotificationData> list, String str, String str2, String str3) {
        super(context);
        this.f13903a = context;
        this.f13905c = list;
        this.f13907e = str;
        this.f13908f = str2;
        this.f13909g = str3;
        setCancelable(false);
    }

    /* renamed from: b */
    private List<BeaconNotificationData> m19090b() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f13905c.size(); i++) {
            if (!this.f13906d.get(i).booleanValue()) {
                arrayList.add(this.f13905c.get(i));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19091b(int i) {
        CheckBox checkBox;
        boolean z;
        if (!this.f13906d.get(i).booleanValue()) {
            checkBox = this.dontShow;
            z = true;
        } else {
            checkBox = this.dontShow;
            z = false;
        }
        checkBox.setChecked(z);
    }

    /* renamed from: c */
    private void m19093c() {
        CheckBox checkBox;
        String str = this.f13907e;
        if (!(str == null || this.f13908f == null || this.f13909g == null || (checkBox = this.dontShow) == null || this.open == null || this.close == null)) {
            checkBox.setText(str);
            this.open.setText(this.f13908f);
            this.close.setText(this.f13909g);
        }
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        C4845a aVar = new C4845a(this.f13903a, this.f13905c);
        ViewPager viewPager = this.mImagePager;
        if (viewPager != null) {
            viewPager.setAdapter(aVar);
            this.mImagePager.mo1786a(this.f13910h);
            this.indicator.setViewPager(this.mImagePager);
            if (this.dontShow != null) {
                int currentItem = this.mImagePager.getCurrentItem();
                m19091b(currentItem);
                m19094c(currentItem);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m19094c(int i) {
        RelativeLayout.LayoutParams layoutParams;
        if (this.f13905c.get(i).getUrl().isEmpty()) {
            this.open.setVisibility(8);
            layoutParams = (RelativeLayout.LayoutParams) this.close.getLayoutParams();
            layoutParams.addRule(11);
        } else {
            this.open.setVisibility(0);
            layoutParams = (RelativeLayout.LayoutParams) this.close.getLayoutParams();
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.removeRule(11);
            } else {
                layoutParams.addRule(11, 0);
            }
        }
        this.close.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo13347a(C4843a aVar) {
        this.f13904b = aVar;
    }

    /* renamed from: a */
    public void mo13348a(List<BeaconNotificationData> list) {
        this.f13905c = list;
        this.f13906d = new ArrayList();
        for (int i = 0; i < this.f13905c.size(); i++) {
            this.f13906d.add(true);
        }
        m19093c();
    }

    public void dismiss() {
        if (this.dontShow.isChecked()) {
            C4939b.m19478b(this.f13903a);
        }
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    public void onCloseClick() {
        C4843a aVar = this.f13904b;
        if (aVar != null) {
            aVar.mo13354a(m19090b());
        }
        dismiss();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(C4957h.new_view_ad_cm);
        ButterKnife.m5841a((Dialog) this);
        m19093c();
    }

    /* access modifiers changed from: package-private */
    public void onDontShowClick() {
        this.f13906d.set(this.mImagePager.getCurrentItem(), Boolean.valueOf(!this.dontShow.isChecked()));
    }

    /* access modifiers changed from: package-private */
    public void onOpenClick() {
        if (this.f13904b != null) {
            this.f13904b.mo13353a(this.f13905c.get(this.mImagePager.getCurrentItem()).getUrl());
        }
        dismiss();
    }
}
