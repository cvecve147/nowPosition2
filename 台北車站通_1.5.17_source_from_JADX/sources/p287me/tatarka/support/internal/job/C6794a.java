package p287me.tatarka.support.internal.job;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: me.tatarka.support.internal.job.a */
class C6794a extends Handler {

    /* renamed from: a */
    final /* synthetic */ JobSchedulerService f18867a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6794a(JobSchedulerService jobSchedulerService, Looper looper) {
        super(looper);
        this.f18867a = jobSchedulerService;
    }

    public void handleMessage(Message message) {
        Intent intent = (Intent) message.obj;
        int i = message.what;
        if (i == 0) {
            this.f18867a.m25742a(intent.getIntExtra("EXTRA_JOB_ID", 0));
        } else if (i == 1) {
            this.f18867a.m25754b(intent.getIntExtra("EXTRA_JOB_ID", 0));
        } else if (i == 2) {
            this.f18867a.m25753b();
        } else if (i == 3) {
            this.f18867a.m25741a();
        }
    }
}
