package p101d.p122f.p123a.p126c;

import android.content.Context;
import java.io.File;
import java.util.Set;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;

/* renamed from: d.f.a.c.V */
class C5369V {

    /* renamed from: a */
    private static final C5371b f15162a = new C5371b();

    /* renamed from: b */
    private final Context f15163b;

    /* renamed from: c */
    private final C5370a f15164c;

    /* renamed from: d */
    private C5366S f15165d;

    /* renamed from: d.f.a.c.V$a */
    public interface C5370a {
        /* renamed from: a */
        File mo14802a();
    }

    /* renamed from: d.f.a.c.V$b */
    private static final class C5371b implements C5366S {
        private C5371b() {
        }

        /* renamed from: a */
        public void mo14788a() {
        }

        /* renamed from: b */
        public C5399b mo14789b() {
            return null;
        }

        /* renamed from: c */
        public void mo14790c() {
        }
    }

    C5369V(Context context, C5370a aVar) {
        this(context, aVar, (String) null);
    }

    C5369V(Context context, C5370a aVar, String str) {
        this.f15163b = context;
        this.f15164c = aVar;
        this.f15165d = f15162a;
        mo14799a(str);
    }

    /* renamed from: a */
    private String m20664a(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        return lastIndexOf == -1 ? name : name.substring(20, lastIndexOf);
    }

    /* renamed from: b */
    private File m20665b(String str) {
        return new File(this.f15164c.mo14802a(), "crashlytics-userlog-" + str + ".temp");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14797a() {
        this.f15165d.mo14790c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14798a(File file, int i) {
        this.f15165d = new C5406ea(file, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14799a(String str) {
        this.f15165d.mo14788a();
        this.f15165d = f15162a;
        if (str != null) {
            if (!C6080l.m23046a(this.f15163b, "com.crashlytics.CollectCustomLogs", true)) {
                C6199f.m23420f().mo16269d("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            } else {
                mo14798a(m20665b(str), 65536);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14800a(Set<String> set) {
        File[] listFiles = this.f15164c.mo14802a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(m20664a(file))) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5399b mo14801b() {
        return this.f15165d.mo14789b();
    }
}
