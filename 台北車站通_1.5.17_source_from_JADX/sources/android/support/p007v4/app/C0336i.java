package android.support.p007v4.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: android.support.v4.app.i */
public class C0336i extends C0339l implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: W */
    int f1383W = 0;

    /* renamed from: X */
    int f1384X = 0;

    /* renamed from: Y */
    boolean f1385Y = true;

    /* renamed from: Z */
    boolean f1386Z = true;

    /* renamed from: aa */
    int f1387aa = -1;

    /* renamed from: ba */
    Dialog f1388ba;

    /* renamed from: ca */
    boolean f1389ca;

    /* renamed from: da */
    boolean f1390da;

    /* renamed from: ea */
    boolean f1391ea;

    /* renamed from: M */
    public void mo1293M() {
        super.mo1293M();
        Dialog dialog = this.f1388ba;
        if (dialog != null) {
            this.f1389ca = true;
            dialog.dismiss();
            this.f1388ba = null;
        }
    }

    /* renamed from: N */
    public void mo1294N() {
        super.mo1294N();
        if (!this.f1391ea && !this.f1390da) {
            this.f1390da = true;
        }
    }

    /* renamed from: Q */
    public void mo1295Q() {
        super.mo1295Q();
        Dialog dialog = this.f1388ba;
        if (dialog != null) {
            this.f1389ca = false;
            dialog.show();
        }
    }

    /* renamed from: R */
    public void mo1296R() {
        super.mo1296R();
        Dialog dialog = this.f1388ba;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: a */
    public void mo1297a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: a */
    public void mo1298a(Context context) {
        super.mo1298a(context);
        if (!this.f1391ea) {
            this.f1390da = false;
        }
    }

    /* renamed from: a */
    public void mo1299a(C0350r rVar, String str) {
        this.f1390da = false;
        this.f1391ea = true;
        C0270D a = rVar.mo1494a();
        a.mo1126a((C0339l) this, str);
        a.mo1122a();
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        Bundle bundle2;
        super.mo1300b(bundle);
        if (this.f1386Z) {
            View z = mo1422z();
            if (z != null) {
                if (z.getParent() == null) {
                    this.f1388ba.setContentView(z);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            C0344n a = mo1337a();
            if (a != null) {
                this.f1388ba.setOwnerActivity(a);
            }
            this.f1388ba.setCancelable(this.f1385Y);
            this.f1388ba.setOnCancelListener(this);
            this.f1388ba.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.f1388ba.onRestoreInstanceState(bundle2);
            }
        }
    }

    /* renamed from: c */
    public void mo1301c(Bundle bundle) {
        super.mo1301c(bundle);
        this.f1386Z = this.f1396A == 0;
        if (bundle != null) {
            this.f1383W = bundle.getInt("android:style", 0);
            this.f1384X = bundle.getInt("android:theme", 0);
            this.f1385Y = bundle.getBoolean("android:cancelable", true);
            this.f1386Z = bundle.getBoolean("android:showsDialog", this.f1386Z);
            this.f1387aa = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: d */
    public LayoutInflater mo1302d(Bundle bundle) {
        Context c;
        if (!this.f1386Z) {
            return super.mo1302d(bundle);
        }
        this.f1388ba = mo1307n(bundle);
        Dialog dialog = this.f1388ba;
        if (dialog != null) {
            mo1297a(dialog, this.f1383W);
            c = this.f1388ba.getContext();
        } else {
            c = this.f1436u.mo1491c();
        }
        return (LayoutInflater) c.getSystemService("layout_inflater");
    }

    /* renamed from: e */
    public void mo1303e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo1303e(bundle);
        Dialog dialog = this.f1388ba;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1383W;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1384X;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f1385Y;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f1386Z;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f1387aa;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: ea */
    public Dialog mo1304ea() {
        return this.f1388ba;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1305h(boolean z) {
        if (!this.f1390da) {
            this.f1390da = true;
            this.f1391ea = false;
            Dialog dialog = this.f1388ba;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f1389ca = true;
            if (this.f1387aa >= 0) {
                mo1406n().mo1496a(this.f1387aa, 1);
                this.f1387aa = -1;
                return;
            }
            C0270D a = mo1406n().mo1494a();
            a.mo1130c(this);
            if (z) {
                a.mo1128b();
            } else {
                a.mo1122a();
            }
        }
    }

    /* renamed from: i */
    public void mo1306i(boolean z) {
        this.f1386Z = z;
    }

    /* renamed from: n */
    public Dialog mo1307n(Bundle bundle) {
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1389ca) {
            mo1305h(true);
        }
    }
}
