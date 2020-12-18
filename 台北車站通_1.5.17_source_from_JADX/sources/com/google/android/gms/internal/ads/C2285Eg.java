package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.Eg */
public abstract class C2285Eg extends TextureView implements C2888Zg {

    /* renamed from: a */
    protected final C2542Ng f6953a = new C2542Ng();

    /* renamed from: b */
    protected final C2832Xg f6954b;

    public C2285Eg(Context context) {
        super(context);
        this.f6954b = new C2832Xg(context, this);
    }

    /* renamed from: a */
    public abstract void mo8027a();

    /* renamed from: a */
    public abstract void mo8028a(float f, float f2);

    /* renamed from: a */
    public abstract void mo8029a(int i);

    /* renamed from: a */
    public abstract void mo8030a(C2257Dg dg);

    /* renamed from: b */
    public abstract void mo8031b();

    /* renamed from: c */
    public abstract void mo8032c();

    /* renamed from: d */
    public abstract void mo8033d();

    /* renamed from: e */
    public abstract String mo8034e();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
