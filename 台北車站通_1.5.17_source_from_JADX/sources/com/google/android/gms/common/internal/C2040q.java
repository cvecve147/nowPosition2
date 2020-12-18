package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p137e.p142e.C5519a;
import p101d.p129g.p131b.p132a.p137e.p142e.C5520b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5521c;

/* renamed from: com.google.android.gms.common.internal.q */
public interface C2040q extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public static abstract class C2041a extends C5520b implements C2040q {

        /* renamed from: com.google.android.gms.common.internal.q$a$a */
        public static class C2042a extends C5519a implements C2040q {
            C2042a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: g */
            public Account mo7704g() {
                Parcel a = mo14965a(2, mo14964Xa());
                Account account = (Account) C5521c.m21035a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        public static C2040q asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C2040q ? (C2040q) queryLocalInterface : new C2042a(iBinder);
        }
    }

    /* renamed from: g */
    Account mo7704g();
}
