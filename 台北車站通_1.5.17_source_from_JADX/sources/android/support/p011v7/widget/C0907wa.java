package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p011v7.view.menu.C0661k;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0668p;
import android.support.p011v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.wa */
public class C0907wa extends C0896ua implements C0904va {

    /* renamed from: K */
    private static Method f3705K;

    /* renamed from: L */
    private C0904va f3706L;

    /* renamed from: android.support.v7.widget.wa$a */
    public static class C0908a extends C0837ha {

        /* renamed from: o */
        final int f3707o;

        /* renamed from: p */
        final int f3708p;

        /* renamed from: q */
        private C0904va f3709q;

        /* renamed from: r */
        private MenuItem f3710r;

        public C0908a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f3707o = 22;
                this.f3708p = 21;
                return;
            }
            this.f3707o = 21;
            this.f3708p = 22;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo4492a(int i, int i2, int i3, int i4, int i5) {
            return super.mo4492a(i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo4493a(MotionEvent motionEvent, int i) {
            return super.mo4493a(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f3709q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0661k kVar = (C0661k) adapter;
                C0668p pVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < kVar.getCount()) {
                    pVar = kVar.getItem(i2);
                }
                MenuItem menuItem = this.f3710r;
                if (menuItem != pVar) {
                    C0662l b = kVar.mo2841b();
                    if (menuItem != null) {
                        this.f3709q.mo2823b(b, menuItem);
                    }
                    this.f3710r = pVar;
                    if (pVar != null) {
                        this.f3709q.mo2822a(b, pVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f3707o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f3708p) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0661k) getAdapter()).mo2841b().mo2860a(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C0904va vaVar) {
            this.f3709q = vaVar;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f3705K = cls.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0907wa(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0837ha mo4738a(Context context, boolean z) {
        C0908a aVar = new C0908a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo2822a(C0662l lVar, MenuItem menuItem) {
        C0904va vaVar = this.f3706L;
        if (vaVar != null) {
            vaVar.mo2822a(lVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo4775a(C0904va vaVar) {
        this.f3706L = vaVar;
    }

    /* renamed from: a */
    public void mo4776a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f3670J.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo2823b(C0662l lVar, MenuItem menuItem) {
        C0904va vaVar = this.f3706L;
        if (vaVar != null) {
            vaVar.mo2823b(lVar, menuItem);
        }
    }

    /* renamed from: b */
    public void mo4777b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f3670J.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void mo4778c(boolean z) {
        Method method = f3705K;
        if (method != null) {
            try {
                method.invoke(this.f3670J, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
