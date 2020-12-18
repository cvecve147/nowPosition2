package p267i.p274b.p277b.p280b.p281a;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.C6910i;

/* renamed from: i.b.b.b.a.k */
public class C6733k extends C6719b {
    public C6733k(Context context, boolean z, boolean z2, boolean z3, boolean z4, C6910i iVar) {
        super(context, z, z2, z3, z4, iVar);
    }

    /* renamed from: d */
    private int m25529d(int i) {
        return Math.round((((float) i) * 100.0f) / ((float) 3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6722c mo17178a(Beacon beacon) {
        C6722c a = super.mo17178a(beacon);
        List<Long> f = beacon.mo18697f();
        if (f != null && f.size() > 0) {
            a.f18678c = f.get(0).intValue();
            a.f18684i = m25529d(f.get(1).intValue());
        }
        return a;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DefaultLocale"})
    /* renamed from: b */
    public String mo17203b(C6722c cVar) {
        return String.format("%s-%d", new Object[]{cVar.f18676a.toUpperCase(), Integer.valueOf(cVar.f18678c)});
    }
}
