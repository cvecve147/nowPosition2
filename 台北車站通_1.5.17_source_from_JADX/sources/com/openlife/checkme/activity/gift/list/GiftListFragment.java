package com.openlife.checkme.activity.gift.list;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.p007v4.view.C0483r;
import android.support.p011v7.widget.GridLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageButton;
import com.openlife.checkme.C4937d;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.gift.list.GiftListAdapter;
import com.openlife.checkme.net.model.AdData;
import com.openlife.checkme.net.model.GiftData;
import com.openlife.checkme.p100ui.CarouselViewpager;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.List;
import p101d.p108c.p109a.C5197l;

public class GiftListFragment extends C4672k<C4615x, C4605n> implements C4603l {

    /* renamed from: a */
    C4599i f13369a;

    /* renamed from: b */
    GiftListAdapter f13370b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4615x f13371c;

    /* renamed from: d */
    private Context f13372d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4590a f13373e;

    /* renamed from: f */
    private AdData f13374f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<GiftData> f13375g;
    CirclePageIndicator indicator;
    RecyclerView mRecyclerView;
    ImageButton mode;
    Button sort;
    CarouselViewpager viewPager;

    /* renamed from: com.openlife.checkme.activity.gift.list.GiftListFragment$a */
    public static class C4590a {

        /* renamed from: a */
        private int f13376a = 23;

        /* renamed from: b */
        private int f13377b = 0;

        /* renamed from: c */
        private boolean f13378c = false;

        /* renamed from: a */
        public int mo12824a() {
            return this.f13376a;
        }

        /* renamed from: a */
        public void mo12825a(int i) {
            this.f13376a = i;
            this.f13378c = true;
        }

        /* renamed from: b */
        public int mo12826b() {
            return this.f13377b;
        }

        /* renamed from: b */
        public void mo12827b(int i) {
            this.f13377b = i;
        }
    }

    /* renamed from: b */
    public static GiftListFragment m18129b() {
        return new GiftListFragment();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4615x mo12600l() {
        return this.f13371c;
    }

    /* renamed from: a */
    public void mo12810a(int i) {
        GiftListAdapter giftListAdapter = this.f13370b;
        giftListAdapter.f13359c = i;
        giftListAdapter.mo3798c();
    }

    /* renamed from: a */
    public void mo12811a(AdData adData) {
        this.f13374f = adData;
        this.f13369a = Build.VERSION.SDK_INT >= 17 ? new C4599i(getChildFragmentManager(), adData) : new C4599i(getFragmentManager(), adData);
        this.f13369a.mo12830a(new C4594d(this));
        this.viewPager.setOffscreenPageLimit(this.f13369a.mo1972a());
        this.viewPager.setAdapter(this.f13369a);
        this.indicator.setViewPager(this.viewPager);
    }

    /* renamed from: a */
    public void mo12812a(List<GiftData> list) {
        this.f13370b.mo12805a(list);
        this.f13370b.mo3798c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo12813b(List<GiftData> list) {
        this.f13375g = list;
        this.f13371c.mo12850a(list, this.f13373e.mo12826b());
    }

    /* renamed from: c */
    public void mo12814c(int i) {
        ImageButton imageButton;
        int i2;
        if (i == 22) {
            imageButton = this.mode;
            i2 = C4959j.icon_list_medium;
        } else if (i == 23) {
            imageButton = this.mode;
            i2 = C4959j.icon_list_small;
        } else {
            return;
        }
        imageButton.setImageResource(i2);
    }

    /* renamed from: d */
    public void mo12815d(int i) {
        String str = getResources().getStringArray(C4937d.gift_sort_array)[i];
        this.sort.setText(getString(C4961l.gift_p_sort, new Object[]{str}));
    }

    /* renamed from: e */
    public void mo12816e(int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14400g(C4961l.gift_a_sort);
        aVar.mo14389b(C4937d.gift_sort_array);
        aVar.mo14379a(i, (C5197l.C5204g) new C4595e(this));
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14395c();
    }

    /* renamed from: g */
    public void mo12817g() {
        setHasOptionsMenu(true);
        this.f13370b = new GiftListAdapter(this.f13372d, 23);
        this.f13370b.mo12804a((GiftListAdapter.C4588a) new C4592b(this));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f13372d, 2);
        gridLayoutManager.mo3375a((GridLayoutManager.C0718c) new C4593c(this));
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        this.mRecyclerView.setAdapter(this.f13370b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_gift_list_cm;
    }

    /* renamed from: k */
    public void mo12818k() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.viewPager.setAdapter((C0483r) null);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13372d = getActivity().getBaseContext();
        this.f13373e = new C4590a();
        mo12817g();
        mo12810a(this.f13373e.mo12824a());
        mo12814c(this.f13373e.mo12824a());
        mo12815d(this.f13373e.mo12826b());
        this.f13371c.mo12851c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13371c = new C4615x(this, new C4605n());
    }

    public void onDestroyView() {
        mo12818k();
        super.onDestroyView();
    }

    /* access modifiers changed from: package-private */
    public void onModeClick() {
        this.f13371c.mo12849a(this.f13373e);
    }

    /* access modifiers changed from: package-private */
    public void onSortClick() {
        mo12816e(this.f13373e.mo12826b());
    }
}
