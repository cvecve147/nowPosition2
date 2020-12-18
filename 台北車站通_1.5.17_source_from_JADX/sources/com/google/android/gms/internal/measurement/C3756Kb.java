package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C2011d;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.p071b.C1985a;

/* renamed from: com.google.android.gms.internal.measurement.Kb */
public final class C3756Kb implements ServiceConnection, C2011d.C2012a, C2011d.C2013b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f11164a;

    /* renamed from: b */
    private volatile C3797V f11165b;

    /* renamed from: c */
    final /* synthetic */ C3910wb f11166c;

    protected C3756Kb(C3910wb wbVar) {
        this.f11166c = wbVar;
    }

    /* renamed from: a */
    public final void mo10492a() {
        this.f11166c.mo10451d();
        Context context = this.f11166c.getContext();
        synchronized (this) {
            if (this.f11164a) {
                this.f11166c.mo10385b().mo10580F().mo10592a("Connection attempt already in progress");
            } else if (this.f11165b != null) {
                this.f11166c.mo10385b().mo10580F().mo10592a("Already awaiting connection attempt");
            } else {
                this.f11165b = new C3797V(context, Looper.getMainLooper(), this, this);
                this.f11166c.mo10385b().mo10580F().mo10592a("Connecting to remote service");
                this.f11164a = true;
                this.f11165b.mo7630m();
            }
        }
    }

    /* renamed from: a */
    public final void mo10493a(Intent intent) {
        this.f11166c.mo10451d();
        Context context = this.f11166c.getContext();
        C1985a a = C1985a.m8731a();
        synchronized (this) {
            if (this.f11164a) {
                this.f11166c.mo10385b().mo10580F().mo10592a("Connection attempt already in progress");
                return;
            }
            this.f11166c.mo10385b().mo10580F().mo10592a("Using local app measurement service");
            this.f11164a = true;
            a.mo7509a(context, intent, (ServiceConnection) this.f11166c.f11701c, 129);
        }
    }

    /* renamed from: a */
    public final void mo7572a(ConnectionResult connectionResult) {
        C2061y.m9072a("MeasurementServiceConnection.onConnectionFailed");
        C3801W B = this.f11166c.f11325a.mo10374B();
        if (B != null) {
            B.mo10576B().mo10593a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f11164a = false;
            this.f11165b = null;
        }
        this.f11166c.mo10386c().mo11020a((Runnable) new C3776Pb(this));
    }

    /* renamed from: f */
    public final void mo7570f(int i) {
        C2061y.m9072a("MeasurementServiceConnection.onConnectionSuspended");
        this.f11166c.mo10385b().mo10579E().mo10592a("Service connection suspended");
        this.f11166c.mo10386c().mo11020a((Runnable) new C3772Ob(this));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0022 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7571j(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onConnected"
            com.google.android.gms.common.internal.C2061y.m9072a((java.lang.String) r4)
            monitor-enter(r3)
            r4 = 0
            com.google.android.gms.internal.measurement.V r0 = r3.f11165b     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            android.os.IInterface r0 = r0.mo7641x()     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            com.google.android.gms.internal.measurement.N r0 = (com.google.android.gms.internal.measurement.C3766N) r0     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            r3.f11165b = r4     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            com.google.android.gms.internal.measurement.wb r1 = r3.f11166c     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            com.google.android.gms.internal.measurement.wa r1 = r1.mo10386c()     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            com.google.android.gms.internal.measurement.Nb r2 = new com.google.android.gms.internal.measurement.Nb     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            r2.<init>(r3, r0)     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            r1.mo11020a((java.lang.Runnable) r2)     // Catch:{ DeadObjectException | IllegalStateException -> 0x0022 }
            goto L_0x0027
        L_0x0020:
            r4 = move-exception
            goto L_0x0029
        L_0x0022:
            r3.f11165b = r4     // Catch:{ all -> 0x0020 }
            r4 = 0
            r3.f11164a = r4     // Catch:{ all -> 0x0020 }
        L_0x0027:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            return
        L_0x0029:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3756Kb.mo7571j(android.os.Bundle):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f11166c.mo10385b().mo10585y().mo10592a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C2061y.m9072a((java.lang.String) r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f11164a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.wb r4 = r3.f11166c     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.W r4 = r4.mo10385b()     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10585y()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo10592a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0099
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0062 }
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C3766N     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.internal.measurement.N r1 = (com.google.android.gms.internal.measurement.C3766N) r1     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.internal.measurement.P r1 = new com.google.android.gms.internal.measurement.P     // Catch:{ RemoteException -> 0x0062 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0041:
            r0 = r1
        L_0x0042:
            com.google.android.gms.internal.measurement.wb r5 = r3.f11166c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.internal.measurement.W r5 = r5.mo10385b()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10580F()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo10592a(r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0052:
            com.google.android.gms.internal.measurement.wb r5 = r3.f11166c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.internal.measurement.W r5 = r5.mo10385b()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10585y()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo10593a(r2, r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.internal.measurement.wb r5 = r3.f11166c     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.W r5 = r5.mo10385b()     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10585y()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo10592a(r1)     // Catch:{ all -> 0x001c }
        L_0x0071:
            if (r0 != 0) goto L_0x0089
            r3.f11164a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.b.a r4 = com.google.android.gms.common.p071b.C1985a.m8731a()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.internal.measurement.wb r5 = r3.f11166c     // Catch:{ IllegalArgumentException -> 0x0097 }
            android.content.Context r5 = r5.getContext()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.internal.measurement.wb r0 = r3.f11166c     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.internal.measurement.Kb r0 = r0.f11701c     // Catch:{ IllegalArgumentException -> 0x0097 }
            r4.mo7511b(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0097 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.internal.measurement.wb r4 = r3.f11166c     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.wa r4 = r4.mo10386c()     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.measurement.Lb r5 = new com.google.android.gms.internal.measurement.Lb     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.mo11020a((java.lang.Runnable) r5)     // Catch:{ all -> 0x001c }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3756Kb.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C2061y.m9072a("MeasurementServiceConnection.onServiceDisconnected");
        this.f11166c.mo10385b().mo10579E().mo10592a("Service disconnected");
        this.f11166c.mo10386c().mo11020a((Runnable) new C3764Mb(this, componentName));
    }
}
