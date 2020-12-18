package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C2040q;

/* renamed from: com.google.android.gms.common.internal.a */
public class C2008a extends C2040q.C2041a {
    /* renamed from: a */
    public static Account m8841a(C2040q qVar) {
        if (qVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return qVar.mo7704g();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
