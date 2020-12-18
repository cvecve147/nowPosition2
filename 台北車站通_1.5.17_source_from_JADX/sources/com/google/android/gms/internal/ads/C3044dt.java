package com.google.android.gms.internal.ads;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.dt */
public final class C3044dt implements Parcelable.Creator<zzjj> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r27) {
        /*
            r26 = this;
            r0 = r27
            int r1 = com.google.android.gms.common.internal.safeparcel.C2047a.m9004b(r27)
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = r2
            r11 = r7
            r13 = r11
            r14 = r13
            r15 = r14
            r25 = r15
            r10 = r3
            r12 = r10
            r16 = r12
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r8 = r4
        L_0x0026:
            int r2 = r27.dataPosition()
            if (r2 >= r1) goto L_0x00a1
            int r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m8999a((android.os.Parcel) r27)
            int r3 = com.google.android.gms.common.internal.safeparcel.C2047a.m8998a((int) r2)
            switch(r3) {
                case 1: goto L_0x009c;
                case 2: goto L_0x0097;
                case 3: goto L_0x0092;
                case 4: goto L_0x008d;
                case 5: goto L_0x0088;
                case 6: goto L_0x0083;
                case 7: goto L_0x007e;
                case 8: goto L_0x0079;
                case 9: goto L_0x0074;
                case 10: goto L_0x0069;
                case 11: goto L_0x005e;
                case 12: goto L_0x0059;
                case 13: goto L_0x0054;
                case 14: goto L_0x004f;
                case 15: goto L_0x004a;
                case 16: goto L_0x0045;
                case 17: goto L_0x0040;
                case 18: goto L_0x003b;
                default: goto L_0x0037;
            }
        L_0x0037:
            com.google.android.gms.common.internal.safeparcel.C2047a.m9024s(r0, r2)
            goto L_0x0026
        L_0x003b:
            boolean r25 = com.google.android.gms.common.internal.safeparcel.C2047a.m9013h(r0, r2)
            goto L_0x0026
        L_0x0040:
            java.lang.String r24 = com.google.android.gms.common.internal.safeparcel.C2047a.m9009d(r0, r2)
            goto L_0x0026
        L_0x0045:
            java.lang.String r23 = com.google.android.gms.common.internal.safeparcel.C2047a.m9009d(r0, r2)
            goto L_0x0026
        L_0x004a:
            java.util.ArrayList r22 = com.google.android.gms.common.internal.safeparcel.C2047a.m9011f(r0, r2)
            goto L_0x0026
        L_0x004f:
            android.os.Bundle r21 = com.google.android.gms.common.internal.safeparcel.C2047a.m9000a(r0, r2)
            goto L_0x0026
        L_0x0054:
            android.os.Bundle r20 = com.google.android.gms.common.internal.safeparcel.C2047a.m9000a(r0, r2)
            goto L_0x0026
        L_0x0059:
            java.lang.String r19 = com.google.android.gms.common.internal.safeparcel.C2047a.m9009d(r0, r2)
            goto L_0x0026
        L_0x005e:
            android.os.Parcelable$Creator r3 = android.location.Location.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m9001a((android.os.Parcel) r0, (int) r2, r3)
            r18 = r2
            android.location.Location r18 = (android.location.Location) r18
            goto L_0x0026
        L_0x0069:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzmq> r3 = com.google.android.gms.internal.ads.zzmq.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m9001a((android.os.Parcel) r0, (int) r2, r3)
            r17 = r2
            com.google.android.gms.internal.ads.zzmq r17 = (com.google.android.gms.internal.ads.zzmq) r17
            goto L_0x0026
        L_0x0074:
            java.lang.String r16 = com.google.android.gms.common.internal.safeparcel.C2047a.m9009d(r0, r2)
            goto L_0x0026
        L_0x0079:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.C2047a.m9013h(r0, r2)
            goto L_0x0026
        L_0x007e:
            int r14 = com.google.android.gms.common.internal.safeparcel.C2047a.m9020o(r0, r2)
            goto L_0x0026
        L_0x0083:
            boolean r13 = com.google.android.gms.common.internal.safeparcel.C2047a.m9013h(r0, r2)
            goto L_0x0026
        L_0x0088:
            java.util.ArrayList r12 = com.google.android.gms.common.internal.safeparcel.C2047a.m9011f(r0, r2)
            goto L_0x0026
        L_0x008d:
            int r11 = com.google.android.gms.common.internal.safeparcel.C2047a.m9020o(r0, r2)
            goto L_0x0026
        L_0x0092:
            android.os.Bundle r10 = com.google.android.gms.common.internal.safeparcel.C2047a.m9000a(r0, r2)
            goto L_0x0026
        L_0x0097:
            long r8 = com.google.android.gms.common.internal.safeparcel.C2047a.m9021p(r0, r2)
            goto L_0x0026
        L_0x009c:
            int r7 = com.google.android.gms.common.internal.safeparcel.C2047a.m9020o(r0, r2)
            goto L_0x0026
        L_0x00a1:
            com.google.android.gms.common.internal.safeparcel.C2047a.m9012g(r0, r1)
            com.google.android.gms.internal.ads.zzjj r0 = new com.google.android.gms.internal.ads.zzjj
            r6 = r0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3044dt.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjj[i];
    }
}
