package p287me.tatarka.support.internal.job;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import p013b.p018b.p028h.p039h.C1083e;
import p245f.p246a.p247a.p248a.C6446a;
import p245f.p246a.p247a.p248a.p249a.C6448b;
import p287me.tatarka.support.internal.receivers.C6803c;
import p287me.tatarka.support.job.JobInfo;
import p287me.tatarka.support.p288os.PersistableBundle;

/* renamed from: me.tatarka.support.internal.job.d */
public class C6797d {

    /* renamed from: a */
    private static final Object f18871a = new Object();

    /* renamed from: b */
    private static C6797d f18872b;

    /* renamed from: c */
    final C6448b<C6803c> f18873c;

    /* renamed from: d */
    final Context f18874d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f18875e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1083e f18876f;

    /* renamed from: g */
    private final Handler f18877g = C6446a.m24070a();

    /* renamed from: me.tatarka.support.internal.job.d$a */
    private class C6798a implements Runnable {

        /* renamed from: a */
        private final C6448b<C6803c> f18878a;

        C6798a(C6448b<C6803c> bVar) {
            this.f18878a = bVar;
        }

        /* renamed from: a */
        private List<C6803c> m25790a(FileInputStream fileInputStream) {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setInput(fileInputStream, (String) null);
            int eventType = newPullParser.getEventType();
            while (eventType != 2 && eventType != 1) {
                eventType = newPullParser.next();
            }
            if (eventType != 1 && "job-info".equals(newPullParser.getName())) {
                ArrayList arrayList = new ArrayList();
                try {
                    if (Integer.valueOf(newPullParser.getAttributeValue((String) null, ClientCookie.VERSION_ATTR)).intValue() != 0) {
                        return null;
                    }
                    int next = newPullParser.next();
                    do {
                        if (next == 2 && "job".equals(newPullParser.getName())) {
                            C6803c c = m25795c(newPullParser);
                            if (c != null) {
                                arrayList.add(c);
                            }
                        }
                        next = newPullParser.next();
                    } while (next != 1);
                    return arrayList;
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }

        /* renamed from: a */
        private JobInfo.C6806a m25791a(XmlPullParser xmlPullParser) {
            return new JobInfo.C6806a(Integer.valueOf(xmlPullParser.getAttributeValue((String) null, "jobid")).intValue(), new ComponentName(xmlPullParser.getAttributeValue((String) null, "package"), xmlPullParser.getAttributeValue((String) null, "class")));
        }

        /* renamed from: a */
        private void m25792a(JobInfo.C6806a aVar, XmlPullParser xmlPullParser) {
            if (xmlPullParser.getAttributeValue((String) null, "unmetered") != null) {
                aVar.mo17437a(2);
            }
            if (xmlPullParser.getAttributeValue((String) null, "connectivity") != null) {
                aVar.mo17437a(1);
            }
            if (xmlPullParser.getAttributeValue((String) null, "idle") != null) {
                aVar.mo17446c(true);
            }
            if (xmlPullParser.getAttributeValue((String) null, "charging") != null) {
                aVar.mo17444b(true);
            }
        }

        /* renamed from: b */
        private Pair<Long, Long> m25793b(XmlPullParser xmlPullParser) {
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "deadline");
            long j = 0;
            long max = attributeValue != null ? Math.max(Long.valueOf(attributeValue).longValue() - currentTimeMillis, 0) + elapsedRealtime : Long.MAX_VALUE;
            String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "delay");
            if (attributeValue2 != null) {
                j = elapsedRealtime + Math.max(Long.valueOf(attributeValue2).longValue() - currentTimeMillis, 0);
            }
            return Pair.create(Long.valueOf(j), Long.valueOf(max));
        }

