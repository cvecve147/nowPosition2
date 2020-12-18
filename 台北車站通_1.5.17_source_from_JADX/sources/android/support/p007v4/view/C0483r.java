package android.support.p007v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.r */
public abstract class C0483r {

    /* renamed from: a */
    private final DataSetObservable f1802a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f1803b;

    /* renamed from: a */
    public abstract int mo1972a();

    /* renamed from: a */
    public int mo1973a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public CharSequence mo1974a(int i) {
        return null;
    }

    /* renamed from: a */
    public abstract Object mo1975a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public void mo1976a(DataSetObserver dataSetObserver) {
        this.f1802a.registerObserver(dataSetObserver);
    }

    /* renamed from: a */
    public void mo1977a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo1978a(View view) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo1979a(View view, int i, Object obj) {
    }

    /* renamed from: a */
    public void mo1980a(ViewGroup viewGroup) {
        mo1978a((View) viewGroup);
    }

    /* renamed from: a */
    public abstract void mo1981a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: a */
    public abstract boolean mo1982a(View view, Object obj);

    /* renamed from: b */
    public float mo1983b(int i) {
        return 1.0f;
    }

    /* renamed from: b */
    public Parcelable mo1984b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1985b(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f1803b = dataSetObserver;
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo1986b(View view) {
    }

    /* renamed from: b */
    public void mo1987b(ViewGroup viewGroup) {
        mo1986b((View) viewGroup);
    }

    /* renamed from: b */
    public void mo1988b(ViewGroup viewGroup, int i, Object obj) {
        mo1979a((View) viewGroup, i, obj);
    }

    /* renamed from: c */
    public void mo1989c(DataSetObserver dataSetObserver) {
        this.f1802a.unregisterObserver(dataSetObserver);
    }
}
