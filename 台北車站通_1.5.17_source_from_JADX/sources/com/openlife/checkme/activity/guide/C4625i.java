package com.openlife.checkme.activity.guide;

import com.openlife.checkme.C4937d;
import com.openlife.checkme.activity.guide.C4621e;
import com.openlife.checkme.activity.guide.C4623g;

/* renamed from: com.openlife.checkme.activity.guide.i */
public class C4625i<V extends C4623g, M extends C4621e> extends C4622f {

    /* renamed from: d */
    private C4623g f13427d;

    /* renamed from: e */
    private C4621e f13428e;

    public C4625i(V v, M m) {
        super(v, m);
        this.f13427d = v;
        this.f13428e = m;
    }

    /* renamed from: a */
    public void mo12873a(int i, Integer[] numArr, int i2) {
        if (i2 < numArr.length - 1) {
            int i3 = i2 + 1;
            this.f13427d.mo12858d(i3);
            this.f13427d.mo12857c(numArr[i3].intValue());
            if (i3 == 0) {
                this.f13427d.mo12856b();
            } else {
                this.f13427d.mo12854a();
            }
        } else if (i == 22) {
            this.f13428e.mo12871a();
            this.f13427d.mo12861k();
            this.f13427d.mo12859e(this.f13428e.mo12986j());
        } else {
            this.f13427d.mo12961d();
        }
    }

    /* renamed from: b */
    public void mo12683b(int i) {
        if (i == 22) {
            this.f13428e.mo12871a();
            this.f13427d.mo12861k();
            this.f13427d.mo12859e(this.f13428e.mo12986j());
            return;
        }
        this.f13427d.mo12961d();
    }

    /* renamed from: b */
    public void mo12874b(int i, Integer[] numArr, int i2) {
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.f13427d.mo12858d(i3);
            this.f13427d.mo12857c(numArr[i3].intValue());
            if (i3 == 0) {
                this.f13427d.mo12856b();
            } else {
                this.f13427d.mo12854a();
            }
        } else if (i == 22) {
            this.f13427d.mo12860g();
        } else {
            this.f13427d.mo12961d();
        }
    }

    /* renamed from: c */
    public void mo12875c() {
        String b = this.f13428e.mo12872b();
        if (((b.hashCode() == 52392498 && b.equals("74241")) ? (char) 0 : 65535) == 0) {
            this.f13427d.mo12855a(C4937d.guide_taipei_pic_array);
        }
    }
}
