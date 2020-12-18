package org.altbeacon.beacon.service.p296a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.bluetooth.C6964c;

@TargetApi(18)
/* renamed from: org.altbeacon.beacon.service.a.j */
public class C6928j extends C6922d {

    /* renamed from: y */
    private BluetoothAdapter.LeScanCallback f19126y;

    public C6928j(Context context, long j, long j2, boolean z, C6919a aVar, C6964c cVar) {
        super(context, j, j2, z, aVar, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public BluetoothAdapter.LeScanCallback m26199n() {
        if (this.f19126y == null) {
            this.f19126y = new C6927i(this);
        }
        return this.f19126y;
    }

    /* renamed from: o */
    private void m26200o() {
        BluetoothAdapter e = mo18845e();
        if (e != null) {
            BluetoothAdapter.LeScanCallback n = m26199n();
            this.f19110q.removeCallbacksAndMessages((Object) null);
            this.f19110q.post(new C6925g(this, e, n));
        }
    }

    /* renamed from: p */
    private void m26201p() {
        BluetoothAdapter e = mo18845e();
        if (e != null) {
            BluetoothAdapter.LeScanCallback n = m26199n();
            this.f19110q.removeCallbacksAndMessages((Object) null);
            this.f19110q.post(new C6926h(this, e, n));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo18842b() {
        long elapsedRealtime = this.f19097d - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            return false;
        }
        C6895d.m26021a("CycledLeScannerForJellyBeanMr2", "Waiting to start next Bluetooth scan for another %s milliseconds", Long.valueOf(elapsedRealtime));
        if (this.f19114u) {
            mo18849i();
        }
        Handler handler = this.f19109p;
        C6924f fVar = new C6924f(this);
        if (elapsedRealtime > 1000) {
            elapsedRealtime = 1000;
        }
        handler.postDelayed(fVar, elapsedRealtime);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18844d() {
        m26201p();
        this.f19102i = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo18851k() {
        m26200o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo18853m() {
        m26201p();
    }
}
