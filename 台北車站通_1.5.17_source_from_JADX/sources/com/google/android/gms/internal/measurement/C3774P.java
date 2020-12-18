package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.P */
public final class C3774P extends C3737Fc implements C3766N {
    C3774P(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final List<zzjx> mo10419a(zzdz zzdz, boolean z) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) zzdz);
        C3745Hc.m14948a(Xa, z);
        Parcel a = mo10463a(7, Xa);
        ArrayList<zzjx> createTypedArrayList = a.createTypedArrayList(zzjx.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzed> mo10420a(String str, String str2, zzdz zzdz) {
        Parcel Xa = mo10462Xa();
        Xa.writeString(str);
        Xa.writeString(str2);
        C3745Hc.m14947a(Xa, (Parcelable) zzdz);
        Parcel a = mo10463a(16, Xa);
        ArrayList<zzed> createTypedArrayList = a.createTypedArrayList(zzed.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzed> mo10421a(String str, String str2, String str3) {
        Parcel Xa = mo10462Xa();
        Xa.writeString(str);
        Xa.writeString(str2);
        Xa.writeString(str3);
        Parcel a = mo10463a(17, Xa);
        ArrayList<zzed> createTypedArrayList = a.createTypedArrayList(zzed.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzjx> mo10422a(String str, String str2, String str3, boolean z) {
        Parcel Xa = mo10462Xa();
        Xa.writeString(str);
        Xa.writeString(str2);
        Xa.writeString(str3);
        C3745Hc.m14948a(Xa, z);
        Parcel a = mo10463a(15, Xa);
        ArrayList<zzjx> createTypedArrayList = a.createTypedArrayList(zzjx.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzjx> mo10423a(String str, String str2, boolean z, zzdz zzdz) {
        Parcel Xa = mo10462Xa();
        Xa.writeString(str);
        Xa.writeString(str2);
        C3745Hc.m14948a(Xa, z);
        C3745Hc.m14947a(Xa, (Parcelable) zzdz);
        Parcel a = mo10463a(14, Xa);
        ArrayList<zzjx> createTypedArrayList = a.createTypedArrayList(zzjx.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final void mo10424a(long j, String str, String str2, String str3) {
        Parcel Xa = mo10462Xa();
        Xa.writeLong(j);
        Xa.writeString(str);
        Xa.writeString(str2);
        Xa.writeString(str3);
        mo10465b(10, Xa);
    }

    /* renamed from: a */
    public final void mo10425a(zzdz zzdz) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) zzdz);
        mo10465b(6, Xa);
    }

    /* renamed from: a */
    public final void mo10426a(zzed zzed) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) zzed);
        mo10465b(13, Xa);
    }

    /* renamed from: a */
    public final void mo10427a(zzed zzed, zzdz zzdz) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) zzed);
        C3745Hc.m14947a(Xa, (Parcelable) zzdz);
        mo10465b(12, Xa);
    }

    /* renamed from: a */
    public final void mo10428a(zzeu zzeu, zzdz zzdz) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) zzeu);
        C3745Hc.m14947a(Xa, (Parcelable) zzdz);
        mo10465b(1, Xa);
    }

    /* renamed from: a */
    public final void mo10429a(zzeu zzeu, String str, String str2) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) zzeu);
        Xa.writeString(str);
        Xa.writeString(str2);
        mo10465b(5, Xa);
    }

    /* renamed from: a */
    public final void mo10430a(zzjx zzjx, zzdz zzdz) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) zzjx);
        C3745Hc.m14947a(Xa, (Parcelable) zzdz);
        mo10465b(2, Xa);
    }

    /* renamed from: b */
    public final void mo10432b(zzdz zzdz) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) zzdz);
        mo10465b(4, Xa);
    }

    /* renamed from: c */
    public final void mo10433c(zzdz zzdz) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) zzdz);
        mo10465b(18, Xa);
    }

    /* renamed from: d */
    public final String mo10434d(zzdz zzdz) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) zzdz);
        Parcel a = mo10463a(11, Xa);
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
