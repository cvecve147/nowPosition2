package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.flags.impl.C2121a;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;
import p101d.p129g.p131b.p132a.p135c.C5477a;

@DynamiteApi
public class FlagProviderImpl extends C5477a.C5478a {

    /* renamed from: a */
    private boolean f6587a = false;

    /* renamed from: b */
    private SharedPreferences f6588b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return !this.f6587a ? z : C2121a.C2122a.m9219a(this.f6588b, str, Boolean.valueOf(z)).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        return !this.f6587a ? i : C2121a.C2123b.m9220a(this.f6588b, str, Integer.valueOf(i)).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        return !this.f6587a ? j : C2121a.C2124c.m9221a(this.f6588b, str, Long.valueOf(j)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        return !this.f6587a ? str2 : C2121a.C2125d.m9222a(this.f6588b, str, str2);
    }

    public void init(C5464b bVar) {
        Context context = (Context) C5468d.m20962z(bVar);
        if (!this.f6587a) {
            try {
                this.f6588b = C2127b.m9224a(context.createPackageContext("com.google.android.gms", 0));
                this.f6587a = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
            }
        }
    }
}
