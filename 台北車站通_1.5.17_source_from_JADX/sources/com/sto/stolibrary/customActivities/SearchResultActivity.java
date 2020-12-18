package com.sto.stolibrary.customActivities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.p011v7.app.C0623m;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sto.stolibrary.customActivities.C5061F;
import com.sto.stolibrary.layout.WebImage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p191i.p192a.C5931a;
import p101d.p191i.p192a.C6005c;
import p101d.p191i.p192a.C6009d;

public class SearchResultActivity extends C0623m {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f14385d = "SearchResultActivity";

    /* renamed from: e */
    private Context f14386e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f14387f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public JSONArray f14388g = null;

    /* renamed from: h */
    private LinearLayout f14389h;

    /* renamed from: i */
    private LinearLayout f14390i;

    /* renamed from: j */
    private String f14391j = "";
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Integer f14392k = 1;

    /* renamed from: l */
    private Bitmap f14393l = null;

    /* renamed from: com.sto.stolibrary.customActivities.SearchResultActivity$a */
    private class C5064a implements View.OnClickListener {
        private C5064a() {
        }

        /* synthetic */ C5064a(SearchResultActivity searchResultActivity, C5090x xVar) {
            this();
        }

        public void onClick(View view) {
            try {
                int intValue = ((SearchResultActivity.this.f14392k.intValue() - 1) * 10) + ((Integer) view.getTag()).intValue();
                String a = SearchResultActivity.f14385d;
                StringBuilder sb = new StringBuilder();
                sb.append("data:");
                sb.append(SearchResultActivity.this.f14388g.getJSONObject(intValue).toString());
                Log.d(a, sb.toString());
                String jSONObject = SearchResultActivity.this.f14388g.getJSONObject(intValue).toString();
                Intent intent = new Intent(SearchResultActivity.this, DetailActivity.class);
                intent.putExtra("buildingID", SearchResultActivity.this.f14387f);
                intent.putExtra("info", jSONObject);
                SearchResultActivity.this.startActivity(intent);
                C5061F.C5062a a2 = C5061F.m19898b().mo14132a();
                if (a2 != null) {
                    a2.mo5619a(true);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.sto.stolibrary.customActivities.SearchResultActivity$b */
    private class C5065b implements View.OnClickListener {
        private C5065b() {
        }

        /* synthetic */ C5065b(SearchResultActivity searchResultActivity, C5090x xVar) {
            this();
        }

        public void onClick(View view) {
            try {
                int intValue = ((SearchResultActivity.this.f14392k.intValue() - 1) * 10) + ((Integer) view.getTag()).intValue();
                C5061F.C5062a a = C5061F.m19898b().mo14132a();
                if (a != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SC: ");
                    sb.append(SearchResultActivity.this.f14388g.getJSONObject(intValue).getString("ParkingNumber"));
                    Log.d("SC", sb.toString());
                    a.mo5621a(SearchResultActivity.this.f14387f, "parking", SearchResultActivity.this.f14388g.getJSONObject(intValue).getString("ParkingNumber"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19928a(int i) {
        int i2 = (i - 1) * 10;
        int i3 = i2 + 9;
        if (i3 > this.f14388g.length()) {
            i3 = this.f14388g.length();
        }
        int i4 = 0;
        while (i2 <= i3) {
            try {
                String string = this.f14388g.getJSONObject(i2).getString("LicensePlate");
                String string2 = this.f14388g.getJSONObject(i2).getString("ParkingNumber");
                String string3 = this.f14388g.getJSONObject(i2).getString("Floor");
                String string4 = this.f14388g.getJSONObject(i2).getString("ParkingType");
                String replace = this.f14388g.getJSONObject(i2).getString("PictureLink").replace("\\", "/");
                LinearLayout linearLayout = (LinearLayout) this.f14390i.findViewWithTag("G_" + i4);
                ((TextView) linearLayout.findViewById(C6005c.search_result_licence)).setText(string);
                ((TextView) linearLayout.findViewById(C6005c.search_result_lot_code)).setText(string2);
                ((TextView) linearLayout.findViewById(C6005c.search_result_lot_type)).setText(string4);
                ((TextView) linearLayout.findViewById(C6005c.search_result_building_id)).setText(this.f14391j + string3);
                ((WebImage) linearLayout.findViewById(C6005c.search_result_image)).mo14161a(new C5931a(this.f14386e).mo15721b(this.f14387f) + replace);
                linearLayout.setVisibility(0);
                i4++;
            } catch (JSONException e) {
                e.printStackTrace();
                ((LinearLayout) this.f14390i.findViewWithTag("G_" + i4)).setVisibility(8);
            }
            i2++;
        }
        while (i4 < 10) {
            ((LinearLayout) this.f14390i.findViewWithTag("G_" + i4)).setVisibility(8);
            i4++;
        }
    }

    /* renamed from: a */
    private void m19930a(JSONObject jSONObject) {
        try {
            this.f14388g = jSONObject.getJSONArray("data");
            int ceil = (int) Math.ceil((double) (this.f14388g.length() / 10));
            if (this.f14388g.length() % 10 != 0) {
                ceil++;
            }
            String str = f14385d;
            StringBuilder sb = new StringBuilder();
            sb.append("obj num: ");
            sb.append(this.f14388g.length());
            Log.d(str, sb.toString());
            String str2 = f14385d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("pageNum: ");
            sb2.append(ceil);
            Log.d(str2, sb2.toString());
            m19933d(ceil);
            m19934e(this.f14392k.intValue());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m19933d(int i) {
        this.f14389h.removeAllViews();
        for (int i2 = 1; i2 <= i; i2++) {
            TextView textView = new TextView(this.f14386e);
            textView.setText(String.valueOf(i2));
            textView.setGravity(17);
            textView.setTextColor(-7829368);
            if (i2 == 1) {
                textView.setTextSize(26.0f);
                textView.setTypeface((Typeface) null, 1);
                textView.setTextColor(Color.parseColor("#4081fd"));
            } else {
                textView.setTextSize(16.0f);
            }
            this.f14389h.addView(textView);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            new C5931a(this.f14386e);
            layoutParams.height = (int) C5931a.m22440a(50.0f, this.f14386e);
            layoutParams.width = layoutParams.height;
            layoutParams.gravity = 17;
            textView.setLayoutParams(layoutParams);
            textView.setOnClickListener(new C5091y(this));
        }
    }

    /* renamed from: e */
    private void m19934e(int i) {
        this.f14390i.removeAllViews();
        int i2 = (i - 1) * 10;
        int i3 = i2 + 9;
        if (i3 > this.f14388g.length() - 1) {
            i3 = this.f14388g.length() - 1;
        }
        LayoutInflater layoutInflater = (LayoutInflater) this.f14386e.getSystemService("layout_inflater");
        while (i2 <= i3) {
            try {
                String string = this.f14388g.getJSONObject(i2).getString("LicensePlate");
                String string2 = this.f14388g.getJSONObject(i2).getString("ParkingNumber");
                String string3 = this.f14388g.getJSONObject(i2).getString("Floor");
                String string4 = this.f14388g.getJSONObject(i2).getString("ParkingType");
                String replace = this.f14388g.getJSONObject(i2).getString("PictureLink").replace("\\", "/");
                View inflate = layoutInflater.inflate(C6009d.layout_search_item, (ViewGroup) null);
                StringBuilder sb = new StringBuilder();
                sb.append("G_");
                sb.append(i2);
                inflate.setTag(sb.toString());
                this.f14390i.addView(inflate);
                ((TextView) inflate.findViewById(C6005c.search_result_licence)).setText(string);
                ((TextView) inflate.findViewById(C6005c.search_result_lot_code)).setText(string2);
                ((TextView) inflate.findViewById(C6005c.search_result_lot_type)).setText(string4);
                ((TextView) inflate.findViewById(C6005c.search_result_building_id)).setText(this.f14391j + string3);
                ((WebImage) inflate.findViewById(C6005c.search_result_image)).setUnknownBMP(this.f14393l);
                ((WebImage) inflate.findViewById(C6005c.search_result_image)).mo14161a(new C5931a(this.f14386e).mo15721b(this.f14387f) + replace);
                inflate.findViewById(C6005c.search_result_btn_detail).setTag(Integer.valueOf(i2));
                inflate.findViewById(C6005c.search_result_btn_detail).setOnClickListener(new C5064a(this, (C5090x) null));
                inflate.findViewById(C6005c.search_result_btn_map_guide).setTag(Integer.valueOf(i2));
                inflate.findViewById(C6005c.search_result_btn_map_guide).setOnClickListener(new C5065b(this, (C5090x) null));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            int r5 = p101d.p191i.p192a.C6009d.activity_search_result
            r4.setContentView((int) r5)
            android.support.v7.app.a r5 = r4.mo2624j()
            r0 = 16
            r5.mo2522b((int) r0)
            android.support.v7.app.a r5 = r4.mo2624j()
            int r0 = p101d.p191i.p192a.C6009d.layout_action_bar
            r5.mo2514a((int) r0)
            int r5 = p101d.p191i.p192a.C6005c.action_bar_title
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r0 = p101d.p191i.p192a.C6024f.chose_searching_result
            r5.setText(r0)
            int r5 = p101d.p191i.p192a.C6005c.action_bar_back_view
            android.view.View r5 = r4.findViewById(r5)
            com.sto.stolibrary.customActivities.x r0 = new com.sto.stolibrary.customActivities.x
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            android.view.Window r5 = r4.getWindow()
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r5.clearFlags(r0)
            android.view.Window r5 = r4.getWindow()
            java.lang.String r0 = "#254E98"
            int r0 = android.graphics.Color.parseColor(r0)
            r5.setStatusBarColor(r0)
            android.content.Intent r5 = r4.getIntent()     // Catch:{ JSONException -> 0x006c, NullPointerException -> 0x0067 }
            java.lang.String r0 = "buildingID"
            java.lang.String r5 = r5.getStringExtra(r0)     // Catch:{ JSONException -> 0x006c, NullPointerException -> 0x0067 }
            r4.f14387f = r5     // Catch:{ JSONException -> 0x006c, NullPointerException -> 0x0067 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006c, NullPointerException -> 0x0067 }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ JSONException -> 0x006c, NullPointerException -> 0x0067 }
            java.lang.String r1 = "searchResult"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ JSONException -> 0x006c, NullPointerException -> 0x0067 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x006c, NullPointerException -> 0x0067 }
            goto L_0x0071
        L_0x0067:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x0070
        L_0x006c:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0070:
            r5 = 0
        L_0x0071:
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0077
            r2 = r0
            goto L_0x0078
        L_0x0077:
            r2 = r1
        L_0x0078:
            java.lang.String r3 = r4.f14387f
            if (r3 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r0 = r1
        L_0x007e:
            r0 = r0 | r2
            if (r0 == 0) goto L_0x0085
            r4.finish()
            return
        L_0x0085:
            r4.f14386e = r4
            int r0 = p101d.p191i.p192a.C6005c.page_container
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.f14389h = r0
            int r0 = p101d.p191i.p192a.C6005c.result_container
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.f14390i = r0
            java.lang.String r0 = r4.f14387f
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = f14385d
            java.lang.String r1 = "Empty BuildingID"
            android.util.Log.e(r0, r1)
            android.content.res.Resources r0 = r4.getResources()
            int r1 = p101d.p191i.p192a.C6024f.unknown_searching_error
            java.lang.String r0 = r0.getString(r1)
            p101d.p191i.p192a.p200e.C6023g.m22858a(r4, r0)
            r4.finish()
        L_0x00b6:
            java.lang.String r0 = r4.f14387f
            java.lang.String r1 = "tms_parking_tc"
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x00c3
            int r0 = p101d.p191i.p192a.C6024f.tc_part
            goto L_0x00c5
        L_0x00c3:
            int r0 = p101d.p191i.p192a.C6024f.gc_part
        L_0x00c5:
            java.lang.String r0 = r4.getString(r0)
            r4.f14391j = r0
            android.content.Context r0 = r4.f14386e
            android.content.res.Resources r0 = r0.getResources()
            int r1 = p101d.p191i.p192a.C5982b.unknown_image
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            r4.f14393l = r0
            r4.m19930a((org.json.JSONObject) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sto.stolibrary.customActivities.SearchResultActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C5061F.C5062a a = C5061F.m19898b().mo14132a();
        if (a != null) {
            a.mo5622b(false);
        }
    }
}
