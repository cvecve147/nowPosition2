package p299tw.navin.navinmap.map;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.Callback;
import p267i.p268a.p269a.C6684c;
import p267i.p268a.p269a.p270a.C6661a;
import p267i.p268a.p269a.p270a.C6664d;
import p267i.p268a.p269a.p270a.C6667g;
import p267i.p268a.p269a.p271b.C6669a;
import p267i.p268a.p269a.p271b.C6679b;
import p267i.p268a.p269a.p271b.C6681d;
import p267i.p268a.p269a.p271b.p272a.C6671b;
import p267i.p268a.p269a.p271b.p272a.C6672c;
import p267i.p268a.p269a.p271b.p272a.C6673d;
import p267i.p268a.p269a.p271b.p272a.C6674e;
import p267i.p268a.p269a.p271b.p272a.C6675f;
import p267i.p268a.p269a.p271b.p272a.C6676g;
import p267i.p274b.p277b.p278a.C6707b;
import p267i.p274b.p277b.p278a.C6711d;
import p267i.p274b.p277b.p278a.p279a.C6705b;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.util.C7157a;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.u */
class C7143u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f19715a;

    /* renamed from: b */
    private C6711d f19716b;

    /* renamed from: c */
    private C6681d f19717c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C7144a f19718d;

    /* renamed from: e */
    private HashMap<String, C7112l.C7120h> f19719e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<C7112l.C7120h> f19720f;

    /* renamed from: g */
    private ArrayList<C7112l.C7119g> f19721g;

    /* renamed from: h */
    private ArrayList<C7112l.C7122j> f19722h;

    /* renamed from: i */
    private ArrayList<C7112l.C7121i> f19723i;

    /* renamed from: j */
    private ArrayList<C7112l.C7124l> f19724j;

    /* renamed from: k */
    private ArrayList<C7112l.C7117e> f19725k;

    /* renamed from: l */
    private ArrayList<C7095d> f19726l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Handler f19727m = new C7138q(this);

    /* renamed from: tw.navin.navinmap.map.u$a */
    interface C7144a {
        /* renamed from: a */
        void mo21018a();

        /* renamed from: a */
        void mo21019a(C6705b.C6706a aVar);
    }

    C7143u(Activity activity, C7144a aVar) {
        this.f19715a = activity;
        this.f19718d = aVar;
        this.f19716b = new C6711d();
        this.f19717c = C6681d.m25398a();
        this.f19726l = new ArrayList<>();
    }

    /* renamed from: a */
    private void m26870a(C6661a aVar) {
        this.f19720f = aVar.mo17103f();
        if (this.f19720f != null) {
            this.f19719e = new HashMap<>();
            Iterator<C7112l.C7120h> it = this.f19720f.iterator();
            while (it.hasNext()) {
                C7112l.C7120h next = it.next();
                next.f19637s = new ArrayList<>();
                next.f19635q = new ArrayList<>();
                this.f19719e.put(next.f19619a, next);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26871a(C6705b.C6706a aVar) {
        C7144a aVar2 = this.f19718d;
        if (aVar2 != null) {
            aVar2.mo21019a(aVar);
        }
    }

    /* renamed from: a */
    private boolean m26875a(C7112l.C7117e eVar) {
        int i = eVar.f19608n;
        return (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 || i == 11 || i == 28 || i == 29) ? false : true;
    }

    /* renamed from: b */
    private void m26876b(C6661a aVar) {
        ArrayList<C7112l.C7119g> arrayList;
        this.f19721g = aVar.mo17105g();
        if (this.f19719e != null && (arrayList = this.f19721g) != null) {
            Iterator<C7112l.C7119g> it = arrayList.iterator();
            while (it.hasNext()) {
                C7112l.C7119g next = it.next();
                C7112l.C7120h hVar = this.f19719e.get(next.f19617n);
                if (hVar != null) {
                    if (hVar.f19631m == null) {
                        hVar.f19631m = new ArrayList<>();
                    }
                    hVar.f19631m.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26877b(C6705b.C6706a aVar) {
        C7144a aVar2;
        if (!m26884c(aVar) && (aVar2 = this.f19718d) != null) {
            aVar2.mo21019a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26878b(ArrayList<C7112l.C7120h> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<C7112l.C7120h> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().f19624f);
        }
        C6664d.m25338a().mo17115a((Context) this.f19715a, C7173l.m27001a((ArrayList<String>) arrayList2));
    }

    /* renamed from: c */
    private void m26881c(C6661a aVar) {
        ArrayList<C7112l.C7122j> arrayList;
        this.f19722h = aVar.mo17106h();
        if (this.f19719e != null && (arrayList = this.f19722h) != null) {
            Iterator<C7112l.C7122j> it = arrayList.iterator();
            while (it.hasNext()) {
                C7112l.C7122j next = it.next();
                C7112l.C7120h hVar = this.f19719e.get(next.f19651d);
                if (hVar != null) {
                    if (hVar.f19632n == null) {
                        hVar.f19632n = new ArrayList<>();
                    }
                    hVar.f19632n.add(next);
                }
            }
        }
    }

    /* renamed from: c */
    private void m26882c(String str) {
        if (C7173l.m26999a((Context) this.f19715a)) {
            String h = C6667g.m25368h(this.f19715a);
            if (h != null && C7173l.m27004b(h, 7)) {
                C6661a aVar = new C6661a(this.f19715a);
                aVar.mo17092a();
                aVar.mo17099d();
                aVar.mo17175c();
                C6667g.m25370i(this.f19715a);
            }
            this.f19716b.mo17165a((C6707b) C6679b.m25388a((Callback) new C6673d(this.f19715a, new C6669a(this.f19727m, C6684c.request_map_success, C6684c.request_map_failed)), str, C6667g.m25372j(this.f19715a)));
            this.f19716b.mo17165a((C6707b) C6679b.m25391b(new C6671b(this.f19715a, new C6669a(this.f19727m, C6684c.request_beacon_success, C6684c.request_beacon_failed)), str, C6667g.m25374k(this.f19715a)));
            this.f19716b.mo17165a((C6707b) C6679b.m25392c(new C6675f(this.f19715a, new C6669a(this.f19727m, C6684c.request_node_success, C6684c.request_node_failed)), str, C6667g.m25375l(this.f19715a)));
            this.f19716b.mo17165a((C6707b) C6679b.m25393d(new C6674e(this.f19715a, new C6669a(this.f19727m, C6684c.request_node_link_success, C6684c.request_node_link_failed)), str, C6667g.m25376m(this.f19715a)));
            this.f19716b.mo17165a((C6707b) C6679b.m25394e(new C6676g(this.f19715a, new C6669a(this.f19727m, C6684c.request_store_success, C6684c.request_store_failed)), str, C6667g.m25377n(this.f19715a)));
            this.f19716b.mo17165a((C6707b) C6679b.m25395f(new C6672c(this.f19715a, new C6669a(this.f19727m, C6684c.request_facility_success, C6684c.request_facility_failed)), str, C6667g.m25378o(this.f19715a)));
            this.f19716b.mo17166a((C6711d.C6714c) new C7141s(this));
            this.f19716b.mo17167b();
            C6667g.m25364f(this.f19715a);
        }
    }

    /* renamed from: c */
    private boolean m26884c(C6705b.C6706a aVar) {
        if (Integer.parseInt(aVar.f18622a) != 310104) {
            return false;
        }
        m26893k();
        return true;
    }

    /* renamed from: d */
    private void m26886d(C6661a aVar) {
        ArrayList<C7112l.C7121i> arrayList;
        this.f19723i = aVar.mo17107i();
        if (this.f19719e != null && this.f19722h != null && (arrayList = this.f19723i) != null) {
            HashMap hashMap = new HashMap(arrayList.size());
            Iterator<C7112l.C7122j> it = this.f19722h.iterator();
            while (it.hasNext()) {
                C7112l.C7122j next = it.next();
                hashMap.put(Integer.valueOf(next.f19648a), next);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<C7112l.C7121i> it2 = this.f19723i.iterator();
            while (it2.hasNext()) {
                C7112l.C7121i next2 = it2.next();
                next2.f19641d = (C7112l.C7122j) hashMap.get(Integer.valueOf(next2.f19639b));
                next2.f19642e = (C7112l.C7122j) hashMap.get(Integer.valueOf(next2.f19640c));
                if (next2.f19641d == null || next2.f19642e == null) {
                    arrayList2.add(next2);
                    C7157a.m26965a(String.format("NodeLink %s has Null node (node %s:%s, node %s:%s)", new Object[]{next2.f19638a, Integer.valueOf(next2.f19639b), next2.f19641d, Integer.valueOf(next2.f19640c), next2.f19642e}));
                }
            }
            this.f19723i.removeAll(arrayList2);
            Iterator<C7112l.C7121i> it3 = this.f19723i.iterator();
            while (it3.hasNext()) {
                C7112l.C7121i next3 = it3.next();
                C7112l.C7120h hVar = this.f19719e.get(next3.f19643f);
                if (hVar != null) {
                    if (hVar.f19633o == null) {
                        hVar.f19633o = new ArrayList<>();
                    }
                    hVar.f19633o.add(next3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m26887d(String str) {
        m26882c(str);
    }

    /* renamed from: e */
    private void m26889e(C6661a aVar) {
        ArrayList<C7112l.C7124l> arrayList;
        this.f19724j = aVar.mo17108j();
        if (this.f19719e != null && (arrayList = this.f19724j) != null) {
            Iterator<C7112l.C7124l> it = arrayList.iterator();
            while (it.hasNext()) {
                C7112l.C7124l next = it.next();
                C7112l.C7120h hVar = this.f19719e.get(next.f19660f);
                if (hVar != null) {
                    if (hVar.f19634p == null) {
                        hVar.f19634p = new ArrayList<>();
                    }
                    hVar.f19634p.add(next);
                    C7095d dVar = new C7095d();
                    dVar.mo21135b(next.f19656b);
                    dVar.mo21149i(next.f19662h);
                    dVar.mo21131a(next.f19657c);
                    dVar.mo21145g(next.f19658d);
                    dVar.mo21147h(next.f19659e);
                    dVar.mo21139d(hVar.f19619a);
                    dVar.mo21137c(hVar.f19621c);
                    dVar.mo21141e(hVar.f19622d);
                    dVar.mo21143f(hVar.f19623e);
                    dVar.mo21130a(1);
                    dVar.mo21129a(next.f19661g.x);
                    dVar.mo21134b(next.f19661g.y);
                    this.f19726l.add(dVar);
                }
            }
        }
    }

    /* renamed from: f */
    private void m26891f(C6661a aVar) {
        ArrayList<C7112l.C7117e> arrayList;
        this.f19725k = aVar.mo17109k();
        if (this.f19719e != null && (arrayList = this.f19725k) != null) {
            Iterator<C7112l.C7117e> it = arrayList.iterator();
            while (it.hasNext()) {
                C7112l.C7117e next = it.next();
                C7112l.C7120h hVar = this.f19719e.get(next.f19660f);
                if (hVar != null) {
                    if (hVar.f19636r == null) {
                        hVar.f19636r = new ArrayList<>();
                    }
                    hVar.f19636r.add(next);
                    if (m26875a(next)) {
                        C7095d dVar = new C7095d();
                        dVar.mo21135b(next.f19656b);
                        dVar.mo21149i(next.f19662h);
                        dVar.mo21131a(next.f19657c);
                        dVar.mo21145g(next.f19658d);
                        dVar.mo21147h(next.f19659e);
                        dVar.mo21139d(hVar.f19619a);
                        dVar.mo21137c(hVar.f19621c);
                        dVar.mo21141e(hVar.f19622d);
                        dVar.mo21143f(hVar.f19623e);
                        dVar.mo21130a(2);
                        dVar.mo21129a(next.f19661g.x);
                        dVar.mo21134b(next.f19661g.y);
                        dVar.mo21128a(next.f19609o);
                        dVar.mo21133b(next.f19610p);
                        this.f19726l.add(dVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m26892j() {
        String a = this.f19717c.mo17125a(this.f19715a);
        if (a != null) {
            m26882c(a);
        } else {
            m26893k();
        }
    }

    /* renamed from: k */
    private void m26893k() {
        this.f19717c.mo17126a((C6681d.C6682a) new C7142t(this));
        this.f19717c.mo17128b(this.f19715a);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m26894l() {
        try {
            C6664d.m25338a().mo17114a(this.f19715a);
        } catch (IOException e) {
            e.printStackTrace();
        }
        C6661a aVar = new C6661a(this.f19715a);
        aVar.mo17092a();
        m26870a(aVar);
        m26876b(aVar);
        m26881c(aVar);
        m26886d(aVar);
        m26889e(aVar);
        m26891f(aVar);
        aVar.mo17175c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<C7112l.C7123k> mo21237a(ArrayList<Integer> arrayList) {
        ArrayList<C7112l.C7123k> arrayList2 = new ArrayList<>();
        Iterator<C7112l.C7117e> it = this.f19725k.iterator();
        while (it.hasNext()) {
            C7112l.C7117e next = it.next();
            Iterator<Integer> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (next.f19608n == it2.next().intValue()) {
                    arrayList2.add(next);
                }
            }
        }
        if (arrayList2.size() > 0) {
            return arrayList2;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7112l.C7120h mo21238a(String str) {
        Iterator<C7112l.C7120h> it = this.f19720f.iterator();
        while (it.hasNext()) {
            C7112l.C7120h next = it.next();
            if (next.f19619a.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7112l.C7123k mo21239a(C7095d dVar) {
        if (dVar.mo21148i() == 1) {
            Iterator<C7112l.C7124l> it = this.f19724j.iterator();
            while (it.hasNext()) {
                C7112l.C7124l next = it.next();
                if (next.f19656b.equals(dVar.mo21132b())) {
                    return next;
                }
            }
            return null;
        } else if (dVar.mo21148i() != 2) {
            return null;
        } else {
            Iterator<C7112l.C7117e> it2 = this.f19725k.iterator();
            while (it2.hasNext()) {
                C7112l.C7117e next2 = it2.next();
                if (next2.f19656b.equals(dVar.mo21132b())) {
                    return next2;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21240a() {
        this.f19715a = null;
        this.f19716b = null;
        this.f19717c = null;
        this.f19718d = null;
        C6681d dVar = this.f19717c;
        if (dVar != null) {
            dVar.mo17127b();
            this.f19717c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7112l.C7120h mo21241b(String str) {
        Iterator<C7112l.C7120h> it = this.f19720f.iterator();
        while (it.hasNext()) {
            C7112l.C7120h next = it.next();
            if (next.f19629k.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21242b() {
        new C7140r(this).execute(new Void[0]);
    }

    /* renamed from: c */
    public HashMap<String, C7112l.C7120h> mo21243c() {
        return this.f19719e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ArrayList<C7112l.C7120h> mo21244d() {
        return this.f19720f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ArrayList<C7112l.C7119g> mo21245e() {
        return this.f19721g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ArrayList<C7112l.C7122j> mo21246f() {
        return this.f19722h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ArrayList<C7112l.C7121i> mo21247g() {
        return this.f19723i;
    }

    /* renamed from: h */
    public ArrayList<C7095d> mo21248h() {
        return this.f19726l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C7112l.C7120h mo21249i() {
        C7112l.C7120h hVar = this.f19720f.get(0);
        Iterator<C7112l.C7120h> it = this.f19720f.iterator();
        while (it.hasNext()) {
            C7112l.C7120h next = it.next();
            if (next.f19620b) {
                return next;
            }
        }
        return hVar;
    }
}
