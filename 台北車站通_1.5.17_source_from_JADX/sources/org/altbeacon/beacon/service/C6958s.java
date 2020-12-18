package org.altbeacon.beacon.service;

import android.content.Context;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.C6910i;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.s */
public class C6958s implements Serializable {

    /* renamed from: a */
    private static final String f19223a = "s";

    /* renamed from: b */
    ArrayList<C6910i> f19224b;

    /* renamed from: c */
    Boolean f19225c;

    /* renamed from: d */
    Boolean f19226d;

    /* renamed from: e */
    Long f19227e;

    /* renamed from: f */
    Boolean f19228f;

    /* renamed from: g */
    Boolean f19229g;

    /* renamed from: a */
    public static C6958s m26344a(Bundle bundle) {
        bundle.setClassLoader(Region.class.getClassLoader());
        if (bundle.get("SettingsData") != null) {
            return (C6958s) bundle.getSerializable("SettingsData");
        }
        return null;
    }

    /* renamed from: a */
    public Bundle mo18963a() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("SettingsData", this);
        return bundle;
    }

    /* renamed from: a */
    public C6958s mo18964a(Context context) {
        C6906h a = C6906h.m26069a(context);
        this.f19224b = new ArrayList<>(a.mo18767f());
        this.f19225c = Boolean.valueOf(a.mo18781y());
        this.f19226d = Boolean.valueOf(C6906h.m26078v());
        this.f19227e = Long.valueOf(C6906h.m26076s());
        this.f19228f = Boolean.valueOf(C6942f.m26256c());
        this.f19229g = Boolean.valueOf(Beacon.m25945g());
        return this;
    }

    /* renamed from: a */
    public void mo18965a(BeaconService beaconService) {
        C6895d.m26021a(f19223a, "Applying settings changes to scanner in other process", new Object[0]);
        C6906h a = C6906h.m26069a((Context) beaconService);
        List<C6910i> f = a.mo18767f();
        boolean z = true;
        if (f.size() == this.f19224b.size()) {
            int i = 0;
            while (true) {
                if (i >= f.size()) {
                    z = false;
                    break;
                } else if (!f.get(i).equals(this.f19224b.get(i))) {
                    C6895d.m26021a(f19223a, "Beacon parsers have changed to: " + this.f19224b.get(i).mo18788c(), new Object[0]);
                    break;
                } else {
                    i++;
                }
            }
        } else {
            C6895d.m26021a(f19223a, "Beacon parsers have been added or removed.", new Object[0]);
        }
        if (z) {
            C6895d.m26021a(f19223a, "Updating beacon parsers", new Object[0]);
            a.mo18767f().clear();
            a.mo18767f().addAll(this.f19224b);
            beaconService.mo18809a();
        } else {
            C6895d.m26021a(f19223a, "Beacon parsers unchanged.", new Object[0]);
        }
        C6941e a2 = C6941e.m26233a((Context) beaconService);
        if (a2.mo18883b() && !this.f19225c.booleanValue()) {
            a2.mo18891h();
        } else if (!a2.mo18883b() && this.f19225c.booleanValue()) {
            a2.mo18890g();
        }
        C6906h.m26072a(this.f19226d.booleanValue());
        C6906h.m26071a(this.f19227e.longValue());
        C6942f.m26255a(this.f19228f.booleanValue());
        Beacon.m25943a(this.f19229g.booleanValue());
    }
}
