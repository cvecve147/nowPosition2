package p299tw.navin.navinmap.map;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.os.Process;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p101d.p204k.p205a.C6053f;
import p267i.p268a.p269a.C6689e;
import p267i.p268a.p269a.p270a.C6665e;
import p267i.p268a.p269a.p270a.C6667g;
import p267i.p268a.p269a.p273c.C6685a;
import p267i.p274b.p277b.p278a.p279a.C6705b;
import p267i.p274b.p277b.p280b.p281a.C6722c;
import p267i.p274b.p277b.p280b.p281a.C6729j;
import p299tw.navin.navinmap.map.C7066T;
import p299tw.navin.navinmap.map.C7079a;
import p299tw.navin.navinmap.map.C7106ia;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.map.C7143u;
import p299tw.navin.navinmap.map.PMISLMain;
import p299tw.navin.navinmap.map.p300a.C7084c;
import p299tw.navin.navinmap.util.C7157a;
import p299tw.navin.navinmap.util.C7173l;
import p299tw.navin.navinmap.util.MathUtils;

/* renamed from: tw.navin.navinmap.map.F */
class C7030F {

    /* renamed from: a */
    protected static boolean f19330a = false;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f19331A = true;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f19332B;

    /* renamed from: C */
    private boolean f19333C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f19334D;

    /* renamed from: E */
    private C7079a.C7080a f19335E;

    /* renamed from: F */
    private String[] f19336F;

    /* renamed from: G */
    private C7079a.C7080a f19337G;

    /* renamed from: H */
    private HashSet<String> f19338H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f19339I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f19340J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public String f19341K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C6685a f19342L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f19343M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public ArrayList<C7112l.C7123k> f19344N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f19345O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C6729j.C6731b f19346P;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7143u f19347b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7139qa f19348c;

    /* renamed from: d */
    protected PMISLMain f19349d;

    /* renamed from: e */
    protected C7146w f19350e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C7066T f19351f;

    /* renamed from: g */
    protected Activity f19352g;

    /* renamed from: h */
    private C7040j f19353h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C7041k f19354i = null;

    /* renamed from: j */
    private C7039i f19355j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C7042l f19356k = null;

    /* renamed from: l */
    private PMISLMain.C7059a f19357l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C7112l f19358m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public RouteHelper f19359n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C7106ia f19360o = null;

    /* renamed from: p */
    private C7038h f19361p;

    /* renamed from: q */
    private String f19362q = "";

    /* renamed from: r */
    private String f19363r = "";

    /* renamed from: s */
    private String f19364s = "THLight Beacon";
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C7048r f19365t;

    /* renamed from: u */
    private CountDownTimer f19366u;

    /* renamed from: v */
    private int f19367v = 0;

    /* renamed from: w */
    private int f19368w = 1;

    /* renamed from: x */
    private int f19369x = 2;

    /* renamed from: y */
    private int f19370y = 3;

    /* renamed from: z */
    private int f19371z = this.f19367v;

    /* renamed from: tw.navin.navinmap.map.F$a */
    private class C7031a implements C6729j.C6731b {

        /* renamed from: a */
        private String f19372a;

        /* renamed from: b */
        private int f19373b;

        private C7031a() {
            this.f19373b = 0;
        }

        /* synthetic */ C7031a(C7030F f, C7155y yVar) {
            this();
        }

        /* renamed from: a */
        private void m26494a(C7112l.C7119g gVar) {
            if (C7030F.this.f19341K != null) {
                String p = C6667g.m25379p(C7030F.this.f19352g);
                if (p == null || C7173l.m27000a(p, 15)) {
                    C7030F.this.f19348c.mo21234a(C7030F.this.f19341K, gVar);
                }
            }
        }

        /* renamed from: a */
        private synchronized boolean m26495a(ArrayList<C6722c> arrayList, C7112l.C7119g gVar) {
            boolean z;
            HashMap hashMap = new HashMap();
            Iterator<C6722c> it = arrayList.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                C7112l.C7119g gVar2 = (C7112l.C7119g) it.next();
                if (!hashMap.containsKey(gVar2.f19617n)) {
                    C7037g gVar3 = new C7037g(C7030F.this, (C7155y) null);
                    gVar3.f19380a = gVar2.f19617n;
                    gVar3.f19381b = 1;
                    hashMap.put(gVar2.f19617n, gVar3);
                } else {
                    ((C7037g) hashMap.get(gVar2.f19617n)).f19381b++;
                }
            }
            ArrayList arrayList2 = new ArrayList(hashMap.values());
            if (arrayList2.size() > 1) {
                Collections.sort(arrayList2, new C7029E(this));
                C7037g gVar4 = (C7037g) arrayList2.get(0);
                C7037g gVar5 = (C7037g) arrayList2.get(1);
                if (!((C7037g) hashMap.get(gVar.f19617n)).f19380a.equals(gVar4.f19380a) || gVar4.f19381b == gVar5.f19381b) {
                    z = false;
                }
            }
            return z;
        }

        /* renamed from: a */
        public void mo17209a() {
        }

