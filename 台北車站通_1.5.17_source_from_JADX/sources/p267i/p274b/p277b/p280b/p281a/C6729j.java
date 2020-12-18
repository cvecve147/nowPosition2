package p267i.p274b.p277b.p280b.p281a;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.p011v7.app.C0621l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import p267i.p274b.p277b.C6702a;
import p267i.p274b.p277b.p280b.C6717a;
import p267i.p274b.p277b.p280b.C6738b;

/* renamed from: i.b.b.b.a.j */
public abstract class C6729j {

    /* renamed from: a */
    private final int f18694a = 5;

    /* renamed from: b */
    protected Context f18695b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6731b f18696c = null;

    /* renamed from: d */
    private HashMap<String, C6722c> f18697d = null;

    /* renamed from: e */
    private Timer f18698e;

    /* renamed from: f */
    private CountDownTimer f18699f;

    /* renamed from: g */
    private C6730a f18700g;

    /* renamed from: h */
    private Object f18701h = null;

    /* renamed from: i */
    protected HashMap<String, C6722c> f18702i;

    /* renamed from: j */
    private boolean f18703j = false;

    /* renamed from: k */
    private boolean f18704k = false;

    /* renamed from: l */
    private boolean f18705l = false;

    /* renamed from: m */
    private boolean f18706m = false;

    /* renamed from: n */
    private boolean f18707n = false;

    /* renamed from: o */
    private boolean f18708o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f18709p = 0;

    /* renamed from: q */
    private int f18710q = -1;

    /* renamed from: r */
    private int f18711r = 1;

    /* renamed from: s */
    private int f18712s = 16;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f18713t = 1;

