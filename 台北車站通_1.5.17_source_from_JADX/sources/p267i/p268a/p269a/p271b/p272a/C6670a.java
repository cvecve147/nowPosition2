package p267i.p268a.p269a.p271b.p272a;

import android.app.Activity;
import android.content.ContentValues;
import p267i.p268a.p269a.C6689e;
import p267i.p268a.p269a.p270a.C6661a;
import p267i.p274b.p277b.p278a.p279a.C6704a;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: i.a.a.b.a.a */
class C6670a extends C6704a {

    /* renamed from: i */
    final String f18498i = "success";

    /* renamed from: j */
    final String f18499j = "error";

    /* renamed from: k */
    final String f18500k = "results";

    /* renamed from: l */
    final String f18501l = "id";

    /* renamed from: m */
    final String f18502m = "deleted";

    /* renamed from: n */
    final String f18503n = "updated_at";

    /* renamed from: o */
    protected C6661a f18504o;

    /* renamed from: p */
    protected ContentValues f18505p;

    public C6670a(Activity activity, C6705b bVar, int i) {
        super(activity, bVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo17124a(int i) {
        if (i != 401) {
            return false;
        }
        this.f18619f = mo17156b();
        this.f18617d = String.valueOf(310104);
        this.f18618e = this.f18614a.getResources().getString(C6689e.dialog_token_expired_msg);
        mo17154a();
        return true;
    }
}
