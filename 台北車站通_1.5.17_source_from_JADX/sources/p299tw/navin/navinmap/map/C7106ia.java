package p299tw.navin.navinmap.map;

import android.content.Context;
import java.util.HashMap;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.util.C7165g;

/* renamed from: tw.navin.navinmap.map.ia */
class C7106ia {

    /* renamed from: a */
    private int f19571a = -1;

    /* renamed from: b */
    private C7165g f19572b;

    /* renamed from: c */
    private C7107a f19573c;

    /* renamed from: d */
    private HashMap<String, C7112l.C7120h> f19574d;

    /* renamed from: e */
    private boolean f19575e = false;

    /* renamed from: tw.navin.navinmap.map.ia$a */
    interface C7107a {
        /* renamed from: a */
        void mo21078a(float f, float f2);

        /* renamed from: a */
        void mo21079a(int i, String str);
    }

    C7106ia() {
    }

    /* renamed from: a */
    private int m26756a(C7112l.C7122j jVar, C7112l.C7122j jVar2) {
        if ((jVar.f19649b.equals("ESU") && jVar2.f19649b.equals("ESU")) || (jVar.f19649b.equals("SU") && jVar2.f19649b.equals("SU"))) {
            return 1;
        }
        if ((!jVar.f19649b.equals("ESD") || !jVar2.f19649b.equals("ESD")) && (!jVar.f19649b.equals("SD") || !jVar2.f19649b.equals("SD"))) {
            return ((!jVar.f19649b.equals("E") || !jVar2.f19649b.equals("E")) && (!jVar.f19649b.equals("DE") || !jVar2.f19649b.equals("DE"))) ? 0 : 5;
        }
        return 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26757a(android.content.Context r4, int r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L_0x004b
            r2 = 2
            if (r5 == r2) goto L_0x0048
            r2 = 3
            if (r5 == r2) goto L_0x0039
            r2 = 4
            if (r5 == r2) goto L_0x002e
            r6 = 5
            if (r5 == r6) goto L_0x001f
            r6 = 99
            if (r5 == r6) goto L_0x001c
            int r6 = p267i.p268a.p269a.C6689e.txt_ind_keep_going
            java.lang.String r6 = r4.getString(r6)
        L_0x001a:
            r1 = r0
            goto L_0x0051
        L_0x001c:
            int r6 = p267i.p268a.p269a.C6689e.txt_ind_goal
            goto L_0x004d
        L_0x001f:
            int r6 = p267i.p268a.p269a.C6689e.txt_ind_elevator
            java.lang.String r6 = r4.getString(r6)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r7
            java.lang.String r6 = java.lang.String.format(r6, r2)
            goto L_0x0051
        L_0x002e:
            int r7 = p267i.p268a.p269a.C6689e.txt_ind_turn_right
            java.lang.String r7 = r4.getString(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            goto L_0x0043
        L_0x0039:
            int r7 = p267i.p268a.p269a.C6689e.txt_ind_turn_left
            java.lang.String r7 = r4.getString(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
        L_0x0043:
            java.lang.String r6 = java.lang.String.format(r7, r1)
            goto L_0x001a
        L_0x0048:
            int r6 = p267i.p268a.p269a.C6689e.txt_ind_downstairs
            goto L_0x004d
        L_0x004b:
            int r6 = p267i.p268a.p269a.C6689e.txt_ind_upstairs
        L_0x004d:
            java.lang.String r6 = r4.getString(r6)
        L_0x0051:
            tw.navin.navinmap.map.ia$a r7 = r3.f19573c
            if (r7 == 0) goto L_0x0058
            r7.mo21079a((int) r5, (java.lang.String) r6)
        L_0x0058:
            int r7 = r3.f19571a
            if (r5 == r7) goto L_0x006e
            r3.f19571a = r5
            if (r1 == 0) goto L_0x0063
            p299tw.navin.navinmap.util.C7174m.m27005a(r4)
        L_0x0063:
            boolean r4 = r3.f19575e
            if (r4 == 0) goto L_0x006e
            tw.navin.navinmap.util.g r4 = r3.f19572b
            if (r4 == 0) goto L_0x006e
            r4.mo21281a((java.lang.String) r6)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.C7106ia.m26757a(android.content.Context, int, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21164a() {
        this.f19571a = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21165a(Context context) {
        C7165g gVar = this.f19572b;
        if (gVar != null) {
            gVar.mo21279a();
        }
        this.f19572b = new C7165g();
        this.f19572b.mo21280a(context, (C7165g.C7168c) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0129, code lost:
        r25 = r7;
        r15 = r9;
        r4 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0199  */
    @android.annotation.SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21166a(android.content.Context r21, java.util.ArrayList<p299tw.navin.navinmap.map.C7112l.C7122j> r22, float r23, float r24, p299tw.navin.navinmap.map.C7112l.C7122j r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r25
            tw.navin.navinmap.map.ia$a r4 = r0.f19573c
            if (r4 == 0) goto L_0x0013
            r5 = 1117782016(0x42a00000, float:80.0)
            float r5 = r2 / r5
            r4.mo21078a((float) r2, (float) r5)
        L_0x0013:
            int r2 = r0.f19571a
            r4 = 99
            if (r2 != r4) goto L_0x001a
            return
        L_0x001a:
            int r2 = r22.size()
            r5 = 1
            int r2 = r2 - r5
            java.lang.Object r2 = r1.get(r2)
            tw.navin.navinmap.map.l$j r2 = (p299tw.navin.navinmap.map.C7112l.C7122j) r2
            r6 = 1091567616(0x41100000, float:9.0)
            int r7 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            r8 = 5
            java.lang.String r9 = ""
            r10 = 0
            if (r7 > 0) goto L_0x0079
            int r7 = r2.f19648a
            r11 = -1
            if (r7 != r11) goto L_0x0037
        L_0x0035:
            r2 = r9
            goto L_0x007b
        L_0x0037:
            if (r3 == 0) goto L_0x004c
            java.lang.String r2 = r3.f19654g
            if (r2 == 0) goto L_0x003e
            goto L_0x004a
        L_0x003e:
            java.util.HashMap<java.lang.String, tw.navin.navinmap.map.l$h> r2 = r0.f19574d
            java.lang.String r3 = r3.f19651d
            java.lang.Object r2 = r2.get(r3)
            tw.navin.navinmap.map.l$h r2 = (p299tw.navin.navinmap.map.C7112l.C7120h) r2
            java.lang.String r2 = r2.f19621c
        L_0x004a:
            r4 = r8
            goto L_0x007b
        L_0x004c:
            java.lang.String r3 = r2.f19649b
            java.lang.String r4 = "ESU"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0077
            java.lang.String r3 = r2.f19649b
            java.lang.String r4 = "SU"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0061
            goto L_0x0077
        L_0x0061:
            java.lang.String r3 = r2.f19649b
            java.lang.String r4 = "ESD"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0075
            java.lang.String r2 = r2.f19649b
            java.lang.String r3 = "SD"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0079
        L_0x0075:
            r4 = 2
            goto L_0x0035
        L_0x0077:
            r4 = r5
            goto L_0x0035
        L_0x0079:
            r2 = r9
            r4 = r10
        L_0x007b:
            if (r4 != 0) goto L_0x0199
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashMap<java.lang.String, tw.navin.navinmap.map.l$h> r11 = r0.f19574d
            java.lang.Object r12 = r1.get(r10)
            tw.navin.navinmap.map.l$j r12 = (p299tw.navin.navinmap.map.C7112l.C7122j) r12
            java.lang.String r12 = r12.f19651d
            java.lang.Object r11 = r11.get(r12)
            tw.navin.navinmap.map.l$h r11 = (p299tw.navin.navinmap.map.C7112l.C7120h) r11
            float r11 = r11.f19627i
            r14 = r4
            r4 = r10
            r13 = 0
        L_0x009c:
            int r15 = r22.size()
            int r15 = r15 - r5
            r16 = 1135869952(0x43b40000, float:360.0)
            if (r4 >= r15) goto L_0x0129
            java.lang.Object r15 = r1.get(r4)
            tw.navin.navinmap.map.l$j r15 = (p299tw.navin.navinmap.map.C7112l.C7122j) r15
            int r4 = r4 + 1
            java.lang.Object r17 = r1.get(r4)
            r10 = r17
            tw.navin.navinmap.map.l$j r10 = (p299tw.navin.navinmap.map.C7112l.C7122j) r10
            android.graphics.PointF r5 = r15.f19650c
            android.graphics.PointF r12 = r10.f19650c
            float r5 = p299tw.navin.navinmap.map.RouteHelper.m26583a((float) r11, (android.graphics.PointF) r5, (android.graphics.PointF) r12)
            float r13 = r13 + r5
            int r5 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x00dc
            int r5 = r0.m26756a(r15, r10)
            if (r5 == 0) goto L_0x00db
            if (r5 != r8) goto L_0x00d6
            java.util.HashMap<java.lang.String, tw.navin.navinmap.map.l$h> r1 = r0.f19574d
            java.lang.String r2 = r15.f19651d
            java.lang.Object r1 = r1.get(r2)
            tw.navin.navinmap.map.l$h r1 = (p299tw.navin.navinmap.map.C7112l.C7120h) r1
            java.lang.String r2 = r1.f19621c
        L_0x00d6:
            r4 = r5
            r25 = r7
            r15 = r9
            goto L_0x012d
        L_0x00db:
            r14 = r5
        L_0x00dc:
            r5 = 1103626240(0x41c80000, float:25.0)
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0129
            java.lang.Float r5 = java.lang.Float.valueOf(r13)
            r7.add(r5)
            r18 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            android.graphics.PointF r5 = r10.f19650c
            float r10 = r5.y
            android.graphics.PointF r12 = r15.f19650c
            float r15 = r12.y
            float r10 = r10 - r15
            r15 = r9
            double r8 = (double) r10
            float r5 = r5.x
            float r10 = r12.x
            float r5 = r5 - r10
            r25 = r7
            double r6 = (double) r5
            double r5 = java.lang.Math.atan2(r8, r6)
            double r5 = r5 * r18
            r7 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r5 = r5 * r7
            r7 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r5 = r5 / r7
            float r5 = (float) r5
            r6 = 0
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0118
            float r5 = r5 + r16
        L_0x0118:
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3.add(r5)
            r7 = r25
            r9 = r15
            r5 = 1
            r6 = 1091567616(0x41100000, float:9.0)
            r8 = 5
            r10 = 0
            goto L_0x009c
        L_0x0129:
            r25 = r7
            r15 = r9
            r4 = r14
        L_0x012d:
            if (r4 != 0) goto L_0x019a
            r1 = 1
        L_0x0130:
            int r5 = r3.size()
            r6 = 1
            int r5 = r5 - r6
            if (r1 >= r5) goto L_0x019a
            java.lang.Object r5 = r3.get(r1)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r6 = r1 + 1
            java.lang.Object r7 = r3.get(r6)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            float r5 = r5 - r7
            r7 = 0
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x0156
            float r5 = r5 + r16
        L_0x0156:
            r8 = 1114636288(0x42700000, float:60.0)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            java.lang.String r9 = "%.0f"
            if (r8 <= 0) goto L_0x0179
            r8 = 1125515264(0x43160000, float:150.0)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0179
            r4 = 4
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r8 = r25
            java.lang.Object r1 = r8.get(r1)
            r5 = 0
            r3[r5] = r1
        L_0x0171:
            java.lang.String r9 = java.lang.String.format(r9, r3)
            r1 = r21
            r15 = r9
            goto L_0x019c
        L_0x0179:
            r8 = r25
            r10 = 1129447424(0x43520000, float:210.0)
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0193
            r10 = 1133903872(0x43960000, float:300.0)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0193
            r4 = 3
            r5 = 1
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Object r1 = r8.get(r1)
            r10 = 0
            r3[r10] = r1
            goto L_0x0171
        L_0x0193:
            r5 = 1
            r10 = 0
            r1 = r6
            r25 = r8
            goto L_0x0130
        L_0x0199:
            r15 = r9
        L_0x019a:
            r1 = r21
        L_0x019c:
            r0.m26757a(r1, r4, r15, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.C7106ia.mo21166a(android.content.Context, java.util.ArrayList, float, float, tw.navin.navinmap.map.l$j):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21167a(HashMap<String, C7112l.C7120h> hashMap) {
        this.f19574d = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21168a(C7107a aVar) {
        this.f19573c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21169a(boolean z) {
        this.f19575e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21170b() {
        C7165g gVar = this.f19572b;
        if (gVar != null) {
            gVar.mo21279a();
            this.f19572b = null;
        }
        this.f19573c = null;
    }
}
