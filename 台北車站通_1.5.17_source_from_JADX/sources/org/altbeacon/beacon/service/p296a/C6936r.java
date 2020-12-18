package org.altbeacon.beacon.service.p296a;

import android.annotation.TargetApi;
import android.bluetooth.le.ScanFilter;
import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.C6910i;
import org.altbeacon.beacon.p293c.C6895d;

@TargetApi(21)
/* renamed from: org.altbeacon.beacon.service.a.r */
public class C6936r {

    /* renamed from: org.altbeacon.beacon.service.a.r$a */
    class C6937a {

        /* renamed from: a */
        public Long f19144a = null;

        /* renamed from: b */
        public int f19145b;

        /* renamed from: c */
        public byte[] f19146c;

        /* renamed from: d */
        public byte[] f19147d;

        C6937a() {
        }
    }

    /* renamed from: a */
    public List<ScanFilter> mo18867a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ScanFilter.Builder().build());
        return arrayList;
    }

    /* renamed from: a */
    public List<ScanFilter> mo18868a(List<C6910i> list) {
        ArrayList arrayList = new ArrayList();
        for (C6910i a : list) {
            for (C6937a next : mo18869a(a)) {
                ScanFilter.Builder builder = new ScanFilter.Builder();
                Long l = next.f19144a;
                if (l != null) {
                    String format = String.format("0000%04X-0000-1000-8000-00805f9b34fb", new Object[]{l});
                    ParcelUuid fromString = ParcelUuid.fromString(format);
                    ParcelUuid fromString2 = ParcelUuid.fromString("FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF");
                    if (C6895d.m26023a()) {
                        C6895d.m26021a("ScanFilterUtils", "making scan filter for service: " + format + " " + fromString, new Object[0]);
                        C6895d.m26021a("ScanFilterUtils", "making scan filter with service mask: " + "FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF" + " " + fromString2, new Object[0]);
                    }
                    builder.setServiceUuid(fromString, fromString2);
                } else {
                    builder.setServiceUuid((ParcelUuid) null);
                    builder.setManufacturerData(next.f19145b, next.f19146c, next.f19147d);
                }
                ScanFilter build = builder.build();
                if (C6895d.m26023a()) {
                    C6895d.m26021a("ScanFilterUtils", "Set up a scan filter: " + build, new Object[0]);
                }
                arrayList.add(build);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C6937a> mo18869a(C6910i iVar) {
        ArrayList arrayList = new ArrayList();
        for (int i : iVar.mo18787b()) {
            Long g = iVar.mo18793g();
            long longValue = iVar.mo18789d().longValue();
            int f = iVar.mo18792f();
            int e = iVar.mo18790e();
            int i2 = (e + 1) - 2;
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[i2];
            byte[] a = C6910i.m26110a(longValue, (e - f) + 1);
            for (int i3 = 2; i3 <= e; i3++) {
                int i4 = i3 - 2;
                if (i3 < f) {
                    bArr[i4] = 0;
                    bArr2[i4] = 0;
                } else {
                    bArr[i4] = a[i3 - f];
                    bArr2[i4] = -1;
                }
            }
            C6937a aVar = new C6937a();
            aVar.f19145b = i;
            aVar.f19146c = bArr;
            aVar.f19147d = bArr2;
            aVar.f19144a = g;
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
