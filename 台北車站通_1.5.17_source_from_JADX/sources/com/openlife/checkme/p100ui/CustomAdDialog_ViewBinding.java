package com.openlife.checkme.p100ui;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.p100ui.CustomAdDialog;

/* renamed from: com.openlife.checkme.ui.CustomAdDialog_ViewBinding */
public class CustomAdDialog_ViewBinding<T extends CustomAdDialog> implements Unbinder {

    /* renamed from: a */
    protected T f14212a;

    /* renamed from: b */
    private View f14213b;

    /* renamed from: c */
    private View f14214c;

    public CustomAdDialog_ViewBinding(T t, View view) {
        this.f14212a = t;
        t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
        t.dontShow = (CheckBox) C1153c.m5853c(view, C4956g.dont_show, "field 'dontShow'", CheckBox.class);
        View a = C1153c.m5849a(view, C4956g.close, "field 'close' and method 'onCloseClick'");
        t.close = (Button) C1153c.m5850a(a, C4956g.close, "field 'close'", Button.class);
        this.f14213b = a;
        a.setOnClickListener(new C5020d(this, t));
        View a2 = C1153c.m5849a(view, C4956g.open, "field 'open' and method 'onOpenClick'");
        t.open = (Button) C1153c.m5850a(a2, C4956g.open, "field 'open'", Button.class);
        this.f14214c = a2;
        a2.setOnClickListener(new C5021e(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14212a;
        if (t != null) {
            t.cover = null;
            t.dontShow = null;
            t.close = null;
            t.open = null;
            this.f14213b.setOnClickListener((View.OnClickListener) null);
            this.f14213b = null;
            this.f14214c.setOnClickListener((View.OnClickListener) null);
            this.f14214c = null;
            this.f14212a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
