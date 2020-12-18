package com.openlife.checkme.activity.mission.detail;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.mission.detail.MissionDetailAdFragment;

public class MissionDetailAdFragment_ViewBinding<T extends MissionDetailAdFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13606a;

    public MissionDetailAdFragment_ViewBinding(T t, View view) {
        this.f13606a = t;
        t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13606a;
        if (t != null) {
            t.cover = null;
            this.f13606a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
