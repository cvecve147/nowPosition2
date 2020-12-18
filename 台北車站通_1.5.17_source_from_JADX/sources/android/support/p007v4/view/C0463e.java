package android.support.p007v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.view.e */
public abstract class C0463e {

    /* renamed from: a */
    private final Context f1788a;

    /* renamed from: b */
    private C0464a f1789b;

    /* renamed from: c */
    private C0465b f1790c;

    /* renamed from: android.support.v4.view.e$a */
    public interface C0464a {
    }

    /* renamed from: android.support.v4.view.e$b */
    public interface C0465b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C0463e(Context context) {
        this.f1788a = context;
    }

    /* renamed from: a */
    public View mo1933a(MenuItem menuItem) {
        return mo1939c();
    }

    /* renamed from: a */
    public void mo1934a(C0464a aVar) {
        this.f1789b = aVar;
    }

    /* renamed from: a */
    public void mo1935a(C0465b bVar) {
        if (!(this.f1790c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1790c = bVar;
    }

    /* renamed from: a */
    public void mo1936a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public boolean mo1937a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1938b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo1939c();

    /* renamed from: d */
    public boolean mo1940d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo1941e() {
        return false;
    }

    /* renamed from: f */
    public void mo1942f() {
        this.f1790c = null;
        this.f1789b = null;
    }
}
