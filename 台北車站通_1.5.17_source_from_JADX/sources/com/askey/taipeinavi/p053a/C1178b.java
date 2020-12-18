package com.askey.taipeinavi.p053a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.p053a.p054a.C1175b;
import com.askey.taipeinavi.p058d.C1210d;
import com.askey.taipeinavi.p058d.C1213g;
import p267i.p274b.p275a.p276a.C6695b;

/* renamed from: com.askey.taipeinavi.a.b */
public abstract class C1178b {

    /* renamed from: a */
    protected Activity f4351a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1181c f4352b;

    /* renamed from: c */
    private SparseArray<Bundle> f4353c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SparseArray<Object> f4354d;

    /* renamed from: e */
    private Handler f4355e = new C1173a(this);

    /* renamed from: com.askey.taipeinavi.a.b$a */
    public class C1179a implements C6695b {
        public C1179a() {
        }

        /* renamed from: a */
        public void mo5471a(int i, C6695b.C6696a aVar, Object obj) {
            if (C1178b.this.m5919a(aVar)) {
                C1178b.this.m5926d(i);
            } else {
                C1178b.this.m5915a(i, aVar);
            }
        }

        /* renamed from: a */
        public void mo5472a(int i, Object obj) {
            C1178b.this.f4354d.put(i, obj);
            C1178b.this.mo5554b(i);
        }
    }

    /* renamed from: com.askey.taipeinavi.a.b$b */
    private class C1180b implements C6695b {
        private C1180b() {
        }

        /* synthetic */ C1180b(C1178b bVar, C1173a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo5471a(int i, C6695b.C6696a aVar, Object obj) {
            C1178b.this.m5915a(i, aVar);
        }

        /* renamed from: a */
        public void mo5472a(int i, Object obj) {
            C1213g.m6053c((Context) C1178b.this.f4351a, (String) obj);
            C1178b.this.m5923c(i);
        }
    }

    /* renamed from: com.askey.taipeinavi.a.b$c */
    public interface C1181c {
        /* renamed from: a */
        void mo5473a(int i);

        /* renamed from: a */
        void mo5474a(int i, C6695b.C6696a aVar);
    }

    protected C1178b(Activity activity, C1181c cVar) {
        this.f4351a = activity;
        this.f4352b = cVar;
        this.f4353c = new SparseArray<>();
        this.f4354d = new SparseArray<>();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5915a(int i, C6695b.C6696a aVar) {
        if (this.f4352b != null) {
            Message message = new Message();
            message.what = R.id.request_failed;
            message.arg1 = i;
            message.obj = aVar;
            this.f4355e.sendMessage(message);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m5919a(C6695b.C6696a aVar) {
        if (Integer.parseInt(aVar.f18590a) != 210105) {
            return false;
        }
        C1213g.m6076s(this.f4351a);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo5554b(int i) {
        if (this.f4352b != null) {
            Message message = new Message();
            message.what = R.id.request_success;
            message.arg1 = i;
            this.f4355e.sendMessage(message);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5923c(int i) {
        m5924c(i, this.f4353c.get(i));
    }

    /* renamed from: c */
    private void m5924c(int i, Bundle bundle) {
        if (C1213g.m6051c(this.f4351a) != null) {
            C1182c a = mo5467a(i, bundle);
            if (a != null) {
                a.mo17148a();
            } else {
                C1210d.m6028a("request NULL");
            }
        } else {
            m5926d(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m5926d(int i) {
        C1182c.m5938a(new C1175b(this.f4351a, new C1180b(this, (C1173a) null), i), C1213g.m6055d(this.f4351a), C1213g.m6048b(this.f4351a), this.f4351a.getApplicationContext().getPackageName()).mo17148a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1182c mo5467a(int i, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo5468a(int i) {
        return this.f4354d.get(i);
    }

    /* renamed from: a */
    public void mo5469a() {
        this.f4351a = null;
        this.f4352b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5470b(int i, Bundle bundle) {
        this.f4353c.put(i, bundle);
        m5924c(i, bundle);
    }
}
