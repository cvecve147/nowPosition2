package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Map;
import p013b.p018b.p028h.p039h.C1080b;
import p101d.p129g.p131b.p132a.p144g.C5537h;

/* renamed from: com.google.firebase.iid.h */
final class C4077h {

    /* renamed from: a */
    private final Map<Pair<String, String>, C5537h<String>> f12086a = new C1080b();

    C4077h() {
    }

    /* renamed from: a */
    private static String m16312a(C4080k kVar, C5537h<String> hVar) {
        try {
            String a = kVar.mo11456a();
            hVar.mo14998a(a);
            return a;
        } catch (IOException | RuntimeException e) {
            hVar.mo14997a(e);
            throw e;
        }
    }

    /* renamed from: b */
    private final synchronized C4080k m16314b(String str, String str2, C4080k kVar) {
        Pair pair = new Pair(str, str2);
        C5537h hVar = this.f12086a.get(pair);
        if (hVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return new C4078i(hVar);
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        C5537h hVar2 = new C5537h();
        this.f12086a.put(pair, hVar2);
        return new C4079j(this, kVar, hVar2, pair);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [d.g.b.a.g.h, d.g.b.a.g.h<java.lang.String>] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16315b(p101d.p129g.p131b.p132a.p144g.C5537h<java.lang.String> r1) {
        /*
            d.g.b.a.g.g r1 = r1.mo14996a()     // Catch:{ ExecutionException -> 0x0012, InterruptedException -> 0x000b }
            java.lang.Object r1 = p101d.p129g.p131b.p132a.p144g.C5540j.m21080a(r1)     // Catch:{ ExecutionException -> 0x0012, InterruptedException -> 0x000b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ExecutionException -> 0x0012, InterruptedException -> 0x000b }
            return r1
        L_0x000b:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0012:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            boolean r0 = r1 instanceof java.io.IOException
            if (r0 != 0) goto L_0x0028
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L_0x0022
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
        L_0x0022:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0028:
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4077h.m16315b(d.g.b.a.g.h):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ String mo11508a(C4080k kVar, C5537h hVar, Pair pair) {
        try {
            String a = m16312a(kVar, hVar);
            synchronized (this) {
                this.f12086a.remove(pair);
            }
            return a;
        } catch (Throwable th) {
            synchronized (this) {
                this.f12086a.remove(pair);
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo11509a(String str, String str2, C4080k kVar) {
        return m16314b(str, str2, kVar).mo11456a();
    }
}
