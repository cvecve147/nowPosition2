package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3432rf;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.overlay.n */
public final class C1782n extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private final ImageButton f5859a;

    /* renamed from: b */
    private final C1790v f5860b;

    public C1782n(Context context, C1783o oVar, C1790v vVar) {
        super(context);
        this.f5860b = vVar;
        setOnClickListener(this);
        this.f5859a = new ImageButton(context);
        this.f5859a.setImageResource(17301527);
        this.f5859a.setBackgroundColor(0);
        this.f5859a.setOnClickListener(this);
        ImageButton imageButton = this.f5859a;
        C3390pt.m13453a();
        int a = C3432rf.m13595a(context, oVar.f5861a);
        C3390pt.m13453a();
        int a2 = C3432rf.m13595a(context, 0);
        C3390pt.m13453a();
        int a3 = C3432rf.m13595a(context, oVar.f5862b);
        C3390pt.m13453a();
        imageButton.setPadding(a, a2, a3, C3432rf.m13595a(context, oVar.f5864d));
        this.f5859a.setContentDescription("Interstitial close button");
        C3390pt.m13453a();
        C3432rf.m13595a(context, oVar.f5865e);
        ImageButton imageButton2 = this.f5859a;
        C3390pt.m13453a();
        int a4 = C3432rf.m13595a(context, oVar.f5865e + oVar.f5861a + oVar.f5862b);
        C3390pt.m13453a();
        addView(imageButton2, new FrameLayout.LayoutParams(a4, C3432rf.m13595a(context, oVar.f5865e + oVar.f5864d), 17));
    }

    /* renamed from: a */
    public final void mo7020a(boolean z) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.f5859a;
            i = 8;
        } else {
            imageButton = this.f5859a;
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    public final void onClick(View view) {
        C1790v vVar = this.f5860b;
        if (vVar != null) {
            vVar.mo6991Vb();
        }
    }
}
