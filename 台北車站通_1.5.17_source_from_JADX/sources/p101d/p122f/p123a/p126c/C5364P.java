package p101d.p122f.p123a.p126c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: d.f.a.c.P */
class C5364P {

    /* renamed from: a */
    private static final IntentFilter f15149a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static final IntentFilter f15150b = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");

    /* renamed from: c */
    private static final IntentFilter f15151c = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");

    /* renamed from: d */
    private final AtomicBoolean f15152d;

    /* renamed from: e */
    private final Context f15153e;

    /* renamed from: f */
    private final BroadcastReceiver f15154f;

    /* renamed from: g */
    private final BroadcastReceiver f15155g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f15156h;

    public C5364P(Context context) {
        this.f15153e = context;
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, f15149a);
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        this.f15156h = intExtra == 2 || intExtra == 5;
        this.f15155g = new C5362N(this);
        this.f15154f = new C5363O(this);
        context.registerReceiver(this.f15155g, f15150b);
        context.registerReceiver(this.f15154f, f15151c);
        this.f15152d = new AtomicBoolean(true);
    }

    /* renamed from: a */
    public void mo14781a() {
        if (this.f15152d.getAndSet(false)) {
            this.f15153e.unregisterReceiver(this.f15155g);
            this.f15153e.unregisterReceiver(this.f15154f);
        }
    }

    /* renamed from: b */
    public boolean mo14782b() {
        return this.f15156h;
    }
}
