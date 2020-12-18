package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C2047a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    public static class C2048a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2048a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.C2047a.C2048a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: a */
    public static int m8998a(int i) {
        return i & 65535;
    }

    /* renamed from: a */
    public static int m8999a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: a */
    public static Bundle m9000a(Parcel parcel, int i) {
        int r = m9023r(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (r == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + r);
        return readBundle;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m9001a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int r = m9023r(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (r == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + r);
        return t;
    }

    /* renamed from: a */
    private static void m9002a(Parcel parcel, int i, int i2) {
        int r = m9023r(parcel, i);
        if (r != i2) {
            String hexString = Integer.toHexString(r);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(r);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C2048a(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m9003a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C2048a(sb.toString(), parcel);
        }
    }

    /* renamed from: b */
    public static int m9004b(Parcel parcel) {
        int a = m8999a(parcel);
        int r = m9023r(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (m8998a(a) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new C2048a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = r + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C2048a(sb.toString(), parcel);
    }

    /* renamed from: b */
    public static byte[] m9005b(Parcel parcel, int i) {
        int r = m9023r(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (r == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + r);
        return createByteArray;
    }

    /* renamed from: b */
    public static <T> T[] m9006b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int r = m9023r(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (r == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + r);
        return createTypedArray;
    }

    /* renamed from: c */
    public static ArrayList<Integer> m9007c(Parcel parcel, int i) {
        int r = m9023r(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (r == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + r);
        return arrayList;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m9008c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int r = m9023r(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (r == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + r);
        return createTypedArrayList;
    }

    /* renamed from: d */
    public static String m9009d(Parcel parcel, int i) {
        int r = m9023r(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (r == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + r);
        return readString;
    }

    /* renamed from: e */
    public static String[] m9010e(Parcel parcel, int i) {
        int r = m9023r(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (r == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + r);
        return createStringArray;
    }

    /* renamed from: f */
    public static ArrayList<String> m9011f(Parcel parcel, int i) {
        int r = m9023r(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (r == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + r);
        return createStringArrayList;
    }

    /* renamed from: g */
    public static void m9012g(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C2048a(sb.toString(), parcel);
        }
    }

    /* renamed from: h */
    public static boolean m9013h(Parcel parcel, int i) {
        m9002a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: i */
    public static byte m9014i(Parcel parcel, int i) {
        m9002a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: j */
    public static double m9015j(Parcel parcel, int i) {
        m9002a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: k */
    public static Double m9016k(Parcel parcel, int i) {
        int r = m9023r(parcel, i);
        if (r == 0) {
            return null;
        }
        m9003a(parcel, i, r, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: l */
    public static float m9017l(Parcel parcel, int i) {
        m9002a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: m */
    public static Float m9018m(Parcel parcel, int i) {
        int r = m9023r(parcel, i);
        if (r == 0) {
            return null;
        }
        m9003a(parcel, i, r, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: n */
    public static IBinder m9019n(Parcel parcel, int i) {
        int r = m9023r(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (r == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + r);
        return readStrongBinder;
    }

    /* renamed from: o */
    public static int m9020o(Parcel parcel, int i) {
        m9002a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: p */
    public static long m9021p(Parcel parcel, int i) {
        m9002a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: q */
    public static Long m9022q(Parcel parcel, int i) {
        int r = m9023r(parcel, i);
        if (r == 0) {
            return null;
        }
        m9003a(parcel, i, r, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: r */
    public static int m9023r(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: s */
    public static void m9024s(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m9023r(parcel, i));
    }
}
