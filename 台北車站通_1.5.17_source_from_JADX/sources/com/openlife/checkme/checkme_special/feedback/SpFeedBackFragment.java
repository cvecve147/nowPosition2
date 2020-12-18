package com.openlife.checkme.checkme_special.feedback;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.openlife.checkme.C4937d;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.C4757r;
import com.openlife.checkme.activity.browser.BrowserActivity;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4946i;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p100ui.ListDialog;
import java.util.Calendar;

public class SpFeedBackFragment extends C4672k {

    /* renamed from: a */
    private Context f13980a;
    EditText mDateEdit;
    EditText mDetailEdit;
    EditText mEventEdit;
    EditText mPhoneEdit;
    EditText mQuestionEdit;
    Button mSearchQATv;
    EditText mStoreNameEdit;

    /* renamed from: a */
    public static SpFeedBackFragment m19264a() {
        return new SpFeedBackFragment();
    }

    /* renamed from: a */
    private void m19265a(int i, ListDialog.C5014a aVar) {
        new ListDialog(getActivity(), this.f13980a.getResources().getStringArray(i), aVar).show();
    }

    /* renamed from: a */
    private void m19266a(EditText editText) {
        Calendar instance = Calendar.getInstance();
        new DatePickerDialog(getActivity(), new C4890c(this, editText), instance.get(1), instance.get(2), instance.get(5)).show();
    }

    public void OnClick() {
        m19265a(C4937d.checkme_s_qa_qustion_title_array, (ListDialog.C5014a) new C4888a(this));
    }

    public void QAClick() {
        BrowserActivity.m17921a(getActivity(), C4946i.m19501a((Context) getActivity()), C4961l.other_question);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    public void dateClick(View view) {
        m19266a((EditText) view);
    }

    public void eventClick() {
        m19265a(C4937d.checkme_s_qa_event_title_array, (ListDialog.C5014a) new C4889b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_feedback_cm_s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C4757r mo12600l() {
        return null;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13980a = getActivity().getBaseContext();
    }

    public void submitClick() {
        if (this.mPhoneEdit.getText().toString().isEmpty() || this.mStoreNameEdit.getText().toString().isEmpty() || this.mDateEdit.getText().toString().equals(getString(C4961l.checkme_s_qa_date)) || this.mDetailEdit.getText().toString().isEmpty()) {
            mo12965f(getString(C4961l.checkme_s_qa_format_error));
            return;
        }
        String format = String.format(getString(C4961l.checkme_s_qa_email_title), new Object[]{getString(C4961l.checkme_s_qa_email_company)});
        String obj = this.mPhoneEdit.getText().toString();
        String obj2 = this.mQuestionEdit.getText().toString();
        String obj3 = this.mEventEdit.getText().toString();
        String obj4 = this.mStoreNameEdit.getText().toString();
        String obj5 = this.mDateEdit.getText().toString();
        String obj6 = this.mDetailEdit.getText().toString();
        String format2 = String.format(getString(C4961l.checkme_s_qa_email_content), new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
        C4883m.m19228a(getActivity(), C4947j.m19536a().mo13553d().mo13486f(), format, format2);
    }
}
