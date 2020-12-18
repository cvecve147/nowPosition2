package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.internal.C2061y;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.pv */
public final class C3392pv extends RelativeLayout {

    /* renamed from: a */
    private static final float[] f10050a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b */
    private AnimationDrawable f10051b;

    public C3392pv(Context context, C3306mv mvVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        C2061y.m9067a(mvVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f10050a, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(mvVar.mo9756bc());
        setLayoutParams(layoutParams);
        C1697X.m7700g().mo9719a((View) this, (Drawable) shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(mvVar.getText())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(mvVar.getText());
            textView.setTextColor(mvVar.mo9757cc());
            textView.setTextSize((float) mvVar.mo9758dc());
            C3390pt.m13453a();
            int a = C3432rf.m13595a(context, 4);
            C3390pt.m13453a();
            textView.setPadding(a, 0, C3432rf.m13595a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<C3420qv> ec = mvVar.mo9759ec();
        if (ec != null && ec.size() > 1) {
            this.f10051b = new AnimationDrawable();
            for (C3420qv na : ec) {
                try {
                    this.f10051b.addFrame((Drawable) C5468d.m20962z(na.mo9130na()), mvVar.mo9760fc());
                } catch (Exception e) {
                    C2227Cf.m9533b("Error while getting drawable.", e);
                }
            }
            C1697X.m7700g().mo9719a((View) imageView, (Drawable) this.f10051b);
        } else if (ec.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C5468d.m20962z(ec.get(0).mo9130na()));
            } catch (Exception e2) {
                C2227Cf.m9533b("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f10051b;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
