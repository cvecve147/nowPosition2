package com.sto.stolibrary.customActivities;

import android.util.Log;
import android.widget.Toast;
import com.sto.stolibrary.customActivities.SearchingActivity;
import p101d.p119e.p120a.C5288s;
import p101d.p119e.p120a.C5295x;
import p101d.p191i.p192a.C6024f;

/* renamed from: com.sto.stolibrary.customActivities.E */
class C5060E implements C5288s.C5289a {

    /* renamed from: a */
    final /* synthetic */ SearchingActivity.C5066a f14359a;

    C5060E(SearchingActivity.C5066a aVar) {
        this.f14359a = aVar;
    }

    /* renamed from: a */
    public void mo14131a(C5295x xVar) {
        Log.d(SearchingActivity.f14396d, xVar.toString());
        SearchingActivity searchingActivity = SearchingActivity.this;
        Toast.makeText(searchingActivity, searchingActivity.getString(C6024f.unknown_searching_error), 0).show();
    }
}
