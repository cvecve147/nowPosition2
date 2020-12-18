package com.askey.taipeinavi.p059ui;

import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.p058d.C1209c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.askey.taipeinavi.ui.SearchResultView */
public class SearchResultView extends LinearLayout implements C1319b {

    /* renamed from: a */
    private C1209c f4616a;

    /* renamed from: b */
    private C1322e f4617b;

    /* renamed from: c */
    private C1318a f4618c;

    /* renamed from: d */
    private ArrayList<C1320c> f4619d;

    /* renamed from: e */
    private boolean f4620e = false;
    ListView mListSearchResult;
    TextView mTxtResultEmpty;

    public SearchResultView(Context context) {
        super(context);
        m6435e();
    }

    public SearchResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6435e();
    }

    public SearchResultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6435e();
    }

    /* renamed from: a */
    private void m6432a(C1320c cVar) {
        ArrayList<C1320c> arrayList = this.f4619d;
        if (arrayList != null) {
            C1320c cVar2 = null;
            Iterator<C1320c> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1320c next = it.next();
                if (cVar.f4631o == next.f4631o) {
                    cVar2 = next;
                    break;
                }
            }
            if (cVar2 != null) {
                this.f4619d.remove(cVar2);
            }
        } else {
            this.f4619d = new ArrayList<>();
        }
        this.f4619d.add(0, cVar);
        Iterator<C1320c> it2 = this.f4619d.iterator();
        int i = 5;
        while (it2.hasNext()) {
            it2.next().f4632p = i;
            if (i > 0) {
                i--;
            }
        }
        this.f4616a.mo5507a(this.f4619d);
        if (this.f4619d.size() > 5) {
            ArrayList<C1320c> arrayList2 = this.f4619d;
            arrayList2.remove(arrayList2.size() - 1);
        }
    }

    /* renamed from: c */
    private void m6433c(String str) {
        int i;
        TextView textView;
        if (this.f4620e) {
            Cursor d = this.f4616a.mo5512d(str);
            this.f4617b.changeCursor(d);
            if (d.getCount() == 0) {
                textView = this.mTxtResultEmpty;
                i = 0;
            } else {
                i = 8;
                if (this.mTxtResultEmpty.getVisibility() != 8) {
                    textView = this.mTxtResultEmpty;
                } else {
                    return;
                }
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: d */
    private void m6434d() {
        setVisibility(this.f4620e ? 0 : 8);
    }

    /* renamed from: e */
    private void m6435e() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_search_result, this, true);
        ButterKnife.m5843a((Object) this, (View) this);
        int[] iArr = {R.id.txtName, R.id.txtMapName, R.id.imgHistory};
        this.f4617b = new C1322e(getContext(), new String[]{"name", "map_name", "is_history"}, iArr);
        this.mListSearchResult.setAdapter(this.f4617b);
    }

    /* renamed from: a */
    public void mo5544a() {
    }

    /* renamed from: a */
    public void mo5545a(String str) {
        m6433c(str);
    }

    /* renamed from: b */
    public void mo5657b() {
        this.f4616a = new C1209c(getContext());
        this.f4616a.mo5514e("Poi");
        this.f4619d = this.f4616a.mo5513e();
    }

    /* renamed from: b */
    public void mo5546b(String str) {
        this.f4620e = true;
        m6433c(str);
        m6434d();
    }

    /* renamed from: c */
    public void mo5658c() {
        this.f4617b = null;
        this.f4618c = null;
        C1209c cVar = this.f4616a;
        if (cVar != null) {
            cVar.mo17135a();
            this.f4616a = null;
        }
    }

    public void onCancel() {
        this.f4620e = false;
        m6434d();
    }

    public void onItemClick(int i) {
        C1320c a = this.f4616a.mo5505a((Cursor) this.mListSearchResult.getItemAtPosition(i));
        m6432a(a);
        C1318a aVar = this.f4618c;
        if (aVar != null) {
            aVar.mo5604a(a);
        }
        this.f4620e = false;
        m6434d();
        this.f4617b.changeCursor((Cursor) null);
    }

    public void setOnResultItemClickListener(C1318a aVar) {
        this.f4618c = aVar;
    }
}
