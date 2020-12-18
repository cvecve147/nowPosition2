package p101d.p129g.p149d;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.api.internal.C1918b;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2092n;
import com.google.android.gms.common.util.C2094p;
import com.google.firebase.components.C4030a;
import com.google.firebase.components.C4042l;
import com.google.firebase.components.C4046p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p039h.C1080b;
import p101d.p129g.p149d.p151b.C5581a;
import p101d.p129g.p149d.p151b.C5582b;

/* renamed from: d.g.d.a */
public class C5574a {

    /* renamed from: a */
    private static final List<String> f15536a = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});

    /* renamed from: b */
    private static final List<String> f15537b = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: c */
    private static final List<String> f15538c = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});

    /* renamed from: d */
    private static final List<String> f15539d = Arrays.asList(new String[0]);

    /* renamed from: e */
    private static final Set<String> f15540e = Collections.emptySet();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f15541f = new Object();

    /* renamed from: g */
    static final Map<String, C5574a> f15542g = new C1080b();

    /* renamed from: h */
    private final Context f15543h;

    /* renamed from: i */
    private final String f15544i;

    /* renamed from: j */
    private final C5579b f15545j;

    /* renamed from: k */
    private final C4046p f15546k;

    /* renamed from: l */
    private final AtomicBoolean f15547l = new AtomicBoolean(false);

    /* renamed from: m */
    private final AtomicBoolean f15548m = new AtomicBoolean();

    /* renamed from: n */
    private final List<Object> f15549n = new CopyOnWriteArrayList();

    /* renamed from: o */
    private final List<C5575a> f15550o = new CopyOnWriteArrayList();

    /* renamed from: p */
    private final List<Object> f15551p = new CopyOnWriteArrayList();

    /* renamed from: q */
    private C5576b f15552q;

    /* renamed from: d.g.d.a$a */
    public interface C5575a {
        /* renamed from: a */
        void mo15071a(boolean z);
    }

    /* renamed from: d.g.d.a$b */
    public interface C5576b {
    }

    @TargetApi(24)
    /* renamed from: d.g.d.a$c */
    private static class C5577c extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<C5577c> f15553a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f15554b;

        private C5577c(Context context) {
            this.f15554b = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m21218b(Context context) {
            if (f15553a.get() == null) {
                C5577c cVar = new C5577c(context);
                if (f15553a.compareAndSet((Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (C5574a.f15541f) {
                for (C5574a a : C5574a.f15542g.values()) {
                    a.m21210h();
                }
            }
            this.f15554b.unregisterReceiver(this);
        }
    }

    private C5574a(Context context, String str, C5579b bVar) {
        C2061y.m9067a(context);
        this.f15543h = context;
        C2061y.m9076b(str);
        this.f15544i = str;
        C2061y.m9067a(bVar);
        this.f15545j = bVar;
        this.f15552q = new C5581a();
        this.f15546k = new C4046p(new C4042l(this.f15543h).mo11445a(), C4030a.m16180a(Context.class, this.f15543h), C4030a.m16180a(C5574a.class, this), C4030a.m16180a(C5579b.class, this.f15545j));
    }

    /* renamed from: a */
    public static C5574a m21200a(Context context) {
        synchronized (f15541f) {
            if (f15542g.containsKey("[DEFAULT]")) {
                C5574a b = m21206b();
                return b;
            }
            C5579b a = C5579b.m21219a(context);
            if (a == null) {
                return null;
            }
            C5574a a2 = m21201a(context, a);
            return a2;
        }
    }

    /* renamed from: a */
    public static C5574a m21201a(Context context, C5579b bVar) {
        return m21202a(context, bVar, "[DEFAULT]");
    }

    /* renamed from: a */
    public static C5574a m21202a(Context context, C5579b bVar, String str) {
        C5574a aVar;
        C5582b.m21226a(context);
        if (C2092n.m9161b() && (context.getApplicationContext() instanceof Application)) {
            C1918b.m8490a((Application) context.getApplicationContext());
            C1918b.m8489a().mo7394a((C1918b.C1919a) new C5583c());
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f15541f) {
            boolean z = !f15542g.containsKey(trim);
            StringBuilder sb = new StringBuilder(String.valueOf(trim).length() + 33);
            sb.append("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            C2061y.m9078b(z, sb.toString());
            C2061y.m9068a(context, (Object) "Application context cannot be null.");
            aVar = new C5574a(context, trim, bVar);
            f15542g.put(trim, aVar);
        }
        C5582b.m21227a(aVar);
        aVar.m21210h();
        return aVar;
    }

    /* renamed from: a */
    private static <T> void m21204a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String next : iterable) {
            if (z) {
                try {
                    if (!f15539d.contains(next)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (!f15540e.contains(next)) {
                        Log.d("FirebaseApp", String.valueOf(next).concat(" is not linked. Skipping initialization."));
                    } else {
                        throw new IllegalStateException(String.valueOf(next).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(String.valueOf(next).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (InvocationTargetException e) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    String valueOf = String.valueOf(next);
                    Log.wtf("FirebaseApp", valueOf.length() != 0 ? "Failed to initialize ".concat(valueOf) : new String("Failed to initialize "), e2);
                }
            }
            Method method = Class.forName(next).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke((Object) null, new Object[]{t});
            }
        }
    }

    /* renamed from: a */
    public static void m21205a(boolean z) {
        synchronized (f15541f) {
            ArrayList arrayList = new ArrayList(f15542g.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C5574a aVar = (C5574a) obj;
                if (aVar.f15547l.get()) {
                    aVar.m21207b(z);
                }
            }
        }
    }

    /* renamed from: b */
    public static C5574a m21206b() {
        C5574a aVar;
        synchronized (f15541f) {
            aVar = f15542g.get("[DEFAULT]");
            if (aVar == null) {
                String a = C2094p.m9173a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 116);
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(a);
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return aVar;
    }

    /* renamed from: b */
    private final void m21207b(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C5575a a : this.f15550o) {
            a.mo15071a(z);
        }
    }

    /* renamed from: g */
    private final void m21209g() {
        C2061y.m9078b(!this.f15548m.get(), "FirebaseApp was deleted");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m21210h() {
        boolean b = C1006a.m5393b(this.f15543h);
        if (b) {
            C5577c.m21218b(this.f15543h);
        } else {
            this.f15546k.mo11447a(mo15067e());
        }
        m21204a(C5574a.class, this, f15536a, b);
        if (mo15067e()) {
            m21204a(C5574a.class, this, f15537b, b);
            m21204a(Context.class, this.f15543h, f15538c, b);
        }
    }

    /* renamed from: a */
    public Context mo15063a() {
        m21209g();
        return this.f15543h;
    }

    /* renamed from: a */
    public <T> T mo15064a(Class<T> cls) {
        m21209g();
        return this.f15546k.mo11435a((Class) cls);
    }

    /* renamed from: c */
    public String mo15065c() {
        m21209g();
        return this.f15544i;
    }

    /* renamed from: d */
    public C5579b mo15066d() {
        m21209g();
        return this.f15545j;
    }

    /* renamed from: e */
    public boolean mo15067e() {
        return "[DEFAULT]".equals(mo15065c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5574a)) {
            return false;
        }
        return this.f15544i.equals(((C5574a) obj).mo15065c());
    }

    public int hashCode() {
        return this.f15544i.hashCode();
    }

    public String toString() {
        C2059x.C2060a a = C2059x.m9063a((Object) this);
        a.mo7711a("name", this.f15544i);
        a.mo7711a("options", this.f15545j);
        return a.toString();
    }
}
