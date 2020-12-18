package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.p */
public class C0042p {

    /* renamed from: a */
    private final HashMap<String, C0040n> f140a = new HashMap<>();

    /* renamed from: a */
    public final void mo70a() {
        for (C0040n a : this.f140a.values()) {
            a.mo69a();
        }
        this.f140a.clear();
    }
}
