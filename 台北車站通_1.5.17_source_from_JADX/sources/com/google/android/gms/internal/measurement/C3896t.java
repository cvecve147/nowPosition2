package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C2061y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.internal.measurement.t */
final class C3896t extends C3835dc {
    C3896t(C3839ec ecVar) {
        super(ecVar);
    }

    /* renamed from: a */
    private final Boolean m15677a(double d, C3895sc scVar) {
        try {
            return m15683a(new BigDecimal(d), scVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m15678a(long j, C3895sc scVar) {
        try {
            return m15683a(new BigDecimal(j), scVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Boolean m15679a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    /* renamed from: a */
    private final Boolean m15680a(String str, int i, boolean z, String str2, List<String> list, String str3) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    mo10385b().mo10576B().mo10593a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* renamed from: a */
    private final Boolean m15681a(String str, C3895sc scVar) {
        if (!C3871mc.m15532i(str)) {
            return null;
        }
        try {
            return m15683a(new BigDecimal(str), scVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m15682a(String str, C3903uc ucVar) {
        Integer num;
        ArrayList arrayList;
        C2061y.m9067a(ucVar);
        if (str == null || (num = ucVar.f11669c) == null || num.intValue() == 0) {
            return null;
        }
        if (ucVar.f11669c.intValue() == 6) {
            String[] strArr = ucVar.f11672f;
            if (strArr == null || strArr.length == 0) {
                return null;
            }
        } else if (ucVar.f11670d == null) {
            return null;
        }
        int intValue = ucVar.f11669c.intValue();
        Boolean bool = ucVar.f11671e;
        boolean z = bool != null && bool.booleanValue();
        String upperCase = (z || intValue == 1 || intValue == 6) ? ucVar.f11670d : ucVar.f11670d.toUpperCase(Locale.ENGLISH);
        String[] strArr2 = ucVar.f11672f;
        if (strArr2 == null) {
            arrayList = null;
        } else if (z) {
            arrayList = Arrays.asList(strArr2);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String upperCase2 : strArr2) {
                arrayList2.add(upperCase2.toUpperCase(Locale.ENGLISH));
            }
            arrayList = arrayList2;
        }
        return m15680a(str, intValue, z, upperCase, arrayList, intValue == 1 ? upperCase : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r3 != null) goto L_0x0071;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m15683a(java.math.BigDecimal r10, com.google.android.gms.internal.measurement.C3895sc r11, double r12) {
        /*
            com.google.android.gms.common.internal.C2061y.m9067a(r11)
            java.lang.Integer r0 = r11.f11643c
            r1 = 0
            if (r0 == 0) goto L_0x00f2
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0010
            goto L_0x00f2
        L_0x0010:
            java.lang.Integer r0 = r11.f11643c
            int r0 = r0.intValue()
            r2 = 4
            if (r0 != r2) goto L_0x0022
            java.lang.String r0 = r11.f11646f
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r11.f11647g
            if (r0 != 0) goto L_0x0027
        L_0x0021:
            return r1
        L_0x0022:
            java.lang.String r0 = r11.f11645e
            if (r0 != 0) goto L_0x0027
            return r1
        L_0x0027:
            java.lang.Integer r0 = r11.f11643c
            int r0 = r0.intValue()
            java.lang.Integer r3 = r11.f11643c
            int r3 = r3.intValue()
            if (r3 != r2) goto L_0x0058
            java.lang.String r3 = r11.f11646f
            boolean r3 = com.google.android.gms.internal.measurement.C3871mc.m15532i(r3)
            if (r3 == 0) goto L_0x0057
            java.lang.String r3 = r11.f11647g
            boolean r3 = com.google.android.gms.internal.measurement.C3871mc.m15532i(r3)
            if (r3 != 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0057 }
            java.lang.String r4 = r11.f11646f     // Catch:{ NumberFormatException -> 0x0057 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0057 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0057 }
            java.lang.String r11 = r11.f11647g     // Catch:{ NumberFormatException -> 0x0057 }
            r4.<init>(r11)     // Catch:{ NumberFormatException -> 0x0057 }
            r11 = r3
            r3 = r1
            goto L_0x006a
        L_0x0057:
            return r1
        L_0x0058:
            java.lang.String r3 = r11.f11645e
            boolean r3 = com.google.android.gms.internal.measurement.C3871mc.m15532i(r3)
            if (r3 != 0) goto L_0x0061
            return r1
        L_0x0061:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00f2 }
            java.lang.String r11 = r11.f11645e     // Catch:{ NumberFormatException -> 0x00f2 }
            r3.<init>(r11)     // Catch:{ NumberFormatException -> 0x00f2 }
            r11 = r1
            r4 = r11
        L_0x006a:
            if (r0 != r2) goto L_0x006f
            if (r11 != 0) goto L_0x0071
            return r1
        L_0x006f:
            if (r3 == 0) goto L_0x00f2
        L_0x0071:
            r5 = -1
            r6 = 0
            r7 = 1
            if (r0 == r7) goto L_0x00e6
            r8 = 2
            if (r0 == r8) goto L_0x00da
            r9 = 3
            if (r0 == r9) goto L_0x0092
            if (r0 == r2) goto L_0x0080
            goto L_0x00f2
        L_0x0080:
            int r11 = r10.compareTo(r11)
            if (r11 == r5) goto L_0x008d
            int r10 = r10.compareTo(r4)
            if (r10 == r7) goto L_0x008d
            r6 = r7
        L_0x008d:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x0092:
            r0 = 0
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x00ce
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r12)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r8)
            java.math.BigDecimal r11 = r11.multiply(r0)
            java.math.BigDecimal r11 = r3.subtract(r11)
            int r11 = r10.compareTo(r11)
            if (r11 != r7) goto L_0x00c9
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r12)
            java.math.BigDecimal r12 = new java.math.BigDecimal
            r12.<init>(r8)
            java.math.BigDecimal r11 = r11.multiply(r12)
            java.math.BigDecimal r11 = r3.add(r11)
            int r10 = r10.compareTo(r11)
            if (r10 != r5) goto L_0x00c9
            r6 = r7
        L_0x00c9:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00ce:
            int r10 = r10.compareTo(r3)
            if (r10 != 0) goto L_0x00d5
            r6 = r7
        L_0x00d5:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00da:
            int r10 = r10.compareTo(r3)
            if (r10 != r7) goto L_0x00e1
            r6 = r7
        L_0x00e1:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00e6:
            int r10 = r10.compareTo(r3)
            if (r10 != r5) goto L_0x00ed
            r6 = r7
        L_0x00ed:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00f2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3896t.m15683a(java.math.BigDecimal, com.google.android.gms.internal.measurement.sc, double):java.lang.Boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v103, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: java.lang.Long} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x073f  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0747  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0a2c  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0a2f  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0a50  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x05a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C3919yc[] mo10963a(java.lang.String r50, com.google.android.gms.internal.measurement.C3923zc[] r51, com.google.android.gms.internal.measurement.C3733Ec[] r52) {
        /*
            r49 = this;
            r1 = r49
            r15 = r50
            r14 = r51
            r13 = r52
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r50)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            b.b.h.h.b r12 = new b.b.h.h.b
            r12.<init>()
            b.b.h.h.b r9 = new b.b.h.h.b
            r9.<init>()
            b.b.h.h.b r10 = new b.b.h.h.b
            r10.<init>()
            com.google.android.gms.internal.measurement.z r0 = r49.mo10656t()
            java.util.Map r0 = r0.mo11086e(r15)
            r8 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            if (r0 == 0) goto L_0x00f7
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0036:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f7
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.measurement.Dc r4 = (com.google.android.gms.internal.measurement.C3729Dc) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r9.get(r5)
            java.util.BitSet r5 = (java.util.BitSet) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r10.get(r6)
            java.util.BitSet r6 = (java.util.BitSet) r6
            if (r5 != 0) goto L_0x007e
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r9.put(r6, r5)
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r10.put(r8, r6)
        L_0x007e:
            r17 = r0
            r8 = 0
        L_0x0081:
            long[] r0 = r4.f11075c
            r18 = r2
            int r2 = r0.length
            int r2 = r2 << 6
            if (r8 >= r2) goto L_0x00c5
            boolean r0 = com.google.android.gms.internal.measurement.C3871mc.m15519a((long[]) r0, (int) r8)
            if (r0 == 0) goto L_0x00b8
            com.google.android.gms.internal.measurement.W r0 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10580F()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r19 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r20 = r10
            java.lang.String r10 = "Filter already evaluated. audience ID, filter ID"
            r0.mo10594a(r10, r2, r9)
            r6.set(r8)
            long[] r0 = r4.f11076d
            boolean r0 = com.google.android.gms.internal.measurement.C3871mc.m15519a((long[]) r0, (int) r8)
            if (r0 == 0) goto L_0x00bc
            r5.set(r8)
            goto L_0x00bc
        L_0x00b8:
            r19 = r9
            r20 = r10
        L_0x00bc:
            int r8 = r8 + 1
            r2 = r18
            r9 = r19
            r10 = r20
            goto L_0x0081
        L_0x00c5:
            r19 = r9
            r20 = r10
            com.google.android.gms.internal.measurement.yc r0 = new com.google.android.gms.internal.measurement.yc
            r0.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r12.put(r2, r0)
            r0.f11731g = r7
            r0.f11730f = r4
            com.google.android.gms.internal.measurement.Dc r2 = new com.google.android.gms.internal.measurement.Dc
            r2.<init>()
            r0.f11729e = r2
            com.google.android.gms.internal.measurement.Dc r2 = r0.f11729e
            long[] r3 = com.google.android.gms.internal.measurement.C3871mc.m15521a((java.util.BitSet) r5)
            r2.f11076d = r3
            com.google.android.gms.internal.measurement.Dc r0 = r0.f11729e
            long[] r2 = com.google.android.gms.internal.measurement.C3871mc.m15521a((java.util.BitSet) r6)
            r0.f11075c = r2
            r0 = r17
            r2 = r18
            r8 = 0
            goto L_0x0036
        L_0x00f7:
            r19 = r9
            r20 = r10
            java.lang.String r17 = "null"
            java.lang.String r10 = "Filter definition"
            java.lang.String r5 = "Skipping failed audience ID"
            if (r14 == 0) goto L_0x07c9
            b.b.h.h.b r3 = new b.b.h.h.b
            r3.<init>()
            int r2 = r14.length
            r21 = 0
            r23 = r21
            r0 = 0
            r13 = 0
            r18 = 0
        L_0x0111:
            if (r13 >= r2) goto L_0x07c9
            r8 = r14[r13]
            java.lang.String r9 = r8.f11748e
            com.google.android.gms.internal.measurement.Ac[] r6 = r8.f11747d
            com.google.android.gms.internal.measurement.w r4 = r49.mo10456r()
            r28 = r2
            com.google.android.gms.internal.measurement.M<java.lang.Boolean> r2 = com.google.android.gms.internal.measurement.C3758L.f11186T
            boolean r2 = r4.mo11005d(r15, r2)
            if (r2 == 0) goto L_0x02ff
            r49.mo10454o()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C3871mc.m15524b((com.google.android.gms.internal.measurement.C3923zc) r8, (java.lang.String) r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0137
            r29 = 1
            goto L_0x0139
        L_0x0137:
            r29 = 0
        L_0x0139:
            if (r29 == 0) goto L_0x0147
            r30 = r3
            java.lang.String r3 = "_ep"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0149
            r3 = 1
            goto L_0x014a
        L_0x0147:
            r30 = r3
        L_0x0149:
            r3 = 0
        L_0x014a:
            if (r3 == 0) goto L_0x02b2
            r49.mo10454o()
            java.lang.String r3 = "_en"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3871mc.m15524b((com.google.android.gms.internal.measurement.C3923zc) r8, (java.lang.String) r3)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 == 0) goto L_0x017b
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()
            java.lang.String r3 = "Extra parameter without an event name. eventId"
            r2.mo10593a(r3, r4)
            r31 = r0
            r36 = r5
            r32 = r7
            r27 = r10
            r35 = r30
            r16 = 0
            r30 = 1
            goto L_0x02a4
        L_0x017b:
            if (r0 == 0) goto L_0x018e
            if (r18 == 0) goto L_0x018e
            long r31 = r4.longValue()
            long r33 = r18.longValue()
            int r3 = (r31 > r33 ? 1 : (r31 == r33 ? 0 : -1))
            if (r3 == 0) goto L_0x018c
            goto L_0x018e
        L_0x018c:
            r3 = r0
            goto L_0x01b6
        L_0x018e:
            com.google.android.gms.internal.measurement.z r3 = r49.mo10656t()
            android.util.Pair r3 = r3.mo11062a((java.lang.String) r15, (java.lang.Long) r4)
            if (r3 == 0) goto L_0x0289
            r31 = r0
            java.lang.Object r0 = r3.first
            if (r0 != 0) goto L_0x01a0
            goto L_0x028b
        L_0x01a0:
            com.google.android.gms.internal.measurement.zc r0 = (com.google.android.gms.internal.measurement.C3923zc) r0
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r23 = r3.longValue()
            r49.mo10454o()
            java.lang.Object r2 = com.google.android.gms.internal.measurement.C3871mc.m15524b((com.google.android.gms.internal.measurement.C3923zc) r0, (java.lang.String) r2)
            r18 = r2
            java.lang.Long r18 = (java.lang.Long) r18
            goto L_0x018c
        L_0x01b6:
            r31 = 1
            long r23 = r23 - r31
            int r0 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x020e
            com.google.android.gms.internal.measurement.z r2 = r49.mo10656t()
            r2.mo10451d()
            com.google.android.gms.internal.measurement.W r0 = r2.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10580F()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo10593a(r4, r15)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo11051A()     // Catch:{ SQLiteException -> 0x01eb }
            java.lang.String r4 = "delete from main_event_params where app_id=?"
            r26 = r3
            r32 = r5
            r5 = 1
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x01e9 }
            r16 = 0
            r3[r16] = r15     // Catch:{ SQLiteException -> 0x01e7 }
            r0.execSQL(r4, r3)     // Catch:{ SQLiteException -> 0x01e7 }
            goto L_0x0200
        L_0x01e7:
            r0 = move-exception
            goto L_0x01f3
        L_0x01e9:
            r0 = move-exception
            goto L_0x01f1
        L_0x01eb:
            r0 = move-exception
            r26 = r3
            r32 = r5
            r5 = 1
        L_0x01f1:
            r16 = 0
        L_0x01f3:
            com.google.android.gms.internal.measurement.W r2 = r2.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo10593a(r3, r0)
        L_0x0200:
            r27 = r10
            r2 = r26
            r35 = r30
            r36 = r32
            r30 = r5
            r10 = r6
            r32 = r7
            goto L_0x022f
        L_0x020e:
            r26 = r3
            r32 = r5
            r5 = 1
            r16 = 0
            com.google.android.gms.internal.measurement.z r2 = r49.mo10656t()
            r35 = r30
            r3 = r50
            r30 = r5
            r27 = r10
            r36 = r32
            r10 = r6
            r5 = r23
            r32 = r7
            r7 = r26
            r2.mo11077a(r3, r4, r5, r7)
            r2 = r26
        L_0x022f:
            com.google.android.gms.internal.measurement.Ac[] r0 = r2.f11747d
            int r3 = r0.length
            int r4 = r10.length
            int r3 = r3 + r4
            com.google.android.gms.internal.measurement.Ac[] r3 = new com.google.android.gms.internal.measurement.C3717Ac[r3]
            int r4 = r0.length
            r5 = r16
            r6 = r5
        L_0x023a:
            if (r5 >= r4) goto L_0x0255
            r7 = r0[r5]
            r49.mo10454o()
            r26 = r0
            java.lang.String r0 = r7.f11014d
            com.google.android.gms.internal.measurement.Ac r0 = com.google.android.gms.internal.measurement.C3871mc.m15508a((com.google.android.gms.internal.measurement.C3923zc) r8, (java.lang.String) r0)
            if (r0 != 0) goto L_0x0250
            int r0 = r6 + 1
            r3[r6] = r7
            r6 = r0
        L_0x0250:
            int r5 = r5 + 1
            r0 = r26
            goto L_0x023a
        L_0x0255:
            if (r6 <= 0) goto L_0x0278
            int r0 = r10.length
            r4 = r16
        L_0x025a:
            if (r4 >= r0) goto L_0x0266
            r5 = r10[r4]
            int r7 = r6 + 1
            r3[r6] = r5
            int r4 = r4 + 1
            r6 = r7
            goto L_0x025a
        L_0x0266:
            int r0 = r3.length
            if (r6 != r0) goto L_0x026b
            r6 = r3
            goto L_0x0272
        L_0x026b:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r6)
            com.google.android.gms.internal.measurement.Ac[] r0 = (com.google.android.gms.internal.measurement.C3717Ac[]) r0
            r6 = r0
        L_0x0272:
            r31 = r2
            r0 = r9
            r9 = r6
            goto L_0x0310
        L_0x0278:
            com.google.android.gms.internal.measurement.W r0 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10576B()
            java.lang.String r3 = "No unique parameters in main event. eventName"
            r0.mo10593a(r3, r9)
            r31 = r2
            goto L_0x030e
        L_0x0289:
            r31 = r0
        L_0x028b:
            r36 = r5
            r32 = r7
            r27 = r10
            r35 = r30
            r16 = 0
            r30 = 1
            com.google.android.gms.internal.measurement.W r0 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo10594a(r2, r9, r4)
        L_0x02a4:
            r8 = r1
            r9 = r11
            r48 = r12
            r16 = r13
            r43 = r19
            r44 = r20
            r46 = r27
            goto L_0x07af
        L_0x02b2:
            r31 = r0
            r36 = r5
            r32 = r7
            r27 = r10
            r35 = r30
            r16 = 0
            r30 = 1
            r10 = r6
            if (r29 == 0) goto L_0x030e
            r49.mo10454o()
            java.lang.Long r0 = java.lang.Long.valueOf(r21)
            java.lang.String r2 = "_epc"
            java.lang.Object r2 = com.google.android.gms.internal.measurement.C3871mc.m15524b((com.google.android.gms.internal.measurement.C3923zc) r8, (java.lang.String) r2)
            if (r2 != 0) goto L_0x02d3
            goto L_0x02d4
        L_0x02d3:
            r0 = r2
        L_0x02d4:
            java.lang.Long r0 = (java.lang.Long) r0
            long r23 = r0.longValue()
            int r0 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x02ed
            com.google.android.gms.internal.measurement.W r0 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10576B()
            java.lang.String r2 = "Complex event with zero extra param count. eventName"
            r0.mo10593a(r2, r9)
            r0 = r4
            goto L_0x02fa
        L_0x02ed:
            com.google.android.gms.internal.measurement.z r2 = r49.mo10656t()
            r3 = r50
            r0 = r4
            r5 = r23
            r7 = r8
            r2.mo11077a(r3, r4, r5, r7)
        L_0x02fa:
            r18 = r0
            r31 = r8
            goto L_0x030e
        L_0x02ff:
            r31 = r0
            r35 = r3
            r36 = r5
            r32 = r7
            r27 = r10
            r16 = 0
            r30 = 1
            r10 = r6
        L_0x030e:
            r0 = r9
            r9 = r10
        L_0x0310:
            com.google.android.gms.internal.measurement.z r2 = r49.mo10656t()
            java.lang.String r3 = r8.f11748e
            com.google.android.gms.internal.measurement.H r2 = r2.mo11078b((java.lang.String) r15, (java.lang.String) r3)
            if (r2 != 0) goto L_0x036f
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r50)
            com.google.android.gms.internal.measurement.U r4 = r49.mo10453n()
            java.lang.String r4 = r4.mo10557a((java.lang.String) r0)
            java.lang.String r5 = "Event aggregate wasn't created during raw event logging. appId, event"
            r2.mo10594a(r5, r3, r4)
            com.google.android.gms.internal.measurement.H r26 = new com.google.android.gms.internal.measurement.H
            java.lang.String r4 = r8.f11748e
            r5 = 1
            r33 = 1
            java.lang.Long r2 = r8.f11749f
            long r37 = r2.longValue()
            r39 = 0
            r29 = 0
            r41 = 0
            r42 = 0
            r2 = r26
            r3 = r50
            r10 = 2
            r7 = r33
            r45 = r9
            r43 = r19
            r44 = r20
            r46 = r27
            r9 = r37
            r47 = r11
            r48 = r12
            r11 = r39
            r16 = r13
            r13 = r29
            r14 = r41
            r1 = r15
            r15 = r42
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r14, r15)
            goto L_0x0384
        L_0x036f:
            r45 = r9
            r47 = r11
            r48 = r12
            r16 = r13
            r1 = r15
            r43 = r19
            r44 = r20
            r46 = r27
            com.google.android.gms.internal.measurement.H r26 = r2.mo10473a()
            r2 = r26
        L_0x0384:
            com.google.android.gms.internal.measurement.z r3 = r49.mo10656t()
            r3.mo11069a((com.google.android.gms.internal.measurement.C3742H) r2)
            long r2 = r2.f11125c
            r4 = r35
            java.lang.Object r5 = r4.get(r0)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x03a9
            com.google.android.gms.internal.measurement.z r5 = r49.mo10656t()
            java.util.Map r5 = r5.mo11089g(r1, r0)
            if (r5 != 0) goto L_0x03a6
            b.b.h.h.b r5 = new b.b.h.h.b
            r5.<init>()
        L_0x03a6:
            r4.put(r0, r5)
        L_0x03a9:
            java.util.Set r6 = r5.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x03b1:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x07a8
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9 = r47
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L_0x03e1
            com.google.android.gms.internal.measurement.W r8 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r8 = r8.mo10580F()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = r36
            r8.mo10593a(r10, r7)
            r47 = r9
            goto L_0x03b1
        L_0x03e1:
            r10 = r36
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11 = r48
            java.lang.Object r8 = r11.get(r8)
            com.google.android.gms.internal.measurement.yc r8 = (com.google.android.gms.internal.measurement.C3919yc) r8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r13 = r43
            java.lang.Object r12 = r13.get(r12)
            java.util.BitSet r12 = (java.util.BitSet) r12
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            r15 = r44
            java.lang.Object r14 = r15.get(r14)
            java.util.BitSet r14 = (java.util.BitSet) r14
            if (r8 != 0) goto L_0x0433
            com.google.android.gms.internal.measurement.yc r8 = new com.google.android.gms.internal.measurement.yc
            r8.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r11.put(r12, r8)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r30)
            r8.f11731g = r12
            java.util.BitSet r12 = new java.util.BitSet
            r12.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r13.put(r8, r12)
            java.util.BitSet r14 = new java.util.BitSet
            r14.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r15.put(r8, r14)
        L_0x0433:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r5.get(r8)
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0441:
            boolean r19 = r8.hasNext()
            if (r19 == 0) goto L_0x079a
            java.lang.Object r19 = r8.next()
            r1 = r19
            com.google.android.gms.internal.measurement.qc r1 = (com.google.android.gms.internal.measurement.C3887qc) r1
            r35 = r4
            com.google.android.gms.internal.measurement.W r4 = r49.mo10385b()
            r19 = r5
            r5 = 2
            boolean r4 = r4.mo10584a((int) r5)
            if (r4 == 0) goto L_0x0497
            com.google.android.gms.internal.measurement.W r4 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10580F()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r20 = r6
            java.lang.Integer r6 = r1.f11597d
            r25 = r8
            com.google.android.gms.internal.measurement.U r8 = r49.mo10453n()
            r44 = r15
            java.lang.String r15 = r1.f11598e
            java.lang.String r8 = r8.mo10557a((java.lang.String) r15)
            java.lang.String r15 = "Evaluating filter. audience, filter, event"
            r4.mo10595a(r15, r5, r6, r8)
            com.google.android.gms.internal.measurement.W r4 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10580F()
            com.google.android.gms.internal.measurement.U r5 = r49.mo10453n()
            java.lang.String r5 = r5.mo10554a((com.google.android.gms.internal.measurement.C3887qc) r1)
            r6 = r46
            r4.mo10593a(r6, r5)
            goto L_0x049f
        L_0x0497:
            r20 = r6
            r25 = r8
            r44 = r15
            r6 = r46
        L_0x049f:
            java.lang.Integer r4 = r1.f11597d
            if (r4 == 0) goto L_0x0760
            int r4 = r4.intValue()
            r5 = 256(0x100, float:3.59E-43)
            if (r4 <= r5) goto L_0x04ad
            goto L_0x0760
        L_0x04ad:
            java.lang.Integer r4 = r1.f11597d
            int r4 = r4.intValue()
            boolean r4 = r12.get(r4)
            if (r4 == 0) goto L_0x04dc
            com.google.android.gms.internal.measurement.W r4 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10580F()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r1 = r1.f11597d
            java.lang.String r15 = "Event filter already evaluated true. audience ID, filter ID"
            r4.mo10594a(r15, r8, r1)
            r1 = r50
            r46 = r6
            r5 = r19
            r6 = r20
            r8 = r25
            r4 = r35
            r15 = r44
            goto L_0x0441
        L_0x04dc:
            com.google.android.gms.internal.measurement.sc r4 = r1.f11601h
            if (r4 == 0) goto L_0x050b
            r8 = r49
            r15 = r50
            java.lang.Boolean r4 = r8.m15678a((long) r2, (com.google.android.gms.internal.measurement.C3895sc) r4)
            if (r4 != 0) goto L_0x04f7
            r26 = r2
        L_0x04ec:
            r46 = r6
        L_0x04ee:
            r36 = r10
            r48 = r11
            r43 = r13
        L_0x04f4:
            r2 = 0
            goto L_0x072a
        L_0x04f7:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x050f
            r26 = r2
            r46 = r6
            r36 = r10
            r48 = r11
            r43 = r13
        L_0x0507:
            r2 = r32
            goto L_0x072a
        L_0x050b:
            r8 = r49
            r15 = r50
        L_0x050f:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            com.google.android.gms.internal.measurement.rc[] r5 = r1.f11599f
            r26 = r2
            int r2 = r5.length
            r3 = 0
        L_0x051a:
            if (r3 >= r2) goto L_0x054c
            r29 = r2
            r2 = r5[r3]
            r33 = r5
            java.lang.String r5 = r2.f11636g
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0540
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            com.google.android.gms.internal.measurement.U r3 = r49.mo10453n()
            java.lang.String r3 = r3.mo10557a((java.lang.String) r0)
            java.lang.String r4 = "null or empty param name in filter. event"
            r2.mo10593a(r4, r3)
            goto L_0x04ec
        L_0x0540:
            java.lang.String r2 = r2.f11636g
            r4.add(r2)
            int r3 = r3 + 1
            r2 = r29
            r5 = r33
            goto L_0x051a
        L_0x054c:
            b.b.h.h.b r2 = new b.b.h.h.b
            r2.<init>()
            r3 = r45
            int r5 = r3.length
            r46 = r6
            r6 = 0
        L_0x0557:
            if (r6 >= r5) goto L_0x05a3
            r29 = r5
            r5 = r3[r6]
            r45 = r3
            java.lang.String r3 = r5.f11014d
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x059c
            java.lang.Long r3 = r5.f11016f
            if (r3 == 0) goto L_0x0571
        L_0x056b:
            java.lang.String r5 = r5.f11014d
            r2.put(r5, r3)
            goto L_0x059c
        L_0x0571:
            java.lang.Double r3 = r5.f11018h
            if (r3 == 0) goto L_0x0576
            goto L_0x056b
        L_0x0576:
            java.lang.String r3 = r5.f11015e
            if (r3 == 0) goto L_0x057b
            goto L_0x056b
        L_0x057b:
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            com.google.android.gms.internal.measurement.U r3 = r49.mo10453n()
            java.lang.String r3 = r3.mo10557a((java.lang.String) r0)
            com.google.android.gms.internal.measurement.U r4 = r49.mo10453n()
            java.lang.String r5 = r5.f11014d
            java.lang.String r4 = r4.mo10558b(r5)
            java.lang.String r5 = "Unknown value for param. event, param"
            r2.mo10594a(r5, r3, r4)
            goto L_0x04ee
        L_0x059c:
            int r6 = r6 + 1
            r5 = r29
            r3 = r45
            goto L_0x0557
        L_0x05a3:
            r45 = r3
            com.google.android.gms.internal.measurement.rc[] r3 = r1.f11599f
            int r4 = r3.length
            r5 = 0
        L_0x05a9:
            if (r5 >= r4) goto L_0x0720
            r6 = r3[r5]
            r29 = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r33 = r4
            java.lang.Boolean r4 = r6.f11635f
            boolean r3 = r3.equals(r4)
            java.lang.String r4 = r6.f11636g
            boolean r34 = android.text.TextUtils.isEmpty(r4)
            if (r34 == 0) goto L_0x05d8
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            com.google.android.gms.internal.measurement.U r3 = r49.mo10453n()
            java.lang.String r3 = r3.mo10557a((java.lang.String) r0)
            java.lang.String r4 = "Event has empty param name. event"
            r2.mo10593a(r4, r3)
            goto L_0x04ee
        L_0x05d8:
            r43 = r13
            java.lang.Object r13 = r2.get(r4)
            r34 = r2
            boolean r2 = r13 instanceof java.lang.Long
            if (r2 == 0) goto L_0x062a
            com.google.android.gms.internal.measurement.sc r2 = r6.f11634e
            if (r2 != 0) goto L_0x060b
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            com.google.android.gms.internal.measurement.U r3 = r49.mo10453n()
            java.lang.String r3 = r3.mo10557a((java.lang.String) r0)
            com.google.android.gms.internal.measurement.U r5 = r49.mo10453n()
            java.lang.String r4 = r5.mo10558b(r4)
            java.lang.String r5 = "No number filter for long param. event, param"
            r2.mo10594a(r5, r3, r4)
            r36 = r10
            r48 = r11
            goto L_0x04f4
        L_0x060b:
            java.lang.Long r13 = (java.lang.Long) r13
            r36 = r10
            r48 = r11
            long r10 = r13.longValue()
            com.google.android.gms.internal.measurement.sc r2 = r6.f11634e
            java.lang.Boolean r2 = r8.m15678a((long) r10, (com.google.android.gms.internal.measurement.C3895sc) r2)
            if (r2 != 0) goto L_0x061f
        L_0x061d:
            goto L_0x04f4
        L_0x061f:
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x069c
        L_0x0628:
            goto L_0x0507
        L_0x062a:
            r36 = r10
            r48 = r11
            boolean r2 = r13 instanceof java.lang.Double
            if (r2 == 0) goto L_0x066e
            com.google.android.gms.internal.measurement.sc r2 = r6.f11634e
            if (r2 != 0) goto L_0x0655
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            com.google.android.gms.internal.measurement.U r3 = r49.mo10453n()
            java.lang.String r3 = r3.mo10557a((java.lang.String) r0)
            com.google.android.gms.internal.measurement.U r5 = r49.mo10453n()
            java.lang.String r4 = r5.mo10558b(r4)
            java.lang.String r5 = "No number filter for double param. event, param"
        L_0x0650:
            r2.mo10594a(r5, r3, r4)
            goto L_0x04f4
        L_0x0655:
            java.lang.Double r13 = (java.lang.Double) r13
            double r10 = r13.doubleValue()
            com.google.android.gms.internal.measurement.sc r2 = r6.f11634e
            java.lang.Boolean r2 = r8.m15677a((double) r10, (com.google.android.gms.internal.measurement.C3895sc) r2)
            if (r2 != 0) goto L_0x0664
            goto L_0x061d
        L_0x0664:
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x069c
        L_0x066d:
            goto L_0x0628
        L_0x066e:
            boolean r2 = r13 instanceof java.lang.String
            if (r2 == 0) goto L_0x06e3
            com.google.android.gms.internal.measurement.uc r2 = r6.f11633d
            if (r2 == 0) goto L_0x067d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Boolean r2 = r8.m15682a((java.lang.String) r13, (com.google.android.gms.internal.measurement.C3903uc) r2)
            goto L_0x068f
        L_0x067d:
            com.google.android.gms.internal.measurement.sc r2 = r6.f11634e
            if (r2 == 0) goto L_0x06c7
            java.lang.String r13 = (java.lang.String) r13
            boolean r2 = com.google.android.gms.internal.measurement.C3871mc.m15532i(r13)
            if (r2 == 0) goto L_0x06ac
            com.google.android.gms.internal.measurement.sc r2 = r6.f11634e
            java.lang.Boolean r2 = r8.m15681a((java.lang.String) r13, (com.google.android.gms.internal.measurement.C3895sc) r2)
        L_0x068f:
            if (r2 != 0) goto L_0x0692
            goto L_0x061d
        L_0x0692:
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x069c
            goto L_0x066d
        L_0x069c:
            int r5 = r5 + 1
            r3 = r29
            r4 = r33
            r2 = r34
            r10 = r36
            r13 = r43
            r11 = r48
            goto L_0x05a9
        L_0x06ac:
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            com.google.android.gms.internal.measurement.U r3 = r49.mo10453n()
            java.lang.String r3 = r3.mo10557a((java.lang.String) r0)
            com.google.android.gms.internal.measurement.U r5 = r49.mo10453n()
            java.lang.String r4 = r5.mo10558b(r4)
            java.lang.String r5 = "Invalid param value for number filter. event, param"
            goto L_0x0650
        L_0x06c7:
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            com.google.android.gms.internal.measurement.U r3 = r49.mo10453n()
            java.lang.String r3 = r3.mo10557a((java.lang.String) r0)
            com.google.android.gms.internal.measurement.U r5 = r49.mo10453n()
            java.lang.String r4 = r5.mo10558b(r4)
            java.lang.String r5 = "No filter for String param. event, param"
            goto L_0x0650
        L_0x06e3:
            if (r13 != 0) goto L_0x0704
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10580F()
            com.google.android.gms.internal.measurement.U r3 = r49.mo10453n()
            java.lang.String r3 = r3.mo10557a((java.lang.String) r0)
            com.google.android.gms.internal.measurement.U r5 = r49.mo10453n()
            java.lang.String r4 = r5.mo10558b(r4)
            java.lang.String r5 = "Missing param for filter. event, param"
            r2.mo10594a(r5, r3, r4)
            goto L_0x0507
        L_0x0704:
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            com.google.android.gms.internal.measurement.U r3 = r49.mo10453n()
            java.lang.String r3 = r3.mo10557a((java.lang.String) r0)
            com.google.android.gms.internal.measurement.U r5 = r49.mo10453n()
            java.lang.String r4 = r5.mo10558b(r4)
            java.lang.String r5 = "Unknown param type. event, param"
            goto L_0x0650
        L_0x0720:
            r36 = r10
            r48 = r11
            r43 = r13
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r30)
        L_0x072a:
            com.google.android.gms.internal.measurement.W r3 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10580F()
            if (r2 != 0) goto L_0x0737
            r4 = r17
            goto L_0x0738
        L_0x0737:
            r4 = r2
        L_0x0738:
            java.lang.String r5 = "Event filter result"
            r3.mo10593a(r5, r4)
            if (r2 != 0) goto L_0x0747
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r9.add(r1)
            goto L_0x0785
        L_0x0747:
            java.lang.Integer r3 = r1.f11597d
            int r3 = r3.intValue()
            r14.set(r3)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0785
            java.lang.Integer r1 = r1.f11597d
            int r1 = r1.intValue()
            r12.set(r1)
            goto L_0x0785
        L_0x0760:
            r8 = r49
            r15 = r50
            r26 = r2
            r46 = r6
            r36 = r10
            r48 = r11
            r43 = r13
            com.google.android.gms.internal.measurement.W r2 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r50)
            java.lang.Integer r1 = r1.f11597d
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r2.mo10594a(r4, r3, r1)
        L_0x0785:
            r1 = r15
            r5 = r19
            r6 = r20
            r8 = r25
            r2 = r26
            r4 = r35
            r10 = r36
            r13 = r43
            r15 = r44
            r11 = r48
            goto L_0x0441
        L_0x079a:
            r8 = r49
            r47 = r9
            r36 = r10
            r48 = r11
            r43 = r13
            r44 = r15
            goto L_0x03b1
        L_0x07a8:
            r8 = r49
            r15 = r1
            r35 = r4
            r9 = r47
        L_0x07af:
            r0 = r31
            int r13 = r16 + 1
            r14 = r51
            r1 = r8
            r11 = r9
            r2 = r28
            r7 = r32
            r3 = r35
            r5 = r36
            r19 = r43
            r20 = r44
            r10 = r46
            r12 = r48
            goto L_0x0111
        L_0x07c9:
            r8 = r1
            r36 = r5
            r46 = r10
            r9 = r11
            r48 = r12
            r43 = r19
            r44 = r20
            r30 = 1
            r1 = r52
            if (r1 == 0) goto L_0x0abc
            b.b.h.h.b r0 = new b.b.h.h.b
            r0.<init>()
            int r2 = r1.length
            r3 = 0
        L_0x07e2:
            if (r3 >= r2) goto L_0x0abc
            r4 = r1[r3]
            java.lang.String r5 = r4.f11090e
            java.lang.Object r5 = r0.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x0806
            com.google.android.gms.internal.measurement.z r5 = r49.mo10656t()
            java.lang.String r6 = r4.f11090e
            java.util.Map r5 = r5.mo11090h(r15, r6)
            if (r5 != 0) goto L_0x0801
            b.b.h.h.b r5 = new b.b.h.h.b
            r5.<init>()
        L_0x0801:
            java.lang.String r6 = r4.f11090e
            r0.put(r6, r5)
        L_0x0806:
            java.util.Set r6 = r5.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x080e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0aaa
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r10 = r9.contains(r10)
            if (r10 == 0) goto L_0x083a
            com.google.android.gms.internal.measurement.W r10 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r10 = r10.mo10580F()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11 = r36
            r10.mo10593a(r11, r7)
            goto L_0x080e
        L_0x083a:
            r11 = r36
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r12 = r48
            java.lang.Object r10 = r12.get(r10)
            com.google.android.gms.internal.measurement.yc r10 = (com.google.android.gms.internal.measurement.C3919yc) r10
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r14 = r43
            java.lang.Object r13 = r14.get(r13)
            java.util.BitSet r13 = (java.util.BitSet) r13
            r51 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1 = r44
            java.lang.Object r0 = r1.get(r0)
            java.util.BitSet r0 = (java.util.BitSet) r0
            if (r10 != 0) goto L_0x088e
            com.google.android.gms.internal.measurement.yc r0 = new com.google.android.gms.internal.measurement.yc
            r0.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r12.put(r10, r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r30)
            r0.f11731g = r10
            java.util.BitSet r13 = new java.util.BitSet
            r13.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r14.put(r0, r13)
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r1.put(r10, r0)
        L_0x088e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r5.get(r10)
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x089c:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0a9a
            java.lang.Object r16 = r10.next()
            r18 = r2
            r2 = r16
            com.google.android.gms.internal.measurement.tc r2 = (com.google.android.gms.internal.measurement.C3899tc) r2
            r16 = r5
            com.google.android.gms.internal.measurement.W r5 = r49.mo10385b()
            r19 = r6
            r6 = 2
            boolean r5 = r5.mo10584a((int) r6)
            if (r5 == 0) goto L_0x08f2
            com.google.android.gms.internal.measurement.W r5 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10580F()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r20 = r10
            java.lang.Integer r10 = r2.f11662d
            r36 = r11
            com.google.android.gms.internal.measurement.U r11 = r49.mo10453n()
            java.lang.String r15 = r2.f11663e
            java.lang.String r11 = r11.mo10559c(r15)
            java.lang.String r15 = "Evaluating filter. audience, filter, property"
            r5.mo10595a(r15, r6, r10, r11)
            com.google.android.gms.internal.measurement.W r5 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10580F()
            com.google.android.gms.internal.measurement.U r6 = r49.mo10453n()
            java.lang.String r6 = r6.mo10555a((com.google.android.gms.internal.measurement.C3899tc) r2)
            r10 = r46
            r5.mo10593a(r10, r6)
            goto L_0x08f8
        L_0x08f2:
            r20 = r10
            r36 = r11
            r10 = r46
        L_0x08f8:
            java.lang.Integer r5 = r2.f11662d
            if (r5 == 0) goto L_0x0a69
            int r5 = r5.intValue()
            r6 = 256(0x100, float:3.59E-43)
            if (r5 <= r6) goto L_0x0906
            goto L_0x0a69
        L_0x0906:
            java.lang.Integer r5 = r2.f11662d
            int r5 = r5.intValue()
            boolean r5 = r13.get(r5)
            if (r5 == 0) goto L_0x0935
            com.google.android.gms.internal.measurement.W r5 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10580F()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r2 = r2.f11662d
            java.lang.String r15 = "Property filter already evaluated true. audience ID, filter ID"
            r5.mo10594a(r15, r11, r2)
            r15 = r50
            r46 = r10
            r5 = r16
            r2 = r18
            r6 = r19
            r10 = r20
            r11 = r36
            goto L_0x089c
        L_0x0935:
            com.google.android.gms.internal.measurement.rc r5 = r2.f11664f
            if (r5 != 0) goto L_0x0955
            com.google.android.gms.internal.measurement.W r5 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10576B()
            com.google.android.gms.internal.measurement.U r11 = r49.mo10453n()
            java.lang.String r15 = r4.f11090e
            java.lang.String r11 = r11.mo10559c(r15)
            java.lang.String r15 = "Missing property filter. property"
            r5.mo10593a(r15, r11)
        L_0x0950:
            r43 = r14
        L_0x0952:
            r5 = 0
            goto L_0x0a22
        L_0x0955:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            java.lang.Boolean r15 = r5.f11635f
            boolean r11 = r11.equals(r15)
            java.lang.Long r15 = r4.f11092g
            if (r15 == 0) goto L_0x098f
            com.google.android.gms.internal.measurement.sc r6 = r5.f11634e
            if (r6 != 0) goto L_0x097d
            com.google.android.gms.internal.measurement.W r5 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10576B()
            com.google.android.gms.internal.measurement.U r6 = r49.mo10453n()
            java.lang.String r11 = r4.f11090e
            java.lang.String r6 = r6.mo10559c(r11)
            java.lang.String r11 = "No number filter for long property. property"
            r5.mo10593a(r11, r6)
            goto L_0x0950
        L_0x097d:
            r43 = r14
            long r14 = r15.longValue()
            com.google.android.gms.internal.measurement.sc r5 = r5.f11634e
            java.lang.Boolean r5 = r8.m15678a((long) r14, (com.google.android.gms.internal.measurement.C3895sc) r5)
        L_0x0989:
            java.lang.Boolean r5 = m15679a((java.lang.Boolean) r5, (boolean) r11)
            goto L_0x0a22
        L_0x098f:
            r43 = r14
            java.lang.Double r6 = r4.f11094i
            if (r6 == 0) goto L_0x09b9
            com.google.android.gms.internal.measurement.sc r14 = r5.f11634e
            if (r14 != 0) goto L_0x09ae
            com.google.android.gms.internal.measurement.W r5 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10576B()
            com.google.android.gms.internal.measurement.U r6 = r49.mo10453n()
            java.lang.String r11 = r4.f11090e
            java.lang.String r6 = r6.mo10559c(r11)
            java.lang.String r11 = "No number filter for double property. property"
            goto L_0x0a1d
        L_0x09ae:
            double r14 = r6.doubleValue()
            com.google.android.gms.internal.measurement.sc r5 = r5.f11634e
            java.lang.Boolean r5 = r8.m15677a((double) r14, (com.google.android.gms.internal.measurement.C3895sc) r5)
            goto L_0x0989
        L_0x09b9:
            java.lang.String r6 = r4.f11091f
            if (r6 == 0) goto L_0x0a09
            com.google.android.gms.internal.measurement.uc r14 = r5.f11633d
            if (r14 != 0) goto L_0x0a04
            com.google.android.gms.internal.measurement.sc r14 = r5.f11634e
            if (r14 != 0) goto L_0x09da
            com.google.android.gms.internal.measurement.W r5 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10576B()
            com.google.android.gms.internal.measurement.U r6 = r49.mo10453n()
            java.lang.String r11 = r4.f11090e
            java.lang.String r6 = r6.mo10559c(r11)
            java.lang.String r11 = "No string or number filter defined. property"
            goto L_0x0a1d
        L_0x09da:
            boolean r6 = com.google.android.gms.internal.measurement.C3871mc.m15532i(r6)
            if (r6 == 0) goto L_0x09e9
            java.lang.String r6 = r4.f11091f
            com.google.android.gms.internal.measurement.sc r5 = r5.f11634e
            java.lang.Boolean r5 = r8.m15681a((java.lang.String) r6, (com.google.android.gms.internal.measurement.C3895sc) r5)
            goto L_0x0989
        L_0x09e9:
            com.google.android.gms.internal.measurement.W r5 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10576B()
            com.google.android.gms.internal.measurement.U r6 = r49.mo10453n()
            java.lang.String r11 = r4.f11090e
            java.lang.String r6 = r6.mo10559c(r11)
            java.lang.String r11 = r4.f11091f
            java.lang.String r14 = "Invalid user property value for Numeric number filter. property, value"
            r5.mo10594a(r14, r6, r11)
            goto L_0x0952
        L_0x0a04:
            java.lang.Boolean r5 = r8.m15682a((java.lang.String) r6, (com.google.android.gms.internal.measurement.C3903uc) r14)
            goto L_0x0989
        L_0x0a09:
            com.google.android.gms.internal.measurement.W r5 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10576B()
            com.google.android.gms.internal.measurement.U r6 = r49.mo10453n()
            java.lang.String r11 = r4.f11090e
            java.lang.String r6 = r6.mo10559c(r11)
            java.lang.String r11 = "User property has no value, property"
        L_0x0a1d:
            r5.mo10593a(r11, r6)
            goto L_0x0952
        L_0x0a22:
            com.google.android.gms.internal.measurement.W r6 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r6 = r6.mo10580F()
            if (r5 != 0) goto L_0x0a2f
            r11 = r17
            goto L_0x0a30
        L_0x0a2f:
            r11 = r5
        L_0x0a30:
            java.lang.String r14 = "Property filter result"
            r6.mo10593a(r14, r11)
            if (r5 != 0) goto L_0x0a50
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r9.add(r2)
        L_0x0a3e:
            r15 = r50
            r46 = r10
            r5 = r16
            r2 = r18
            r6 = r19
            r10 = r20
            r11 = r36
            r14 = r43
            goto L_0x089c
        L_0x0a50:
            java.lang.Integer r6 = r2.f11662d
            int r6 = r6.intValue()
            r0.set(r6)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0a3e
            java.lang.Integer r2 = r2.f11662d
            int r2 = r2.intValue()
            r13.set(r2)
            goto L_0x0a3e
        L_0x0a69:
            r43 = r14
            com.google.android.gms.internal.measurement.W r0 = r49.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10576B()
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r50)
            java.lang.Integer r2 = r2.f11662d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r6 = "Invalid property filter ID. appId, id"
            r0.mo10594a(r6, r5, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r9.add(r0)
            r15 = r50
            r0 = r51
            r44 = r1
            r46 = r10
            r48 = r12
            r5 = r16
            r2 = r18
            r6 = r19
            goto L_0x0aa6
        L_0x0a9a:
            r15 = r50
            r0 = r51
            r44 = r1
            r36 = r11
            r48 = r12
            r43 = r14
        L_0x0aa6:
            r1 = r52
            goto L_0x080e
        L_0x0aaa:
            r51 = r0
            r18 = r2
            r1 = r44
            r10 = r46
            r12 = r48
            int r3 = r3 + 1
            r15 = r50
            r1 = r52
            goto L_0x07e2
        L_0x0abc:
            r1 = r44
            r12 = r48
            int r0 = r43.size()
            com.google.android.gms.internal.measurement.yc[] r2 = new com.google.android.gms.internal.measurement.C3919yc[r0]
            java.util.Set r0 = r43.keySet()
            java.util.Iterator r3 = r0.iterator()
            r0 = 0
        L_0x0acf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0bc9
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = r9.contains(r5)
            if (r5 != 0) goto L_0x0bc5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r12.get(r5)
            com.google.android.gms.internal.measurement.yc r5 = (com.google.android.gms.internal.measurement.C3919yc) r5
            if (r5 != 0) goto L_0x0afa
            com.google.android.gms.internal.measurement.yc r5 = new com.google.android.gms.internal.measurement.yc
            r5.<init>()
        L_0x0afa:
            int r6 = r0 + 1
            r2[r0] = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r5.f11728d = r0
            com.google.android.gms.internal.measurement.Dc r0 = new com.google.android.gms.internal.measurement.Dc
            r0.<init>()
            r5.f11729e = r0
            com.google.android.gms.internal.measurement.Dc r0 = r5.f11729e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r10 = r43
            java.lang.Object r7 = r10.get(r7)
            java.util.BitSet r7 = (java.util.BitSet) r7
            long[] r7 = com.google.android.gms.internal.measurement.C3871mc.m15521a((java.util.BitSet) r7)
            r0.f11076d = r7
            com.google.android.gms.internal.measurement.Dc r0 = r5.f11729e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r1.get(r7)
            java.util.BitSet r7 = (java.util.BitSet) r7
            long[] r7 = com.google.android.gms.internal.measurement.C3871mc.m15521a((java.util.BitSet) r7)
            r0.f11075c = r7
            com.google.android.gms.internal.measurement.z r7 = r49.mo10656t()
            com.google.android.gms.internal.measurement.Dc r0 = r5.f11729e
            r7.mo10685v()
            r7.mo10451d()
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r50)
            com.google.android.gms.common.internal.C2061y.m9067a(r0)
            int r5 = r0.mo10758d()     // Catch:{ IOException -> 0x0baa }
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0baa }
            int r11 = r5.length     // Catch:{ IOException -> 0x0baa }
            r13 = 0
            com.google.android.gms.internal.measurement.b r11 = com.google.android.gms.internal.measurement.C3824b.m15344a(r5, r13, r11)     // Catch:{ IOException -> 0x0ba6 }
            r0.mo10405a((com.google.android.gms.internal.measurement.C3824b) r11)     // Catch:{ IOException -> 0x0ba6 }
            r11.mo10662a()     // Catch:{ IOException -> 0x0ba6 }
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r11 = "app_id"
            r14 = r50
            r0.put(r11, r14)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r11 = "audience_id"
            r0.put(r11, r4)
            java.lang.String r4 = "current_results"
            r0.put(r4, r5)
            android.database.sqlite.SQLiteDatabase r4 = r7.mo11051A()     // Catch:{ SQLiteException -> 0x0b95 }
            java.lang.String r5 = "audience_filter_values"
            r11 = 5
            r15 = 0
            long r4 = r4.insertWithOnConflict(r5, r15, r0, r11)     // Catch:{ SQLiteException -> 0x0b93 }
            r16 = -1
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0bc0
            com.google.android.gms.internal.measurement.W r0 = r7.mo10385b()     // Catch:{ SQLiteException -> 0x0b93 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ SQLiteException -> 0x0b93 }
            java.lang.String r4 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r50)     // Catch:{ SQLiteException -> 0x0b93 }
            r0.mo10593a(r4, r5)     // Catch:{ SQLiteException -> 0x0b93 }
            goto L_0x0bc0
        L_0x0b93:
            r0 = move-exception
            goto L_0x0b97
        L_0x0b95:
            r0 = move-exception
            r15 = 0
        L_0x0b97:
            com.google.android.gms.internal.measurement.W r4 = r7.mo10385b()
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10585y()
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r50)
            java.lang.String r7 = "Error storing filter results. appId"
            goto L_0x0bbd
        L_0x0ba6:
            r0 = move-exception
            r14 = r50
            goto L_0x0bae
        L_0x0baa:
            r0 = move-exception
            r14 = r50
            r13 = 0
        L_0x0bae:
            r15 = 0
            com.google.android.gms.internal.measurement.W r4 = r7.mo10385b()
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10585y()
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r50)
            java.lang.String r7 = "Configuration loss. Failed to serialize filter results. appId"
        L_0x0bbd:
            r4.mo10594a(r7, r5, r0)
        L_0x0bc0:
            r0 = r6
            r43 = r10
            goto L_0x0acf
        L_0x0bc5:
            r14 = r50
            goto L_0x0acf
        L_0x0bc9:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            com.google.android.gms.internal.measurement.yc[] r0 = (com.google.android.gms.internal.measurement.C3919yc[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3896t.mo10963a(java.lang.String, com.google.android.gms.internal.measurement.zc[], com.google.android.gms.internal.measurement.Ec[]):com.google.android.gms.internal.measurement.yc[]");
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo10657w() {
        return false;
    }
}
