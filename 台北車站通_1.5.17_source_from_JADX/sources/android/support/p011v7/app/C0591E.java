package android.support.p011v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p050h.C1136b;

/* renamed from: android.support.v7.app.E */
public class C0591E extends Dialog implements C0624n {

    /* renamed from: a */
    private C0625o f2237a;

    public C0591E(Context context) {
        this(context, 0);
    }

    public C0591E(Context context, int i) {
        super(context, m2900a(context, i));
        mo2497a().mo2449a((Bundle) null);
        mo2497a().mo2638a();
    }

    /* renamed from: a */
    private static int m2900a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1103a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0625o mo2497a() {
        if (this.f2237a == null) {
            this.f2237a = C0625o.m3073a((Dialog) this, (C0624n) this);
        }
        return this.f2237a;
    }

    /* renamed from: a */
    public C1136b mo2498a(C1136b.C1137a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2499a(C1136b bVar) {
    }

    /* renamed from: a */
    public boolean mo2500a(int i) {
        return mo2497a().mo2465b(i);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2497a().mo2453a(view, layoutParams);
    }

    /* renamed from: b */
    public void mo2502b(C1136b bVar) {
    }

    public <T extends View> T findViewById(int i) {
        return mo2497a().mo2444a(i);
    }

    public void invalidateOptionsMenu() {
        mo2497a().mo2473f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo2497a().mo2470e();
        super.onCreate(bundle);
        mo2497a().mo2449a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo2497a().mo2476k();
    }

    public void setContentView(int i) {
        mo2497a().mo2467c(i);
    }

    public void setContentView(View view) {
        mo2497a().mo2452a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2497a().mo2463b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo2497a().mo2637a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo2497a().mo2637a(charSequence);
    }
}
