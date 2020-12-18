package android.support.p011v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0429H;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0679v;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: android.support.v7.widget.V */
public interface C0798V {
    /* renamed from: a */
    C0429H mo4369a(int i, long j);

    /* renamed from: a */
    void mo4370a(int i);

    /* renamed from: a */
    void mo4371a(C0679v.C0680a aVar, C0662l.C0663a aVar2);

    /* renamed from: a */
    void mo4372a(C0744Ra ra);

    /* renamed from: a */
    void mo4373a(Menu menu, C0679v.C0680a aVar);

    /* renamed from: a */
    void mo4374a(View view);

    /* renamed from: a */
    void mo4375a(boolean z);

    /* renamed from: a */
    boolean mo4376a();

    /* renamed from: b */
    void mo4377b();

    /* renamed from: b */
    void mo4378b(int i);

    /* renamed from: b */
    void mo4379b(boolean z);

    /* renamed from: c */
    void mo4380c(int i);

    /* renamed from: c */
    boolean mo4381c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo4383d();

    /* renamed from: e */
    boolean mo4384e();

    /* renamed from: f */
    boolean mo4385f();

    /* renamed from: g */
    void mo4386g();

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    int mo4389h();

    /* renamed from: i */
    boolean mo4390i();

    /* renamed from: j */
    Menu mo4391j();

    /* renamed from: k */
    int mo4392k();

    /* renamed from: l */
    ViewGroup mo4393l();

    /* renamed from: m */
    int mo4394m();

    /* renamed from: n */
    void mo4395n();

    /* renamed from: o */
    void mo4396o();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
