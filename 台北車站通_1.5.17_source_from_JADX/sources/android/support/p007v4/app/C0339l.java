package android.support.p007v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0026d;
import android.arch.lifecycle.C0030f;
import android.arch.lifecycle.C0032h;
import android.arch.lifecycle.C0042p;
import android.arch.lifecycle.C0043q;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p007v4.view.C0467g;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import p013b.p018b.p028h.p039h.C1085g;
import p013b.p018b.p028h.p039h.C1101r;

/* renamed from: android.support.v4.app.l */
public class C0339l implements ComponentCallbacks, View.OnCreateContextMenuListener, C0030f, C0043q {

    /* renamed from: a */
    private static final C1101r<String, Class<?>> f1394a = new C1101r<>();

    /* renamed from: b */
    static final Object f1395b = new Object();

    /* renamed from: A */
    int f1396A;

    /* renamed from: B */
    String f1397B;

    /* renamed from: C */
    boolean f1398C;

    /* renamed from: D */
    boolean f1399D;

    /* renamed from: E */
    boolean f1400E;

    /* renamed from: F */
    boolean f1401F;

    /* renamed from: G */
    boolean f1402G;

    /* renamed from: H */
    boolean f1403H = true;

    /* renamed from: I */
    boolean f1404I;

    /* renamed from: J */
    ViewGroup f1405J;

    /* renamed from: K */
    View f1406K;

    /* renamed from: L */
    View f1407L;

    /* renamed from: M */
    boolean f1408M;

    /* renamed from: N */
    boolean f1409N = true;

    /* renamed from: O */
    LoaderManagerImpl f1410O;

    /* renamed from: P */
    C0340a f1411P;

    /* renamed from: Q */
    boolean f1412Q;

    /* renamed from: R */
    boolean f1413R;

    /* renamed from: S */
    float f1414S;

    /* renamed from: T */
    LayoutInflater f1415T;

    /* renamed from: U */
    boolean f1416U;

    /* renamed from: V */
    C0032h f1417V = new C0032h(this);

    /* renamed from: c */
    int f1418c = 0;

    /* renamed from: d */
    Bundle f1419d;

    /* renamed from: e */
    SparseArray<Parcelable> f1420e;

    /* renamed from: f */
    Boolean f1421f;

    /* renamed from: g */
    int f1422g = -1;

    /* renamed from: h */
    String f1423h;

    /* renamed from: i */
    Bundle f1424i;

    /* renamed from: j */
    C0339l f1425j;

    /* renamed from: k */
    int f1426k = -1;

    /* renamed from: l */
    int f1427l;

    /* renamed from: m */
    boolean f1428m;

    /* renamed from: n */
    boolean f1429n;

    /* renamed from: o */
    boolean f1430o;

    /* renamed from: p */
    boolean f1431p;

    /* renamed from: q */
    boolean f1432q;

    /* renamed from: r */
    boolean f1433r;

    /* renamed from: s */
    int f1434s;

    /* renamed from: t */
    C0360y f1435t;

    /* renamed from: u */
    C0349q f1436u;

    /* renamed from: v */
    C0360y f1437v;

    /* renamed from: w */
    C0370z f1438w;

    /* renamed from: x */
    C0042p f1439x;

    /* renamed from: y */
    C0339l f1440y;

    /* renamed from: z */
    int f1441z;

    /* renamed from: android.support.v4.app.l$a */
    static class C0340a {

        /* renamed from: a */
        View f1442a;

        /* renamed from: b */
        Animator f1443b;

        /* renamed from: c */
        int f1444c;

        /* renamed from: d */
        int f1445d;

        /* renamed from: e */
        int f1446e;

        /* renamed from: f */
        int f1447f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Object f1448g = null;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Object f1449h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Object f1450i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Object f1451j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Object f1452k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Object f1453l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Boolean f1454m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Boolean f1455n;

        /* renamed from: o */
        C0325ea f1456o;

        /* renamed from: p */
        C0325ea f1457p;

        /* renamed from: q */
        boolean f1458q;

        /* renamed from: r */
        C0342c f1459r;

