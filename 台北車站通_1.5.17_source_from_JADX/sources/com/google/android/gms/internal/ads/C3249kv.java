package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import p013b.p018b.p021c.C0935a;
import p013b.p018b.p021c.C0942h;
import p013b.p018b.p021c.C0947l;
import p013b.p018b.p021c.C0948m;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.kv */
public final class C3249kv implements C2869Yo {

    /* renamed from: a */
    private C0948m f9724a;

    /* renamed from: b */
    private C0942h f9725b;

    /* renamed from: c */
    private C0947l f9726c;

    /* renamed from: d */
    private C3278lv f9727d;

    /* renamed from: a */
    public static boolean m12930a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(C2813Wo.m11506a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo9075a() {
        this.f9725b = null;
        this.f9724a = null;
        C3278lv lvVar = this.f9727d;
        if (lvVar != null) {
            lvVar.mo9492b();
        }
    }

    /* renamed from: a */
    public final void mo9668a(Activity activity) {
        C0947l lVar = this.f9726c;
        if (lVar != null) {
            activity.unbindService(lVar);
            this.f9725b = null;
            this.f9724a = null;
            this.f9726c = null;
        }
    }

    /* renamed from: a */
    public final void mo9076a(C0942h hVar) {
        this.f9725b = hVar;
        this.f9725b.mo4837a(0);
        C3278lv lvVar = this.f9727d;
        if (lvVar != null) {
            lvVar.mo9491a();
        }
    }

    /* renamed from: a */
    public final void mo9669a(C3278lv lvVar) {
        this.f9727d = lvVar;
    }

    /* renamed from: a */
    public final boolean mo9670a(Uri uri, Bundle bundle, List<Bundle> list) {
        C0942h hVar = this.f9725b;
        if (hVar == null) {
            return false;
        }
        if (hVar == null) {
            this.f9724a = null;
        } else if (this.f9724a == null) {
            this.f9724a = hVar.mo4836a((C0935a) null);
        }
        C0948m mVar = this.f9724a;
        if (mVar == null) {
            return false;
        }
        return mVar.mo4843a(uri, (Bundle) null, (List<Bundle>) null);
    }

    /* renamed from: b */
    public final void mo9671b(Activity activity) {
        String a;
        if (this.f9725b == null && (a = C2813Wo.m11506a(activity)) != null) {
            this.f9726c = new C2841Xo(this);
            C0942h.m5239a(activity, a, this.f9726c);
        }
    }
}
