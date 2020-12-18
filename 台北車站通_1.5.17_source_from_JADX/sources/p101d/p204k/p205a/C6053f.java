package p101d.p204k.p205a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import p208e.p221b.C6433l;
import p208e.p221b.C6437p;
import p208e.p221b.p244i.C6428a;

/* renamed from: d.k.a.f */
public class C6053f {

    /* renamed from: a */
    static final Object f16961a = new Object();

    /* renamed from: b */
    C6054g f16962b;

    public C6053f(Activity activity) {
        this.f16962b = m22948b(activity);
    }

    /* renamed from: a */
    private C6054g m22943a(Activity activity) {
        return (C6054g) activity.getFragmentManager().findFragmentByTag("RxPermissions");
    }

    /* renamed from: a */
    private C6433l<?> m22946a(C6433l<?> lVar, C6433l<?> lVar2) {
        return lVar == null ? C6433l.m24028b(f16961a) : C6433l.m24021a(lVar, lVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C6433l<C6048a> m22947a(C6433l<?> lVar, String... strArr) {
        if (strArr != null && strArr.length != 0) {
            return m22946a(lVar, m22949f(strArr)).mo16535a(new C6052e(this, strArr));
        }
        throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
    }

    /* renamed from: b */
    private C6054g m22948b(Activity activity) {
        C6054g a = m22943a(activity);
        if (!(a == null)) {
            return a;
        }
        C6054g gVar = new C6054g();
        FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().add(gVar, "RxPermissions").commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return gVar;
    }

    /* renamed from: f */
    private C6433l<?> m22949f(String... strArr) {
        for (String a : strArr) {
            if (!this.f16962b.mo16010a(a)) {
                return C6433l.m24026b();
            }
        }
        return C6433l.m24028b(f16961a);
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    /* renamed from: g */
    public C6433l<C6048a> m22950g(String... strArr) {
        C6048a aVar;
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.f16962b.mo16014e("Requesting permission " + str);
            if (mo16001a(str)) {
                aVar = new C6048a(str, true, false);
            } else if (mo16003b(str)) {
                aVar = new C6048a(str, false, false);
            } else {
                C6428a<C6048a> b = this.f16962b.mo16011b(str);
                if (b == null) {
                    arrayList2.add(str);
                    b = C6428a.m23998g();
                    this.f16962b.mo16007a(str, b);
                }
                arrayList.add(b);
            }
            arrayList.add(C6433l.m24028b(aVar));
        }
        if (!arrayList2.isEmpty()) {
            mo16006e((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return C6433l.m24019a(C6433l.m24024a(arrayList));
    }

    /* renamed from: a */
    public <T> C6437p<T, Boolean> mo15999a(String... strArr) {
        return new C6050c(this, strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo16000a() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: a */
    public boolean mo16001a(String str) {
        return !mo16000a() || this.f16962b.mo16012c(str);
    }

    /* renamed from: b */
    public <T> C6437p<T, C6048a> mo16002b(String... strArr) {
        return new C6051d(this, strArr);
    }

    /* renamed from: b */
    public boolean mo16003b(String str) {
        return mo16000a() && this.f16962b.mo16013d(str);
    }

    /* renamed from: c */
    public C6433l<Boolean> mo16004c(String... strArr) {
        return C6433l.m24028b(f16961a).mo16539a(mo15999a(strArr));
    }

    /* renamed from: d */
    public C6433l<C6048a> mo16005d(String... strArr) {
        return C6433l.m24028b(f16961a).mo16539a(mo16002b(strArr));
    }

    /* access modifiers changed from: package-private */
    @TargetApi(23)
    /* renamed from: e */
    public void mo16006e(String[] strArr) {
        C6054g gVar = this.f16962b;
        gVar.mo16014e("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.f16962b.mo16008a(strArr);
    }
}
