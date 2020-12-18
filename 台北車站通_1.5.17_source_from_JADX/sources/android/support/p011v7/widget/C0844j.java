package android.support.p011v7.widget;

import android.support.p011v7.widget.C0910xa;
import android.support.p011v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p028h.p039h.C1097n;
import p013b.p018b.p028h.p039h.C1098o;

/* renamed from: android.support.v7.widget.j */
class C0844j implements C0910xa.C0911a {

    /* renamed from: a */
    private C1097n<C0846b> f3456a;

    /* renamed from: b */
    final ArrayList<C0846b> f3457b;

    /* renamed from: c */
    final ArrayList<C0846b> f3458c;

    /* renamed from: d */
    final C0845a f3459d;

    /* renamed from: e */
    Runnable f3460e;

    /* renamed from: f */
    final boolean f3461f;

    /* renamed from: g */
    final C0910xa f3462g;

    /* renamed from: h */
    private int f3463h;

    /* renamed from: android.support.v7.widget.j$a */
    interface C0845a {
        /* renamed from: a */
        RecyclerView.C0778w mo3357a(int i);

        /* renamed from: a */
        void mo3358a(int i, int i2);

        /* renamed from: a */
        void mo3359a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo3360a(C0846b bVar);

        /* renamed from: b */
        void mo3361b(int i, int i2);

        /* renamed from: b */
        void mo3362b(C0846b bVar);

        /* renamed from: c */
        void mo3363c(int i, int i2);

