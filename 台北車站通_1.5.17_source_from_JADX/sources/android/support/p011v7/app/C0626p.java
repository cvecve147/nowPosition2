package android.support.p011v7.app;

import android.content.res.Resources;
import java.lang.Thread;

/* renamed from: android.support.v7.app.p */
class C0626p implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f2349a;

    C0626p(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2349a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    private boolean m3099a(Throwable th) {
        String message;
        if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
            return false;
        }
        return message.contains("drawable") || message.contains("Drawable");
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (m3099a(th)) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f2349a.uncaughtException(thread, notFoundException);
            return;
        }
        this.f2349a.uncaughtException(thread, th);
    }
}
