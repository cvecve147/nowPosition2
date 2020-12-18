package p101d.p129g.p131b.p132a.p136d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.iid.C2137a;
import com.google.android.gms.iid.C2144h;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p013b.p018b.p028h.p039h.C1080b;

@Deprecated
/* renamed from: d.g.b.a.d.a */
public class C5480a {

    /* renamed from: a */
    private static C5480a f15388a;

    /* renamed from: b */
    private static final AtomicInteger f15389b = new AtomicInteger(1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f15390c;

    /* renamed from: d */
    private PendingIntent f15391d;

    /* renamed from: e */
    private final Map<String, Handler> f15392e = Collections.synchronizedMap(new C1080b());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final BlockingQueue<Intent> f15393f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final Messenger f15394g = new Messenger(new C5481b(this, Looper.getMainLooper()));

    @Deprecated
    /* renamed from: a */
    private final Intent m20971a(Bundle bundle, boolean z) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        } else if (m20980c(this.f15390c) >= 0) {
            Intent intent = new Intent(z ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(C2144h.m9251b(this.f15390c));
            m20979b(intent);
            int andIncrement = f15389b.getAndIncrement();
            StringBuilder sb = new StringBuilder(21);
            sb.append("google.rpc");
            sb.append(andIncrement);
            intent.putExtra("google.message_id", sb.toString());
            intent.putExtras(bundle);
            intent.putExtra("google.messenger", this.f15394g);
            if (z) {
                this.f15390c.sendBroadcast(intent);
            } else {
                this.f15390c.startService(intent);
            }
            try {
                return this.f15393f.poll(30000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new IOException(e.getMessage());
            }
        } else {
            throw new IOException("Google Play Services missing");
        }
    }

    @Deprecated
    /* renamed from: a */
    public static synchronized C5480a m20972a(Context context) {
        C5480a aVar;
        synchronized (C5480a.class) {
            if (f15388a == null) {
                m20978b(context);
                C5480a aVar2 = new C5480a();
                f15388a = aVar2;
                aVar2.f15390c = context.getApplicationContext();
            }
            aVar = f15388a;
        }
        return aVar;
    }

    @Deprecated
    /* renamed from: a */
    private final synchronized String m20973a(boolean z, String... strArr) {
        String b = C2144h.m9251b(this.f15390c);
        if (b == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } else if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        } else {
            StringBuilder sb = new StringBuilder(strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                sb.append(',');
                sb.append(strArr[i]);
            }
            String sb2 = sb.toString();
            Bundle bundle = new Bundle();
            if (b.contains(".gsf")) {
                bundle.putString("legacy.sender", sb2);
                return C2137a.m9230a(this.f15390c).mo7759a(sb2, "GCM", bundle);
            }
            bundle.putString("sender", sb2);
            Intent a = m20971a(bundle, z);
            if (a != null) {
                String stringExtra = a.getStringExtra("registration_id");
                if (stringExtra != null) {
                    return stringExtra;
                }
                String stringExtra2 = a.getStringExtra("error");
                if (stringExtra2 != null) {
                    throw new IOException(stringExtra2);
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m20975a(Intent intent) {
        Handler remove;
        String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra == null || (remove = this.f15392e.remove(stringExtra)) == null) {
            return false;
        }
        Message obtain = Message.obtain();
        obtain.obj = intent;
        return remove.sendMessage(obtain);
    }

    /* renamed from: b */
    static void m20978b(Context context) {
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 48);
        sb.append("GCM SDK is deprecated, ");
        sb.append(packageName);
        sb.append(" should update to use FCM");
        Log.w("GCM", sb.toString());
    }

    /* renamed from: b */
    private final synchronized void m20979b(Intent intent) {
        if (this.f15391d == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f15391d = PendingIntent.getBroadcast(this.f15390c, 0, intent2, 0);
        }
        intent.putExtra("app", this.f15391d);
    }

    /* renamed from: c */
    public static int m20980c(Context context) {
        String b = C2144h.m9251b(context);
        if (b == null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(b, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Deprecated
    /* renamed from: a */
    public synchronized String mo14932a(String... strArr) {
        return m20973a(C2144h.m9247a(this.f15390c), strArr);
    }
}
