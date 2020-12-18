package p101d.p129g.p131b.p132a.p134b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: d.g.b.a.b.f */
public abstract class C5470f<T> {

    /* renamed from: a */
    private final String f15379a;

    /* renamed from: b */
    private T f15380b;

    /* renamed from: d.g.b.a.b.f$a */
    public static class C5471a extends Exception {
        public C5471a(String str) {
            super(str);
        }

        public C5471a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected C5470f(String str) {
        this.f15379a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo14930a(Context context) {
        if (this.f15380b == null) {
            C2061y.m9067a(context);
            Context remoteContext = C2064k.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.f15380b = mo8253a((IBinder) remoteContext.getClassLoader().loadClass(this.f15379a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new C5471a("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new C5471a("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new C5471a("Could not access creator.", e3);
                }
            } else {
                throw new C5471a("Could not get remote context.");
            }
        }
        return this.f15380b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo8253a(IBinder iBinder);
}
