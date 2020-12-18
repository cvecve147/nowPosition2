package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C2061y;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a */
public class C1845a implements ServiceConnection {

    /* renamed from: a */
    private boolean f6018a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f6019b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo7232a(long j, TimeUnit timeUnit) {
        C2061y.m9080c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f6018a) {
            this.f6018a = true;
            IBinder poll = this.f6019b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6019b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
