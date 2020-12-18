package p287me.tatarka.support.internal.receivers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: me.tatarka.support.internal.receivers.b */
public class C6801b {

    /* renamed from: a */
    private static C6801b f18882a;

    /* renamed from: b */
    private final SharedPreferences f18883b;

    /* renamed from: me.tatarka.support.internal.receivers.b$a */
    static class C6802a {

        /* renamed from: a */
        SharedPreferences.Editor f18884a;

        private C6802a(SharedPreferences.Editor editor) {
            this.f18884a = editor;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6802a mo17393a(long j) {
            this.f18884a.putLong("next_delay_expired_elapsed_millis", j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6802a mo17394a(boolean z) {
            this.f18884a.putBoolean("battery_low", z);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17395a() {
            this.f18884a.apply();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6802a mo17396b(long j) {
            this.f18884a.putLong("next_job_expired_elapsed_millis", j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6802a mo17397b(boolean z) {
            this.f18884a.putBoolean("daydream_mode", z);
            return this;
        }
    }

    private C6801b(Context context) {
        this.f18883b = context.getSharedPreferences("me.tatarka.support.job.controllers.PREFS", 0);
    }

    /* renamed from: a */
    public static C6801b m25830a(Context context) {
        if (f18882a == null) {
            f18882a = new C6801b(context);
        }
        return f18882a;
    }

    /* renamed from: a */
    public void mo17387a() {
        this.f18883b.edit().clear().apply();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    public C6802a mo17388b() {
        return new C6802a(this.f18883b.edit());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo17389c() {
        return this.f18883b.getLong("next_delay_expired_elapsed_millis", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo17390d() {
        return this.f18883b.getLong("next_job_expired_elapsed_millis", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo17391e() {
        return this.f18883b.getBoolean("battery_low", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo17392f() {
        return this.f18883b.getBoolean("daydream_mode", false);
    }
}
