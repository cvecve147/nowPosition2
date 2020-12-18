package com.google.android.gms.maps;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.maps.h */
public final class C3984h implements Parcelable.Creator<GoogleMapOptions> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = com.google.android.gms.common.internal.safeparcel.C2047a.m9004b(r23)
            r2 = 0
            r3 = -1
            r4 = 0
            r9 = r2
            r19 = r9
            r20 = r19
            r21 = r20
            r6 = r3
            r7 = r6
            r10 = r7
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r8 = r4
        L_0x001f:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x008f
            int r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m8999a((android.os.Parcel) r23)
            int r3 = com.google.android.gms.common.internal.safeparcel.C2047a.m8998a((int) r2)
            switch(r3) {
                case 2: goto L_0x008a;
                case 3: goto L_0x0085;
                case 4: goto L_0x0080;
                case 5: goto L_0x0076;
                case 6: goto L_0x0071;
                case 7: goto L_0x006c;
                case 8: goto L_0x0067;
                case 9: goto L_0x0062;
                case 10: goto L_0x005d;
                case 11: goto L_0x0058;
                case 12: goto L_0x0053;
                case 13: goto L_0x0030;
                case 14: goto L_0x004e;
                case 15: goto L_0x0049;
                case 16: goto L_0x0044;
                case 17: goto L_0x003f;
                case 18: goto L_0x0034;
                default: goto L_0x0030;
            }
        L_0x0030:
            com.google.android.gms.common.internal.safeparcel.C2047a.m9024s(r0, r2)
            goto L_0x001f
        L_0x0034:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLngBounds> r3 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m9001a((android.os.Parcel) r0, (int) r2, r3)
            r21 = r2
            com.google.android.gms.maps.model.LatLngBounds r21 = (com.google.android.gms.maps.model.LatLngBounds) r21
            goto L_0x001f
        L_0x003f:
            java.lang.Float r20 = com.google.android.gms.common.internal.safeparcel.C2047a.m9018m(r0, r2)
            goto L_0x001f
        L_0x0044:
            java.lang.Float r19 = com.google.android.gms.common.internal.safeparcel.C2047a.m9018m(r0, r2)
            goto L_0x001f
        L_0x0049:
            byte r18 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x004e:
            byte r17 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x0053:
            byte r16 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x0058:
            byte r15 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x005d:
            byte r14 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x0062:
            byte r13 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x0067:
            byte r12 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x006c:
            byte r11 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x0071:
            byte r10 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x0076:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.CameraPosition> r3 = com.google.android.gms.maps.model.CameraPosition.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C2047a.m9001a((android.os.Parcel) r0, (int) r2, r3)
            r9 = r2
            com.google.android.gms.maps.model.CameraPosition r9 = (com.google.android.gms.maps.model.CameraPosition) r9
            goto L_0x001f
        L_0x0080:
            int r8 = com.google.android.gms.common.internal.safeparcel.C2047a.m9020o(r0, r2)
            goto L_0x001f
        L_0x0085:
            byte r7 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x008a:
            byte r6 = com.google.android.gms.common.internal.safeparcel.C2047a.m9014i(r0, r2)
            goto L_0x001f
        L_0x008f:
            com.google.android.gms.common.internal.safeparcel.C2047a.m9012g(r0, r1)
            com.google.android.gms.maps.GoogleMapOptions r0 = new com.google.android.gms.maps.GoogleMapOptions
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.C3984h.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
