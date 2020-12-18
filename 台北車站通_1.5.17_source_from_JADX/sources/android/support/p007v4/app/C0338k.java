package android.support.p007v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: android.support.v4.app.k */
class C0338k extends C0347o {

    /* renamed from: a */
    final /* synthetic */ C0339l f1393a;

    C0338k(C0339l lVar) {
        this.f1393a = lVar;
    }

    /* renamed from: a */
    public C0339l mo1311a(Context context, String str, Bundle bundle) {
        return this.f1393a.f1436u.mo1311a(context, str, bundle);
    }

    /* renamed from: a */
    public View mo1312a(int i) {
        View view = this.f1393a.f1406K;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    /* renamed from: a */
    public boolean mo1313a() {
        return this.f1393a.f1406K != null;
    }
}
