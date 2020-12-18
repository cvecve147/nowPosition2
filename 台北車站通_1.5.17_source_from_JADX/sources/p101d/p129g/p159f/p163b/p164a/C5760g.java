package p101d.p129g.p159f.p163b.p164a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;
import p101d.p129g.p159f.C5806e;

/* renamed from: d.g.f.b.a.g */
public final class C5760g {

    /* renamed from: a */
    private static final String f15925a = "g";

    /* renamed from: b */
    private static final Pattern f15926b = Pattern.compile(",");

    /* renamed from: a */
    public static Map<C5806e, Object> m21767a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C5806e.class);
        for (C5806e eVar : C5806e.values()) {
            if (!(eVar == C5806e.CHARACTER_SET || eVar == C5806e.NEED_RESULT_POINT_CALLBACK || eVar == C5806e.POSSIBLE_FORMATS)) {
                String name = eVar.name();
                if (extras.containsKey(name)) {
                    if (eVar.mo15474a().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!eVar.mo15474a().isInstance(obj)) {
                            Log.w(f15925a, "Ignoring hint " + eVar + " because it is not assignable from " + obj);
                        }
                    }
                    enumMap.put(eVar, obj);
                }
            }
        }
        Log.i(f15925a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
