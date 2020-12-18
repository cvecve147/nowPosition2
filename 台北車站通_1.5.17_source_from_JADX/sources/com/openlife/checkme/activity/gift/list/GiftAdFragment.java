package com.openlife.checkme.activity.gift.list;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;

public class GiftAdFragment extends Fragment {

    /* renamed from: a */
    private String f13354a;

    /* renamed from: b */
    private String f13355b;

    /* renamed from: c */
    protected C4587a f13356c;
    ImageView cover;

    /* renamed from: com.openlife.checkme.activity.gift.list.GiftAdFragment$a */
    public interface C4587a {
        /* renamed from: a */
        void mo12803a(String str);
    }

    /* renamed from: a */
    public static GiftAdFragment m18106a(String str, String str2) {
        GiftAdFragment giftAdFragment = new GiftAdFragment();
        Bundle bundle = new Bundle();
        bundle.putString("COVER_URL", str);
        bundle.putString("SCHEME", str2);
        giftAdFragment.setArguments(bundle);
        return giftAdFragment;
    }

    /* renamed from: a */
    private void m18107a() {
        Bundle arguments = getArguments();
        this.f13354a = arguments.getString("COVER_URL");
        this.f13355b = arguments.getString("SCHEME");
    }

    /* renamed from: b */
    private void m18108b() {
        ImageLoader.getInstance().displayImage(this.f13354a, this.cover, C4452a.m17659a(C4959j.default_banner));
    }

    /* renamed from: a */
    public void mo12799a(C4587a aVar) {
        this.f13356c = aVar;
    }

    /* access modifiers changed from: package-private */
    public void coverClick() {
        C4587a aVar = this.f13356c;
        if (aVar != null) {
            aVar.mo12803a(this.f13355b);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18107a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C4957h.fragment_gift_ad_cm, viewGroup, false);
        ButterKnife.m5843a((Object) this, inflate);
        m18108b();
        return inflate;
    }
}