    /* renamed from: u */
    private String f18714u = null;
    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})

    /* renamed from: v */
    public Handler f18715v = new C6723d(this);

    /* renamed from: i.b.b.b.a.j$a */
    private class C6730a extends TimerTask {
        private C6730a() {
        }

        /* synthetic */ C6730a(C6729j jVar, C6723d dVar) {
            this();
        }

        public void run() {
            C6729j.this.f18715v.sendEmptyMessage(0);
        }
    }

    /* renamed from: i.b.b.b.a.j$b */
    public interface C6731b {
        /* renamed from: a */
        void mo17209a();

        /* renamed from: a */
        void mo17210a(C6722c cVar);

        /* renamed from: a */
        void mo17211a(ArrayList<C6722c> arrayList);

        /* renamed from: b */
        void mo17212b();

        /* renamed from: g */
        void mo17213g();
    }

    /* renamed from: i.b.b.b.a.j$c */
    private class C6732c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        ProgressDialog f18717a;

        /* renamed from: b */
        Context f18718b;

        C6732c(Context context) {
            this.f18718b = context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                Thread.sleep(2000);
                return null;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            C6729j.this.m25501c(this.f18718b);
            ProgressDialog progressDialog = this.f18717a;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f18717a = null;
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String a = C6738b.m25537a(C6738b.f18736f);
            this.f18717a = new ProgressDialog(this.f18718b);
            this.f18717a.setMessage(a);
            this.f18717a.setCancelable(false);
            this.f18717a.show();
            C6717a.m25481a();
        }
    }

    public C6729j(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f18695b = context.getApplicationContext();
        this.f18705l = z;
        this.f18706m = z2;
        this.f18707n = z3;
        this.f18708o = z4;
        this.f18701h = new Object();
    }

    /* renamed from: b */
    private void m25497b(Context context) {
        if (this.f18705l) {
            new C6732c(context).execute(new Void[0]);
        } else if (this.f18706m) {
            C6724e eVar = new C6724e(this, context);
            C6725f fVar = new C6725f(this);
            C0621l.C0622a aVar = new C0621l.C0622a(context);
            aVar.mo2602a(false);
            aVar.mo2600a((CharSequence) C6738b.m25537a(C6738b.f18735e));
            aVar.mo2609b((CharSequence) C6738b.m25537a(C6738b.f18731a), (DialogInterface.OnClickListener) eVar);
            aVar.mo2601a((CharSequence) C6738b.m25537a(C6738b.f18732b), (DialogInterface.OnClickListener) fVar);
            aVar.mo2610c();
        } else {
            this.f18713t = 1;
            C6702a.m25440a("Bluetooth is not enabled");
        }
    }

    /* renamed from: c */
    private void mo17184c(int i) {
        long j = (long) i;
        this.f18699f = new C6727h(this, j, j).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25501c(Context context) {
        if (this.f18707n && Build.VERSION.SDK_INT > 22 && !((LocationManager) context.getSystemService("location")).isProviderEnabled("gps")) {
            if (this.f18708o) {
                C6726g gVar = new C6726g(this, context);
                C0621l.C0622a aVar = new C0621l.C0622a(context);
                aVar.mo2602a(false);
                aVar.mo2600a((CharSequence) C6738b.m25537a(C6738b.f18737g));
                aVar.mo2609b((CharSequence) C6738b.m25537a(C6738b.f18733c), (DialogInterface.OnClickListener) gVar);
                aVar.mo2601a((CharSequence) C6738b.m25537a(C6738b.f18734d), (DialogInterface.OnClickListener) null);
                aVar.mo2610c();
            }
            C6702a.m25440a("Location is not enabled");
        }
        mo17183c();
    }

    /* renamed from: d */
    private void m25502d(C6722c cVar) {
        this.f18702i.put(mo17203b(cVar), cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m25505g() {
        synchronized (this.f18701h) {
            if (this.f18703j) {
                return false;
            }
            this.f18703j = true;
            return true;
        }
    }

    /* renamed from: h */
    private boolean m25506h() {
        boolean z;
        synchronized (this.f18701h) {
            z = this.f18703j;
        }
        return z;
    }

    /* renamed from: i */
    private void m25507i() {
        this.f18700g = new C6730a(this, (C6723d) null);
        this.f18698e = new Timer();
        this.f18698e.schedule(this.f18700g, 0, 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m25508j() {
        Timer timer = this.f18698e;
        if (timer != null) {
            timer.cancel();
            this.f18698e = null;
            this.f18700g.cancel();
            this.f18700g = null;
        }
        CountDownTimer countDownTimer = this.f18699f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f18699f = null;
        }
    }

    /* renamed from: a */
    public void mo17197a(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.f18711r = i;
            return;
        }
        C6702a.m25441b("## Set comparing mode failed. No mode value of '" + i + "'");
    }

    /* renamed from: a */
    public void mo17198a(Context context) {
        mo17199a(context, false);
    }

    /* renamed from: a */
    public void mo17199a(Context context, boolean z) {
        this.f18704k = z;
        this.f18713t = 2;
        if (!C6717a.m25482b()) {
            m25497b(context);
        } else {
            m25501c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17200a(C6722c cVar) {
        C6731b bVar;
        String str = this.f18714u;
        if (str != null && !str.contains(cVar.f18676a.toUpperCase())) {
            return;
        }
        if (this.f18711r != 0) {
            C6722c c = mo17205c(cVar);
            if (c != null) {
                this.f18709p = 0;
                c.f18679d = cVar.f18679d;
                c.f18680e = cVar.f18680e;
                c.f18681f = cVar.f18681f;
                c.f18683h = cVar.f18683h;
                c.f18682g = cVar.f18682g;
                c.f18684i = cVar.f18684i;
                int i = this.f18711r;
                if (i == 1) {
                    if (this.f18712s == 17 || m25505g()) {
                        C6731b bVar2 = this.f18696c;
                        if (bVar2 != null) {
                            bVar2.mo17210a(c);
                        }
                        m25508j();
                    }
                } else if (i == 2) {
                    if ((this.f18712s == 17 || (!m25506h() && this.f18696c != null)) && (bVar = this.f18696c) != null) {
                        bVar.mo17210a(c);
                    }
                    m25502d(c);
                }
            }
        } else {
            m25502d(cVar);
        }
    }

    /* renamed from: a */
    public void mo17201a(C6731b bVar) {
        this.f18696c = bVar;
    }

    /* renamed from: a */
    public void mo17202a(ArrayList<? extends C6722c> arrayList) {
        this.f18697d = new HashMap<>(arrayList.size());
        Iterator<? extends C6722c> it = arrayList.iterator();
        while (it.hasNext()) {
            C6722c cVar = (C6722c) it.next();
            this.f18697d.put(mo17203b(cVar), cVar);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DefaultLocale"})
    /* renamed from: b */
    public String mo17203b(C6722c cVar) {
        return String.format("%s-%d-%d", new Object[]{cVar.f18676a.toUpperCase(), Integer.valueOf(cVar.f18677b), Integer.valueOf(cVar.f18678c)});
    }

    /* renamed from: b */
    public void mo17204b(int i) {
        if (i == 16 || i == 17) {
            this.f18712s = i;
            return;
        }
        C6702a.m25441b("## Set scanning mode failed. No mode value of '" + i + "'");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6722c mo17205c(C6722c cVar) {
        return this.f18697d.get(mo17203b(cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17183c() {
        this.f18713t = 3;
        C6731b bVar = this.f18696c;
        if (bVar != null) {
            bVar.mo17209a();
        }
        if (this.f18704k) {
            m25507i();
        }
        int i = this.f18710q;
        if (i != -1) {
            mo17184c(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo17206d() {
        this.f18702i = new HashMap<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo17207e() {
        int i = this.f18711r;
        if (i != 2 && i != 0) {
            return;
        }
        if (this.f18712s == 17 || m25505g()) {
            if (this.f18696c != null) {
                new C6728i(this, new ArrayList(this.f18702i.values())).start();
            }
            m25508j();
        }
    }

    /* renamed from: f */
    public void mo17185f() {
        this.f18695b = null;
        if (this.f18704k) {
            m25508j();
        }
        this.f18713t = 1;
    }
}
