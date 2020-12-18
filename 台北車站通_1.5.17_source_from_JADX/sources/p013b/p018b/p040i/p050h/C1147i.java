package p013b.p018b.p040i.p050h;

import android.support.p007v4.view.C0429H;
import android.support.p007v4.view.C0431I;
import android.support.p007v4.view.C0432J;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: b.b.i.h.i */
public class C1147i {

    /* renamed from: a */
    final ArrayList<C0429H> f4194a = new ArrayList<>();

    /* renamed from: b */
    private long f4195b = -1;

    /* renamed from: c */
    private Interpolator f4196c;

    /* renamed from: d */
    C0431I f4197d;

    /* renamed from: e */
    private boolean f4198e;

    /* renamed from: f */
    private final C0432J f4199f = new C1146h(this);

    /* renamed from: a */
    public C1147i mo5353a(long j) {
        if (!this.f4198e) {
            this.f4195b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C1147i mo5354a(C0429H h) {
        if (!this.f4198e) {
            this.f4194a.add(h);
        }
        return this;
    }

    /* renamed from: a */
    public C1147i mo5355a(C0429H h, C0429H h2) {
        this.f4194a.add(h);
        h2.mo1761b(h.mo1759b());
        this.f4194a.add(h2);
        return this;
    }

    /* renamed from: a */
    public C1147i mo5356a(C0431I i) {
        if (!this.f4198e) {
            this.f4197d = i;
        }
        return this;
    }

    /* renamed from: a */
    public C1147i mo5357a(Interpolator interpolator) {
        if (!this.f4198e) {
            this.f4196c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public void mo5358a() {
        if (this.f4198e) {
            Iterator<C0429H> it = this.f4194a.iterator();
            while (it.hasNext()) {
                it.next().mo1758a();
            }
            this.f4198e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5359b() {
        this.f4198e = false;
    }

    /* renamed from: c */
    public void mo5360c() {
        if (!this.f4198e) {
            Iterator<C0429H> it = this.f4194a.iterator();
            while (it.hasNext()) {
                C0429H next = it.next();
                long j = this.f4195b;
                if (j >= 0) {
                    next.mo1754a(j);
                }
                Interpolator interpolator = this.f4196c;
                if (interpolator != null) {
                    next.mo1757a(interpolator);
                }
                if (this.f4197d != null) {
                    next.mo1755a((C0431I) this.f4199f);
                }
                next.mo1762c();
            }
            this.f4198e = true;
        }
    }
}
