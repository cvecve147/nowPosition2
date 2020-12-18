package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3425r;
import p101d.p129g.p131b.p132a.p134b.C5468d;

public class AdActivity extends Activity {

    /* renamed from: a */
    private C3425r f5442a;

    /* renamed from: a */
    private final void m7447a() {
        C3425r rVar = this.f5442a;
        if (rVar != null) {
            try {
                rVar.mo6999fa();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f5442a.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f5442a != null) {
                z = this.f5442a.mo6988Aa();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f5442a.mo7003h(C5468d.m20961a(configuration));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5442a = C3390pt.m13454b().mo9567a((Activity) this);
        C3425r rVar = this.f5442a;
        if (rVar == null) {
            e = null;
        } else {
            try {
                rVar.mo6997e(bundle);
                return;
            } catch (RemoteException e) {
                e = e;
            }
        }
        C2227Cf.m9537d("#007 Could not call remote method.", e);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f5442a != null) {
                this.f5442a.onDestroy();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.f5442a != null) {
                this.f5442a.onPause();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.f5442a != null) {
                this.f5442a.mo6989Ma();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.f5442a != null) {
                this.f5442a.onResume();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f5442a != null) {
                this.f5442a.mo7002h(bundle);
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.f5442a != null) {
                this.f5442a.mo7005k();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.f5442a != null) {
                this.f5442a.mo7010p();
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m7447a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m7447a();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m7447a();
    }
}
