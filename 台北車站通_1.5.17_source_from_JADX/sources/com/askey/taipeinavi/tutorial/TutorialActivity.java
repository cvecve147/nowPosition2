package com.askey.taipeinavi.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.support.p007v4.app.C0270D;
import android.support.p007v4.app.C0339l;
import butterknife.ButterKnife;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.tutorial.TutorialFragment;
import p267i.p274b.p282c.C6744e;

public class TutorialActivity extends C6744e {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_tutorial);
        ButterKnife.m5840a((Activity) this);
        super.mo17237d(R.color.white);
        TutorialFragment tutorialFragment = new TutorialFragment();
        tutorialFragment.mo5655a((TutorialFragment.C1311a) new C1313a(this));
        C0270D a = mo1430d().mo1494a();
        a.mo1123a((int) R.id.flayContainer, (C0339l) tutorialFragment);
        a.mo1122a();
    }

    public void onResume() {
        mo17242p();
        super.onResume();
    }
}
