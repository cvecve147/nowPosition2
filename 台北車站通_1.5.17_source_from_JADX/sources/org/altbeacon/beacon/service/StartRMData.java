package org.altbeacon.beacon.service;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import org.altbeacon.beacon.Region;

public class StartRMData implements Serializable, Parcelable {
    public static final Parcelable.Creator<StartRMData> CREATOR = new C6959t();

    /* renamed from: a */
    private Region f19087a;

    /* renamed from: b */
    private long f19088b;

    /* renamed from: c */
    private long f19089c;

    /* renamed from: d */
    private boolean f19090d;

    /* renamed from: e */
    private String f19091e;

    private StartRMData() {
    }

    public StartRMData(long j, long j2, boolean z) {
        this.f19088b = j;
        this.f19089c = j2;
        this.f19090d = z;
    }

    private StartRMData(Parcel parcel) {
        this.f19087a = (Region) parcel.readParcelable(StartRMData.class.getClassLoader());
        this.f19091e = parcel.readString();
        this.f19088b = parcel.readLong();
        this.f19089c = parcel.readLong();
        this.f19090d = parcel.readByte() != 0;
    }

    /* synthetic */ StartRMData(Parcel parcel, C6959t tVar) {
        this(parcel);
    }

    public StartRMData(Region region, String str, long j, long j2, boolean z) {
        this.f19088b = j;
        this.f19089c = j2;
        this.f19087a = region;
        this.f19091e = str;
        this.f19090d = z;
    }

    /* renamed from: a */
    public static StartRMData m26165a(Bundle bundle) {
        boolean z;
        bundle.setClassLoader(Region.class.getClassLoader());
        StartRMData startRMData = new StartRMData();
        if (bundle.containsKey("region")) {
            startRMData.f19087a = (Region) bundle.getSerializable("region");
            z = true;
        } else {
            z = false;
        }
        if (bundle.containsKey("scanPeriod")) {
            startRMData.f19088b = ((Long) bundle.get("scanPeriod")).longValue();
            z = true;
        }
        if (bundle.containsKey("betweenScanPeriod")) {
            startRMData.f19089c = ((Long) bundle.get("betweenScanPeriod")).longValue();
        }
        if (bundle.containsKey("backgroundFlag")) {
            startRMData.f19090d = ((Boolean) bundle.get("backgroundFlag")).booleanValue();
        }
        if (bundle.containsKey("callbackPackageName")) {
            startRMData.f19091e = (String) bundle.get("callbackPackageName");
        }
        if (z) {
            return startRMData;
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo18824a() {
        return this.f19090d;
    }

    /* renamed from: b */
    public long mo18825b() {
        return this.f19089c;
    }

    /* renamed from: c */
    public String mo18826c() {
        return this.f19091e;
    }

    /* renamed from: d */
    public Region mo18827d() {
        return this.f19087a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo18829e() {
        return this.f19088b;
    }

    /* renamed from: f */
    public Bundle mo18830f() {
        Bundle bundle = new Bundle();
        bundle.putLong("scanPeriod", this.f19088b);
        bundle.putLong("betweenScanPeriod", this.f19089c);
        bundle.putBoolean("backgroundFlag", this.f19090d);
        bundle.putString("callbackPackageName", this.f19091e);
        Region region = this.f19087a;
        if (region != null) {
            bundle.putSerializable("region", region);
        }
        return bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f19087a, i);
        parcel.writeString(this.f19091e);
        parcel.writeLong(this.f19088b);
        parcel.writeLong(this.f19089c);
        parcel.writeByte(this.f19090d ? (byte) 1 : 0);
    }
}
