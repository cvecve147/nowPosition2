package p101d.p191i.p192a.p193a;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.p002a.C0006e;
import p000a.p001a.p002a.C0007f;
import p101d.p191i.p192a.C5931a;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.p193a.C5961q;
import p101d.p191i.p192a.p200e.C6016b;
import p101d.p191i.p192a.p200e.C6019c;
import p101d.p191i.p192a.p200e.C6023g;

/* renamed from: d.i.a.a.w */
public class C5975w extends View {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f16575a = "STOMap";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f16576b = false;

    /* renamed from: c */
    private Context f16577c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5961q f16578d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5979x f16579e;

    /* renamed from: f */
    private List<C5976a> f16580f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6019c f16581g;

    /* renamed from: h */
    private C6019c f16582h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public JSONObject f16583i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f16584j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f16585k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Boolean f16586l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Boolean f16587m;

    /* renamed from: n */
    private C5978c f16588n;

    /* renamed from: o */
    private C5977b f16589o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public CountDownTimer f16590p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List f16591q;

    /* renamed from: r */
    private C6016b f16592r;

    /* renamed from: s */
    private String f16593s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public HashMap<Integer, Integer> f16594t;

    /* renamed from: u */
    private HashMap<Integer, Integer> f16595u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int[] f16596v;

    /* renamed from: w */
    private C6016b.C6017a f16597w;

    /* renamed from: d.i.a.a.w$a */
    public interface C5976a {
        /* renamed from: a */
        void mo5625a();

        /* renamed from: a */
        void mo5626a(C6019c cVar);

        /* renamed from: a */
        void mo5627a(Boolean bool);

        /* renamed from: a */
        void mo5628a(String str);

        /* renamed from: b */
        void mo5629b();

        /* renamed from: b */
        void mo5630b(C6019c cVar);
    }

    /* renamed from: d.i.a.a.w$b */
    private class C5977b extends C0006e {
        private C5977b() {
        }

        /* synthetic */ C5977b(C5975w wVar, C5970r rVar) {
            this();
        }

        /* renamed from: a */
        public void mo11a(int[] iArr) {
            Log.d(C5975w.f16575a, "NavigationCallback_API: callback");
            C5975w.this.m22625g();
        }
    }

    /* renamed from: d.i.a.a.w$c */
    private class C5978c extends C0007f {
        private C5978c() {
        }

        /* synthetic */ C5978c(C5975w wVar, C5970r rVar) {
            this();
        }

