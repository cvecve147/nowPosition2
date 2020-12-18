package p101d.p122f.p123a.p126c;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6078j;

/* renamed from: d.f.a.c.ha */
class C5413ha {

    /* renamed from: a */
    static final Map<String, String> f15269a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final short[] f15270b = {10, 20, 30, 60, 120, 300};

    /* renamed from: c */
    private final Object f15271c = new Object();

    /* renamed from: d */
    private final C5360L f15272d;

    /* renamed from: e */
    private final String f15273e;

    /* renamed from: f */
    private final C5416c f15274f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5415b f15275g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Thread f15276h;

    /* renamed from: d.f.a.c.ha$a */
    static final class C5414a implements C5417d {
        C5414a() {
        }

        /* renamed from: a */
        public boolean mo14859a() {
            return true;
        }
    }

    /* renamed from: d.f.a.c.ha$b */
    interface C5415b {
        /* renamed from: a */
        boolean mo14860a();
    }

    /* renamed from: d.f.a.c.ha$c */
    interface C5416c {
        /* renamed from: a */
        File[] mo14861a();

        /* renamed from: b */
        File[] mo14862b();
    }

    /* renamed from: d.f.a.c.ha$d */
    interface C5417d {
        /* renamed from: a */
        boolean mo14859a();
    }

    /* renamed from: d.f.a.c.ha$e */
    private class C5418e extends C6078j {

        /* renamed from: a */
        private final float f15277a;

        /* renamed from: b */
        private final C5417d f15278b;

        C5418e(float f, C5417d dVar) {
            this.f15277a = f;
            this.f15278b = dVar;
        }

        /* renamed from: b */
        private void m20809b() {
            C6211p f = C6199f.m23420f();
            f.mo16269d("CrashlyticsCore", "Starting report processing in " + this.f15277a + " second(s)...");
            float f2 = this.f15277a;
            if (f2 > 0.0f) {
                try {
                    Thread.sleep((long) (f2 * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<C5411ga> b = C5413ha.this.mo14858b();
            if (!C5413ha.this.f15275g.mo14860a()) {
                if (b.isEmpty() || this.f15278b.mo14859a()) {
                    int i = 0;
                    while (!b.isEmpty() && !C5413ha.this.f15275g.mo14860a()) {
                        C6211p f3 = C6199f.m23420f();
                        f3.mo16269d("CrashlyticsCore", "Attempting to send " + b.size() + " report(s)");
                        for (C5411ga a : b) {
                            C5413ha.this.mo14857a(a);
                        }
                        b = C5413ha.this.mo14858b();
                        if (!b.isEmpty()) {
                            int i2 = i + 1;
                            long j = (long) C5413ha.f15270b[Math.min(i, C5413ha.f15270b.length - 1)];
                            C6211p f4 = C6199f.m23420f();
                            f4.mo16269d("CrashlyticsCore", "Report submisson: scheduling delayed retry in " + j + " seconds");
                            Thread.sleep(j * 1000);
                            i = i2;
                        }
                    }
                    return;
                }
                C6211p f5 = C6199f.m23420f();
                f5.mo16269d("CrashlyticsCore", "User declined to send. Removing " + b.size() + " Report(s).");
                for (C5411ga remove : b) {
                    remove.remove();
                }
            }
        }

        /* renamed from: a */
        public void mo14863a() {
            try {
                m20809b();
            } catch (Exception e) {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", e);
            }
            Thread unused = C5413ha.this.f15276h = null;
        }
    }

    public C5413ha(String str, C5360L l, C5416c cVar, C5415b bVar) {
        if (l != null) {
            this.f15272d = l;
            this.f15273e = str;
            this.f15274f = cVar;
            this.f15275g = bVar;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* renamed from: a */
    public synchronized void mo14856a(float f, C5417d dVar) {
        if (this.f15276h != null) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Report upload has already been started.");
            return;
        }
        this.f15276h = new Thread(new C5418e(f, dVar), "Crashlytics Report Uploader");
        this.f15276h.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo14857a(C5411ga gaVar) {
        boolean z;
        synchronized (this.f15271c) {
            z = false;
            try {
                boolean a = this.f15272d.mo14778a(new C5359K(this.f15273e, gaVar));
                C6211p f = C6199f.m23420f();
                StringBuilder sb = new StringBuilder();
                sb.append("Crashlytics report upload ");
                sb.append(a ? "complete: " : "FAILED: ");
                sb.append(gaVar.mo14792b());
                f.mo16271e("CrashlyticsCore", sb.toString());
                if (a) {
                    gaVar.remove();
                    z = true;
                }
            } catch (Exception e) {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "Error occurred sending report " + gaVar, e);
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C5411ga> mo14858b() {
        File[] b;
        File[] a;
        C6199f.m23420f().mo16269d("CrashlyticsCore", "Checking for crash reports...");
        synchronized (this.f15271c) {
            b = this.f15274f.mo14862b();
            a = this.f15274f.mo14861a();
        }
        LinkedList linkedList = new LinkedList();
        if (b != null) {
            for (File file : b) {
                C6199f.m23420f().mo16269d("CrashlyticsCore", "Found crash report " + file.getPath());
                linkedList.add(new C5424ja(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (a != null) {
            for (File file2 : a) {
                String a2 = C5446y.m20869a(file2);
                if (!hashMap.containsKey(a2)) {
                    hashMap.put(a2, new LinkedList());
                }
                ((List) hashMap.get(a2)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Found invalid session: " + str);
            List list = (List) hashMap.get(str);
            linkedList.add(new C5367T(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (linkedList.isEmpty()) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "No reports found.");
        }
        return linkedList;
    }
}