        /* renamed from: a */
        public void mo17210a(C6722c cVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17211a(java.util.ArrayList<p267i.p274b.p277b.p280b.p281a.C6722c> r10) {
            /*
                r9 = this;
                boolean r0 = p299tw.navin.navinmap.map.C7030F.f19330a
                if (r0 == 0) goto L_0x0015
                tw.navin.navinmap.map.F r0 = p299tw.navin.navinmap.map.C7030F.this
                i.b.b.b.a.j$b r0 = r0.f19346P
                if (r0 == 0) goto L_0x0015
                tw.navin.navinmap.map.F r0 = p299tw.navin.navinmap.map.C7030F.this
                i.b.b.b.a.j$b r0 = r0.f19346P
                r0.mo17211a((java.util.ArrayList<p267i.p274b.p277b.p280b.p281a.C6722c>) r10)
            L_0x0015:
                r0 = 0
                if (r10 != 0) goto L_0x0040
                tw.navin.navinmap.map.F r10 = p299tw.navin.navinmap.map.C7030F.this
                p299tw.navin.navinmap.map.C7030F.m26423c((p299tw.navin.navinmap.map.C7030F) r10)
                tw.navin.navinmap.map.F r10 = p299tw.navin.navinmap.map.C7030F.this
                int r10 = r10.f19339I
                r1 = 5
                if (r10 <= r1) goto L_0x003f
                tw.navin.navinmap.map.F r10 = p299tw.navin.navinmap.map.C7030F.this
                int unused = r10.f19339I = r1
                tw.navin.navinmap.map.F r10 = p299tw.navin.navinmap.map.C7030F.this
                boolean unused = r10.f19340J = r0
                tw.navin.navinmap.map.F r10 = p299tw.navin.navinmap.map.C7030F.this
                tw.navin.navinmap.map.T r10 = r10.f19351f
                tw.navin.navinmap.map.F r0 = p299tw.navin.navinmap.map.C7030F.this
                boolean r0 = r0.f19340J
                r10.setBeaconInRegion(r0)
            L_0x003f:
                return
            L_0x0040:
                tw.navin.navinmap.map.F r1 = p299tw.navin.navinmap.map.C7030F.this
                int unused = r1.f19339I = r0
                tw.navin.navinmap.map.F r1 = p299tw.navin.navinmap.map.C7030F.this
                r2 = 1
                boolean unused = r1.f19340J = r2
                tw.navin.navinmap.map.F r1 = p299tw.navin.navinmap.map.C7030F.this
                tw.navin.navinmap.map.T r1 = r1.f19351f
                tw.navin.navinmap.map.F r3 = p299tw.navin.navinmap.map.C7030F.this
                boolean r3 = r3.f19340J
                r1.setBeaconInRegion(r3)
                int r1 = r10.size()
                if (r1 <= 0) goto L_0x0069
                java.lang.Object r1 = r10.get(r0)
                tw.navin.navinmap.map.l$g r1 = (p299tw.navin.navinmap.map.C7112l.C7119g) r1
                r9.m26494a((p299tw.navin.navinmap.map.C7112l.C7119g) r1)
            L_0x0069:
                r1 = 0
                java.util.Iterator r3 = r10.iterator()
            L_0x006e:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x00e1
                java.lang.Object r4 = r3.next()
                tw.navin.navinmap.map.l$g r4 = (p299tw.navin.navinmap.map.C7112l.C7119g) r4
                double r5 = r4.f18679d
                r7 = 4627730092099895296(0x4039000000000000, double:25.0)
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x006e
                java.lang.String r3 = r9.f19372a
                if (r3 == 0) goto L_0x00c8
                java.lang.String r3 = r4.f19617n
                tw.navin.navinmap.map.ja r5 = p299tw.navin.navinmap.map.C7109ja.m26767a()
                tw.navin.navinmap.map.l$h r5 = r5.mo21175c()
                java.lang.String r5 = r5.f19619a
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x00c1
                java.lang.String r3 = r4.f19617n
                java.lang.String r5 = r9.f19372a
                boolean r3 = r3.equals(r5)
                if (r3 == 0) goto L_0x00c1
                boolean r10 = r9.m26495a(r10, r4)
                if (r10 == 0) goto L_0x00b5
                int r10 = r9.f19373b
                int r10 = r10 + r2
                r9.f19373b = r10
                int r10 = r9.f19373b
                r3 = 3
                if (r10 < r3) goto L_0x00cf
                r9.f19373b = r0
                goto L_0x00cc
            L_0x00b5:
                int r10 = r9.f19373b
                int r10 = r10 - r2
                r9.f19373b = r10
                int r10 = r9.f19373b
                if (r10 >= 0) goto L_0x00cf
                r9.f19373b = r0
                goto L_0x00cf
            L_0x00c1:
                r9.f19373b = r0
                java.lang.String r10 = r4.f19617n
                r9.f19372a = r10
                goto L_0x00cf
            L_0x00c8:
                java.lang.String r10 = r4.f19617n
                r9.f19372a = r10
            L_0x00cc:
                java.lang.String r10 = r9.f19372a
                r1 = r10
            L_0x00cf:
                tw.navin.navinmap.map.F r10 = p299tw.navin.navinmap.map.C7030F.this
                boolean r10 = r10.f19331A
                if (r10 == 0) goto L_0x00e1
                tw.navin.navinmap.map.F r10 = p299tw.navin.navinmap.map.C7030F.this
                r10.m26428d((boolean) r0)
                tw.navin.navinmap.map.F r10 = p299tw.navin.navinmap.map.C7030F.this
                boolean unused = r10.f19332B = r0
            L_0x00e1:
                if (r1 == 0) goto L_0x00ef
                r9.f19372a = r1
                tw.navin.navinmap.map.F r10 = p299tw.navin.navinmap.map.C7030F.this
                boolean r3 = r10.f19331A
                r2 = r2 ^ r3
                r10.m26410a((java.lang.String) r1, (boolean) r0, (boolean) r0, (boolean) r2)
            L_0x00ef:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.C7030F.C7031a.mo17211a(java.util.ArrayList):void");
        }

        /* renamed from: b */
        public void mo17212b() {
        }

        /* renamed from: g */
        public void mo17213g() {
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$b */
    private class C7032b implements C7143u.C7144a {
        private C7032b() {
        }

        /* synthetic */ C7032b(C7030F f, C7155y yVar) {
            this();
        }

        /* renamed from: a */
        public void mo21018a() {
            C7112l.C7120h i = C7030F.this.f19347b.mo21249i();
            C7109ja.m26767a().mo21171a(i);
            C7109ja.m26767a().mo21173b(i);
            C6665e.m25345a().mo17119a((Context) C7030F.this.f19352g, (ArrayList<? extends C7112l.C7123k>) i.f19634p);
            C6665e.m25345a().mo17119a((Context) C7030F.this.f19352g, (ArrayList<? extends C7112l.C7123k>) i.f19636r);
            C7030F.this.f19351f.mo21082a(C7030F.this.f19347b.mo21244d(), C7030F.this.f19347b.mo21243c());
            C7030F.this.f19351f.mo21089d();
            C7030F.this.f19358m.mo21184a(C7030F.this.f19347b.mo21245e());
            C7030F.this.f19360o.mo21167a(C7030F.this.f19347b.mo21243c());
            C7030F.this.m26448m();
        }

        /* renamed from: a */
        public void mo21019a(C6705b.C6706a aVar) {
            C7030F.this.m26409a(aVar);
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$c */
    private class C7033c extends AsyncTask<C7044n, Void, C7112l.C7123k> {
        private C7033c() {
        }

        /* synthetic */ C7033c(C7030F f, C7155y yVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C7112l.C7123k doInBackground(C7044n... nVarArr) {
            Process.setThreadPriority(-19);
            Thread.currentThread().setPriority(10);
            C7044n nVar = nVarArr[0];
            return C7030F.this.f19359n.mo21071a(C7030F.this.f19347b.mo21243c(), C7030F.this.f19344N, nVar.f19385a, new PointF(nVar.f19386b, nVar.f19387c));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(C7112l.C7123k kVar) {
            Activity activity;
            int i;
            C7030F.this.f19342L.dismiss();
            if (kVar != null) {
                C7109ja.m26767a().mo21172a(true);
                C7030F.this.f19351f.mo21084a(kVar, C7030F.this.f19347b.mo21238a(kVar.f19660f), false);
                C7030F.this.f19351f.mo21094h();
                C7030F.this.m26450n();
                return;
            }
            if (C7030F.this.f19345O) {
                activity = C7030F.this.f19352g;
                i = C6689e.dialog_barrier_free_route_not_found_msg;
            } else {
                activity = C7030F.this.f19352g;
                i = C6689e.pdg_search_nearest_poi_not_found;
            }
            C7173l.m26996a((Context) activity, -1, i, false, (DialogInterface.OnClickListener) null);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C7030F.this.f19342L.show();
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$d */
    private class C7034d implements PMISLMain.C7059a {
        private C7034d() {
        }

        /* synthetic */ C7034d(C7030F f, C7155y yVar) {
            this();
        }

        /* renamed from: a */
        private void m26505a(Path path) {
            boolean unused = C7030F.this.f19334D = path != null;
            if (C7030F.this.f19334D) {
                C7030F.this.m26426c(false, false);
            }
        }

        /* renamed from: a */
        public void mo21025a(float f) {
        }

        /* renamed from: a */
        public void mo21026a(Path path, Path path2) {
            m26505a(path);
        }

        /* renamed from: a */
        public void mo21027a(Path path, Path path2, PointF pointF, boolean z) {
            m26505a(path);
        }

        /* renamed from: a */
        public void mo21028a(PointF pointF) {
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$e */
    private class C7035e implements PMISLMain.C7061c {
        private C7035e() {
        }

        /* synthetic */ C7035e(C7030F f, C7155y yVar) {
            this();
        }

        /* renamed from: a */
        public void mo21029a(String str) {
            if (C7030F.this.f19354i != null) {
                C7030F.this.f19354i.mo21035a(str);
            }
        }

        /* renamed from: a */
        public void mo21030a(String str, float f, float f2) {
            if (C7030F.this.f19340J) {
                C7030F.this.mo20992a(str, f, f2);
                C7030F.this.m26425c(true);
                if (C7030F.this.f19343M && f != -1.0f) {
                    boolean unused = C7030F.this.f19343M = false;
                    C7044n nVar = new C7044n(C7030F.this, (C7155y) null);
                    nVar.f19385a = str;
                    nVar.f19386b = f;
                    nVar.f19387c = f2;
                    C7030F.this.f19352g.runOnUiThread(new C7049G(this, nVar));
                    return;
                }
                return;
            }
            C7030F.this.mo20992a(str, -1.0f, -1.0f);
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$f */
    private class C7036f implements C7066T.C7068b {
        private C7036f() {
        }

        /* synthetic */ C7036f(C7030F f, C7155y yVar) {
            this();
        }

        /* renamed from: a */
        public void mo21031a(C7112l.C7120h hVar) {
            C7030F.this.m26430e(false);
            C7030F.this.m26416a(hVar, false, false, false, true);
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$g */
    private class C7037g {

        /* renamed from: a */
        String f19380a;

        /* renamed from: b */
        int f19381b;

        private C7037g() {
        }

        /* synthetic */ C7037g(C7030F f, C7155y yVar) {
            this();
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$h */
    private class C7038h implements C7084c.C7085a {
        private C7038h() {
        }

        /* synthetic */ C7038h(C7030F f, C7155y yVar) {
            this();
        }

        /* renamed from: a */
        public void mo21032a() {
            C7030F f = C7030F.this;
            if (f.f19350e != null) {
                f.m26426c(false, false);
            }
        }

        /* renamed from: b */
        public void mo21033b() {
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$i */
    interface C7039i {
        /* renamed from: a */
        void mo21034a(C7095d dVar);
    }

    /* renamed from: tw.navin.navinmap.map.F$j */
    public interface C7040j {
        /* renamed from: a */
        void mo5567a();

        /* renamed from: a */
        void mo5599a(String str, String str2);
    }

    /* renamed from: tw.navin.navinmap.map.F$k */
    interface C7041k {
        /* renamed from: a */
        void mo21035a(String str);
    }

    /* renamed from: tw.navin.navinmap.map.F$l */
    interface C7042l {
        /* renamed from: a */
        void mo5548a();
    }

    /* renamed from: tw.navin.navinmap.map.F$m */
    private class C7043m implements C7104ha {
        private C7043m() {
        }

        /* synthetic */ C7043m(C7030F f, C7155y yVar) {
            this();
        }

        /* renamed from: a */
        public void mo21036a(C7112l.C7123k kVar) {
            C7030F.this.mo20997a(kVar, false);
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$n */
    private class C7044n {

        /* renamed from: a */
        String f19385a;

        /* renamed from: b */
        float f19386b;

        /* renamed from: c */
        float f19387c;

        private C7044n() {
        }

        /* synthetic */ C7044n(C7030F f, C7155y yVar) {
            this();
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$o */
    private class C7045o implements PMISLMain.C7062d {
        private C7045o() {
        }

        /* synthetic */ C7045o(C7030F f, C7155y yVar) {
            this();
        }

        /* renamed from: a */
        public void mo21037a() {
            C7030F.this.f19352g.runOnUiThread(new C7050H(this));
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$p */
    private class C7046p implements C7066T.C7069c {
        private C7046p() {
        }

        /* synthetic */ C7046p(C7030F f, C7155y yVar) {
            this();
        }

        /* renamed from: a */
        public void mo21038a() {
            if (C7030F.this.f19356k != null) {
                C7030F.this.f19356k.mo5548a();
            }
        }

        /* renamed from: a */
        public void mo21039a(boolean z, boolean z2, C7112l.C7123k kVar) {
            if (z2) {
                C7109ja.m26767a().mo21172a(true);
                boolean unused = C7030F.this.f19345O = z;
                C7030F.this.f19359n.mo21073a(C7103h.m26751a(z));
                C7030F.this.m26450n();
                return;
            }
            C7109ja.m26767a().mo21172a(false);
            C7030F.this.f19349d.mo21053a((PointF) null, (String) null);
            if (C7030F.this.f19365t != null) {
                C7030F.this.f19365t.m26525a();
                C7048r unused2 = C7030F.this.f19365t = null;
            }
            C7030F.this.f19360o.mo21164a();
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$q */
    private class C7047q implements C7066T.C7070d {
        private C7047q() {
        }

        /* synthetic */ C7047q(C7030F f, C7155y yVar) {
            this();
        }

        /* renamed from: a */
        public void mo21040a() {
            new C6053f(C7030F.this.f19352g).mo16004c("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").mo16543b(new C7051I(this));
        }
    }

    /* renamed from: tw.navin.navinmap.map.F$r */
    private class C7048r extends CountDownTimer {

        /* renamed from: a */
        boolean f19392a = false;

        /* renamed from: b */
        Object f19393b = new Object();

        public C7048r() {
            super(5000, 500);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m26525a() {
            synchronized (this.f19393b) {
                if (!this.f19392a) {
                    this.f19392a = true;
                    cancel();
                    C7048r unused = C7030F.this.f19365t = null;
                }
            }
        }

        /* renamed from: b */
        private void m26527b() {
            C7030F.this.f19352g.runOnUiThread(new C7052J(this));
        }

        public void onFinish() {
            synchronized (this.f19393b) {
                if (!this.f19392a && !C7030F.this.m26452o()) {
                    this.f19392a = true;
                    m26527b();
                    C7030F.this.m26428d(false);
                    C7048r unused = C7030F.this.f19365t = null;
                    C7030F.this.m26426c(false, true);
                }
            }
        }

        public void onTick(long j) {
            synchronized (this.f19393b) {
                if (!this.f19392a && C7030F.this.m26452o()) {
                    this.f19392a = true;
                    cancel();
                    C7030F.this.m26428d(false);
                    C7048r unused = C7030F.this.f19365t = null;
                }
            }
        }
    }

    static {
        System.loadLibrary("navinmap");
        MathUtils.init();
    }

    C7030F(Activity activity, String str, String str2) {
        C7079a.C7080a aVar = C7079a.C7080a.MODE_INCLUDE;
        this.f19335E = aVar;
        this.f19336F = null;
        this.f19337G = aVar;
        this.f19338H = null;
        this.f19339I = 0;
        this.f19343M = false;
        this.f19345O = false;
        this.f19352g = activity;
        C6667g.m25355a((Context) activity, str, str2);
        mo21000a((String[]) null, C7079a.C7080a.MODE_INCLUDE);
        mo21008b((String[]) null, C7079a.C7080a.MODE_INCLUDE);
        this.f19347b = new C7143u(activity, new C7032b(this, (C7155y) null));
        this.f19348c = new C7139qa(activity);
        this.f19351f = mo20990a(activity);
        this.f19351f.setOnMapChangeListener(new C7036f(this, (C7155y) null));
        this.f19351f.setOnUserPositionClickListener(new C7047q(this, (C7155y) null));
        this.f19351f.setOnRoutingStateChangListener(new C7046p(this, (C7155y) null));
        this.f19358m = new C7112l(this.f19347b.mo21245e());
        this.f19358m.mo21182a((C6729j.C6731b) new C7031a(this, (C7155y) null));
        this.f19360o = new C7106ia();
        this.f19360o.mo21168a((C7106ia.C7107a) this.f19351f);
        this.f19361p = new C7038h(this, (C7155y) null);
        this.f19332B = true;
        this.f19342L = new C6685a(this.f19352g);
        this.f19342L.setCancelable(false);
        this.f19357l = new C7034d(this, (C7155y) null);
        C7157a.m26966b(String.format("%s SDK Version:%s", new Object[]{mo20988a(), mo21005b()}));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26409a(C6705b.C6706a aVar) {
        this.f19371z = this.f19367v;
        C7040j jVar = this.f19353h;
        if (jVar != null) {
            jVar.mo5599a(aVar.f18623b, aVar.f18622a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m26410a(String str, boolean z, boolean z2, boolean z3) {
        m26416a(this.f19347b.mo21238a(str), z, z2, z3, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m26416a(C7112l.C7120h hVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            C7112l.C7120h d = C7109ja.m26767a().mo21176d();
            if (d != null && d.f19619a.equals(hVar.f19619a)) {
                return;
            }
        } else {
            C7112l.C7120h c = C7109ja.m26767a().mo21175c();
            if (!z && c != null && c.f19619a.equals(hVar.f19619a)) {
                return;
            }
        }
        if (!z3) {
            m26426c(true, false);
            C7109ja.m26767a().mo21173b(hVar);
        }
        if (!z4) {
            C7109ja.m26767a().mo21171a(hVar);
        }
        C6665e.m25345a().mo17119a((Context) this.f19352g, (ArrayList<? extends C7112l.C7123k>) hVar.f19634p);
        C6665e.m25345a().mo17119a((Context) this.f19352g, (ArrayList<? extends C7112l.C7123k>) hVar.f19636r);
        this.f19352g.runOnUiThread(new C7026B(this, z3, z4, z2));
    }

    /* renamed from: a */
    private void m26417a(C7112l.C7123k kVar, boolean z, boolean z2) {
        if (kVar != null) {
            m26428d(false);
            m26430e(false);
            C7112l.C7120h a = this.f19347b.mo21238a(kVar.f19660f);
            if (z2 || !C7109ja.m26767a().mo21176d().f19619a.equals(a.f19619a)) {
                m26416a(a, z2, false, false, false);
                m26426c(false, false);
            }
            this.f19351f.mo21084a(kVar, a, z);
            return;
        }
        this.f19351f.mo21084a((C7112l.C7123k) null, (C7112l.C7120h) null, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21124b(boolean z) {
        int i = this.f19371z;
        if (i == this.f19367v) {
            C7157a.m26966b("Map has not been loaded..");
        } else if (this.f19358m != null) {
            if (i == this.f19368w || i == this.f19370y) {
                this.f19358m.mo21181a(this.f19352g, this.f19364s);
                this.f19371z = this.f19369x;
            }
            if (!C6667g.m25381r(this.f19352g)) {
                ((C7076Z) this.f19351f).mo21111j();
            }
            if (z) {
                m26444k();
            } else {
                m26428d(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26422b(boolean z, boolean z2) {
        C7146w wVar;
        PMISLMain pMISLMain;
        if (this.f19371z != this.f19367v) {
            this.f19371z = this.f19368w;
        }
        if (!z2 && (pMISLMain = this.f19349d) != null) {
            this.f19358m.mo21186b((C6729j.C6731b) pMISLMain);
            this.f19349d.mo21063e();
            this.f19349d = null;
        }
        if (!z && (wVar = this.f19350e) != null) {
            wVar.mo21258f();
            this.f19350e.mo21223a(this.f19352g, C7109ja.m26767a().mo21176d(), (C7084c.C7085a) this.f19361p);
        }
        this.f19334D = false;
    }

    /* renamed from: c */
    static /* synthetic */ int m26423c(C7030F f) {
        int i = f.f19339I;
        f.f19339I = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m26425c(boolean z) {
        this.f19333C = z;
        C7146w wVar = this.f19350e;
        if (wVar != null) {
            wVar.setReadyToShow(z);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m26426c(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            tw.navin.navinmap.map.w r0 = r1.f19350e     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x002d
            tw.navin.navinmap.map.w r0 = r1.f19350e     // Catch:{ all -> 0x0034 }
            boolean r0 = r0.mo21255c()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x002d
            boolean r0 = r1.f19331A     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r1.f19333C     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x002d
        L_0x0015:
            if (r2 != 0) goto L_0x002d
            if (r3 != 0) goto L_0x0027
            tw.navin.navinmap.map.T r2 = r1.f19351f     // Catch:{ all -> 0x0034 }
            boolean r2 = r2.mo21087b()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0027
            boolean r2 = r1.f19334D     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0027
            monitor-exit(r1)
            return
        L_0x0027:
            tw.navin.navinmap.map.T r2 = r1.f19351f     // Catch:{ all -> 0x0034 }
            r2.mo21091f()     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x002d:
            tw.navin.navinmap.map.T r2 = r1.f19351f     // Catch:{ all -> 0x0034 }
            r2.mo21090e()     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.C7030F.m26426c(boolean, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m26428d(boolean z) {
        if (this.f19366u != null) {
            if (z) {
                this.f19343M = false;
                if (this.f19351f.mo21086a()) {
                    C7173l.m26996a((Context) this.f19352g, -1, C6689e.dialog_not_in_beacon_region_msg, false, (DialogInterface.OnClickListener) null);
                }
            } else {
                this.f19366u.cancel();
            }
            this.f19366u = null;
        }
        m26425c(true);
        m26426c(false, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m26430e(boolean z) {
        this.f19331A = z;
    }

    /* renamed from: f */
    private void m26433f(boolean z) {
        this.f19345O = z;
        this.f19359n.mo21073a(C7103h.m26751a(this.f19345O));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public synchronized void m26444k() {
        if (this.f19366u != null) {
            this.f19366u.cancel();
            this.f19366u = null;
        }
        if (this.f19351f.mo21086a() && this.f19332B) {
            this.f19366u = new C7155y(this, 7000, 7000).start();
            m26426c(false, false);
        }
    }

    /* renamed from: l */
    private void m26446l() {
        C7146w wVar = this.f19350e;
        if (wVar != null) {
            PMISLMain pMISLMain = this.f19349d;
            if (pMISLMain != null) {
                pMISLMain.mo21060b((PMISLMain.C7059a) wVar);
                this.f19349d.mo21056a((PMISLMain.C7060b) null);
            }
            this.f19350e.mo21257e();
            this.f19350e = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m26448m() {
        this.f19371z = this.f19368w;
        mo20999a(false, false);
        C7040j jVar = this.f19353h;
        if (jVar != null) {
            jVar.mo5567a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m26450n() {
        new C6053f(this.f19352g).mo16004c("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").mo16543b(new C7027C(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public synchronized boolean m26452o() {
        if (!this.f19340J) {
            return false;
        }
        this.f19351f.mo21092g();
        m26430e(true);
        m26416a(C7109ja.m26767a().mo21175c(), true, true, false, false);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo20987a(C7112l.C7120h hVar) {
        if (this.f19371z != this.f19367v) {
            if (this.f19350e != null) {
                m26446l();
            }
            this.f19350e = mo21006b(this.f19352g);
            this.f19350e.setOnPoiSelectListener(new C7043m(this, (C7155y) null));
            this.f19350e.mo21223a(this.f19352g, hVar, (C7084c.C7085a) this.f19361p);
            this.f19349d.mo21055a((PMISLMain.C7059a) this.f19350e);
            this.f19351f.setMapView(this.f19350e);
            C7112l.C7123k targetPoi = this.f19351f.getTargetPoi();
            if (targetPoi != null && C7109ja.m26767a().mo21174b()) {
                PMISLMain pMISLMain = this.f19349d;
                PointF pointF = targetPoi.f19661g;
                pMISLMain.mo21053a(new PointF(pointF.x, pointF.y), targetPoi.f19660f);
                this.f19350e.mo21252a(this.f19351f.getTargetPoi(), true);
            }
            this.f19332B = true;
            return this.f19351f;
        }
        C7157a.m26966b("## Map has not been loaded..");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo20988a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PMISLMain mo20989a(Activity activity, String str, String str2, RouteHelper routeHelper) {
        return new PMISLMain(activity, str, str2, routeHelper);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7066T mo20990a(Activity activity) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20991a(String str) {
        this.f19341K = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20992a(String str, float f, float f2) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20993a(C7040j jVar) {
        this.f19353h = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20994a(C7042l lVar) {
        this.f19356k = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20995a(C7101g gVar) {
        String[] strArr;
        C7079a.C7080a aVar;
        if (C7028D.f19328a[gVar.ordinal()] != 2) {
            strArr = new String[]{"SAFETY", "AED", "HYDRANT", "EXTINGUISHER", "FIRST_AID"};
            aVar = C7079a.C7080a.MODE_EXCLUDE;
        } else {
            strArr = new String[]{"EXIT", "SAFETY", "AED", "HYDRANT", "EXTINGUISHER", "FIRST_AID"};
            aVar = C7079a.C7080a.MODE_INCLUDE;
        }
        mo21000a(strArr, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20996a(C7112l.C7123k kVar) {
        m26417a(kVar, true, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20997a(C7112l.C7123k kVar, boolean z) {
        if (!(this.f19355j == null || kVar == null)) {
            C7112l.C7120h a = this.f19347b.mo21238a(kVar.f19660f);
            C7095d dVar = new C7095d();
            dVar.mo21135b(kVar.f19656b);
            dVar.mo21149i(kVar.f19662h);
            dVar.mo21131a(kVar.f19657c);
            dVar.mo21145g(kVar.f19658d);
            dVar.mo21147h(kVar.f19659e);
            dVar.mo21139d(a.f19619a);
            dVar.mo21137c(a.f19621c);
            dVar.mo21141e(a.f19622d);
            dVar.mo21143f(a.f19623e);
            dVar.mo21130a(kVar instanceof C7112l.C7117e ? 2 : 1);
            dVar.mo21129a(kVar.f19661g.x);
            dVar.mo21134b(kVar.f19661g.y);
            this.f19355j.mo21034a(dVar);
        }
        if (!this.f19351f.mo21087b()) {
            m26417a(kVar, false, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20998a(boolean z) {
        this.f19360o.mo21169a(z);
        if (z) {
            this.f19360o.mo21165a((Context) this.f19352g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20999a(boolean z, boolean z2) {
        if (this.f19359n == null) {
            this.f19359n = new RouteHelper(this.f19347b.mo21243c());
            if (!(this.f19347b.mo21246f() == null || this.f19347b.mo21247g() == null)) {
                this.f19359n.mo21072a(this.f19347b.mo21246f(), this.f19347b.mo21247g(), this.f19338H);
            }
        }
        if (this.f19349d == null) {
            this.f19349d = mo20989a(this.f19352g, this.f19362q, this.f19363r, this.f19359n);
            this.f19349d.mo21057a((PMISLMain.C7061c) new C7035e(this, (C7155y) null));
            this.f19349d.mo21055a(this.f19357l);
            this.f19358m.mo21182a((C6729j.C6731b) this.f19349d);
            C7146w wVar = this.f19350e;
            if (wVar != null) {
                this.f19349d.mo21055a((PMISLMain.C7059a) wVar);
            }
        }
        C7112l.C7120h c = C7109ja.m26767a().mo21175c();
        if (c != null && !z2) {
            this.f19358m.mo21183a(c.f19619a);
            this.f19349d.mo21058a(c, this.f19347b.mo21243c(), this.f19347b.mo21246f(), this.f19347b.mo21247g(), new C7045o(this, (C7155y) null), this.f19338H, this.f19360o);
        }
        C7112l.C7123k targetPoi = this.f19351f.getTargetPoi();
        if (targetPoi != null && C7109ja.m26767a().mo21174b() && !z) {
            PMISLMain pMISLMain = this.f19349d;
            PointF pointF = targetPoi.f19661g;
            pMISLMain.mo21053a(new PointF(pointF.x, pointF.y), targetPoi.f19660f);
            C7146w wVar2 = this.f19350e;
            if (wVar2 != null) {
                wVar2.mo21252a(this.f19351f.getTargetPoi(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21000a(String[] strArr, C7079a.C7080a aVar) {
        this.f19336F = strArr;
        this.f19335E = aVar;
        C7066T t = this.f19351f;
        if (t != null) {
            t.mo21085a(this.f19336F, this.f19335E);
        }
        C7143u uVar = this.f19347b;
        if (uVar != null && uVar.mo21244d() != null) {
            Iterator<C7112l.C7120h> it = this.f19347b.mo21244d().iterator();
            while (it.hasNext()) {
                it.next().f19630l = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        r6 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        r0.add(r6);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo21001a(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.f19371z
            int r1 = r5.f19367v
            r2 = 0
            if (r0 == r1) goto L_0x00a6
            if (r6 == 0) goto L_0x00a6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = -1
            int r3 = r6.hashCode()
            r4 = 1
            switch(r3) {
                case -584026975: goto L_0x0054;
                case -477240487: goto L_0x004a;
                case 65146: goto L_0x0040;
                case 2142494: goto L_0x0036;
                case 651285778: goto L_0x002c;
                case 1056685115: goto L_0x0022;
                case 1341577794: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x005e
        L_0x0018:
            java.lang.String r3 = "FEMALE_RESTROOM"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x005e
            r6 = 2
            goto L_0x005f
        L_0x0022:
            java.lang.String r3 = "LOCKERS"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x005e
            r6 = 5
            goto L_0x005f
        L_0x002c:
            java.lang.String r3 = "DISABLED_RESTROOM"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x005e
            r6 = 4
            goto L_0x005f
        L_0x0036:
            java.lang.String r3 = "EXIT"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x005e
            r6 = r2
            goto L_0x005f
        L_0x0040:
            java.lang.String r3 = "ATM"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x005e
            r6 = 6
            goto L_0x005f
        L_0x004a:
            java.lang.String r3 = "RESTROOM_PARENTS"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x005e
            r6 = 3
            goto L_0x005f
        L_0x0054:
            java.lang.String r3 = "MALE_RESTROOM"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x005e
            r6 = r4
            goto L_0x005f
        L_0x005e:
            r6 = r1
        L_0x005f:
            r1 = 12
            switch(r6) {
                case 0: goto L_0x0089;
                case 1: goto L_0x007b;
                case 2: goto L_0x0071;
                case 3: goto L_0x006e;
                case 4: goto L_0x006b;
                case 5: goto L_0x0068;
                case 6: goto L_0x0065;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x0090
        L_0x0065:
            r6 = 24
            goto L_0x0084
        L_0x0068:
            r6 = 22
            goto L_0x0084
        L_0x006b:
            r6 = 16
            goto L_0x0084
        L_0x006e:
            r6 = 15
            goto L_0x0084
        L_0x0071:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r0.add(r6)
            r6 = 14
            goto L_0x0084
        L_0x007b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r0.add(r6)
            r6 = 13
        L_0x0084:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x008d
        L_0x0089:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
        L_0x008d:
            r0.add(r6)
        L_0x0090:
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L_0x00a6
            tw.navin.navinmap.map.u r6 = r5.f19347b
            java.util.ArrayList r6 = r6.mo21237a((java.util.ArrayList<java.lang.Integer>) r0)
            if (r6 == 0) goto L_0x00a6
            r5.m26433f((boolean) r7)
            r5.f19344N = r6
            r5.f19343M = r4
            return r4
        L_0x00a6:
            r5.f19343M = r2
            r6 = 0
            r5.f19344N = r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.C7030F.mo21001a(java.lang.String, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21002a(List<C7095d> list) {
        if (this.f19371z == this.f19367v || list == null) {
            return false;
        }
        for (C7095d a : list) {
            C7112l.C7123k a2 = this.f19347b.mo21239a(a);
            if (a2 != null) {
                a2.f19665k = true;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21003a(List<C7095d> list, boolean z) {
        if (!(this.f19371z == this.f19367v || list == null)) {
            ArrayList<C7112l.C7123k> arrayList = new ArrayList<>();
            for (C7095d a : list) {
                C7112l.C7123k a2 = this.f19347b.mo21239a(a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (arrayList.size() > 0) {
                m26433f(z);
                this.f19344N = arrayList;
                this.f19343M = true;
                return true;
            }
        }
        this.f19343M = false;
        this.f19344N = null;
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21004a(C7095d dVar) {
        C7112l.C7123k a = this.f19347b.mo21239a(dVar);
        if (a == null) {
            return false;
        }
        if (this.f19350e == null || !C7109ja.m26767a().mo21174b()) {
            mo20996a(a);
            return true;
        }
        this.f19351f.mo21081a((DialogInterface.OnClickListener) new C7156z(this, a));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo21005b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C7146w mo21006b(Activity activity) {
        return new C7146w(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21007b(C7112l.C7120h hVar) {
        m26430e(false);
        m26416a(hVar, false, false, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21008b(String[] strArr, C7079a.C7080a aVar) {
        this.f19338H = C7103h.m26752a(strArr, aVar);
        PMISLMain pMISLMain = this.f19349d;
        if (pMISLMain != null) {
            pMISLMain.mo21054a(this.f19338H);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo21009b(String str) {
        C7112l.C7120h b = this.f19347b.mo21241b(str);
        if (b == null) {
            return false;
        }
        if (this.f19350e == null || !C7109ja.m26767a().mo21174b()) {
            mo21007b(b);
            return true;
        }
        this.f19351f.mo21081a((DialogInterface.OnClickListener) new C7025A(this, b));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<C7095d> mo21010c() {
        return this.f19347b.mo21248h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public View mo21011d() {
        return mo20987a(C7109ja.m26767a().mo21176d());
    }

    /* renamed from: e */
    public void mo21012e() {
        this.f19347b.mo21242b();
    }

    /* renamed from: f */
    public void mo21013f() {
        if (this.f19371z != this.f19367v) {
            PMISLMain pMISLMain = this.f19349d;
            if (pMISLMain != null) {
                pMISLMain.mo21062d();
            }
            if (this.f19371z == this.f19369x) {
                mo21017j();
                this.f19371z = this.f19370y;
            }
        }
    }

    /* renamed from: g */
    public void mo21014g() {
        mo21017j();
        m26428d(false);
        C7066T t = this.f19351f;
        if (t != null) {
            t.mo21088c();
            this.f19351f = null;
        }
        if (this.f19350e != null) {
            m26446l();
        }
        PMISLMain pMISLMain = this.f19349d;
        if (pMISLMain != null) {
            pMISLMain.mo21063e();
            this.f19349d.mo21057a((PMISLMain.C7061c) null);
            this.f19349d = null;
        }
        C7112l lVar = this.f19358m;
        if (lVar != null) {
            lVar.mo21180a();
            this.f19358m.mo21185b();
            this.f19358m = null;
        }
        C7048r rVar = this.f19365t;
        if (rVar != null) {
            rVar.m26525a();
            this.f19365t = null;
        }
        CountDownTimer countDownTimer = this.f19366u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f19366u = null;
        }
        C7106ia iaVar = this.f19360o;
        if (iaVar != null) {
            iaVar.mo21170b();
            this.f19360o = null;
        }
        C6665e.m25345a().mo17121c();
        C7139qa qaVar = this.f19348c;
        if (qaVar != null) {
            qaVar.mo21219b();
            this.f19348c = null;
        }
        C6685a aVar = this.f19342L;
        if (aVar != null) {
            if (aVar.isShowing()) {
                this.f19342L.dismiss();
            }
            this.f19342L = null;
        }
        C7143u uVar = this.f19347b;
        if (uVar != null) {
            uVar.mo21240a();
            this.f19347b = null;
        }
        this.f19352g = null;
    }

    /* renamed from: h */
    public void mo21015h() {
        if (this.f19371z != this.f19367v) {
            PMISLMain pMISLMain = this.f19349d;
            if (pMISLMain != null) {
                pMISLMain.mo21061c();
            }
            if (this.f19371z == this.f19370y) {
                mo21016i();
            }
        }
    }

    /* renamed from: i */
    public void mo21016i() {
        mo21124b(true);
    }

    /* renamed from: j */
    public void mo21017j() {
        int i = this.f19371z;
        if (i == this.f19367v) {
            C7157a.m26966b("Map has not been loaded..");
        } else if (this.f19358m != null && i == this.f19369x) {
            m26428d(false);
            this.f19358m.mo21180a();
            this.f19371z = this.f19368w;
        }
    }
}
