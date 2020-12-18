package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public class C2049b {
    /* renamed from: a */
    public static int m9025a(Parcel parcel) {
        return m9045b(parcel, 20293);
    }

    /* renamed from: a */
    public static void m9026a(Parcel parcel, int i) {
        m9048c(parcel, i);
    }

    /* renamed from: a */
    public static void m9027a(Parcel parcel, int i, byte b) {
        m9046b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m9028a(Parcel parcel, int i, double d) {
        m9046b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m9029a(Parcel parcel, int i, float f) {
        m9046b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m9030a(Parcel parcel, int i, int i2) {
        m9046b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m9031a(Parcel parcel, int i, long j) {
        m9046b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m9032a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int b = m9045b(parcel, i);
            parcel.writeBundle(bundle);
            m9048c(parcel, b);
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m9033a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int b = m9045b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m9048c(parcel, b);
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m9034a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int b = m9045b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m9048c(parcel, b);
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m9035a(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m9046b(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m9036a(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m9046b(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m9037a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m9046b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m9038a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int b = m9045b(parcel, i);
            parcel.writeString(str);
            m9048c(parcel, b);
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m9039a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            int b = m9045b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            m9048c(parcel, b);
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m9040a(Parcel parcel, int i, boolean z) {
        m9046b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m9041a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int b = m9045b(parcel, i);
            parcel.writeByteArray(bArr);
            m9048c(parcel, b);
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m9042a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int b = m9045b(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m9044a(parcel, t, i2);
                }
            }
            m9048c(parcel, b);
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m9043a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int b = m9045b(parcel, i);
            parcel.writeStringArray(strArr);
            m9048c(parcel, b);
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m9044a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: b */
    private static int m9045b(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: b */
    private static void m9046b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: b */
    public static void m9047b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int b = m9045b(parcel, i);
            parcel.writeStringList(list);
            m9048c(parcel, b);
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }

    /* renamed from: c */
    private static void m9048c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m9049c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int b = m9045b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m9044a(parcel, parcelable, 0);
                }
            }
            m9048c(parcel, b);
        } else if (z) {
            m9046b(parcel, i, 0);
        }
    }
}
