package android.support.p007v4.app;

import android.arch.lifecycle.C0026d;
import android.arch.lifecycle.C0042p;
import android.arch.lifecycle.C0043q;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.p007v4.app.C0308b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p013b.p018b.p028h.p039h.C1102s;

/* renamed from: android.support.v4.app.n */
public class C0344n extends C0328g implements C0043q, C0308b.C0309a, C0308b.C0311c {

    /* renamed from: a */
    final Handler f1462a = new C0343m(this);

    /* renamed from: b */
    final C0348p f1463b = C0348p.m1643a((C0349q<?>) new C0345a());

    /* renamed from: c */
    C0293U f1464c;

    /* renamed from: d */
    private C0042p f1465d;

    /* renamed from: e */
    boolean f1466e;

    /* renamed from: f */
    boolean f1467f;

    /* renamed from: g */
    boolean f1468g = true;

    /* renamed from: h */
    boolean f1469h = true;

    /* renamed from: i */
    boolean f1470i;

    /* renamed from: j */
    boolean f1471j;

    /* renamed from: k */
    int f1472k;

    /* renamed from: l */
    C1102s<String> f1473l;

    /* renamed from: android.support.v4.app.n$a */
    class C0345a extends C0349q<C0344n> {
        public C0345a() {
            super(C0344n.this);
        }

        /* renamed from: a */
        public View mo1312a(int i) {
            return C0344n.this.findViewById(i);
        }

        /* renamed from: a */
        public void mo1456a(C0339l lVar) {
            C0344n.this.mo1426a(lVar);
        }

        /* renamed from: a */
        public void mo1457a(C0339l lVar, Intent intent, int i, Bundle bundle) {
            C0344n.this.mo1427a(lVar, intent, i, bundle);
        }

