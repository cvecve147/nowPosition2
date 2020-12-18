package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C2090l;
import java.io.DataInputStream;
import java.io.IOException;

@C2478La
public final class zzaev extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaev> CREATOR = new C3600xb();

    /* renamed from: a */
    private ParcelFileDescriptor f10830a;

    /* renamed from: b */
    private Parcelable f10831b;

    /* renamed from: c */
    private boolean f10832c;

    public zzaev(ParcelFileDescriptor parcelFileDescriptor) {
        this.f10830a = parcelFileDescriptor;
        this.f10831b = null;
        this.f10832c = true;
    }

    public zzaev(SafeParcelable safeParcelable) {
        this.f10830a = null;
        this.f10831b = safeParcelable;
        this.f10832c = false;
    }

    /* renamed from: a */
    private final <T> ParcelFileDescriptor m14760a(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new C3572wb(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                C2227Cf.m9533b("Error transporting the ad response", e);
                C1697X.m7702i().mo8319a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
                C2090l.m9157a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
            C2227Cf.m9533b("Error transporting the ad response", e);
            C1697X.m7702i().mo8319a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
            C2090l.m9157a(autoCloseOutputStream);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private final ParcelFileDescriptor m14761b() {
        if (this.f10830a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f10831b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f10830a = m14760a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f10830a;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final <T extends SafeParcelable> T mo10292a(Parcelable.Creator<T> creator) {
        if (this.f10832c) {
            ParcelFileDescriptor parcelFileDescriptor = this.f10830a;
            if (parcelFileDescriptor == null) {
                C2227Cf.m9529a("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                C2090l.m9157a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f10831b = (SafeParcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f10832c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                C2227Cf.m9533b("Could not read from parcel file descriptor", e);
                C2090l.m9157a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                C2090l.m9157a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f10831b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        m14761b();
        int a = C2049b.m9025a(parcel);
        C2049b.m9034a(parcel, 2, (Parcelable) this.f10830a, i, false);
        C2049b.m9026a(parcel, a);
    }
}
