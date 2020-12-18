package p299tw.navin.navinmap.map;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p267i.p268a.p269a.p270a.C6667g;
import p299tw.navin.navinmap.map.C7030F;
import p299tw.navin.navinmap.map.C7079a;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.map.PMISLMain;

/* renamed from: tw.navin.navinmap.map.c */
class C7091c extends C7030F {

    /* renamed from: Q */
    private C7076Z f19533Q;

    /* renamed from: tw.navin.navinmap.map.c$a */
    public interface C7092a extends C7030F.C7040j {
    }

    /* renamed from: tw.navin.navinmap.map.c$b */
    public interface C7093b extends C7030F.C7042l {
    }

    C7091c(Activity activity, String str, String str2) {
        super(activity, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo20988a() {
        return String.format("%s-%s", new Object[]{"NavinMap", "TpeNavi"});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7066T mo20990a(Activity activity) {
        this.f19533Q = new C7076Z(activity);
        return this.f19533Q;
    }

    /* renamed from: a */
    public void mo20991a(String str) {
        super.mo20991a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20992a(String str, float f, float f2) {
        if (f != -1.0f) {
            this.f19533Q.mo21109a(str);
        } else {
            this.f19533Q.mo21109a((String) null);
        }
    }

    /* renamed from: a */
    public void mo21122a(C7092a aVar) {
        super.mo20993a((C7030F.C7040j) aVar);
    }

    /* renamed from: a */
    public void mo21123a(C7093b bVar) {
        super.mo20994a((C7030F.C7042l) bVar);
    }

    /* renamed from: a */
    public void mo20995a(C7101g gVar) {
        super.mo20995a(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20996a(C7112l.C7123k kVar) {
        super.mo20996a(kVar);
        if (!C6667g.m25381r(this.f19352g)) {
            this.f19533Q.mo21111j();
        }
    }

    /* renamed from: a */
    public void mo20998a(boolean z) {
        super.mo20998a(z);
    }

    /* renamed from: a */
    public void mo21000a(String[] strArr, C7079a.C7080a aVar) {
        super.mo21000a(strArr, aVar);
    }

    /* renamed from: a */
    public boolean mo21001a(String str, boolean z) {
        return super.mo21001a(str, z);
    }

    /* renamed from: a */
    public boolean mo21002a(List<C7095d> list) {
        return super.mo21002a(list);
    }

    /* renamed from: a */
    public boolean mo21003a(List<C7095d> list, boolean z) {
        return super.mo21003a(list, z);
    }

    /* renamed from: a */
    public boolean mo21004a(C7095d dVar) {
        return super.mo21004a(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo21005b() {
        return String.format("%s.%s", new Object[]{"2.2.5", "4"});
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C7146w mo21006b(Activity activity) {
        if (!C7030F.f19330a) {
            return super.mo21006b(activity);
        }
        C7154x xVar = new C7154x(activity);
        this.f19349d.mo21056a((PMISLMain.C7060b) xVar);
        return xVar;
    }

    /* renamed from: b */
    public void mo21124b(boolean z) {
        this.f19533Q.mo21110a(z);
    }

    /* renamed from: b */
    public void mo21008b(String[] strArr, C7079a.C7080a aVar) {
        super.mo21008b(strArr, aVar);
    }

    /* renamed from: b */
    public boolean mo21009b(String str) {
        return super.mo21009b(str);
    }

    /* renamed from: c */
    public ArrayList<C7095d> mo21010c() {
        return super.mo21010c();
    }

    /* renamed from: d */
    public View mo21011d() {
        return super.mo21011d();
    }
}
