package com.openlife.checkme.activity.store;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.p007v4.view.C0483r;
import android.support.p007v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageButton;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.exploration.ExplorationActivity;
import com.openlife.checkme.activity.store.C4811f;
import com.openlife.checkme.net.model.AdData;
import com.openlife.checkme.p100ui.CarouselViewpager;
import com.viewpagerindicator.CirclePageIndicator;

public class StoreFragment extends C4672k<C4834o, C4832m> implements C4819l {

    /* renamed from: a */
    C4811f f13816a;

    /* renamed from: b */
    C4815i f13817b;

    /* renamed from: c */
    private C4834o f13818c;
    ViewPager contentViewPager;

    /* renamed from: d */
    private C4805a f13819d = new C4805a();

    /* renamed from: e */
    int f13820e;
    CirclePageIndicator indicator;
    ImageButton mode;
    TabLayout tabLayout;
    CarouselViewpager viewPager;

    /* renamed from: com.openlife.checkme.activity.store.StoreFragment$a */
    public static class C4805a {

        /* renamed from: a */
        private int f13821a = 113;

        /* renamed from: b */
        private boolean f13822b = false;

        /* renamed from: a */
        public int mo13284a() {
            return this.f13821a;
        }

        /* renamed from: a */
        public void mo13285a(int i) {
            this.f13821a = i;
            this.f13822b = true;
        }
    }

    /* renamed from: d */
    public static StoreFragment m18930d(int i) {
        StoreFragment storeFragment = new StoreFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("TAB_INDEX", i);
        storeFragment.setArguments(bundle);
        return storeFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4834o mo12600l() {
        return this.f13818c;
    }

    /* renamed from: a */
    public void mo13270a(int i) {
        ImageButton imageButton;
        int i2;
        switch (i) {
            case 111:
                imageButton = this.mode;
                i2 = C4959j.icon_list_medium;
                break;
            case 112:
                imageButton = this.mode;
                i2 = C4959j.icon_list_large;
                break;
            case 113:
                imageButton = this.mode;
                i2 = C4959j.icon_list_small;
                break;
            default:
                return;
        }
        imageButton.setImageResource(i2);
    }

    /* renamed from: a */
    public void mo13271a(AdData adData) {
        this.f13816a = Build.VERSION.SDK_INT >= 17 ? new C4811f(getChildFragmentManager(), adData) : new C4811f(getFragmentManager(), adData);
        this.f13816a.mo13287a((C4811f.C4812a) new C4808c(this));
        this.viewPager.setOffscreenPageLimit(this.f13816a.mo1972a());
        this.viewPager.setAdapter(this.f13816a);
        this.indicator.setViewPager(this.viewPager);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo13272b() {
        setHasOptionsMenu(mo13275g());
        this.tabLayout.mo725c();
        TabLayout tabLayout2 = this.tabLayout;
        TabLayout.C0136e a = tabLayout2.mo706a();
        a.mo773c(C4961l.store_t_chainstore);
        tabLayout2.mo710a(a);
        TabLayout tabLayout3 = this.tabLayout;
        TabLayout.C0136e a2 = tabLayout3.mo706a();
        a2.mo773c(C4961l.store_t_street);
        tabLayout3.mo710a(a2);
    }

    /* renamed from: c */
    public void mo13273c(int i) {
        this.f13817b.mo13289d(i);
    }

    /* renamed from: e */
    public void mo13274e(int i) {
        this.f13817b = Build.VERSION.SDK_INT >= 17 ? new C4815i(getChildFragmentManager()) : new C4815i(getFragmentManager());
        this.contentViewPager.mo1786a((ViewPager.C0440f) new TabLayout.C0137f(this.tabLayout));
        this.contentViewPager.setOffscreenPageLimit(this.f13817b.mo1972a());
        this.contentViewPager.setAdapter(this.f13817b);
        this.tabLayout.mo709a((TabLayout.C0133b) new C4807b(this));
        this.contentViewPager.setCurrentItem(i);
    }

    /* renamed from: g */
    public boolean mo13275g() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_store_cm;
    }

    /* renamed from: k */
    public void mo13276k() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.viewPager.setAdapter((C0483r) null);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13820e = getArguments().getInt("TAB_INDEX");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13818c = new C4834o(this, new C4832m());
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public void onDestroyView() {
        mo13276k();
        super.onDestroyView();
        mo12970m().mo5375a();
    }

    /* access modifiers changed from: package-private */
    public void onModeClick() {
        this.f13818c.mo13313a(this.f13819d);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C4956g.location) {
            return false;
        }
        ExplorationActivity.m17961a(getActivity());
        return false;
    }

    public void onStart() {
        super.onStart();
        mo13272b();
        mo13274e(this.f13820e);
        mo13270a(this.f13819d.mo13284a());
        this.f13818c.mo13314c();
    }
}
