package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.common.util.C2082d;
import com.google.android.gms.common.util.C2095q;

@TargetApi(17)
/* renamed from: com.google.android.gms.internal.ads.se */
public class C3460se extends C3517ue {
    /* renamed from: a */
    public final Drawable mo9713a(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    /* renamed from: a */
    public final String mo9716a(Context context) {
        C3233kf a = C3233kf.m12878a();
        if (TextUtils.isEmpty(a.f9688b)) {
            a.f9688b = (String) (C2082d.m9111a() ? C3171if.m12583a(context, new C3261lf(a, context)) : C3171if.m12583a(context, new C3290mf(a, C2064k.getRemoteContext(context), context)));
        }
        return a.f9688b;
    }

    /* renamed from: a */
    public final boolean mo9722a(Context context, WebSettings webSettings) {
        super.mo9722a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    /* renamed from: b */
    public final void mo9726b(Context context) {
        C3233kf a = C3233kf.m12878a();
        C2857Yd.m11615f("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a.f9688b)) {
            Context remoteContext = C2064k.getRemoteContext(context);
            if (C2082d.m9111a() || remoteContext == null) {
                SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    putString.apply();
                } else {
                    C2095q.m9176a(context, putString, "admob_user_agent");
                }
            }
            a.f9688b = defaultUserAgent;
        }
        C2857Yd.m11615f("User agent is updated.");
    }
}
