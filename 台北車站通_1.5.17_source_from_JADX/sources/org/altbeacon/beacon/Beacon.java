package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.altbeacon.beacon.p291a.C6880a;
import org.altbeacon.beacon.p291a.C6881b;
import org.altbeacon.beacon.p292b.C6885c;
import org.altbeacon.beacon.p293c.C6895d;

public class Beacon implements Parcelable, Serializable {
    @Deprecated
    public static final Parcelable.Creator<Beacon> CREATOR = new C6891c();

    /* renamed from: a */
    private static final List<Long> f18939a = Collections.unmodifiableList(new ArrayList());

    /* renamed from: b */
    private static final List<C6912j> f18940b = Collections.unmodifiableList(new ArrayList());

    /* renamed from: c */
    protected static boolean f18941c = false;

    /* renamed from: d */
    protected static C6885c f18942d = null;

    /* renamed from: e */
    protected static C6880a f18943e = new C6881b();

    /* renamed from: f */
    protected List<C6912j> f18944f;

    /* renamed from: g */
    protected List<Long> f18945g;

    /* renamed from: h */
    protected List<Long> f18946h;

    /* renamed from: i */
    protected Double f18947i;

    /* renamed from: j */
    protected int f18948j;

    /* renamed from: k */
    protected int f18949k;

    /* renamed from: l */
    protected String f18950l;

    /* renamed from: m */
    private int f18951m;

    /* renamed from: n */
    private int f18952n;

    /* renamed from: o */
    private Double f18953o;

    /* renamed from: p */
    protected int f18954p;

    /* renamed from: q */
    protected int f18955q;

    /* renamed from: r */
    protected int f18956r;

    /* renamed from: s */
    protected String f18957s;

    /* renamed from: t */
    protected String f18958t;

    /* renamed from: u */
    protected boolean f18959u;

    protected Beacon() {
        this.f18951m = 0;
        this.f18952n = 0;
        this.f18953o = null;
        this.f18956r = -1;
        this.f18959u = false;
        this.f18944f = new ArrayList(1);
        this.f18945g = new ArrayList(1);
        this.f18946h = new ArrayList(1);
    }

