package com.sto.stolibrary.customActivities;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.sto.stolibrary.customActivities.y */
class C5091y implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchResultActivity f14427a;

    C5091y(SearchResultActivity searchResultActivity) {
        this.f14427a = searchResultActivity;
    }

    public void onClick(View view) {
        TextView textView = (TextView) view;
        Integer valueOf = Integer.valueOf(Integer.parseInt(textView.getText().toString()));
        if (valueOf != this.f14427a.f14392k) {
            Integer unused = this.f14427a.f14392k = valueOf;
            LinearLayout linearLayout = (LinearLayout) view.getParent();
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TextView textView2 = (TextView) linearLayout.getChildAt(i);
                textView2.setTextSize(16.0f);
                textView2.setTypeface((Typeface) null, 0);
                textView2.setTextColor(-7829368);
            }
            textView.setTextSize(26.0f);
            textView.setTypeface((Typeface) null, 1);
            textView.setTextColor(Color.parseColor("#4081fd"));
            this.f14427a.m19928a(valueOf.intValue());
        }
    }
}
