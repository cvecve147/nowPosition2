package com.askey.taipeinavi.transport;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class TransportTimeListViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TransportTimeListViewHolder f4588a;

    public TransportTimeListViewHolder_ViewBinding(TransportTimeListViewHolder transportTimeListViewHolder, View view) {
        this.f4588a = transportTimeListViewHolder;
        transportTimeListViewHolder.mTxtCode = (TextView) C1153c.m5853c(view, R.id.txtCode, "field 'mTxtCode'", TextView.class);
        transportTimeListViewHolder.mTxtEtd = (TextView) C1153c.m5853c(view, R.id.txtEtd, "field 'mTxtEtd'", TextView.class);
        transportTimeListViewHolder.mTxtEta = (TextView) C1153c.m5853c(view, R.id.txtEta, "field 'mTxtEta'", TextView.class);
        transportTimeListViewHolder.mTxtType = (TextView) C1153c.m5853c(view, R.id.txtType, "field 'mTxtType'", TextView.class);
        transportTimeListViewHolder.mTxtFare = (TextView) C1153c.m5853c(view, R.id.txtFare, "field 'mTxtFare'", TextView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        TransportTimeListViewHolder transportTimeListViewHolder = this.f4588a;
        if (transportTimeListViewHolder != null) {
            this.f4588a = null;
            transportTimeListViewHolder.mTxtCode = null;
            transportTimeListViewHolder.mTxtEtd = null;
            transportTimeListViewHolder.mTxtEta = null;
            transportTimeListViewHolder.mTxtType = null;
            transportTimeListViewHolder.mTxtFare = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
