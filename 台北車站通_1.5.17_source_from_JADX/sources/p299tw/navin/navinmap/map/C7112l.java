package p299tw.navin.navinmap.map;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p267i.p274b.p277b.p278a.C6711d;
import p267i.p274b.p277b.p280b.p281a.C6722c;
import p267i.p274b.p277b.p280b.p281a.C6729j;
import p299tw.navin.navinmap.util.C7159c;

/* renamed from: tw.navin.navinmap.map.l */
class C7112l {

    /* renamed from: a */
    private C6711d f19587a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7105i f19588b = null;

    /* renamed from: c */
    private C6729j f19589c = null;

    /* renamed from: d */
    private ArrayList<C7119g> f19590d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList<C6729j.C6731b> f19591e = null;

    /* renamed from: f */
    private Thread f19592f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public HashSet<String> f19593g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f19594h = "";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f19595i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Object f19596j = new Object();

    /* renamed from: k */
    private C7115c f19597k = new C7115c();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C7114b f19598l = new C7114b();

    /* renamed from: tw.navin.navinmap.map.l$a */
    private class C7113a implements C6729j.C6731b {

        /* renamed from: a */
        private HashMap<String, Double> f19599a;

        /* renamed from: b */
        private HashMap<String, Double> f19600b;

        private C7113a() {
            this.f19600b = new HashMap<>();
        }

        /* renamed from: b */
        private void m26790b(ArrayList<C6722c> arrayList) {
            this.f19600b.clear();
            Iterator<C6722c> it = arrayList.iterator();
            while (it.hasNext()) {
                C7119g gVar = (C7119g) it.next();
                this.f19600b.put(gVar.f19613j, Double.valueOf(gVar.f18679d));
                HashMap<String, Double> hashMap = this.f19599a;
                if (hashMap != null && hashMap.containsKey(gVar.f19613j)) {
                    gVar.f18679d = Math.min(this.f19599a.get(gVar.f19613j).doubleValue(), gVar.f18679d);
                }
            }
            this.f19599a = new HashMap<>(this.f19600b);
        }

