package com.askey.taipeinavi.p058d;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.askey.taipeinavi.R;
import p013b.p018b.p028h.p029a.C1006a;
import p267i.p274b.p282c.C6746g;
import p267i.p274b.p283d.C6775k;

/* renamed from: com.askey.taipeinavi.d.f */
public class C1212f {
    /* renamed from: a */
    public static void m6030a(Activity activity, String str) {
        C6775k.m25611a(activity, false, str);
    }

    /* renamed from: a */
    public static void m6031a(Context context) {
        C6775k.m25601a(context, (int) R.string.btxt_contact_us_msg, (int) R.string.dialog_btn_ok, -1, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: a */
    public static void m6032a(Context context, DialogInterface.OnClickListener onClickListener) {
        C6775k.m25600a(context, (int) R.string.dialog_evaluation_hint_title, (int) R.string.dialog_evaluation_hint_msg, (int) R.string.dialog_evaluation_hint_cancel, (int) R.string.dialog_evaluation_hint_ok, onClickListener, onClickListener).setCancelable(false);
    }

    /* renamed from: a */
    public static void m6033a(Context context, View.OnClickListener onClickListener) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_uupon_tutorial, (ViewGroup) null);
        AlertDialog a = C6775k.m25603a(context, inflate, -1, -1, -1, (DialogInterface.OnClickListener) null);
        a.getWindow().setBackgroundDrawable((Drawable) null);
        a.setCancelable(false);
        ((ImageButton) inflate.findViewById(R.id.ibtnClose)).setOnClickListener(new C1211e(a, onClickListener));
    }

    /* renamed from: a */
    public static void m6034a(Context context, String str) {
        C6775k.m25614a(context, (String) null, str);
    }

    /* renamed from: a */
    public static void m6035a(Context context, String str, DialogInterface.OnClickListener onClickListener) {
        Context context2 = context;
        C6775k.m25605a(context2, (View) null, String.format(context.getString(R.string.dialog_phone_call_msg), new Object[]{str}), (int) R.string.dialog_btn_cancel, (int) R.string.dialog_btn_ok, onClickListener);
    }

    /* renamed from: b */
    public static void m6036b(Context context) {
        C6775k.m25607a(context, LayoutInflater.from(context).inflate(R.layout.view_gift_hint, (ViewGroup) null, false), context.getString(R.string.txt_gift_tutorial_title), (String) null, R.string.txt_ok, -1, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null).setCancelable(false);
    }

    /* renamed from: b */
    public static void m6037b(Context context, DialogInterface.OnClickListener onClickListener) {
        C6775k.m25607a(context, (View) null, context.getString(R.string.dialog_fun_taipei_title), context.getString(R.string.dialog_fun_taipei_msg), R.string.dialog_btn_cancel, R.string.dialog_btn_ok, onClickListener, onClickListener);
    }

    /* renamed from: c */
    public static void m6038c(Context context) {
        C6775k.m25601a(context, (int) R.string.txt_language_msg, (int) R.string.dialog_btn_ok, -1, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: c */
    public static void m6039c(Context context, DialogInterface.OnClickListener onClickListener) {
        C6775k.m25602a(context, -1, (int) R.string.txt_tts_available_msg, true, onClickListener);
    }

    /* renamed from: d */
    public static void m6040d(Context context) {
        C6775k.m25614a(context, (String) null, context.getString(R.string.dialog_network_unavailable));
    }

    /* renamed from: d */
    public static void m6041d(Context context, DialogInterface.OnClickListener onClickListener) {
        C6746g.m25564a(context, new String[]{context.getString(R.string.dialog_sl_item_navi), context.getString(R.string.dialog_sl_item_navi_barrier_free)}, R.string.dialog_choose_navigation_mode_msg, R.string.dialog_btn_cancel, onClickListener).mo2610c();
    }

    /* renamed from: e */
    public static void m6042e(Context context) {
        C6775k.m25602a(context, -1, (int) R.string.dialog_not_login_msg, false, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: e */
    public static void m6043e(Context context, DialogInterface.OnClickListener onClickListener) {
        C6775k.m25607a(context, (View) null, context.getString(R.string.dialog_ssl_error_title), context.getString(R.string.dialog_ssl_error_msg), R.string.dialog_btn_cancel, R.string.dialog_btn_ok, onClickListener, onClickListener);
    }

    /* renamed from: f */
    public static void m6044f(Context context, DialogInterface.OnClickListener onClickListener) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_tts_hint, (ViewGroup) null, false);
        TextView textView = (TextView) ButterKnife.m5839a(inflate, (int) R.id.txtHint2);
        String charSequence = textView.getText().toString();
        Drawable c = C1006a.m5394c(context, R.mipmap.tts_hint_setting);
        c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ImageSpan(c, 1), charSequence.indexOf("[ic_setting]"), charSequence.indexOf("[ic_setting]") + 12, 17);
        textView.setText(spannableString);
        C6775k.m25606a(context, inflate, (String) null, (int) R.string.txt_cancel, (int) R.string.txt_setting, (DialogInterface.OnClickListener) null, onClickListener).setCancelable(false);
    }
}
