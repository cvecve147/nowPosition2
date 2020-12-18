package p299tw.navin.navinmap.map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import p267i.p274b.p277b.p280b.p281a.C6722c;
import p267i.p274b.p277b.p280b.p281a.C6729j;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.util.C7161e;

/* renamed from: tw.navin.navinmap.map.PMISLMain */
class PMISLMain implements C6729j.C6731b {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f19407A = null;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f19408B = null;

    /* renamed from: C */
    private ArrayList<C7112l.C7122j> f19409C;

    /* renamed from: D */
    private ArrayList<C7112l.C7121i> f19410D;

    /* renamed from: E */
    private HashMap<String, C7112l.C7120h> f19411E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f19412F = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f19413G = false;

    /* renamed from: H */
    private boolean f19414H = false;

    /* renamed from: I */
    private boolean f19415I = true;

    /* renamed from: J */
    private int f19416J = 0;

    /* renamed from: K */
    private int f19417K = 0;

    /* renamed from: L */
    private HashSet<String> f19418L;

    /* renamed from: M */
    private PointF f19419M;

    /* renamed from: N */
    private float f19420N;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f19421a = true;

    /* renamed from: b */
    private Activity f19422b = null;

    /* renamed from: c */
    private C7111ka f19423c = null;

    /* renamed from: d */
    private RouteHelper f19424d = null;

    /* renamed from: e */
    private C7106ia f19425e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public DVPedometer f19426f = null;

    /* renamed from: g */
    private Timer f19427g = null;

    /* renamed from: h */
    private Timer f19428h = null;

    /* renamed from: i */
    private C7161e f19429i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7102ga f19430j = null;

    /* renamed from: k */
    private C7060b f19431k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C7061c f19432l = null;

    /* renamed from: m */
    private C7062d f19433m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C7112l.C7120h f19434n = null;

    /* renamed from: o */
    private PointF f19435o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public PointF f19436p;

    /* renamed from: q */
    private PointF f19437q;

    /* renamed from: r */
    private String f19438r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float[] f19439s = new float[1000];
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f19440t = 0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f19441u = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f19442v = 0.0f;

    /* renamed from: w */
    private boolean f19443w = false;

    /* renamed from: x */
    private boolean f19444x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f19445y = true;

    /* renamed from: z */
    private boolean f19446z = false;

    /* renamed from: tw.navin.navinmap.map.PMISLMain$a */
    interface C7059a {
        /* renamed from: a */
        void mo21025a(float f);

        /* renamed from: a */
        void mo21026a(Path path, Path path2);

        /* renamed from: a */
        void mo21027a(Path path, Path path2, PointF pointF, boolean z);

        /* renamed from: a */
        void mo21028a(PointF pointF);
    }

    /* renamed from: tw.navin.navinmap.map.PMISLMain$b */
    interface C7060b {
        /* renamed from: a */
        void mo21064a(C7112l.C7119g gVar, C7112l.C7119g gVar2);

        /* renamed from: b */
        void mo21065b(PointF pointF);
    }

    /* renamed from: tw.navin.navinmap.map.PMISLMain$c */
    interface C7061c {
        /* renamed from: a */
        void mo21029a(String str);

        /* renamed from: a */
        void mo21030a(String str, float f, float f2);
    }

    /* renamed from: tw.navin.navinmap.map.PMISLMain$d */
    interface C7062d {
        /* renamed from: a */
        void mo21037a();
    }

    /* renamed from: tw.navin.navinmap.map.PMISLMain$e */
    private class C7063e implements C7161e.C7162a {
        private C7063e() {
        }

        /* synthetic */ C7063e(PMISLMain pMISLMain, C7097e eVar) {
            this();
        }

        /* renamed from: a */
        public void mo21066a(float f) {
            PMISLMain.this.m26538b(f);
        }

        /* renamed from: a */
        public void mo21067a(float f, float f2) {
            PMISLMain.this.m26532a(f2);
            if (PMISLMain.this.f19430j != null) {
                PMISLMain.this.f19430j.mo21156a(f);
            }
        }
    }

    PMISLMain(Activity activity, String str, String str2, RouteHelper routeHelper) {
        this.f19422b = activity;
        this.f19407A = str;
        this.f19408B = str2;
        this.f19424d = routeHelper;
        this.f19419M = new PointF();
        this.f19430j = new C7102ga();
    }

