package p101d.p191i.p192a.p193a;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.p002a.C0003d;
import p000a.p001a.p002a.C0006e;
import p000a.p001a.p002a.C0007f;
import p000a.p001a.p004c.C0017b;
import p101d.p191i.p192a.C5931a;

/* renamed from: d.i.a.a.x */
public class C5979x {

    /* renamed from: a */
    private static String f16600a = "STOManager";

    /* renamed from: b */
    private static BluetoothAdapter f16601b;

    /* renamed from: c */
    private static C0006e f16602c;

    /* renamed from: d */
    private static C0007f f16603d;

    /* renamed from: e */
    private Context f16604e;

    /* renamed from: f */
    private C0003d f16605f;

    /* renamed from: g */
    private Boolean f16606g;

    public C5979x(Context context, String str) {
        HashMap hashMap;
        Context context2 = context;
        String str2 = str;
        this.f16606g = false;
        this.f16604e = context2;
        String str3 = context2.getExternalFilesDir((String) null).toString() + "/" + str2 + "/";
        JSONObject b = new C5931a(context2).mo15720b().mo15929b("BEACON_" + str2);
        if (b == null) {
            Log.e(f16600a, "Empty Beacon list!!!!!!");
            return;
        }
        hashMap = new HashMap();
        Iterator<String> keys = b.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.compareTo("0") != 0) {
                try {
                    Integer valueOf = Integer.valueOf(b.getJSONObject(next).getInt("MapID"));
                    JSONArray jSONArray = b.getJSONObject(next).getJSONArray("PoiDetail");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        C0017b bVar = new C0017b();
                        bVar.f54a = Integer.valueOf((int) Float.parseFloat(jSONArray.getJSONObject(i).getString("PosX")));
                        bVar.f55b = Integer.valueOf((int) Float.parseFloat(jSONArray.getJSONObject(i).getString("PosY")));
                        bVar.f56c = valueOf;
                        String string = jSONArray.getJSONObject(i).getString("name");
                        hashMap.put(string.substring(0, 2) + ":" + string.substring(2, 4) + ":" + string.substring(4, 6) + ":" + string.substring(6, 8) + ":" + string.substring(8, 10) + ":" + string.substring(10, 12), bVar);
                    }
                    C0017b bVar2 = new C0017b();
                    bVar2.f54a = 1000;
                    bVar2.f55b = 150;
                    bVar2.f56c = 66;
                    C0017b bVar3 = new C0017b();
                    bVar3.f54a = 570;
                    bVar3.f55b = 380;
                    bVar3.f56c = 65;
                    hashMap.put("24:71:89:D1:89:B5", bVar3);
                    hashMap.put("CC:78:AB:14:F2:2A", bVar2);
                    hashMap.put("24:71:89:D1:8D:E4", bVar3);
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (StringIndexOutOfBoundsException e2) {
                    e2.printStackTrace();
                }
            }
        }
        Boolean valueOf2 = Boolean.valueOf(mo15806b());
        Log.d(f16600a, "isBTEnabled:" + valueOf2);
        this.f16605f = new C0003d(context2, str3, hashMap);
        this.f16605f.mo4a();
        return;
        hashMap = null;
    }

    public C5979x(Context context, String str, C0007f fVar, C0006e eVar) {
        this(context, str);
        if (fVar != null) {
            mo15803a(fVar);
            f16603d = fVar;
        }
        if (eVar != null) {
            mo15802a(eVar);
            f16602c = eVar;
        }
    }

    /* renamed from: a */
    private void m22646a(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo15802a(C0006e eVar) {
        C0003d dVar = this.f16605f;
        if (dVar != null) {
            dVar.mo5a(eVar);
        }
    }

    /* renamed from: a */
    public void mo15803a(C0007f fVar) {
        C0003d dVar = this.f16605f;
        if (dVar != null) {
            dVar.mo6a(fVar);
        }
    }

    /* renamed from: a */
    public void mo15804a(Boolean bool) {
        C0003d dVar = this.f16605f;
        if (dVar == null) {
            mo15805a();
            return;
        }
        dVar.mo8c();
        this.f16605f.mo7b();
        if (bool.booleanValue()) {
            mo15805a();
        }
    }

    /* renamed from: a */
    public boolean mo15805a() {
        f16601b = BluetoothAdapter.getDefaultAdapter();
        f16601b.disable();
        return !f16601b.isEnabled();
    }

    /* renamed from: b */
    public boolean mo15806b() {
        f16601b = BluetoothAdapter.getDefaultAdapter();
        BluetoothAdapter bluetoothAdapter = f16601b;
        if (bluetoothAdapter == null) {
            m22646a((int) HttpStatus.SC_INTERNAL_SERVER_ERROR);
            return false;
        }
        if (!bluetoothAdapter.isEnabled()) {
            f16601b.enable();
            int i = 0;
            while (!f16601b.isEnabled()) {
                m22646a(100);
                i++;
                if (i == 20) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public void mo15807c() {
    }
}
