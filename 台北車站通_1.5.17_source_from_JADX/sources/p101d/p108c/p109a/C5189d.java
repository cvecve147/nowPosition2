package p101d.p108c.p109a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* renamed from: d.c.a.d */
class C5189d extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: a */
    protected MDRootLayout f14574a;

    /* renamed from: b */
    private DialogInterface.OnShowListener f14575b;

    C5189d(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14347a() {
        super.setOnShowListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14348a(View view) {
        super.setContentView(view);
    }

    public View findViewById(int i) {
        return this.f14574a.findViewById(i);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f14575b;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Deprecated
    public void setContentView(int i) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Deprecated
    public void setContentView(View view) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Deprecated
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f14575b = onShowListener;
    }
}
