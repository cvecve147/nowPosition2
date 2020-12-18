package com.openlife.checkme.p100ui;

import android.app.FragmentManager;
import android.content.Context;
import android.support.p007v4.view.ViewPager;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.net.model.ActivityDetailData;
import com.openlife.checkme.p100ui.C5034r;
import com.openlife.checkme.p100ui.FormView;
import java.util.List;

/* renamed from: com.openlife.checkme.ui.ActivityItem */
public class ActivityItem extends FormView.C5012b {

    /* renamed from: a */
    Context f14206a;

    /* renamed from: b */
    FragmentManager f14207b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5009a f14208c;
    TextView title;
    ViewPager viewPager;

    /* renamed from: com.openlife.checkme.ui.ActivityItem$a */
    public interface C5009a {
        /* renamed from: a */
        void mo12698a(String str);
    }

    public ActivityItem(Context context) {
        super(context);
        this.f14206a = context;
        ButterKnife.m5843a((Object) this, mo14059b());
    }

    public ActivityItem(Context context, FragmentManager fragmentManager, String str, List<ActivityDetailData> list) {
        this(context);
        this.f14207b = fragmentManager;
        mo14040a(str);
        mo14041a(list);
    }

    /* renamed from: a */
    public int mo14038a() {
        return C4957h.item_activity_cm;
    }

    /* renamed from: a */
    public void mo14039a(C5009a aVar) {
        this.f14208c = aVar;
    }

    /* renamed from: a */
    public void mo14040a(String str) {
        this.title.setText(str);
    }

    /* renamed from: a */
    public void mo14041a(List<ActivityDetailData> list) {
        C5034r rVar = new C5034r(this.f14206a, list);
        rVar.mo14105a((C5034r.C5035a) new C5017a(this));
        this.viewPager.setOffscreenPageLimit(rVar.mo1972a());
        this.viewPager.setAdapter(rVar);
    }
}
