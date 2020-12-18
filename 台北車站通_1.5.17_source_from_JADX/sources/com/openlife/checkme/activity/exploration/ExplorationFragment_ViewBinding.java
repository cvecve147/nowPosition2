package com.openlife.checkme.activity.exploration;

import android.support.p011v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.google.android.gms.maps.MapView;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.exploration.ExplorationFragment;

public class ExplorationFragment_ViewBinding<T extends ExplorationFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13302a;

    /* renamed from: b */
    private View f13303b;

    /* renamed from: c */
    private View f13304c;

    /* renamed from: d */
    private View f13305d;

    public ExplorationFragment_ViewBinding(T t, View view) {
        this.f13302a = t;
        t.sort = (Button) C1153c.m5853c(view, C4956g.sort, "field 'sort'", Button.class);
        t.mapLayout = (RelativeLayout) C1153c.m5853c(view, C4956g.map_layout, "field 'mapLayout'", RelativeLayout.class);
        t.listLayout = (FrameLayout) C1153c.m5853c(view, C4956g.list_layout, "field 'listLayout'", FrameLayout.class);
        t.mapView = (MapView) C1153c.m5853c(view, C4956g.map_view, "field 'mapView'", MapView.class);
        t.icon = (ImageView) C1153c.m5853c(view, C4956g.icon, "field 'icon'", ImageView.class);
        t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
        t.address = (TextView) C1153c.m5853c(view, C4956g.address, "field 'address'", TextView.class);
        View a = C1153c.m5849a(view, C4956g.phone, "field 'phone' and method 'onPhoneClick'");
        t.phone = (TextView) C1153c.m5850a(a, C4956g.phone, "field 'phone'", TextView.class);
        this.f13303b = a;
        a.setOnClickListener(new C4564n(this, t));
        t.distance = (TextView) C1153c.m5853c(view, C4956g.distance, "field 'distance'", TextView.class);
        t.recyclerView = (UltimateRecyclerView) C1153c.m5853c(view, C4956g.recycler_view, "field 'recyclerView'", UltimateRecyclerView.class);
        View a2 = C1153c.m5849a(view, C4956g.info_layout, "field 'infoLayout' and method 'onInfoClick'");
        t.infoLayout = (CardView) C1153c.m5850a(a2, C4956g.info_layout, "field 'infoLayout'", CardView.class);
        this.f13304c = a2;
        a2.setOnClickListener(new C4565o(this, t));
        View a3 = C1153c.m5849a(view, C4956g.mode, "field 'mode' and method 'onModeClick'");
        t.mode = (ImageButton) C1153c.m5850a(a3, C4956g.mode, "field 'mode'", ImageButton.class);
        this.f13305d = a3;
        a3.setOnClickListener(new C4566p(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13302a;
        if (t != null) {
            t.sort = null;
            t.mapLayout = null;
            t.listLayout = null;
            t.mapView = null;
            t.icon = null;
            t.title = null;
            t.address = null;
            t.phone = null;
            t.distance = null;
            t.recyclerView = null;
            t.infoLayout = null;
            t.mode = null;
            this.f13303b.setOnClickListener((View.OnClickListener) null);
            this.f13303b = null;
            this.f13304c.setOnClickListener((View.OnClickListener) null);
            this.f13304c = null;
            this.f13305d.setOnClickListener((View.OnClickListener) null);
            this.f13305d = null;
            this.f13302a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
