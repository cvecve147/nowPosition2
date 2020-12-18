package p208e.p209a.p210a.p211a.p212a.p219f;

import android.content.Context;
import java.io.File;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;

/* renamed from: e.a.a.a.a.f.b */
public class C6162b implements C6161a {

    /* renamed from: a */
    private final Context f17179a;

    /* renamed from: b */
    private final String f17180b;

    /* renamed from: c */
    private final String f17181c;

    public C6162b(C6208m mVar) {
        if (mVar.mo16305k() != null) {
            this.f17179a = mVar.mo16305k();
            this.f17180b = mVar.mo16309p();
            this.f17181c = "Android/" + this.f17179a.getPackageName();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    /* renamed from: a */
    public File mo16233a() {
        return mo16234a(this.f17179a.getFilesDir());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo16234a(File file) {
        if (file == null) {
            C6199f.m23420f().mo16269d("Fabric", "Null File");
            return null;
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            C6199f.m23420f().mo16262a("Fabric", "Couldn't create file");
            return null;
        }
    }
}
