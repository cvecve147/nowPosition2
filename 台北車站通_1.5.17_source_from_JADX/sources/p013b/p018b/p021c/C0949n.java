package p013b.p018b.p021c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b.b.c.n */
public interface C0949n extends IInterface {

    /* renamed from: b.b.c.n$a */
    public static abstract class C0950a extends Binder implements C0949n {
        public C0950a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 2
                r1 = 0
                java.lang.String r2 = "android.support.customtabs.ICustomTabsCallback"
                r3 = 1
                if (r5 == r0) goto L_0x00a1
                r0 = 3
                if (r5 == r0) goto L_0x0087
                r0 = 4
                if (r5 == r0) goto L_0x0071
                r0 = 5
                if (r5 == r0) goto L_0x0057
                r0 = 6
                if (r5 == r0) goto L_0x0021
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x001d
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x001d:
                r7.writeString(r2)
                return r3
            L_0x0021:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0037
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0038
            L_0x0037:
                r8 = r1
            L_0x0038:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0040
                r0 = r3
                goto L_0x0041
            L_0x0040:
                r0 = 0
            L_0x0041:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0050
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r1.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0050:
                r4.mo4831a(r5, r8, r0, r1)
            L_0x0053:
                r7.writeNoException()
                return r3
            L_0x0057:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x006d
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x006d:
                r4.mo4834b((java.lang.String) r5, (android.os.Bundle) r1)
                goto L_0x0053
            L_0x0071:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0083
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0083:
                r4.mo4835g(r1)
                goto L_0x0053
            L_0x0087:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x009d
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x009d:
                r4.mo4832a(r5, r1)
                goto L_0x0053
            L_0x00a1:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00b7
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00b7:
                r4.mo4833b((int) r5, (android.os.Bundle) r1)
                goto L_0x0053
            */
            throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p021c.C0949n.C0950a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo4831a(int i, Uri uri, boolean z, Bundle bundle);

    /* renamed from: a */
    void mo4832a(String str, Bundle bundle);

    /* renamed from: b */
    void mo4833b(int i, Bundle bundle);

    /* renamed from: b */
    void mo4834b(String str, Bundle bundle);

    /* renamed from: g */
    void mo4835g(Bundle bundle);
}
