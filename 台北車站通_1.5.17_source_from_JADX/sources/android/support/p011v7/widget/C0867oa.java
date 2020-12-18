package android.support.p011v7.widget;

import android.support.p007v4.p008os.C0417d;
import android.support.p011v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: android.support.v7.widget.oa */
final class C0867oa implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<C0867oa> f3556a = new ThreadLocal<>();

    /* renamed from: b */
    static Comparator<C0869b> f3557b = new C0864na();

    /* renamed from: c */
    ArrayList<RecyclerView> f3558c = new ArrayList<>();

    /* renamed from: d */
    long f3559d;

    /* renamed from: e */
    long f3560e;

    /* renamed from: f */
    private ArrayList<C0869b> f3561f = new ArrayList<>();

    /* renamed from: android.support.v7.widget.oa$a */
    static class C0868a implements RecyclerView.C0759i.C0760a {

        /* renamed from: a */
        int f3562a;

        /* renamed from: b */
        int f3563b;

        /* renamed from: c */
        int[] f3564c;

        /* renamed from: d */
        int f3565d;

        C0868a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4618a() {
            int[] iArr = this.f3564c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3565d = 0;
        }

        /* renamed from: a */
        public void mo3939a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f3565d * 2;
                int[] iArr = this.f3564c;
                if (iArr == null) {
                    this.f3564c = new int[4];
                    Arrays.fill(this.f3564c, -1);
                } else if (i3 >= iArr.length) {
                    this.f3564c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f3564c, 0, iArr.length);
                }
                int[] iArr2 = this.f3564c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f3565d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4619a(RecyclerView recyclerView, boolean z) {
            this.f3565d = 0;
            int[] iArr = this.f3564c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C0759i iVar = recyclerView.f2998w;
            if (recyclerView.f2996v != null && iVar != null && iVar.mo3936w()) {
                if (z) {
                    if (!recyclerView.f2980n.mo4533c()) {
                        iVar.mo3504a(recyclerView.f2996v.mo337a(), (RecyclerView.C0759i.C0760a) this);
                    }
                } else if (!recyclerView.mo3727k()) {
                    iVar.mo3503a(this.f3562a, this.f3563b, recyclerView.f2989ra, (RecyclerView.C0759i.C0760a) this);
                }
                int i = this.f3565d;
                if (i > iVar.f3032m) {
                    iVar.f3032m = i;
                    iVar.f3033n = z;
                    recyclerView.f2976l.mo3997j();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4620a(int i) {
            if (this.f3564c != null) {
                int i2 = this.f3565d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3564c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4621b(int i, int i2) {
            this.f3562a = i;
            this.f3563b = i2;
        }
    }

    /* renamed from: android.support.v7.widget.oa$b */
    static class C0869b {

        /* renamed from: a */
        public boolean f3566a;

        /* renamed from: b */
        public int f3567b;

        /* renamed from: c */
        public int f3568c;

        /* renamed from: d */
        public RecyclerView f3569d;

        /* renamed from: e */
        public int f3570e;

        C0869b() {
        }

        /* renamed from: a */
        public void mo4622a() {
            this.f3566a = false;
            this.f3567b = 0;
            this.f3568c = 0;
            this.f3569d = null;
            this.f3570e = 0;
        }
    }

    C0867oa() {
    }

    /* renamed from: a */
    private RecyclerView.C0778w m4973a(RecyclerView recyclerView, int i, long j) {
        if (m4977a(recyclerView, i)) {
            return null;
        }
        RecyclerView.C0769p pVar = recyclerView.f2976l;
        try {
            recyclerView.mo3748r();
            RecyclerView.C0778w a = pVar.mo3965a(i, false, j);
            if (a != null) {
                if (!a.mo4045l() || a.mo4046m()) {
                    pVar.mo3974a(a, false);
                } else {
                    pVar.mo3981b(a.f3093b);
                }
            }
            return a;
        } finally {
            recyclerView.mo3642a(false);
        }
    }

    /* renamed from: a */
    private void m4974a() {
        C0869b bVar;
        int size = this.f3558c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f3558c.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f2987qa.mo4619a(recyclerView, false);
                i += recyclerView.f2987qa.f3565d;
            }
        }
        this.f3561f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f3558c.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0868a aVar = recyclerView2.f2987qa;
                int abs = Math.abs(aVar.f3562a) + Math.abs(aVar.f3563b);
                int i5 = i3;
                for (int i6 = 0; i6 < aVar.f3565d * 2; i6 += 2) {
                    if (i5 >= this.f3561f.size()) {
                        bVar = new C0869b();
                        this.f3561f.add(bVar);
                    } else {
                        bVar = this.f3561f.get(i5);
                    }
                    int i7 = aVar.f3564c[i6 + 1];
                    bVar.f3566a = i7 <= abs;
                    bVar.f3567b = abs;
                    bVar.f3568c = i7;
                    bVar.f3569d = recyclerView2;
                    bVar.f3570e = aVar.f3564c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f3561f, f3557b);
    }

    /* renamed from: a */
    private void m4975a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f2954N && recyclerView.f2982o.mo4248b() != 0) {
                recyclerView.mo3779u();
            }
            C0868a aVar = recyclerView.f2987qa;
            aVar.mo4619a(recyclerView, true);
            if (aVar.f3565d != 0) {
                try {
                    C0417d.m1972a("RV Nested Prefetch");
                    recyclerView.f2989ra.mo4013a(recyclerView.f2996v);
                    for (int i = 0; i < aVar.f3565d * 2; i += 2) {
                        m4973a(recyclerView, aVar.f3564c[i], j);
                    }
                } finally {
                    C0417d.m1971a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m4976a(C0869b bVar, long j) {
        RecyclerView.C0778w a = m4973a(bVar.f3569d, bVar.f3570e, bVar.f3566a ? Long.MAX_VALUE : j);
        if (a != null && a.f3094c != null && a.mo4045l() && !a.mo4046m()) {
            m4975a((RecyclerView) a.f3094c.get(), j);
        }
    }

    /* renamed from: a */
    static boolean m4977a(RecyclerView recyclerView, int i) {
        int b = recyclerView.f2982o.mo4248b();
        for (int i2 = 0; i2 < b; i2++) {
            RecyclerView.C0778w i3 = RecyclerView.m3934i(recyclerView.f2982o.mo4254d(i2));
            if (i3.f3095d == i && !i3.mo4046m()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m4978b(long j) {
        int i = 0;
        while (i < this.f3561f.size()) {
            C0869b bVar = this.f3561f.get(i);
            if (bVar.f3569d != null) {
                m4976a(bVar, j);
                bVar.mo4622a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4613a(long j) {
        m4974a();
        m4978b(j);
    }

    /* renamed from: a */
    public void mo4614a(RecyclerView recyclerView) {
        this.f3558c.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4615a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3559d == 0) {
            this.f3559d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f2987qa.mo4621b(i, i2);
    }

    /* renamed from: b */
    public void mo4616b(RecyclerView recyclerView) {
        this.f3558c.remove(recyclerView);
    }

    public void run() {
        try {
            C0417d.m1972a("RV Prefetch");
            if (!this.f3558c.isEmpty()) {
                int size = this.f3558c.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f3558c.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo4613a(TimeUnit.MILLISECONDS.toNanos(j) + this.f3560e);
                    this.f3559d = 0;
                    C0417d.m1971a();
                }
            }
        } finally {
            this.f3559d = 0;
            C0417d.m1971a();
        }
    }
}
