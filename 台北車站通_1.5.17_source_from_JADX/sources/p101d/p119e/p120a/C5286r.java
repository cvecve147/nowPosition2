package p101d.p119e.p120a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: d.e.a.r */
public class C5286r {

    /* renamed from: a */
    private AtomicInteger f14959a;

    /* renamed from: b */
    private final Map<String, Queue<C5284q<?>>> f14960b;

    /* renamed from: c */
    private final Set<C5284q<?>> f14961c;

    /* renamed from: d */
    private final PriorityBlockingQueue<C5284q<?>> f14962d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C5284q<?>> f14963e;

    /* renamed from: f */
    private final C5267b f14964f;

    /* renamed from: g */
    private final C5276i f14965g;

    /* renamed from: h */
    private final C5291t f14966h;

    /* renamed from: i */
    private C5277j[] f14967i;

    /* renamed from: j */
    private C5270d f14968j;

    /* renamed from: k */
    private List<C5287a> f14969k;

    /* renamed from: d.e.a.r$a */
    public interface C5287a<T> {
        /* renamed from: a */
        void mo14655a(C5284q<T> qVar);
    }

    public C5286r(C5267b bVar, C5276i iVar) {
        this(bVar, iVar, 4);
    }

    public C5286r(C5267b bVar, C5276i iVar, int i) {
        this(bVar, iVar, i, new C5273g(new Handler(Looper.getMainLooper())));
    }

    public C5286r(C5267b bVar, C5276i iVar, int i, C5291t tVar) {
        this.f14959a = new AtomicInteger();
        this.f14960b = new HashMap();
        this.f14961c = new HashSet();
        this.f14962d = new PriorityBlockingQueue<>();
        this.f14963e = new PriorityBlockingQueue<>();
        this.f14969k = new ArrayList();
        this.f14964f = bVar;
        this.f14965g = iVar;
        this.f14967i = new C5277j[i];
        this.f14966h = tVar;
    }

    /* renamed from: a */
    public int mo14650a() {
        return this.f14959a.incrementAndGet();
    }

    /* renamed from: a */
    public <T> C5284q<T> mo14651a(C5284q<T> qVar) {
        qVar.mo14623a(this);
        synchronized (this.f14961c) {
            this.f14961c.add(qVar);
        }
        qVar.mo14621a(mo14650a());
        qVar.mo14626a("add-to-queue");
        if (!qVar.mo14620C()) {
            this.f14963e.add(qVar);
            return qVar;
        }
        synchronized (this.f14960b) {
            String k = qVar.mo14635k();
            if (this.f14960b.containsKey(k)) {
                Queue queue = this.f14960b.get(k);
                if (queue == null) {
                    queue = new LinkedList();
                }
                queue.add(qVar);
                this.f14960b.put(k, queue);
                if (C5296y.f14977b) {
                    C5296y.m20472c("Request for cacheKey=%s is in flight, putting on hold.", k);
                }
            } else {
                this.f14960b.put(k, (Object) null);
                this.f14962d.add(qVar);
            }
        }
        return qVar;
    }

    /* renamed from: b */
    public void mo14652b() {
        mo14654c();
        this.f14968j = new C5270d(this.f14962d, this.f14963e, this.f14964f, this.f14966h);
        this.f14968j.start();
        for (int i = 0; i < this.f14967i.length; i++) {
            C5277j jVar = new C5277j(this.f14963e, this.f14965g, this.f14964f, this.f14966h);
            this.f14967i[i] = jVar;
            jVar.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void mo14653b(C5284q<T> qVar) {
        synchronized (this.f14961c) {
            this.f14961c.remove(qVar);
        }
        synchronized (this.f14969k) {
            for (C5287a a : this.f14969k) {
                a.mo14655a(qVar);
            }
        }
        if (qVar.mo14620C()) {
            synchronized (this.f14960b) {
                String k = qVar.mo14635k();
                Queue remove = this.f14960b.remove(k);
                if (remove != null) {
                    if (C5296y.f14977b) {
                        C5296y.m20472c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), k);
                    }
                    this.f14962d.addAll(remove);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo14654c() {
        C5270d dVar = this.f14968j;
        if (dVar != null) {
            dVar.mo14605a();
        }
        int i = 0;
        while (true) {
            C5277j[] jVarArr = this.f14967i;
            if (i < jVarArr.length) {
                if (jVarArr[i] != null) {
                    jVarArr[i].mo14616a();
                }
                i++;
            } else {
                return;
            }
        }
    }
}
