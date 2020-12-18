package p000a.p001a.p002a;

import android.content.Context;
import android.util.Log;
import com.sto.stonavigating.STONavigationManager;
import com.sto.stopositioning.STOPositioningManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import p000a.p001a.p003b.C0013f;
import p000a.p001a.p003b.C0015g;
import p000a.p001a.p004c.C0017b;
import p000a.p001a.p004c.C0018c;

/* renamed from: a.a.a.d */
public class C0003d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f3a = "STOIPSManager";

    /* renamed from: b */
    private Context f4b;

    /* renamed from: c */
    private boolean f5c;

    /* renamed from: d */
    private final int f6d;

    /* renamed from: e */
    private C0013f f7e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public STOPositioningManager f8f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public STONavigationManager f9g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0007f f10h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C0006e f11i;

    /* renamed from: j */
    private boolean f12j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f13k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int[] f14l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Map<String, C0017b> f15m;

    /* renamed from: n */
    private String f16n;

    /* renamed from: o */
    private float f17o;

    /* renamed from: p */
    private int f18p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Integer f19q;

    /* renamed from: r */
    private final Integer f20r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Integer f21s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public List<List<C0018c>> f22t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public List<C0017b> f23u;

    /* renamed from: v */
    private Timer f24v;

    /* renamed from: w */
    private final float f25w;

    /* renamed from: a.a.a.d$a */
    private class C0004a implements C0015g {
        private C0004a() {
        }

        /* synthetic */ C0004a(C0003d dVar, C0000a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo9a(List<C0018c> list) {
            for (int i = 0; i < list.size(); i++) {
                if (C0003d.this.f15m == null) {
                    C0003d.this.f8f.mo14175a(list.get(i));
                } else {
                    ((List) C0003d.this.f22t.get(C0003d.this.f21s.intValue() % C0003d.this.f19q.intValue())).addAll(list);
                }
            }
        }
    }

    /* renamed from: a.a.a.d$b */
    private class C0005b extends TimerTask {
        private C0005b() {
        }

        /* synthetic */ C0005b(C0003d dVar, C0000a aVar) {
            this();
        }

        public void run() {
            C0003d.this.m9d();
        }
    }

    public C0003d(Context context, String str, Map<String, C0017b> map) {
        this.f5c = false;
        this.f6d = 1500;
        this.f7e = null;
        this.f8f = null;
        this.f9g = null;
        this.f10h = null;
        this.f11i = null;
        this.f12j = false;
        this.f13k = false;
        this.f14l = null;
        this.f16n = "";
        this.f17o = -999.0f;
        this.f18p = 0;
        this.f19q = 5;
        this.f20r = -90;
        this.f21s = 0;
        this.f22t = null;
        this.f23u = null;
        this.f24v = new Timer(false);
        this.f25w = 2.5f;
        this.f4b = context;
        if (map == null) {
            this.f8f = new STOPositioningManager(str);
        } else {
            this.f15m = map;
            this.f9g = new STONavigationManager(str, map);
            this.f22t = new ArrayList();
            this.f23u = new ArrayList();
            for (int i = 0; i < this.f19q.intValue(); i++) {
                this.f22t.add(new ArrayList());
                this.f23u.add(new C0017b());
            }
        }
        this.f7e = new C0013f(context, new C0004a(this, (C0000a) null), C0013f.C0014a.GENERALSCANNING);
        this.f24v.schedule(new C0005b(this, (C0000a) null), 0, 1500);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C0017b m1a(List<C0017b> list) {
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).f56c.intValue() != 0) {
                f3 += (float) list.get(i2).f54a.intValue();
                f2 += (float) list.get(i2).f55b.intValue();
                f += (float) list.get(i2).f56c.intValue();
                i++;
                Log.i(this.f3a, "AVG gets " + list.get(i2).f54a + " " + list.get(i2).f55b + " " + list.get(i2).f56c);
            }
        }
        C0017b bVar = new C0017b();
        float f4 = (float) i;
        bVar.f54a = Integer.valueOf(Math.round(f3 / f4));
        bVar.f55b = Integer.valueOf(Math.round(f2 / f4));
        bVar.f56c = Integer.valueOf(Math.round(f / f4));
        return bVar;
    }

    /* renamed from: b */
    private C0017b m5b(List<C0018c> list) {
        List<C0018c> list2 = list;
        C0017b bVar = new C0017b();
        bVar.f54a = 0;
        bVar.f55b = 0;
        bVar.f56c = 0;
        float f = -999.0f;
        double d = 0.0d;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!this.f15m.containsKey(list2.get(i2).mo23a()) || list2.get(i2).mo24b() < ((float) this.f20r.intValue())) {
                d = d;
            } else {
                String str = " ";
                float intValue = (float) (((double) f3) + (((double) this.f15m.get(list2.get(i2).mo23a()).f54a.intValue()) * Math.pow((double) ((list2.get(i2).mo24b() - ((float) this.f20r.intValue())) + 1.0f), 2.5d)));
                f2 = (float) (((double) f2) + (((double) this.f15m.get(list2.get(i2).mo23a()).f55b.intValue()) * Math.pow((double) ((list2.get(i2).mo24b() - ((float) this.f20r.intValue())) + 1.0f), 2.5d)));
                double pow = d + Math.pow((double) ((list2.get(i2).mo24b() - ((float) this.f20r.intValue())) + 1.0f), 2.5d);
                if (list2.get(i2).mo24b() > f) {
                    f = list2.get(i2).mo24b();
                    i = this.f15m.get(list2.get(i2).mo23a()).f56c.intValue();
                }
                Log.i(this.f3a, "getInterpolationResult takes " + this.f15m.get(list2.get(i2).mo23a()).f54a + str + this.f15m.get(list2.get(i2).mo23a()).f55b);
                double d2 = pow;
                f3 = intValue;
                d = d2;
            }
        }
        double d3 = d;
        String str2 = " ";
        bVar.f54a = Integer.valueOf((int) (((double) f3) / d3));
        bVar.f55b = Integer.valueOf((int) (((double) f2) / d3));
        bVar.f56c = Integer.valueOf(i);
        Log.i(this.f3a, "getInterpolationResult gets " + bVar.f54a + str2 + bVar.f55b + str2 + bVar.f56c);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m9d() {
        Runnable bVar;
        Log.i(this.f3a, "synchronize()");
        if (this.f12j && this.f10h != null) {
            if (this.f15m == null) {
                this.f14l = this.f8f.mo14176a();
                bVar = new C0000a(this);
            } else {
                this.f23u.set(this.f21s.intValue() % this.f19q.intValue(), m5b(this.f22t.get(this.f21s.intValue() % this.f19q.intValue())));
                this.f22t.get(this.f21s.intValue() % this.f19q.intValue()).clear();
                this.f21s = Integer.valueOf(this.f21s.intValue() + 1);
                bVar = new C0001b(this);
            }
            bVar.run();
        }
        if (this.f12j && this.f13k && this.f11i != null) {
            new C0002c(this).run();
        }
    }

    /* renamed from: a */
    public synchronized void mo4a() {
        this.f7e.mo18a();
        this.f12j = true;
    }

    /* renamed from: a */
    public synchronized void mo5a(C0006e eVar) {
        this.f11i = eVar;
    }

    /* renamed from: a */
    public synchronized void mo6a(C0007f fVar) {
        this.f10h = fVar;
    }

    /* renamed from: b */
    public synchronized void mo7b() {
        if (this.f13k) {
            this.f13k = false;
            this.f9g.mo14174b();
        }
    }

    /* renamed from: c */
    public synchronized void mo8c() {
        this.f7e.mo19b();
        this.f12j = false;
    }
}
