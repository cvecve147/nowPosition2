package com.openlife.checkme.checkme_special.feedback;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.checkme_special.feedback.SpFeedBackFragment;

public class SpFeedBackFragment_ViewBinding<T extends SpFeedBackFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13981a;

    /* renamed from: b */
    private View f13982b;

    /* renamed from: c */
    private View f13983c;

    /* renamed from: d */
    private View f13984d;

    /* renamed from: e */
    private View f13985e;

    /* renamed from: f */
    private View f13986f;

    public SpFeedBackFragment_ViewBinding(T t, View view) {
        this.f13981a = t;
        View a = C1153c.m5849a(view, C4956g.qa_btn, "field 'mSearchQATv' and method 'QAClick'");
        t.mSearchQATv = (Button) C1153c.m5850a(a, C4956g.qa_btn, "field 'mSearchQATv'", Button.class);
        this.f13982b = a;
        a.setOnClickListener(new C4891d(this, t));
        t.mPhoneEdit = (EditText) C1153c.m5853c(view, C4956g.phone_edit, "field 'mPhoneEdit'", EditText.class);
        View a2 = C1153c.m5849a(view, C4956g.qa_question_edit, "field 'mQuestionEdit' and method 'OnClick'");
        t.mQuestionEdit = (EditText) C1153c.m5850a(a2, C4956g.qa_question_edit, "field 'mQuestionEdit'", EditText.class);
        this.f13983c = a2;
        a2.setOnClickListener(new C4892e(this, t));
        View a3 = C1153c.m5849a(view, C4956g.qa_event_edit, "field 'mEventEdit' and method 'eventClick'");
        t.mEventEdit = (EditText) C1153c.m5850a(a3, C4956g.qa_event_edit, "field 'mEventEdit'", EditText.class);
        this.f13984d = a3;
        a3.setOnClickListener(new C4893f(this, t));
        t.mStoreNameEdit = (EditText) C1153c.m5853c(view, C4956g.qa_store_name_edit, "field 'mStoreNameEdit'", EditText.class);
        View a4 = C1153c.m5849a(view, C4956g.qa_date_edit, "field 'mDateEdit' and method 'dateClick'");
        t.mDateEdit = (EditText) C1153c.m5850a(a4, C4956g.qa_date_edit, "field 'mDateEdit'", EditText.class);
        this.f13985e = a4;
        a4.setOnClickListener(new C4894g(this, t));
        t.mDetailEdit = (EditText) C1153c.m5853c(view, C4956g.qa_detail_edit, "field 'mDetailEdit'", EditText.class);
        View a5 = C1153c.m5849a(view, C4956g.qa_submit_btn, "method 'submitClick'");
        this.f13986f = a5;
        a5.setOnClickListener(new C4895h(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13981a;
        if (t != null) {
            t.mSearchQATv = null;
            t.mPhoneEdit = null;
            t.mQuestionEdit = null;
            t.mEventEdit = null;
            t.mStoreNameEdit = null;
            t.mDateEdit = null;
            t.mDetailEdit = null;
            this.f13982b.setOnClickListener((View.OnClickListener) null);
            this.f13982b = null;
            this.f13983c.setOnClickListener((View.OnClickListener) null);
            this.f13983c = null;
            this.f13984d.setOnClickListener((View.OnClickListener) null);
            this.f13984d = null;
            this.f13985e.setOnClickListener((View.OnClickListener) null);
            this.f13985e = null;
            this.f13986f.setOnClickListener((View.OnClickListener) null);
            this.f13986f = null;
            this.f13981a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
