package p101d.p108c.p109a;

import android.os.Build;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.List;
import p101d.p108c.p109a.C5197l;

/* renamed from: d.c.a.i */
class C5194i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C5197l f14584a;

    C5194i(C5197l lVar) {
        this.f14584a = lVar;
    }

    public void onGlobalLayout() {
        int i;
        if (Build.VERSION.SDK_INT < 16) {
            this.f14584a.f14588c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else {
            this.f14584a.f14588c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        C5197l.C5206i iVar = this.f14584a.f14599n;
        if (iVar == C5197l.C5206i.SINGLE || iVar == C5197l.C5206i.MULTI) {
            C5197l lVar = this.f14584a;
            if (lVar.f14599n == C5197l.C5206i.SINGLE) {
                i = lVar.f14601p.f14629L;
                if (i < 0) {
                    return;
                }
            } else {
                List<Integer> list = lVar.f14600o;
                if (list != null && list.size() != 0) {
                    Collections.sort(this.f14584a.f14600o);
                    i = this.f14584a.f14600o.get(0).intValue();
                } else {
                    return;
                }
            }
            this.f14584a.f14588c.post(new C5193h(this, i));
        }
    }
}
