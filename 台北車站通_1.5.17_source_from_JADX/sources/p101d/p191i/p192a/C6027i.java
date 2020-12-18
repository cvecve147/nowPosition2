package p101d.p191i.p192a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p191i.p192a.p194b.p195a.C5986d;
import p101d.p191i.p192a.p199d.C6010a;
import p101d.p191i.p192a.p199d.C6011b;

/* renamed from: d.i.a.i */
public class C6027i extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5986d f16855a;

    /* renamed from: b */
    private Thread f16856b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6011b f16857c;

    /* renamed from: d */
    private C6025g f16858d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Boolean f16859e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int[] f16860f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f16861g;

    /* renamed from: h */
    private ImageView f16862h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f16863i;

    /* renamed from: d.i.a.i$a */
    class C6028a implements C5986d.C5987a {
        C6028a() {
        }

        /* renamed from: a */
        public void mo15778a() {
            Boolean unused = C6027i.this.f16859e = false;
        }

        /* renamed from: a */
        public void mo15779a(float f) {
            boolean z = true;
            boolean z2 = !C6027i.this.f16859e.booleanValue();
            if (C6027i.this.f16857c == null) {
                z = false;
            }
            if (z2 && z) {
                C6027i.this.f16857c.mo15892b(f);
            }
        }

        /* renamed from: a */
        public void mo15780a(float f, float f2) {
        }

        /* renamed from: b */
        public void mo15781b(float f) {
        }
    }

    public C6027i(Context context) {
        this(context, (AttributeSet) null);
    }

    public C6027i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6027i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16859e = false;
        this.f16860f = new int[2];
        this.f16861g = 30;
        this.f16863i = false;
        this.f16855a = new C5986d(context, attributeSet, i);
        addView(this.f16855a);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int[] iArr = this.f16860f;
        iArr[0] = displayMetrics.widthPixels / 2;
        iArr[1] = displayMetrics.heightPixels / 2;
        this.f16855a.mo15817a((C5986d.C5987a) new C6028a());
        this.f16856b = new Thread(new C6026h(this), "NAV_THREAD");
        this.f16856b.start();
        this.f16862h = new ImageView(context, attributeSet, i);
        this.f16862h.setScaleType(ImageView.ScaleType.FIT_START);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 15.0f, context.getResources().getDisplayMetrics()));
        layoutParams.gravity = 83;
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics());
        layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        addView(this.f16862h, layoutParams);
    }

    /* renamed from: a */
    public void mo15935a() {
        this.f16855a.mo15815a();
    }

    /* renamed from: a */
    public void mo15936a(C5986d.C5987a aVar) {
        this.f16855a.mo15817a(aVar);
    }

    /* renamed from: a */
    public void mo15937a(C6029j jVar) {
        this.f16855a.mo15818a(jVar);
    }

    /* renamed from: a */
    public void mo15938a(String str) {
        this.f16855a.mo15819a(str);
    }

    /* renamed from: a */
    public void mo15939a(String str, List<String> list) {
        this.f16855a.mo15820a(str, list);
    }

    /* renamed from: a */
    public void mo15940a(String str, JSONArray jSONArray) {
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                String string = ((JSONObject) jSONArray.get(i)).getString("NUMBER");
                if (string.length() < 2) {
                    sb = new StringBuilder();
                    sb.append("00");
                } else {
                    if (string.length() < 3) {
                        sb = new StringBuilder();
                        sb.append("0");
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("sto_lot_");
                    sb2.append(string);
                    arrayList.add(sb2.toString());
                    i++;
                }
                sb.append(string);
                string = sb.toString();
                StringBuilder sb22 = new StringBuilder();
                sb22.append("sto_lot_");
                sb22.append(string);
                arrayList.add(sb22.toString());
                i++;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        mo15939a(str, (List<String>) arrayList);
    }

    /* renamed from: a */
    public float[] mo15941a(float f, float f2) {
        return this.f16855a.mo15823b(f, f2);
    }

    /* renamed from: b */
    public void mo15942b(float f, float f2) {
        this.f16855a.mo15825d(f, f2);
    }

    public C6025g getController() {
        if (this.f16858d == null) {
            this.f16858d = new C6025g(this);
        }
        return this.f16858d;
    }

    public void getCurrentMap() {
        this.f16855a.getCurrentMap();
    }

    public float getCurrentRotateDegrees() {
        return this.f16855a.getCurrentRotateDegrees();
    }

    public float getCurrentZoomValue() {
        return this.f16855a.getCurrentZoomValue();
    }

    public C6011b getLocationOverlay() {
        return this.f16857c;
    }

    public C5986d getMapMainView() {
        return this.f16855a;
    }

    public float getMaxZoomValue() {
        return this.f16855a.getMaxZoomValue();
    }

    public float getMinZoomValue() {
        return this.f16855a.getMinZoomValue();
    }

    public List<C6010a> getOverLays() {
        return this.f16855a.getOverLays();
    }

    public int getUpdatedPeriod() {
        return this.f16861g;
    }

    public void setBrandBitmap(Bitmap bitmap) {
        this.f16862h.setImageBitmap(bitmap);
    }

    public void setLocationOverlay(C6011b bVar) {
        this.f16857c = bVar;
    }

    public void setMapCentralizedUpdatedPeriod(int i) {
        this.f16861g = i;
    }

    public void setNavMode(Boolean bool) {
        this.f16859e = bool;
    }

    public void setScreenCenter(int[] iArr) {
        this.f16860f = iArr;
    }

    public void setUpdatedPeriod(int i) {
        this.f16861g = i;
    }
}
