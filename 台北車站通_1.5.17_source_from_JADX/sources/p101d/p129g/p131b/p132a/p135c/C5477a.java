package p101d.p129g.p131b.p132a.p135c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5519a;
import p101d.p129g.p131b.p132a.p137e.p142e.C5520b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5521c;

/* renamed from: d.g.b.a.c.a */
public interface C5477a extends IInterface {

    /* renamed from: d.g.b.a.c.a$a */
    public static abstract class C5478a extends C5520b implements C5477a {

        /* renamed from: d.g.b.a.c.a$a$a */
        public static class C5479a extends C5519a implements C5477a {
            C5479a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.flags.IFlagProvider");
            }
        }

        public C5478a() {
            super("com.google.android.gms.flags.IFlagProvider");
        }

        public static C5477a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
            return queryLocalInterface instanceof C5477a ? (C5477a) queryLocalInterface : new C5479a(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo7706a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                init(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), C5521c.m21039a(parcel), parcel.readInt());
                parcel2.writeNoException();
                C5521c.m21038a(parcel2, booleanFlagValue);
            } else if (i == 3) {
                int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(intFlagValue);
            } else if (i == 4) {
                long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
            } else if (i != 5) {
                return false;
            } else {
                String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
            }
            return true;
        }
    }

    boolean getBooleanFlagValue(String str, boolean z, int i);

    int getIntFlagValue(String str, int i, int i2);

    long getLongFlagValue(String str, long j, int i);

    String getStringFlagValue(String str, String str2, int i);

    void init(C5464b bVar);
}
