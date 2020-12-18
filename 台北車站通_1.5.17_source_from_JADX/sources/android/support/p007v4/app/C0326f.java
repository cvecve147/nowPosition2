package android.support.p007v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v4.app.f */
abstract class C0326f extends C0329ga {

    /* renamed from: a */
    boolean f1372a;

    C0326f() {
    }

    /* renamed from: c */
    static void m1455c(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract View mo1278a(View view, String str, Context context, AttributeSet attributeSet);

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo1278a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo1278a((View) null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f1372a && i != -1) {
            m1455c(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
