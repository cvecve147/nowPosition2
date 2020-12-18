package p299tw.navin.navinmap.map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p267i.p268a.p269a.C6668b;
import p267i.p268a.p269a.C6684c;
import p267i.p268a.p269a.C6688d;
import p267i.p268a.p269a.C6689e;
import p267i.p268a.p269a.p270a.C6665e;
import p267i.p268a.p269a.p273c.C6687c;
import p299tw.navin.navinmap.map.C7079a;
import p299tw.navin.navinmap.map.C7106ia;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.T */
public class C7066T extends RelativeLayout implements C7106ia.C7107a {

    /* renamed from: A */
    private boolean f19470A = false;

    /* renamed from: B */
    private HashSet<Integer> f19471B = null;

    /* renamed from: C */
    private HashSet<Integer> f19472C = null;

    /* renamed from: D */
    private boolean f19473D;

    /* renamed from: E */
    private int f19474E = -1;

    /* renamed from: F */
    protected Handler f19475F = new C7054L(this);

    /* renamed from: a */
    protected C7146w f19476a;

    /* renamed from: b */
    private View f19477b;

    /* renamed from: c */
    private View f19478c;

    /* renamed from: d */
    private ImageView f19479d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageView f19480e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f19481f;

    /* renamed from: g */
    private View f19482g;

    /* renamed from: h */
    private ImageView f19483h;

    /* renamed from: i */
    private TextView f19484i;

    /* renamed from: j */
    private TextView f19485j;

    /* renamed from: k */
    private View f19486k;

    /* renamed from: l */
    private View f19487l;

    /* renamed from: m */
    private View f19488m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public TextView f19489n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public TextView f19490o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public View f19491p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public View f19492q;

    /* renamed from: r */
    private C7068b f19493r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C7070d f19494s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C7069c f19495t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public ArrayList<C7112l.C7120h> f19496u;

    /* renamed from: v */
    protected HashMap<String, C7112l.C7120h> f19497v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public String[] f19498w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C7112l.C7123k f19499x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f19500y = false;

    /* renamed from: z */
    private boolean f19501z = false;

    /* renamed from: tw.navin.navinmap.map.T$a */
    private class C7067a implements View.OnClickListener {
        private C7067a() {
        }

        /* synthetic */ C7067a(C7066T t, C7054L l) {
            this();
        }

        public void onClick(View view) {
            if (view.getId() == C6684c.ibtnUserVisionMode) {
                C7066T.this.m26616k();
            } else if (view.getId() == C6684c.ibtnUserWhere) {
                C7066T.this.f19476a.mo21254b();
                if (C7066T.this.f19494s != null) {
                    C7066T.this.f19494s.mo21040a();
                }
            } else if (view.getId() == C6684c.txtCurrentMap) {
                if (C7066T.this.f19496u != null && !C7066T.this.f19496u.isEmpty()) {
                    C6687c.m25417a(C7066T.this.getContext(), C7066T.this.f19498w, C6689e.dialog_select_current_map_title, C6689e.dialog_btn_cancel, new C7064Q(this)).mo2610c();
                }
            } else if (view.getId() == C6684c.tbtnRoute || view.getId() == C6684c.tbtnRouteBarrierFree) {
                boolean z = view.getId() == C6684c.tbtnRouteBarrierFree;
                C7066T.this.mo21094h();
                if (C7066T.this.f19495t != null) {
                    C7066T.this.f19495t.mo21039a(z, true, C7066T.this.f19499x);
                }
            } else if (view.getId() == C6684c.ibtnCloseRouting) {
                C7066T.this.mo21081a((DialogInterface.OnClickListener) new C7065S(this));
            }
        }
    }

    /* renamed from: tw.navin.navinmap.map.T$b */
    interface C7068b {
        /* renamed from: a */
        void mo21031a(C7112l.C7120h hVar);
    }

    /* renamed from: tw.navin.navinmap.map.T$c */
    interface C7069c {
        /* renamed from: a */
        void mo21038a();

        /* renamed from: a */
        void mo21039a(boolean z, boolean z2, C7112l.C7123k kVar);
    }

    /* renamed from: tw.navin.navinmap.map.T$d */
    interface C7070d {
        /* renamed from: a */
        void mo21040a();
    }

