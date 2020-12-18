package com.google.android.gms.internal.measurement;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.v */
public final class C3904v implements Parcelable.Creator<zzed> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r22) {
        /*
            r21 = this;
            r0 = r22
            int r1 = com.google.android.gms.common.internal.safeparcel.C2047a.m9004b(r22)
            r2 = 0
            r4 = 0
            r5 = 0
            r10 = r2
            r15 = r10
            r18 = r15
            r7 = r4
            r8 = r7
            r9 = r8
            r13 = r9
            r14 = r13
            r17 = r14
            r20 = r17
            r12 = r5
        L_0x0018:
            int r2 = r22.dataPosition()
            if (r2 >= r1) goto L_0x007a
            int r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m8999a((android.os.Parcel) r22)
            int r3 = com.google.android.gms.common.internal.safeparcel.C2047a.m8998a((int) r2)
            switch(r3) {
                case 2: goto L_0x0075;
                case 3: goto L_0x0070;
                case 4: goto L_0x0066;
                case 5: goto L_0x0061;
                case 6: goto L_0x005c;
                case 7: goto L_0x0057;
                case 8: goto L_0x004d;
                case 9: goto L_0x0048;
                case 10: goto L_0x003d;
                case 11: goto L_0x0038;
                case 12: goto L_0x002d;
                default: goto L_0x0029;
            }
        L_0x0029:
            com.google.android.gms.common.internal.safeparcel.C2047a.m9024s(r0, r2)
            goto L_0x0018
        L_0x002d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r3 = com.google.android.gms.internal.measurement.zzeu.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m9001a((android.os.Parcel) r0, (int) r2, r3)
            r20 = r2
            com.google.android.gms.internal.measurement.zzeu r20 = (com.google.android.gms.internal.measurement.zzeu) r20
            goto L_0x0018
        L_0x0038:
            long r18 = com.google.android.gms.common.internal.safeparcel.C2047a.m9021p(r0, r2)
            goto L_0x0018
        L_0x003d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r3 = com.google.android.gms.internal.measurement.zzeu.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m9001a((android.os.Parcel) r0, (int) r2, r3)
            r17 = r2
            com.google.android.gms.internal.measurement.zzeu r17 = (com.google.android.gms.internal.measurement.zzeu) r17
            goto L_0x0018
        L_0x0048:
            long r15 = com.google.android.gms.common.internal.safeparcel.C2047a.m9021p(r0, r2)
            goto L_0x0018
        L_0x004d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r3 = com.google.android.gms.internal.measurement.zzeu.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m9001a((android.os.Parcel) r0, (int) r2, r3)
            r14 = r2
            com.google.android.gms.internal.measurement.zzeu r14 = (com.google.android.gms.internal.measurement.zzeu) r14
            goto L_0x0018
        L_0x0057:
            java.lang.String r13 = com.google.android.gms.common.internal.safeparcel.C2047a.m9009d(r0, r2)
            goto L_0x0018
        L_0x005c:
            boolean r12 = com.google.android.gms.common.internal.safeparcel.C2047a.m9013h(r0, r2)
            goto L_0x0018
        L_0x0061:
            long r10 = com.google.android.gms.common.internal.safeparcel.C2047a.m9021p(r0, r2)
            goto L_0x0018
        L_0x0066:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzjx> r3 = com.google.android.gms.internal.measurement.zzjx.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m9001a((android.os.Parcel) r0, (int) r2, r3)
            r9 = r2
            com.google.android.gms.internal.measurement.zzjx r9 = (com.google.android.gms.internal.measurement.zzjx) r9
            goto L_0x0018
        L_0x0070:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.C2047a.m9009d(r0, r2)
            goto L_0x0018
        L_0x0075:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.C2047a.m9009d(r0, r2)
            goto L_0x0018
        L_0x007a:
            com.google.android.gms.common.internal.safeparcel.C2047a.m9012g(r0, r1)
            com.google.android.gms.internal.measurement.zzed r0 = new com.google.android.gms.internal.measurement.zzed
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3904v.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzed[i];
    }
}
