package com.openlife.checkme.p093c;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import com.openlife.checkme.net.model.BeaconData;
import com.openlife.checkme.net.model.Execution;
import com.openlife.checkme.p093c.C4886p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p208e.p221b.C6213a;
import p208e.p221b.C6247e;
import p208e.p221b.C6412f;
import p208e.p221b.C6433l;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p243h.C6418a;
import p250g.p262c.C6584b;

/* renamed from: com.openlife.checkme.c.i */
public class C4878i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4886p f13960a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<String> f13961b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Execution f13962c = new Execution();

    /* renamed from: d */
    private C6247e<BeaconData> f13963d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6412f<BeaconData> f13964e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4879a f13965f;

    /* renamed from: g */
    private Context f13966g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<C6223b> f13967h = new ArrayList();

    /* renamed from: com.openlife.checkme.c.i$a */
    public interface C4879a {
        /* renamed from: a */
        void mo13060a();

        /* renamed from: a */
        void mo13061a(int i);

        /* renamed from: a */
        void mo13062a(Execution execution);

        /* renamed from: a */
        void mo13063a(Throwable th);

        /* renamed from: b */
        void mo13064b();
    }

    public C4878i(Context context) {
        this.f13966g = context;
        this.f13960a = new C4886p();
    }

    /* renamed from: a */
    private BluetoothAdapter m19190a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 17) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        if (i >= 18) {
            return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m19196d() {
        this.f13963d.mo16346a(new C4876g(this)).mo16353b(C6418a.m23996b()).mo16347a(C6216b.m23500a()).mo16350a(m19198e());
    }

    /* renamed from: e */
    private C6584b<BeaconData> m19198e() {
        return new C4877h(this);
    }

    /* renamed from: a */
    public void mo13392a(Activity activity) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && !defaultAdapter.isEnabled()) {
            mo13394a(this.f13961b);
        }
        C6433l.m24014a(12, TimeUnit.SECONDS).mo16545b(C6418a.m23996b()).mo16533a((C6242d<? super C6223b>) new C4875f(this)).mo16540a(C6216b.m23500a()).mo16542a(new C4874e(this));
    }

    /* renamed from: a */
    public void mo13393a(C4879a aVar) {
        this.f13965f = aVar;
    }

    /* renamed from: a */
    public void mo13394a(List<String> list) {
        this.f13961b = list;
        this.f13960a.mo13407a(m19190a(this.f13966g));
        this.f13960a.mo13405a((C4886p.C4887a) new C4872c(this));
        if (this.f13963d == null) {
            this.f13963d = C6247e.m23537a(new C4873d(this), C6213a.LATEST);
        }
    }

    /* renamed from: a */
    public boolean mo13395a() {
        return this.f13967h.size() > 0;
    }

    /* renamed from: b */
    public void mo13396b(Activity activity) {
        C4886p pVar = this.f13960a;
        if (pVar != null && pVar.mo13406a()) {
            this.f13960a.mo13409c();
            this.f13960a.mo13405a((C4886p.C4887a) null);
        }
        for (C6223b a : this.f13967h) {
            a.mo15709a();
        }
        this.f13967h.clear();
        this.f13960a = null;
        this.f13965f = null;
        this.f13966g = null;
    }

    /* renamed from: b */
    public boolean mo13397b() {
        BluetoothAdapter a = m19190a(this.f13966g);
        return a != null && a.isEnabled();
    }

    /* renamed from: c */
    public void mo13398c() {
        BluetoothAdapter a = m19190a(this.f13966g);
        if (a != null || !a.isEnabled()) {
            a.enable();
        }
    }
}
