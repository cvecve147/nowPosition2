package p208e.p209a.p210a.p211a.p212a.p214b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;

/* renamed from: e.a.a.a.a.b.i */
public class C6077i {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo16057a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo16058a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            if (string != null) {
                return string;
            }
            C6199f.m23420f().mo16269d("Fabric", "Falling back to Crashlytics key lookup from Manifest");
            return bundle.getString("com.crashlytics.ApiKey");
        } catch (Exception e) {
            C6211p f = C6199f.m23420f();
            f.mo16269d("Fabric", "Caught non-fatal exception while retrieving apiKey: " + e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo16059b(Context context) {
        int a = C6080l.m23026a(context, "io.fabric.ApiKey", "string");
        if (a == 0) {
            C6199f.m23420f().mo16269d("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a = C6080l.m23026a(context, "com.crashlytics.ApiKey", "string");
        }
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    /* renamed from: c */
    public String mo16060c(Context context) {
        String a = mo16058a(context);
        if (TextUtils.isEmpty(a)) {
            a = mo16059b(context);
        }
        if (TextUtils.isEmpty(a)) {
            mo16061d(context);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16061d(Context context) {
        if (C6199f.m23421h() || C6080l.m23062j(context)) {
            throw new IllegalArgumentException(mo16057a());
        }
        C6199f.m23420f().mo16265b("Fabric", mo16057a());
    }
}
