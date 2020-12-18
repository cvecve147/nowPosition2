package p101d.p105b.p106a.p107a;

import android.bluetooth.BluetoothDevice;
import java.util.Arrays;

/* renamed from: d.b.a.a.a */
public class C5178a {

    /* renamed from: a */
    static final byte[] f14551a;

    /* renamed from: b */
    public String f14552b = "";

    /* renamed from: c */
    public String f14553c = "00000000-0000-0000-0000-000000000000";

    /* renamed from: d */
    public int f14554d = 0;

    /* renamed from: e */
    public int f14555e = 0;

    /* renamed from: f */
    public int f14556f = 0;

    /* renamed from: g */
    public int f14557g = 0;

    static {
        byte[] bArr = new byte[6];
        bArr[0] = 26;
        bArr[1] = -1;
        bArr[2] = 76;
        bArr[4] = 2;
        bArr[5] = 21;
        f14551a = bArr;
    }

    /* renamed from: a */
    public static C5178a m20030a(byte[] bArr, BluetoothDevice bluetoothDevice, int i) {
        int i2;
        int i3;
        if (!m20031a(bArr)) {
            return null;
        }
        char c = 26;
        if (bArr[0] == 26) {
            i2 = 22;
            i3 = 6;
        } else {
            c = 29;
            i2 = 25;
            i3 = 9;
        }
        C5178a aVar = new C5178a();
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i3, i3 + 16);
        aVar.f14553c = String.format("%02X%02X%02X%02X-%02X%02X-%02X%02X-%02X%02X-%02X%02X%02X%02X%02X%02X", new Object[]{Byte.valueOf(copyOfRange[0]), Byte.valueOf(copyOfRange[1]), Byte.valueOf(copyOfRange[2]), Byte.valueOf(copyOfRange[3]), Byte.valueOf(copyOfRange[4]), Byte.valueOf(copyOfRange[5]), Byte.valueOf(copyOfRange[6]), Byte.valueOf(copyOfRange[7]), Byte.valueOf(copyOfRange[8]), Byte.valueOf(copyOfRange[9]), Byte.valueOf(copyOfRange[10]), Byte.valueOf(copyOfRange[11]), Byte.valueOf(copyOfRange[12]), Byte.valueOf(copyOfRange[13]), Byte.valueOf(copyOfRange[14]), Byte.valueOf(copyOfRange[15])});
        byte b = ((bArr[i2] << 8) & 65280) | (bArr[i2 + 1] & 255);
        byte b2 = (bArr[i2 + 3] & 255) | ((bArr[i2 + 2] << 8) & 65280);
        int[] a = m20032a((int) (((b & Byte.MAX_VALUE) << 7) | (b2 & Byte.MAX_VALUE)) & 16383, (((49152 & b2) >> 12) | ((49152 & b) >> 14)) & 15, (int) ((b & 16128) | ((b2 & 16128) >> 7) | ((b & 128) >> 7) | (b2 & 128)) & 16383);
        aVar.f14554d = a[0];
        aVar.f14557g = a[1];
        aVar.f14555e = bArr[c] & 255;
        aVar.f14552b = bluetoothDevice.getAddress();
        aVar.f14556f = i;
        return aVar;
    }

    /* renamed from: a */
    private static boolean m20031a(byte[] bArr) {
        byte[] copyOfRange = (2 == bArr[0] && 1 == bArr[1]) ? Arrays.copyOfRange(bArr, 3, f14551a.length + 3) : Arrays.copyOf(bArr, f14551a.length);
        return copyOfRange != null && Arrays.equals(copyOfRange, f14551a);
    }

    /* renamed from: a */
    private static int[] m20032a(int i, int i2, int i3) {
        int[] iArr = new int[2];
        switch (i2 & 7) {
            case 0:
                iArr[0] = i ^ i3;
                break;
            case 1:
                iArr[0] = (~(i ^ i3)) & 16383;
                break;
            case 2:
                iArr[0] = ((i << 12) & 12288) | ((i >> 2) & 4095);
                break;
            case 3:
                iArr[0] = ((i >> 12) & 3) | ((i << 2) & 16380);
                break;
            case 4:
                iArr[0] = ((i >> 12) & 3) | ((i << 2) & 16380);
                iArr[0] = (~(iArr[0] ^ i3)) & 16383;
                break;
            case 5:
                iArr[0] = ((i >> 12) & 3) | ((i << 2) & 16380);
                iArr[0] = iArr[0] ^ i3;
                break;
            case 6:
                iArr[0] = ((i << 12) & 12288) | ((i >> 2) & 4095);
                iArr[0] = (~(iArr[0] ^ i3)) & 16383;
                break;
            case 7:
                iArr[0] = ((i << 12) & 12288) | ((i >> 2) & 4095);
                iArr[0] = iArr[0] ^ i3;
                break;
        }
        iArr[1] = ((i2 & 8) >> 2) | ((iArr[0] & 8192) >> 13);
        iArr[0] = iArr[0] & 8191;
        return iArr;
    }
}
