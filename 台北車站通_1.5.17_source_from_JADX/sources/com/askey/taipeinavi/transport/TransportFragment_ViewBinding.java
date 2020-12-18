package com.askey.taipeinavi.transport;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class TransportFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TransportFragment f4579a;

    public TransportFragment_ViewBinding(TransportFragment transportFragment, View view) {
        this.f4579a = transportFragment;
        transportFragment.mLLayMain = (LinearLayout) C1153c.m5853c(view, R.id.prLayMain, "field 'mLLayMain'", LinearLayout.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        TransportFragment transportFragment = this.f4579a;
        if (transportFragment != null) {
            this.f4579a = null;
            transportFragment.mLLayMain = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
