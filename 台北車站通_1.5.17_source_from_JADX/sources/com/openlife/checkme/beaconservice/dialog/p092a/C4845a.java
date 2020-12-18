package com.openlife.checkme.beaconservice.dialog.p092a;

import android.content.Context;
import android.support.p007v4.view.C0483r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.net.model.BeaconNotificationData;
import java.util.List;

/* renamed from: com.openlife.checkme.beaconservice.dialog.a.a */
public class C4845a extends C0483r {

    /* renamed from: c */
    private List<BeaconNotificationData> f13916c;

    /* renamed from: d */
    private Context f13917d;

    public C4845a(Context context, List<BeaconNotificationData> list) {
        this.f13917d = context;
        this.f13916c = list;
    }

    /* renamed from: c */
    private String m19103c(int i) {
        return this.f13916c.get(i).getImage();
    }

    /* renamed from: a */
    public int mo1972a() {
        return this.f13916c.size();
    }

    /* renamed from: a */
    public Object mo1975a(ViewGroup viewGroup, int i) {
        View inflate = ((LayoutInflater) this.f13917d.getSystemService("layout_inflater")).inflate(C4957h.new_view_ad_cm_image, viewGroup, false);
        ImageLoader.getInstance().displayImage(m19103c(i), (ImageView) inflate.findViewById(C4956g.imageivew), C4452a.m17659a(C4959j.default_pop));
        viewGroup.addView(inflate);
        return inflate;
    }

    /* renamed from: a */
    public void mo1981a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((RelativeLayout) obj);
    }

    /* renamed from: a */
    public boolean mo1982a(View view, Object obj) {
        return view == obj;
    }
}
