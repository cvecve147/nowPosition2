package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1804ua;
import com.google.android.gms.common.internal.C2061y;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Hv */
public class C2387Hv implements C2244Cv {

    /* renamed from: a */
    private final Object f7206a = new Object();

    /* renamed from: b */
    private final C2301Ev f7207b;

    /* renamed from: c */
    private final Context f7208c;

    /* renamed from: d */
    private final C3335nv f7209d;

    /* renamed from: e */
    private final JSONObject f7210e;

    /* renamed from: f */
    private final C3370pa f7211f;

    /* renamed from: g */
    private final C2329Fv f7212g;

    /* renamed from: h */
    private final C2209Bp f7213h;

    /* renamed from: i */
    private final zzang f7214i;

    /* renamed from: j */
    boolean f7215j;

    /* renamed from: k */
    boolean f7216k;

    /* renamed from: l */
    private String f7217l;

    /* renamed from: m */
    private C3459sd f7218m;

    /* renamed from: n */
    private WeakReference<View> f7219n = null;

    public C2387Hv(Context context, C2301Ev ev, C3370pa paVar, C2209Bp bp, JSONObject jSONObject, C2329Fv fv, zzang zzang, String str) {
        this.f7208c = context;
        this.f7207b = ev;
        this.f7211f = paVar;
        this.f7213h = bp;
        this.f7210e = jSONObject;
        this.f7212g = fv;
        this.f7214i = zzang;
        this.f7217l = str;
        this.f7209d = new C3335nv(this.f7211f);
    }

    /* renamed from: a */
    private final int m10185a(int i) {
        C3390pt.m13453a();
        return C3432rf.m13605b(this.f7208c, i);
    }

