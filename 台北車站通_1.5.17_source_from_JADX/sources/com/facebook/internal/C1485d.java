package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.C1574p;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.d */
public class C1485d {

    /* renamed from: a */
    private static final String f5132a = "com.facebook.internal.d";

    /* renamed from: b */
    private static C1485d f5133b;

    /* renamed from: c */
    private String f5134c;

    /* renamed from: d */
    private String f5135d;

    /* renamed from: e */
    private String f5136e;

    /* renamed from: f */
    private boolean f5137f;

    /* renamed from: g */
    private long f5138g;

    /* renamed from: com.facebook.internal.d$a */
    private static final class C1486a implements IInterface {

        /* renamed from: a */
        private IBinder f5139a;

        C1486a(IBinder iBinder) {
            this.f5139a = iBinder;
        }

        /* renamed from: Xa */
        public String mo6182Xa() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f5139a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: Ya */
        public boolean mo6183Ya() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f5139a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f5139a;
        }
    }

    /* renamed from: com.facebook.internal.d$b */
    private static final class C1487b implements ServiceConnection {

        /* renamed from: a */
        private AtomicBoolean f5140a;

        /* renamed from: b */
        private final BlockingQueue<IBinder> f5141b;

        private C1487b() {
            this.f5140a = new AtomicBoolean(false);
            this.f5141b = new LinkedBlockingDeque();
        }

        /* renamed from: a */
        public IBinder mo6185a() {
            if (!this.f5140a.compareAndSet(true, true)) {
                return this.f5141b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f5141b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ Exception -> 0x00c5, all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[Catch:{ Exception -> 0x00c5, all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068 A[Catch:{ Exception -> 0x00c5, all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00eb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.C1485d m6985a(android.content.Context r12) {
        /*
            java.lang.String r0 = "limit_tracking"
            java.lang.String r1 = "androidid"
            java.lang.String r2 = "aid"
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r3 != r4) goto L_0x0017
            java.lang.String r3 = f5132a
            java.lang.String r4 = "getAttributionIdentifiers should not be called from the main thread"
            android.util.Log.e(r3, r4)
        L_0x0017:
            com.facebook.internal.d r3 = f5133b
            if (r3 == 0) goto L_0x002c
            long r3 = java.lang.System.currentTimeMillis()
            com.facebook.internal.d r5 = f5133b
            long r6 = r5.f5138g
            long r3 = r3 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x002c
            return r5
        L_0x002c:
            com.facebook.internal.d r3 = m6987b(r12)
            r4 = 0
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            android.content.pm.PackageManager r5 = r12.getPackageManager()     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            java.lang.String r6 = "com.facebook.katana.provider.AttributionIdProvider"
            r8 = 0
            android.content.pm.ProviderInfo r5 = r5.resolveContentProvider(r6, r8)     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            if (r5 == 0) goto L_0x004a
            java.lang.String r5 = "content://com.facebook.katana.provider.AttributionIdProvider"
        L_0x0044:
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            r6 = r5
            goto L_0x005a
        L_0x004a:
            android.content.pm.PackageManager r5 = r12.getPackageManager()     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            java.lang.String r6 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r5 = r5.resolveContentProvider(r6, r8)     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            if (r5 == 0) goto L_0x0059
            java.lang.String r5 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            goto L_0x0044
        L_0x0059:
            r6 = r4
        L_0x005a:
            java.lang.String r5 = m6990e(r12)     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            if (r5 == 0) goto L_0x0062
            r3.f5136e = r5     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
        L_0x0062:
            if (r6 != 0) goto L_0x0068
            m6986a((com.facebook.internal.C1485d) r3)     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            return r3
        L_0x0068:
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r12 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            if (r12 == 0) goto L_0x00b1
            boolean r5 = r12.moveToFirst()     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            if (r5 != 0) goto L_0x007c
            goto L_0x00b1
        L_0x007c:
            int r2 = r12.getColumnIndex(r2)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            int r1 = r12.getColumnIndex(r1)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            int r0 = r12.getColumnIndex(r0)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            java.lang.String r2 = r12.getString(r2)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r3.f5134c = r2     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            if (r1 <= 0) goto L_0x00a8
            if (r0 <= 0) goto L_0x00a8
            java.lang.String r2 = r3.mo6178a()     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            if (r2 != 0) goto L_0x00a8
            java.lang.String r1 = r12.getString(r1)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r3.f5135d = r1     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            java.lang.String r0 = r12.getString(r0)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r3.f5137f = r0     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
        L_0x00a8:
            if (r12 == 0) goto L_0x00ad
            r12.close()
        L_0x00ad:
            m6986a((com.facebook.internal.C1485d) r3)
            return r3
        L_0x00b1:
            m6986a((com.facebook.internal.C1485d) r3)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            if (r12 == 0) goto L_0x00b9
            r12.close()
        L_0x00b9:
            return r3
        L_0x00ba:
            r0 = move-exception
            r4 = r12
            r12 = r0
            goto L_0x00e9
        L_0x00be:
            r0 = move-exception
            r11 = r0
            r0 = r12
            r12 = r11
            goto L_0x00c7
        L_0x00c3:
            r12 = move-exception
            goto L_0x00e9
        L_0x00c5:
            r12 = move-exception
            r0 = r4
        L_0x00c7:
            java.lang.String r1 = f5132a     // Catch:{ all -> 0x00e7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e7 }
            r2.<init>()     // Catch:{ all -> 0x00e7 }
            java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
            r2.append(r3)     // Catch:{ all -> 0x00e7 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00e7 }
            r2.append(r12)     // Catch:{ all -> 0x00e7 }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x00e7 }
            android.util.Log.d(r1, r12)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00e6
            r0.close()
        L_0x00e6:
            return r4
        L_0x00e7:
            r12 = move-exception
            r4 = r0
        L_0x00e9:
            if (r4 == 0) goto L_0x00ee
            r4.close()
        L_0x00ee:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1485d.m6985a(android.content.Context):com.facebook.internal.d");
    }

    /* renamed from: a */
    private static C1485d m6986a(C1485d dVar) {
        dVar.f5138g = System.currentTimeMillis();
        f5133b = dVar;
        return dVar;
    }

    /* renamed from: b */
    private static C1485d m6987b(Context context) {
        C1485d c = m6988c(context);
        if (c != null) {
            return c;
        }
        C1485d d = m6989d(context);
        return d == null ? new C1485d() : d;
    }

    /* renamed from: c */
    private static C1485d m6988c(Context context) {
        Object a;
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                Method a2 = C1480ba.m6929a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
                if (a2 == null) {
                    return null;
                }
                Object a3 = C1480ba.m6921a((Object) null, a2, context);
                if (a3 instanceof Integer) {
                    if (((Integer) a3).intValue() == 0) {
                        Method a4 = C1480ba.m6929a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                        if (a4 == null || (a = C1480ba.m6921a((Object) null, a4, context)) == null) {
                            return null;
                        }
                        Method a5 = C1480ba.m6928a(a.getClass(), "getId", (Class<?>[]) new Class[0]);
                        Method a6 = C1480ba.m6928a(a.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                        if (a5 != null) {
                            if (a6 != null) {
                                C1485d dVar = new C1485d();
                                dVar.f5135d = (String) C1480ba.m6921a(a, a5, new Object[0]);
                                dVar.f5137f = ((Boolean) C1480ba.m6921a(a, a6, new Object[0])).booleanValue();
                                return dVar;
                            }
                        }
                    }
                }
                return null;
            }
            throw new C1574p("getAndroidId cannot be called on the main thread.");
        } catch (Exception e) {
            C1480ba.m6942a("android_id", e);
            return null;
        }
    }

    /* renamed from: d */
    private static C1485d m6989d(Context context) {
        C1487b bVar = new C1487b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            try {
                C1486a aVar = new C1486a(bVar.mo6185a());
                C1485d dVar = new C1485d();
                dVar.f5135d = aVar.mo6182Xa();
                dVar.f5137f = aVar.mo6183Ya();
                return dVar;
            } catch (Exception e) {
                C1480ba.m6942a("android_id", e);
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    /* renamed from: e */
    private static String m6990e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    /* renamed from: a */
    public String mo6178a() {
        return this.f5135d;
    }

    /* renamed from: b */
    public String mo6179b() {
        return this.f5136e;
    }

    /* renamed from: c */
    public String mo6180c() {
        return this.f5134c;
    }

    /* renamed from: d */
    public boolean mo6181d() {
        return this.f5137f;
    }
}
