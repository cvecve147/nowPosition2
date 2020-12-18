package com.openlife.checkme.activity.mission.detail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;

public class MissionDetailAdFragment extends Fragment {

    /* renamed from: a */
    private String f13604a;

    /* renamed from: b */
    private Unbinder f13605b;
    ImageView cover;

    /* renamed from: a */
    public static MissionDetailAdFragment m18539a(String str) {
        MissionDetailAdFragment missionDetailAdFragment = new MissionDetailAdFragment();
        Bundle bundle = new Bundle();
        bundle.putString("COVER_URL", str);
        missionDetailAdFragment.setArguments(bundle);
        return missionDetailAdFragment;
    }

    /* renamed from: a */
    private void m18540a() {
        this.f13604a = getArguments().getString("COVER_URL");
    }

    /* renamed from: b */
    private void m18541b() {
        ImageLoader.getInstance().displayImage(this.f13604a, this.cover, C4452a.m17659a(C4959j.default_task));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18540a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C4957h.fragment_mission_detail_cover_cm, viewGroup, false);
        this.f13605b = ButterKnife.m5843a((Object) this, inflate);
        m18541b();
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f13605b.mo5375a();
    }
}