    C7066T(Context context) {
        super(context);
        this.f19477b = LayoutInflater.from(context).inflate(C6688d.view_navin_map, this, true);
        C7067a aVar = new C7067a(this, (C7054L) null);
        this.f19479d = (ImageView) this.f19477b.findViewById(C6684c.ibtnUserVisionMode);
        this.f19479d.setOnClickListener(aVar);
        this.f19480e = (ImageView) this.f19477b.findViewById(C6684c.ibtnUserWhere);
        this.f19480e.setOnClickListener(aVar);
        this.f19478c = this.f19477b.findViewById(C6684c.txtCurrentMap);
        this.f19478c.setOnClickListener(aVar);
        this.f19481f = (TextView) this.f19477b.findViewById(C6684c.txtCurrentMap);
        this.f19482g = this.f19477b.findViewById(C6684c.rlayTargetInfo);
        this.f19483h = (ImageView) this.f19477b.findViewById(C6684c.imgTargetIcon);
        this.f19484i = (TextView) this.f19477b.findViewById(C6684c.txtTargetName);
        this.f19485j = (TextView) this.f19477b.findViewById(C6684c.txtTargetMapName);
        ((TextView) this.f19477b.findViewById(C6684c.tbtnRoute)).setOnClickListener(aVar);
        ((TextView) this.f19477b.findViewById(C6684c.tbtnRouteBarrierFree)).setOnClickListener(aVar);
        this.f19486k = this.f19477b.findViewById(C6684c.llayStartRouting);
        this.f19487l = this.f19477b.findViewById(C6684c.ibtnCloseRouting);
        this.f19487l.setOnClickListener(aVar);
        this.f19488m = this.f19477b.findViewById(C6684c.llayRouteIndicator);
        this.f19489n = (TextView) this.f19477b.findViewById(C6684c.txtRouteIndicator);
        this.f19490o = (TextView) this.f19477b.findViewById(C6684c.txtRouteDistanceIndicator);
        this.f19491p = this.f19477b.findViewById(C6684c.pgbMapLoading);
        this.f19492q = this.f19477b.findViewById(C6684c.viewMapViewMask);
        ViewGroup viewGroup = (ViewGroup) this.f19477b.findViewById(C6684c.llayTopView);
        ViewGroup viewGroup2 = (ViewGroup) this.f19477b.findViewById(C6684c.llayBottomView);
        mo21080a(context, (ViewGroup) this.f19477b);
    }

