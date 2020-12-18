package p013b.p018b.p021c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p007v4.app.C0330h;
import java.util.ArrayList;
import p013b.p018b.p028h.p029a.C1006a;

/* renamed from: b.b.c.j */
public final class C0944j {

    /* renamed from: a */
    public final Intent f3765a;

    /* renamed from: b */
    public final Bundle f3766b;

    /* renamed from: b.b.c.j$a */
    public static final class C0945a {

        /* renamed from: a */
        private final Intent f3767a;

        /* renamed from: b */
        private ArrayList<Bundle> f3768b;

        /* renamed from: c */
        private Bundle f3769c;

        /* renamed from: d */
        private ArrayList<Bundle> f3770d;

        /* renamed from: e */
        private boolean f3771e;

        public C0945a() {
            this((C0948m) null);
        }

        public C0945a(C0948m mVar) {
            this.f3767a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f3768b = null;
            this.f3769c = null;
            this.f3770d = null;
            this.f3771e = true;
            if (mVar != null) {
                this.f3767a.setPackage(mVar.mo4844b().getPackageName());
            }
            Bundle bundle = new Bundle();
            C0330h.m1459a(bundle, "android.support.customtabs.extra.SESSION", mVar != null ? mVar.mo4842a() : iBinder);
            this.f3767a.putExtras(bundle);
        }

        /* renamed from: a */
        public C0944j mo4839a() {
            ArrayList<Bundle> arrayList = this.f3768b;
            if (arrayList != null) {
                this.f3767a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f3770d;
            if (arrayList2 != null) {
                this.f3767a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f3767a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3771e);
            return new C0944j(this.f3767a, this.f3769c);
        }
    }

    private C0944j(Intent intent, Bundle bundle) {
        this.f3765a = intent;
        this.f3766b = bundle;
    }

    /* renamed from: a */
    public void mo4838a(Context context, Uri uri) {
        this.f3765a.setData(uri);
        C1006a.m5390a(context, this.f3765a, this.f3766b);
    }
}
