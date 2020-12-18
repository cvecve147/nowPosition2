package com.stomap.stomapbutterflysdk;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.C1997i;
import com.google.android.gms.common.C2063j;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p201j.p202a.C6036g;
import p101d.p201j.p202a.C6037h;
import p101d.p201j.p202a.C6041i;
import p101d.p201j.p202a.C6042j;
import p101d.p201j.p203b.C6046b;

public class STOMAPButterflySDK extends IntentService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f14459a = false;

    /* renamed from: b */
    private Context f14460b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6037h f14461c;

    /* renamed from: d */
    private C6046b f14462d;

    /* renamed from: e */
    private int f14463e = 0;

    /* renamed from: f */
    private final int f14464f = BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT;

    /* renamed from: g */
    private Timer f14465g = new Timer(false);

    /* renamed from: h */
    private Timer f14466h = new Timer(false);

    /* renamed from: i */
    private List<C5099b> f14467i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<C6036g> f14468j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f14469k = false;

    /* renamed from: l */
    private String f14470l;

    /* renamed from: m */
    private String f14471m;

    /* renamed from: n */
    private C5103b f14472n;

    /* renamed from: com.stomap.stomapbutterflysdk.STOMAPButterflySDK$a */
    private class C5098a implements C6041i {
        private C5098a() {
        }

        /* renamed from: a */
        public void mo14178a(List<C6036g> list) {
            if (STOMAPButterflySDK.f14459a) {
                Log.i("STOMAPButterflySDK", "onScanResult has " + list.size() + " signals scanned");
            }
            for (int i = 0; i < list.size(); i++) {
                if (STOMAPButterflySDK.this.f14469k) {
                    STOMAPButterflySDK.this.f14468j.add(list.get(i));
                    if (STOMAPButterflySDK.f14459a) {
                        Log.i("STOMAPButterflySDK", "STONodeCallBack:" + list.get(i).mo15977g() + ":" + list.get(i).mo15969a() + ":" + list.get(i).mo15974d() + ":" + list.get(i).mo15976f() + ":" + list.get(i).mo15972b());
                    }
                }
            }
        }
    }

    /* renamed from: com.stomap.stomapbutterflysdk.STOMAPButterflySDK$b */
    private class C5099b {

        /* renamed from: a */
        public String f14474a = "";

        /* renamed from: b */
        public String f14475b = "";

        /* renamed from: c */
        public String f14476c = "";

        /* renamed from: d */
        public List<C6036g> f14477d;

        public C5099b(String str, String str2, String str3) {
            this.f14474a = str;
            this.f14475b = str2;
            this.f14476c = str3;
            this.f14477d = new ArrayList();
        }

        /* renamed from: a */
        public void mo14179a() {
            for (int i = 0; i < this.f14477d.size(); i++) {
                this.f14477d.get(i).mo15970a(this.f14477d.get(i).mo15977g() == C6042j.WIFI ? this.f14477d.get(i).mo15974d() + 120.0f : this.f14477d.get(i).mo15974d() + 120.0f + 128.0f);
            }
        }

        /* renamed from: b */
        public void mo14180b() {
            String a;
            int valueOf;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            for (int i = 0; i < this.f14477d.size(); i++) {
                if (!hashMap.containsKey(this.f14477d.get(i).mo15969a())) {
                    hashMap.put(this.f14477d.get(i).mo15969a(), this.f14477d.get(i));
                    hashMap2.put(this.f14477d.get(i).mo15969a(), Integer.valueOf((int) this.f14477d.get(i).mo15974d()));
                    a = this.f14477d.get(i).mo15969a();
                    valueOf = 1;
                } else {
                    if (this.f14477d.get(i).mo15977g() == C6042j.BEACON) {
                        int b = this.f14477d.get(i).mo15972b();
                        int c = this.f14477d.get(i).mo15973c();
                        this.f14477d.get(i).mo15969a();
                        String f = this.f14477d.get(i).mo15976f();
                        int b2 = ((C6036g) hashMap.get(this.f14477d.get(i).mo15969a())).mo15972b();
                        int c2 = ((C6036g) hashMap.get(this.f14477d.get(i).mo15969a())).mo15973c();
                        ((C6036g) hashMap.get(this.f14477d.get(i).mo15969a())).mo15969a();
                        String f2 = ((C6036g) hashMap.get(this.f14477d.get(i).mo15969a())).mo15976f();
                        if (b == b2 && c == c2 && !f.equals(f2) && b != 0 && c != 0) {
                            C6036g gVar = new C6036g(this.f14477d.get(i));
                            gVar.mo15971a("FF:FF:FF:FF:FF:FF");
                            hashMap.put("FF:FF:FF:FF:FF:FF", gVar);
                            hashMap2.put("FF:FF:FF:FF:FF:FF", Integer.valueOf((int) gVar.mo15974d()));
                            hashMap3.put("FF:FF:FF:FF:FF:FF", 1);
                        }
                    }
                    hashMap2.put(this.f14477d.get(i).mo15969a(), Integer.valueOf(((Integer) hashMap2.get(this.f14477d.get(i).mo15969a())).intValue() + ((int) this.f14477d.get(i).mo15974d())));
                    a = this.f14477d.get(i).mo15969a();
                    valueOf = Integer.valueOf(((Integer) hashMap3.get(this.f14477d.get(i).mo15969a())).intValue() + 1);
                }
                hashMap3.put(a, valueOf);
            }
            if (STOMAPButterflySDK.f14459a) {
                Log.i("STOMAPButterflySDK", "scanCount:" + hashMap.size());
            }
            if (hashMap.size() != 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    C6036g gVar2 = (C6036g) entry.getValue();
                    gVar2.mo15970a(((float) ((Integer) hashMap2.get(entry.getKey())).intValue()) / ((float) ((Integer) hashMap3.get(entry.getKey())).intValue()));
                    arrayList.add(gVar2);
                    it.remove();
                }
                if (STOMAPButterflySDK.f14459a) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    }
                }
                this.f14477d = new ArrayList(arrayList);
            }
        }

        /* renamed from: c */
        public void mo14181c() {
            for (int i = 0; i < this.f14477d.size() - 1; i++) {
                int i2 = -1;
                Float valueOf = Float.valueOf(-9999.0f);
                for (int i3 = i; i3 < this.f14477d.size(); i3++) {
                    if (this.f14477d.get(i3).mo15974d() > valueOf.floatValue()) {
                        valueOf = Float.valueOf(this.f14477d.get(i3).mo15974d());
                        i2 = i3;
                    }
                }
                this.f14477d.remove(i2);
                this.f14477d.add(i, this.f14477d.get(i2));
            }
        }
    }

    /* renamed from: com.stomap.stomapbutterflysdk.STOMAPButterflySDK$c */
    private class C5100c extends TimerTask {
        private C5100c() {
        }

        public void run() {
            if (STOMAPButterflySDK.f14459a) {
                Log.i("STOMAPButterflySDK", "idle Timer");
            }
            STOMAPButterflySDK.this.m19981c();
        }
    }

    /* renamed from: com.stomap.stomapbutterflysdk.STOMAPButterflySDK$d */
    private class C5101d extends TimerTask {
        private C5101d() {
        }

        public void run() {
            if (STOMAPButterflySDK.f14459a) {
                Log.i("STOMAPButterflySDK", "scan Timer");
                Log.i("STOMAPButterflySDK", "stoScanManager.stopScan()");
            }
            STOMAPButterflySDK.this.f14461c.mo15979b();
            try {
                STOMAPButterflySDK.this.m19983d();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e2) {
                e2.printStackTrace();
            }
            boolean unused = STOMAPButterflySDK.this.f14469k = false;
        }
    }

    public STOMAPButterflySDK() {
        super("STOMAPButterflySDK");
    }

    /* renamed from: a */
    private synchronized String m19975a(Context context) {
        AdvertisingIdClient.Info info;
        String str = null;
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (C1997i | C2063j e) {
            e.printStackTrace();
            info = null;
            str = info.getId();
            return str;
        } catch (IOException e2) {
            e2.printStackTrace();
            info = null;
            str = info.getId();
            return str;
        }
        try {
            str = info.getId();
        } catch (NullPointerException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: b */
    private synchronized void m19980b() {
        if (f14459a) {
            Log.i("STOMAPButterflySDK", "start()");
        }
        if (this.f14465g == null) {
            this.f14465g = new Timer(false);
        }
        this.f14465g.schedule(new C5100c(), 0, (long) this.f14463e);
        if (f14459a) {
            Log.i("STOMAPButterflySDK", "end of start()");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m19981c() {
        if (f14459a) {
            Log.i("STOMAPButterflySDK", "startCollecting()");
        }
        this.f14469k = true;
        if (f14459a) {
            Log.i("STOMAPButterflySDK", "stoScanManager.startScan();");
        }
        this.f14461c.mo15978a();
        if (this.f14466h == null) {
            this.f14466h = new Timer(false);
        }
        this.f14466h.schedule(new C5101d(), 5000);
        if (f14459a) {
            Log.i("STOMAPButterflySDK", "end of startCollecting()");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m19983d() {
        C5099b bVar = new C5099b("", "", "");
        bVar.f14477d = new ArrayList(this.f14468j);
        this.f14467i.add(bVar);
        bVar.mo14180b();
        bVar.mo14181c();
        bVar.mo14179a();
        this.f14468j.clear();
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < bVar.f14477d.size(); i++) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("MAC", bVar.f14477d.get(i).mo15975e());
                jSONObject2.put("RSSI", (int) bVar.f14477d.get(i).mo15974d());
                jSONObject2.put("uuid", bVar.f14477d.get(i).mo15976f());
                jSONObject2.put("major", bVar.f14477d.get(i).mo15972b());
                jSONObject2.put("minor", bVar.f14477d.get(i).mo15973c());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("data", jSONArray);
            this.f14462d.mo15984a(jSONObject);
            this.f14462d.mo15988e();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        this.f14470l = intent.getStringExtra("APIKEY");
        this.f14471m = intent.getStringExtra("ALIASKEY");
        this.f14472n = (C5103b) intent.getSerializableExtra("ALIASTYPE");
        if (f14459a) {
            Log.i("STOMAPButterflySDK", "STOMAPButterflySDK initialized with " + this.f14470l + " " + this.f14471m + " " + this.f14472n);
        }
        this.f14460b = getApplicationContext();
        this.f14462d = new C6046b(this.f14470l, m19975a(this.f14460b), this.f14471m, this.f14472n.mo14184a());
        try {
            if (this.f14462d.mo15987d().booleanValue() && this.f14462d.mo15985b().booleanValue()) {
                this.f14467i = new ArrayList();
                this.f14468j = new ArrayList();
                this.f14461c = new C6037h(this.f14460b, new C5098a(), C6037h.C6039b.GENERALSCANNING);
                this.f14463e = this.f14462d.mo15986c().intValue();
                m19980b();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }
}
