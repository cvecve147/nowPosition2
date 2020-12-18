package com.openlife.checkme.p100ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p011v7.app.C0591E;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.openlife.checkme.C4957h;

/* renamed from: com.openlife.checkme.ui.ListDialog */
public class ListDialog extends C0591E {

    /* renamed from: a */
    private Context f14225a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String[] f14226b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5014a f14227c;
    ListView mListView;

    /* renamed from: com.openlife.checkme.ui.ListDialog$a */
    public interface C5014a {
        /* renamed from: a */
        void mo13416a(int i, String str);
    }

    public ListDialog(Context context, String[] strArr, C5014a aVar) {
        super(context);
        this.f14225a = context;
        this.f14226b = strArr;
        this.f14227c = aVar;
    }

    /* renamed from: b */
    private void m19791b() {
        if (getWindow() != null) {
            Display defaultDisplay = ((WindowManager) this.f14225a.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            getWindow().setLayout((int) (((double) displayMetrics.widthPixels) * 0.8d), -2);
            getWindow().setGravity(17);
        }
        this.mListView.setAdapter(new ArrayAdapter(this.f14225a, 17367043, this.f14226b));
        this.mListView.setOnItemClickListener(new C5024h(this));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(C4957h.view_checkme_qa_item_list);
        ButterKnife.m5841a((Dialog) this);
        m19791b();
    }
}
