package com.askey.taipeinavi.transport;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class TransportSearchFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TransportSearchFragment f4580a;

    /* renamed from: b */
    private View f4581b;

    /* renamed from: c */
    private View f4582c;

    /* renamed from: d */
    private View f4583d;

    /* renamed from: e */
    private View f4584e;

    /* renamed from: f */
    private View f4585f;

    /* renamed from: g */
    private View f4586g;

    public TransportSearchFragment_ViewBinding(TransportSearchFragment transportSearchFragment, View view) {
        this.f4580a = transportSearchFragment;
        transportSearchFragment.mTxtOrigin = (TextView) C1153c.m5853c(view, R.id.txtOrigin, "field 'mTxtOrigin'", TextView.class);
        transportSearchFragment.mTxtDest = (TextView) C1153c.m5853c(view, R.id.txtDest, "field 'mTxtDest'", TextView.class);
        transportSearchFragment.mTxtTime = (TextView) C1153c.m5853c(view, R.id.txtTime, "field 'mTxtTime'", TextView.class);
        transportSearchFragment.mLLayType = C1153c.m5849a(view, R.id.llayType, "field 'mLLayType'");
        transportSearchFragment.mTxtType = (TextView) C1153c.m5853c(view, R.id.txtType, "field 'mTxtType'", TextView.class);
        View a = C1153c.m5849a(view, R.id.tbtnSearchTransport, "field 'mTbtnSearch' and method 'onClick'");
        transportSearchFragment.mTbtnSearch = (TextView) C1153c.m5850a(a, R.id.tbtnSearchTransport, "field 'mTbtnSearch'", TextView.class);
        this.f4581b = a;
        a.setOnClickListener(new C1305b(this, transportSearchFragment));
        View a2 = C1153c.m5849a(view, R.id.llaySelectOrigin, "method 'onClick'");
        this.f4582c = a2;
        a2.setOnClickListener(new C1306c(this, transportSearchFragment));
        View a3 = C1153c.m5849a(view, R.id.llaySelectDest, "method 'onClick'");
        this.f4583d = a3;
        a3.setOnClickListener(new C1307d(this, transportSearchFragment));
        View a4 = C1153c.m5849a(view, R.id.llaySelectTime, "method 'onClick'");
        this.f4584e = a4;
        a4.setOnClickListener(new C1308e(this, transportSearchFragment));
        View a5 = C1153c.m5849a(view, R.id.llaySelectType, "method 'onClick'");
        this.f4585f = a5;
        a5.setOnClickListener(new C1309f(this, transportSearchFragment));
        View a6 = C1153c.m5849a(view, R.id.ibtnSwitch, "method 'onClick'");
        this.f4586g = a6;
        a6.setOnClickListener(new C1310g(this, transportSearchFragment));
    }

    /* renamed from: a */
    public void mo5375a() {
        TransportSearchFragment transportSearchFragment = this.f4580a;
        if (transportSearchFragment != null) {
            this.f4580a = null;
            transportSearchFragment.mTxtOrigin = null;
            transportSearchFragment.mTxtDest = null;
            transportSearchFragment.mTxtTime = null;
            transportSearchFragment.mLLayType = null;
            transportSearchFragment.mTxtType = null;
            transportSearchFragment.mTbtnSearch = null;
            this.f4581b.setOnClickListener((View.OnClickListener) null);
            this.f4581b = null;
            this.f4582c.setOnClickListener((View.OnClickListener) null);
            this.f4582c = null;
            this.f4583d.setOnClickListener((View.OnClickListener) null);
            this.f4583d = null;
            this.f4584e.setOnClickListener((View.OnClickListener) null);
            this.f4584e = null;
            this.f4585f.setOnClickListener((View.OnClickListener) null);
            this.f4585f = null;
            this.f4586g.setOnClickListener((View.OnClickListener) null);
            this.f4586g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
