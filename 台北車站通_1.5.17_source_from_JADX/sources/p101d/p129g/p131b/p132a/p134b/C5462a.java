package p101d.p129g.p131b.p132a.p134b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C1991e;
import com.google.android.gms.common.internal.C2028g;
import java.util.LinkedList;
import p101d.p129g.p131b.p132a.p134b.C5467c;

/* renamed from: d.g.b.a.b.a */
public abstract class C5462a<T extends C5467c> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f15374a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bundle f15375b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LinkedList<C5463a> f15376c;

    /* renamed from: d */
    private final C5469e<T> f15377d = new C5472g(this);

    /* renamed from: d.g.b.a.b.a$a */
    private interface C5463a {
        /* renamed from: a */
        void mo14927a(C5467c cVar);

        int getState();
    }

    /* renamed from: a */
    private final void m20944a(int i) {
        while (!this.f15376c.isEmpty() && this.f15376c.getLast().getState() >= i) {
            this.f15376c.removeLast();
        }
    }

    /* renamed from: a */
    private final void m20945a(Bundle bundle, C5463a aVar) {
        T t = this.f15374a;
        if (t != null) {
            aVar.mo14927a(t);
            return;
        }
        if (this.f15376c == null) {
            this.f15376c = new LinkedList<>();
        }
        this.f15376c.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.f15375b;
            if (bundle2 == null) {
                this.f15375b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo11215a(this.f15377d);
    }

    /* renamed from: a */
    public static void m20946a(FrameLayout frameLayout) {
        C1991e a = C1991e.m8751a();
        Context context = frameLayout.getContext();
        int c = a.mo7540c(context);
        String b = C2028g.m8949b(context, c);
        String a2 = C2028g.m8945a(context, c);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        Intent a3 = a.mo7532a(context, c, (String) null);
        if (a3 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(a2);
            linearLayout.addView(button);
            button.setOnClickListener(new C5474i(context, a3));
        }
    }

    /* renamed from: a */
    public T mo14919a() {
        return this.f15374a;
    }

    /* renamed from: a */
    public void mo14920a(Bundle bundle) {
        m20945a(bundle, (C5463a) new C5473h(this, bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11215a(C5469e<T> eVar);

    /* renamed from: b */
    public void mo14921b() {
        T t = this.f15374a;
        if (t != null) {
            t.onDestroy();
        } else {
            m20944a(1);
        }
    }

    /* renamed from: c */
    public void mo14922c() {
        T t = this.f15374a;
        if (t != null) {
            t.onLowMemory();
        }
    }

    /* renamed from: d */
    public void mo14923d() {
        T t = this.f15374a;
        if (t != null) {
            t.onPause();
        } else {
            m20944a(5);
        }
    }

    /* renamed from: e */
    public void mo14924e() {
        m20945a((Bundle) null, (C5463a) new C5476k(this));
    }

    /* renamed from: f */
    public void mo14925f() {
        m20945a((Bundle) null, (C5463a) new C5475j(this));
    }

    /* renamed from: g */
    public void mo14926g() {
        T t = this.f15374a;
        if (t != null) {
            t.mo11213p();
        } else {
            m20944a(4);
        }
    }
}
