package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.G */
public class C1343G extends AbstractList<GraphRequest> {

    /* renamed from: a */
    private static AtomicInteger f4784a = new AtomicInteger();

    /* renamed from: b */
    private Handler f4785b;

    /* renamed from: c */
    private List<GraphRequest> f4786c = new ArrayList();

    /* renamed from: d */
    private int f4787d = 0;

    /* renamed from: e */
    private final String f4788e = Integer.valueOf(f4784a.incrementAndGet()).toString();

    /* renamed from: f */
    private List<C1344a> f4789f = new ArrayList();

    /* renamed from: g */
    private String f4790g;

    /* renamed from: com.facebook.G$a */
    public interface C1344a {
        /* renamed from: a */
        void mo5948a(C1343G g);
    }

    /* renamed from: com.facebook.G$b */
    public interface C1345b extends C1344a {
        /* renamed from: a */
        void mo5949a(C1343G g, long j, long j2);
    }

    public C1343G(Collection<GraphRequest> collection) {
        this.f4786c = new ArrayList(collection);
    }

    public C1343G(GraphRequest... graphRequestArr) {
        this.f4786c = Arrays.asList(graphRequestArr);
    }

    /* renamed from: a */
    public final List<C1352H> mo5926a() {
        return mo5934b();
    }

    /* renamed from: a */
    public final void add(int i, GraphRequest graphRequest) {
        this.f4786c.add(i, graphRequest);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5928a(Handler handler) {
        this.f4785b = handler;
    }

    /* renamed from: a */
    public void mo5929a(C1344a aVar) {
        if (!this.f4789f.contains(aVar)) {
            this.f4789f.add(aVar);
        }
    }

    /* renamed from: a */
    public final boolean add(GraphRequest graphRequest) {
        return this.f4786c.add(graphRequest);
    }

    /* renamed from: b */
    public final GraphRequest set(int i, GraphRequest graphRequest) {
        return this.f4786c.set(i, graphRequest);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C1352H> mo5934b() {
        return GraphRequest.m6514a(this);
    }

    /* renamed from: c */
    public final C1340F mo5935c() {
        return mo5937d();
    }

    public final void clear() {
        this.f4786c.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1340F mo5937d() {
        return GraphRequest.m6529b(this);
    }

    /* renamed from: e */
    public final String mo5938e() {
        return this.f4790g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Handler mo5939f() {
        return this.f4785b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final List<C1344a> mo5940g() {
        return this.f4789f;
    }

    public final GraphRequest get(int i) {
        return this.f4786c.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo5942h() {
        return this.f4788e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final List<GraphRequest> mo5943i() {
        return this.f4786c;
    }

    /* renamed from: j */
    public int mo5944j() {
        return this.f4787d;
    }

    public final GraphRequest remove(int i) {
        return this.f4786c.remove(i);
    }

    public final int size() {
        return this.f4786c.size();
    }
}
