package org.altbeacon.beacon.p292b;

import android.os.Build;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.b.a */
public class C6883a {

    /* renamed from: a */
    String f18964a;

    /* renamed from: b */
    String f18965b;

    /* renamed from: c */
    String f18966c;

    /* renamed from: d */
    String f18967d;

    public C6883a(String str, String str2, String str3, String str4) {
        this.f18964a = str;
        this.f18965b = str2;
        this.f18966c = str3;
        this.f18967d = str4;
    }

    /* renamed from: a */
    public static C6883a m25972a() {
        return new C6883a(Build.VERSION.RELEASE, Build.ID, Build.MODEL, Build.MANUFACTURER);
    }

    /* renamed from: a */
    public int mo18722a(C6883a aVar) {
        int equalsIgnoreCase = this.f18967d.equalsIgnoreCase(aVar.f18967d);
        if (equalsIgnoreCase == 1 && this.f18966c.equals(aVar.f18966c)) {
            equalsIgnoreCase = 2;
        }
        if (equalsIgnoreCase == 2 && this.f18965b.equals(aVar.f18965b)) {
            equalsIgnoreCase = 3;
        }
        if (equalsIgnoreCase == 3 && this.f18964a.equals(aVar.f18964a)) {
            equalsIgnoreCase = 4;
        }
        C6895d.m26021a("AndroidModel", "Score is %s for %s compared to %s", Integer.valueOf(equalsIgnoreCase), toString(), aVar);
        return equalsIgnoreCase;
    }

    /* renamed from: b */
    public String mo18723b() {
        return this.f18965b;
    }

    /* renamed from: c */
    public String mo18724c() {
        return this.f18967d;
    }

    /* renamed from: d */
    public String mo18725d() {
        return this.f18966c;
    }

    /* renamed from: e */
    public String mo18726e() {
        return this.f18964a;
    }

    public String toString() {
        return "" + this.f18967d + ";" + this.f18966c + ";" + this.f18965b + ";" + this.f18964a;
    }
}
