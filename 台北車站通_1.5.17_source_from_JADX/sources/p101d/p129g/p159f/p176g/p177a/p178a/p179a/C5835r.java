package p101d.p129g.p159f.p176g.p177a.p178a.p179a;

import p101d.p129g.p159f.C5882i;

/* renamed from: d.g.f.g.a.a.a.r */
final class C5835r {

    /* renamed from: a */
    private static final Object f16126a = new Object();

    /* renamed from: b */
    private static final Object[][] f16127b = {new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", f16126a, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", f16126a, 20}, new Object[]{"22", f16126a, 29}, new Object[]{"30", f16126a, 8}, new Object[]{"37", f16126a, 8}, new Object[]{"90", f16126a, 30}, new Object[]{"91", f16126a, 30}, new Object[]{"92", f16126a, 30}, new Object[]{"93", f16126a, 30}, new Object[]{"94", f16126a, 30}, new Object[]{"95", f16126a, 30}, new Object[]{"96", f16126a, 30}, new Object[]{"97", f16126a, 30}, new Object[]{"98", f16126a, 30}, new Object[]{"99", f16126a, 30}};

    /* renamed from: c */
    private static final Object[][] f16128c = {new Object[]{"240", f16126a, 30}, new Object[]{"241", f16126a, 30}, new Object[]{"242", f16126a, 6}, new Object[]{"250", f16126a, 30}, new Object[]{"251", f16126a, 30}, new Object[]{"253", f16126a, 17}, new Object[]{"254", f16126a, 20}, new Object[]{"400", f16126a, 30}, new Object[]{"401", f16126a, 30}, new Object[]{"402", 17}, new Object[]{"403", f16126a, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", f16126a, 20}, new Object[]{"421", f16126a, 15}, new Object[]{"422", 3}, new Object[]{"423", f16126a, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};

    /* renamed from: d */
    private static final Object[][] f16129d = {new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", f16126a, 15}, new Object[]{"391", f16126a, 18}, new Object[]{"392", f16126a, 15}, new Object[]{"393", f16126a, 18}, new Object[]{"703", f16126a, 30}};

    /* renamed from: e */
    private static final Object[][] f16130e = {new Object[]{"7001", 13}, new Object[]{"7002", f16126a, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", f16126a, 20}, new Object[]{"8003", f16126a, 30}, new Object[]{"8004", f16126a, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", f16126a, 30}, new Object[]{"8008", f16126a, 12}, new Object[]{"8018", 18}, new Object[]{"8020", f16126a, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", f16126a, 70}, new Object[]{"8200", f16126a, 70}};

    /* renamed from: a */
    private static String m22017a(int i, int i2, String str) {
        if (str.length() >= i) {
            String substring = str.substring(0, i);
            int i3 = i2 + i;
            if (str.length() >= i3) {
                String substring2 = str.substring(i, i3);
                String str2 = '(' + substring + ')' + substring2;
                String a = m22018a(str.substring(i3));
                if (a == null) {
                    return str2;
                }
                return str2 + a;
            }
            throw C5882i.m22303a();
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    static String m22018a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() >= 2) {
            String substring = str.substring(0, 2);
            for (Object[] objArr : f16127b) {
                if (objArr[0].equals(substring)) {
                    return objArr[1] == f16126a ? m22019b(2, ((Integer) objArr[2]).intValue(), str) : m22017a(2, ((Integer) objArr[1]).intValue(), str);
                }
            }
            if (str.length() >= 3) {
                String substring2 = str.substring(0, 3);
                for (Object[] objArr2 : f16128c) {
                    if (objArr2[0].equals(substring2)) {
                        return objArr2[1] == f16126a ? m22019b(3, ((Integer) objArr2[2]).intValue(), str) : m22017a(3, ((Integer) objArr2[1]).intValue(), str);
                    }
                }
                for (Object[] objArr3 : f16129d) {
                    if (objArr3[0].equals(substring2)) {
                        return objArr3[1] == f16126a ? m22019b(4, ((Integer) objArr3[2]).intValue(), str) : m22017a(4, ((Integer) objArr3[1]).intValue(), str);
                    }
                }
                if (str.length() >= 4) {
                    String substring3 = str.substring(0, 4);
                    for (Object[] objArr4 : f16130e) {
                        if (objArr4[0].equals(substring3)) {
                            return objArr4[1] == f16126a ? m22019b(4, ((Integer) objArr4[2]).intValue(), str) : m22017a(4, ((Integer) objArr4[1]).intValue(), str);
                        }
                    }
                    throw C5882i.m22303a();
                }
                throw C5882i.m22303a();
            }
            throw C5882i.m22303a();
        }
        throw C5882i.m22303a();
    }

    /* renamed from: b */
    private static String m22019b(int i, int i2, String str) {
        String substring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            i3 = str.length();
        }
        String substring2 = str.substring(i, i3);
        String str2 = '(' + substring + ')' + substring2;
        String a = m22018a(str.substring(i3));
        if (a == null) {
            return str2;
        }
        return str2 + a;
    }
}
