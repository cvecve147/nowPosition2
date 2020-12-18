package com.openlife.checkme.activity.guide;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.guide.GuideActivity;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.sdk.C5008q;

public class GuideFragment extends C5008q<C4625i, C4624h> implements C4623g {

    /* renamed from: a */
    AnimationSet f13412a;

    /* renamed from: b */
    AnimationSet f13413b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4625i f13414c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f13415d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Integer[] f13416e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f13417f;
    ImageSwitcher imageSwitcher;
    ImageButton skip;

    /* renamed from: h */
    public static GuideFragment m18203h(int i) {
        GuideFragment guideFragment = new GuideFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("LAUNCH_TYPE", i);
        guideFragment.setArguments(bundle);
        return guideFragment;
    }

    /* renamed from: a */
    public void mo12854a() {
        this.skip.setVisibility(0);
    }

    /* renamed from: a */
    public void mo12855a(int i) {
        this.f13416e = C4883m.m19230a(getResources(), i);
        mo12869q();
        mo12868p();
        mo12857c(this.f13416e[this.f13415d].intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo12856b() {
        this.skip.setVisibility(4);
    }

    /* renamed from: c */
    public void mo12857c(int i) {
        this.imageSwitcher.setImageResource(i);
    }

    /* renamed from: d */
    public void mo12858d(int i) {
        this.f13415d = i;
    }

    /* renamed from: e */
    public void mo12859e(int i) {
        mo12968i();
    }

    /* renamed from: g */
    public void mo12860g() {
        C4883m.m19235b(getActivity());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_guide_cm;
    }

    /* renamed from: k */
    public void mo12861k() {
        this.imageSwitcher.setClickable(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C4625i mo12600l() {
        return this.f13414c;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13415d = 0;
        this.f13417f = getArguments().getInt("LAUNCH_TYPE");
        this.f13414c.mo12875c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13414c = new C4625i(this, new C4624h());
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }

    /* access modifiers changed from: package-private */
    public void onNextClick() {
        this.f13414c.mo12873a(this.f13417f, this.f13416e, this.f13415d);
    }

    /* access modifiers changed from: package-private */
    public void onSkipClick() {
        this.f13414c.mo12683b(this.f13417f);
    }

    /* renamed from: p */
    public void mo12868p() {
        this.skip.setVisibility(4);
        this.imageSwitcher.setFactory(new C4617a(this));
        this.imageSwitcher.setInAnimation(this.f13412a);
        this.imageSwitcher.setOutAnimation(this.f13413b);
        if (getActivity() instanceof GuideActivity) {
            ((GuideActivity) getActivity()).mo12852a((GuideActivity.C4616a) new C4618b(this));
        }
    }

    /* renamed from: q */
    public void mo12869q() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500);
        this.f13413b = new AnimationSet(false);
        this.f13413b.addAnimation(alphaAnimation);
        this.f13413b.setFillEnabled(false);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(500);
        this.f13412a = new AnimationSet(false);
        this.f13412a.addAnimation(alphaAnimation2);
        this.f13412a.setFillEnabled(false);
    }
}
