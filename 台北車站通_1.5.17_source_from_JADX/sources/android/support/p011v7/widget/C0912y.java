package android.support.p011v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p013b.p018b.p040i.p041a.C1103a;

/* renamed from: android.support.v7.widget.y */
public class C0912y extends SeekBar {

    /* renamed from: a */
    private final C0914z f3713a;

    public C0912y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.seekBarStyle);
    }

    public C0912y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3713a = new C0914z(this);
        this.f3713a.mo4774a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3713a.mo4790b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f3713a.mo4791c();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3713a.mo4788a(canvas);
    }
}
