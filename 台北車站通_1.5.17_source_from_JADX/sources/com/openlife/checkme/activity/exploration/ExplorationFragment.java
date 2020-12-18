package com.openlife.checkme.activity.exploration;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.p011v7.widget.CardView;
import android.support.p011v7.widget.LinearLayoutManager;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.maps.C3977b;
import com.google.android.gms.maps.C3978c;
import com.google.android.gms.maps.C3981e;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.C3989b;
import com.google.android.gms.maps.model.C3990c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.exploration.ExplorationAdapter;
import com.openlife.checkme.activity.mission.list.MissionListActivity;
import com.openlife.checkme.net.model.MapData;
import com.openlife.checkme.p087a.C4454b;
import com.openlife.checkme.p093c.C4883m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p108c.p109a.C5197l;
import p101d.p204k.p205a.C6053f;

public class ExplorationFragment extends C4672k<C4572v, C4570t> implements C3981e, C4569s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f13286a;
    TextView address;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public double f13287b = 23.972d;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public double f13288c = 120.9777d;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f13289d = false;
    TextView distance;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f13290e = false;

    /* renamed from: f */
    private C3978c f13291f;

    /* renamed from: g */
    ExplorationAdapter f13292g;

    /* renamed from: h */
    LinearLayoutManager f13293h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public HashMap<C3990c, MapData> f13294i = new HashMap<>();
    ImageView icon;
    CardView infoLayout;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4572v f13295j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f13296k;

    /* renamed from: l */
    private int f13297l = 11;
    FrameLayout listLayout;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public MapData f13298m;
    RelativeLayout mapLayout;
    MapView mapView;
    ImageButton mode;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C4454b f13299n;

    /* renamed from: o */
    private List<C5197l> f13300o = new ArrayList();

    /* renamed from: p */
    private C4454b.C4456b f13301p = new C4555e(this);
    TextView phone;
    UltimateRecyclerView recyclerView;
    Button sort;
    TextView title;

    /* renamed from: a */
    private Bitmap m17977a(View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: a */
    public static ExplorationFragment m17978a(String str) {
        ExplorationFragment explorationFragment = new ExplorationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("LAUNCH_API_TYPE", str);
        bundle.putInt("ID", -1);
        explorationFragment.setArguments(bundle);
        return explorationFragment;
    }

    /* renamed from: b */
    public static ExplorationFragment m17984b(String str, int i) {
        ExplorationFragment explorationFragment = new ExplorationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("LAUNCH_API_TYPE", str);
        bundle.putInt("ID", i);
        explorationFragment.setArguments(bundle);
        return explorationFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m17990g(String str) {
        new C6053f(getActivity()).mo16005d("android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE").mo16543b(new C4557g(this, str));
    }

    /* renamed from: a */
    public void mo12741a() {
        this.infoLayout.setVisibility(0);
    }

    /* renamed from: a */
    public void mo12742a(double d, double d2) {
        C3978c cVar = this.f13291f;
        if (cVar != null) {
            cVar.mo11243a(C3977b.m16084a(new LatLng(d, d2), 15.0f));
        }
    }

    /* renamed from: a */
    public void mo12743a(int i) {
        this.f13297l = i;
        int i2 = this.f13297l;
        if (i2 == 11) {
            this.mode.setImageResource(C4959j.icon_list_large);
            this.mapLayout.setVisibility(0);
            this.listLayout.setVisibility(8);
        } else if (i2 == 12) {
            this.mode.setImageResource(C4959j.icon_list_map);
            this.mapLayout.setVisibility(8);
            this.listLayout.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo12744a(Context context) {
        this.f13292g = new ExplorationAdapter();
        this.f13292g.mo12735a((ExplorationAdapter.C4547a) new C4561k(this));
        this.f13292g.mo12736a((ExplorationAdapter.C4549c) new C4562l(this));
        this.f13293h = new LinearLayoutManager(context);
        this.recyclerView.setLayoutManager(this.f13293h);
        this.recyclerView.mo11743a(C4957h.view_empty_cm, UltimateRecyclerView.f12350c);
        this.recyclerView.setAdapter(this.f13292g);
    }

    /* renamed from: a */
    public void mo12745a(Context context, Bundle bundle) {
        this.sort.setText(C4961l.exploration_all);
        this.sort.setClickable(false);
        this.mapView.mo11199a(bundle);
        this.mapView.mo11200a((C3981e) this);
    }

    /* renamed from: a */
    public void mo11248a(C3978c cVar) {
        this.f13291f = cVar;
        if (C1006a.m5387a((Context) getActivity(), "android.permission.ACCESS_FINE_LOCATION") == 0 || C1006a.m5387a((Context) getActivity(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f13291f.mo11245a(true);
        }
        this.f13291f.mo11246b().mo11249a(false);
        this.f13291f.mo11243a(C3977b.m16084a(new LatLng(23.972d, 120.9777d), 7.0f));
        this.f13291f.mo11244a((C3978c.C3979a) new C4563m(this));
    }

    /* renamed from: a */
    public void mo12746a(MapData mapData) {
        MissionListActivity.m18613a(getActivity(), mapData.getCorpId());
    }

    /* renamed from: a */
    public void mo12747a(MapData mapData, float f) {
        ImageLoader.getInstance().displayImage(mapData.getCorpImage(), this.icon, C4452a.f13122b);
        this.title.setText(getString(C4961l.exploration_storetitle, new Object[]{mapData.getCorpName(), mapData.getSiteName()}));
        this.address.setText(mapData.getAddress());
        SpannableString spannableString = new SpannableString(mapData.getTelephone());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        this.phone.setText(spannableString);
        this.distance.setText(C4883m.m19220a(getActivity().getBaseContext(), f));
    }

    /* renamed from: a */
    public void mo12748a(List<MapData> list) {
        this.f13292g.mo13157a(list);
        this.f13292g.mo3798c();
    }

    /* renamed from: a */
    public void mo12749a(List<MapData> list, MapData mapData) {
        int i;
        LayoutInflater layoutInflater;
        C3978c cVar = this.f13291f;
        if (cVar != null) {
            cVar.mo11242a();
            for (MapData next : list) {
                if (next != mapData) {
                    layoutInflater = (LayoutInflater) getActivity().getBaseContext().getSystemService("layout_inflater");
                    i = C4957h.view_unselected_marker_cm;
                } else {
                    layoutInflater = (LayoutInflater) getActivity().getBaseContext().getSystemService("layout_inflater");
                    i = C4957h.view_selected_marker_cm;
                }
                View inflate = layoutInflater.inflate(i, (ViewGroup) null);
                ((TextView) inflate.findViewById(C4956g.title)).setText(next.getPointStr());
                C3978c cVar2 = this.f13291f;
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.mo11271a(C3989b.m16121a(m17977a(inflate)));
                markerOptions.mo11269a(0.5f, 1.0f);
                markerOptions.mo11270a(new LatLng(next.getLocation().getLat(), next.getLocation().getLon()));
                this.f13294i.put(cVar2.mo11241a(markerOptions), next);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo12750b() {
        this.infoLayout.setVisibility(8);
    }

    /* renamed from: b */
    public void mo12751b(double d, double d2) {
        ExplorationAdapter explorationAdapter = this.f13292g;
        if (explorationAdapter != null) {
            explorationAdapter.mo12734a(d, d2);
        }
    }

    /* renamed from: b */
    public void mo12752b(String str, String str2) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14383a((CharSequence) str);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4553c(this, str2));
        aVar.mo14395c();
    }

    /* renamed from: c */
    public void mo12753c(int i) {
        this.f13293h.mo3521h(i);
    }

    /* renamed from: d */
    public void mo12754d(int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_setting);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4552b(this));
        aVar.mo14382a((C5197l.C5207j) new C4551a(this));
        aVar.mo14395c();
    }

    /* renamed from: e */
    public void mo12755e(int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4556f(this));
        aVar.mo14382a((C5197l.C5207j) new C4554d(this));
        aVar.mo14395c();
    }

    /* renamed from: f */
    public void mo12756f() {
        super.mo12756f();
        getActivity().runOnUiThread(new C4560j(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C4572v mo12600l() {
        return this.f13295j;
    }

    /* renamed from: h */
    public void mo12758h(int i) {
        List<C5197l> list = this.f13300o;
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_retry);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4559i(this));
        aVar.mo14382a((C5197l.C5207j) new C4558h(this));
        aVar.mo14385a(false);
        list.add(aVar.mo14395c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_exploration_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13296k = getArguments().getInt("ID", -1);
        this.f13286a = getArguments().getString("LAUNCH_API_TYPE");
        this.f13297l = 11;
        mo12743a(this.f13297l);
        mo12745a(getActivity().getBaseContext(), bundle);
        mo12744a(getActivity().getBaseContext());
        this.f13299n = new C4454b(getActivity().getBaseContext());
        this.f13299n.mo12564a(this.f13301p);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13295j = new C4572v(this, new C4570t());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f13299n.mo12567d();
        if (this.f13291f != null) {
            if (C1006a.m5387a((Context) getActivity(), "android.permission.ACCESS_FINE_LOCATION") == 0 || C1006a.m5387a((Context) getActivity(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                this.f13291f.mo11245a(false);
            }
            this.f13291f = null;
        }
        for (C5197l next : this.f13300o) {
            if (next != null) {
                next.dismiss();
            }
        }
        this.f13300o.clear();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.mapView.mo11198a();
        C3978c cVar = this.f13291f;
        if (cVar != null) {
            cVar.mo11242a();
        }
        mo12970m().mo5375a();
    }

    /* access modifiers changed from: package-private */
    public void onInfoClick() {
        this.f13295j.mo12778a(this.f13298m);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mapView.mo11201b();
    }

    /* access modifiers changed from: package-private */
    public void onModeClick() {
        this.f13295j.mo12683b(this.f13297l);
    }

    public void onPause() {
        super.onPause();
        this.f13299n.mo12565b();
        this.mapView.mo11202c();
    }

    /* access modifiers changed from: package-private */
    public void onPhoneClick() {
        m17990g(this.phone.getText().toString());
    }

    public void onResume() {
        super.onResume();
        this.f13299n.mo12562a();
        this.mapView.mo11203d();
    }

    public void onStart() {
        super.onStart();
        this.mapView.mo11204e();
    }

    public void onStop() {
        super.onStop();
        this.mapView.mo11205f();
    }
}
