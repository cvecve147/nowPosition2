package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.O */
public abstract class C3770O extends C3741Gc implements C3766N {
    public C3770O() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00dc, code lost:
        r9.writeNoException();
        r9.writeTypedList(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0136, code lost:
        r9.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10470a(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            switch(r7) {
                case 1: goto L_0x0123;
                case 2: goto L_0x010f;
                case 3: goto L_0x0003;
                case 4: goto L_0x0103;
                case 5: goto L_0x00ef;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00cc;
                case 8: goto L_0x0003;
                case 9: goto L_0x00b5;
                case 10: goto L_0x009f;
                case 11: goto L_0x008b;
                case 12: goto L_0x0076;
                case 13: goto L_0x0069;
                case 14: goto L_0x0050;
                case 15: goto L_0x003a;
                case 16: goto L_0x0024;
                case 17: goto L_0x0012;
                case 18: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r7 = 0
            return r7
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdz> r7 = com.google.android.gms.internal.measurement.zzdz.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzdz r7 = (com.google.android.gms.internal.measurement.zzdz) r7
            r6.mo10433c(r7)
            goto L_0x0136
        L_0x0012:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r8 = r8.readString()
            java.util.List r7 = r6.mo10421a((java.lang.String) r7, (java.lang.String) r10, (java.lang.String) r8)
            goto L_0x00dc
        L_0x0024:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdz> r0 = com.google.android.gms.internal.measurement.zzdz.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r0)
            com.google.android.gms.internal.measurement.zzdz r8 = (com.google.android.gms.internal.measurement.zzdz) r8
            java.util.List r7 = r6.mo10420a((java.lang.String) r7, (java.lang.String) r10, (com.google.android.gms.internal.measurement.zzdz) r8)
            goto L_0x00dc
        L_0x003a:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            boolean r8 = com.google.android.gms.internal.measurement.C3745Hc.m14949a(r8)
            java.util.List r7 = r6.mo10422a((java.lang.String) r7, (java.lang.String) r10, (java.lang.String) r0, (boolean) r8)
            goto L_0x00dc
        L_0x0050:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            boolean r0 = com.google.android.gms.internal.measurement.C3745Hc.m14949a(r8)
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdz> r1 = com.google.android.gms.internal.measurement.zzdz.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r1)
            com.google.android.gms.internal.measurement.zzdz r8 = (com.google.android.gms.internal.measurement.zzdz) r8
            java.util.List r7 = r6.mo10423a((java.lang.String) r7, (java.lang.String) r10, (boolean) r0, (com.google.android.gms.internal.measurement.zzdz) r8)
            goto L_0x00dc
        L_0x0069:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzed> r7 = com.google.android.gms.internal.measurement.zzed.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzed r7 = (com.google.android.gms.internal.measurement.zzed) r7
            r6.mo10426a((com.google.android.gms.internal.measurement.zzed) r7)
            goto L_0x0136
        L_0x0076:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzed> r7 = com.google.android.gms.internal.measurement.zzed.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzed r7 = (com.google.android.gms.internal.measurement.zzed) r7
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdz> r10 = com.google.android.gms.internal.measurement.zzdz.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r10)
            com.google.android.gms.internal.measurement.zzdz r8 = (com.google.android.gms.internal.measurement.zzdz) r8
            r6.mo10427a((com.google.android.gms.internal.measurement.zzed) r7, (com.google.android.gms.internal.measurement.zzdz) r8)
            goto L_0x0136
        L_0x008b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdz> r7 = com.google.android.gms.internal.measurement.zzdz.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzdz r7 = (com.google.android.gms.internal.measurement.zzdz) r7
            java.lang.String r7 = r6.mo10434d(r7)
            r9.writeNoException()
            r9.writeString(r7)
            goto L_0x0139
        L_0x009f:
            long r1 = r8.readLong()
            java.lang.String r3 = r8.readString()
            java.lang.String r4 = r8.readString()
            java.lang.String r5 = r8.readString()
            r0 = r6
            r0.mo10424a((long) r1, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5)
            goto L_0x0136
        L_0x00b5:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r7 = com.google.android.gms.internal.measurement.zzeu.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzeu r7 = (com.google.android.gms.internal.measurement.zzeu) r7
            java.lang.String r8 = r8.readString()
            byte[] r7 = r6.mo10431a((com.google.android.gms.internal.measurement.zzeu) r7, (java.lang.String) r8)
            r9.writeNoException()
            r9.writeByteArray(r7)
            goto L_0x0139
        L_0x00cc:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdz> r7 = com.google.android.gms.internal.measurement.zzdz.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzdz r7 = (com.google.android.gms.internal.measurement.zzdz) r7
            boolean r8 = com.google.android.gms.internal.measurement.C3745Hc.m14949a(r8)
            java.util.List r7 = r6.mo10419a((com.google.android.gms.internal.measurement.zzdz) r7, (boolean) r8)
        L_0x00dc:
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x0139
        L_0x00e3:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdz> r7 = com.google.android.gms.internal.measurement.zzdz.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzdz r7 = (com.google.android.gms.internal.measurement.zzdz) r7
            r6.mo10425a((com.google.android.gms.internal.measurement.zzdz) r7)
            goto L_0x0136
        L_0x00ef:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r7 = com.google.android.gms.internal.measurement.zzeu.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzeu r7 = (com.google.android.gms.internal.measurement.zzeu) r7
            java.lang.String r10 = r8.readString()
            java.lang.String r8 = r8.readString()
            r6.mo10429a((com.google.android.gms.internal.measurement.zzeu) r7, (java.lang.String) r10, (java.lang.String) r8)
            goto L_0x0136
        L_0x0103:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdz> r7 = com.google.android.gms.internal.measurement.zzdz.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzdz r7 = (com.google.android.gms.internal.measurement.zzdz) r7
            r6.mo10432b(r7)
            goto L_0x0136
        L_0x010f:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzjx> r7 = com.google.android.gms.internal.measurement.zzjx.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzjx r7 = (com.google.android.gms.internal.measurement.zzjx) r7
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdz> r10 = com.google.android.gms.internal.measurement.zzdz.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r10)
            com.google.android.gms.internal.measurement.zzdz r8 = (com.google.android.gms.internal.measurement.zzdz) r8
            r6.mo10430a((com.google.android.gms.internal.measurement.zzjx) r7, (com.google.android.gms.internal.measurement.zzdz) r8)
            goto L_0x0136
        L_0x0123:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r7 = com.google.android.gms.internal.measurement.zzeu.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r7)
            com.google.android.gms.internal.measurement.zzeu r7 = (com.google.android.gms.internal.measurement.zzeu) r7
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdz> r10 = com.google.android.gms.internal.measurement.zzdz.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.measurement.C3745Hc.m14946a((android.os.Parcel) r8, r10)
            com.google.android.gms.internal.measurement.zzdz r8 = (com.google.android.gms.internal.measurement.zzdz) r8
            r6.mo10428a((com.google.android.gms.internal.measurement.zzeu) r7, (com.google.android.gms.internal.measurement.zzdz) r8)
        L_0x0136:
            r9.writeNoException()
        L_0x0139:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3770O.mo10470a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
