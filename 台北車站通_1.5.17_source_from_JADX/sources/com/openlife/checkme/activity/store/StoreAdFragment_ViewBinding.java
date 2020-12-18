package com.openlife.checkme.activity.store;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.store.StoreAdFragment;

public class StoreAdFragment_ViewBinding<T extends StoreAdFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13814a;

    /* renamed from: b */
    private View f13815b;

    public StoreAdFragment_ViewBinding(T t, View view) {
        this.f13814a = t;
        View a = C1153c.m5849a(view, C4956g.cover, "field 'cover' and method 'coverClick'");
        t.cover = (ImageView) C1153c.m5850a(a, C4956g.cover, "field 'cover'", ImageView.class);
        this.f13815b = a;
        a.setOnClickListener(new C4806a(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13814a;
        if (t != null) {
            t.cover = null;
            this.f13815b.setOnClickListener((View.OnClickListener) null);
            this.f13815b = null;
            this.f13814a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
