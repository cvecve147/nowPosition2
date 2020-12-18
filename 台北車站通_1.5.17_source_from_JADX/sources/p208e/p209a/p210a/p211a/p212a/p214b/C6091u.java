package p208e.p209a.p210a.p211a.p212a.p214b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6211p;

/* renamed from: e.a.a.a.a.b.u */
public class C6091u {

    /* renamed from: a */
    private static final Pattern f17029a = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: b */
    private static final String f17030b = Pattern.quote("/");

    /* renamed from: c */
    private final ReentrantLock f17031c = new ReentrantLock();

    /* renamed from: d */
    private final C6094w f17032d;

    /* renamed from: e */
    private final boolean f17033e;

    /* renamed from: f */
    private final boolean f17034f;

    /* renamed from: g */
    private final Context f17035g;

    /* renamed from: h */
    private final String f17036h;

    /* renamed from: i */
    private final String f17037i;

    /* renamed from: j */
    private final Collection<C6208m> f17038j;

    /* renamed from: k */
    C6070d f17039k;

    /* renamed from: l */
    C6068b f17040l;

    /* renamed from: m */
    boolean f17041m;

    /* renamed from: e.a.a.a.a.b.u$a */
    public enum C6092a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        

        /* renamed from: i */
        public final int f17050i;

        private C6092a(int i) {
            this.f17050i = i;
        }
    }

    public C6091u(Context context, String str, String str2, Collection<C6208m> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.f17035g = context;
            this.f17036h = str;
            this.f17037i = str2;
            this.f17038j = collection;
            this.f17032d = new C6094w();
            this.f17039k = new C6070d(context);
            this.f17033e = C6080l.m23046a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            if (!this.f17033e) {
                C6211p f = C6199f.m23420f();
                f.mo16269d("Fabric", "Device ID collection disabled for " + context.getPackageName());
            }
            this.f17034f = C6080l.m23046a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.f17034f) {
                C6211p f2 = C6199f.m23420f();
                f2.mo16269d("Fabric", "User information collection disabled for " + context.getPackageName());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    /* renamed from: a */
    private String m23080a(SharedPreferences sharedPreferences) {
        this.f17031c.lock();
        try {
            String string = sharedPreferences.getString("crashlytics.installation.id", (String) null);
            if (string == null) {
                string = m23081a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
            }
            return string;
        } finally {
            this.f17031c.unlock();
        }
    }

    /* renamed from: a */
    private String m23081a(String str) {
        if (str == null) {
            return null;
        }
        return f17029a.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: a */
    private void m23082a(Map<C6092a, String> map, C6092a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }

    /* renamed from: b */
    private String m23083b(String str) {
        return str.replaceAll(f17030b, "");
    }

    /* renamed from: a */
    public boolean mo16070a() {
        return this.f17034f;
    }

    /* renamed from: b */
    public String mo16071b() {
        C6068b c;
        if (!this.f17033e || (c = mo16072c()) == null) {
            return null;
        }
        return c.f16986a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C6068b mo16072c() {
        if (!this.f17041m) {
            this.f17040l = this.f17039k.mo16045a();
            this.f17041m = true;
        }
        return this.f17040l;
    }

    /* renamed from: d */
    public String mo16073d() {
        if (this.f17033e) {
            String string = Settings.Secure.getString(this.f17035g.getContentResolver(), "android_id");
            if (!"9774d56d682e549c".equals(string)) {
                return m23081a(string);
            }
        }
        return null;
    }

    /* renamed from: e */
    public String mo16074e() {
        return this.f17036h;
    }

    /* renamed from: f */
    public String mo16075f() {
        String str = this.f17037i;
        if (str != null) {
            return str;
        }
        SharedPreferences i = C6080l.m23061i(this.f17035g);
        String string = i.getString("crashlytics.installation.id", (String) null);
        return string == null ? m23080a(i) : string;
    }

    /* renamed from: g */
    public Map<C6092a, String> mo16076g() {
        HashMap hashMap = new HashMap();
        for (C6208m next : this.f17038j) {
            if (next instanceof C6086p) {
                for (Map.Entry next2 : ((C6086p) next).mo14743b().entrySet()) {
                    m23082a(hashMap, (C6092a) next2.getKey(), (String) next2.getValue());
                }
            }
        }
        m23082a(hashMap, C6092a.ANDROID_ID, mo16073d());
        m23082a(hashMap, C6092a.ANDROID_ADVERTISING_ID, mo16071b());
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: h */
    public String mo16077h() {
        if (!this.f17033e) {
            return "";
        }
        String d = mo16073d();
        if (d != null) {
            return d;
        }
        SharedPreferences i = C6080l.m23061i(this.f17035g);
        String string = i.getString("crashlytics.installation.id", (String) null);
        return string == null ? m23080a(i) : string;
    }

    /* renamed from: i */
    public String mo16078i() {
        return this.f17032d.mo16084a(this.f17035g);
    }

    /* renamed from: j */
    public String mo16079j() {
        return String.format(Locale.US, "%s/%s", new Object[]{m23083b(Build.MANUFACTURER), m23083b(Build.MODEL)});
    }

    /* renamed from: k */
    public String mo16080k() {
        return m23083b(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: l */
    public String mo16081l() {
        return m23083b(Build.VERSION.RELEASE);
    }

    /* renamed from: m */
    public String mo16082m() {
        return mo16081l() + "/" + mo16080k();
    }

    /* renamed from: n */
    public Boolean mo16083n() {
        C6068b c;
        if (!this.f17033e || (c = mo16072c()) == null) {
            return null;
        }
        return Boolean.valueOf(c.f16987b);
    }
}
