package android.support.p011v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.p011v7.app.C0621l;
import android.support.p011v7.view.menu.C0679v;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import p013b.p018b.p040i.p041a.C1109g;

/* renamed from: android.support.v7.view.menu.m */
class C0665m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0679v.C0680a {

    /* renamed from: a */
    private C0662l f2558a;

    /* renamed from: b */
    private C0621l f2559b;

    /* renamed from: c */
    C0659j f2560c;

    /* renamed from: d */
    private C0679v.C0680a f2561d;

    public C0665m(C0662l lVar) {
        this.f2558a = lVar;
    }

    /* renamed from: a */
    public void mo2910a() {
        C0621l lVar = this.f2559b;
        if (lVar != null) {
            lVar.dismiss();
        }
    }

    /* renamed from: a */
    public void mo2911a(IBinder iBinder) {
        C0662l lVar = this.f2558a;
        C0621l.C0622a aVar = new C0621l.C0622a(lVar.mo2886e());
        this.f2560c = new C0659j(aVar.mo2605b(), C1109g.abc_list_menu_item_layout);
        this.f2560c.mo2695a((C0679v.C0680a) this);
        this.f2558a.mo2856a((C0679v) this.f2560c);
        aVar.mo2599a(this.f2560c.mo2831c(), (DialogInterface.OnClickListener) this);
        View i = lVar.mo2894i();
        if (i != null) {
            aVar.mo2598a(i);
        } else {
            aVar.mo2597a(lVar.mo2890g());
            aVar.mo2608b(lVar.mo2892h());
        }
        aVar.mo2596a((DialogInterface.OnKeyListener) this);
        this.f2559b = aVar.mo2604a();
        this.f2559b.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f2559b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2559b.show();
    }

    /* renamed from: a */
    public void mo2484a(C0662l lVar, boolean z) {
        if (z || lVar == this.f2558a) {
            mo2910a();
        }
        C0679v.C0680a aVar = this.f2561d;
        if (aVar != null) {
            aVar.mo2484a(lVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo2485a(C0662l lVar) {
        C0679v.C0680a aVar = this.f2561d;
        if (aVar != null) {
            return aVar.mo2485a(lVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2558a.mo2861a((MenuItem) (C0668p) this.f2560c.mo2831c().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f2560c.mo318a(this.f2558a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2559b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2559b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f2558a.mo2860a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f2558a.performShortcut(i, keyEvent, 0);
    }
}
