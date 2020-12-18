package p208e.p221b.p226c;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: e.b.c.a */
public final class C6228a extends RuntimeException {

    /* renamed from: a */
    private final List<Throwable> f17352a;

    /* renamed from: b */
    private final String f17353b;

    /* renamed from: c */
    private Throwable f17354c;

    /* renamed from: e.b.c.a$a */
    static final class C6229a extends RuntimeException {
        C6229a() {
        }

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: e.b.c.a$b */
    static abstract class C6230b {
        C6230b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo16338a(Object obj);
    }

    /* renamed from: e.b.c.a$c */
    static final class C6231c extends C6230b {

        /* renamed from: a */
        private final PrintStream f17355a;

        C6231c(PrintStream printStream) {
            this.f17355a = printStream;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16338a(Object obj) {
            this.f17355a.println(obj);
        }
    }

    /* renamed from: e.b.c.a$d */
    static final class C6232d extends C6230b {

        /* renamed from: a */
        private final PrintWriter f17356a;

        C6232d(PrintWriter printWriter) {
            this.f17356a = printWriter;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16338a(Object obj) {
            this.f17356a.println(obj);
        }
    }

    public C6228a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof C6228a) {
                    linkedHashSet.addAll(((C6228a) obj).mo16331a());
                } else {
                    linkedHashSet.add(obj == null ? new NullPointerException("Throwable was null!") : obj);
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.f17352a = Collections.unmodifiableList(arrayList);
            this.f17353b = this.f17352a.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6228a(Throwable... thArr) {
        this((Iterable<? extends Throwable>) thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    private List<Throwable> m23520a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m23521a(C6230b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable a : this.f17352a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m23522a(sb, a, "\t");
            i++;
        }
        bVar.mo16338a(sb.toString());
    }

    /* renamed from: a */
    private void m23522a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m23522a(sb, th.getCause(), "");
        }
    }

    /* renamed from: b */
    private Throwable m23523b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || this.f17354c == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }

    /* renamed from: a */
    public List<Throwable> mo16331a() {
        return this.f17352a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|(4:13|(2:15|33)(2:16|34)|32|11)|17|18|19|20|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f17354c     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005c
            e.b.c.a$a r0 = new e.b.c.a$a     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Throwable> r2 = r8.f17352a     // Catch:{ all -> 0x0060 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0060 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0060 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0060 }
            java.util.List r5 = r8.m23520a((java.lang.Throwable) r4)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0060 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x004e
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x004e:
            r1.add(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x0052:
            r3.initCause(r4)     // Catch:{ Throwable -> 0x0055 }
        L_0x0055:
            java.lang.Throwable r3 = r8.m23523b(r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0016
        L_0x005a:
            r8.f17354c = r0     // Catch:{ all -> 0x0060 }
        L_0x005c:
            java.lang.Throwable r0 = r8.f17354c     // Catch:{ all -> 0x0060 }
            monitor-exit(r8)
            return r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p226c.C6228a.getCause():java.lang.Throwable");
    }

    public String getMessage() {
        return this.f17353b;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m23521a((C6230b) new C6231c(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        m23521a((C6230b) new C6232d(printWriter));
    }
}