        /* renamed from: a */
        public void mo12a(int[] iArr) {
            if (iArr[2] != 0) {
                C5975w.this.m22616c((Boolean) true);
            } else {
                C5975w.this.m22616c((Boolean) false);
            }
            if (C5975w.this.f16596v != null && Math.abs(iArr[0] - C5975w.this.f16596v[0]) + Math.abs(iArr[1] - C5975w.this.f16596v[1]) < 50) {
                C5975w.this.mo15797b((Boolean) true);
            }
            Boolean unused = C5975w.this.f16587m = false;
            C5975w.this.f16590p.cancel();
            C5975w.this.f16590p.start();
            if (C5975w.this.f16578d != null) {
                try {
                    iArr[3] = 3;
                    String a = C5975w.f16575a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onPosChanged ");
                    sb.append(iArr[0]);
                    sb.append(" ");
                    sb.append(iArr[1]);
                    sb.append(" ");
                    sb.append(iArr[2]);
                    sb.append(" ");
                    sb.append(iArr[3]);
                    Log.i(a, sb.toString());
                    C5975w.this.f16581g.mo15914a((float) iArr[0], (float) iArr[1], iArr[2], 3);
                    C5975w.this.f16581g.mo15915a(C5975w.this.f16583i.getString(String.valueOf(C5975w.this.f16581g.mo15913a())));
                    C5975w.this.f16578d.mo15770b(C5975w.this.f16581g);
                    C5975w.this.m22604a(iArr[2]);
                    C5975w.this.m22613b(C5975w.this.f16581g);
                    if (C5975w.this.f16578d.mo15761a() != null) {
                        C5975w.this.m22625g();
                    }
                } catch (JSONException unused2) {
                    String a2 = C5975w.f16575a;
                    Log.e(a2, "不匹配的樓層信號：" + C5975w.this.f16581g.mo15922g());
                    C5975w.this.f16578d.mo15770b((C6019c) null);
                    C5975w.this.m22604a(0);
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public C5975w(Context context, String str) {
        super(context);
        this.f16580f = new ArrayList();
        this.f16581g = new C6019c();
        this.f16582h = new C6019c();
        this.f16584j = 10000;
        this.f16586l = false;
        this.f16587m = true;
        this.f16591q = new ArrayList();
        this.f16593s = "https://stoparking.sto-tek.com/api/pathPLan?apiKey=dd4cc64b9bd9175a8639edc25e19873d&startX=SX&startY=SY&startZ=SZ&endX=EX&endY=EY&endZ=EZ";
        this.f16594t = new HashMap<>();
        this.f16595u = new HashMap<>();
        this.f16597w = new C5974v(this);
        this.f16577c = context;
        this.f16578d = new C5961q(context, str);
        this.f16578d.mo15764a((C5961q.C5962a) new C5970r(this));
        this.f16588n = new C5978c(this, (C5970r) null);
        this.f16589o = new C5977b(this, (C5970r) null);
        this.f16579e = new C5979x(context, str, this.f16588n, this.f16589o);
        this.f16583i = new C5931a(context).mo15732f(str);
        m22619d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5975w(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6)
            java.lang.String r5 = "parking"
            int r5 = r7.compareTo(r5)
            java.lang.String r0 = "safety"
            java.lang.String r1 = "exit"
            if (r5 != 0) goto L_0x0036
            java.util.List r5 = r4.f16591q
            java.lang.String r7 = "location"
            r5.add(r7)
            java.util.List r5 = r4.f16591q
            java.lang.String r7 = "information"
            r5.add(r7)
            java.util.List r5 = r4.f16591q
            r5.add(r1)
            java.util.List r5 = r4.f16591q
            r5.add(r0)
            java.util.List r5 = r4.f16591q
            java.lang.String r7 = "eticking"
            r5.add(r7)
            java.util.List r5 = r4.f16591q
            java.lang.String r7 = "femal_toilet"
        L_0x0032:
            r5.add(r7)
            goto L_0x0061
        L_0x0036:
            java.lang.String r5 = "hydrant"
            int r7 = r7.compareTo(r5)
            if (r7 != 0) goto L_0x005c
            java.util.List r7 = r4.f16591q
            r7.add(r5)
            java.util.List r5 = r4.f16591q
            java.lang.String r7 = "extinguisher"
            r5.add(r7)
            java.util.List r5 = r4.f16591q
            java.lang.String r7 = "aed"
            r5.add(r7)
            java.util.List r5 = r4.f16591q
            r5.add(r1)
            java.util.List r5 = r4.f16591q
            r5.add(r0)
            goto L_0x0061
        L_0x005c:
            java.util.List r5 = r4.f16591q
            java.lang.String r7 = "all"
            goto L_0x0032
        L_0x0061:
            java.lang.String r5 = "tms_parking_tc"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x00a6
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r5 = r4.f16594t
            r6 = 125(0x7d, float:1.75E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r0 = 65
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r5.put(r7, r1)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r5 = r4.f16594t
            r7 = 126(0x7e, float:1.77E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 66
        L_0x0084:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.put(r1, r3)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r5 = r4.f16595u
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.put(r0, r6)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r5 = r4.f16595u
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.put(r6, r7)
            goto L_0x00ca
        L_0x00a6:
            java.lang.String r5 = "tms_parking_gc"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x00ca
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r5 = r4.f16594t
            r6 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r0 = 63
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r5.put(r7, r1)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r5 = r4.f16594t
            r7 = 128(0x80, float:1.794E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 64
            goto L_0x0084
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p193a.C5975w.<init>(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22604a(int i) {
        boolean z = false;
        if ((i == 0) && this.f16586l.booleanValue()) {
            m22622f();
            this.f16586l = false;
            return;
        }
        if (i != 0) {
            z = true;
        }
        if ((!this.f16586l.booleanValue()) && z) {
            m22621e();
            this.f16586l = true;
            this.f16585k.postDelayed(new C5972t(this), (long) this.f16584j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22608a(C6019c cVar) {
        for (int i = 0; i < this.f16580f.size(); i++) {
            this.f16580f.get(i).mo5630b(cVar);
        }
    }

    /* renamed from: a */
    private void m22609a(String str) {
        for (int i = 0; i < this.f16580f.size(); i++) {
            this.f16580f.get(i).mo5628a(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m22613b(C6019c cVar) {
        for (int i = 0; i < this.f16580f.size(); i++) {
            this.f16580f.get(i).mo5626a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m22616c(Boolean bool) {
        for (int i = 0; i < this.f16580f.size(); i++) {
            this.f16580f.get(i).mo5627a(bool);
        }
    }

    /* renamed from: d */
    private void m22619d() {
        this.f16590p = new C5973u(this, 5000, 1000);
    }

    /* renamed from: e */
    private void m22621e() {
        for (int i = 0; i < this.f16580f.size(); i++) {
            this.f16580f.get(i).mo5625a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m22622f() {
        for (int i = 0; i < this.f16580f.size(); i++) {
            this.f16580f.get(i).mo5629b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m22625g() {
        this.f16592r = new C6016b(this.f16577c, this.f16593s.replace("SX", Integer.toString((int) this.f16581g.mo15921f().x)).replace("SY", Integer.toString((int) this.f16581g.mo15921f().y)).replace("SZ", Integer.toString(this.f16595u.get(Integer.valueOf(this.f16581g.mo15913a())).intValue())).replace("EX", Integer.toString((int) this.f16578d.mo15761a().mo15921f().x)).replace("EY", Integer.toString((int) this.f16578d.mo15761a().mo15921f().y)).replace("EZ", Integer.toString(this.f16595u.get(Integer.valueOf(this.f16578d.mo15761a().mo15913a())).intValue())));
        this.f16592r.mo15911a("Content-Type", "application/json");
        this.f16592r.mo15910a(this.f16597w);
        this.f16592r.start();
    }

    /* renamed from: a */
    public void mo15794a(int i, float f, float f2) {
        int i2 = (int) f;
        int i3 = (int) f2;
        int[] iArr = {i2, i3, i};
        this.f16596v = new int[]{i2, i3, i};
        this.f16582h = new C6019c(f, f2, i, 0);
        this.f16578d.mo15765a(this.f16582h);
    }

    /* renamed from: a */
    public void mo15795a(C5976a aVar) {
        this.f16580f.add(aVar);
    }

    /* renamed from: a */
    public void mo15796a(Boolean bool) {
        this.f16579e.mo15804a(bool);
        mo15798c();
    }

    /* renamed from: b */
    public void mo15797b(Boolean bool) {
        this.f16596v = null;
        this.f16579e.mo15807c();
        this.f16578d.mo15768a((int[]) null);
        this.f16578d.mo15765a((C6019c) null);
        if (bool.booleanValue()) {
            Context context = this.f16577c;
            C6023g.m22858a(context, context.getString(C6024f.nav_info_arrived));
        }
    }

    /* renamed from: c */
    public void mo15798c() {
        List<C5976a> list = this.f16580f;
        list.removeAll(list);
    }

    public synchronized C6019c getCurrentPos() {
        return this.f16581g;
    }

    public void setContainer(ViewGroup viewGroup) {
        this.f16578d.mo15763a(viewGroup);
        if (!this.f16578d.mo15771c().booleanValue()) {
            m22609a("STOMap initialized failed.");
        }
    }

    public void setDestination(String str) {
        Handler handler = new Handler();
        handler.postDelayed(new C5971s(this, handler, str), 3000);
    }
}
