package p101d.p129g.p131b.p132a.p136d;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: d.g.b.a.d.b */
final class C5481b extends Handler {

    /* renamed from: a */
    private final /* synthetic */ C5480a f15395a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5481b(C5480a aVar, Looper looper) {
        super(looper);
        this.f15395a = aVar;
    }

    public final void handleMessage(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("GCM", "Dropping invalid message");
        }
        Intent intent = (Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            this.f15395a.f15393f.add(intent);
        } else if (!this.f15395a.m20975a(intent)) {
            intent.setPackage(this.f15395a.f15390c.getPackageName());
            this.f15395a.f15390c.sendBroadcast(intent);
        }
    }
}
