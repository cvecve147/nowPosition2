package com.askey.taipeinavi.parking;

import android.content.Context;
import android.content.Intent;
import com.askey.taipeinavi.p058d.C1210d;
import com.sto.stolibrary.customActivities.C5061F;
import p101d.p191i.p192a.p193a.C5942H;

/* renamed from: com.askey.taipeinavi.parking.b */
public class C1269b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f4520a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1271b f4521b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f4522c;

    /* renamed from: com.askey.taipeinavi.parking.b$a */
    private class C1270a implements C5061F.C5062a {
        private C1270a() {
        }

        /* synthetic */ C1270a(C1269b bVar, C1268a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo5618a() {
            C1210d.m6028a("onSOS");
        }

        /* renamed from: a */
        public void mo5619a(Boolean bool) {
            C1210d.m6028a("sto onDetail: " + bool);
        }

        /* renamed from: a */
        public void mo5620a(Boolean bool, String str) {
            C1210d.m6028a("onBuildingSelection: " + bool + "( " + str + ")");
        }

        /* renamed from: a */
        public void mo5621a(String str, String str2, String str3) {
            C1210d.m6028a("sto onSTOMap: " + str);
            if (str != null) {
                Intent intent = new Intent(C1269b.this.f4520a, STOMapActivity.class);
                intent.putExtra("buildingID", str);
                intent.putExtra("lotCode", str3);
                intent.putExtra("mode", str2);
                C1269b.this.f4520a.startActivity(intent);
            }
        }

        /* renamed from: b */
        public void mo5622b(Boolean bool) {
            C1210d.m6028a("sto onSearchResult: " + bool);
        }

        /* renamed from: c */
        public void mo5623c(Boolean bool) {
            C1210d.m6028a("onSOSTrigger: " + bool);
        }
    }

    /* renamed from: com.askey.taipeinavi.parking.b$b */
    public interface C1271b {
        /* renamed from: a */
        void mo5573a();
    }

    public C1269b(Context context, C1271b bVar, String str) {
        this.f4520a = context;
        this.f4521b = bVar;
        C5061F b = C5061F.m19898b();
        b.mo14135a(str);
        b.mo14134a((C5061F.C5062a) new C1270a(this, (C1268a) null));
        C5942H.m22500a((C5942H.C5944b) new C1268a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m6274d() {
        C5061F.m19898b().mo14133a(this.f4520a);
    }

    /* renamed from: a */
    public boolean mo5615a() {
        return this.f4522c;
    }

    /* renamed from: b */
    public void mo5616b() {
        this.f4520a = null;
        this.f4521b = null;
    }

    /* renamed from: c */
    public void mo5617c() {
        if (!this.f4522c) {
            C5942H.m22497a(this.f4520a);
        } else {
            m6274d();
        }
    }
}
