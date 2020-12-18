package org.altbeacon.beacon;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.bluetooth.C6962a;
import org.altbeacon.bluetooth.C6972j;

/* renamed from: org.altbeacon.beacon.i */
public class C6910i implements Serializable {

    /* renamed from: a */
    private static final Pattern f19037a = Pattern.compile("i\\:(\\d+)\\-(\\d+)([blv]*)?");

    /* renamed from: b */
    private static final Pattern f19038b = Pattern.compile("m\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f]+)");

    /* renamed from: c */
    private static final Pattern f19039c = Pattern.compile("s\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f]+)");

    /* renamed from: d */
    private static final Pattern f19040d = Pattern.compile("d\\:(\\d+)\\-(\\d+)([bl]*)?");

    /* renamed from: e */
    private static final Pattern f19041e = Pattern.compile("p\\:(\\d+)\\-(\\d+)\\:?([\\-\\d]+)?");

    /* renamed from: f */
    private static final Pattern f19042f = Pattern.compile("x");

    /* renamed from: g */
    private static final char[] f19043g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: A */
    protected Boolean f19044A = true;

    /* renamed from: B */
    protected String f19045B;

    /* renamed from: C */
    protected int[] f19046C = {76};

    /* renamed from: D */
    protected List<C6910i> f19047D = new ArrayList();

    /* renamed from: h */
    protected String f19048h;

    /* renamed from: i */
    private Long f19049i;

    /* renamed from: j */
    protected final List<Integer> f19050j = new ArrayList();

    /* renamed from: k */
    protected final List<Integer> f19051k = new ArrayList();

    /* renamed from: l */
    protected final List<Boolean> f19052l = new ArrayList();

    /* renamed from: m */
    protected final List<Integer> f19053m = new ArrayList();

    /* renamed from: n */
    protected final List<Integer> f19054n = new ArrayList();

    /* renamed from: o */
    protected final List<Boolean> f19055o = new ArrayList();

    /* renamed from: p */
    protected final List<Boolean> f19056p = new ArrayList();

    /* renamed from: q */
    protected Integer f19057q;

    /* renamed from: r */
    protected Integer f19058r;

    /* renamed from: s */
    protected Integer f19059s;

    /* renamed from: t */
    protected Integer f19060t;

    /* renamed from: u */
    protected Long f19061u;

    /* renamed from: v */
    protected Boolean f19062v;

    /* renamed from: w */
    protected Integer f19063w;

    /* renamed from: x */
    protected Integer f19064x;

    /* renamed from: y */
    protected Integer f19065y;

    /* renamed from: z */
    protected Integer f19066z;

