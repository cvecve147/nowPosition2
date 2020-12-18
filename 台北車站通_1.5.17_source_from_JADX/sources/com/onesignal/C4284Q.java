package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p007v4.app.C0297Y;
import com.onesignal.C4306Xa;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013b.p018b.p028h.p029a.C1024f;

/* renamed from: com.onesignal.Q */
public abstract class C4284Q extends JobIntentService {

    /* renamed from: j */
    private C4425ta f12700j;

    /* renamed from: k */
    private JSONObject f12701k;

    /* renamed from: l */
    private boolean f12702l;

    /* renamed from: m */
    private Long f12703m;

    /* renamed from: n */
    private C4285a f12704n = null;

    /* renamed from: com.onesignal.Q$a */
    public static class C4285a {

        /* renamed from: a */
        public C0297Y.C0302e f12705a;

        /* renamed from: b */
        public Integer f12706b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12393a(C4285a aVar) {
            Integer num;
            if (aVar != null && (num = aVar.f12706b) != null) {
                this.f12706b = num;
            }
        }
    }

    /* renamed from: a */
    static Intent m17023a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent().setAction("com.onesignal.NotificationExtender").setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (queryIntentServices.size() < 1) {
            return null;
        }
        intent.setComponent(new ComponentName(context, queryIntentServices.get(0).serviceInfo.name));
        return intent;
    }

    /* renamed from: b */
    private void m17024b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
            C4306Xa.m17135a(jVar, "No extras sent to NotificationExtenderService in its Intent!\n" + intent);
            return;
        }
        String string = extras.getString("json_payload");
        if (string == null) {
            C4306Xa.C4316j jVar2 = C4306Xa.C4316j.ERROR;
            C4306Xa.m17135a(jVar2, "json_payload key is nonexistent from bundle passed to NotificationExtenderService: " + extras);
            return;
        }
        try {
            this.f12701k = new JSONObject(string);
            this.f12702l = extras.getBoolean("restoring", false);
            if (extras.containsKey("android_notif_id")) {
                this.f12704n = new C4285a();
                this.f12704n.f12706b = Integer.valueOf(extras.getInt("android_notif_id"));
            }
            if (this.f12702l || !C4306Xa.m17144a((Context) this, this.f12701k)) {
                this.f12703m = Long.valueOf(extras.getLong("timestamp"));
                mo12392a(this.f12701k, this.f12702l);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private C4290S m17025e() {
        C4290S s = new C4290S(this);
        s.f12710c = this.f12702l;
        s.f12709b = this.f12701k;
        s.f12713f = this.f12703m;
        s.f12720m = this.f12704n;
        return s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4425ta mo12391a(C4285a aVar) {
        if (this.f12700j != null || aVar == null) {
            return null;
        }
        aVar.mo12393a(this.f12704n);
        this.f12700j = new C4425ta();
        C4290S e = m17025e();
        e.f12720m = aVar;
        this.f12700j.f13047a = C4277O.m16964a(e);
        return this.f12700j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12324a(Intent intent) {
        if (intent != null) {
            m17024b(intent);
            C1024f.m5439a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12392a(JSONObject jSONObject, boolean z) {
        boolean z2;
        String str;
        C4306Xa.C4316j jVar;
        C4440wa waVar = new C4440wa();
        waVar.f13097c = C4277O.m16966a(jSONObject);
        waVar.f13095a = z;
        waVar.f13096b = C4306Xa.m17211y();
        this.f12700j = null;
        try {
            z2 = mo5607a(waVar);
        } catch (Throwable th) {
            if (this.f12700j == null) {
                jVar = C4306Xa.C4316j.ERROR;
                str = "onNotificationProcessing throw an exception. Displaying normal OneSignal notification.";
            } else {
                jVar = C4306Xa.C4316j.ERROR;
                str = "onNotificationProcessing throw an exception. Extended notification displayed but custom processing did not finish.";
            }
            C4306Xa.m17136a(jVar, str, th);
            z2 = false;
        }
        if (this.f12700j == null) {
            if (!z2 && C4277O.m16976a(jSONObject.optString("alert"))) {
                C4277O.m16964a(m17025e());
            } else if (!z) {
                C4290S s = new C4290S(this);
                s.f12709b = jSONObject;
                s.f12720m = new C4285a();
                s.f12720m.f12706b = -1;
                C4277O.m16971a(s, true);
                C4306Xa.m17142a(C4277O.m16984d(jSONObject), false, false);
            } else if (this.f12704n != null) {
                C4277O.m16979b(m17025e());
            }
            if (z) {
                C4252Ia.m16865a(100);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo5607a(C4440wa waVar);

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo12327c() {
        return super.mo12327c();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
