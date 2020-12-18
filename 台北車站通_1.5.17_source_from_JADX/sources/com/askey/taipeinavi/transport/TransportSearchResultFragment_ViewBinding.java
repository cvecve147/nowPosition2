package com.askey.taipeinavi.transport;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class TransportSearchResultFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TransportSearchResultFragment f4587a;

    public TransportSearchResultFragment_ViewBinding(TransportSearchResultFragment transportSearchResultFragment, View view) {
        this.f4587a = transportSearchResultFragment;
        transportSearchResultFragment.mTxtOrigin = (TextView) C1153c.m5853c(view, R.id.txtOrigin, "field 'mTxtOrigin'", TextView.class);
        transportSearchResultFragment.mTxtDest = (TextView) C1153c.m5853c(view, R.id.txtDest, "field 'mTxtDest'", TextView.class);
        transportSearchResultFragment.mTxtTime = (TextView) C1153c.m5853c(view, R.id.txtTime, "field 'mTxtTime'", TextView.class);
        transportSearchResultFragment.mLLayTable = (LinearLayout) C1153c.m5853c(view, R.id.llayTable, "field 'mLLayTable'", LinearLayout.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        TransportSearchResultFragment transportSearchResultFragment = this.f4587a;
        if (transportSearchResultFragment != null) {
            this.f4587a = null;
            transportSearchResultFragment.mTxtOrigin = null;
            transportSearchResultFragment.mTxtDest = null;
            transportSearchResultFragment.mTxtTime = null;
            transportSearchResultFragment.mLLayTable = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
