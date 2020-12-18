package android.support.p007v4.app;

import android.support.p007v4.app.C0339l;
import android.support.p007v4.app.C0350r;
import android.support.p007v4.app.C0360y;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p013b.p018b.p028h.p039h.C1086h;

/* renamed from: android.support.v4.app.d */
final class C0321d extends C0270D implements C0350r.C0351a, C0360y.C0367g {

    /* renamed from: a */
    final C0360y f1345a;

    /* renamed from: b */
    ArrayList<C0322a> f1346b = new ArrayList<>();

    /* renamed from: c */
    int f1347c;

    /* renamed from: d */
    int f1348d;

    /* renamed from: e */
    int f1349e;

    /* renamed from: f */
    int f1350f;

    /* renamed from: g */
    int f1351g;

    /* renamed from: h */
    int f1352h;

    /* renamed from: i */
    boolean f1353i;

    /* renamed from: j */
    boolean f1354j = true;

    /* renamed from: k */
    String f1355k;

    /* renamed from: l */
    boolean f1356l;

    /* renamed from: m */
    int f1357m = -1;

    /* renamed from: n */
    int f1358n;

    /* renamed from: o */
    CharSequence f1359o;

    /* renamed from: p */
    int f1360p;

    /* renamed from: q */
    CharSequence f1361q;

    /* renamed from: r */
    ArrayList<String> f1362r;

    /* renamed from: s */
    ArrayList<String> f1363s;

    /* renamed from: t */
    boolean f1364t = false;

    /* renamed from: u */
    ArrayList<Runnable> f1365u;

    /* renamed from: android.support.v4.app.d$a */
    static final class C0322a {

        /* renamed from: a */
        int f1366a;

        /* renamed from: b */
        C0339l f1367b;

        /* renamed from: c */
        int f1368c;

        /* renamed from: d */
        int f1369d;

        /* renamed from: e */
        int f1370e;

        /* renamed from: f */
        int f1371f;

        C0322a() {
        }

        C0322a(int i, C0339l lVar) {
            this.f1366a = i;
            this.f1367b = lVar;
        }
    }

    public C0321d(C0360y yVar) {
        this.f1345a = yVar;
    }

    /* renamed from: a */
    private void m1421a(int i, C0339l lVar, String str, int i2) {
        Class<?> cls = lVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        lVar.f1435t = this.f1345a;
        if (str != null) {
            String str2 = lVar.f1397B;
            if (str2 == null || str.equals(str2)) {
                lVar.f1397B = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + lVar + ": was " + lVar.f1397B + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = lVar.f1441z;
                if (i3 == 0 || i3 == i) {
                    lVar.f1441z = i;
                    lVar.f1396A = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + lVar + ": was " + lVar.f1441z + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + lVar + " with tag " + str + " to container view with no id");
            }
        }
        mo1257a(new C0322a(i2, lVar));
    }

    /* renamed from: b */
    private static boolean m1422b(C0322a aVar) {
        C0339l lVar = aVar.f1367b;
        return lVar != null && lVar.f1428m && lVar.f1406K != null && !lVar.f1399D && !lVar.f1398C && lVar.mo1320G();
    }

