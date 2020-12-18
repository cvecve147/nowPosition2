package com.openlife.checkme.activity.activity;

import android.os.Bundle;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.net.model.ActivityData;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p100ui.ActivityItem;
import com.openlife.checkme.p100ui.FormView;
import com.openlife.checkme.p100ui.PointAnimationActivity;
import java.util.List;

public class ActivityFragment extends C4672k<C4528h, C4525e> implements C4524d {

    /* renamed from: a */
    FormView.C5011a f13237a;

    /* renamed from: b */
    private C4528h f13238b;
    FormView formView;

    /* renamed from: b */
    public static ActivityFragment m17892b() {
        return new ActivityFragment();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17893b(String str, String str2) {
        if (C4883m.m19229a(getActivity())) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -682587753) {
                if (hashCode != 1496355281) {
                    if (hashCode == 2088263399 && str.equals("sign_in")) {
                        c = 0;
                    }
                } else if (str.equals("tiny_game")) {
                    c = 1;
                }
            } else if (str.equals("pending")) {
                c = 2;
            }
            if (c == 0) {
                this.f13238b.mo12706d();
            } else if (c == 1) {
                C4883m.m19240c(getActivity(), str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4528h mo12600l() {
        return this.f13238b;
    }

    /* renamed from: a */
    public void mo12690a(int i) {
        PointAnimationActivity.m19814a(getActivity(), i);
    }

    /* renamed from: a */
    public void mo12691a(List<ActivityData> list) {
        this.f13237a.mo14056b();
        for (int i = 0; i < list.size(); i++) {
            ActivityData activityData = list.get(i);
            ActivityItem activityItem = new ActivityItem(getActivity(), getFragmentManager(), activityData.getTitle(), activityData.getData());
            activityItem.mo14039a((ActivityItem.C5009a) new C4521a(this, activityData));
            this.f13237a.mo14054a((FormView.C5012b) activityItem);
        }
        this.formView.setAdapter(this.f13237a);
        this.f13237a.mo14052a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: g */
    public void mo12692g() {
        this.f13237a = new FormView.C5011a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_activity_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo12692g();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13238b = new C4528h(this, new C4525e());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f13237a.mo14056b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }

    public void onResume() {
        super.onResume();
        this.f13238b.mo12705c();
    }
}
