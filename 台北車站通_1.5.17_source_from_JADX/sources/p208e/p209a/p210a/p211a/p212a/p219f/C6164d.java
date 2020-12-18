package p208e.p209a.p210a.p211a.p212a.p219f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import p208e.p209a.p210a.p211a.C6208m;

/* renamed from: e.a.a.a.a.f.d */
public class C6164d implements C6163c {

    /* renamed from: a */
    private final SharedPreferences f17182a;

    /* renamed from: b */
    private final String f17183b;

    /* renamed from: c */
    private final Context f17184c;

    public C6164d(Context context, String str) {
        if (context != null) {
            this.f17184c = context;
            this.f17183b = str;
            this.f17182a = this.f17184c.getSharedPreferences(this.f17183b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Deprecated
    public C6164d(C6208m mVar) {
        this(mVar.mo16305k(), mVar.getClass().getName());
    }

    @TargetApi(9)
    /* renamed from: a */
    public boolean mo16235a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    public SharedPreferences.Editor edit() {
        return this.f17182a.edit();
    }

    public SharedPreferences get() {
        return this.f17182a;
    }
}
