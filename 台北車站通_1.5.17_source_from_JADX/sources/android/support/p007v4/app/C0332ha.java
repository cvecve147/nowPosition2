package android.support.p007v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p013b.p018b.p028h.p029a.C1006a;

/* renamed from: android.support.v4.app.ha */
public final class C0332ha implements Iterable<Intent> {

    /* renamed from: a */
    private static final C0335c f1380a = (Build.VERSION.SDK_INT >= 16 ? new C0334b() : new C0335c());

    /* renamed from: b */
    private final ArrayList<Intent> f1381b = new ArrayList<>();

    /* renamed from: c */
    private final Context f1382c;

    /* renamed from: android.support.v4.app.ha$a */
    public interface C0333a {
        /* renamed from: c */
        Intent mo1292c();
    }

    /* renamed from: android.support.v4.app.ha$b */
    static class C0334b extends C0335c {
        C0334b() {
        }
    }

    /* renamed from: android.support.v4.app.ha$c */
    static class C0335c {
        C0335c() {
        }
    }

    private C0332ha(Context context) {
        this.f1382c = context;
    }

    /* renamed from: a */
    public static C0332ha m1462a(Context context) {
        return new C0332ha(context);
    }

    /* renamed from: a */
    public C0332ha mo1286a(Activity activity) {
        Intent c = activity instanceof C0333a ? ((C0333a) activity).mo1292c() : null;
        if (c == null) {
            c = C0295W.m1317a(activity);
        }
        if (c != null) {
            ComponentName component = c.getComponent();
            if (component == null) {
                component = c.resolveActivity(this.f1382c.getPackageManager());
            }
            mo1287a(component);
            mo1288a(c);
        }
        return this;
    }

    /* renamed from: a */
    public C0332ha mo1287a(ComponentName componentName) {
        int size = this.f1381b.size();
        try {
            Context context = this.f1382c;
            while (true) {
                Intent a = C0295W.m1318a(context, componentName);
                if (a == null) {
                    return this;
                }
                this.f1381b.add(size, a);
                context = this.f1382c;
                componentName = a.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public C0332ha mo1288a(Intent intent) {
        this.f1381b.add(intent);
        return this;
    }

    /* renamed from: a */
    public void mo1289a() {
        mo1290a((Bundle) null);
    }

    /* renamed from: a */
    public void mo1290a(Bundle bundle) {
        if (!this.f1381b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1381b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C1006a.m5391a(this.f1382c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1382c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1381b.iterator();
    }
}
