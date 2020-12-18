package p101d.p122f.p123a.p126c;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.concurrent.CountDownLatch;
import p208e.p209a.p210a.p211a.p212a.p220g.C6181p;

/* renamed from: d.f.a.c.j */
class C5421j {

    /* renamed from: a */
    private final C5423b f15284a;

    /* renamed from: b */
    private final AlertDialog.Builder f15285b;

    /* renamed from: d.f.a.c.j$a */
    interface C5422a {
        /* renamed from: a */
        void mo14868a(boolean z);
    }

    /* renamed from: d.f.a.c.j$b */
    private static class C5423b {

        /* renamed from: a */
        private boolean f15286a;

        /* renamed from: b */
        private final CountDownLatch f15287b;

        private C5423b() {
            this.f15286a = false;
            this.f15287b = new CountDownLatch(1);
        }

        /* synthetic */ C5423b(C5410g gVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo14869a() {
            try {
                this.f15287b.await();
            } catch (InterruptedException unused) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo14870a(boolean z) {
            this.f15286a = z;
            this.f15287b.countDown();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo14871b() {
            return this.f15286a;
        }
    }

    private C5421j(AlertDialog.Builder builder, C5423b bVar) {
        this.f15284a = bVar;
        this.f15285b = builder;
    }

    /* renamed from: a */
    private static int m20842a(float f, int i) {
        return (int) (f * ((float) i));
    }

    /* renamed from: a */
    private static ScrollView m20843a(Activity activity, String str) {
        float f = activity.getResources().getDisplayMetrics().density;
        int a = m20842a(f, 5);
        TextView textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(a, a, a, a);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(m20842a(f, 14), m20842a(f, 2), m20842a(f, 10), m20842a(f, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    /* renamed from: a */
    public static C5421j m20844a(Activity activity, C6181p pVar, C5422a aVar) {
        C5423b bVar = new C5423b((C5410g) null);
        C5365Q q = new C5365Q(activity, pVar);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        ScrollView a = m20843a(activity, q.mo14785c());
        builder.setView(a).setTitle(q.mo14787e()).setCancelable(false).setNeutralButton(q.mo14786d(), new C5410g(bVar));
        if (pVar.f17235d) {
            builder.setNegativeButton(q.mo14784b(), new C5412h(bVar));
        }
        if (pVar.f17237f) {
            builder.setPositiveButton(q.mo14783a(), new C5419i(aVar, bVar));
        }
        return new C5421j(builder, bVar);
    }

    /* renamed from: a */
    public void mo14865a() {
        this.f15284a.mo14869a();
    }

    /* renamed from: b */
    public boolean mo14866b() {
        return this.f15284a.mo14871b();
    }

    /* renamed from: c */
    public void mo14867c() {
        this.f15285b.show();
    }
}