        /* renamed from: s */
        boolean f1460s;

        C0340a() {
            Object obj = C0339l.f1395b;
            this.f1449h = obj;
            this.f1450i = null;
            this.f1451j = obj;
            this.f1452k = null;
            this.f1453l = obj;
            this.f1456o = null;
            this.f1457p = null;
        }
    }

    /* renamed from: android.support.v4.app.l$b */
    public static class C0341b extends RuntimeException {
        public C0341b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: android.support.v4.app.l$c */
    interface C0342c {
        /* renamed from: a */
        void mo1423a();

        /* renamed from: b */
        void mo1424b();
    }

    /* renamed from: a */
    public static C0339l m1487a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f1394a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1394a.put(str, cls);
            }
            C0339l lVar = (C0339l) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(lVar.getClass().getClassLoader());
                lVar.mo1405m(bundle);
            }
            return lVar;
        } catch (ClassNotFoundException e) {
            throw new C0341b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0341b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new C0341b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0341b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0341b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    /* renamed from: a */
    static boolean m1489a(Context context, String str) {
        try {
            Class<?> cls = f1394a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1394a.put(str, cls);
            }
            return C0339l.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ea */
    public void mo1304ea() {
        C0340a aVar = this.f1411P;
        C0342c cVar = null;
        if (aVar != null) {
            aVar.f1458q = false;
            C0342c cVar2 = aVar.f1459r;
            aVar.f1459r = null;
            cVar = cVar2;
        }
        if (cVar != null) {
            cVar.mo1424b();
        }
    }

    /* renamed from: fa */
    private C0340a mo6389fa() {
        if (this.f1411P == null) {
            this.f1411P = new C0340a();
        }
        return this.f1411P;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo1314A() {
        this.f1422g = -1;
        this.f1423h = null;
        this.f1428m = false;
        this.f1429n = false;
        this.f1430o = false;
        this.f1431p = false;
        this.f1432q = false;
        this.f1434s = 0;
        this.f1435t = null;
        this.f1437v = null;
        this.f1436u = null;
        this.f1441z = 0;
        this.f1396A = 0;
        this.f1397B = null;
        this.f1398C = false;
        this.f1399D = false;
        this.f1401F = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo1315B() {
        if (this.f1436u != null) {
            this.f1437v = new C0360y();
            this.f1437v.mo1541a(this.f1436u, (C0347o) new C0338k(this), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* renamed from: C */
    public final boolean mo1316C() {
        return this.f1436u != null && this.f1428m;
    }

    /* renamed from: D */
    public final boolean mo1317D() {
        return this.f1399D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo1318E() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return false;
        }
        return aVar.f1460s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean mo1319F() {
        return this.f1434s > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo1320G() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return false;
        }
        return aVar.f1458q;
    }

    /* renamed from: H */
    public final boolean mo1321H() {
        return this.f1418c >= 5;
    }

    /* renamed from: I */
    public final boolean mo1322I() {
        C0360y yVar = this.f1435t;
        if (yVar == null) {
            return false;
        }
        return yVar.mo1501e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo1323J() {
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1597v();
        }
    }

    /* renamed from: K */
    public void mo1324K() {
        this.f1404I = true;
        C0042p pVar = this.f1439x;
        if (pVar != null && !this.f1436u.f1483e.f1531x) {
            pVar.mo70a();
        }
    }

    /* renamed from: L */
    public void mo1325L() {
    }

    /* renamed from: M */
    public void mo1293M() {
        this.f1404I = true;
    }

    /* renamed from: N */
    public void mo1294N() {
        this.f1404I = true;
    }

    /* renamed from: O */
    public void mo1326O() {
        this.f1404I = true;
    }

    /* renamed from: P */
    public void mo1327P() {
        this.f1404I = true;
    }

    /* renamed from: Q */
    public void mo1295Q() {
        this.f1404I = true;
    }

    /* renamed from: R */
    public void mo1296R() {
        this.f1404I = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public C0350r mo1328S() {
        return this.f1437v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo1329T() {
        this.f1417V.mo57b(C0026d.C0027a.ON_DESTROY);
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1576j();
        }
        this.f1418c = 0;
        this.f1404I = false;
        this.f1416U = false;
        mo1324K();
        if (this.f1404I) {
            this.f1437v = null;
            return;
        }
        throw new C0327fa("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo1330U() {
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1578k();
        }
        this.f1418c = 1;
        this.f1404I = false;
        mo1293M();
        if (this.f1404I) {
            LoaderManagerImpl loaderManagerImpl = this.f1410O;
            if (loaderManagerImpl == null) {
                this.f1433r = false;
            } else {
                loaderManagerImpl.mo1163a();
                throw null;
            }
        } else {
            throw new C0327fa("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo1331V() {
        this.f1404I = false;
        mo1294N();
        this.f1415T = null;
        if (this.f1404I) {
            C0360y yVar = this.f1437v;
            if (yVar == null) {
                return;
            }
            if (this.f1401F) {
                yVar.mo1576j();
                this.f1437v = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new C0327fa("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo1332W() {
        onLowMemory();
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1581l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo1333X() {
        this.f1417V.mo57b(C0026d.C0027a.ON_PAUSE);
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1582m();
        }
        this.f1418c = 4;
        this.f1404I = false;
        mo1326O();
        if (!this.f1404I) {
            throw new C0327fa("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo1334Y() {
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1584n();
        }
        this.f1418c = 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo1335Z() {
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1597v();
            this.f1437v.mo1593s();
        }
        this.f1418c = 5;
        this.f1404I = false;
        mo1327P();
        if (this.f1404I) {
            C0360y yVar2 = this.f1437v;
            if (yVar2 != null) {
                yVar2.mo1586o();
                this.f1437v.mo1593s();
            }
            this.f1417V.mo57b(C0026d.C0027a.ON_RESUME);
            return;
        }
        throw new C0327fa("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0339l mo1336a(String str) {
        if (str.equals(this.f1423h)) {
            return this;
        }
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            return yVar.mo1549b(str);
        }
        return null;
    }

    /* renamed from: a */
    public final C0344n mo1337a() {
        C0349q qVar = this.f1436u;
        if (qVar == null) {
            return null;
        }
        return (C0344n) qVar.mo1490b();
    }

    @Deprecated
    /* renamed from: a */
    public LayoutInflater mo1338a(Bundle bundle) {
        C0349q qVar = this.f1436u;
        if (qVar != null) {
            LayoutInflater f = qVar.mo1460f();
            mo1393h();
            C0360y yVar = this.f1437v;
            yVar.mo1594t();
            C0467g.m2173b(f, yVar);
            return f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: a */
    public View mo1339a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation mo1340a(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: a */
    public final String mo1341a(int i) {
        return mo1415t().getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1342a(int i, int i2) {
        if (this.f1411P != null || i != 0 || i2 != 0) {
            mo6389fa();
            C0340a aVar = this.f1411P;
            aVar.f1446e = i;
            aVar.f1447f = i2;
        }
    }

    /* renamed from: a */
    public void mo1343a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1344a(int i, C0339l lVar) {
        String str;
        StringBuilder sb;
        this.f1422g = i;
        if (lVar != null) {
            sb = new StringBuilder();
            sb.append(lVar.f1423h);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f1422g);
        this.f1423h = sb.toString();
    }

    /* renamed from: a */
    public void mo1345a(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1346a(Animator animator) {
        mo6389fa().f1443b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void mo1347a(Activity activity) {
        this.f1404I = true;
    }

    @Deprecated
    /* renamed from: a */
    public void mo1348a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f1404I = true;
    }

    /* renamed from: a */
    public void mo1298a(Context context) {
        this.f1404I = true;
        C0349q qVar = this.f1436u;
        Activity b = qVar == null ? null : qVar.mo1490b();
        if (b != null) {
            this.f1404I = false;
            mo1347a(b);
        }
    }

    /* renamed from: a */
    public void mo1349a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1404I = true;
        C0349q qVar = this.f1436u;
        Activity b = qVar == null ? null : qVar.mo1490b();
        if (b != null) {
            this.f1404I = false;
            mo1348a(b, attributeSet, bundle);
        }
    }

    /* renamed from: a */
    public void mo1350a(Intent intent) {
        mo1353a(intent, (Bundle) null);
    }

    /* renamed from: a */
    public void mo1351a(Intent intent, int i) {
        mo1352a(intent, i, (Bundle) null);
    }

    /* renamed from: a */
    public void mo1352a(Intent intent, int i, Bundle bundle) {
        C0349q qVar = this.f1436u;
        if (qVar != null) {
            qVar.mo1457a(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: a */
    public void mo1353a(Intent intent, Bundle bundle) {
        C0349q qVar = this.f1436u;
        if (qVar != null) {
            qVar.mo1457a(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1354a(Configuration configuration) {
        onConfigurationChanged(configuration);
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1531a(configuration);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1355a(C0342c cVar) {
        mo6389fa();
        C0342c cVar2 = this.f1411P.f1459r;
        if (cVar != cVar2) {
            if (cVar == null || cVar2 == null) {
                C0340a aVar = this.f1411P;
                if (aVar.f1458q) {
                    aVar.f1459r = cVar;
                }
                if (cVar != null) {
                    cVar.mo1423a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: a */
    public void mo1356a(Menu menu) {
    }

    /* renamed from: a */
    public void mo1357a(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1358a(View view) {
        mo6389fa().f1442a = view;
    }

    /* renamed from: a */
    public void mo1359a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo1360a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1441z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1396A));
        printWriter.print(" mTag=");
        printWriter.println(this.f1397B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1418c);
        printWriter.print(" mIndex=");
        printWriter.print(this.f1422g);
        printWriter.print(" mWho=");
        printWriter.print(this.f1423h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1434s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1428m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1429n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1430o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1431p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1398C);
        printWriter.print(" mDetached=");
        printWriter.print(this.f1399D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1403H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f1402G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1400E);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f1401F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1409N);
        if (this.f1435t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1435t);
        }
        if (this.f1436u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1436u);
        }
        if (this.f1440y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1440y);
        }
        if (this.f1424i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1424i);
        }
        if (this.f1419d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1419d);
        }
        if (this.f1420e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1420e);
        }
        if (this.f1425j != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f1425j);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1427l);
        }
        if (mo1407o() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo1407o());
        }
        if (this.f1405J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1405J);
        }
        if (this.f1406K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1406K);
        }
        if (this.f1407L != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f1406K);
        }
        if (mo1384e() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo1384e());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo1421y());
        }
        if (this.f1410O != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            LoaderManagerImpl loaderManagerImpl = this.f1410O;
            loaderManagerImpl.mo1164a(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        } else if (this.f1437v != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f1437v + ":");
            C0360y yVar = this.f1437v;
            yVar.mo1497a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public void mo1361a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo1362a(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aa */
    public void mo1363aa() {
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1597v();
            this.f1437v.mo1593s();
        }
        this.f1418c = 4;
        this.f1404I = false;
        mo1295Q();
        if (this.f1404I) {
            C0360y yVar2 = this.f1437v;
            if (yVar2 != null) {
                yVar2.mo1590p();
            }
            this.f1417V.mo57b(C0026d.C0027a.ON_START);
            return;
        }
        throw new C0327fa("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: b */
    public Animator mo1364b(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: b */
    public C0026d mo55b() {
        return this.f1417V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo1365b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1597v();
        }
        this.f1433r = true;
        return mo1339a(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1366b(int i) {
        if (this.f1411P != null || i != 0) {
            mo6389fa().f1445d = i;
        }
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        this.f1404I = true;
    }

    /* renamed from: b */
    public void mo1367b(C0339l lVar) {
    }

    /* renamed from: b */
    public void mo1368b(Menu menu) {
    }

    /* renamed from: b */
    public void mo1369b(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1370b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f1398C) {
            return false;
        }
        if (this.f1402G && this.f1403H) {
            mo1357a(menu, menuInflater);
            z = true;
        }
        C0360y yVar = this.f1437v;
        return yVar != null ? z | yVar.mo1545a(menu, menuInflater) : z;
    }

    /* renamed from: b */
    public boolean mo1371b(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ba */
    public void mo1372ba() {
        this.f1417V.mo57b(C0026d.C0027a.ON_STOP);
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1591q();
        }
        this.f1418c = 3;
        this.f1404I = false;
        mo1296R();
        if (!this.f1404I) {
            throw new C0327fa("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1373c(int i) {
        mo6389fa().f1444c = i;
    }

    /* renamed from: c */
    public void mo1301c(Bundle bundle) {
        this.f1404I = true;
        mo1401k(bundle);
        C0360y yVar = this.f1437v;
        if (yVar != null && !yVar.mo1561c(1)) {
            this.f1437v.mo1574i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1374c(Menu menu) {
        if (!this.f1398C) {
            if (this.f1402G && this.f1403H) {
                mo1356a(menu);
            }
            C0360y yVar = this.f1437v;
            if (yVar != null) {
                yVar.mo1543a(menu);
            }
        }
    }

    /* renamed from: c */
    public void mo1375c(boolean z) {
    }

    /* renamed from: c */
    public boolean mo1376c() {
        C0340a aVar = this.f1411P;
        if (aVar == null || aVar.f1455n == null) {
            return true;
        }
        return this.f1411P.f1455n.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1377c(MenuItem menuItem) {
        if (this.f1398C) {
            return false;
        }
        if (mo1362a(menuItem)) {
            return true;
        }
        C0360y yVar = this.f1437v;
        return yVar != null && yVar.mo1546a(menuItem);
    }

    /* renamed from: ca */
    public final Context mo1378ca() {
        Context i = mo1396i();
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: d */
    public LayoutInflater mo1302d(Bundle bundle) {
        return mo1338a(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1379d(boolean z) {
        mo1369b(z);
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1544a(z);
        }
    }

    /* renamed from: d */
    public boolean mo1380d() {
        C0340a aVar = this.f1411P;
        if (aVar == null || aVar.f1454m == null) {
            return true;
        }
        return this.f1411P.f1454m.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1381d(Menu menu) {
        boolean z = false;
        if (this.f1398C) {
            return false;
        }
        if (this.f1402G && this.f1403H) {
            mo1368b(menu);
            z = true;
        }
        C0360y yVar = this.f1437v;
        return yVar != null ? z | yVar.mo1556b(menu) : z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1382d(MenuItem menuItem) {
        if (this.f1398C) {
            return false;
        }
        if (this.f1402G && this.f1403H && mo1371b(menuItem)) {
            return true;
        }
        C0360y yVar = this.f1437v;
        return yVar != null && yVar.mo1557b(menuItem);
    }

    /* renamed from: da */
    public void mo1383da() {
        C0360y yVar = this.f1435t;
        if (yVar == null || yVar.f1526s == null) {
            mo6389fa().f1458q = false;
        } else if (Looper.myLooper() != this.f1435t.f1526s.mo1493e().getLooper()) {
            this.f1435t.f1526s.mo1493e().postAtFrontOfQueue(new C0337j(this));
        } else {
            mo1304ea();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo1384e() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return null;
        }
        return aVar.f1442a;
    }

    /* renamed from: e */
    public void mo1303e(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1385e(boolean z) {
        mo1375c(z);
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1555b(z);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Animator mo1387f() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return null;
        }
        return aVar.f1443b;
    }

    /* renamed from: f */
    public void mo1388f(Bundle bundle) {
        this.f1404I = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1389f(boolean z) {
        mo6389fa().f1460s = z;
    }

    /* renamed from: g */
    public final Bundle mo1390g() {
        return this.f1424i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1391g(Bundle bundle) {
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1597v();
        }
        this.f1418c = 2;
        this.f1404I = false;
        mo1300b(bundle);
        if (this.f1404I) {
            C0360y yVar2 = this.f1437v;
            if (yVar2 != null) {
                yVar2.mo1571h();
                return;
            }
            return;
        }
        throw new C0327fa("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: g */
    public void mo1392g(boolean z) {
        this.f1400E = z;
    }

    /* renamed from: h */
    public final C0350r mo1393h() {
        if (this.f1437v == null) {
            mo1315B();
            int i = this.f1418c;
            if (i >= 5) {
                this.f1437v.mo1586o();
            } else if (i >= 4) {
                this.f1437v.mo1590p();
            } else if (i >= 2) {
                this.f1437v.mo1571h();
            } else if (i >= 1) {
                this.f1437v.mo1574i();
            }
        }
        return this.f1437v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1394h(Bundle bundle) {
        C0360y yVar = this.f1437v;
        if (yVar != null) {
            yVar.mo1597v();
        }
        this.f1418c = 1;
        this.f1404I = false;
        mo1301c(bundle);
        this.f1416U = true;
        if (this.f1404I) {
            this.f1417V.mo57b(C0026d.C0027a.ON_CREATE);
            return;
        }
        throw new C0327fa("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public Context mo1396i() {
        C0349q qVar = this.f1436u;
        if (qVar == null) {
            return null;
        }
        return qVar.mo1491c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public LayoutInflater mo1397i(Bundle bundle) {
        this.f1415T = mo1302d(bundle);
        return this.f1415T;
    }

    /* renamed from: j */
    public Object mo1398j() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return null;
        }
        return aVar.f1448g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1399j(Bundle bundle) {
        Parcelable y;
        mo1303e(bundle);
        C0360y yVar = this.f1437v;
        if (yVar != null && (y = yVar.mo1600y()) != null) {
            bundle.putParcelable("android:support:fragments", y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0325ea mo1400k() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return null;
        }
        return aVar.f1456o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo1401k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.f1437v == null) {
                mo1315B();
            }
            this.f1437v.mo1533a(parcelable, this.f1438w);
            this.f1438w = null;
            this.f1437v.mo1574i();
        }
    }

    /* renamed from: l */
    public Object mo1402l() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return null;
        }
        return aVar.f1450i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo1403l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1420e;
        if (sparseArray != null) {
            this.f1407L.restoreHierarchyState(sparseArray);
            this.f1420e = null;
        }
        this.f1404I = false;
        mo1388f(bundle);
        if (!this.f1404I) {
            throw new C0327fa("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0325ea mo1404m() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return null;
        }
        return aVar.f1457p;
    }

    /* renamed from: m */
    public void mo1405m(Bundle bundle) {
        if (this.f1422g < 0 || !mo1322I()) {
            this.f1424i = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* renamed from: n */
    public final C0350r mo1406n() {
        return this.f1435t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo1407o() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1445d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1404I = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo1337a().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f1404I = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo1411p() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1446e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo1412q() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1447f;
    }

    /* renamed from: r */
    public final C0339l mo1413r() {
        return this.f1440y;
    }

    /* renamed from: s */
    public Object mo1414s() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return null;
        }
        return aVar.f1451j == f1395b ? mo1402l() : this.f1411P.f1451j;
    }

    /* renamed from: t */
    public final Resources mo1415t() {
        return mo1378ca().getResources();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C1085g.m5639a(this, sb);
        if (this.f1422g >= 0) {
            sb.append(" #");
            sb.append(this.f1422g);
        }
        if (this.f1441z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1441z));
        }
        if (this.f1397B != null) {
            sb.append(" ");
            sb.append(this.f1397B);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo1417u() {
        return this.f1400E;
    }

    /* renamed from: v */
    public Object mo1418v() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return null;
        }
        return aVar.f1449h == f1395b ? mo1398j() : this.f1411P.f1449h;
    }

    /* renamed from: w */
    public Object mo1419w() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return null;
        }
        return aVar.f1452k;
    }

    /* renamed from: x */
    public Object mo1420x() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return null;
        }
        return aVar.f1453l == f1395b ? mo1419w() : this.f1411P.f1453l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public int mo1421y() {
        C0340a aVar = this.f1411P;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1444c;
    }

    /* renamed from: z */
    public View mo1422z() {
        return this.f1406K;
    }
}