    /* renamed from: a */
    private PointF m26530a(ArrayList<C6722c> arrayList, int i) {
        PointF pointF = new PointF();
        Iterator<C6722c> it = arrayList.iterator();
        float f = 0.0f;
        float f2 = 0.0f;
        int i2 = 0;
        float f3 = 0.0f;
        while (it.hasNext()) {
            C7112l.C7119g gVar = (C7112l.C7119g) it.next();
            float f4 = 1.0f / ((float) gVar.f18679d);
            PointF pointF2 = gVar.f19616m;
            f += pointF2.x * f4;
            f3 += pointF2.y * f4;
            f2 += f4;
            i2++;
            if (i2 >= i) {
                break;
            }
        }
        pointF.x = f / f2;
        pointF.y = f3 / f2;
        return pointF;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26532a(float f) {
        this.f19441u = f;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m26533a(android.graphics.PointF r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r1.f19435o = r0
            android.graphics.PointF r0 = r1.f19435o
            r1.f19436p = r0
            boolean r2 = r1.f19443w
            r3 = 0
            if (r2 == 0) goto L_0x0081
            tw.navin.navinmap.map.l$h r2 = r1.f19434n
            java.util.ArrayList<tw.navin.navinmap.map.l$g> r2 = r2.f19631m
            if (r2 == 0) goto L_0x0081
            if (r0 == 0) goto L_0x0081
            boolean r0 = r1.f19414H
            if (r0 == 0) goto L_0x0081
            tw.navin.navinmap.map.ja r0 = p299tw.navin.navinmap.map.C7109ja.m26767a()     // Catch:{ NullPointerException -> 0x0066 }
            tw.navin.navinmap.map.l$h r0 = r0.mo21175c()     // Catch:{ NullPointerException -> 0x0066 }
            java.util.HashMap<java.lang.String, tw.navin.navinmap.map.l$h> r2 = r1.f19411E     // Catch:{ NullPointerException -> 0x0066 }
            java.lang.String r4 = r1.f19438r     // Catch:{ NullPointerException -> 0x0066 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ NullPointerException -> 0x0066 }
            tw.navin.navinmap.map.l$h r2 = (p299tw.navin.navinmap.map.C7112l.C7120h) r2     // Catch:{ NullPointerException -> 0x0066 }
            tw.navin.navinmap.map.RouteHelper r4 = r1.f19424d     // Catch:{ NullPointerException -> 0x0066 }
            java.util.ArrayList<tw.navin.navinmap.map.l$j> r5 = r0.f19632n     // Catch:{ NullPointerException -> 0x0066 }
            java.util.ArrayList<tw.navin.navinmap.map.l$j> r6 = r2.f19632n     // Catch:{ NullPointerException -> 0x0066 }
            java.lang.String r7 = r0.f19619a     // Catch:{ NullPointerException -> 0x0066 }
            java.lang.String r8 = r2.f19619a     // Catch:{ NullPointerException -> 0x0066 }
            android.graphics.PointF r9 = r1.f19435o     // Catch:{ NullPointerException -> 0x0066 }
            android.graphics.PointF r10 = r1.f19437q     // Catch:{ NullPointerException -> 0x0066 }
            java.util.ArrayList r2 = r4.mo21069a(r5, r6, r7, r8, r9, r10)     // Catch:{ NullPointerException -> 0x0066 }
            tw.navin.navinmap.map.RouteHelper r0 = r1.f19424d     // Catch:{ NullPointerException -> 0x0064 }
            tw.navin.navinmap.map.l$j r16 = r0.mo21070a()     // Catch:{ NullPointerException -> 0x0064 }
            boolean r0 = r1.f19443w     // Catch:{ NullPointerException -> 0x0064 }
            if (r0 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x006b
            tw.navin.navinmap.map.RouteHelper r0 = r1.f19424d     // Catch:{ NullPointerException -> 0x0064 }
            float r14 = r0.mo21075b()     // Catch:{ NullPointerException -> 0x0064 }
            tw.navin.navinmap.map.RouteHelper r0 = r1.f19424d     // Catch:{ NullPointerException -> 0x0064 }
            float r15 = r0.mo21076c()     // Catch:{ NullPointerException -> 0x0064 }
            tw.navin.navinmap.map.ia r11 = r1.f19425e     // Catch:{ NullPointerException -> 0x0064 }
            android.app.Activity r0 = r1.f19422b     // Catch:{ NullPointerException -> 0x0064 }
            android.content.Context r12 = r0.getApplicationContext()     // Catch:{ NullPointerException -> 0x0064 }
            r13 = r2
            r11.mo21166a(r12, r13, r14, r15, r16)     // Catch:{ NullPointerException -> 0x0064 }
            goto L_0x006b
        L_0x0064:
            r0 = move-exception
            goto L_0x0068
        L_0x0066:
            r0 = move-exception
            r2 = r3
        L_0x0068:
            r0.printStackTrace()
        L_0x006b:
            boolean r0 = r1.f19443w
            if (r0 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x007c
            tw.navin.navinmap.map.PMISLMain$d r0 = r1.f19433m
            if (r0 == 0) goto L_0x0078
            r0.mo21037a()
        L_0x0078:
            r1.mo21053a((android.graphics.PointF) r3, (java.lang.String) r3)
            goto L_0x0081
        L_0x007c:
            android.graphics.PointF r0 = r1.f19437q
            r1.m26534a((java.util.ArrayList<p299tw.navin.navinmap.map.C7112l.C7122j>) r2, (android.graphics.PointF) r0)
        L_0x0081:
            tw.navin.navinmap.map.ga r0 = r1.f19430j
            if (r0 == 0) goto L_0x009b
            boolean r2 = r1.f19413G
            if (r2 == 0) goto L_0x0098
            android.graphics.PointF r2 = r1.f19435o
            r0.mo21159a((android.graphics.PointF) r2)
            boolean r0 = r1.f19443w
            if (r0 != 0) goto L_0x009b
            tw.navin.navinmap.map.ga r0 = r1.f19430j
            r0.mo21157a(r3, r3)
            goto L_0x009b
        L_0x0098:
            r0.mo21159a((android.graphics.PointF) r3)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.PMISLMain.m26533a(android.graphics.PointF):void");
    }

    /* renamed from: a */
    private void m26534a(ArrayList<C7112l.C7122j> arrayList, PointF pointF) {
        Path path;
        Path path2;
        C7102ga gaVar;
        boolean z = false;
        if (arrayList != null) {
            PointF pointF2 = arrayList.get(0).f19650c;
            path = new Path();
            path.moveTo(pointF2.x, pointF2.y);
            path2 = new Path();
            boolean z2 = false;
            int i = 1;
            while (i < arrayList.size()) {
                C7112l.C7122j jVar = arrayList.get(i);
                C7112l.C7122j jVar2 = arrayList.get(i - 1);
                C7112l.C7122j jVar3 = i < arrayList.size() - 1 ? arrayList.get(i + 1) : null;
                if (!z2) {
                    PointF pointF3 = jVar.f19650c;
                    path.lineTo(pointF3.x, pointF3.y);
                    if (!jVar.f19649b.equals("N") && !jVar2.f19649b.equals("N") && jVar3 != null && jVar3.f19649b.equals("N")) {
                        PointF pointF4 = jVar.f19650c;
                        path2.moveTo(pointF4.x, pointF4.y);
                        z2 = true;
                    }
                } else {
                    PointF pointF5 = jVar.f19650c;
                    path2.lineTo(pointF5.x, pointF5.y);
                }
                i++;
            }
            if (C7109ja.m26767a().mo21175c().f19619a.equals(this.f19438r)) {
                z = true;
            }
        } else {
            path2 = null;
            path = null;
        }
        if (this.f19443w && (gaVar = this.f19430j) != null) {
            gaVar.mo21158a(path, path2, pointF, z);
        }
    }

    /* access modifiers changed from: private */
    public native PointF adjustPosition(float f, float f2);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26538b(float f) {
        float[] fArr = this.f19439s;
        int i = this.f19440t;
        fArr[i] = f;
        this.f19440t = i + 1;
        if (this.f19440t >= fArr.length) {
            this.f19440t = 0;
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: b */
    private void m26539b(ArrayList<C6722c> arrayList) {
        C7112l.C7119g gVar = (C7112l.C7119g) arrayList.get(0);
        C7112l.C7119g gVar2 = arrayList.size() >= 2 ? (C7112l.C7119g) arrayList.get(1) : gVar;
        PointF a = m26530a(arrayList, 5);
        if (a != null) {
            this.f19419M.set(a.x, a.y);
            C7060b bVar = this.f19431k;
            if (bVar != null) {
                bVar.mo21064a(gVar, gVar2);
                this.f19431k.mo21065b(a);
            }
            if (!this.f19446z) {
                this.f19446z = true;
                setInitPosition(a.x, a.y);
            }
            setObservationPosition(a.x, a.y);
        }
    }

    /* renamed from: c */
    private void m26542c(ArrayList<C6722c> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            this.f19416J++;
            if (this.f19416J > 5) {
                this.f19413G = false;
                m26533a((PointF) null);
                this.f19416J = 5;
                return;
            }
            return;
        }
        this.f19413G = true;
        this.f19416J = 0;
    }

    private native void setInitPosition(float f, float f2);

    private native void setObservationPosition(float f, float f2);

    /* renamed from: a */
    public void mo17209a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21053a(PointF pointF, String str) {
        this.f19437q = pointF;
        if (pointF != null) {
            this.f19438r = str;
            this.f19443w = true;
            this.f19414H = true;
            this.f19424d.mo21074a(true);
            return;
        }
        this.f19438r = null;
        this.f19443w = false;
        this.f19414H = false;
        this.f19424d.mo21074a(false);
        C7102ga gaVar = this.f19430j;
        if (gaVar != null) {
            gaVar.mo21158a((Path) null, (Path) null, (PointF) null, false);
        }
    }

    /* renamed from: a */
    public void mo17210a(C6722c cVar) {
    }

    /* renamed from: a */
    public void mo17211a(ArrayList<C6722c> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            m26542c((ArrayList<C6722c>) null);
            return;
        }
        this.f19415I = mo21059a((C7112l.C7119g) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList();
        Iterator<C6722c> it = arrayList.iterator();
        while (it.hasNext()) {
            C7112l.C7119g gVar = (C7112l.C7119g) it.next();
            if (gVar.f19617n.equals(C7109ja.m26767a().mo21175c().f19619a) && gVar.f19615l.equals("M")) {
                double d = gVar.f18679d;
                if (d > 0.001d && d < 25.0d) {
                    if (arrayList2.size() == 0 && gVar.f18679d > ((double) this.f19434n.f19628j)) {
                        break;
                    }
                    arrayList2.add(gVar.clone());
                    if (arrayList2.size() >= 5) {
                        break;
                    }
                }
            }
        }
        m26542c((ArrayList<C6722c>) arrayList2);
        if (arrayList2.size() >= 1) {
            m26539b((ArrayList<C6722c>) arrayList2);
            this.f19412F = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21054a(HashSet<String> hashSet) {
        RouteHelper routeHelper = this.f19424d;
        if (routeHelper != null) {
            routeHelper.mo21073a(hashSet);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21055a(C7059a aVar) {
        this.f19430j.mo21160a(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21056a(C7060b bVar) {
        this.f19431k = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21057a(C7061c cVar) {
        this.f19432l = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21058a(C7112l.C7120h hVar, HashMap<String, C7112l.C7120h> hashMap, ArrayList<C7112l.C7122j> arrayList, ArrayList<C7112l.C7121i> arrayList2, C7062d dVar, HashSet<String> hashSet, C7106ia iaVar) {
        this.f19434n = hVar;
        this.f19411E = hashMap;
        this.f19409C = arrayList;
        this.f19410D = arrayList2;
        float f = this.f19434n.f19627i;
        this.f19442v = f;
        this.f19446z = false;
        this.f19433m = dVar;
        this.f19418L = hashSet;
        this.f19445y = true;
        this.f19425e = iaVar;
        this.f19420N = f * 7.0f;
        if (this.f19421a) {
            this.f19429i = new C7161e(this.f19422b);
            this.f19429i.mo21274a((C7161e.C7162a) new C7063e(this, (C7097e) null));
            this.f19429i.mo21273a(this.f19434n.f19626h);
            this.f19429i.mo21272a();
            this.f19426f = new DVPedometer();
            if (this.f19444x) {
                this.f19423c = new C7111ka();
                this.f19423c.mo21179a(this.f19442v);
            }
        }
        this.f19427g = new Timer();
        this.f19427g.scheduleAtFixedRate(new C7097e(this), 0, 1000);
        this.f19428h = new Timer();
        this.f19428h.scheduleAtFixedRate(new C7099f(this), 0, 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21059a(C7112l.C7119g gVar) {
        return false;
    }

    /* renamed from: b */
    public void mo17212b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21060b(C7059a aVar) {
        this.f19430j.mo21161b(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo21061c() {
        this.f19445y = true;
        C7161e eVar = this.f19429i;
        if (eVar != null) {
            eVar.mo21272a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo21062d() {
        this.f19445y = false;
        C7161e eVar = this.f19429i;
        if (eVar != null) {
            eVar.mo21275b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo21063e() {
        mo21062d();
        Timer timer = this.f19427g;
        if (timer != null) {
            timer.cancel();
            this.f19427g = null;
        }
        Timer timer2 = this.f19428h;
        if (timer2 != null) {
            timer2.cancel();
            this.f19428h = null;
        }
        C7161e eVar = this.f19429i;
        if (eVar != null) {
            eVar.mo21275b();
            this.f19429i.mo21276c();
            this.f19429i = null;
        }
        this.f19422b = null;
        this.f19416J = 0;
        C7102ga gaVar = this.f19430j;
        if (gaVar != null) {
            gaVar.mo21155a();
            this.f19430j = null;
        }
    }

    /* renamed from: g */
    public void mo17213g() {
    }
}