        /* renamed from: b */
        private void m25794b(JobInfo.C6806a aVar, XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "initial-backoff");
            if (attributeValue != null) {
                aVar.mo17439a(Long.valueOf(attributeValue).longValue(), Integer.valueOf(xmlPullParser.getAttributeValue((String) null, "backoff-policy")).intValue());
            }
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private p287me.tatarka.support.internal.receivers.C6803c m25795c(org.xmlpull.v1.XmlPullParser r10) {
            /*
                r9 = this;
                r0 = 0
                me.tatarka.support.job.JobInfo$a r1 = r9.m25791a((org.xmlpull.v1.XmlPullParser) r10)     // Catch:{ NumberFormatException -> 0x00ed }
            L_0x0005:
                int r2 = r10.next()
                r3 = 4
                if (r2 == r3) goto L_0x0005
                r4 = 2
                if (r2 != r4) goto L_0x00ed
                java.lang.String r2 = r10.getName()
                java.lang.String r5 = "constraints"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L_0x001d
                goto L_0x00ed
            L_0x001d:
                r9.m25792a(r1, r10)     // Catch:{  }
                r10.next()
            L_0x0023:
                int r2 = r10.next()
                if (r2 == r3) goto L_0x0023
                if (r2 == r4) goto L_0x002c
                return r0
            L_0x002c:
                android.util.Pair r2 = r9.m25793b(r10)     // Catch:{  }
                java.lang.String r5 = r10.getName()
                java.lang.String r6 = "periodic"
                boolean r5 = r6.equals(r5)
                if (r5 == 0) goto L_0x004f
                java.lang.String r5 = "period"
                java.lang.String r5 = r10.getAttributeValue(r0, r5)     // Catch:{ NumberFormatException -> 0x004e }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ NumberFormatException -> 0x004e }
                long r5 = r5.longValue()     // Catch:{ NumberFormatException -> 0x004e }
                r1.mo17445c((long) r5)     // Catch:{ NumberFormatException -> 0x004e }
                goto L_0x009a
            L_0x004e:
                return r0
            L_0x004f:
                java.lang.String r5 = r10.getName()
                java.lang.String r6 = "one-off"
                boolean r5 = r6.equals(r5)
                if (r5 == 0) goto L_0x00ed
                java.lang.Object r5 = r2.first     // Catch:{  }
                java.lang.Long r5 = (java.lang.Long) r5     // Catch:{  }
                long r5 = r5.longValue()     // Catch:{  }
                r7 = 0
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 == 0) goto L_0x0079
                java.lang.Object r5 = r2.first     // Catch:{  }
                java.lang.Long r5 = (java.lang.Long) r5     // Catch:{  }
                long r5 = r5.longValue()     // Catch:{  }
                long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{  }
                long r5 = r5 - r7
                r1.mo17438a((long) r5)     // Catch:{  }
            L_0x0079:
                java.lang.Object r5 = r2.second     // Catch:{  }
                java.lang.Long r5 = (java.lang.Long) r5     // Catch:{  }
                long r5 = r5.longValue()     // Catch:{  }
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 == 0) goto L_0x009a
                java.lang.Object r5 = r2.second     // Catch:{  }
                java.lang.Long r5 = (java.lang.Long) r5     // Catch:{  }
                long r5 = r5.longValue()     // Catch:{  }
                long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{  }
                long r5 = r5 - r7
                r1.mo17443b((long) r5)     // Catch:{  }
            L_0x009a:
                java.lang.String r5 = "persisted"
                java.lang.String r5 = r10.getAttributeValue(r0, r5)
                if (r5 == 0) goto L_0x00ad
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                boolean r5 = r5.booleanValue()
                r1.mo17441a((boolean) r5)
            L_0x00ad:
                r9.m25794b(r1, r10)
                r10.nextTag()
            L_0x00b3:
                int r5 = r10.next()
                if (r5 == r3) goto L_0x00b3
                if (r5 != r4) goto L_0x00ed
                java.lang.String r3 = r10.getName()
                java.lang.String r4 = "extras"
                boolean r3 = r4.equals(r3)
                if (r3 != 0) goto L_0x00c8
                goto L_0x00ed
            L_0x00c8:
                me.tatarka.support.os.PersistableBundle r0 = p287me.tatarka.support.p288os.PersistableBundle.m25910a((org.xmlpull.v1.XmlPullParser) r10)
                r1.mo17440a((p287me.tatarka.support.p288os.PersistableBundle) r0)
                r10.nextTag()
                me.tatarka.support.internal.receivers.c r10 = new me.tatarka.support.internal.receivers.c
                me.tatarka.support.job.JobInfo r4 = r1.mo17442a()
                java.lang.Object r0 = r2.first
                java.lang.Long r0 = (java.lang.Long) r0
                long r5 = r0.longValue()
                java.lang.Object r0 = r2.second
                java.lang.Long r0 = (java.lang.Long) r0
                long r7 = r0.longValue()
                r3 = r10
                r3.<init>(r4, r5, r7)
                return r10
            L_0x00ed:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p287me.tatarka.support.internal.job.C6797d.C6798a.m25795c(org.xmlpull.v1.XmlPullParser):me.tatarka.support.internal.receivers.c");
        }

        public void run() {
            try {
                FileInputStream a = C6797d.this.f18876f.mo5138a();
                synchronized (C6797d.this) {
                    List<C6803c> a2 = m25790a(a);
                    if (a2 != null) {
                        for (int i = 0; i < a2.size(); i++) {
                            C6803c cVar = a2.get(i);
                            if (cVar.mo17413o() || C6797d.this.m25782c(cVar)) {
                                this.f18878a.add(cVar);
                            }
                        }
                    }
                }
                a.close();
            } catch (FileNotFoundException | IOException | XmlPullParserException unused) {
            }
        }
    }

    /* renamed from: me.tatarka.support.internal.job.d$b */
    private class C6799b implements Runnable {
        private C6799b() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.io.IOException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: org.xmlpull.v1.XmlPullParserException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.io.IOException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.io.IOException} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m25796a(java.util.List<p287me.tatarka.support.internal.receivers.C6803c> r10) {
            /*
                r9 = this;
                java.lang.String r0 = "job"
                java.lang.String r1 = "job-info"
                java.lang.String r2 = "JobStore"
                java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r3.<init>()     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                f.a.a.a.a.e r4 = new f.a.a.a.a.e     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r4.<init>()     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                java.lang.String r5 = "utf-8"
                r4.setOutput(r3, r5)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r5 = 1
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r7 = 0
                r4.startDocument(r7, r6)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                java.lang.String r6 = "http://xmlpull.org/v1/doc/features.html#indent-output"
                r4.setFeature(r6, r5)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r4.startTag(r7, r1)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                java.lang.String r5 = "version"
                r6 = 0
                java.lang.String r8 = java.lang.Integer.toString(r6)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r4.attribute(r7, r5, r8)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r5 = r6
            L_0x0031:
                int r8 = r10.size()     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                if (r5 >= r8) goto L_0x0056
                java.lang.Object r8 = r10.get(r5)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                me.tatarka.support.internal.receivers.c r8 = (p287me.tatarka.support.internal.receivers.C6803c) r8     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r4.startTag(r7, r0)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r9.m25798a((org.xmlpull.v1.XmlSerializer) r4, (p287me.tatarka.support.internal.receivers.C6803c) r8)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r9.m25799b(r4, r8)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r9.m25800c(r4, r8)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                me.tatarka.support.os.PersistableBundle r8 = r8.mo17400b()     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r9.m25797a((p287me.tatarka.support.p288os.PersistableBundle) r8, (org.xmlpull.v1.XmlSerializer) r4)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r4.endTag(r7, r0)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                int r5 = r5 + 1
                goto L_0x0031
            L_0x0056:
                r4.endTag(r7, r1)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r4.endDocument()     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                me.tatarka.support.internal.job.d r10 = p287me.tatarka.support.internal.job.C6797d.this     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                b.b.h.h.e r10 = r10.f18876f     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                java.io.FileOutputStream r10 = r10.mo5140b()     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r10.write(r0)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                me.tatarka.support.internal.job.d r0 = p287me.tatarka.support.internal.job.C6797d.this     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                b.b.h.h.e r0 = r0.f18876f     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                r0.mo5139a(r10)     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                me.tatarka.support.internal.job.d r10 = p287me.tatarka.support.internal.job.C6797d.this     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                int unused = r10.f18875e = r6     // Catch:{ IOException -> 0x0082, XmlPullParserException -> 0x007c }
                goto L_0x008a
            L_0x007c:
                r10 = move-exception
                java.lang.String r0 = r10.getMessage()
                goto L_0x0087
            L_0x0082:
                r10 = move-exception
                java.lang.String r0 = r10.getMessage()
            L_0x0087:
                android.util.Log.e(r2, r0, r10)
            L_0x008a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p287me.tatarka.support.internal.job.C6797d.C6799b.m25796a(java.util.List):void");
        }

        /* renamed from: a */
        private void m25797a(PersistableBundle persistableBundle, XmlSerializer xmlSerializer) {
            xmlSerializer.startTag((String) null, "extras");
            persistableBundle.mo17459a(xmlSerializer);
            xmlSerializer.endTag((String) null, "extras");
        }

        /* renamed from: a */
        private void m25798a(XmlSerializer xmlSerializer, C6803c cVar) {
            xmlSerializer.attribute((String) null, "jobid", Integer.toString(cVar.mo17402d()));
            xmlSerializer.attribute((String) null, "package", cVar.mo17405g().getPackageName());
            xmlSerializer.attribute((String) null, "class", cVar.mo17405g().getClassName());
        }

        /* renamed from: b */
        private void m25799b(XmlSerializer xmlSerializer, C6803c cVar) {
            xmlSerializer.startTag((String) null, "constraints");
            if (cVar.mo17411m()) {
                xmlSerializer.attribute((String) null, "unmetered", Boolean.toString(true));
            }
            if (cVar.mo17407i()) {
                xmlSerializer.attribute((String) null, "connectivity", Boolean.toString(true));
            }
            if (cVar.mo17409k()) {
                xmlSerializer.attribute((String) null, "idle", Boolean.toString(true));
            }
            if (cVar.mo17406h()) {
                xmlSerializer.attribute((String) null, "charging", Boolean.toString(true));
            }
            xmlSerializer.endTag((String) null, "constraints");
        }

        /* renamed from: c */
        private void m25800c(XmlSerializer xmlSerializer, C6803c cVar) {
            JobInfo c = cVar.mo17401c();
            if (cVar.mo17401c().mo17431l()) {
                xmlSerializer.startTag((String) null, "periodic");
                xmlSerializer.attribute((String) null, "period", Long.toString(c.mo17424e()));
            } else {
                xmlSerializer.startTag((String) null, "one-off");
            }
            if (cVar.mo17413o()) {
                xmlSerializer.attribute((String) null, "persisted", Boolean.toString(true));
            }
            if (cVar.mo17408j()) {
                xmlSerializer.attribute((String) null, "deadline", Long.toString(System.currentTimeMillis() + (cVar.mo17403e() - SystemClock.elapsedRealtime())));
            }
            if (cVar.mo17410l()) {
                xmlSerializer.attribute((String) null, "delay", Long.toString(System.currentTimeMillis() + (cVar.mo17398a() - SystemClock.elapsedRealtime())));
            }
            if (!(cVar.mo17401c().mo17422d() == 30000 && cVar.mo17401c().mo17419a() == 1)) {
                xmlSerializer.attribute((String) null, "backoff-policy", Integer.toString(c.mo17419a()));
                xmlSerializer.attribute((String) null, "initial-backoff", Long.toString(c.mo17422d()));
            }
            if (c.mo17431l()) {
                xmlSerializer.endTag((String) null, "periodic");
            } else {
                xmlSerializer.endTag((String) null, "one-off");
            }
        }

        public void run() {
            SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            synchronized (C6797d.this) {
                for (int i = 0; i < C6797d.this.f18873c.size(); i++) {
                    C6803c e = C6797d.this.f18873c.mo16567e(i);
                    arrayList.add(new C6803c(e.mo17401c(), e.mo17398a(), e.mo17403e()));
                }
            }
            m25796a(arrayList);
        }
    }

    private C6797d(Context context, File file) {
        this.f18874d = context;
        this.f18875e = 0;
        File file2 = new File(new File(file, "system"), "job");
        file2.mkdirs();
        this.f18876f = new C1083e(new File(file2, "jobs.xml"));
        this.f18873c = new C6448b<>();
        m25779a(this.f18873c);
    }

    /* renamed from: a */
    public static C6797d m25778a(Context context) {
        C6797d dVar;
        synchronized (f18871a) {
            if (f18872b == null) {
                f18872b = new C6797d(context, context.getFilesDir());
            }
            dVar = f18872b;
        }
        return dVar;
    }

    /* renamed from: a */
    private void m25779a(C6448b<C6803c> bVar) {
        new C6798a(bVar).run();
    }

    /* renamed from: c */
    private void m25781c() {
        this.f18875e++;
        if (this.f18875e >= 1) {
            this.f18877g.post(new C6799b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m25782c(C6803c cVar) {
        return PendingIntent.getService(this.f18874d, cVar.mo17402d(), new Intent(this.f18874d, JobSchedulerService.class).setAction(cVar.mo17415q()), 536870912) != null;
    }

    /* renamed from: d */
    private void m25783d(C6803c cVar) {
        ((AlarmManager) this.f18874d.getSystemService("alarm")).set(3, Long.MAX_VALUE, PendingIntent.getService(this.f18874d, cVar.mo17402d(), new Intent(this.f18874d, JobSchedulerService.class).setAction(cVar.mo17415q()), 268435456));
    }

    /* renamed from: e */
    private void m25784e(C6803c cVar) {
        PendingIntent service = PendingIntent.getService(this.f18874d, cVar.mo17402d(), new Intent(this.f18874d, JobSchedulerService.class).setAction(cVar.mo17415q()), 536870912);
        if (service != null) {
            ((AlarmManager) this.f18874d.getSystemService("alarm")).cancel(service);
            service.cancel();
        }
    }

    /* renamed from: a */
    public C6803c mo17374a(int i) {
        Iterator<C6803c> it = this.f18873c.iterator();
        while (it.hasNext()) {
            C6803c next = it.next();
            if (next.mo17399a(i)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo17375a() {
        for (int i = 0; i < this.f18873c.size(); i++) {
            C6803c e = this.f18873c.mo16567e(i);
            if (!e.mo17413o()) {
                m25784e(e);
            }
        }
        this.f18873c.clear();
        m25781c();
    }

    /* renamed from: a */
    public boolean mo17376a(C6803c cVar) {
        boolean remove = this.f18873c.remove(cVar);
        this.f18873c.add(cVar);
        if (!cVar.mo17413o()) {
            m25783d(cVar);
        }
        m25781c();
        return remove;
    }

    /* renamed from: b */
    public C6448b<C6803c> mo17377b() {
        return this.f18873c;
    }

    /* renamed from: b */
    public boolean mo17378b(C6803c cVar) {
        boolean remove = this.f18873c.remove(cVar);
        if (!remove) {
            return false;
        }
        if (!cVar.mo17413o()) {
            m25784e(cVar);
        }
        m25781c();
        return remove;
    }
}
