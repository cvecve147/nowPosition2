package p208e.p209a.p210a.p211a.p212a.p214b;

import android.os.Process;

/* renamed from: e.a.a.a.a.b.j */
public abstract class C6078j implements Runnable {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14863a();

    public final void run() {
        Process.setThreadPriority(10);
        mo14863a();
    }
}
