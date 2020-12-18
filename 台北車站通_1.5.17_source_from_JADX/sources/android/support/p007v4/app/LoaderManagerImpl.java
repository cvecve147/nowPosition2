package android.support.p007v4.app;

import android.arch.lifecycle.C0030f;
import android.arch.lifecycle.C0036k;
import android.arch.lifecycle.C0037l;
import android.arch.lifecycle.C0040n;
import android.arch.lifecycle.C0041o;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p013b.p018b.p028h.p029a.C1017b;
import p013b.p018b.p028h.p039h.C1085g;
import p013b.p018b.p028h.p039h.C1102s;

/* renamed from: android.support.v4.app.LoaderManagerImpl */
class LoaderManagerImpl extends C0293U {

    /* renamed from: a */
    static boolean f1221a = false;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    static class LoaderViewModel extends C0040n {

        /* renamed from: a */
        private static final C0041o f1222a = new C0294V();

        /* renamed from: b */
        private C1102s<C0282a> f1223b = new C1102s<>();

        LoaderViewModel() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo69a() {
            super.mo69a();
            if (this.f1223b.mo5259e() <= 0) {
                this.f1223b.mo5258d();
            } else {
                this.f1223b.mo5261f(0).mo1165a(true);
                throw null;
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C0282a<D> extends C0036k<D> implements C1017b.C1018a<D> {

        /* renamed from: h */
        private final int f1224h;

        /* renamed from: i */
        private final C1017b<D> f1225i;

        /* renamed from: j */
        private C0030f f1226j;

        /* renamed from: k */
        private C0283b<D> f1227k;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1017b<D> mo1165a(boolean z) {
            if (LoaderManagerImpl.f1221a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f1225i.mo5014a();
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo44a() {
            if (LoaderManagerImpl.f1221a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f1225i.mo5015b();
            throw null;
        }

        /* renamed from: a */
        public void mo45a(C0037l<D> lVar) {
            super.mo45a(lVar);
            this.f1226j = null;
            this.f1227k = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo46b() {
            if (LoaderManagerImpl.f1221a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f1225i.mo5016c();
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f1224h);
            sb.append(" : ");
            C1085g.m5639a(this.f1225i, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    static class C0283b<D> implements C0037l<D> {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1163a() {
        throw null;
    }

    /* renamed from: a */
    public void mo1164a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }
}