        /* renamed from: a */
        public void mo1458a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0344n.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo1313a() {
            Window window = C0344n.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: b */
        public boolean mo1459b(C0339l lVar) {
            return !C0344n.this.isFinishing();
        }

        /* renamed from: f */
        public LayoutInflater mo1460f() {
            return C0344n.this.getLayoutInflater().cloneInContext(C0344n.this);
        }

        /* renamed from: g */
        public int mo1461g() {
            Window window = C0344n.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        /* renamed from: h */
        public boolean mo1462h() {
            return C0344n.this.getWindow() != null;
        }

        /* renamed from: i */
        public void mo1463i() {
            C0344n.this.mo1435h();
        }
    }

    /* renamed from: android.support.v4.app.n$b */
    static final class C0346b {

        /* renamed from: a */
        Object f1475a;

        /* renamed from: b */
        C0042p f1476b;

        /* renamed from: c */
        C0370z f1477c;

        C0346b() {
        }
    }

    /* renamed from: a */
    private static boolean m1615a(C0350r rVar, C0026d.C0028b bVar) {
        boolean z = false;
        for (C0339l next : rVar.mo1500d()) {
            if (next != null) {
                if (next.mo55b().mo52a().mo54a(C0026d.C0028b.STARTED)) {
                    next.f1417V.mo56a(bVar);
                    z = true;
                }
                C0350r S = next.mo1328S();
                if (S != null) {
                    z |= m1615a(S, bVar);
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private int m1616b(C0339l lVar) {
        if (this.f1473l.mo5259e() < 65534) {
            while (this.f1473l.mo5254c(this.f1472k) >= 0) {
                this.f1472k = (this.f1472k + 1) % 65534;
            }
            int i = this.f1472k;
            this.f1473l.mo5255c(i, lVar.f1423h);
            this.f1472k = (this.f1472k + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: i */
    private void mo2622i() {
        do {
        } while (m1615a(mo1430d(), C0026d.C0028b.CREATED));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo1278a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1463b.mo1465a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void mo1426a(C0339l lVar) {
    }

    /* renamed from: a */
    public void mo1427a(C0339l lVar, Intent intent, int i, Bundle bundle) {
        this.f1373a = true;
        if (i == -1) {
            try {
                C0308b.m1390a(this, intent, -1, bundle);
            } finally {
                this.f1373a = false;
            }
        } else {
            C0326f.m1455c(i);
            C0308b.m1390a(this, intent, ((m1616b(lVar) + 1) << 16) + (i & 65535), bundle);
            this.f1373a = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1428a(boolean z) {
        if (!this.f1469h) {
            this.f1469h = true;
            this.f1470i = z;
            this.f1462a.removeMessages(1);
            mo1432e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1429a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: b */
    public C0026d mo55b() {
        return super.mo55b();
    }

    /* renamed from: b */
    public final void mo1237b(int i) {
        if (!this.f1471j && i != -1) {
            C0326f.m1455c(i);
        }
    }

    /* renamed from: d */
    public C0350r mo1430d() {
        return this.f1463b.mo1486k();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1466e);
        printWriter.print("mResumed=");
        printWriter.print(this.f1467f);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1468g);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f1469h);
        C0293U u = this.f1464c;
        if (u == null) {
            this.f1463b.mo1486k().mo1497a(str, fileDescriptor, printWriter, strArr);
        } else {
            u.mo1164a(str2, fileDescriptor, printWriter, strArr);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1432e() {
        this.f1463b.mo1481f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo1433f() {
        this.f1463b.mo1482g();
    }

    /* renamed from: g */
    public Object mo1434g() {
        return null;
    }

    @Deprecated
    /* renamed from: h */
    public void mo1435h() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f1463b.mo1487l();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String b = this.f1473l.mo5252b(i4);
            this.f1473l.mo5260e(i4);
            if (b == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0339l a = this.f1463b.mo1464a(b);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + b);
                return;
            }
            a.mo1343a(i & 65535, i2, intent);
            return;
        }
        C0308b.C0310b a2 = C0308b.m1388a();
        if (a2 == null || !a2.mo1235a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        C0350r k = this.f1463b.mo1486k();
        boolean e = k.mo1501e();
        if (e && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (e || !k.mo1503g()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1463b.mo1487l();
        this.f1463b.mo1467a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0370z zVar = null;
        this.f1463b.mo1469a((C0339l) null);
        super.onCreate(bundle);
        C0346b bVar = (C0346b) getLastNonConfigurationInstance();
        if (bVar != null) {
            this.f1465d = bVar.f1476b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0348p pVar = this.f1463b;
            if (bVar != null) {
                zVar = bVar.f1477c;
            }
            pVar.mo1468a(parcelable, zVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f1472k = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f1473l = new C1102s<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f1473l.mo5255c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f1473l == null) {
            this.f1473l = new C1102s<>();
            this.f1472k = 0;
        }
        this.f1463b.mo1474b();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f1463b.mo1472a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo1428a(false);
        C0042p pVar = this.f1465d;
        if (pVar != null && !this.f1470i) {
            pVar.mo70a();
        }
        this.f1463b.mo1478c();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1463b.mo1479d();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f1463b.mo1477b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f1463b.mo1473a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f1463b.mo1471a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f1463b.mo1487l();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f1463b.mo1470a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f1467f = false;
        if (this.f1462a.hasMessages(2)) {
            this.f1462a.removeMessages(2);
            mo1433f();
        }
        this.f1463b.mo1480e();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f1463b.mo1475b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f1462a.removeMessages(2);
        mo1433f();
        this.f1463b.mo1485j();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : mo1429a(view, menu) | this.f1463b.mo1476b(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1463b.mo1487l();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String b = this.f1473l.mo5252b(i3);
            this.f1473l.mo5260e(i3);
            if (b == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0339l a = this.f1463b.mo1464a(b);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + b);
                return;
            }
            a.mo1345a(i & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f1462a.sendEmptyMessage(2);
        this.f1467f = true;
        this.f1463b.mo1485j();
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.f1468g) {
            mo1428a(true);
        }
        Object g = mo1434g();
        C0370z m = this.f1463b.mo1488m();
        if (m == null && this.f1465d == null && g == null) {
            return null;
        }
        C0346b bVar = new C0346b();
        bVar.f1475a = g;
        bVar.f1476b = this.f1465d;
        bVar.f1477c = m;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo2622i();
        Parcelable n = this.f1463b.mo1489n();
        if (n != null) {
            bundle.putParcelable("android:support:fragments", n);
        }
        if (this.f1473l.mo5259e() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1472k);
            int[] iArr = new int[this.f1473l.mo5259e()];
            String[] strArr = new String[this.f1473l.mo5259e()];
            for (int i = 0; i < this.f1473l.mo5259e(); i++) {
                iArr[i] = this.f1473l.mo5257d(i);
                strArr[i] = this.f1473l.mo5261f(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f1468g = false;
        this.f1469h = false;
        this.f1462a.removeMessages(1);
        if (!this.f1466e) {
            this.f1466e = true;
            this.f1463b.mo1466a();
        }
        this.f1463b.mo1487l();
        this.f1463b.mo1485j();
        this.f1463b.mo1483h();
    }

    public void onStateNotSaved() {
        this.f1463b.mo1487l();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f1468g = true;
        mo2622i();
        this.f1462a.sendEmptyMessage(1);
        this.f1463b.mo1484i();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.f1373a && i != -1) {
            C0326f.m1455c(i);
        }
        super.startActivityForResult(intent, i);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
