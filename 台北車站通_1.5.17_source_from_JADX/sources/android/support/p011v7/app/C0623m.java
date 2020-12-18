package android.support.p011v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p007v4.app.C0295W;
import android.support.p007v4.app.C0308b;
import android.support.p007v4.app.C0332ha;
import android.support.p007v4.app.C0344n;
import android.support.p011v7.widget.C0884rb;
import android.support.p011v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import p013b.p018b.p040i.p050h.C1136b;

/* renamed from: android.support.v7.app.m */
public class C0623m extends C0344n implements C0624n, C0332ha.C0333a, C0611b {

    /* renamed from: a */
    private C0625o f2344a;

    /* renamed from: b */
    private int f2345b = 0;

    /* renamed from: c */
    private Resources f2346c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3054a(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.app.C0623m.m3054a(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    public C1136b mo2498a(C1136b.C1137a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2611a(Intent intent) {
        C0295W.m1319a((Activity) this, intent);
    }

    /* renamed from: a */
    public void mo2612a(C0332ha haVar) {
        haVar.mo1286a((Activity) this);
    }

    /* renamed from: a */
    public void mo2613a(Toolbar toolbar) {
        mo2622i().mo2451a(toolbar);
    }

    /* renamed from: a */
    public void mo2499a(C1136b bVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2622i().mo2453a(view, layoutParams);
    }

    /* renamed from: b */
    public void mo2615b(C0332ha haVar) {
    }

    /* renamed from: b */
    public void mo2502b(C1136b bVar) {
    }

    /* renamed from: b */
    public boolean mo2616b(Intent intent) {
        return C0295W.m1322b((Activity) this, intent);
    }

    /* renamed from: c */
    public Intent mo1292c() {
        return C0295W.m1317a(this);
    }

    public void closeOptionsMenu() {
        C0607a j = mo2624j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (j == null || !j.mo2527e()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0607a j = mo2624j();
        if (keyCode != 82 || j == null || !j.mo2521a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return mo2622i().mo2444a(i);
    }

    public MenuInflater getMenuInflater() {
        return mo2622i().mo2639c();
    }

    public Resources getResources() {
        if (this.f2346c == null && C0884rb.m5059a()) {
            this.f2346c = new C0884rb(this, super.getResources());
        }
        Resources resources = this.f2346c;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: h */
    public void mo1435h() {
        mo2622i().mo2473f();
    }

    /* renamed from: i */
    public C0625o mo2622i() {
        if (this.f2344a == null) {
            this.f2344a = C0625o.m3072a((Activity) this, (C0624n) this);
        }
        return this.f2344a;
    }

    public void invalidateOptionsMenu() {
        mo2622i().mo2473f();
    }

    /* renamed from: j */
    public C0607a mo2624j() {
        return mo2622i().mo2641d();
    }

    @Deprecated
    /* renamed from: k */
    public void mo2625k() {
    }

    /* renamed from: l */
    public boolean mo2626l() {
        Intent c = mo1292c();
        if (c == null) {
            return false;
        }
        if (mo2616b(c)) {
            C0332ha a = C0332ha.m1462a((Context) this);
            mo2612a(a);
            mo2615b(a);
            a.mo1289a();
            try {
                C0308b.m1389a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo2611a(c);
            return true;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo2622i().mo2448a(configuration);
        if (this.f2346c != null) {
            this.f2346c.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        mo2625k();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        C0625o i2 = mo2622i();
        i2.mo2470e();
        i2.mo2449a(bundle);
        if (i2.mo2638a() && (i = this.f2345b) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f2345b, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo2622i().mo2474h();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m3054a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0607a j = mo2624j();
        if (menuItem.getItemId() != 16908332 || j == null || (j.mo2530g() & 4) == 0) {
            return false;
        }
        return mo2626l();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo2622i().mo2461b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo2622i().mo2475i();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo2622i().mo2640c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo2622i().mo2642j();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo2622i().mo2476k();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo2622i().mo2637a(charSequence);
    }

    public void openOptionsMenu() {
        C0607a j = mo2624j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (j == null || !j.mo2536m()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo2622i().mo2467c(i);
    }

    public void setContentView(View view) {
        mo2622i().mo2452a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2622i().mo2463b(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f2345b = i;
    }
}
