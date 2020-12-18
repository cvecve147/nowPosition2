package p267i.p268a.p269a.p271b;

import android.os.Handler;
import android.os.Message;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: i.a.a.b.a */
public class C6669a implements C6705b {

    /* renamed from: a */
    private Handler f18495a;

    /* renamed from: b */
    private int f18496b;

    /* renamed from: c */
    private int f18497c;

    public C6669a(Handler handler, int i, int i2) {
        this.f18495a = handler;
        this.f18496b = i;
        this.f18497c = i2;
    }

    /* renamed from: a */
    public void mo17122a(C6705b.C6706a aVar, Object obj) {
        if (this.f18495a != null) {
            Message message = new Message();
            message.what = this.f18497c;
            message.obj = aVar;
            this.f18495a.sendMessage(message);
        }
        this.f18495a = null;
    }

    /* renamed from: a */
    public void mo17123a(Object obj) {
        if (this.f18495a != null) {
            Message message = new Message();
            message.what = this.f18496b;
            message.obj = obj;
            this.f18495a.sendMessage(message);
        }
        this.f18495a = null;
    }
}
