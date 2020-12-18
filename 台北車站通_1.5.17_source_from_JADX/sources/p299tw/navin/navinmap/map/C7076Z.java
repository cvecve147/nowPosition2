package p299tw.navin.navinmap.map;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p267i.p268a.p269a.C6684c;
import p267i.p268a.p269a.C6688d;
import p267i.p268a.p269a.C6689e;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.map.C7135p;
import p299tw.navin.navinmap.map.p300a.C7084c;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.Z */
public class C7076Z extends C7066T {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C7135p f19512G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public ViewGroup f19513H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public View f19514I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public AlertDialog f19515J;

    /* renamed from: tw.navin.navinmap.map.Z$a */
    private class C7077a implements C7135p.C7136a {
        private C7077a() {
        }

        /* synthetic */ C7077a(C7076Z z, C7071U u) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m26652b(C7112l.C7116d dVar) {
            String[] strArr = dVar.f19606c;
            String[] strArr2 = new String[strArr.length];
            if (strArr.length > 1) {
                for (int i = 0; i < strArr.length; i++) {
                    strArr2[i] = C7076Z.this.f19497v.get(strArr[i]).f19621c;
                }
                C7076Z.this.f19475F.post(new C7075Y(this, strArr2, strArr));
                return;
            }
            C7076Z.this.m26645b(strArr[0]);
        }

        /* renamed from: a */
        public void mo21112a(C7112l.C7116d dVar) {
            if (C7076Z.this.f19476a == null || !C7109ja.m26767a().mo21174b()) {
                m26652b(dVar);
            } else {
                C7076Z.this.mo21081a((DialogInterface.OnClickListener) new C7073W(this, dVar));
            }
        }
    }

    /* renamed from: tw.navin.navinmap.map.Z$b */
    private class C7078b implements C7084c.C7085a {
        private C7078b() {
        }

        /* synthetic */ C7078b(C7076Z z, C7071U u) {
            this();
        }

        /* renamed from: a */
        public void mo21032a() {
            C7076Z.this.f19475F.post(new C7088aa(this));
        }

        /* renamed from: b */
        public void mo21033b() {
            C7076Z.this.f19475F.post(new C7090ba(this));
        }
    }

    C7076Z(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26645b(String str) {
        super.mo21083a(this.f19497v.get(str));
        mo21110a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21080a(Context context, ViewGroup viewGroup) {
        this.f19513H = (ViewGroup) LayoutInflater.from(context).inflate(C6688d.view_global_map, viewGroup, false);
        viewGroup.addView(this.f19513H);
        this.f19514I = this.f19513H.findViewById(C6684c.pgbGlobalMapLoading);
        this.f19512G = new C7135p(context);
        this.f19512G.setOnGlobalAreaSelectListener(new C7077a(this, (C7071U) null));
        this.f19512G.setReadyToShow(true);
        this.f19512G.f19782pa = false;
        this.f19513H.addView(this.f19512G, 0, new RelativeLayout.LayoutParams(-1, -1));
        this.f19513H.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21109a(String str) {
        this.f19512G.mo21224a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21110a(boolean z) {
        this.f19475F.post(new C7071U(this, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized void mo21111j() {
        if (this.f19515J == null) {
            this.f19515J = C7173l.m26991a(getContext(), LayoutInflater.from(getContext()).inflate(C6688d.view_map_function_hint, (ViewGroup) null, false), (String) null, -1, C6689e.dialog_btn_ok, (DialogInterface.OnClickListener) null, new C7072V(this));
            this.f19515J.setCancelable(false);
        }
    }
}
