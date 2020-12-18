package p208e.p209a.p210a.p211a.p212a.p217d;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6084n;

/* renamed from: e.a.a.a.a.d.c */
public abstract class C6135c<T> {

    /* renamed from: a */
    protected final Context f17125a;

    /* renamed from: b */
    protected final C6133a<T> f17126b;

    /* renamed from: c */
    protected final C6084n f17127c;

    /* renamed from: d */
    protected final C6137d f17128d;

    /* renamed from: e */
    private final int f17129e;

    /* renamed from: f */
    protected volatile long f17130f;

    /* renamed from: g */
    protected final List<C6138e> f17131g = new CopyOnWriteArrayList();

    /* renamed from: e.a.a.a.a.d.c$a */
    static class C6136a {

        /* renamed from: a */
        final File f17132a;

        /* renamed from: b */
        final long f17133b;

        public C6136a(File file, long j) {
            this.f17132a = file;
            this.f17133b = j;
        }
    }

    public C6135c(Context context, C6133a<T> aVar, C6084n nVar, C6137d dVar, int i) {
        this.f17125a = context.getApplicationContext();
        this.f17126b = aVar;
        this.f17128d = dVar;
        this.f17127c = nVar;
        this.f17130f = this.f17127c.mo16037a();
        this.f17129e = i;
    }

    /* renamed from: a */
    private void m23199a(int i) {
        if (!this.f17128d.mo16173a(i, mo14725e())) {
            C6080l.m23039a(this.f17125a, 4, "Fabric", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.f17128d.mo16168a()), Integer.valueOf(i), Integer.valueOf(mo14725e())}));
            mo16167g();
        }
    }

    /* renamed from: b */
    private void m23200b(String str) {
        for (C6138e a : this.f17131g) {
            try {
                a.mo14687a(str);
            } catch (Exception e) {
                C6080l.m23040a(this.f17125a, "One of the roll over listeners threw an exception", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public long mo16160a(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo16161a() {
        C6137d dVar = this.f17128d;
        dVar.mo16171a(dVar.mo16175c());
        this.f17128d.mo16176d();
    }

    /* renamed from: a */
    public void mo16162a(C6138e eVar) {
        if (eVar != null) {
            this.f17131g.add(eVar);
        }
    }

    /* renamed from: a */
    public void mo16163a(T t) {
        byte[] a = this.f17126b.mo14671a(t);
        m23199a(a.length);
        this.f17128d.mo16172a(a);
    }

    /* renamed from: a */
    public void mo16164a(List<File> list) {
        this.f17128d.mo16171a(list);
    }

    /* renamed from: b */
    public void mo16165b() {
        List<File> c = this.f17128d.mo16175c();
        int f = mo14726f();
        if (c.size() > f) {
            int size = c.size() - f;
            C6080l.m23054c(this.f17125a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(c.size()), Integer.valueOf(f), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new C6134b(this));
            for (File next : c) {
                treeSet.add(new C6136a(next, mo16160a(next.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C6136a) it.next()).f17132a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.f17128d.mo16171a((List<File>) arrayList);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo14724c();

    /* renamed from: d */
    public List<File> mo16166d() {
        return this.f17128d.mo16169a(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo14725e() {
        return 8000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo14726f() {
        return this.f17129e;
    }

    /* renamed from: g */
    public boolean mo16167g() {
        String str;
        boolean z = true;
        if (!this.f17128d.mo16174b()) {
            str = mo14724c();
            this.f17128d.mo16170a(str);
            C6080l.m23039a(this.f17125a, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.f17130f = this.f17127c.mo16037a();
        } else {
            str = null;
            z = false;
        }
        m23200b(str);
        return z;
    }
}
