package p013b.p018b.p021c;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import p013b.p018b.p021c.C0949n;

/* renamed from: b.b.c.g */
class C0941g extends C0949n.C0950a {

    /* renamed from: a */
    private Handler f3760a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    final /* synthetic */ C0935a f3761b;

    /* renamed from: c */
    final /* synthetic */ C0942h f3762c;

    C0941g(C0942h hVar, C0935a aVar) {
        this.f3762c = hVar;
        this.f3761b = aVar;
    }

    /* renamed from: a */
    public void mo4831a(int i, Uri uri, boolean z, Bundle bundle) {
        if (this.f3761b != null) {
            this.f3760a.post(new C0940f(this, i, uri, z, bundle));
        }
    }

    /* renamed from: a */
    public void mo4832a(String str, Bundle bundle) {
        if (this.f3761b != null) {
            this.f3760a.post(new C0937c(this, str, bundle));
        }
    }

    /* renamed from: b */
    public void mo4833b(int i, Bundle bundle) {
        if (this.f3761b != null) {
            this.f3760a.post(new C0936b(this, i, bundle));
        }
    }

    /* renamed from: b */
    public void mo4834b(String str, Bundle bundle) {
        if (this.f3761b != null) {
            this.f3760a.post(new C0939e(this, str, bundle));
        }
    }

    /* renamed from: g */
    public void mo4835g(Bundle bundle) {
        if (this.f3761b != null) {
            this.f3760a.post(new C0938d(this, bundle));
        }
    }
}
