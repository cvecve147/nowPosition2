package com.openlife.checkme.p100ui;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p028h.p029a.C1006a;

/* renamed from: com.openlife.checkme.ui.FormView */
public class FormView extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5013c f14216a;

    /* renamed from: b */
    private C5011a f14217b;

    /* renamed from: c */
    private DataSetObserver f14218c = new C5022f(this);

    /* renamed from: com.openlife.checkme.ui.FormView$a */
    public static class C5011a {

        /* renamed from: a */
        private final DataSetObservable f14219a = new DataSetObservable();

        /* renamed from: b */
        private final List<C5012b> f14220b = new ArrayList();

        /* renamed from: a */
        public View mo14051a(int i) {
            if (i < this.f14220b.size()) {
                return this.f14220b.get(i).mo14059b();
            }
            return null;
        }

        /* renamed from: a */
        public void mo14052a() {
            this.f14219a.notifyChanged();
        }

        /* renamed from: a */
        public void mo14053a(DataSetObserver dataSetObserver) {
            this.f14219a.registerObserver(dataSetObserver);
        }

        /* renamed from: a */
        public void mo14054a(C5012b bVar) {
            this.f14220b.add(bVar);
        }

        /* renamed from: b */
        public C5012b mo14055b(int i) {
            if (i < this.f14220b.size()) {
                return this.f14220b.get(i);
            }
            return null;
        }

        /* renamed from: b */
        public void mo14056b() {
            this.f14220b.clear();
        }

        /* renamed from: b */
        public void mo14057b(DataSetObserver dataSetObserver) {
            this.f14219a.unregisterObserver(dataSetObserver);
        }

        /* renamed from: c */
        public int mo14058c() {
            return this.f14220b.size();
        }
    }

    /* renamed from: com.openlife.checkme.ui.FormView$b */
    public static abstract class C5012b {

        /* renamed from: a */
        private View f14221a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f14222b = true;

        public C5012b(Context context) {
            this.f14221a = LayoutInflater.from(context).inflate(mo14038a(), (ViewGroup) null);
        }

        /* renamed from: a */
        public abstract int mo14038a();

        /* renamed from: b */
        public View mo14059b() {
            return this.f14221a;
        }
    }

    /* renamed from: com.openlife.checkme.ui.FormView$c */
    public interface C5013c {
        /* renamed from: a */
        void mo14060a(View view, int i);
    }

    public FormView(Context context) {
        super(context);
        setBackgroundColor(C1006a.m5386a(context, 17170443));
    }

    public FormView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundColor(C1006a.m5386a(context, 17170443));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19772a() {
        removeAllViews();
        if (this.f14217b != null) {
            for (int i = 0; i < this.f14217b.mo14058c(); i++) {
                View a = this.f14217b.mo14051a(i);
                if (a != null) {
                    addView(a);
                }
            }
            C5013c cVar = this.f14216a;
            if (cVar != null) {
                setOnItemClickListener(cVar);
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5011a aVar = this.f14217b;
        if (aVar != null) {
            aVar.mo14057b(this.f14218c);
        }
    }

    public void setAdapter(C5011a aVar) {
        if (this.f14217b != aVar) {
            this.f14217b = aVar;
            if (aVar != null) {
                aVar.mo14053a(this.f14218c);
            }
            m19772a();
        }
    }

    public void setOnItemClickListener(C5013c cVar) {
        this.f14216a = cVar;
        for (int i = 0; i < this.f14217b.mo14058c(); i++) {
            if (this.f14217b.mo14055b(i).f14222b) {
                this.f14217b.mo14051a(i).setOnClickListener(new C5023g(this, i));
            }
        }
    }
}
