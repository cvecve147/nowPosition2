package android.support.p011v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.sb */
class C0887sb {

    /* renamed from: a */
    final C0889b f3637a;

    /* renamed from: b */
    C0888a f3638b = new C0888a();

    /* renamed from: android.support.v7.widget.sb$a */
    static class C0888a {

        /* renamed from: a */
        int f3639a = 0;

        /* renamed from: b */
        int f3640b;

        /* renamed from: c */
        int f3641c;

        /* renamed from: d */
        int f3642d;

        /* renamed from: e */
        int f3643e;

        C0888a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4701a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4702a(int i) {
            this.f3639a = i | this.f3639a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4703a(int i, int i2, int i3, int i4) {
            this.f3640b = i;
            this.f3641c = i2;
            this.f3642d = i3;
            this.f3643e = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4704a() {
            int i = this.f3639a;
            if ((i & 7) != 0 && (i & (mo4701a(this.f3642d, this.f3640b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f3639a;
            if ((i2 & 112) != 0 && (i2 & (mo4701a(this.f3642d, this.f3641c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3639a;
            if ((i3 & 1792) != 0 && (i3 & (mo4701a(this.f3643e, this.f3640b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3639a;
            return (i4 & 28672) == 0 || (i4 & (mo4701a(this.f3643e, this.f3641c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4705b() {
            this.f3639a = 0;
        }
    }

    /* renamed from: android.support.v7.widget.sb$b */
    interface C0889b {
        /* renamed from: a */
        int mo3402a();

        /* renamed from: a */
        int mo3403a(View view);

        /* renamed from: a */
        View mo3404a(int i);

        /* renamed from: b */
        int mo3405b();

        /* renamed from: b */
        int mo3406b(View view);
    }

    C0887sb(C0889b bVar) {
        this.f3637a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4699a(int i, int i2, int i3, int i4) {
        int a = this.f3637a.mo3402a();
        int b = this.f3637a.mo3405b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f3637a.mo3404a(i);
            this.f3638b.mo4703a(a, b, this.f3637a.mo3403a(a2), this.f3637a.mo3406b(a2));
            if (i3 != 0) {
                this.f3638b.mo4705b();
                this.f3638b.mo4702a(i3);
                if (this.f3638b.mo4704a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f3638b.mo4705b();
                this.f3638b.mo4702a(i4);
                if (this.f3638b.mo4704a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4700a(View view, int i) {
        this.f3638b.mo4703a(this.f3637a.mo3402a(), this.f3637a.mo3405b(), this.f3637a.mo3403a(view), this.f3637a.mo3406b(view));
        if (i == 0) {
            return false;
        }
        this.f3638b.mo4705b();
        this.f3638b.mo4702a(i);
        return this.f3638b.mo4704a();
    }
}
