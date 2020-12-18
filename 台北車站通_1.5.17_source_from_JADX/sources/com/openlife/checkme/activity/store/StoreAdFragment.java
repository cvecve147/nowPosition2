package com.openlife.checkme.activity.store;

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

public class StoreAdFragment extends Fragment {

    /* renamed from: a */
    private String f13811a;

    /* renamed from: b */
    private String f13812b;

    /* renamed from: c */
    private C4804a f13813c;
    ImageView cover;

    /* renamed from: com.openlife.checkme.activity.store.StoreAdFragment$a */
    public interface C4804a {
        /* renamed from: a */
        void mo13268a(String str);
    }

    /* renamed from: a */
    public static StoreAdFragment m18924a(String str, String str2) {
        StoreAdFragment storeAdFragment = new StoreAdFragment();
        Bundle bundle = new Bundle();
        bundle.putString("COVER_URL", str);
        bundle.putString("SCHEME", str2);
        storeAdFragment.setArguments(bundle);
        return storeAdFragment;
    }

    /* renamed from: a */
    private void m18925a() {
        Bundle arguments = getArguments();
        this.f13811a = arguments.getString("COVER_URL");
        this.f13812b = arguments.getString("SCHEME");
    }

    /* renamed from: b */
    private void m18926b() {
        ImageLoader.getInstance().displayImage(this.f13811a, this.cover, C4452a.m17659a(C4959j.default_banner));
    }

    /* renamed from: a */
    public void mo13264a(C4804a aVar) {
        this.f13813c = aVar;
    }

    /* access modifiers changed from: package-private */
    public void coverClick() {
        C4804a aVar = this.f13813c;
        if (aVar != null) {
            aVar.mo13268a(this.f13812b);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18925a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C4957h.fragment_store_ad_cm, viewGroup, false);
        ButterKnife.m5843a((Object) this, inflate);
        m18926b();
        return inflate;
    }
}
