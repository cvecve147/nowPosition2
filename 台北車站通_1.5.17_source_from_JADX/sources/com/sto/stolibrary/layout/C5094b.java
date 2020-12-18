package com.sto.stolibrary.layout;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import p101d.p191i.p192a.C6005c;
import p101d.p191i.p192a.C6009d;

/* renamed from: com.sto.stolibrary.layout.b */
public class C5094b extends LinearLayout {

    /* renamed from: a */
    private static String f14434a = "FloorButtons";

    /* renamed from: b */
    private Context f14435b;

    /* renamed from: c */
    private TextView f14436c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f14437d;

    /* renamed from: e */
    private LinearLayout f14438e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public LinearLayout f14439f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Boolean f14440g = true;

    /* renamed from: h */
    private HashMap f14441h = new HashMap();

    /* renamed from: com.sto.stolibrary.layout.b$a */
    private class C5095a implements View.OnClickListener {
        private C5095a() {
        }

        public void onClick(View view) {
            TextView textView;
            String str;
            C5094b bVar = C5094b.this;
            Boolean unused = bVar.f14440g = Boolean.valueOf(!bVar.f14440g.booleanValue());
            if (C5094b.this.f14440g.booleanValue()) {
                C5094b.this.f14439f.setVisibility(8);
                textView = C5094b.this.f14437d;
                str = "▼";
            } else {
                C5094b.this.f14439f.setVisibility(0);
                textView = C5094b.this.f14437d;
                str = "▲";
            }
            textView.setText(str);
        }
    }

    public C5094b(Context context) {
        super(context);
        this.f14435b = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C6009d.floor_btn_container, this);
        this.f14438e = (LinearLayout) findViewById(C6005c.floor_container_closed);
        this.f14439f = (LinearLayout) findViewById(C6005c.floor_container);
        this.f14436c = (TextView) findViewById(C6005c.floor_textview);
        this.f14437d = (TextView) findViewById(C6005c.ext_symbol);
        this.f14436c.setText("B1");
        this.f14436c.setOnClickListener(new C5095a());
        this.f14437d.setOnClickListener(new C5095a());
    }

    /* renamed from: a */
    private Map m19965a(HashMap hashMap) {
        return new TreeMap(hashMap);
    }

    /* renamed from: a */
    public void mo14167a(HashMap hashMap, View.OnClickListener onClickListener) {
        Map a = m19965a(hashMap);
        Log.d(f14434a, String.valueOf(hashMap.size()));
        for (Object next : a.keySet()) {
            TextView textView = new TextView(this.f14435b);
            textView.setGravity(17);
            textView.setPadding(5, 15, 5, 15);
            textView.setBackgroundColor(0);
            textView.setText(hashMap.get(next).toString());
            textView.setTextColor(-12303292);
            textView.setTypeface((Typeface) null, 1);
            textView.setOnClickListener(onClickListener);
            this.f14439f.addView(textView);
            this.f14441h.put(next, textView);
        }
    }

    public void setHeader(String str) {
        this.f14436c.setText(str);
    }
}
