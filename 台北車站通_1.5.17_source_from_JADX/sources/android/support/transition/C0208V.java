package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.support.transition.V */
public class C0208V {

    /* renamed from: a */
    public final Map<String, Object> f1014a = new HashMap();

    /* renamed from: b */
    public View f1015b;

    /* renamed from: c */
    final ArrayList<C0195M> f1016c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof C0208V)) {
            return false;
        }
        C0208V v = (C0208V) obj;
        return this.f1015b == v.f1015b && this.f1014a.equals(v.f1014a);
    }

    public int hashCode() {
        return (this.f1015b.hashCode() * 31) + this.f1014a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1015b + "\n") + "    values:";
        for (String next : this.f1014a.keySet()) {
            str = str + "    " + next + ": " + this.f1014a.get(next) + "\n";
        }
        return str;
    }
}
