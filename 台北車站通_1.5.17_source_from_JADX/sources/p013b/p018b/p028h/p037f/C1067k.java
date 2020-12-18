package p013b.p018b.p028h.p037f;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;

/* renamed from: b.b.h.f.k */
public class C1067k {

    /* renamed from: a */
    private final Object f4006a = new Object();

    /* renamed from: b */
    private HandlerThread f4007b;

    /* renamed from: c */
    private Handler f4008c;

    /* renamed from: d */
    private int f4009d;

    /* renamed from: e */
    private Handler.Callback f4010e = new C1063g(this);

    /* renamed from: f */
    private final int f4011f;

    /* renamed from: g */
    private final int f4012g;

    /* renamed from: h */
    private final String f4013h;

    /* renamed from: b.b.h.f.k$a */
    public interface C1068a<T> {
        /* renamed from: a */
        void mo5084a(T t);
    }

    public C1067k(String str, int i, int i2) {
        this.f4013h = str;
        this.f4012g = i;
        this.f4011f = i2;
        this.f4009d = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5577a() {
        synchronized (this.f4006a) {
            if (!this.f4008c.hasMessages(1)) {
                this.f4007b.quit();
                this.f4007b = null;
                this.f4008c = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5580a(Runnable runnable) {
        runnable.run();
        synchronized (this.f4006a) {
            this.f4008c.removeMessages(0);
            this.f4008c.sendMessageDelayed(this.f4008c.obtainMessage(0), (long) this.f4011f);
        }
    }

    /* renamed from: b */
    private void m5581b(Runnable runnable) {
        synchronized (this.f4006a) {
            if (this.f4007b == null) {
                this.f4007b = new HandlerThread(this.f4013h, this.f4012g);
                this.f4007b.start();
                this.f4008c = new Handler(this.f4007b.getLooper(), this.f4010e);
                this.f4009d++;
            }
            this.f4008c.removeMessages(0);
            this.f4008c.sendMessage(this.f4008c.obtainMessage(1, runnable));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo5099a(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            b.b.h.f.j r11 = new b.b.h.f.j
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.m5581b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p037f.C1067k.mo5099a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* renamed from: a */
    public <T> void mo5100a(Callable<T> callable, C1068a<T> aVar) {
        m5581b(new C1065i(this, callable, new Handler(), aVar));
    }
}
