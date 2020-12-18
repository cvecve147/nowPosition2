package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ju */
public final class C2442Ju {

    /* renamed from: a */
    private final Collection<C2271Du<?>> f7386a = new ArrayList();

    /* renamed from: b */
    private final Collection<C2271Du<String>> f7387b = new ArrayList();

    /* renamed from: c */
    private final Collection<C2271Du<String>> f7388c = new ArrayList();

    /* renamed from: a */
    public final List<String> mo8381a() {
        ArrayList arrayList = new ArrayList();
        for (C2271Du<String> a : this.f7387b) {
            String str = (String) C3390pt.m13458f().mo8515a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo8382a(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (C2271Du next : this.f7386a) {
            if (next.mo8016b() == 1) {
                next.mo8015a(editor, next.mo8013a(jSONObject));
            }
        }
    }

    /* renamed from: a */
    public final void mo8383a(C2271Du du) {
        this.f7386a.add(du);
    }

    /* renamed from: b */
    public final List<String> mo8384b() {
        List<String> a = mo8381a();
        for (C2271Du<String> a2 : this.f7388c) {
            String str = (String) C3390pt.m13458f().mo8515a(a2);
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }

    /* renamed from: b */
    public final void mo8385b(C2271Du<String> du) {
        this.f7387b.add(du);
    }

    /* renamed from: c */
    public final void mo8386c(C2271Du<String> du) {
        this.f7388c.add(du);
    }
}
