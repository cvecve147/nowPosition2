package com.openlife.checkme.checkme_special.home.adapter;

import android.content.Context;
import android.support.p007v4.view.C0483r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.net.model.AdBannerData;
import java.util.List;

public class ADPagerAdapter extends C0483r {

    /* renamed from: c */
    private List<AdBannerData> f14035c;

    /* renamed from: d */
    private C4900a f14036d;

    /* renamed from: e */
    private LayoutInflater f14037e;

    public class ViewHolder {
        ImageView image;

        public ViewHolder(View view) {
            ButterKnife.m5843a((Object) this, view);
        }

        /* renamed from: a */
        public void mo13449a(AdBannerData adBannerData, C4900a aVar) {
            ImageLoader.getInstance().displayImage(adBannerData.getImage(), this.image, C4452a.m17659a(C4959j.default_banner));
            this.image.setOnClickListener(new C4901a(this, aVar, adBannerData));
        }
    }

    public class ViewHolder_ViewBinding<T extends ViewHolder> implements Unbinder {

        /* renamed from: a */
        protected T f14039a;

        public ViewHolder_ViewBinding(T t, View view) {
            this.f14039a = t;
            t.image = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'image'", ImageView.class);
        }

        /* renamed from: a */
        public void mo5375a() {
            T t = this.f14039a;
            if (t != null) {
                t.image = null;
                this.f14039a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.openlife.checkme.checkme_special.home.adapter.ADPagerAdapter$a */
    public interface C4900a {
        /* renamed from: a */
        void mo13447a(AdBannerData adBannerData);
    }

    public ADPagerAdapter(Context context, List<AdBannerData> list) {
        this.f14035c = list;
        this.f14037e = LayoutInflater.from(context);
    }

    /* renamed from: c */
    private AdBannerData m19338c(int i) {
        return this.f14035c.get(i);
    }

    /* renamed from: a */
    public int mo1972a() {
        return this.f14035c.size();
    }

    /* renamed from: a */
    public Object mo1975a(ViewGroup viewGroup, int i) {
        View inflate = this.f14037e.inflate(C4957h.view_viewpager_image, viewGroup, false);
        new ViewHolder(inflate).mo13449a(m19338c(i), this.f14036d);
        viewGroup.addView(inflate);
        return inflate;
    }

    /* renamed from: a */
    public void mo1981a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: a */
    public void mo13448a(C4900a aVar) {
        this.f14036d = aVar;
    }

    /* renamed from: a */
    public boolean mo1982a(View view, Object obj) {
        return view == obj;
    }
}
