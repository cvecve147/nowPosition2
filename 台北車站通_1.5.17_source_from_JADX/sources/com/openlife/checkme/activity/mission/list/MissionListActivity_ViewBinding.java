package com.openlife.checkme.activity.mission.list;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.BaseActivity_ViewBinding;
import com.openlife.checkme.activity.mission.list.MissionListActivity;

public class MissionListActivity_ViewBinding<T extends MissionListActivity> extends BaseActivity_ViewBinding<T> {

    /* renamed from: b */
    private View f13643b;

    public MissionListActivity_ViewBinding(T t, View view) {
        super(t, view);
        t.store = (Button) C1153c.m5853c(view, C4956g.store, "field 'store'", Button.class);
        View a = C1153c.m5849a(view, C4956g.mode, "field 'mode' and method 'onModeClick'");
        t.mode = (ImageButton) C1153c.m5850a(a, C4956g.mode, "field 'mode'", ImageButton.class);
        this.f13643b = a;
        a.setOnClickListener(new C4724a(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        MissionListActivity missionListActivity = (MissionListActivity) this.f13142a;
        super.mo5375a();
        missionListActivity.store = null;
        missionListActivity.mode = null;
        this.f13643b.setOnClickListener((View.OnClickListener) null);
        this.f13643b = null;
    }
}
