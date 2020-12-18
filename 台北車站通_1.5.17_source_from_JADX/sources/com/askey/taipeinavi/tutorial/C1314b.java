package com.askey.taipeinavi.tutorial;

import android.content.res.Resources;
import android.support.p007v4.view.C0483r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.askey.taipeinavi.R;
import java.util.List;

/* renamed from: com.askey.taipeinavi.tutorial.b */
public class C1314b extends C0483r {

    /* renamed from: c */
    private List<C1317e> f4610c = null;

    public C1314b(List<C1317e> list) {
        this.f4610c = list;
    }

    /* renamed from: a */
    public int mo1972a() {
        List<C1317e> list = this.f4610c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public Object mo1975a(ViewGroup viewGroup, int i) {
        int i2;
        Resources resources;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C1317e eVar = this.f4610c.get(i);
        View inflate = from.inflate(R.layout.item_tutorial, viewGroup, false);
        viewGroup.addView(inflate);
        from.inflate(eVar.f4615c, (LinearLayout) inflate.findViewById(R.id.llayTutorialContent), true);
        ((TextView) inflate.findViewById(R.id.txtSubtitle)).setText(eVar.f4614b);
        ((TextView) inflate.findViewById(R.id.txtTitle)).setText(eVar.f4613a);
        View findViewById = inflate.findViewById(R.id.viewDivider);
        if (i == 0) {
            resources = viewGroup.getContext().getResources();
            i2 = R.dimen.tur_divider_long_width;
        } else {
            resources = viewGroup.getContext().getResources();
            i2 = R.dimen.tur_divider_short_width;
        }
        findViewById.getLayoutParams().width = (int) resources.getDimension(i2);
        return inflate;
    }

    /* renamed from: a */
    public void mo1981a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: a */
    public boolean mo1982a(View view, Object obj) {
        return view == obj;
    }
}
