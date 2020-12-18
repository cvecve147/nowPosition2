package com.askey.taipeinavi.tutorial;

import android.os.Bundle;
import android.support.p007v4.app.C0339l;
import android.support.p007v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.p058d.C1213g;
import java.util.ArrayList;
import java.util.List;
import p267i.p274b.p282c.C6744e;
import p287me.relex.circleindicator.CircleIndicator;

public class TutorialFragment extends C0339l {

    /* renamed from: a */
    private C1314b f4601a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C1317e> f4602b;
    TextView btxtStart;

    /* renamed from: c */
    protected C6744e f4603c;

    /* renamed from: d */
    private Unbinder f4604d;

    /* renamed from: e */
    private C1311a f4605e;
    CircleIndicator indicator;
    ViewPager mViewpager;

    /* renamed from: com.askey.taipeinavi.tutorial.TutorialFragment$a */
    public interface C1311a {
        /* renamed from: a */
        void mo5475a();
    }

    /* renamed from: com.askey.taipeinavi.tutorial.TutorialFragment$b */
    private class C1312b implements ViewPager.C0440f {
        private C1312b() {
        }

        /* renamed from: a */
        public void mo781a(int i) {
        }

        /* renamed from: a */
        public void mo782a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void mo783b(int i) {
            TextView textView;
            int i2;
            if (TutorialFragment.this.f4602b == null || i != TutorialFragment.this.f4602b.size() - 1) {
                textView = TutorialFragment.this.btxtStart;
                i2 = R.string.btxt_tur_next_page;
            } else {
                textView = TutorialFragment.this.btxtStart;
                i2 = R.string.btxt_tur_start;
            }
            textView.setText(i2);
        }
    }

    /* renamed from: K */
    public void mo1324K() {
        this.f4603c = null;
        super.mo1324K();
    }

    /* renamed from: M */
    public void mo1293M() {
        super.mo1293M();
        Unbinder unbinder = this.f4604d;
        if (unbinder != null) {
            unbinder.mo5375a();
            this.f4604d = null;
        }
    }

    /* renamed from: P */
    public void mo1327P() {
        this.f4603c.mo17242p();
        this.f4603c.mo17237d(R.color.bg_tutorial);
        this.f4603c.mo17233a(true, R.id.txtAppName);
        super.mo1327P();
    }

    /* renamed from: a */
    public View mo1339a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_tutorial, viewGroup, false);
        this.f4604d = ButterKnife.m5843a((Object) this, inflate);
        if (this.f4601a == null) {
            this.f4601a = new C1314b(this.f4602b);
        }
        this.mViewpager.setAdapter(this.f4601a);
        this.indicator.setViewPager(this.mViewpager);
        this.f4601a.mo1976a(this.indicator.getDataSetObserver());
        this.mViewpager.mo1786a((ViewPager.C0440f) new C1312b());
        return inflate;
    }

    /* renamed from: a */
    public void mo5655a(C1311a aVar) {
        this.f4605e = aVar;
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        this.f4603c = (C6744e) mo1337a();
    }

    /* renamed from: c */
    public void mo1301c(Bundle bundle) {
        super.mo1301c(bundle);
        ArrayList arrayList = new ArrayList();
        C1317e eVar = new C1317e();
        eVar.f4615c = R.layout.view_tutorial_subview_01;
        eVar.f4614b = R.string.txt_tur_01_subtitle;
        eVar.f4613a = R.string.txt_tur_01_title;
        arrayList.add(eVar);
        C1317e eVar2 = new C1317e();
        eVar2.f4615c = R.layout.view_tutorial_subview_02;
        eVar2.f4614b = R.string.txt_tur_02_subtitle;
        eVar2.f4613a = R.string.txt_tur_02_title;
        arrayList.add(eVar2);
        C1317e eVar3 = new C1317e();
        eVar3.f4615c = R.layout.view_tutorial_subview_03;
        eVar3.f4614b = R.string.txt_tur_03_subtitle;
        eVar3.f4613a = R.string.txt_tur_03_title;
        arrayList.add(eVar3);
        C1317e eVar4 = new C1317e();
        eVar4.f4615c = R.layout.view_tutorial_subview_04;
        eVar4.f4614b = R.string.txt_tur_04_subtitle;
        eVar4.f4613a = R.string.txt_tur_04_title;
        arrayList.add(eVar4);
        C1317e eVar5 = new C1317e();
        eVar5.f4615c = R.layout.view_tutorial_subview_05;
        eVar5.f4614b = R.string.txt_tur_05_subtitle;
        eVar5.f4613a = R.string.txt_tur_05_title;
        arrayList.add(eVar5);
        this.f4602b = arrayList;
    }

    public void onClick(View view) {
        int currentItem = this.mViewpager.getCurrentItem();
        if (currentItem < this.f4601a.mo1972a() - 1) {
            this.mViewpager.setCurrentItem(currentItem + 1);
            return;
        }
        C1213g.m6080w(mo1396i());
        C1311a aVar = this.f4605e;
        if (aVar != null) {
            aVar.mo5475a();
        }
    }
}