    /* renamed from: a */
    private final JSONObject m10186a(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m10185a(rect.right - rect.left));
        jSONObject.put("height", m10185a(rect.bottom - rect.top));
        jSONObject.put("x", m10185a(rect.left));
        jSONObject.put("y", m10185a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONObject m10187a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] f = m10192f(view);
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view2 = (View) ((WeakReference) next.getValue()).get();
                if (view2 != null) {
                    int[] f2 = m10192f(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", m10185a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", m10185a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", m10185a(f2[0] - f[0]));
                        jSONObject4.put("y", m10185a(f2[1] - f[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = m10186a(rect);
                        } else {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("width", 0);
                            jSONObject5.put("height", 0);
                            jSONObject5.put("x", m10185a(f2[0] - f[0]));
                            jSONObject5.put("y", m10185a(f2[1] - f[1]));
                            jSONObject5.put("relative_to", "ad_view");
                            jSONObject = jSONObject5;
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", (double) textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject2.put((String) next.getKey(), jSONObject3);
                    } catch (JSONException unused) {
                        C2227Cf.m9536d("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m10188a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        C2061y.m9072a("Invalid call from a non-UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f7210e);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f7212g.mo8102Cb());
            C1697X.m7700g();
            jSONObject8.put("is_privileged_process", C3289me.m13059e());
            boolean z = true;
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7873cd)).booleanValue() && this.f7209d.mo9816b() != null && this.f7210e.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", C1697X.m7705l().mo7725a());
            jSONObject8.put("has_custom_click_handler", this.f7207b.mo6765p(this.f7212g.mo8105l()) != null);
            if (this.f7207b.mo6765p(this.f7212g.mo8105l()) == null) {
                z = false;
            }
            jSONObject7.put("has_custom_click_handler", z);
            try {
                JSONObject optJSONObject = this.f7210e.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject8.put("click_signals", this.f7213h.mo7869a().mo6944a(this.f7208c, optJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                C2227Cf.m9533b("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject8);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.f7217l);
            C2427Jf.m10346a(this.f7211f.mo9852a(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e2) {
            C2227Cf.m9533b("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: a */
    private final boolean m10189a(String str) {
        JSONObject jSONObject = this.f7210e;
        JSONObject optJSONObject = jSONObject == null ? null : jSONObject.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    /* renamed from: a */
    private final boolean m10190a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        C2061y.m9072a("Invalid call from a non-UI thread.");
        if (this.f7215j) {
            return true;
        }
        this.f7215j = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f7210e);
            jSONObject6.put("ads_id", this.f7217l);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            C2427Jf.m10346a(this.f7211f.mo9859d(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.f7207b.mo6752b((C2244Cv) this);
            this.f7207b.mo8057Zb();
            mo7896zb();
            return true;
        } catch (JSONException e) {
            C2227Cf.m9533b("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m10191e(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
    }

    /* renamed from: f */
    private static int[] m10192f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: g */
    private final JSONObject m10193g(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] f = m10192f(view);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", m10185a(view.getMeasuredWidth()));
            jSONObject3.put("height", m10185a(view.getMeasuredHeight()));
            jSONObject3.put("x", m10185a(f[0]));
            jSONObject3.put("y", m10185a(f[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = m10186a(rect);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("width", 0);
                jSONObject.put("height", 0);
                jSONObject.put("x", m10185a(f[0]));
                jSONObject.put("y", m10185a(f[1]));
                jSONObject.put("relative_to", "window");
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            C2227Cf.m9536d("Unable to get native ad view bounding box");
        }
        return jSONObject2;
    }

    /* renamed from: h */
    private static JSONObject m10194h(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            C1697X.m7698e();
            jSONObject.put("contained_in_scroll_view", C3114ge.m12432d(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final JSONObject m10195i(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            C1697X.m7698e();
            jSONObject.put("can_show_on_lock_screen", C3114ge.m12430c(view));
            C1697X.m7698e();
            jSONObject.put("is_keyguard_locked", C3114ge.m12443j(this.f7208c));
        } catch (JSONException unused) {
            C2227Cf.m9536d("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* renamed from: A */
    public void mo7878A() {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7873cd)).booleanValue()) {
            if (!this.f7210e.optBoolean("custom_one_point_five_click_enabled", false)) {
                C2227Cf.m9536d("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            } else {
                this.f7209d.mo9814a();
            }
        }
    }

    /* renamed from: Ab */
    public void mo7879Ab() {
        this.f7207b.mo6734Ab();
    }

    /* renamed from: Bb */
    public boolean mo7880Bb() {
        JSONObject jSONObject = this.f7210e;
        return jSONObject != null && jSONObject.optBoolean("allow_pub_owned_ad_view", false);
    }

    /* renamed from: Cb */
    public void mo7881Cb() {
        C2061y.m9072a("Invalid call from a non-UI thread.");
        if (!this.f7216k) {
            this.f7216k = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad", this.f7210e);
                jSONObject.put("ads_id", this.f7217l);
                C2427Jf.m10346a(this.f7211f.mo9858c(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
            } catch (JSONException e) {
                C2227Cf.m9533b("", e);
            }
        }
    }

    /* renamed from: Db */
    public void mo7882Db() {
        this.f7207b.mo6738Ob();
    }

    /* renamed from: Eb */
    public boolean mo7883Eb() {
        C3306mv Fb = this.f7212g.mo8103Fb();
        return Fb != null && Fb.mo9762hc();
    }

    /* renamed from: Fb */
    public final View mo7955Fb() {
        WeakReference<View> weakReference = this.f7219n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: Gb */
    public void mo7884Gb() {
        this.f7211f.mo9853a();
    }

    /* renamed from: a */
    public View mo7885a(View.OnClickListener onClickListener, boolean z) {
        C3306mv Fb = this.f7212g.mo8103Fb();
        if (Fb == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!z) {
            int gc = Fb.mo9761gc();
            if (gc != 0) {
                if (gc == 2) {
                    layoutParams.addRule(12);
                } else if (gc != 3) {
                    layoutParams.addRule(10);
                } else {
                    layoutParams.addRule(12);
                }
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(10);
            }
            layoutParams.addRule(9);
        }
        C3392pv pvVar = new C3392pv(this.f7208c, Fb, layoutParams);
        pvVar.setOnClickListener(onClickListener);
        pvVar.setContentDescription((CharSequence) C3390pt.m13458f().mo8515a(C2558Nu.f7841Xc));
        return pvVar;
    }

    /* renamed from: a */
    public C3520uh mo7886a() {
        JSONObject jSONObject = this.f7210e;
        if (jSONObject == null || jSONObject.optJSONObject("overlay") == null) {
            return null;
        }
        C1697X.m7699f();
        Context context = this.f7208c;
        zzjn a = zzjn.m14776a(context);
        C3520uh a2 = C2201Bh.m9441a(context, C3146hi.m12525a(a), a.f10893a, false, false, this.f7213h, this.f7214i, (C2930_u) null, (C1690P) null, (C1804ua) null, C3275ls.m13004a());
        if (a2 != null) {
            a2.getView().setVisibility(8);
            new C2443Jv(a2).mo8387a(this.f7211f);
        }
        return a2;
    }

    /* renamed from: a */
    public final void mo7956a(Bundle bundle) {
        if (bundle == null) {
            C2227Cf.m9532b("Click data is null. No click is reported.");
        } else if (!m10189a("click_reporting")) {
            C2227Cf.m9529a("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            m10188a((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle.getBundle("click_signal").getString("asset_id"), (JSONObject) null, C1697X.m7698e().mo9446a(bundle, (JSONObject) null));
        }
    }

    /* renamed from: a */
    public final void mo7957a(MotionEvent motionEvent) {
        this.f7213h.mo7870a(motionEvent);
    }

    /* renamed from: a */
    public void mo7887a(View view) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7873cd)).booleanValue()) {
            if (!this.f7210e.optBoolean("custom_one_point_five_click_enabled", false)) {
                C2227Cf.m9536d("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
                return;
            }
            C3335nv nvVar = this.f7209d;
            if (view != null) {
                view.setOnClickListener(nvVar);
                view.setClickable(true);
                nvVar.f9936f = new WeakReference<>(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo7958a(View view, C2187Av av) {
        if (!mo8306b(view, av)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            C2329Fv fv = this.f7212g;
            if (fv instanceof C2359Gv) {
                C2359Gv gv = (C2359Gv) fv;
                if (gv.mo8246a() != null && gv.mo8246a().size() > 0) {
                    Object obj = gv.mo8246a().get(0);
                    C2903Zv a = obj instanceof IBinder ? C2931_v.m11894a((IBinder) obj) : null;
                    if (a != null) {
                        try {
                            C5464b na = a.mo9130na();
                            if (na != null) {
                                ImageView imageView = new ImageView(this.f7208c);
                                imageView.setImageDrawable((Drawable) C5468d.m20962z(na));
                                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException unused) {
                            C2227Cf.m9536d("Could not get drawable from image");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo7959a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        JSONObject a = m10187a(map, view2);
        JSONObject g = m10193g(view2);
        JSONObject h = m10194h(view2);
        JSONObject i = m10195i(view2);
        JSONObject jSONObject2 = null;
        try {
            JSONObject a2 = C1697X.m7698e().mo9446a(bundle, (JSONObject) null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a2);
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e) {
                e = e;
                jSONObject2 = jSONObject3;
                C2227Cf.m9533b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m10188a(view, g, a, h, i, str, jSONObject, (JSONObject) null);
            }
        } catch (Exception e2) {
            e = e2;
            C2227Cf.m9533b("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            m10188a(view, g, a, h, i, str, jSONObject, (JSONObject) null);
        }
        m10188a(view, g, a, h, i, str, jSONObject, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo7888a(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7821Tc)).booleanValue()) {
            view.setOnTouchListener((View.OnTouchListener) null);
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            if (map != null) {
                synchronized (map) {
                    for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener((View.OnTouchListener) null);
                            view2.setClickable(false);
                            view2.setOnClickListener((View.OnClickListener) null);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo7889a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        String str;
        C2061y.m9072a("Invalid call from a non-UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Map.Entry next : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                        mo7959a(view, (String) next.getKey(), bundle, map, view2);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.f7212g.mo8102Cb())) {
            str = "3099";
        } else if ("2".equals(this.f7212g.mo8102Cb())) {
            str = "2099";
        } else if ("1".equals(this.f7212g.mo8102Cb())) {
            mo7959a(view, "1099", bundle, map, view2);
            return;
        } else {
            return;
        }
        mo7959a(view, str, bundle, map, view2);
    }

    /* renamed from: a */
    public void mo7890a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7826Uc)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                synchronized (map) {
                    for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(onTouchListener);
                            view2.setClickable(true);
                            view2.setOnClickListener(onClickListener);
                        }
                    }
                }
            }
            if (map2 != null) {
                synchronized (map2) {
                    for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                        View view3 = (View) ((WeakReference) value2.getValue()).get();
                        if (view3 != null) {
                            view3.setOnTouchListener(onTouchListener);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo7892a(C2651Qw qw) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7873cd)).booleanValue()) {
            if (!this.f7210e.optBoolean("custom_one_point_five_click_enabled", false)) {
                C2227Cf.m9536d("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            } else {
                this.f7209d.mo9815a(qw);
            }
        }
    }

    /* renamed from: a */
    public final void mo8304a(Map<String, WeakReference<View>> map) {
        if (this.f7212g.mo8101Bb() == null) {
            return;
        }
        if ("2".equals(this.f7212g.mo8102Cb())) {
            C1697X.m7702i().mo8333m().mo9139a(this.f7207b.mo6741V(), this.f7212g.mo8102Cb(), map.containsKey("2011"));
        } else if ("1".equals(this.f7212g.mo8102Cb())) {
            C1697X.m7702i().mo8333m().mo9139a(this.f7207b.mo6741V(), this.f7212g.mo8102Cb(), map.containsKey("1009"));
        }
    }

    /* renamed from: b */
    public final C3459sd mo8305b() {
        if (!C1697X.m7689B().mo10044f(this.f7208c)) {
            return null;
        }
        if (this.f7218m == null) {
            this.f7218m = new C3459sd(this.f7208c, this.f7207b.mo6741V());
        }
        return this.f7218m;
    }

    /* renamed from: b */
    public final void mo7960b(View view) {
        this.f7219n = new WeakReference<>(view);
    }

    /* renamed from: b */
    public void mo7893b(View view, Map<String, WeakReference<View>> map) {
        m10190a(m10193g(view), m10187a(map, view), m10194h(view), m10195i(view), (JSONObject) null);
    }

    /* renamed from: b */
    public final boolean mo8306b(View view, C2187Av av) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        View Bb = this.f7212g.mo8101Bb();
        if (Bb == null) {
            return false;
        }
        ViewParent parent = Bb.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(Bb);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(Bb, layoutParams);
        this.f7207b.mo6751b(av);
        return true;
    }

    /* renamed from: c */
    public final void mo7961c(View view) {
        C2209Bp bp;
        C3614xp a;
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7962rc)).booleanValue() && (bp = this.f7213h) != null && (a = bp.mo7869a()) != null) {
            a.mo6948a(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7962c(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f7206a
            monitor-enter(r0)
            boolean r1 = r3.f7215j     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0009:
            boolean r1 = m10191e(r4)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0014
            r3.mo7893b((android.view.View) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0014:
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C2558Nu.f7867bd     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.mo8515a(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            if (r5 == 0) goto L_0x005c
            monitor-enter(r5)     // Catch:{ all -> 0x005e }
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0059 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0059 }
        L_0x0031:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0059 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0059 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0059 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = m10191e(r2)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            r3.mo7893b((android.view.View) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r4     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2387Hv.mo7962c(android.view.View, java.util.Map):void");
    }

    /* renamed from: c */
    public final boolean mo7963c(Bundle bundle) {
        if (!m10189a("impression_reporting")) {
            C2227Cf.m9529a("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return m10190a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, C1697X.m7698e().mo9446a(bundle, (JSONObject) null));
    }

    /* renamed from: d */
    public final void mo7964d(Bundle bundle) {
        if (bundle == null) {
            C2227Cf.m9532b("Touch event data is null. No touch event is reported.");
        } else if (!m10189a("touch_reporting")) {
            C2227Cf.m9529a("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i = bundle.getInt("duration_ms");
            this.f7213h.mo7869a().mo6946a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i);
        }
    }

    /* renamed from: d */
    public final void mo8307d(View view) {
        this.f7207b.mo6743a(view);
    }

    public final Context getContext() {
        return this.f7208c;
    }

    /* renamed from: zb */
    public void mo7896zb() {
        this.f7207b.mo6772zb();
    }
}