    @Deprecated
    protected Beacon(Parcel parcel) {
        boolean z = false;
        this.f18951m = 0;
        this.f18952n = 0;
        this.f18953o = null;
        this.f18956r = -1;
        this.f18959u = false;
        int readInt = parcel.readInt();
        this.f18944f = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f18944f.add(C6912j.m26127a(parcel.readString()));
        }
        this.f18947i = Double.valueOf(parcel.readDouble());
        this.f18948j = parcel.readInt();
        this.f18949k = parcel.readInt();
        this.f18950l = parcel.readString();
        this.f18954p = parcel.readInt();
        this.f18956r = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.f18945g = new ArrayList(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.f18945g.add(Long.valueOf(parcel.readLong()));
        }
        int readInt3 = parcel.readInt();
        this.f18946h = new ArrayList(readInt3);
        for (int i3 = 0; i3 < readInt3; i3++) {
            this.f18946h.add(Long.valueOf(parcel.readLong()));
        }
        this.f18955q = parcel.readInt();
        this.f18957s = parcel.readString();
        this.f18958t = parcel.readString();
        this.f18959u = parcel.readByte() != 0 ? true : z;
        this.f18953o = (Double) parcel.readValue((ClassLoader) null);
        this.f18951m = parcel.readInt();
        this.f18952n = parcel.readInt();
    }

    /* renamed from: a */
    protected static Double m25941a(int i, double d) {
        double d2;
        if (m25944e() != null) {
            d2 = m25944e().mo18728a(i, d);
        } else {
            C6895d.m26024b("Beacon", "Distance calculator not set.  Distance will bet set to -1", new Object[0]);
            d2 = -1.0d;
        }
        return Double.valueOf(d2);
    }

    /* renamed from: a */
    public static void m25942a(C6885c cVar) {
        f18942d = cVar;
    }

    /* renamed from: a */
    public static void m25943a(boolean z) {
        f18941c = z;
    }

    /* renamed from: e */
    public static C6885c m25944e() {
        return f18942d;
    }

    /* renamed from: g */
    public static boolean m25945g() {
        return f18941c;
    }

    /* renamed from: p */
    private StringBuilder m25946p() {
        StringBuilder sb = new StringBuilder();
        Iterator<C6912j> it = this.f18944f.iterator();
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
        if (this.f18958t != null) {
            sb.append(" type " + this.f18958t);
        }
        return sb;
    }

    /* renamed from: a */
    public String mo18686a() {
        return this.f18950l;
    }

    /* renamed from: a */
    public C6912j mo18687a(int i) {
        return this.f18944f.get(i);
    }

    /* renamed from: a */
    public void mo18688a(double d) {
        this.f18953o = Double.valueOf(d);
        this.f18947i = null;
    }

    /* renamed from: a */
    public void mo18689a(List<Long> list) {
        this.f18946h = list;
    }

    /* renamed from: b */
    public String mo18690b() {
        return this.f18957s;
    }

    /* renamed from: b */
    public void mo18691b(int i) {
        this.f18952n = i;
    }

    /* renamed from: c */
    public List<Long> mo18692c() {
        return this.f18945g.getClass().isInstance(f18939a) ? this.f18945g : Collections.unmodifiableList(this.f18945g);
    }

    /* renamed from: c */
    public void mo18693c(int i) {
        this.f18948j = i;
    }

    /* renamed from: d */
    public double mo18694d() {
        if (this.f18947i == null) {
            double d = (double) this.f18948j;
            Double d2 = this.f18953o;
            if (d2 != null) {
                d = d2.doubleValue();
            } else {
                C6895d.m26021a("Beacon", "Not using running average RSSI because it is null", new Object[0]);
            }
            this.f18947i = m25941a(this.f18949k, d);
        }
        return this.f18947i.doubleValue();
    }

    /* renamed from: d */
    public void mo18695d(int i) {
        this.f18951m = i;
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Beacon)) {
            return false;
        }
        Beacon beacon = (Beacon) obj;
        if (!this.f18944f.equals(beacon.f18944f)) {
            return false;
        }
        if (f18941c) {
            return mo18686a().equals(beacon.mo18686a());
        }
        return true;
    }

    /* renamed from: f */
    public List<Long> mo18697f() {
        return this.f18946h.getClass().isInstance(f18939a) ? this.f18946h : Collections.unmodifiableList(this.f18946h);
    }

    /* renamed from: h */
    public C6912j mo18698h() {
        return this.f18944f.get(0);
    }

    public int hashCode() {
        StringBuilder p = m25946p();
        if (f18941c) {
            p.append(this.f18950l);
        }
        return p.toString().hashCode();
    }

    /* renamed from: i */
    public C6912j mo18700i() {
        return this.f18944f.get(1);
    }

    /* renamed from: j */
    public C6912j mo18701j() {
        return this.f18944f.get(2);
    }

    /* renamed from: k */
    public int mo18702k() {
        return this.f18948j;
    }

    /* renamed from: l */
    public int mo18703l() {
        return this.f18956r;
    }

    /* renamed from: m */
    public int mo18704m() {
        return this.f18949k;
    }

    /* renamed from: n */
    public boolean mo18705n() {
        return this.f18944f.size() == 0 && this.f18945g.size() != 0;
    }

    /* renamed from: o */
    public boolean mo18706o() {
        return this.f18959u;
    }

    public String toString() {
        return m25946p().toString();
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18944f.size());
        Iterator<C6912j> it = this.f18944f.iterator();
        while (it.hasNext()) {
            C6912j next = it.next();
            parcel.writeString(next == null ? null : next.toString());
        }
        parcel.writeDouble(mo18694d());
        parcel.writeInt(this.f18948j);
        parcel.writeInt(this.f18949k);
        parcel.writeString(this.f18950l);
        parcel.writeInt(this.f18954p);
        parcel.writeInt(this.f18956r);
        parcel.writeInt(this.f18945g.size());
        for (Long longValue : this.f18945g) {
            parcel.writeLong(longValue.longValue());
        }
        parcel.writeInt(this.f18946h.size());
        for (Long longValue2 : this.f18946h) {
            parcel.writeLong(longValue2.longValue());
        }
        parcel.writeInt(this.f18955q);
        parcel.writeString(this.f18957s);
        parcel.writeString(this.f18958t);
        parcel.writeByte(this.f18959u ? (byte) 1 : 0);
        parcel.writeValue(this.f18953o);
        parcel.writeInt(this.f18951m);
        parcel.writeInt(this.f18952n);
    }
}