        /* renamed from: d */
        void mo3365d(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.j$b */
    static class C0846b {

        /* renamed from: a */
        int f3464a;

        /* renamed from: b */
        int f3465b;

        /* renamed from: c */
        Object f3466c;

        /* renamed from: d */
        int f3467d;

        C0846b(int i, int i2, int i3, Object obj) {
            this.f3464a = i;
            this.f3465b = i2;
            this.f3467d = i3;
            this.f3466c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo4539a() {
            int i = this.f3464a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0846b.class != obj.getClass()) {
                return false;
            }
            C0846b bVar = (C0846b) obj;
            int i = this.f3464a;
            if (i != bVar.f3464a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3467d - this.f3465b) == 1 && this.f3467d == bVar.f3465b && this.f3465b == bVar.f3467d) {
                return true;
            }
            if (this.f3467d != bVar.f3467d || this.f3465b != bVar.f3465b) {
                return false;
            }
            Object obj2 = this.f3466c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3466c)) {
                    return false;
                }
            } else if (bVar.f3466c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3464a * 31) + this.f3465b) * 31) + this.f3467d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo4539a() + ",s:" + this.f3465b + "c:" + this.f3467d + ",p:" + this.f3466c + "]";
        }
    }

    C0844j(C0845a aVar) {
        this(aVar, false);
    }

    C0844j(C0845a aVar, boolean z) {
        this.f3456a = new C1098o(30);
        this.f3457b = new ArrayList<>();
        this.f3458c = new ArrayList<>();
        this.f3463h = 0;
        this.f3459d = aVar;
        this.f3461f = z;
        this.f3462g = new C0910xa(this);
    }

    /* renamed from: b */
    private void m4835b(C0846b bVar) {
        m4842g(bVar);
    }

    /* renamed from: c */
    private void m4836c(C0846b bVar) {
        m4842g(bVar);
    }

    /* renamed from: d */
    private int m4837d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f3458c.size() - 1; size >= 0; size--) {
            C0846b bVar = this.f3458c.get(size);
            int i7 = bVar.f3464a;
            if (i7 == 8) {
                int i8 = bVar.f3465b;
                int i9 = bVar.f3467d;
                if (i8 >= i9) {
                    int i10 = i9;
                    i9 = i8;
                    i8 = i10;
                }
                if (i < i8 || i > i9) {
                    int i11 = bVar.f3465b;
                    if (i < i11) {
                        if (i2 == 1) {
                            bVar.f3465b = i11 + 1;
                            i4 = bVar.f3467d + 1;
                        } else if (i2 == 2) {
                            bVar.f3465b = i11 - 1;
                            i4 = bVar.f3467d - 1;
                        }
                        bVar.f3467d = i4;
                    }
                } else {
                    int i12 = bVar.f3465b;
                    if (i8 == i12) {
                        if (i2 == 1) {
                            i6 = bVar.f3467d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.f3467d - 1;
                            }
                            i++;
                        }
                        bVar.f3467d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i12 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i12 - 1;
                            }
                            i--;
                        }
                        bVar.f3465b = i5;
                        i--;
                    }
                }
            } else {
                int i13 = bVar.f3465b;
                if (i13 > i) {
                    if (i2 == 1) {
                        i3 = i13 + 1;
                    } else if (i2 == 2) {
                        i3 = i13 - 1;
                    }
                    bVar.f3465b = i3;
                } else if (i7 == 1) {
                    i -= bVar.f3467d;
                } else if (i7 == 2) {
                    i += bVar.f3467d;
                }
            }
        }
        for (int size2 = this.f3458c.size() - 1; size2 >= 0; size2--) {
            C0846b bVar2 = this.f3458c.get(size2);
            if (bVar2.f3464a == 8) {
                int i14 = bVar2.f3467d;
                if (i14 != bVar2.f3465b && i14 >= 0) {
                }
            } else if (bVar2.f3467d > 0) {
            }
            this.f3458c.remove(size2);
            mo4525a(bVar2);
        }
        return i;
    }

    /* renamed from: d */
    private void m4838d(C0846b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = bVar.f3465b;
        int i2 = 0;
        boolean z4 = true;
        int i3 = bVar.f3467d + i;
        int i4 = i;
        while (i4 < i3) {
            if (this.f3459d.mo3357a(i4) != null || m4839d(i4)) {
                if (!z4) {
                    m4841f(mo4523a(2, i, i2, (Object) null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = true;
            } else {
                if (z4) {
                    m4842g(mo4523a(2, i, i2, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                i4 -= i2;
                i3 -= i2;
                i2 = 1;
            } else {
                i2++;
            }
            i4++;
            z4 = z;
        }
        if (i2 != bVar.f3467d) {
            mo4525a(bVar);
            bVar = mo4523a(2, i, i2, (Object) null);
        }
        if (!z4) {
            m4841f(bVar);
        } else {
            m4842g(bVar);
        }
    }

    /* renamed from: d */
    private boolean m4839d(int i) {
        int size = this.f3458c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0846b bVar = this.f3458c.get(i2);
            int i3 = bVar.f3464a;
            if (i3 == 8) {
                if (mo4522a(bVar.f3467d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f3465b;
                int i5 = bVar.f3467d + i4;
                while (i4 < i5) {
                    if (mo4522a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m4840e(C0846b bVar) {
        int i = bVar.f3465b;
        int i2 = bVar.f3467d + i;
        int i3 = i;
        boolean z = true;
        int i4 = 0;
        while (i < i2) {
            if (this.f3459d.mo3357a(i) != null || m4839d(i)) {
                if (!z) {
                    m4841f(mo4523a(4, i3, i4, bVar.f3466c));
                    i3 = i;
                    i4 = 0;
                }
                z = true;
            } else {
                if (z) {
                    m4842g(mo4523a(4, i3, i4, bVar.f3466c));
                    i3 = i;
                    i4 = 0;
                }
                z = false;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f3467d) {
            Object obj = bVar.f3466c;
            mo4525a(bVar);
            bVar = mo4523a(4, i3, i4, obj);
        }
        if (!z) {
            m4841f(bVar);
        } else {
            m4842g(bVar);
        }
    }

    /* renamed from: f */
    private void m4841f(C0846b bVar) {
        int i;
        int i2 = bVar.f3464a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = m4837d(bVar.f3465b, i2);
        int i3 = bVar.f3465b;
        int i4 = bVar.f3464a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = d;
        int i6 = i3;
        int i7 = 1;
        for (int i8 = 1; i8 < bVar.f3467d; i8++) {
            int d2 = m4837d(bVar.f3465b + (i * i8), bVar.f3464a);
            int i9 = bVar.f3464a;
            if (i9 == 2 ? d2 == i5 : i9 == 4 && d2 == i5 + 1) {
                i7++;
            } else {
                C0846b a = mo4523a(bVar.f3464a, i5, i7, bVar.f3466c);
                mo4526a(a, i6);
                mo4525a(a);
                if (bVar.f3464a == 4) {
                    i6 += i7;
                }
                i7 = 1;
                i5 = d2;
            }
        }
        Object obj = bVar.f3466c;
        mo4525a(bVar);
        if (i7 > 0) {
            C0846b a2 = mo4523a(bVar.f3464a, i5, i7, obj);
            mo4526a(a2, i6);
            mo4525a(a2);
        }
    }

    /* renamed from: g */
    private void m4842g(C0846b bVar) {
        this.f3458c.add(bVar);
        int i = bVar.f3464a;
        if (i == 1) {
            this.f3459d.mo3363c(bVar.f3465b, bVar.f3467d);
        } else if (i == 2) {
            this.f3459d.mo3361b(bVar.f3465b, bVar.f3467d);
        } else if (i == 4) {
            this.f3459d.mo3359a(bVar.f3465b, bVar.f3467d, bVar.f3466c);
        } else if (i == 8) {
            this.f3459d.mo3358a(bVar.f3465b, bVar.f3467d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: a */
    public int mo4521a(int i) {
        int size = this.f3457b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0846b bVar = this.f3457b.get(i2);
            int i3 = bVar.f3464a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f3465b;
                    if (i4 <= i) {
                        int i5 = bVar.f3467d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f3465b;
                    if (i6 == i) {
                        i = bVar.f3467d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f3467d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f3465b <= i) {
                i += bVar.f3467d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4522a(int i, int i2) {
        int size = this.f3458c.size();
        while (i2 < size) {
            C0846b bVar = this.f3458c.get(i2);
            int i3 = bVar.f3464a;
            if (i3 == 8) {
                int i4 = bVar.f3465b;
                if (i4 == i) {
                    i = bVar.f3467d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3467d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f3465b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3467d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3467d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    public C0846b mo4523a(int i, int i2, int i3, Object obj) {
        C0846b a = this.f3456a.mo5227a();
        if (a == null) {
            return new C0846b(i, i2, i3, obj);
        }
        a.f3464a = i;
        a.f3465b = i2;
        a.f3467d = i3;
        a.f3466c = obj;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4524a() {
        int size = this.f3458c.size();
        for (int i = 0; i < size; i++) {
            this.f3459d.mo3362b(this.f3458c.get(i));
        }
        mo4527a((List<C0846b>) this.f3458c);
        this.f3463h = 0;
    }

    /* renamed from: a */
    public void mo4525a(C0846b bVar) {
        if (!this.f3461f) {
            bVar.f3466c = null;
            this.f3456a.mo5228a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4526a(C0846b bVar, int i) {
        this.f3459d.mo3360a(bVar);
        int i2 = bVar.f3464a;
        if (i2 == 2) {
            this.f3459d.mo3365d(i, bVar.f3467d);
        } else if (i2 == 4) {
            this.f3459d.mo3359a(i, bVar.f3467d, bVar.f3466c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4527a(List<C0846b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4525a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4528a(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f3457b.add(mo4523a(8, i, i2, (Object) null));
            this.f3463h |= 8;
            return this.f3457b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4529a(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f3457b.add(mo4523a(4, i, i2, obj));
        this.f3463h |= 4;
        return this.f3457b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4530b(int i) {
        return mo4522a(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4531b() {
        mo4524a();
        int size = this.f3457b.size();
        for (int i = 0; i < size; i++) {
            C0846b bVar = this.f3457b.get(i);
            int i2 = bVar.f3464a;
            if (i2 == 1) {
                this.f3459d.mo3362b(bVar);
                this.f3459d.mo3363c(bVar.f3465b, bVar.f3467d);
            } else if (i2 == 2) {
                this.f3459d.mo3362b(bVar);
                this.f3459d.mo3365d(bVar.f3465b, bVar.f3467d);
            } else if (i2 == 4) {
                this.f3459d.mo3362b(bVar);
                this.f3459d.mo3359a(bVar.f3465b, bVar.f3467d, bVar.f3466c);
            } else if (i2 == 8) {
                this.f3459d.mo3362b(bVar);
                this.f3459d.mo3358a(bVar.f3465b, bVar.f3467d);
            }
            Runnable runnable = this.f3460e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo4527a((List<C0846b>) this.f3457b);
        this.f3463h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4532b(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f3457b.add(mo4523a(1, i, i2, (Object) null));
        this.f3463h |= 1;
        return this.f3457b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4533c() {
        return this.f3457b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4534c(int i) {
        return (i & this.f3463h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4535c(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f3457b.add(mo4523a(2, i, i2, (Object) null));
        this.f3463h |= 2;
        return this.f3457b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4536d() {
        return !this.f3458c.isEmpty() && !this.f3457b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4537e() {
        this.f3462g.mo4782a(this.f3457b);
        int size = this.f3457b.size();
        for (int i = 0; i < size; i++) {
            C0846b bVar = this.f3457b.get(i);
            int i2 = bVar.f3464a;
            if (i2 == 1) {
                m4835b(bVar);
            } else if (i2 == 2) {
                m4838d(bVar);
            } else if (i2 == 4) {
                m4840e(bVar);
            } else if (i2 == 8) {
                m4836c(bVar);
            }
            Runnable runnable = this.f3460e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3457b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4538f() {
        mo4527a((List<C0846b>) this.f3457b);
        mo4527a((List<C0846b>) this.f3458c);
        this.f3463h = 0;
    }
}
