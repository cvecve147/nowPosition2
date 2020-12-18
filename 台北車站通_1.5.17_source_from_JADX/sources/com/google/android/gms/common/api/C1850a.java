package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C1850a.C1854d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.C2011d;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.common.internal.C2040q;
import com.google.android.gms.common.internal.C2061y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C1850a<O extends C1854d> {

    /* renamed from: a */
    private final C1851a<?, O> f6055a;

    /* renamed from: b */
    private final C1864i<?, O> f6056b = null;

    /* renamed from: c */
    private final C1862g<?> f6057c;

    /* renamed from: d */
    private final C1865j<?> f6058d;

    /* renamed from: e */
    private final String f6059e;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C1851a<T extends C1861f, O> extends C1860e<T, O> {
        /* renamed from: a */
        public abstract T mo7283a(Context context, Looper looper, C2025f fVar, O o, GoogleApiClient.C1848b bVar, GoogleApiClient.C1849c cVar);
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C1852b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C1853c<C extends C1852b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C1854d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C1855a extends C1857c, C1858d {
            /* renamed from: g */
            Account mo7284g();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C1856b extends C1857c {
            /* renamed from: a */
            GoogleSignInAccount mo7285a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface C1857c extends C1854d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        public interface C1858d extends C1854d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface C1859e extends C1857c, C1858d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C1860e<T extends C1852b, O> {
        /* renamed from: a */
        public int mo7286a() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public List<Scope> mo7287a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C1861f extends C1852b {
        /* renamed from: a */
        void mo7288a();

        /* renamed from: a */
        void mo7289a(C2011d.C2015d dVar);

        /* renamed from: a */
        void mo7290a(C2011d.C2021j jVar);

        /* renamed from: a */
        void mo7291a(C2040q qVar, Set<Scope> set);

        /* renamed from: a */
        void mo7292a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: b */
        boolean mo7293b();

        /* renamed from: d */
        boolean mo7294d();

        /* renamed from: e */
        String mo7295e();

        /* renamed from: f */
        boolean mo7296f();

        /* renamed from: g */
        int mo7297g();

        /* renamed from: h */
        Feature[] mo7298h();

        /* renamed from: i */
        Intent mo7299i();

        boolean isConnected();

        /* renamed from: j */
        boolean mo7301j();

        /* renamed from: k */
        IBinder mo7302k();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C1862g<C extends C1861f> extends C1853c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface C1863h<T extends IInterface> extends C1852b {
        /* renamed from: a */
        T mo7303a(IBinder iBinder);

        /* renamed from: a */
        void mo7304a(int i, T t);

        /* renamed from: l */
        String mo7305l();

        /* renamed from: m */
        String mo7306m();
    }

    /* renamed from: com.google.android.gms.common.api.a$i */
    public static abstract class C1864i<T extends C1863h, O> extends C1860e<T, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$j */
    public static final class C1865j<C extends C1863h> extends C1853c<C> {
    }

    public <C extends C1861f> C1850a(String str, C1851a<C, O> aVar, C1862g<C> gVar) {
        C2061y.m9068a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C2061y.m9068a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f6059e = str;
        this.f6055a = aVar;
        this.f6057c = gVar;
        this.f6058d = null;
    }

    /* renamed from: a */
    public final C1853c<?> mo7279a() {
        C1862g<?> gVar = this.f6057c;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: b */
    public final String mo7280b() {
        return this.f6059e;
    }

    /* renamed from: c */
    public final C1860e<?, O> mo7281c() {
        return this.f6055a;
    }

    /* renamed from: d */
    public final C1851a<?, O> mo7282d() {
        C2061y.m9078b(this.f6055a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f6055a;
    }
}
