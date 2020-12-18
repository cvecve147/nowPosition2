package p101d.p122f.p123a.p126c;

import android.content.Context;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p220g.C6181p;

/* renamed from: d.f.a.c.Q */
class C5365Q {

    /* renamed from: a */
    private final Context f15157a;

    /* renamed from: b */
    private final C6181p f15158b;

    public C5365Q(Context context, C6181p pVar) {
        this.f15157a = context;
        this.f15158b = pVar;
    }

    /* renamed from: a */
    private String m20649a(String str, String str2) {
        return m20651b(C6080l.m23048b(this.f15157a, str), str2);
    }

    /* renamed from: a */
    private boolean m20650a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: b */
    private String m20651b(String str, String str2) {
        return m20650a(str) ? str2 : str;
    }

    /* renamed from: a */
    public String mo14783a() {
        return m20649a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.f15158b.f17238g);
    }

    /* renamed from: b */
    public String mo14784b() {
        return m20649a("com.crashlytics.CrashSubmissionCancelTitle", this.f15158b.f17236e);
    }

    /* renamed from: c */
    public String mo14785c() {
        return m20649a("com.crashlytics.CrashSubmissionPromptMessage", this.f15158b.f17233b);
    }

    /* renamed from: d */
    public String mo14786d() {
        return m20649a("com.crashlytics.CrashSubmissionSendTitle", this.f15158b.f17234c);
    }

    /* renamed from: e */
    public String mo14787e() {
        return m20649a("com.crashlytics.CrashSubmissionPromptTitle", this.f15158b.f17232a);
    }
}
