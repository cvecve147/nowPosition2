package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.io.InputStream;

@C2478La
public final class zzhi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhi> CREATOR = new C3043ds();

    /* renamed from: a */
    private ParcelFileDescriptor f10866a;

    public zzhi() {
        this((ParcelFileDescriptor) null);
    }

    public zzhi(ParcelFileDescriptor parcelFileDescriptor) {
        this.f10866a = parcelFileDescriptor;
    }

    /* renamed from: d */
    private final synchronized ParcelFileDescriptor m14769d() {
        return this.f10866a;
    }

    /* renamed from: b */
    public final synchronized boolean mo10306b() {
        return this.f10866a != null;
    }

    /* renamed from: c */
    public final synchronized InputStream mo10307c() {
        if (this.f10866a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f10866a);
        this.f10866a = null;
        return autoCloseInputStream;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9034a(parcel, 2, (Parcelable) m14769d(), i, false);
        C2049b.m9026a(parcel, a);
    }
}
