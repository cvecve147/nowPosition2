package com.askey.taipeinavi.setting;

import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class SettingFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SettingFragment f4534a;

    /* renamed from: b */
    private View f4535b;

    /* renamed from: c */
    private View f4536c;

    /* renamed from: d */
    private View f4537d;

    /* renamed from: e */
    private View f4538e;

    /* renamed from: f */
    private View f4539f;

    /* renamed from: g */
    private View f4540g;

    public SettingFragment_ViewBinding(SettingFragment settingFragment, View view) {
        this.f4534a = settingFragment;
        settingFragment.mSbtnBarrierFree = (Switch) C1153c.m5853c(view, R.id.sbtnBarrierFree, "field 'mSbtnBarrierFree'", Switch.class);
        settingFragment.mTxtVersion = (TextView) C1153c.m5853c(view, R.id.txtVersion, "field 'mTxtVersion'", TextView.class);
        settingFragment.mSbtnPushMessage = (Switch) C1153c.m5853c(view, R.id.sbtnPushMessage, "field 'mSbtnPushMessage'", Switch.class);
        settingFragment.mSbtnTts = (Switch) C1153c.m5853c(view, R.id.sbtnTts, "field 'mSbtnTts'", Switch.class);
        View a = C1153c.m5849a(view, R.id.imgTtsHint, "method 'onTtsHintClicked'");
        this.f4535b = a;
        a.setOnClickListener(new C1292i(this, settingFragment));
        View a2 = C1153c.m5849a(view, R.id.cellMoreLink, "method 'onMoreLinkClicked'");
        this.f4536c = a2;
        a2.setOnClickListener(new C1293j(this, settingFragment));
        View a3 = C1153c.m5849a(view, R.id.cellFanGroup, "method 'onFacebookPageClicked'");
        this.f4537d = a3;
        a3.setOnClickListener(new C1294k(this, settingFragment));
        View a4 = C1153c.m5849a(view, R.id.cellHelloTaipei, "method 'onHelloTaipeiClicked'");
        this.f4538e = a4;
        a4.setOnClickListener(new C1295l(this, settingFragment));
        View a5 = C1153c.m5849a(view, R.id.cellTutorial, "method 'onTutorialClicked'");
        this.f4539f = a5;
        a5.setOnClickListener(new C1296m(this, settingFragment));
        View a6 = C1153c.m5849a(view, R.id.cellLanguage, "method 'onLanguageClicked'");
        this.f4540g = a6;
        a6.setOnClickListener(new C1297n(this, settingFragment));
    }

    /* renamed from: a */
    public void mo5375a() {
        SettingFragment settingFragment = this.f4534a;
        if (settingFragment != null) {
            this.f4534a = null;
            settingFragment.mSbtnBarrierFree = null;
            settingFragment.mTxtVersion = null;
            settingFragment.mSbtnPushMessage = null;
            settingFragment.mSbtnTts = null;
            this.f4535b.setOnClickListener((View.OnClickListener) null);
            this.f4535b = null;
            this.f4536c.setOnClickListener((View.OnClickListener) null);
            this.f4536c = null;
            this.f4537d.setOnClickListener((View.OnClickListener) null);
            this.f4537d = null;
            this.f4538e.setOnClickListener((View.OnClickListener) null);
            this.f4538e = null;
            this.f4539f.setOnClickListener((View.OnClickListener) null);
            this.f4539f = null;
            this.f4540g.setOnClickListener((View.OnClickListener) null);
            this.f4540g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