    /* renamed from: a */
    public int mo1122a() {
        return mo1254a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1254a(boolean z) {
        if (!this.f1356l) {
            if (C0360y.f1498a) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C1086h("FragmentManager"));
                mo1259a("  ", (FileDescriptor) null, printWriter, (String[]) null);
                printWriter.close();
            }
            this.f1356l = true;
            this.f1357m = this.f1353i ? this.f1345a.mo1548b(this) : -1;
            this.f1345a.mo1542a((C0360y.C0367g) this, z);
            return this.f1357m;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: a */
    public C0270D mo1123a(int i, C0339l lVar) {
        mo1263b(i, lVar, (String) null);
        return this;
    }

    /* renamed from: a */
    public C0270D mo1124a(int i, C0339l lVar, String str) {
        m1421a(i, lVar, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0270D mo1125a(C0339l lVar) {
        mo1257a(new C0322a(7, lVar));
        return this;
    }

    /* renamed from: a */
    public C0270D mo1126a(C0339l lVar, String str) {
        m1421a(0, lVar, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0270D mo1127a(String str) {
        if (this.f1354j) {
            this.f1353i = true;
            this.f1355k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0339l mo1255a(ArrayList<C0339l> arrayList, C0339l lVar) {
        ArrayList<C0339l> arrayList2 = arrayList;
        C0339l lVar2 = lVar;
        int i = 0;
        while (i < this.f1346b.size()) {
            C0322a aVar = this.f1346b.get(i);
            int i2 = aVar.f1366a;
            if (i2 != 1) {
                if (i2 == 2) {
                    C0339l lVar3 = aVar.f1367b;
                    int i3 = lVar3.f1396A;
                    C0339l lVar4 = lVar2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C0339l lVar5 = arrayList2.get(size);
                        if (lVar5.f1396A == i3) {
                            if (lVar5 == lVar3) {
                                z = true;
                            } else {
                                if (lVar5 == lVar4) {
                                    this.f1346b.add(i4, new C0322a(9, lVar5));
                                    i4++;
                                    lVar4 = null;
                                }
                                C0322a aVar2 = new C0322a(3, lVar5);
                                aVar2.f1368c = aVar.f1368c;
                                aVar2.f1370e = aVar.f1370e;
                                aVar2.f1369d = aVar.f1369d;
                                aVar2.f1371f = aVar.f1371f;
                                this.f1346b.add(i4, aVar2);
                                arrayList2.remove(lVar5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f1346b.remove(i4);
                        i4--;
                    } else {
                        aVar.f1366a = 1;
                        arrayList2.add(lVar3);
                    }
                    i = i4;
                    lVar2 = lVar4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f1367b);
                    C0339l lVar6 = aVar.f1367b;
                    if (lVar6 == lVar2) {
                        this.f1346b.add(i, new C0322a(9, lVar6));
                        i++;
                        lVar2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f1346b.add(i, new C0322a(9, lVar2));
                        i++;
                        lVar2 = aVar.f1367b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f1367b);
            i++;
        }
        return lVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1256a(int i) {
        if (this.f1353i) {
            if (C0360y.f1498a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1346b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0322a aVar = this.f1346b.get(i2);
                C0339l lVar = aVar.f1367b;
                if (lVar != null) {
                    lVar.f1434s += i;
                    if (C0360y.f1498a) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1367b + " to " + aVar.f1367b.f1434s);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1257a(C0322a aVar) {
        this.f1346b.add(aVar);
        aVar.f1368c = this.f1347c;
        aVar.f1369d = this.f1348d;
        aVar.f1370e = this.f1349e;
        aVar.f1371f = this.f1350f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1258a(C0339l.C0342c cVar) {
        for (int i = 0; i < this.f1346b.size(); i++) {
            C0322a aVar = this.f1346b.get(i);
            if (m1422b(aVar)) {
                aVar.f1367b.mo1355a(cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo1259a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo1260a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo1260a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1355k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1357m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1356l);
            if (this.f1351g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1351g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1352h));
            }
            if (!(this.f1347c == 0 && this.f1348d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1347c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1348d));
            }
            if (!(this.f1349e == 0 && this.f1350f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1349e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1350f));
            }
            if (!(this.f1358n == 0 && this.f1359o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1358n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1359o);
            }
            if (!(this.f1360p == 0 && this.f1361q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1360p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1361q);
            }
        }
        if (!this.f1346b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            str + "    ";
            int size = this.f1346b.size();
            for (int i = 0; i < size; i++) {
                C0322a aVar = this.f1346b.get(i);
                switch (aVar.f1366a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f1366a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1367b);
                if (z) {
                    if (!(aVar.f1368c == 0 && aVar.f1369d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1368c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1369d));
                    }
                    if (aVar.f1370e != 0 || aVar.f1371f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1370e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1371f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1261a(ArrayList<C0321d> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1346b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0339l lVar = this.f1346b.get(i4).f1367b;
            int i5 = lVar != null ? lVar.f1396A : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0321d dVar = arrayList.get(i6);
                    int size2 = dVar.f1346b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0339l lVar2 = dVar.f1346b.get(i7).f1367b;
                        if ((lVar2 != null ? lVar2.f1396A : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1262a(ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0360y.f1498a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f1353i) {
            return true;
        }
        this.f1345a.mo1534a(this);
        return true;
    }

    /* renamed from: b */
    public int mo1128b() {
        return mo1254a(true);
    }

    /* renamed from: b */
    public C0270D mo1263b(int i, C0339l lVar, String str) {
        if (i != 0) {
            m1421a(i, lVar, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: b */
    public C0270D mo1129b(C0339l lVar) {
        mo1257a(new C0322a(6, lVar));
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0339l mo1264b(ArrayList<C0339l> arrayList, C0339l lVar) {
        for (int i = 0; i < this.f1346b.size(); i++) {
            C0322a aVar = this.f1346b.get(i);
            int i2 = aVar.f1366a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            lVar = null;
                            break;
                        case 9:
                            lVar = aVar.f1367b;
                            break;
                    }
                }
                arrayList.add(aVar.f1367b);
            }
            arrayList.remove(aVar.f1367b);
        }
        return lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1265b(boolean z) {
        for (int size = this.f1346b.size() - 1; size >= 0; size--) {
            C0322a aVar = this.f1346b.get(size);
            C0339l lVar = aVar.f1367b;
            if (lVar != null) {
                lVar.mo1342a(C0360y.m1736d(this.f1351g), this.f1352h);
            }
            switch (aVar.f1366a) {
                case 1:
                    lVar.mo1366b(aVar.f1371f);
                    this.f1345a.mo1579k(lVar);
                    break;
                case 3:
                    lVar.mo1366b(aVar.f1370e);
                    this.f1345a.mo1540a(lVar, false);
                    break;
                case 4:
                    lVar.mo1366b(aVar.f1370e);
                    this.f1345a.mo1587o(lVar);
                    break;
                case 5:
                    lVar.mo1366b(aVar.f1371f);
                    this.f1345a.mo1565e(lVar);
                    break;
                case 6:
                    lVar.mo1366b(aVar.f1370e);
                    this.f1345a.mo1535a(lVar);
                    break;
                case 7:
                    lVar.mo1366b(aVar.f1371f);
                    this.f1345a.mo1558c(lVar);
                    break;
                case 8:
                    this.f1345a.mo1585n((C0339l) null);
                    break;
                case 9:
                    this.f1345a.mo1585n(lVar);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1366a);
            }
            if (!(this.f1364t || aVar.f1366a == 3 || lVar == null)) {
                this.f1345a.mo1572h(lVar);
            }
        }
        if (!this.f1364t && z) {
            C0360y yVar = this.f1345a;
            yVar.mo1530a(yVar.f1525r, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1266b(int i) {
        int size = this.f1346b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0339l lVar = this.f1346b.get(i2).f1367b;
            int i3 = lVar != null ? lVar.f1396A : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public C0270D mo1130c(C0339l lVar) {
        mo1257a(new C0322a(3, lVar));
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1267c() {
        int size = this.f1346b.size();
        for (int i = 0; i < size; i++) {
            C0322a aVar = this.f1346b.get(i);
            C0339l lVar = aVar.f1367b;
            if (lVar != null) {
                lVar.mo1342a(this.f1351g, this.f1352h);
            }
            switch (aVar.f1366a) {
                case 1:
                    lVar.mo1366b(aVar.f1368c);
                    this.f1345a.mo1540a(lVar, false);
                    break;
                case 3:
                    lVar.mo1366b(aVar.f1369d);
                    this.f1345a.mo1579k(lVar);
                    break;
                case 4:
                    lVar.mo1366b(aVar.f1369d);
                    this.f1345a.mo1565e(lVar);
                    break;
                case 5:
                    lVar.mo1366b(aVar.f1368c);
                    this.f1345a.mo1587o(lVar);
                    break;
                case 6:
                    lVar.mo1366b(aVar.f1369d);
                    this.f1345a.mo1558c(lVar);
                    break;
                case 7:
                    lVar.mo1366b(aVar.f1368c);
                    this.f1345a.mo1535a(lVar);
                    break;
                case 8:
                    this.f1345a.mo1585n(lVar);
                    break;
                case 9:
                    this.f1345a.mo1585n((C0339l) null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1366a);
            }
            if (!(this.f1364t || aVar.f1366a == 1 || lVar == null)) {
                this.f1345a.mo1572h(lVar);
            }
        }
        if (!this.f1364t) {
            C0360y yVar = this.f1345a;
            yVar.mo1530a(yVar.f1525r, true);
        }
    }

    /* renamed from: d */
    public String mo1268d() {
        return this.f1355k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo1269e() {
        for (int i = 0; i < this.f1346b.size(); i++) {
            if (m1422b(this.f1346b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo1270f() {
        ArrayList<Runnable> arrayList = this.f1365u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1365u.get(i).run();
            }
            this.f1365u = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1357m >= 0) {
            sb.append(" #");
            sb.append(this.f1357m);
        }
        if (this.f1355k != null) {
            sb.append(" ");
            sb.append(this.f1355k);
        }
        sb.append("}");
        return sb.toString();
    }
}
