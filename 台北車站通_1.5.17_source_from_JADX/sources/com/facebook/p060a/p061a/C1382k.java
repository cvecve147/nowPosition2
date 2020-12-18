package com.facebook.p060a.p061a;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C1601x;
import java.util.UUID;

/* renamed from: com.facebook.a.a.k */
class C1382k {

    /* renamed from: a */
    private Long f4888a;

    /* renamed from: b */
    private Long f4889b;

    /* renamed from: c */
    private int f4890c;

    /* renamed from: d */
    private Long f4891d;

    /* renamed from: e */
    private C1385n f4892e;

    /* renamed from: f */
    private UUID f4893f;

    public C1382k(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    public C1382k(Long l, Long l2, UUID uuid) {
        this.f4888a = l;
        this.f4889b = l2;
        this.f4893f = uuid;
    }

    /* renamed from: a */
    public static void m6648a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C1601x.m7386b()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        C1385n.m6664a();
    }

    /* renamed from: h */
    public static C1382k m6649h() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1601x.m7386b());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", (String) null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        C1382k kVar = new C1382k(Long.valueOf(j), Long.valueOf(j2));
        kVar.f4890c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        kVar.f4892e = C1385n.m6665b();
        kVar.f4891d = Long.valueOf(System.currentTimeMillis());
        kVar.f4893f = UUID.fromString(string);
        return kVar;
    }

    /* renamed from: a */
    public void mo6033a(C1385n nVar) {
        this.f4892e = nVar;
    }

    /* renamed from: a */
    public void mo6034a(Long l) {
        this.f4889b = l;
    }

    /* renamed from: b */
    public long mo6035b() {
        Long l = this.f4891d;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: c */
    public int mo6036c() {
        return this.f4890c;
    }

    /* renamed from: d */
    public UUID mo6037d() {
        return this.f4893f;
    }

    /* renamed from: e */
    public Long mo6038e() {
        return this.f4889b;
    }

    /* renamed from: f */
    public long mo6039f() {
        Long l;
        if (this.f4888a == null || (l = this.f4889b) == null) {
            return 0;
        }
        return l.longValue() - this.f4888a.longValue();
    }

    /* renamed from: g */
    public C1385n mo6040g() {
        return this.f4892e;
    }

    /* renamed from: i */
    public void mo6041i() {
        this.f4890c++;
    }

    /* renamed from: j */
    public void mo6042j() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C1601x.m7386b()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f4888a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f4889b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f4890c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f4893f.toString());
        edit.apply();
        C1385n nVar = this.f4892e;
        if (nVar != null) {
            nVar.mo6043c();
        }
    }
}
