package android.support.p011v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p011v7.app.C0627q;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import p013b.p018b.p040i.p050h.C1136b;
import p013b.p018b.p040i.p050h.C1141f;

/* renamed from: android.support.v7.app.s */
class C0631s extends C0584C {

    /* renamed from: U */
    private int f2370U = -100;

    /* renamed from: V */
    private boolean f2371V;

    /* renamed from: W */
    private boolean f2372W = true;

    /* renamed from: X */
    private C0633b f2373X;

    /* renamed from: android.support.v7.app.s$a */
    class C0632a extends C0627q.C0628a {
        C0632a(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode mo2659a(ActionMode.Callback callback) {
            C1141f.C1142a aVar = new C1141f.C1142a(C0631s.this.f2353f, callback);
            C1136b a = C0631s.this.mo2446a((C1136b.C1137a) aVar);
            if (a != null) {
                return aVar.mo5342b(a);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return C0631s.this.mo2658v() ? mo2659a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    /* renamed from: android.support.v7.app.s$b */
    final class C0633b {

        /* renamed from: a */
        private C0600K f2375a;

        /* renamed from: b */
        private boolean f2376b;

        /* renamed from: c */
        private BroadcastReceiver f2377c;

        /* renamed from: d */
        private IntentFilter f2378d;

        C0633b(C0600K k) {
            this.f2375a = k;
            this.f2376b = k.mo2542a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo2661a() {
            BroadcastReceiver broadcastReceiver = this.f2377c;
            if (broadcastReceiver != null) {
                C0631s.this.f2353f.unregisterReceiver(broadcastReceiver);
                this.f2377c = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo2662b() {
            boolean a = this.f2375a.mo2542a();
            if (a != this.f2376b) {
                this.f2376b = a;
                C0631s.this.mo2638a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final int mo2663c() {
            this.f2376b = this.f2375a.mo2542a();
            return this.f2376b ? 2 : 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo2664d() {
            mo2661a();
            if (this.f2377c == null) {
                this.f2377c = new C0634t(this);
            }
            if (this.f2378d == null) {
                this.f2378d = new IntentFilter();
                this.f2378d.addAction("android.intent.action.TIME_SET");
                this.f2378d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f2378d.addAction("android.intent.action.TIME_TICK");
            }
            C0631s.this.f2353f.registerReceiver(this.f2377c, this.f2378d);
        }
    }

    C0631s(Context context, Window window, C0624n nVar) {
        super(context, window, nVar);
    }

    /* renamed from: h */
    private boolean m3119h(int i) {
        Resources resources = this.f2353f.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m3122y()) {
            ((Activity) this.f2353f).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        C0592F.m2906a(resources);
        return true;
    }

    /* renamed from: w */
    private void m3120w() {
        if (this.f2373X == null) {
            this.f2373X = new C0633b(C0600K.m2944a(this.f2353f));
        }
    }

    /* renamed from: x */
    private int m3121x() {
        int i = this.f2370U;
        return i != -100 ? i : C0625o.m3076b();
    }

    /* renamed from: y */
    private boolean m3122y() {
        if (this.f2371V) {
            Context context = this.f2353f;
            if (context instanceof Activity) {
                try {
                    return (context.getPackageManager().getActivityInfo(new ComponentName(this.f2353f, this.f2353f.getClass()), 0).configChanges & 512) == 0;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo2445a(View view, String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo2644a(Window.Callback callback) {
        return new C0632a(callback);
    }

    /* renamed from: a */
    public void mo2449a(Bundle bundle) {
        super.mo2449a(bundle);
        if (bundle != null && this.f2370U == -100) {
            this.f2370U = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: a */
    public boolean mo2638a() {
        int x = m3121x();
        int g = mo2657g(x);
        boolean h = g != -1 ? m3119h(g) : false;
        if (x == 0) {
            m3120w();
            this.f2373X.mo2664d();
        }
        this.f2371V = true;
        return h;
    }

    /* renamed from: c */
    public void mo2640c(Bundle bundle) {
        super.mo2640c(bundle);
        int i = this.f2370U;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo2657g(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        m3120w();
        return this.f2373X.mo2663c();
    }

    /* renamed from: h */
    public void mo2474h() {
        super.mo2474h();
        C0633b bVar = this.f2373X;
        if (bVar != null) {
            bVar.mo2661a();
        }
    }

    /* renamed from: j */
    public void mo2642j() {
        super.mo2642j();
        mo2638a();
    }

    /* renamed from: k */
    public void mo2476k() {
        super.mo2476k();
        C0633b bVar = this.f2373X;
        if (bVar != null) {
            bVar.mo2661a();
        }
    }

    /* renamed from: v */
    public boolean mo2658v() {
        return this.f2372W;
    }
}
