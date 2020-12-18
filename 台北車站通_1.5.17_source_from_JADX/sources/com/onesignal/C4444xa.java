package com.onesignal;

import java.lang.reflect.Method;

/* renamed from: com.onesignal.xa */
class C4444xa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Method f13100a;

    /* renamed from: b */
    final /* synthetic */ Object f13101b;

    /* renamed from: c */
    final /* synthetic */ Object f13102c;

    /* renamed from: d */
    final /* synthetic */ C4447ya f13103d;

    C4444xa(C4447ya yaVar, Method method, Object obj, Object obj2) {
        this.f13103d = yaVar;
        this.f13100a = method;
        this.f13101b = obj;
        this.f13102c = obj2;
    }

    public void run() {
        try {
            this.f13100a.invoke(this.f13101b, new Object[]{this.f13102c});
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
