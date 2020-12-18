package p299tw.navin.navinmap.map;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p299tw.navin.navinmap.map.PMISLMain;

/* renamed from: tw.navin.navinmap.map.ga */
class C7102ga {

    /* renamed from: a */
    private ExecutorService f19569a = Executors.newCachedThreadPool();

    /* renamed from: b */
    private final ArrayList<PMISLMain.C7059a> f19570b = new ArrayList<>();

    C7102ga() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21155a() {
        ExecutorService executorService = this.f19569a;
        if (executorService != null) {
            executorService.shutdown();
            this.f19569a = null;
        }
        this.f19570b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21156a(float f) {
        synchronized (this.f19570b) {
            if (this.f19569a != null) {
                Iterator<PMISLMain.C7059a> it = this.f19570b.iterator();
                while (it.hasNext()) {
                    this.f19569a.execute(new C7094ca(this, it.next(), f));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21157a(Path path, Path path2) {
        synchronized (this.f19570b) {
            if (this.f19569a != null) {
                Iterator<PMISLMain.C7059a> it = this.f19570b.iterator();
                while (it.hasNext()) {
                    this.f19569a.execute(new C7098ea(this, it.next(), path, path2));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21158a(Path path, Path path2, PointF pointF, boolean z) {
        synchronized (this.f19570b) {
            if (this.f19569a != null) {
                Iterator<PMISLMain.C7059a> it = this.f19570b.iterator();
                while (it.hasNext()) {
                    this.f19569a.execute(new C7100fa(this, it.next(), path, path2, pointF, z));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21159a(PointF pointF) {
        synchronized (this.f19570b) {
            if (this.f19569a != null) {
                Iterator<PMISLMain.C7059a> it = this.f19570b.iterator();
                while (it.hasNext()) {
                    this.f19569a.execute(new C7096da(this, it.next(), pointF));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21160a(PMISLMain.C7059a aVar) {
        synchronized (this.f19570b) {
            this.f19570b.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21161b(PMISLMain.C7059a aVar) {
        synchronized (this.f19570b) {
            this.f19570b.remove(aVar);
        }
    }
}
