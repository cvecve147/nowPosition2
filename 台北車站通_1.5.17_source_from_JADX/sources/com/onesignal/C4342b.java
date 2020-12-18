package com.onesignal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.ViewTreeObserver;
import com.onesignal.C4232Da;
import com.onesignal.C4306Xa;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.onesignal.b */
class C4342b {

    /* renamed from: a */
    static boolean f12855a;

    /* renamed from: b */
    private static Map<String, C4343a> f12856b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Map<String, C4232Da.C4233a> f12857c = new ConcurrentHashMap();

    /* renamed from: d */
    private static Map<String, C4346d> f12858d = new ConcurrentHashMap();

    /* renamed from: e */
    static C4345c f12859e = new C4345c();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f */
    static Activity f12860f;

    /* renamed from: com.onesignal.b$a */
    static abstract class C4343a {
        C4343a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12462a(Activity activity) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12463a(WeakReference<Activity> weakReference) {
        }
    }

    /* renamed from: com.onesignal.b$b */
    private static class C4344b implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f12861a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f12862b;

        private C4344b() {
        }

        public void run() {
            if (C4342b.f12860f == null) {
                this.f12861a = true;
                C4306Xa.m17097B();
                this.f12862b = true;
            }
        }
    }

    /* renamed from: com.onesignal.b$c */
    static class C4345c extends HandlerThread {

        /* renamed from: a */
        Handler f12863a = new Handler(getLooper());

        /* renamed from: b */
        private C4344b f12864b;

        C4345c() {
            super("FocusHandlerThread");
            start();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12465a(C4344b bVar) {
            C4344b bVar2 = this.f12864b;
            if (bVar2 == null || !bVar2.f12861a || this.f12864b.f12862b) {
                this.f12864b = bVar;
                this.f12863a.removeCallbacksAndMessages((Object) null);
                this.f12863a.postDelayed(bVar, 2000);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo12466a() {
            C4344b bVar = this.f12864b;
            return bVar != null && bVar.f12861a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo12467b() {
            C4344b bVar = this.f12864b;
            if (bVar != null) {
                boolean unused = bVar.f12861a = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo12468c() {
            this.f12863a.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: com.onesignal.b$d */
    private static class C4346d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final C4232Da.C4233a f12865a;

        /* renamed from: b */
        private final String f12866b;

        private C4346d(C4232Da.C4233a aVar, String str) {
            this.f12865a = aVar;
            this.f12866b = str;
        }

        public void onGlobalLayout() {
            if (!C4256Ja.m16904a((WeakReference<Activity>) new WeakReference(C4342b.f12860f))) {
                Activity activity = C4342b.f12860f;
                if (activity != null) {
                    ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
                    if (Build.VERSION.SDK_INT < 16) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    } else {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
                C4342b.m17297b(this.f12866b);
                this.f12865a.mo12288a();
            }
        }
    }

    /* renamed from: a */
    private static void m17290a() {
        if (f12859e.mo12466a() || f12855a) {
            f12855a = false;
            f12859e.mo12467b();
            C4306Xa.m17096A();
            return;
        }
        f12859e.mo12468c();
    }

    /* renamed from: a */
    static void m17291a(Activity activity) {
    }

    /* renamed from: a */
    static void m17292a(String str) {
        f12856b.remove(str);
    }

    /* renamed from: a */
    static void m17293a(String str, C4232Da.C4233a aVar) {
        Activity activity = f12860f;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            C4346d dVar = new C4346d(aVar, str);
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
            f12858d.put(str, dVar);
        }
        f12857c.put(str, aVar);
    }

    /* renamed from: a */
    static void m17294a(String str, C4343a aVar) {
        Activity activity = f12860f;
        if (activity != null) {
            aVar.mo12462a(activity);
        }
        f12856b.put(str, aVar);
    }

    /* renamed from: b */
    private static void m17295b() {
        f12859e.mo12465a(new C4344b());
    }

    /* renamed from: b */
    static void m17296b(Activity activity) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.DEBUG;
        C4306Xa.m17135a(jVar, "onActivityDestroyed: " + activity);
        f12858d.clear();
        if (activity == f12860f) {
            f12860f = null;
            m17295b();
        }
        m17298c();
    }

    /* renamed from: b */
    static void m17297b(String str) {
        f12858d.remove(str);
        f12857c.remove(str);
    }

    /* renamed from: c */
    private static void m17298c() {
        String str;
        C4306Xa.C4316j jVar = C4306Xa.C4316j.DEBUG;
        StringBuilder sb = new StringBuilder();
        sb.append("curActivity is NOW: ");
        if (f12860f != null) {
            str = "" + f12860f.getClass().getName() + ":" + f12860f;
        } else {
            str = "null";
        }
        sb.append(str);
        C4306Xa.m17135a(jVar, sb.toString());
    }

    /* renamed from: c */
    static void m17299c(Activity activity) {
        if (activity == f12860f) {
            f12860f = null;
            m17295b();
        }
        m17298c();
    }

    /* renamed from: d */
    static void m17300d(Activity activity) {
        m17303g(activity);
        m17298c();
        m17290a();
    }

    /* renamed from: e */
    static void m17301e(Activity activity) {
    }

    /* renamed from: f */
    static void m17302f(Activity activity) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.DEBUG;
        C4306Xa.m17135a(jVar, "onActivityStopped: " + activity);
        if (activity == f12860f) {
            f12860f = null;
            m17295b();
        }
        for (Map.Entry<String, C4343a> value : f12856b.entrySet()) {
            ((C4343a) value.getValue()).mo12463a((WeakReference<Activity>) new WeakReference(activity));
        }
        m17298c();
    }

    /* renamed from: g */
    private static void m17303g(Activity activity) {
        f12860f = activity;
        for (Map.Entry<String, C4343a> value : f12856b.entrySet()) {
            ((C4343a) value.getValue()).mo12462a(f12860f);
        }
        ViewTreeObserver viewTreeObserver = f12860f.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry next : f12857c.entrySet()) {
            C4346d dVar = new C4346d((C4232Da.C4233a) next.getValue(), (String) next.getKey());
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
            f12858d.put(next.getKey(), dVar);
        }
    }
}