    /* renamed from: org.altbeacon.beacon.i$a */
    public static class C6911a extends RuntimeException {
        public C6911a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    protected static String m26107a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f19043g;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private String m26108a(byte[] bArr, int i, int i2, boolean z) {
        StringBuilder sb;
        int i3 = i2 - i;
        int i4 = i3 + 1;
        byte[] bArr2 = new byte[i4];
        if (z) {
            for (int i5 = 0; i5 <= i3; i5++) {
                bArr2[i5] = bArr[((bArr2.length + i) - 1) - i5];
            }
        } else {
            for (int i6 = 0; i6 <= i3; i6++) {
                bArr2[i6] = bArr[i + i6];
            }
        }
        if (i4 < 5) {
            long j = 0;
            for (int i7 = 0; i7 < bArr2.length; i7++) {
                j += ((long) (bArr2[(bArr2.length - i7) - 1] & 255)) * ((long) Math.pow(256.0d, ((double) i7) * 1.0d));
            }
            return Long.toString(j);
        }
        String a = m26107a(bArr2);
        if (bArr2.length == 16) {
            sb = new StringBuilder();
            sb.append(a.substring(0, 8));
            sb.append("-");
            sb.append(a.substring(8, 12));
            sb.append("-");
            sb.append(a.substring(12, 16));
            sb.append("-");
            sb.append(a.substring(16, 20));
            sb.append("-");
            a = a.substring(20, 32);
        } else {
            sb = new StringBuilder();
            sb.append("0x");
        }
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: a */
    private boolean m26109a(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr2.length;
        if (bArr.length - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static byte[] m26110a(long j, int i) {
        return m26111a(j, i, true);
    }

    /* renamed from: a */
    public static byte[] m26111a(long j, int i, boolean z) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = ((i - (z ? i2 : (i - i2) - 1)) - 1) * 8;
            bArr[i2] = (byte) ((int) ((j & (255 << i3)) >> ((int) ((long) i3))));
        }
        return bArr;
    }

    @TargetApi(9)
    /* renamed from: a */
    private byte[] m26112a(byte[] bArr, int i) {
        return bArr.length >= i ? bArr : Arrays.copyOf(bArr, i);
    }

    /* renamed from: b */
    private String m26113b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    /* renamed from: h */
    private int m26114h() {
        List<Integer> list = this.f19051k;
        int i = 0;
        if (list != null) {
            for (Integer intValue : list) {
                int intValue2 = intValue.intValue();
                if (intValue2 > i) {
                    i = intValue2;
                }
            }
        }
        List<Integer> list2 = this.f19054n;
        if (list2 != null) {
            for (Integer intValue3 : list2) {
                int intValue4 = intValue3.intValue();
                if (intValue4 > i) {
                    i = intValue4;
                }
            }
        }
        Integer num = this.f19064x;
        if (num != null && num.intValue() > i) {
            i = this.f19064x.intValue();
        }
        Integer num2 = this.f19060t;
        if (num2 != null && num2.intValue() > i) {
            i = this.f19060t.intValue();
        }
        return i + 1;
    }

    /* renamed from: a */
    public List<C6910i> mo18785a() {
        return new ArrayList(this.f19047D);
    }

    /* renamed from: a */
    public Beacon mo18721a(byte[] bArr, int i, BluetoothDevice bluetoothDevice) {
        return mo17220a(bArr, i, bluetoothDevice, new Beacon());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Beacon mo17220a(byte[] bArr, int i, BluetoothDevice bluetoothDevice, Beacon beacon) {
        int i2;
        C6972j jVar;
        Beacon beacon2;
        int i3;
        boolean z;
        String str;
        String str2;
        boolean z2;
        Beacon beacon3;
        String str3;
        Long l;
        C6912j jVar2;
        byte[] bArr2 = bArr;
        C6962a aVar = new C6962a(bArr2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<C6972j> it = aVar.mo18975a().iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                jVar = null;
                break;
            }
            jVar = it.next();
            if (jVar.mo18996d() != 22 && jVar.mo18996d() != -1) {
                if (C6895d.m26023a()) {
                    C6895d.m26021a("BeaconParser", "Ignoring pdu type %02X", Byte.valueOf(jVar.mo18996d()));
                }
            }
        }
        if (C6895d.m26023a()) {
            C6895d.m26021a("BeaconParser", "Processing pdu type %02X: %s with startIndex: %d, endIndex: %d", Byte.valueOf(jVar.mo18996d()), m26107a(bArr), Integer.valueOf(jVar.mo18995c()), Integer.valueOf(jVar.mo18994b()));
        }
        if (jVar == null) {
            if (C6895d.m26023a()) {
                C6895d.m26021a("BeaconParser", "No PDUs to process in this packet.", new Object[0]);
            }
            beacon2 = beacon;
            z = true;
            i3 = 0;
        } else {
            byte[] a = m26110a(mo18789d().longValue(), (this.f19058r.intValue() - this.f19057q.intValue()) + 1);
            byte[] a2 = mo18793g() != null ? m26111a(mo18793g().longValue(), (this.f19060t.intValue() - this.f19059s.intValue()) + 1, false) : null;
            i3 = jVar.mo18995c();
            boolean z3 = mo18793g() != null ? !(!m26109a(bArr2, this.f19059s.intValue() + i3, a2) || !m26109a(bArr2, this.f19057q.intValue() + i3, a)) : m26109a(bArr2, this.f19057q.intValue() + i3, a);
            if (!z3) {
                if (mo18793g() == null) {
                    if (C6895d.m26023a()) {
                        C6895d.m26021a("BeaconParser", "This is not a matching Beacon advertisement. (Was expecting %s.  The bytes I see are: %s", m26113b(a), m26107a(bArr));
                    }
                } else if (C6895d.m26023a()) {
                    C6895d.m26021a("BeaconParser", "This is not a matching Beacon advertisement. Was expecting %s at offset %d and %s at offset %d.  The bytes I see are: %s", m26113b(a2), Integer.valueOf(this.f19059s.intValue() + i3), m26113b(a), Integer.valueOf(this.f19057q.intValue() + i3), m26107a(bArr));
                }
                z2 = true;
                beacon3 = null;
            } else {
                if (C6895d.m26023a()) {
                    C6895d.m26021a("BeaconParser", "This is a recognized beacon advertisement -- %s seen", m26113b(a));
                    C6895d.m26021a("BeaconParser", "Bytes are: %s", m26107a(bArr));
                }
                beacon3 = beacon;
                z2 = false;
            }
            if (z3) {
                if (bArr2.length <= this.f19066z.intValue() + i3 && this.f19044A.booleanValue()) {
                    if (C6895d.m26023a()) {
                        C6895d.m26021a("BeaconParser", "Expanding buffer because it is too short to parse: " + bArr2.length + ", needed: " + (this.f19066z.intValue() + i3), new Object[0]);
                    }
                    bArr2 = m26112a(bArr2, this.f19066z.intValue() + i3);
                }
                z = z2;
                int i4 = 0;
                while (true) {
                    String str4 = " PDU endIndex: ";
                    if (i4 < this.f19051k.size()) {
                        int intValue = this.f19051k.get(i4).intValue() + i3;
                        if (intValue > jVar.mo18994b() && this.f19056p.get(i4).booleanValue()) {
                            if (C6895d.m26023a()) {
                                C6895d.m26021a("BeaconParser", "Need to truncate identifier by " + (intValue - jVar.mo18994b()), new Object[0]);
                            }
                            int intValue2 = this.f19050j.get(i4).intValue() + i3;
                            int b = jVar.mo18994b() + 1;
                            if (b <= intValue2) {
                                C6895d.m26021a("BeaconParser", "PDU is too short for identifer.  Packet is malformed", new Object[0]);
                                return null;
                            }
                            jVar2 = C6912j.m26129a(bArr2, intValue2, b, this.f19052l.get(i4).booleanValue());
                        } else if (intValue <= jVar.mo18994b() || this.f19044A.booleanValue()) {
                            jVar2 = C6912j.m26129a(bArr2, this.f19050j.get(i4).intValue() + i3, intValue + 1, this.f19052l.get(i4).booleanValue());
                        } else {
                            if (C6895d.m26023a()) {
                                C6895d.m26021a("BeaconParser", "Cannot parse identifier " + i4 + " because PDU is too short.  endIndex: " + intValue + str4 + jVar.mo18994b(), new Object[0]);
                            }
                            z = true;
                            i4++;
                        }
                        arrayList.add(jVar2);
                        i4++;
                    } else {
                        int i5 = 0;
                        while (i5 < this.f19054n.size()) {
                            int intValue3 = this.f19054n.get(i5).intValue() + i3;
                            if (intValue3 <= jVar.mo18994b() || this.f19044A.booleanValue()) {
                                str3 = str4;
                                l = Long.decode(m26108a(bArr2, this.f19053m.get(i5).intValue() + i3, intValue3, this.f19055o.get(i5).booleanValue()));
                            } else {
                                if (C6895d.m26023a()) {
                                    C6895d.m26021a("BeaconParser", "Cannot parse data field " + i5 + " because PDU is too short.  endIndex: " + intValue3 + str4 + jVar.mo18994b() + ".  Setting value to 0", new Object[i2]);
                                }
                                str3 = str4;
                                l = new Long(0);
                            }
                            arrayList2.add(l);
                            i5++;
                            str4 = str3;
                            i2 = 0;
                        }
                        String str5 = str4;
                        if (this.f19063w != null) {
                            int intValue4 = this.f19064x.intValue() + i3;
                            try {
                                if (intValue4 <= jVar.mo18994b() || this.f19044A.booleanValue()) {
                                    int parseInt = Integer.parseInt(m26108a(bArr2, this.f19063w.intValue() + i3, this.f19064x.intValue() + i3, false)) + this.f19065y.intValue();
                                    if (parseInt > 127) {
                                        parseInt -= 256;
                                    }
                                    beacon3.f18949k = parseInt;
                                } else {
                                    try {
                                        if (C6895d.m26023a()) {
                                            C6895d.m26021a("BeaconParser", "Cannot parse power field because PDU is too short.  endIndex: " + intValue4 + str5 + jVar.mo18994b(), new Object[0]);
                                        }
                                    } catch (NullPointerException | NumberFormatException unused) {
                                    }
                                    z = true;
                                }
                            } catch (NullPointerException | NumberFormatException unused2) {
                            }
                        }
                        beacon2 = beacon3;
                    }
                }
            } else {
                beacon2 = beacon3;
                z = z2;
            }
        }
        if (z) {
            return null;
        }
        int parseInt2 = Integer.parseInt(m26108a(bArr2, this.f19057q.intValue() + i3, this.f19058r.intValue() + i3, false));
        boolean z4 = true;
        int parseInt3 = Integer.parseInt(m26108a(bArr2, i3, i3 + 1, true));
        if (bluetoothDevice != null) {
            str2 = bluetoothDevice.getAddress();
            str = bluetoothDevice.getName();
        } else {
            str2 = null;
            str = null;
        }
        beacon2.f18944f = arrayList;
        beacon2.f18945g = arrayList2;
        beacon2.f18948j = i;
        beacon2.f18954p = parseInt2;
        Long l2 = this.f19061u;
        beacon2.f18956r = l2 != null ? (int) l2.longValue() : -1;
        beacon2.f18950l = str2;
        beacon2.f18957s = str;
        beacon2.f18955q = parseInt3;
        beacon2.f18958t = this.f19045B;
        if (this.f19047D.size() <= 0 && !this.f19062v.booleanValue()) {
            z4 = false;
        }
        beacon2.f18959u = z4;
        return beacon2;
    }

    /* renamed from: a */
    public C6910i mo18786a(String str) {
        String str2 = str;
        this.f19048h = str2;
        Log.d("BeaconParser", "Parsing beacon layout: " + str2);
        String[] split = str2.split(",");
        boolean z = false;
        this.f19062v = false;
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str3 = split[i];
            Matcher matcher = f19037a.matcher(str3);
            boolean z2 = z;
            while (matcher.find()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    this.f19052l.add(Boolean.valueOf(matcher.group(3).contains("l")));
                    this.f19056p.add(Boolean.valueOf(matcher.group(3).contains("v")));
                    this.f19050j.add(Integer.valueOf(parseInt));
                    this.f19051k.add(Integer.valueOf(parseInt2));
                    z2 = true;
                } catch (NumberFormatException unused) {
                    throw new C6911a("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher2 = f19040d.matcher(str3);
            while (matcher2.find()) {
                try {
                    int parseInt3 = Integer.parseInt(matcher2.group(1));
                    int parseInt4 = Integer.parseInt(matcher2.group(2));
                    this.f19055o.add(Boolean.valueOf(matcher2.group(3).contains("l")));
                    this.f19053m.add(Integer.valueOf(parseInt3));
                    this.f19054n.add(Integer.valueOf(parseInt4));
                    z2 = true;
                } catch (NumberFormatException unused2) {
                    throw new C6911a("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher3 = f19041e.matcher(str3);
            while (matcher3.find()) {
                try {
                    int parseInt5 = Integer.parseInt(matcher3.group(1));
                    int parseInt6 = Integer.parseInt(matcher3.group(2));
                    this.f19065y = Integer.valueOf(matcher3.group(3) != null ? Integer.parseInt(matcher3.group(3)) : 0);
                    this.f19063w = Integer.valueOf(parseInt5);
                    this.f19064x = Integer.valueOf(parseInt6);
                    z2 = true;
                } catch (NumberFormatException unused3) {
                    throw new C6911a("Cannot parse integer power byte offset in term: " + str3);
                }
            }
            Matcher matcher4 = f19038b.matcher(str3);
            while (matcher4.find()) {
                try {
                    int parseInt7 = Integer.parseInt(matcher4.group(1));
                    int parseInt8 = Integer.parseInt(matcher4.group(2));
                    this.f19057q = Integer.valueOf(parseInt7);
                    this.f19058r = Integer.valueOf(parseInt8);
                    String group = matcher4.group(3);
                    try {
                        this.f19049i = Long.decode("0x" + group);
                        z2 = true;
                    } catch (NumberFormatException unused4) {
                        throw new C6911a("Cannot parse beacon type code: " + group + " in term: " + str3);
                    }
                } catch (NumberFormatException unused5) {
                    throw new C6911a("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher5 = f19039c.matcher(str3);
            while (matcher5.find()) {
                try {
                    int parseInt9 = Integer.parseInt(matcher5.group(1));
                    int parseInt10 = Integer.parseInt(matcher5.group(2));
                    this.f19059s = Integer.valueOf(parseInt9);
                    this.f19060t = Integer.valueOf(parseInt10);
                    String group2 = matcher5.group(3);
                    try {
                        this.f19061u = Long.decode("0x" + group2);
                        z2 = true;
                    } catch (NumberFormatException unused6) {
                        throw new C6911a("Cannot parse serviceUuid: " + group2 + " in term: " + str3);
                    }
                } catch (NumberFormatException unused7) {
                    throw new C6911a("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher6 = f19042f.matcher(str3);
            while (matcher6.find()) {
                this.f19062v = true;
                z2 = true;
            }
            if (z2) {
                i++;
                z = false;
            } else {
                C6895d.m26021a("BeaconParser", "cannot parse term %s", str3);
                throw new C6911a("Cannot parse beacon layout term: " + str3);
            }
        }
        if (!this.f19062v.booleanValue()) {
            if (this.f19050j.size() == 0 || this.f19051k.size() == 0) {
                throw new C6911a("You must supply at least one identifier offset with a prefix of 'i'");
            } else if (this.f19063w == null || this.f19064x == null) {
                throw new C6911a("You must supply a power byte offset with a prefix of 'p'");
            }
        }
        if (this.f19057q == null || this.f19058r == null) {
            throw new C6911a("You must supply a matching beacon type expression with a prefix of 'm'");
        }
        this.f19066z = Integer.valueOf(m26114h());
        return this;
    }

    /* renamed from: b */
    public int[] mo18787b() {
        return this.f19046C;
    }

    /* renamed from: c */
    public String mo18788c() {
        return this.f19048h;
    }

    /* renamed from: d */
    public Long mo18789d() {
        return this.f19049i;
    }

    /* renamed from: e */
    public int mo18790e() {
        return this.f19058r.intValue();
    }

    public boolean equals(Object obj) {
        try {
            C6910i iVar = (C6910i) obj;
            return iVar.f19048h != null && iVar.f19048h.equals(this.f19048h) && iVar.f19045B != null && iVar.f19045B.equals(this.f19045B);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public int mo18792f() {
        return this.f19057q.intValue();
    }

    /* renamed from: g */
    public Long mo18793g() {
        return this.f19061u;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19049i, this.f19050j, this.f19051k, this.f19052l, this.f19053m, this.f19054n, this.f19055o, this.f19056p, this.f19057q, this.f19058r, this.f19059s, this.f19060t, this.f19061u, this.f19062v, this.f19063w, this.f19064x, this.f19065y, this.f19066z, this.f19044A, this.f19045B, this.f19046C, this.f19047D});
    }
}
