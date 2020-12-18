package com.openlife.checkme.activity.gift.list;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.gift.list.GiftAdFragment;

public class GiftAdFragment_ViewBinding<T extends GiftAdFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13357a;

    /* renamed from: b */
    private View f13358b;

    public GiftAdFragment_ViewBinding(T t, View view) {
        this.f13357a = t;
        View a = C1153c.m5849a(view, C4956g.cover, "field 'cover' and method 'coverClick'");
        t.cover = (ImageView) C1153c.m5850a(a, C4956g.cover, "field 'cover'", ImageView.class);
        this.f13358b = a;
        a.setOnClickListener(new C4591a(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13357a;
        if (t != null) {
            t.cover = null;
            this.f13358b.setOnClickListener((View.OnClickListener) null);
            this.f13358b = null;
            this.f13357a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
