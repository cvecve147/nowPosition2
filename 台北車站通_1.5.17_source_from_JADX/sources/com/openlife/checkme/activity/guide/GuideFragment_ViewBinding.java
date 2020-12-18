package com.openlife.checkme.activity.guide;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.guide.GuideFragment;

public class GuideFragment_ViewBinding<T extends GuideFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13418a;

    /* renamed from: b */
    private View f13419b;

    /* renamed from: c */
    private View f13420c;

    public GuideFragment_ViewBinding(T t, View view) {
        this.f13418a = t;
        View a = C1153c.m5849a(view, C4956g.image_switcher, "field 'imageSwitcher' and method 'onNextClick'");
        t.imageSwitcher = (ImageSwitcher) C1153c.m5850a(a, C4956g.image_switcher, "field 'imageSwitcher'", ImageSwitcher.class);
        this.f13419b = a;
        a.setOnClickListener(new C4619c(this, t));
        View a2 = C1153c.m5849a(view, C4956g.skip, "field 'skip' and method 'onSkipClick'");
        t.skip = (ImageButton) C1153c.m5850a(a2, C4956g.skip, "field 'skip'", ImageButton.class);
        this.f13420c = a2;
        a2.setOnClickListener(new C4620d(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13418a;
        if (t != null) {
            t.imageSwitcher = null;
            t.skip = null;
            this.f13419b.setOnClickListener((View.OnClickListener) null);
            this.f13419b = null;
            this.f13420c.setOnClickListener((View.OnClickListener) null);
            this.f13420c = null;
            this.f13418a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