    /* renamed from: a */
    private HashSet<Integer> m26602a(String[] strArr) {
        int i;
        if (strArr == null) {
            return null;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (String str : strArr) {
            if (str.equals("APPAREL")) {
                i = 1;
            } else if (str.equals("SUPPLY")) {
                i = 2;
            } else if (str.equals("SHOE_BAG")) {
                i = 3;
            } else if (str.equals("BOUTIQUE")) {
                i = 4;
            } else if (str.equals("MALL_3C")) {
                i = 5;
            } else if (str.equals("FOOD")) {
                i = 6;
            } else if (str.equals("PETS")) {
                i = 7;
            } else if (str.equals("ENTERTAINMENT")) {
                i = 8;
            } else if (str.equals("SPORTS")) {
                i = 9;
            } else if (str.equals("BOOKS")) {
                i = 10;
            } else if (str.equals("MULTIMEDIA")) {
                i = 11;
            } else if (str.equals("MARKET")) {
                i = 12;
            } else if (str.equals("FURNITURE")) {
                i = 13;
            } else if (str.equals("OTHER")) {
                i = 14;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return hashSet;
    }

    /* renamed from: a */
    private synchronized void mo21110a(boolean z) {
        Handler handler;
        int i;
        if (z) {
            if (this.f19501z && this.f19480e != null && !this.f19480e.isEnabled()) {
                handler = this.f19475F;
                i = C6684c.enableUserWhereButton;
            }
        } else if (this.f19480e != null && this.f19480e.isEnabled()) {
            handler = this.f19475F;
            i = C6684c.disableUserWhereButton;
        }
        handler.sendEmptyMessage(i);
    }

    /* renamed from: b */
    private HashSet<Integer> m26605b(String[] strArr) {
        int i;
        if (strArr == null) {
            return null;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (String str : strArr) {
            if (str.equals("EXIT")) {
                i = 1;
            } else if (str.equals("SAFETY")) {
                i = 2;
            } else if (str.equals("ELEVATOR")) {
                i = 3;
            } else if (str.equals("UPSTAIRS")) {
                i = 4;
            } else if (str.equals("DOWNSTAIRS")) {
                i = 5;
            } else if (str.equals("ESCALATOR_UPSTAIRS")) {
                i = 6;
            } else if (str.equals("ESCALATOR_DOWNSTAIRS")) {
                i = 7;
            } else if (str.equals("AED")) {
                i = 8;
            } else if (str.equals("HYDRANT")) {
                i = 9;
            } else if (str.equals("EXTINGUISHER")) {
                i = 10;
            } else if (str.equals("FIRST_AID")) {
                i = 11;
            } else if (str.equals("RESTROOM")) {
                i = 12;
            } else if (str.equals("MALE_RESTROOM")) {
                i = 13;
            } else if (str.equals("FEMALE_RESTROOM")) {
                i = 14;
            } else if (str.equals("RESTROOM_PARENTS")) {
                i = 15;
            } else if (str.equals("DISABLED_RESTROOM")) {
                i = 16;
            } else if (str.equals("BREASTFEEDING")) {
                i = 17;
            } else if (str.equals("ETICKETING")) {
                i = 18;
            } else if (str.equals("TICKET")) {
                i = 19;
            } else if (str.equals("INFORMATION")) {
                i = 20;
            } else if (str.equals("FOUNTAINS")) {
                i = 21;
            } else if (str.equals("LOCKERS")) {
                i = 22;
            } else if (str.equals("PUBLIC_PHONE")) {
                i = 23;
            } else if (str.equals("ATM")) {
                i = 24;
            } else if (str.equals("BUS")) {
                i = 25;
            } else if (str.equals("PARKING")) {
                i = 26;
            } else if (str.equals("TAXI")) {
                i = 27;
            } else if (str.equals("VIEW_360")) {
                i = 28;
            } else if (str.equals("DISABLED_ELEVATOR")) {
                i = 29;
            } else if (str.equals("THSR")) {
                i = 30;
            } else if (str.equals("TAIWAN_RAILWAY")) {
                i = 31;
            } else if (str.equals("ACCESSIBLE_RAMP")) {
                i = 32;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return hashSet;
    }

    /* renamed from: b */
    private void m26606b(boolean z) {
        ImageView imageView;
        int i;
        if (z) {
            imageView = this.f19479d;
            i = C6668b.icon_direction_on;
        } else {
            imageView = this.f19479d;
            i = C6668b.icon_direction_off;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: j */
    private synchronized void mo21111j() {
        C7112l.C7120h d = C7109ja.m26767a().mo21176d();
        if (d != null) {
            if (d.f19634p != null) {
                d.f19635q.clear();
                Iterator<C7112l.C7124l> it = d.f19634p.iterator();
                while (it.hasNext()) {
                    C7112l.C7124l next = it.next();
                    next.f19663i = (this.f19471B == null || !this.f19471B.contains(Integer.valueOf(next.f19668n))) ? !this.f19473D : this.f19473D;
                    if (next.f19663i) {
                        d.f19635q.add(next);
                    }
                }
            }
            if (d.f19636r != null) {
                d.f19637s.clear();
                Iterator<C7112l.C7117e> it2 = d.f19636r.iterator();
                while (it2.hasNext()) {
                    C7112l.C7117e next2 = it2.next();
                    next2.f19663i = (this.f19472C == null || !this.f19472C.contains(Integer.valueOf(next2.f19608n))) ? !this.f19473D : this.f19473D;
                    if (next2.f19663i) {
                        d.f19637s.add(next2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m26616k() {
        this.f19470A = this.f19476a.mo21253a();
        m26606b(this.f19470A);
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public void mo21078a(float f, float f2) {
        String str;
        int round = Math.round(f);
        String format = String.format("%.01f", new Object[]{Float.valueOf(f2)});
        if (f2 > 1.0f) {
            str = String.format(getContext().getString(C6689e.txt_ind_remaining_distance_pattern), new Object[]{Integer.valueOf(round), format});
        } else {
            str = String.format(getContext().getString(C6689e.txt_ind_remaining_distance_closely_pattern), new Object[]{Integer.valueOf(round)});
        }
        Message message = new Message();
        message.what = C6684c.changeRemainingDistance;
        message.obj = str;
        this.f19475F.sendMessage(message);
    }

    /* renamed from: a */
    public void mo21079a(int i, String str) {
        Message message = new Message();
        message.what = C6684c.changeIndicator;
        message.obj = str;
        message.arg1 = i;
        this.f19475F.sendMessage(message);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21080a(Context context, ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21081a(DialogInterface.OnClickListener onClickListener) {
        C7173l.m26996a(getContext(), -1, C6689e.dialog_leave_routing_msg, true, onClickListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21082a(ArrayList<C7112l.C7120h> arrayList, HashMap<String, C7112l.C7120h> hashMap) {
        this.f19496u = arrayList;
        this.f19497v = hashMap;
        this.f19498w = new String[this.f19496u.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f19498w[i] = arrayList.get(i).f19621c;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21083a(C7112l.C7120h hVar) {
        if (!C7109ja.m26767a().mo21176d().f19619a.equals(hVar.f19619a)) {
            C7068b bVar = this.f19493r;
            if (bVar != null) {
                bVar.mo21031a(hVar);
            }
            mo21090e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21084a(C7112l.C7123k kVar, C7112l.C7120h hVar, boolean z) {
        this.f19499x = kVar;
        if (kVar != null) {
            this.f19482g.setVisibility(0);
            this.f19485j.setText(hVar.f19621c);
            this.f19484i.setText(kVar.f19657c);
            this.f19486k.setVisibility(0);
            int a = C6665e.m25345a().mo17117a(kVar);
            if (a != -1) {
                this.f19483h.setImageResource(a);
            }
        } else {
            this.f19482g.setVisibility(8);
            this.f19486k.setVisibility(8);
        }
        C7146w wVar = this.f19476a;
        if (wVar != null) {
            wVar.mo21252a(kVar, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21085a(String[] strArr, C7079a.C7080a aVar) {
        boolean z = false;
        if (strArr != null && aVar == C7079a.C7080a.MODE_INCLUDE) {
            z = true;
        }
        this.f19473D = z;
        this.f19471B = m26602a(strArr);
        this.f19472C = m26605b(strArr);
        mo21111j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21086a() {
        return this.f19476a != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo21087b() {
        return this.f19500y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo21088c() {
        this.f19477b = null;
        this.f19476a = null;
        this.f19478c = null;
        this.f19478c = null;
        this.f19479d = null;
        this.f19480e = null;
        this.f19481f = null;
        this.f19493r = null;
        this.f19494s = null;
        this.f19495t = null;
        this.f19496u = null;
        this.f19498w = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo21089d() {
        mo21111j();
        ((Activity) getContext()).runOnUiThread(new C7055M(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo21090e() {
        if (this.f19492q.getVisibility() != 0) {
            ((Activity) getContext()).runOnUiThread(new C7056N(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo21091f() {
        if (this.f19492q.getVisibility() != 8) {
            ((Activity) getContext()).runOnUiThread(new C7057O(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo21092g() {
        this.f19488m.setVisibility(0);
        this.f19486k.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public C7112l.C7123k getTargetPoi() {
        return this.f19499x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo21094h() {
        this.f19500y = true;
        m26616k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo21095i() {
        this.f19500y = false;
        this.f19488m.setVisibility(8);
        this.f19499x = null;
        C7146w wVar = this.f19476a;
        if (wVar != null) {
            wVar.mo21252a((C7112l.C7123k) null, false);
        }
        if (this.f19470A) {
            m26606b(false);
            C7146w wVar2 = this.f19476a;
            if (wVar2 != null) {
                wVar2.mo21253a();
            }
            this.f19470A = false;
        }
        mo21084a((C7112l.C7123k) null, (C7112l.C7120h) null, false);
        C7069c cVar = this.f19495t;
        if (cVar != null) {
            cVar.mo21039a(false, false, this.f19499x);
        }
        mo21110a(true);
        this.f19489n.setText(C6689e.txt_ind_keep_going);
        this.f19490o.setText("");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo21095i();
        C7146w wVar = this.f19476a;
        if (wVar != null) {
            removeView(wVar);
            this.f19476a.mo21257e();
            this.f19476a = null;
        }
        super.onDetachedFromWindow();
    }

    public void setBackgroundColor(int i) {
        this.f19474E = i;
        C7146w wVar = this.f19476a;
        if (wVar != null) {
            wVar.setBackgroundColor(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBeaconInRegion(boolean z) {
        this.f19501z = z;
        mo21110a(this.f19501z);
    }

    /* access modifiers changed from: package-private */
    public void setMapView(C7146w wVar) {
        C7146w wVar2 = this.f19476a;
        if (wVar2 != null) {
            removeView(wVar2);
        }
        this.f19476a = wVar;
        wVar.setBackgroundColor(this.f19474E);
        if (wVar != null) {
            addView(wVar, 0, new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnMapChangeListener(C7068b bVar) {
        this.f19493r = bVar;
    }

    /* access modifiers changed from: package-private */
    public void setOnRoutingStateChangListener(C7069c cVar) {
        this.f19495t = cVar;
    }

    /* access modifiers changed from: package-private */
    public void setOnUserPositionClickListener(C7070d dVar) {
        this.f19494s = dVar;
    }
}
