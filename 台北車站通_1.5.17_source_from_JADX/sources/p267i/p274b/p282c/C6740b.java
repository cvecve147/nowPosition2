package p267i.p274b.p282c;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.p007v4.app.C0270D;
import android.support.p007v4.app.C0339l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: i.b.c.b */
public class C6740b extends C0339l implements C6750k {

    /* renamed from: W */
    protected boolean f18739W;

    /* renamed from: X */
    protected boolean f18740X = false;

    /* renamed from: Y */
    protected C6747h f18741Y = null;

    /* renamed from: Z */
    private C6741a f18742Z;

    /* renamed from: aa */
    private View f18743aa;

    /* renamed from: i.b.c.b$a */
    public interface C6741a {
        /* renamed from: a */
        boolean mo5488a();
    }

    /* renamed from: P */
    public void mo1327P() {
        super.mo1327P();
        if (this.f18740X) {
            mo1304ea();
            this.f18740X = false;
        }
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: a */
    public View mo1339a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f18743aa = layoutInflater.inflate(C6754o.sango_container_fragment, (ViewGroup) null);
        return this.f18743aa;
    }

    /* renamed from: a */
    public void mo1343a(int i, int i2, Intent intent) {
        super.mo1343a(i, i2, intent);
    }

    /* renamed from: a */
    public void mo1345a(int i, String[] strArr, int[] iArr) {
        List<C0339l> d = mo1393h().mo1500d();
        if (d != null) {
            for (C0339l next : d) {
                if (next != null) {
                    next.mo1345a(i, strArr, iArr);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17225a(C0339l lVar, boolean z) {
        C0270D a = mo1393h().mo1494a();
        if (z) {
            a.mo1127a((String) null);
        }
        a.mo1123a(C6753n.container_framelayout, lVar);
        a.mo1122a();
        mo1393h().mo1498b();
    }

    /* renamed from: a */
    public void mo17226a(C6741a aVar) {
        this.f18742Z = aVar;
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        this.f18741Y = new C6747h();
    }

    /* renamed from: ea */
    public boolean mo1304ea() {
        boolean z = false;
        while (mo1393h().mo1499c() > 0) {
            z = true;
            mo1393h().mo1503g();
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (mo1393h().mo1499c() > 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (mo1393h().mo1499c() > 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return false;
     */
    /* renamed from: fa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6389fa() {
        /*
            r4 = this;
            i.b.c.b$a r0 = r4.f18742Z
            r1 = 1
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.mo5488a()
            if (r0 != 0) goto L_0x0055
        L_0x000b:
            android.support.v4.app.r r0 = r4.mo1393h()
            java.util.List r0 = r0.mo1500d()
            r2 = 0
            if (r0 != 0) goto L_0x0017
            return r2
        L_0x0017:
            int r3 = r0.size()
            int r3 = r3 - r1
            java.lang.Object r3 = r0.get(r3)
            boolean r3 = r3 instanceof p267i.p274b.p282c.C6740b
            if (r3 == 0) goto L_0x004a
            int r3 = r0.size()
            int r3 = r3 - r1
            java.lang.Object r0 = r0.get(r3)
            i.b.c.b r0 = (p267i.p274b.p282c.C6740b) r0
            boolean r0 = r0.mo6389fa()
            if (r0 == 0) goto L_0x0036
            goto L_0x0055
        L_0x0036:
            android.support.v4.app.r r0 = r4.mo1393h()
            int r0 = r0.mo1499c()
            if (r0 <= 0) goto L_0x0048
        L_0x0040:
            android.support.v4.app.r r0 = r4.mo1393h()
            r0.mo1502f()
            goto L_0x0055
        L_0x0048:
            r1 = r2
            goto L_0x0055
        L_0x004a:
            android.support.v4.app.r r0 = r4.mo1393h()
            int r0 = r0.mo1499c()
            if (r0 <= 0) goto L_0x0048
            goto L_0x0040
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p267i.p274b.p282c.C6740b.mo6389fa():boolean");
    }
}
