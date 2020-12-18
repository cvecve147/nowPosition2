package com.askey.taipeinavi.tutorial;

import android.support.p007v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;
import p287me.relex.circleindicator.CircleIndicator;

public class TutorialFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TutorialFragment f4607a;

    /* renamed from: b */
    private View f4608b;

    public TutorialFragment_ViewBinding(TutorialFragment tutorialFragment, View view) {
        this.f4607a = tutorialFragment;
        tutorialFragment.mViewpager = (ViewPager) C1153c.m5853c(view, R.id.vpContent, "field 'mViewpager'", ViewPager.class);
        tutorialFragment.indicator = (CircleIndicator) C1153c.m5853c(view, R.id.indContent, "field 'indicator'", CircleIndicator.class);
        View a = C1153c.m5849a(view, R.id.btxtStart, "field 'btxtStart' and method 'onClick'");
        tutorialFragment.btxtStart = (TextView) C1153c.m5850a(a, R.id.btxtStart, "field 'btxtStart'", TextView.class);
        this.f4608b = a;
        a.setOnClickListener(new C1316d(this, tutorialFragment));
    }

    /* renamed from: a */
    public void mo5375a() {
        TutorialFragment tutorialFragment = this.f4607a;
        if (tutorialFragment != null) {
            this.f4607a = null;
            tutorialFragment.mViewpager = null;
            tutorialFragment.indicator = null;
            tutorialFragment.btxtStart = null;
            this.f4608b.setOnClickListener((View.OnClickListener) null);
            this.f4608b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
