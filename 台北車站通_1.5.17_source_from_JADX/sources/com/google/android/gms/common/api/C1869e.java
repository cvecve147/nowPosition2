package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1850a.C1854d;
import com.google.android.gms.common.api.internal.C1916a;
import com.google.android.gms.common.api.internal.C1921c;
import com.google.android.gms.common.api.internal.C1924da;
import com.google.android.gms.common.api.internal.C1925e;
import com.google.android.gms.common.api.internal.C1943ja;
import com.google.android.gms.common.api.internal.C1950n;
import com.google.android.gms.common.api.internal.C1973ya;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.common.internal.C2061y;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.e */
public class C1869e<O extends C1850a.C1854d> {

    /* renamed from: a */
    private final Context f6062a;

    /* renamed from: b */
    private final C1850a<O> f6063b;

    /* renamed from: c */
    private final O f6064c = null;

    /* renamed from: d */
    private final C1973ya<O> f6065d;

    /* renamed from: e */
    private final Looper f6066e;

    /* renamed from: f */
    private final int f6067f;

    /* renamed from: g */
    private final GoogleApiClient f6068g;

    /* renamed from: h */
    private final C1950n f6069h;

    /* renamed from: i */
    protected final C1925e f6070i;

    protected C1869e(Context context, C1850a<O> aVar, Looper looper) {
        C2061y.m9068a(context, (Object) "Null context is not permitted.");
        C2061y.m9068a(aVar, (Object) "Api must not be null.");
        C2061y.m9068a(looper, (Object) "Looper must not be null.");
        this.f6062a = context.getApplicationContext();
        this.f6063b = aVar;
        this.f6066e = looper;
        this.f6065d = C1973ya.m8687a(aVar);
        this.f6068g = new C1924da(this);
        this.f6070i = C1925e.m8510a(this.f6062a);
        this.f6067f = this.f6070i.mo7421b();
        this.f6069h = new C1916a();
    }

    /* renamed from: a */
    private final <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T m8309a(int i, T t) {
        t.mo7337f();
        this.f6070i.mo7420a(this, i, t);
        return t;
    }

    /* renamed from: a */
    public C1850a.C1861f mo7310a(Looper looper, C1925e.C1926a<O> aVar) {
        return this.f6063b.mo7282d().mo7283a(this.f6062a, looper, mo7313a().mo7672a(), this.f6064c, aVar, aVar);
    }

    /* renamed from: a */
    public <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7311a(T t) {
        m8309a(1, t);
        return t;
    }

    /* renamed from: a */
    public C1943ja mo7312a(Context context, Handler handler) {
        return new C1943ja(context, handler, mo7313a().mo7672a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2025f.C2026a mo7313a() {
        Account account;
        GoogleSignInAccount a;
        GoogleSignInAccount a2;
        C2025f.C2026a aVar = new C2025f.C2026a();
        O o = this.f6064c;
        if (!(o instanceof C1850a.C1854d.C1856b) || (a2 = ((C1850a.C1854d.C1856b) o).mo7285a()) == null) {
            O o2 = this.f6064c;
            account = o2 instanceof C1850a.C1854d.C1855a ? ((C1850a.C1854d.C1855a) o2).mo7284g() : null;
        } else {
            account = a2.mo7193b();
        }
        aVar.mo7669a(account);
        O o3 = this.f6064c;
        aVar.mo7671a((Collection<Scope>) (!(o3 instanceof C1850a.C1854d.C1856b) || (a = ((C1850a.C1854d.C1856b) o3).mo7285a()) == null) ? Collections.emptySet() : a.mo7206p());
        aVar.mo7670a(this.f6062a.getClass().getName());
        aVar.mo7673b(this.f6062a.getPackageName());
        return aVar;
    }

    /* renamed from: b */
    public final C1850a<O> mo7314b() {
        return this.f6063b;
    }

    /* renamed from: c */
    public final int mo7315c() {
        return this.f6067f;
    }

    /* renamed from: d */
    public Looper mo7316d() {
        return this.f6066e;
    }

    /* renamed from: e */
    public final C1973ya<O> mo7317e() {
        return this.f6065d;
    }
}
