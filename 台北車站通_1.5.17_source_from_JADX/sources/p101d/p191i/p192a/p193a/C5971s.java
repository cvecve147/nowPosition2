package p101d.p191i.p192a.p193a;

import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import p101d.p191i.p192a.p199d.C6011b;

/* renamed from: d.i.a.a.s */
class C5971s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Handler f16569a;

    /* renamed from: b */
    final /* synthetic */ String f16570b;

    /* renamed from: c */
    final /* synthetic */ C5975w f16571c;

    C5971s(C5975w wVar, Handler handler, String str) {
        this.f16571c = wVar;
        this.f16569a = handler;
        this.f16570b = str;
    }

    public void run() {
        HashMap<String, List> b = this.f16571c.f16578d.mo15769b();
        if (b.size() == 0) {
            this.f16569a.postDelayed(this, 3000);
            return;
        }
        Log.d(C5975w.f16575a, this.f16570b);
        String substring = this.f16570b.substring(0, 3);
        char c = 65535;
        switch (substring.hashCode()) {
            case 64963:
                if (substring.equals("B01")) {
                    c = 0;
                    break;
                }
                break;
            case 64964:
                if (substring.equals("B02")) {
                    c = 1;
                    break;
                }
                break;
            case 64965:
                if (substring.equals("B03")) {
                    c = 2;
                    break;
                }
                break;
            case 64966:
                if (substring.equals("B04")) {
                    c = 3;
                    break;
                }
                break;
        }
        String str = "B2";
        List list = null;
        if (c == 0) {
            list = b.get("B1");
            str = "B1";
        } else if (c != 1) {
            str = c != 2 ? c != 3 ? null : "B4" : "B3";
        } else {
            list = b.get(str);
        }
        if (list != null) {
            Iterator<String> keys = this.f16571c.f16583i.keys();
            while (true) {
                if (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        if (this.f16571c.f16583i.getString(next).compareTo(str) == 0) {
                            str = next;
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            String substring2 = this.f16570b.substring(4);
            for (int i = 0; i < list.size(); i++) {
                C6011b bVar = (C6011b) list.get(i);
                if (bVar.mo15898d().contains(substring2)) {
                    this.f16571c.mo15794a(Integer.parseInt(str), bVar.mo15902g().x, bVar.mo15902g().y);
                    return;
                }
            }
        }
    }
}
