package p101d.p129g.p159f.p163b.p164a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: d.g.f.b.a.j */
public final class C5763j {

    /* renamed from: a */
    private final Context f15929a;

    /* renamed from: b */
    private final BroadcastReceiver f15930b;

    /* renamed from: c */
    private boolean f15931c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f15932d;

    /* renamed from: e */
    private Runnable f15933e;

    /* renamed from: f */
    private boolean f15934f;

    /* renamed from: d.g.f.b.a.j$a */
    private final class C5764a extends BroadcastReceiver {
        private C5764a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                C5763j.this.f15932d.post(new C5762i(this, intent.getIntExtra("plugged", -1) <= 0));
            }
        }
    }

    public C5763j(Context context, Runnable runnable) {
        this.f15929a = context;
        this.f15933e = runnable;
        this.f15930b = new C5764a();
        this.f15932d = new Handler();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m21770a(boolean z) {
        this.f15934f = z;
        if (this.f15931c) {
            mo15357a();
        }
    }

    /* renamed from: d */
    private void m21771d() {
        this.f15932d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: e */
    private void m21772e() {
        if (!this.f15931c) {
            this.f15929a.registerReceiver(this.f15930b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f15931c = true;
        }
    }

    /* renamed from: f */
    private void m21773f() {
        if (this.f15931c) {
            this.f15929a.unregisterReceiver(this.f15930b);
            this.f15931c = false;
        }
    }

    /* renamed from: a */
    public void mo15357a() {
        m21771d();
        if (this.f15934f) {
            this.f15932d.postDelayed(this.f15933e, 300000);
        }
    }

    /* renamed from: b */
    public void mo15358b() {
        m21771d();
        m21773f();
    }

    /* renamed from: c */
    public void mo15359c() {
        m21772e();
        mo15357a();
    }
}
