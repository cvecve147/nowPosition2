package com.askey.taipeinavi.quicknavi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.askey.taipeinavi.home.C1254x;
import java.util.ArrayList;
import java.util.Iterator;
import p267i.p274b.p282c.C6751l;
import p299tw.navin.navinmap.map.C7095d;

/* renamed from: com.askey.taipeinavi.quicknavi.g */
public abstract class C1281g {

    /* renamed from: a */
    private C1254x f4529a;

    C1281g(C1254x xVar) {
        this.f4529a = xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract View mo5632a(Context context, ViewGroup viewGroup, C6751l lVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1254x mo5635a() {
        return this.f4529a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<C7095d> mo5636a(String[] strArr) {
        ArrayList<C7095d> arrayList = new ArrayList<>();
        Iterator it = mo5635a().mo5587ga().mo21010c().iterator();
        while (it.hasNext()) {
            C7095d dVar = (C7095d) it.next();
            if (dVar.mo21148i() == 2) {
                for (String equals : strArr) {
                    if (dVar.mo21132b().equals(equals)) {
                        arrayList.add(dVar);
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo5633a(View view, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo5634b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5637c() {
        this.f4529a = null;
    }
}
