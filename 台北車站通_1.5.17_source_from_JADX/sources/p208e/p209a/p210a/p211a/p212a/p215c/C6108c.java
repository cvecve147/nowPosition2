package p208e.p209a.p210a.p211a.p212a.p215c;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: e.a.a.a.a.c.c */
class C6108c extends FutureTask<Result> {

    /* renamed from: a */
    final /* synthetic */ C6110e f17078a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6108c(C6110e eVar, Callable callable) {
        super(callable);
        this.f17078a = eVar;
    }

    /* access modifiers changed from: protected */
    public void done() {
        try {
            this.f17078a.m23140f(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            this.f17078a.m23140f(null);
        }
    }
}
