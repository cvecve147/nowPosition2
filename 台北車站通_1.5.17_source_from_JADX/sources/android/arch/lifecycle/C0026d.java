package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.d */
public abstract class C0026d {

    /* renamed from: android.arch.lifecycle.d$a */
    public enum C0027a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: android.arch.lifecycle.d$b */
    public enum C0028b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo54a(C0028b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract C0028b mo52a();

    /* renamed from: a */
    public abstract void mo53a(C0029e eVar);
}
