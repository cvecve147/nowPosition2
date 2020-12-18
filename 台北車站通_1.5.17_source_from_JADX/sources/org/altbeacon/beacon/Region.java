package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class Region implements Parcelable, Serializable {
    public static final Parcelable.Creator<Region> CREATOR = new C6916n();

    /* renamed from: a */
    private static final Pattern f18960a = Pattern.compile("^[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}\\:[0-9A-Fa-f]{2}$");

    /* renamed from: b */
    protected final List<C6912j> f18961b;

    /* renamed from: c */
    protected final String f18962c;

    /* renamed from: d */
    protected final String f18963d;

    protected Region(Parcel parcel) {
        this.f18963d = parcel.readString();
        this.f18962c = parcel.readString();
        int readInt = parcel.readInt();
        this.f18961b = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            if (readString == null) {
                this.f18961b.add((Object) null);
            } else {
                this.f18961b.add(C6912j.m26127a(readString));
            }
        }
    }

    public Region(String str, List<C6912j> list, String str2) {
        m25966a(str2);
        this.f18961b = new ArrayList(list);
        this.f18963d = str;
        this.f18962c = str2;
        if (str == null) {
            throw new NullPointerException("uniqueId may not be null");
        }
    }

    public Region(String str, C6912j jVar, C6912j jVar2, C6912j jVar3) {
        this.f18961b = new ArrayList(3);
        this.f18961b.add(jVar);
        this.f18961b.add(jVar2);
        this.f18961b.add(jVar3);
        this.f18963d = str;
        this.f18962c = null;
        if (str == null) {
            throw new NullPointerException("uniqueId may not be null");
        }
    }

    /* renamed from: a */
    private void m25966a(String str) {
        if (str != null && !f18960a.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid mac address: '" + str + "' Must be 6 hex bytes separated by colons.");
        }
    }

    /* renamed from: a */
    public String mo18709a() {
        return this.f18963d;
    }

    /* renamed from: a */
    public C6912j mo18710a(int i) {
        if (this.f18961b.size() > i) {
            return this.f18961b.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo18711a(Beacon beacon) {
        int size = this.f18961b.size();
        while (true) {
            size--;
            if (size >= 0) {
                C6912j jVar = this.f18961b.get(size);
                C6912j jVar2 = null;
                if (size < beacon.f18944f.size()) {
                    jVar2 = beacon.mo18687a(size);
                }
                if ((jVar2 != null || jVar == null) && (jVar2 == null || jVar == null || jVar.equals(jVar2))) {
                }
            } else {
                String str = this.f18962c;
                return str == null || str.equalsIgnoreCase(beacon.f18950l);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo18712a(Region region) {
        if (region.f18961b.size() != this.f18961b.size()) {
            return false;
        }
        for (int i = 0; i < region.f18961b.size(); i++) {
            if (region.mo18710a(i) == null && mo18710a(i) != null) {
                return false;
            }
            if (region.mo18710a(i) != null && mo18710a(i) == null) {
                return false;
            }
            if ((region.mo18710a(i) != null || mo18710a(i) != null) && !region.mo18710a(i).equals(mo18710a(i))) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public Region clone() {
        return new Region(this.f18963d, this.f18961b, this.f18962c);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Region) {
            return ((Region) obj).f18963d.equals(this.f18963d);
        }
        return false;
    }

    public int hashCode() {
        return this.f18963d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<C6912j> it = this.f18961b.iterator();
        int i = 1;
        while (it.hasNext()) {
            C6912j next = it.next();
            if (i > 1) {
                sb.append(" ");
            }
            sb.append("id");
            sb.append(i);
            sb.append(": ");
            sb.append(next == null ? "null" : next.toString());
            i++;
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18963d);
        parcel.writeString(this.f18962c);
        parcel.writeInt(this.f18961b.size());
        Iterator<C6912j> it = this.f18961b.iterator();
        while (it.hasNext()) {
            C6912j next = it.next();
            parcel.writeString(next != null ? next.toString() : null);
        }
    }
}
