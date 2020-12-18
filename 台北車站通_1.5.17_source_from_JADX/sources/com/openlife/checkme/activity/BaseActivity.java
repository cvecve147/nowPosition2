package com.openlife.checkme.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p011v7.app.C0623m;
import android.support.p011v7.app.C0625o;
import android.support.p011v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.openlife.checkme.activity.home.MainActivity;
import com.openlife.checkme.activity.splash.SplashActivity;
import com.openlife.checkme.checkme_special.home.SpMainActivity;
import com.openlife.checkme.checkme_special.splash.SpSplashActivity;
import com.openlife.checkme.p091b.C4837a;
import com.openlife.checkme.p093c.C4870a;
import com.openlife.checkme.p093c.C4880j;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4938a;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.sdk.C4995e;
import java.lang.reflect.Field;
import p013b.p018b.p028h.p029a.C1006a;

public abstract class BaseActivity extends C0623m {

    /* renamed from: a */
    private Unbinder f13137a;

    /* renamed from: b */
    private C4880j f13138b;

    /* renamed from: c */
    int f13139c = C4947j.m19536a().mo13554e().mo13536f();

    /* renamed from: d */
    private C4995e f13140d;

    /* renamed from: e */
    private C4870a f13141e = C4870a.m19168a();
    protected TextView point;
    protected Toolbar toolbar;

    /* renamed from: p */
    private void m17685p() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 21) {
            ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
            View view = new View(this);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, C4883m.m19215a((Context) this));
            view.setBackgroundColor(this.f13139c);
            if (viewGroup != null) {
                viewGroup.addView(view, layoutParams);
            }
        }
    }

    /* renamed from: a */
    public void mo12575a(Context context) {
        if (context != null) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null) {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField("mCurRootView");
                    Field declaredField2 = inputMethodManager.getClass().getDeclaredField("mServedView");
                    Field declaredField3 = inputMethodManager.getClass().getDeclaredField("mNextServedView");
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    if (declaredField.get(inputMethodManager) != null) {
                        declaredField.set(inputMethodManager, (Object) null);
                    }
                    if (!declaredField2.isAccessible()) {
                        declaredField2.setAccessible(true);
                    }
                    if (declaredField2.get(inputMethodManager) != null) {
                        declaredField2.set(inputMethodManager, (Object) null);
                    }
                    if (!declaredField3.isAccessible()) {
                        declaredField3.setAccessible(true);
                    }
                    if (declaredField3.get(inputMethodManager) != null) {
                        declaredField3.set(inputMethodManager, (Object) null);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        String e = C4947j.m19536a().mo13554e().mo13533e();
        if (e != null) {
            context = C4837a.m19033a(context, e);
        }
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public void mo12577b(boolean z) {
        if (mo2624j() != null) {
            mo2624j().mo2525d(z);
            mo2624j().mo2526e(z);
        }
    }

    /* renamed from: c */
    public void mo12578c(boolean z) {
        TextView textView;
        if (mo2624j() != null && (textView = this.point) != null) {
            textView.setVisibility(z ? 0 : 8);
            this.point.setText(C4938a.m19451c((Context) this));
        }
    }

    public void finish() {
        if (this.f13141e.mo13381b().size() == 1 && !(this instanceof SpMainActivity) && !(this instanceof MainActivity) && !(this instanceof SplashActivity) && !(this instanceof SpSplashActivity)) {
            startActivity(new Intent(this, SpMainActivity.class));
        }
        super.finish();
    }

    public Resources getResources() {
        if (this.f13138b == null) {
            this.f13138b = new C4880j(super.getResources(), C4947j.m19536a());
        }
        return new C4880j(super.getResources(), C4947j.m19536a());
    }

    /* renamed from: m */
    public void mo12580m() {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo12581n();

    /* renamed from: o */
    public void mo12582o() {
        TextView textView;
        if (mo2624j() != null && (textView = this.point) != null) {
            textView.setText(C4938a.m19451c((Context) this));
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9999 && i2 == 10000) {
            setResult(10000);
            finish();
        }
    }

    public void onBackPressed() {
        if (this.f13141e.mo13381b().size() != 1 || (this instanceof SpMainActivity) || (this instanceof MainActivity) || (this instanceof SplashActivity) || (this instanceof SpSplashActivity)) {
            super.onBackPressed();
            return;
        }
        startActivity(new Intent(this, SpMainActivity.class));
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo12581n());
        C0625o.m3075a(true);
        this.f13137a = ButterKnife.m5840a((Activity) this);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C1006a.m5386a(getBaseContext(), this.f13139c));
        }
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 != null) {
            toolbar2.setBackgroundDrawable(new ColorDrawable(C1006a.m5386a(getBaseContext(), this.f13139c)));
            mo2613a(this.toolbar);
        }
        mo12577b(true);
        m17685p();
        this.f13140d = new C4995e(this);
        this.f13141e.mo13380a(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f13137a.mo5375a();
        mo12575a(getBaseContext());
        this.f13140d.mo14014a();
        this.f13141e.mo13382b(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        mo12580m();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f13140d.mo14017b();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo12582o();
        this.f13140d.mo14019c();
    }
}