        /* renamed from: c */
        private void m26791c(ArrayList<C6722c> arrayList) {
            if (arrayList != null && C7112l.this.f19595i && C7112l.this.f19593g != null && C7112l.this.f19588b != null) {
                Iterator<C6722c> it = arrayList.iterator();
                while (it.hasNext()) {
                    C7119g gVar = (C7119g) it.next();
                    if (gVar.f19617n.equals(C7112l.this.f19594h) && gVar.f19618o == -1 && C7112l.this.f19593g.contains(gVar.f19613j)) {
                        C7112l.this.f19588b.mo21163a(gVar);
                        throw null;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo17209a() {
        }

        /* renamed from: a */
        public void mo17210a(C6722c cVar) {
        }

        /* renamed from: a */
        public void mo17211a(ArrayList<C6722c> arrayList) {
            if (arrayList != null) {
                m26790b(arrayList);
                Collections.sort(arrayList, C7112l.this.f19598l);
            }
            synchronized (C7112l.this.f19596j) {
                if (C7112l.this.f19591e != null && C7112l.this.f19591e.size() > 0) {
                    Iterator it = C7112l.this.f19591e.iterator();
                    while (it.hasNext()) {
                        new Thread(new C7110k(this, (C6729j.C6731b) it.next(), arrayList)).start();
                    }
                }
            }
            m26791c(arrayList);
        }

        /* renamed from: b */
        public void mo17212b() {
        }

        /* renamed from: g */
        public void mo17213g() {
        }
    }

    /* renamed from: tw.navin.navinmap.map.l$b */
    private class C7114b implements Comparator<C6722c> {
        private C7114b() {
        }

        /* renamed from: a */
        public int compare(C6722c cVar, C6722c cVar2) {
            double d = cVar2.f18679d - cVar.f18679d;
            if (d < 0.0d) {
                return 1;
            }
            return d > 0.0d ? -1 : 0;
        }
    }

    /* renamed from: tw.navin.navinmap.map.l$c */
    private class C7115c implements Comparator<C6722c> {
        private C7115c() {
        }

        /* renamed from: a */
        public int compare(C6722c cVar, C6722c cVar2) {
            return cVar2.f18680e - cVar.f18680e;
        }
    }

    /* renamed from: tw.navin.navinmap.map.l$d */
    public class C7116d {

        /* renamed from: a */
        public String f19604a;

        /* renamed from: b */
        public RectF[] f19605b;

        /* renamed from: c */
        public String[] f19606c;

        /* renamed from: d */
        public PointF f19607d;
    }

    /* renamed from: tw.navin.navinmap.map.l$e */
    public class C7117e extends C7123k {

        /* renamed from: n */
        public int f19608n;

        /* renamed from: o */
        public double f19609o;

        /* renamed from: p */
        public double f19610p;

        /* renamed from: a */
        public C7117e clone() {
            C7117e eVar = new C7117e();
            eVar.f19656b = this.f19656b;
            eVar.f19657c = this.f19657c;
            eVar.f19608n = this.f19608n;
            PointF pointF = this.f19661g;
            eVar.f19661g = pointF != null ? new PointF(pointF.x, pointF.y) : null;
            eVar.f19609o = this.f19609o;
            eVar.f19610p = this.f19610p;
            eVar.f19660f = this.f19660f;
            return eVar;
        }
    }

    /* renamed from: tw.navin.navinmap.map.l$f */
    public class C7118f extends C7120h {

        /* renamed from: t */
        public ArrayList<C7116d> f19611t;

        /* renamed from: u */
        public HashMap<String, C7116d> f19612u;
    }

    /* renamed from: tw.navin.navinmap.map.l$g */
    public class C7119g extends C6722c {

        /* renamed from: j */
        public String f19613j;

        /* renamed from: k */
        public String f19614k;

        /* renamed from: l */
        public String f19615l;

        /* renamed from: m */
        public PointF f19616m;

        /* renamed from: n */
        public String f19617n;

        /* renamed from: o */
        public int f19618o = -1;

        /* renamed from: a */
        public C7119g clone() {
            C7119g gVar = new C7119g();
            gVar.f18676a = this.f18676a;
            gVar.f18677b = this.f18677b;
            gVar.f18678c = this.f18678c;
            gVar.f18679d = this.f18679d;
            gVar.f18680e = this.f18680e;
            gVar.f18681f = this.f18681f;
            gVar.f18682g = this.f18682g;
            gVar.f18683h = this.f18683h;
            gVar.f18684i = this.f18684i;
            gVar.f19613j = this.f19613j;
            gVar.f19614k = this.f19614k;
            PointF pointF = this.f19616m;
            gVar.f19616m = pointF != null ? new PointF(pointF.x, pointF.y) : null;
            gVar.f19617n = this.f19617n;
            gVar.f19615l = this.f19615l;
            gVar.f19618o = this.f19618o;
            return gVar;
        }
    }

    /* renamed from: tw.navin.navinmap.map.l$h */
    public class C7120h {

        /* renamed from: a */
        public String f19619a;

        /* renamed from: b */
        public boolean f19620b;

        /* renamed from: c */
        public String f19621c;

        /* renamed from: d */
        public String f19622d;

        /* renamed from: e */
        public String f19623e;

        /* renamed from: f */
        public String f19624f;

        /* renamed from: g */
        public String f19625g;

        /* renamed from: h */
        public float f19626h;

        /* renamed from: i */
        public float f19627i;

        /* renamed from: j */
        public int f19628j;

        /* renamed from: k */
        public String f19629k;

        /* renamed from: l */
        public boolean f19630l = true;

        /* renamed from: m */
        public ArrayList<C7119g> f19631m;

        /* renamed from: n */
        public ArrayList<C7122j> f19632n;

        /* renamed from: o */
        public ArrayList<C7121i> f19633o;

        /* renamed from: p */
        public ArrayList<C7124l> f19634p;

        /* renamed from: q */
        public ArrayList<C7124l> f19635q;

        /* renamed from: r */
        public ArrayList<C7117e> f19636r;

        /* renamed from: s */
        public ArrayList<C7117e> f19637s;
    }

    /* renamed from: tw.navin.navinmap.map.l$i */
    public class C7121i {

        /* renamed from: a */
        public String f19638a;

        /* renamed from: b */
        public int f19639b;

        /* renamed from: c */
        public int f19640c;

        /* renamed from: d */
        public C7122j f19641d;

        /* renamed from: e */
        public C7122j f19642e;

        /* renamed from: f */
        public String f19643f;

        /* renamed from: g */
        public String f19644g;

        /* renamed from: h */
        public boolean f19645h;

        /* renamed from: i */
        public float f19646i;

        /* renamed from: j */
        public String f19647j;

        /* renamed from: a */
        public C7121i clone() {
            C7121i iVar = new C7121i();
            iVar.f19638a = this.f19638a;
            iVar.f19639b = this.f19639b;
            iVar.f19640c = this.f19640c;
            C7122j jVar = this.f19641d;
            C7122j jVar2 = null;
            iVar.f19641d = jVar != null ? jVar.clone() : null;
            C7122j jVar3 = this.f19642e;
            if (jVar3 != null) {
                jVar2 = jVar3.clone();
            }
            iVar.f19642e = jVar2;
            iVar.f19643f = this.f19643f;
            iVar.f19645h = this.f19645h;
            iVar.f19646i = this.f19646i;
            iVar.f19644g = this.f19644g;
            iVar.f19647j = this.f19647j;
            return iVar;
        }
    }

    /* renamed from: tw.navin.navinmap.map.l$j */
    public class C7122j {

        /* renamed from: a */
        public int f19648a;

        /* renamed from: b */
        public String f19649b;

        /* renamed from: c */
        public PointF f19650c;

        /* renamed from: d */
        public String f19651d;

        /* renamed from: e */
        public boolean f19652e;

        /* renamed from: f */
        public boolean f19653f;

        /* renamed from: g */
        public String f19654g;

        /* renamed from: a */
        public C7122j clone() {
            C7122j jVar = new C7122j();
            jVar.f19648a = this.f19648a;
            jVar.f19649b = this.f19649b;
            PointF pointF = this.f19650c;
            jVar.f19650c = pointF != null ? new PointF(pointF.x, pointF.y) : null;
            jVar.f19651d = this.f19651d;
            jVar.f19652e = this.f19652e;
            jVar.f19653f = this.f19653f;
            return jVar;
        }

        /* renamed from: b */
        public boolean mo21198b() {
            return this.f19649b.equals("E") || this.f19649b.equals("DE");
        }
    }

    /* renamed from: tw.navin.navinmap.map.l$k */
    public class C7123k {

        /* renamed from: a */
        public int f19655a;

        /* renamed from: b */
        public String f19656b;

        /* renamed from: c */
        public String f19657c;

        /* renamed from: d */
        public String f19658d;

        /* renamed from: e */
        public String f19659e;

        /* renamed from: f */
        public String f19660f;

        /* renamed from: g */
        public PointF f19661g;

        /* renamed from: h */
        public String f19662h;

        /* renamed from: i */
        public boolean f19663i = true;

        /* renamed from: j */
        public boolean f19664j = false;

        /* renamed from: k */
        public boolean f19665k;

        /* renamed from: l */
        public Rect f19666l;

        /* renamed from: m */
        public SparseArray<ArrayList<C7123k>> f19667m;
    }

    /* renamed from: tw.navin.navinmap.map.l$l */
    public class C7124l extends C7123k {

        /* renamed from: n */
        public int f19668n;

        /* renamed from: o */
        public int f19669o;

        /* renamed from: p */
        public String f19670p;

        /* renamed from: q */
        public String f19671q;

        /* renamed from: r */
        public String f19672r;

        /* renamed from: a */
        public C7124l clone() {
            C7124l lVar = new C7124l();
            lVar.f19656b = this.f19656b;
            lVar.f19657c = this.f19657c;
            lVar.f19668n = this.f19668n;
            lVar.f19669o = this.f19669o;
            lVar.f19670p = this.f19670p;
            lVar.f19671q = this.f19671q;
            lVar.f19672r = this.f19672r;
            PointF pointF = this.f19661g;
            lVar.f19661g = pointF != null ? new PointF(pointF.x, pointF.y) : null;
            lVar.f19660f = this.f19660f;
            return lVar;
        }
    }

    /* renamed from: tw.navin.navinmap.map.l$m */
    public class C7125m {
        /* renamed from: a */
        public static void m26805a(C7122j jVar, String str) {
            if (str != null && !str.isEmpty()) {
                for (String str2 : str.split(",")) {
                    if (str.contains("Gate")) {
                        jVar.f19652e = true;
                    } else {
                        m26806b(jVar, str2);
                    }
                }
            }
        }

        /* renamed from: b */
        private static boolean m26806b(C7122j jVar, String str) {
            if (!str.contains("@")) {
                return false;
            }
            String[] split = str.split("@");
            if (split.length <= 1) {
                return false;
            }
            String str2 = split[0];
            String str3 = split[1];
            if (str2.equals("ELV")) {
                m26807c(jVar, str3);
            }
            return true;
        }

        /* renamed from: c */
        private static void m26807c(C7122j jVar, String str) {
            String[] split = str.split("==");
            jVar.f19654g = C7159c.m26970b() ? split[0] : split[1];
        }
    }

    C7112l(ArrayList<C7119g> arrayList) {
        this.f19590d = arrayList;
        this.f19587a = new C6711d();
        this.f19591e = new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo21180a() {
        if (this.f19589c != null) {
            this.f19589c.mo17185f();
            this.f19589c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21181a(Activity activity, String str) {
        if (this.f19589c == null) {
            this.f19589c = C7127m.m26808a(str, activity, true);
            this.f19589c.mo17202a((ArrayList<? extends C6722c>) this.f19590d);
            this.f19589c.mo17197a(2);
            this.f19589c.mo17204b(17);
            this.f19589c.mo17201a((C6729j.C6731b) new C7113a());
            this.f19589c.mo17198a((Context) activity);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21182a(C6729j.C6731b bVar) {
        synchronized (this.f19596j) {
            this.f19591e.add(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21183a(String str) {
        this.f19594h = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21184a(ArrayList<C7119g> arrayList) {
        this.f19590d = arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21185b() {
        synchronized (this.f19596j) {
            mo21180a();
            if (this.f19591e != null) {
                this.f19591e.clear();
                this.f19591e = null;
            }
            this.f19595i = false;
            if (this.f19588b != null) {
                this.f19588b.mo21162a();
                throw null;
            } else if (this.f19592f != null) {
                if (this.f19592f.isAlive()) {
                    this.f19592f.interrupt();
                }
                this.f19592f = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21186b(C6729j.C6731b bVar) {
        synchronized (this.f19596j) {
            this.f19591e.remove(bVar);
        }
    }
}
