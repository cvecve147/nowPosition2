package p101d.p191i.p192a.p193a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sto.stolibrary.layout.C5094b;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p119e.p120a.p121a.C5262j;
import p101d.p191i.p192a.C5931a;
import p101d.p191i.p192a.C5982b;
import p101d.p191i.p192a.C6005c;
import p101d.p191i.p192a.C6009d;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.C6027i;
import p101d.p191i.p192a.C6029j;
import p101d.p191i.p192a.p194b.p195a.C5986d;
import p101d.p191i.p192a.p199d.C6010a;
import p101d.p191i.p192a.p199d.C6011b;
import p101d.p191i.p192a.p199d.C6013c;
import p101d.p191i.p192a.p200e.C6019c;
import p101d.p191i.p192a.p200e.C6020d;
import p101d.p191i.p192a.p200e.C6023g;

/* renamed from: d.i.a.a.q */
public class C5961q {

    /* renamed from: a */
    public static final String f16509a = "STOBuilding2";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C5094b f16510A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public LinearLayout f16511B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public TextView f16512C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public TextView f16513D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public View f16514E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public Button f16515F;

    /* renamed from: G */
    private ImageButton f16516G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public ImageButton f16517H;

    /* renamed from: I */
    private Bitmap f16518I;

    /* renamed from: J */
    C5968g f16519J = new C5968g();
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f16520K = 0;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public float f16521L = 100.0f;

    /* renamed from: M */
    private C5962a f16522M;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f16523b = 3;

    /* renamed from: c */
    private String f16524c = "";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f16525d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<String> f16526e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public JSONObject f16527f = null;

    /* renamed from: g */
    private String f16528g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C5931a f16529h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public HashMap<String, C6027i> f16530i = new HashMap<>();

    /* renamed from: j */
    private HashMap<String, C6013c> f16531j = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public HashMap<String, HashMap> f16532k = new HashMap<>();

    /* renamed from: l */
    private HashMap<String, C6020d[]> f16533l = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public HashMap<String, Float> f16534m = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public HashMap<Integer, String> f16535n = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ViewGroup f16536o;

    /* renamed from: p */
    private C6011b f16537p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C6019c f16538q = new C6019c(0.0f, 0.0f, 0, 0);

    /* renamed from: r */
    private C6019c f16539r = new C6019c(0.0f, 0.0f, 0, 0);
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f16540s = "";

    /* renamed from: t */
    private List f16541t = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int[] f16542u = new int[2];

    /* renamed from: v */
    public Boolean f16543v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Boolean f16544w = false;

    /* renamed from: x */
    private Bitmap f16545x;

    /* renamed from: y */
    private Bitmap f16546y;

    /* renamed from: z */
    private JSONObject f16547z = new JSONObject();

    /* renamed from: d.i.a.a.q$a */
    public interface C5962a {
        /* renamed from: a */
        void mo15773a(C6011b bVar, int i);

        /* renamed from: a */
        void mo15774a(String str, HashMap hashMap);
    }

    /* renamed from: d.i.a.a.q$b */
    private class C5963b implements C6029j {

        /* renamed from: a */
        private int f16548a;

        private C5963b() {
            this.f16548a = 0;
        }

        /* synthetic */ C5963b(C5961q qVar, C5952h hVar) {
            this();
        }

        /* renamed from: a */
        public void mo15775a(Bitmap bitmap) {
        }

        /* renamed from: a */
        public void mo15776a(String str) {
            C5961q.m22557k(C5961q.this);
            if (C5961q.this.f16520K == C5961q.this.f16535n.size()) {
                C5961q.this.f16543v = true;
            }
        }

        /* renamed from: b */
        public void mo15777b(String str) {
            if (this.f16548a > 10) {
                Log.e(C5961q.f16509a, "Get SVG map resource failed.");
                return;
            }
            for (int i = 0; i < C5961q.this.f16526e.size(); i++) {
                if (C5961q.this.f16526e.get(i) == str) {
                    String[] split = ((String) C5961q.this.f16526e.get(i)).split("/");
                    String str2 = split[split.length - 1].split("\\.")[0];
                    if (C5961q.this.f16527f == null) {
                        ((C6027i) C5961q.this.f16530i.get(str2)).mo15938a((String) C5961q.this.f16526e.get(i));
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            jSONArray = C5961q.this.f16527f.getJSONArray(str2);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        ((C6027i) C5961q.this.f16530i.get(str2)).mo15940a(str, jSONArray);
                    }
                    this.f16548a++;
                    return;
                }
            }
        }
    }

    /* renamed from: d.i.a.a.q$c */
    private class C5964c implements C5986d.C5987a {
        private C5964c() {
        }

        /* synthetic */ C5964c(C5961q qVar, C5952h hVar) {
            this();
        }

        /* renamed from: a */
        public void mo15778a() {
            int f = C5961q.this.f16523b;
            if (f == 0) {
                C5961q.this.m22527a(2);
            } else {
                C5961q.this.m22527a(f);
            }
        }

        /* renamed from: a */
        public void mo15779a(float f) {
            String str = C5961q.f16509a;
            Log.d(str, "onRotation: " + f);
            C5961q.this.f16517H.setRotation(f);
            C5961q qVar = C5961q.this;
            qVar.m22527a(qVar.f16523b);
        }

        /* renamed from: a */
        public void mo15780a(float f, float f2) {
            try {
                List list = (List) ((HashMap) C5961q.this.f16532k.get(C5961q.this.f16540s)).get(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL);
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    int i = 0;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        PointF g = ((C6011b) list.get(i2)).mo15902g();
                        float abs = Math.abs(g.x - f) + Math.abs(g.y - f2);
                        if (abs < C5961q.this.f16521L / ((Float) C5961q.this.f16534m.get(C5961q.this.f16540s)).floatValue()) {
                            hashMap.put(Integer.valueOf(i2), Float.valueOf(abs));
                        }
                    }
                    if (hashMap.size() != 0) {
                        float f3 = 9999999.0f;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            if (((Float) entry.getValue()).floatValue() < f3) {
                                i = ((Integer) entry.getKey()).intValue();
                                f3 = ((Float) entry.getValue()).floatValue();
                            }
                        }
                        int i3 = -1;
                        Iterator it = C5961q.this.f16535n.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Integer num = (Integer) it.next();
                            if (((String) C5961q.this.f16535n.get(num)).compareTo(C5961q.this.f16540s) == 0) {
                                i3 = num.intValue();
                                break;
                            }
                        }
                        C5961q.this.m22532a((C6011b) list.get(i), i3);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public void mo15781b(float f) {
            C5961q.this.f16534m.put(C5961q.this.f16540s, Float.valueOf(f));
            float f2 = (f / 8.24537f) + 0.25f;
            String str = C5961q.f16509a;
            Log.d(str, "onScaling: " + f2);
            try {
                List list = (List) ((HashMap) C5961q.this.f16532k.get(C5961q.this.f16540s)).get(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL);
                Matrix matrix = new Matrix();
                matrix.postScale(f2, f2);
                for (int i = 0; i < list.size(); i++) {
                    Bitmap f3 = ((C6011b) list.get(i)).mo15901f();
                    ((C6011b) list.get(i)).mo15888a(Bitmap.createBitmap(f3, 0, 0, f3.getWidth(), f3.getHeight(), matrix, true));
                }
                float currentRotateDegrees = ((C6027i) C5961q.this.f16530i.get(C5961q.this.f16540s)).getCurrentRotateDegrees();
                String str2 = C5961q.f16509a;
                StringBuilder sb = new StringBuilder();
                sb.append("Degree: ");
                sb.append(currentRotateDegrees);
                Log.d(str2, sb.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            C5961q qVar = C5961q.this;
            qVar.m22527a(qVar.f16523b);
        }
    }

    /* renamed from: d.i.a.a.q$d */
    private class C5965d implements View.OnClickListener {
        private C5965d() {
        }

        /* synthetic */ C5965d(C5961q qVar, C5952h hVar) {
            this();
        }

        public void onClick(View view) {
            int f = C5961q.this.f16523b;
            Log.d(C5961q.f16509a, "Perform Rotate2North Process.");
            C5961q.this.m22533a((Boolean) true);
            C5961q.this.m22527a(f);
        }
    }

    /* renamed from: d.i.a.a.q$e */
    private class C5966e implements View.OnClickListener {
        private C5966e() {
        }

        /* synthetic */ C5966e(C5961q qVar, C5952h hVar) {
            this();
        }

        public void onClick(View view) {
            if (C5961q.this.f16523b == 3) {
                C6023g.m22859a(C5961q.this.f16525d, C5961q.this.f16525d.getString(C6024f.loss_loc), 0);
                return;
            }
            C5961q.this.m22533a((Boolean) false);
            C5961q.this.m22527a(1);
        }
    }

    /* renamed from: d.i.a.a.q$f */
    private class C5967f implements View.OnClickListener {
        private C5967f() {
        }

        /* synthetic */ C5967f(C5961q qVar, C5952h hVar) {
            this();
        }

        public void onClick(View view) {
            C5961q qVar;
            int i = 0;
            if (C5961q.this.f16523b == 3) {
                C6023g.m22859a(C5961q.this.f16525d, C5961q.this.f16525d.getString(C6024f.loss_loc), 0);
                return;
            }
            if (C5961q.this.f16523b == 0) {
                qVar = C5961q.this;
                i = 2;
            } else {
                qVar = C5961q.this;
            }
            qVar.m22527a(i);
        }
    }

    /* renamed from: d.i.a.a.q$g */
    class C5968g implements Runnable {

        /* renamed from: a */
        private int f16554a = 20;

        /* renamed from: b */
        private int[] f16555b = {0, 0, 0, 0};

        /* renamed from: c */
        private int[] f16556c = {0, 0, 0, 0};

        /* renamed from: d */
        private PointF f16557d = new PointF();

        /* renamed from: e */
        private float f16558e = 5.0f;

        /* renamed from: f */
        private int f16559f = 0;

        /* renamed from: g */
        private boolean f16560g = true;

        /* renamed from: h */
        private boolean f16561h = false;

        /* renamed from: i */
        private int f16562i = 0;

        /* renamed from: j */
        private String f16563j = "";

        /* renamed from: k */
        private int f16564k = (990 / this.f16554a);

        /* renamed from: l */
        private boolean f16565l = false;

        C5968g() {
        }

        /* renamed from: a */
        private synchronized int[] m22595a() {
            return this.f16555b;
        }

        /* renamed from: b */
        private synchronized PointF m22596b() {
            return this.f16557d;
        }

        /* renamed from: a */
        public synchronized void mo15785a(int[] iArr) {
            if (this.f16560g) {
                this.f16560g = false;
                new Thread(C5961q.this.f16519J, "SMOOTH_RUN").start();
            }
            if (!(iArr[0] == m22595a()[0] && iArr[1] == m22595a()[1])) {
                this.f16555b = iArr;
                this.f16559f = 0;
                this.f16563j = (String) C5961q.this.f16535n.get(Integer.valueOf(iArr[2]));
                this.f16557d = C5961q.this.f16538q.mo15921f();
                this.f16561h = true;
            }
        }

        public void run() {
            float f;
            while (true) {
                if (this.f16561h) {
                    this.f16559f = 0;
                    while (this.f16559f < this.f16554a) {
                        int[] a = m22595a();
                        PointF b = m22596b();
                        int[] iArr = this.f16556c;
                        float f2 = b.x;
                        int i = (int) f2;
                        float f3 = ((float) a[0]) - f2;
                        float f4 = (float) this.f16554a;
                        float f5 = (float) (this.f16559f + 1);
                        iArr[0] = i + ((int) ((f3 / f4) * f5));
                        float f6 = b.y;
                        iArr[1] = ((int) f6) + ((int) (((((float) a[1]) - f6) / f4) * f5));
                        iArr[2] = a[2];
                        iArr[3] = a[3];
                        C5961q.this.f16538q.mo15916a(this.f16556c);
                        ((C6027i) C5961q.this.f16530i.get(this.f16563j)).getLocationOverlay().mo15890a(C5961q.this.f16538q.mo15921f());
                        int[] iArr2 = this.f16556c;
                        float f7 = this.f16558e;
                        if (((float) iArr2[3]) == f7) {
                            this.f16558e = (float) iArr2[3];
                        } else {
                            if (((float) iArr2[3]) > f7) {
                                f = f7 + 0.01f;
                            } else if (((float) iArr2[3]) < f7) {
                                f = f7 - 0.01f;
                            }
                            this.f16558e = f;
                        }
                        ((C6027i) C5961q.this.f16530i.get(this.f16563j)).getLocationOverlay().mo15886a((this.f16558e + 0.5f) * ((Float) C5961q.this.f16534m.get(this.f16563j)).floatValue());
                        try {
                            Thread.sleep((long) this.f16564k);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        this.f16559f++;
                    }
                    C5961q.this.f16538q.mo15916a(this.f16555b);
                    C5961q.this.f16538q.mo15915a(this.f16563j);
                    ((C6027i) C5961q.this.f16530i.get(this.f16563j)).getLocationOverlay().mo15890a(C5961q.this.f16538q.mo15921f());
                    this.f16561h = false;
                    if (!this.f16565l) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: d.i.a.a.q$h */
    private class C5969h implements View.OnClickListener {
        private C5969h() {
        }

        /* synthetic */ C5969h(C5961q qVar, C5952h hVar) {
            this();
        }

        public void onClick(View view) {
            String charSequence = ((TextView) view).getText().toString();
            C5961q.this.m22527a(2);
            C5961q.this.mo15766a(charSequence);
        }
    }

    public C5961q(Context context, String str) {
        this.f16529h = new C5931a(context);
        this.f16525d = context;
        this.f16524c = str;
        this.f16528g = context.getExternalFilesDir((String) null).toString() + "/";
        this.f16542u = m22546e();
        this.f16526e = m22536b(this.f16528g + "resource/" + str + "/map/");
        this.f16545x = m22522a(context.getDrawable(C5982b.icon_occupied));
        this.f16546y = m22522a(context.getDrawable(C5982b.icon_free));
        this.f16541t.add(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL);
    }

    /* renamed from: a */
    private static Bitmap m22522a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    private synchronized HashMap m22526a(JSONObject jSONObject) {
        HashMap hashMap;
        hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                hashMap.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m22527a(int i) {
        C6027i iVar;
        boolean z;
        if (this.f16543v.booleanValue()) {
            if (this.f16538q.mo15918c().compareTo("STO_initial_floor") != 0) {
                if (i != 0) {
                    if (i == 1) {
                        if (this.f16523b != i) {
                            ((Activity) this.f16525d).runOnUiThread(new C5945a(this));
                        }
                        mo15766a(this.f16538q.mo15918c());
                        iVar = this.f16530i.get(this.f16538q.mo15918c());
                        z = false;
                    } else if (i != 2) {
                        if (i == 3) {
                            if (this.f16523b != i) {
                                ((Activity) this.f16525d).runOnUiThread(new C5959o(this));
                                m22541b((int[]) null);
                            }
                        }
                    } else if (this.f16523b != i) {
                        ((Activity) this.f16525d).runOnUiThread(new C5946b(this));
                        iVar = this.f16530i.get(this.f16538q.mo15918c());
                        z = false;
                    }
                    iVar.setNavMode(z);
                } else if (this.f16523b != i) {
                    ((Activity) this.f16525d).runOnUiThread(new C5960p(this));
                    this.f16530i.get(this.f16538q.mo15918c()).setNavMode(true);
                }
                this.f16523b = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22532a(C6011b bVar, int i) {
        C5962a aVar = this.f16522M;
        if (aVar != null) {
            aVar.mo15773a(bVar, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22533a(Boolean bool) {
        new Thread(new C5951g(this, bool)).start();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x018b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m22534a(java.lang.String r23, org.json.JSONArray r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            java.lang.String r2 = r23.toUpperCase()
            java.util.HashMap<java.lang.String, d.i.a.i> r3 = r0.f16530i
            java.lang.Object r3 = r3.get(r2)
            if (r3 != 0) goto L_0x0036
            java.lang.String r1 = f16509a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "["
            r3.append(r4)
            java.lang.String r4 = r0.f16524c
            r3.append(r4)
            java.lang.String r4 = "]The floor: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "is invalid."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.w(r1, r2)
            return
        L_0x0036:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.f16528g
            r3.append(r4)
            java.lang.String r4 = "resource/icon/"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r6 = "all"
            r4.put(r6, r5)
            r5 = 0
        L_0x0059:
            int r7 = r24.length()
            if (r5 >= r7) goto L_0x018f
            org.json.JSONObject r7 = r1.getJSONObject(r5)
            java.lang.String r8 = "PosX"
            java.lang.String r7 = r7.getString(r8)
            float r7 = java.lang.Float.parseFloat(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            org.json.JSONObject r8 = r1.getJSONObject(r5)
            java.lang.String r9 = "PosY"
            java.lang.String r8 = r8.getString(r9)
            float r8 = java.lang.Float.parseFloat(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            org.json.JSONObject r9 = r1.getJSONObject(r5)
            java.lang.String r10 = "Category"
            java.lang.String r9 = r9.getString(r10)
            java.lang.String r10 = "ignore"
            r9.contains(r10)
            java.lang.Object r10 = r4.get(r9)
            if (r10 != 0) goto L_0x00a0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r4.put(r9, r10)
        L_0x00a0:
            d.i.a.d.b r10 = new d.i.a.d.b
            android.content.Context r11 = r0.f16525d
            java.util.HashMap<java.lang.String, d.i.a.i> r12 = r0.f16530i
            java.lang.Object r12 = r12.get(r2)
            d.i.a.i r12 = (p101d.p191i.p192a.C6027i) r12
            r10.<init>(r11, r12)
            r10.mo15891a((java.lang.String) r9)
            java.lang.String r11 = r10.mo15896c()
            java.lang.String r12 = "exit"
            boolean r11 = r11.contains(r12)
            java.lang.String r12 = "location"
            if (r11 == 0) goto L_0x00cc
            org.json.JSONObject r11 = r1.getJSONObject(r5)
            java.lang.String r11 = r11.toString()
        L_0x00c8:
            r10.mo15895b((java.lang.String) r11)
            goto L_0x00e1
        L_0x00cc:
            java.lang.String r11 = r10.mo15896c()
            int r11 = r11.compareTo(r12)
            if (r11 != 0) goto L_0x00e1
            org.json.JSONObject r11 = r1.getJSONObject(r5)
            java.lang.String r13 = "name"
            java.lang.String r11 = r11.getString(r13)
            goto L_0x00c8
        L_0x00e1:
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            r13 = 1028443341(0x3d4ccccd, float:0.05)
            r11.postScale(r13, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.String r14 = "icon_"
            r13.append(r14)
            r13.append(r9)
            java.lang.String r14 = ".png"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFile(r13)
            if (r13 != 0) goto L_0x011c
            r13 = 1069547520(0x3fc00000, float:1.5)
            r11.postScale(r13, r13)
            android.content.Context r13 = r0.f16525d
            android.content.res.Resources r13 = r13.getResources()
            int r14 = p101d.p191i.p192a.C6014e.icon_unknown
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeResource(r13, r14)
        L_0x011c:
            r20 = r13
            android.graphics.Matrix r15 = new android.graphics.Matrix
            r15.<init>()
            r13 = 1045220557(0x3e4ccccd, float:0.2)
            r15.postScale(r13, r13)
            int r16 = r20.getWidth()
            int r17 = r20.getHeight()
            r14 = 0
            r18 = 0
            r19 = 1
            r13 = r20
            r21 = r15
            r15 = r18
            r18 = r11
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)
            int r17 = r20.getWidth()
            int r18 = r20.getHeight()
            r15 = 0
            r16 = 0
            r13 = 1
            r14 = r20
            r19 = r21
            r20 = r13
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r14, r15, r16, r17, r18, r19, r20)
            r10.mo15889a((android.graphics.Bitmap) r11, (android.graphics.Bitmap) r13)
            android.graphics.PointF r11 = new android.graphics.PointF
            float r7 = r7.floatValue()
            float r8 = r8.floatValue()
            r11.<init>(r7, r8)
            r10.mo15890a((android.graphics.PointF) r11)
            r7 = 0
            r10.mo15897c((float) r7)
            r7 = 2
            r10.mo15893b((int) r7)
            java.lang.Object r7 = r4.get(r9)
            java.util.List r7 = (java.util.List) r7
            r7.add(r10)
            int r7 = r9.compareTo(r12)
            if (r7 == 0) goto L_0x018b
            java.lang.Object r7 = r4.get(r6)
            java.util.List r7 = (java.util.List) r7
            r7.add(r10)
        L_0x018b:
            int r5 = r5 + 1
            goto L_0x0059
        L_0x018f:
            java.util.HashMap<java.lang.String, java.util.HashMap> r1 = r0.f16532k
            r1.put(r2, r4)
            d.i.a.a.q$a r1 = r0.f16522M
            r1.mo15774a((java.lang.String) r2, (java.util.HashMap) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p193a.C5961q.m22534a(java.lang.String, org.json.JSONArray):void");
    }

    /* renamed from: b */
    private List<String> m22536b(String str) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return null;
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].getName().contains(".svg")) {
                arrayList.add(str + listFiles[i].getName());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m22539b(String str, JSONArray jSONArray) {
        if (this.f16530i.get(str) == null) {
            String str2 = f16509a;
            Log.w(str2, "[" + this.f16524c + "]The floor: " + str + "is invalid.");
            return;
        }
        C6020d[] dVarArr = new C6020d[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            Float valueOf = Float.valueOf(Float.parseFloat(jSONArray.getJSONObject(i).getString("PosX")));
            Float valueOf2 = Float.valueOf(Float.parseFloat(jSONArray.getJSONObject(i).getString("PosY")));
            Float valueOf3 = Float.valueOf(Float.parseFloat(jSONArray.getJSONObject(i).getString("Rad")));
            dVarArr[i] = new C6020d(valueOf.floatValue(), valueOf2.floatValue(), valueOf3.floatValue(), jSONArray.getJSONObject(i).getString("Msg"));
        }
        this.f16533l.put(str, dVarArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m22540b(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.compareTo("0") != 0) {
                    new Thread(new C5950f(this, next, jSONObject)).start();
                    m22556j();
                }
            }
        }
    }

    /* renamed from: b */
    private void m22541b(int[] iArr) {
        String str;
        for (String str2 : this.f16530i.keySet()) {
            this.f16531j.get(str2).mo15908a((int[]) null);
        }
        if (iArr != null) {
            int[] iArr2 = new int[(iArr.length + 3)];
            int i = iArr[2];
            iArr2[0] = (int) this.f16538q.mo15921f().x;
            iArr2[1] = (int) this.f16538q.mo15921f().y;
            iArr2[2] = this.f16538q.mo15913a();
            int i2 = 3;
            int i3 = i;
            int i4 = 0;
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr2[i2] = iArr[i5];
                if ((i5 % 3 == 2) && (iArr[i5] != i3)) {
                    int[] iArr3 = new int[(i2 + 1)];
                    for (int i6 = 0; i6 < i2; i6++) {
                        iArr3[i6] = iArr2[i6];
                    }
                    Log.d(f16509a, "nav floor: " + this.f16535n.get(Integer.valueOf(iArr3[2])));
                    try {
                        this.f16531j.get(this.f16535n.get(Integer.valueOf(iArr3[2]))).mo15908a(iArr3);
                        i4 += this.f16531j.get(this.f16535n.get(Integer.valueOf(iArr3[2]))).mo15907a();
                    } catch (NullPointerException e) {
                        Log.w(f16509a, "The navigation path could be through on unknown floor");
                        e.printStackTrace();
                    }
                    iArr2[0] = iArr2[i2 - 2];
                    iArr2[1] = iArr2[i2 - 1];
                    iArr2[2] = iArr2[i2];
                    i3 = iArr2[2];
                    i2 = 3;
                } else {
                    i2++;
                }
            }
            int[] iArr4 = new int[(i2 + 1)];
            for (int i7 = 0; i7 < i2; i7++) {
                iArr4[i7] = iArr2[i7];
            }
            try {
                this.f16531j.get(this.f16535n.get(Integer.valueOf(iArr4[2]))).mo15908a(iArr4);
                i4 += this.f16531j.get(this.f16535n.get(Integer.valueOf(iArr4[2]))).mo15907a();
            } catch (NullPointerException e2) {
                Log.w(f16509a, "The navigation path could be through on unknown floor");
                e2.printStackTrace();
            }
            this.f16530i.get(this.f16540s).mo15935a();
            int i8 = i4 / 80;
            String replace = this.f16525d.getString(C6024f.nav_info_remain).replace("METER", i4 + "");
            if (i8 > 0) {
                str = i8 + "";
            } else {
                str = this.f16525d.getString(C6024f.nav_info_less_one_minute);
            }
            ((Activity) this.f16525d).runOnUiThread(new C5958n(this, replace.replace("TIME", str)));
        }
    }

    /* renamed from: c */
    private void m22543c(C6019c cVar) {
        C6020d[] dVarArr = this.f16533l.get(cVar.mo15918c());
        if (!this.f16544w.booleanValue()) {
            new Thread(new C5947c(this, dVarArr, cVar)).start();
        }
    }

    /* renamed from: e */
    private int[] m22546e() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.f16525d).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels / 2, displayMetrics.heightPixels / 2};
    }

    /* renamed from: f */
    private void m22548f() {
        this.f16517H.setId(View.generateViewId());
        this.f16518I = BitmapFactory.decodeResource(this.f16525d.getResources(), C5982b.btn_compass);
        this.f16517H.setBackground(new BitmapDrawable(this.f16525d.getResources(), this.f16518I));
        this.f16517H.setOnClickListener(new C5965d(this, (C5952h) null));
        ViewGroup viewGroup = (ViewGroup) this.f16536o.getParent();
        viewGroup.addView(this.f16517H);
        if (viewGroup instanceof ConstraintLayout) {
            ConstraintLayout.C0044a aVar = (ConstraintLayout.C0044a) this.f16517H.getLayoutParams();
            C5931a aVar2 = this.f16529h;
            int a = (int) C5931a.m22440a(75.0f, this.f16525d);
            C5931a aVar3 = this.f16529h;
            int a2 = (int) C5931a.m22440a(5.0f, this.f16525d);
            aVar.width = a;
            aVar.height = a;
            aVar.setMargins(a2, a2, a2, a2);
            aVar.f183g = this.f16536o.getId();
            aVar.f186j = this.f16516G.getId();
            this.f16517H.setLayoutParams(aVar);
            return;
        }
        Log.e(f16509a, "Unsupport layout parent.");
    }

    /* renamed from: g */
    private void m22550g() {
        this.f16510A = new C5094b(this.f16525d);
        this.f16510A.setId(View.generateViewId());
        this.f16510A.mo14167a((HashMap) this.f16535n, (View.OnClickListener) new C5969h(this, (C5952h) null));
        ViewGroup viewGroup = (ViewGroup) this.f16536o.getParent();
        viewGroup.addView(this.f16510A);
        if (viewGroup instanceof ConstraintLayout) {
            ConstraintLayout.C0044a aVar = (ConstraintLayout.C0044a) this.f16510A.getLayoutParams();
            aVar.f183g = this.f16536o.getId();
            this.f16510A.setLayoutParams(aVar);
            return;
        }
        Log.e(f16509a, "Unsupport layout parent.");
    }

    /* renamed from: h */
    private void m22552h() {
        this.f16511B = new LinearLayout(this.f16525d);
        this.f16511B.setOrientation(1);
        this.f16511B.setBackgroundResource(C5982b.shape_rectangle_transparent);
        C5931a aVar = this.f16529h;
        int a = (int) C5931a.m22440a(8.0f, this.f16525d);
        this.f16512C = new TextView(this.f16525d);
        this.f16512C.setId(View.generateViewId());
        this.f16512C.setText("");
        this.f16512C.setTextSize(20.0f);
        this.f16512C.setTypeface((Typeface) null, 1);
        this.f16512C.setPadding(a, 0, a, 0);
        this.f16513D = new TextView(this.f16525d);
        this.f16513D.setId(View.generateViewId());
        this.f16513D.setText("");
        this.f16513D.setTextSize(16.0f);
        this.f16513D.setPadding(a, 0, a, 0);
        ViewGroup viewGroup = (ViewGroup) this.f16536o.getParent();
        this.f16511B.addView(this.f16512C);
        this.f16511B.addView(this.f16513D);
        this.f16511B.setPadding(a, a, a, a);
        viewGroup.addView(this.f16511B);
        this.f16511B.setVisibility(8);
        if (viewGroup instanceof ConstraintLayout) {
            ConstraintLayout.C0044a aVar2 = (ConstraintLayout.C0044a) this.f16511B.getLayoutParams();
            aVar2.f186j = this.f16515F.getId();
            aVar2.f180d = this.f16515F.getId();
            aVar2.f183g = this.f16516G.getId();
            aVar2.setMargins(a, a, a, a);
            return;
        }
        Log.e(f16509a, "Unsupport layout parent.");
    }

    /* renamed from: i */
    private void m22554i() {
        this.f16516G.setId(View.generateViewId());
        this.f16516G.setBackgroundResource(C5982b.btn_location);
        this.f16516G.setOnClickListener(new C5966e(this, (C5952h) null));
        ViewGroup viewGroup = (ViewGroup) this.f16536o.getParent();
        viewGroup.addView(this.f16516G);
        if (viewGroup instanceof ConstraintLayout) {
            ConstraintLayout.C0044a aVar = (ConstraintLayout.C0044a) this.f16516G.getLayoutParams();
            C5931a aVar2 = this.f16529h;
            int a = (int) C5931a.m22440a(75.0f, this.f16525d);
            C5931a aVar3 = this.f16529h;
            int a2 = (int) C5931a.m22440a(5.0f, this.f16525d);
            aVar.width = a;
            aVar.height = a;
            aVar.setMargins(a2, a2, a2, a2);
            aVar.f183g = this.f16536o.getId();
            Button button = this.f16515F;
            if (button != null) {
                aVar.f186j = button.getId();
            } else {
                aVar.f187k = this.f16536o.getId();
            }
            this.f16516G.setLayoutParams(aVar);
            return;
        }
        Log.e(f16509a, "Unsupport layout parent.");
    }

    /* renamed from: j */
    private void m22556j() {
        for (String next : this.f16530i.keySet()) {
            C6011b locationOverlay = this.f16530i.get(next).getLocationOverlay();
            this.f16530i.get(next).getOverLays().remove(locationOverlay);
            this.f16530i.get(next).getOverLays().add(locationOverlay);
        }
    }

    /* renamed from: k */
    static /* synthetic */ int m22557k(C5961q qVar) {
        int i = qVar.f16520K;
        qVar.f16520K = i + 1;
        return i;
    }

    /* renamed from: k */
    private void m22558k() {
        this.f16515F.setId(View.generateViewId());
        this.f16515F.setOnClickListener(new C5967f(this, (C5952h) null));
        this.f16515F.setBackgroundColor(Color.parseColor("#4081fd"));
        this.f16515F.setText(this.f16525d.getString(C6024f.start_nav));
        this.f16515F.setTextColor(-1);
        this.f16515F.setTextSize(20.0f);
        ViewGroup viewGroup = (ViewGroup) this.f16536o.getParent();
        viewGroup.addView(this.f16515F);
        if (viewGroup instanceof ConstraintLayout) {
            ConstraintLayout.C0044a aVar = (ConstraintLayout.C0044a) this.f16515F.getLayoutParams();
            aVar.width = C6023g.m22857a(this.f16525d).x;
            C5931a aVar2 = this.f16529h;
            aVar.height = (int) C5931a.m22440a(50.0f, this.f16525d);
            aVar.f183g = this.f16536o.getId();
            aVar.f180d = this.f16536o.getId();
            aVar.f187k = this.f16536o.getId();
            this.f16515F.setLayoutParams(aVar);
            return;
        }
        Log.e(f16509a, "Unsupport layout parent.");
    }

    /* renamed from: l */
    private void m22560l() {
        this.f16514E = ((LayoutInflater) this.f16525d.getSystemService("layout_inflater")).inflate(C6009d.layout_nav_info_bar, (ViewGroup) null);
        this.f16514E.setVisibility(8);
        ViewGroup viewGroup = (ViewGroup) this.f16536o.getParent();
        viewGroup.addView(this.f16514E);
        this.f16514E.findViewById(C6005c.nav_info_stop_btn).setOnClickListener(new C5967f(this, (C5952h) null));
        if (viewGroup instanceof ConstraintLayout) {
            ConstraintLayout.C0044a aVar = (ConstraintLayout.C0044a) this.f16514E.getLayoutParams();
            aVar.width = C6023g.m22857a(this.f16525d).x;
            C5931a aVar2 = this.f16529h;
            aVar.height = (int) C5931a.m22440a(100.0f, this.f16525d);
            aVar.f187k = this.f16536o.getId();
            this.f16514E.setLayoutParams(aVar);
            return;
        }
        Log.e(f16509a, "Unsupport layout parent.");
    }

    /* renamed from: m */
    private void m22562m() {
        this.f16529h.mo15714a().mo15734a(new C5262j(0, this.f16529h.mo15731e(this.f16524c), new C5948d(this), new C5949e(this)));
    }

    /* renamed from: n */
    private void m22564n() {
        try {
            String format = new SimpleDateFormat("MM/dd/yy HH:mm").format(Calendar.getInstance().getTime());
            String replace = this.f16525d.getString(C6024f.empty_by_floor).replace("FLOOR", this.f16540s);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16547z.getInt(this.f16540s));
            sb.append("");
            String replace2 = replace.replace("NUM", sb.toString());
            String string = this.f16525d.getString(C6024f.empty_by_floor_update);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" ");
            sb2.append(format);
            ((Activity) this.f16525d).runOnUiThread(new C5957m(this, replace2, sb2.toString()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public C6019c mo15761a() {
        return this.f16539r;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00c0 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Boolean mo15762a(java.util.HashMap r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01c9 }
            r8.f16535n = r9     // Catch:{ all -> 0x01c9 }
            java.util.List<java.lang.String> r9 = r8.f16526e     // Catch:{ all -> 0x01c9 }
            if (r9 != 0) goto L_0x0018
            java.lang.String r9 = f16509a     // Catch:{ all -> 0x01c9 }
            java.lang.String r1 = "Invalid buildingID or null resource"
            android.util.Log.e(r9, r1)     // Catch:{ all -> 0x01c9 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01c9 }
            monitor-exit(r8)
            return r9
        L_0x0018:
            r9 = r0
        L_0x0019:
            java.util.List<java.lang.String> r1 = r8.f16526e     // Catch:{ all -> 0x01c9 }
            int r1 = r1.size()     // Catch:{ all -> 0x01c9 }
            r2 = 0
            r3 = 1
            if (r9 >= r1) goto L_0x0155
            java.util.List<java.lang.String> r1 = r8.f16526e     // Catch:{ all -> 0x01c9 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x01c9 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01c9 }
            java.lang.String r4 = "/"
            java.lang.String[] r1 = r1.split(r4)     // Catch:{ all -> 0x01c9 }
            int r4 = r1.length     // Catch:{ all -> 0x01c9 }
            int r4 = r4 - r3
            r1 = r1[r4]     // Catch:{ all -> 0x01c9 }
            java.lang.String r4 = "\\."
            java.lang.String[] r1 = r1.split(r4)     // Catch:{ all -> 0x01c9 }
            r1 = r1[r0]     // Catch:{ all -> 0x01c9 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01c9 }
            java.util.HashMap<java.lang.Integer, java.lang.String> r5 = r8.f16535n     // Catch:{ all -> 0x01c9 }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x01c9 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x01c9 }
        L_0x004b:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x01c9 }
            if (r6 == 0) goto L_0x006e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x01c9 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x01c9 }
            java.util.HashMap<java.lang.Integer, java.lang.String> r7 = r8.f16535n     // Catch:{ all -> 0x01c9 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x01c9 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01c9 }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x01c9 }
            boolean r6 = r1.contains(r6)     // Catch:{ all -> 0x01c9 }
            if (r6 == 0) goto L_0x004b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x01c9 }
            goto L_0x004b
        L_0x006e:
            boolean r3 = r4.booleanValue()     // Catch:{ all -> 0x01c9 }
            if (r3 != 0) goto L_0x008c
            java.lang.String r2 = f16509a     // Catch:{ all -> 0x01c9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c9 }
            r3.<init>()     // Catch:{ all -> 0x01c9 }
            java.lang.String r4 = "Unknown SVG file in floor list: "
            r3.append(r4)     // Catch:{ all -> 0x01c9 }
            r3.append(r1)     // Catch:{ all -> 0x01c9 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x01c9 }
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x01c9 }
            goto L_0x0151
        L_0x008c:
            d.i.a.i r3 = new d.i.a.i     // Catch:{ all -> 0x01c9 }
            android.content.Context r4 = r8.f16525d     // Catch:{ all -> 0x01c9 }
            r3.<init>(r4)     // Catch:{ all -> 0x01c9 }
            org.json.JSONObject r4 = r8.f16527f     // Catch:{ all -> 0x01c9 }
            if (r4 != 0) goto L_0x00a3
            java.util.List<java.lang.String> r4 = r8.f16526e     // Catch:{ all -> 0x01c9 }
            java.lang.Object r4 = r4.get(r9)     // Catch:{ all -> 0x01c9 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x01c9 }
        L_0x009f:
            r3.mo15938a((java.lang.String) r4)     // Catch:{ all -> 0x01c9 }
            goto L_0x00e4
        L_0x00a3:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x01c9 }
            r4.<init>()     // Catch:{ all -> 0x01c9 }
            org.json.JSONObject r4 = r8.f16527f     // Catch:{ JSONException -> 0x00c0 }
            org.json.JSONObject r4 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r5 = "data"
            org.json.JSONArray r4 = r4.getJSONArray(r5)     // Catch:{ JSONException -> 0x00c0 }
            java.util.List<java.lang.String> r5 = r8.f16526e     // Catch:{ JSONException -> 0x00c0 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x00c0 }
            r3.mo15940a((java.lang.String) r5, (org.json.JSONArray) r4)     // Catch:{ JSONException -> 0x00c0 }
            goto L_0x00e4
        L_0x00c0:
            java.lang.String r4 = f16509a     // Catch:{ all -> 0x01c9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c9 }
            r5.<init>()     // Catch:{ all -> 0x01c9 }
            java.lang.String r6 = "無"
            r5.append(r6)     // Catch:{ all -> 0x01c9 }
            r5.append(r1)     // Catch:{ all -> 0x01c9 }
            java.lang.String r6 = "車個相關資訊。"
            r5.append(r6)     // Catch:{ all -> 0x01c9 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01c9 }
            android.util.Log.w(r4, r5)     // Catch:{ all -> 0x01c9 }
            java.util.List<java.lang.String> r4 = r8.f16526e     // Catch:{ all -> 0x01c9 }
            java.lang.Object r4 = r4.get(r9)     // Catch:{ all -> 0x01c9 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x01c9 }
            goto L_0x009f
        L_0x00e4:
            d.i.a.a.q$b r4 = new d.i.a.a.q$b     // Catch:{ all -> 0x01c9 }
            r5 = 0
            r4.<init>(r8, r5)     // Catch:{ all -> 0x01c9 }
            r3.mo15937a((p101d.p191i.p192a.C6029j) r4)     // Catch:{ all -> 0x01c9 }
            d.i.a.a.q$c r4 = new d.i.a.a.q$c     // Catch:{ all -> 0x01c9 }
            r4.<init>(r8, r5)     // Catch:{ all -> 0x01c9 }
            r3.mo15936a((p101d.p191i.p192a.p194b.p195a.C5986d.C5987a) r4)     // Catch:{ all -> 0x01c9 }
            java.util.HashMap<java.lang.String, d.i.a.i> r4 = r8.f16530i     // Catch:{ all -> 0x01c9 }
            java.lang.String r5 = r1.toUpperCase()     // Catch:{ all -> 0x01c9 }
            r4.put(r5, r3)     // Catch:{ all -> 0x01c9 }
            d.i.a.d.b r4 = new d.i.a.d.b     // Catch:{ all -> 0x01c9 }
            android.content.Context r5 = r8.f16525d     // Catch:{ all -> 0x01c9 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x01c9 }
            d.i.a.d.c r5 = new d.i.a.d.c     // Catch:{ all -> 0x01c9 }
            r5.<init>(r3)     // Catch:{ all -> 0x01c9 }
            int r6 = p101d.p191i.p192a.C5982b.icon_user_direction     // Catch:{ all -> 0x01c9 }
            r4.mo15887a((int) r6)     // Catch:{ all -> 0x01c9 }
            r4.mo15903h()     // Catch:{ all -> 0x01c9 }
            r4.mo15904i()     // Catch:{ all -> 0x01c9 }
            d.i.a.e.c r6 = new d.i.a.e.c     // Catch:{ all -> 0x01c9 }
            r6.<init>(r2, r2, r0, r0)     // Catch:{ all -> 0x01c9 }
            android.graphics.PointF r2 = r6.mo15921f()     // Catch:{ all -> 0x01c9 }
            r4.mo15890a((android.graphics.PointF) r2)     // Catch:{ all -> 0x01c9 }
            r2 = 4
            r4.mo15893b((int) r2)     // Catch:{ all -> 0x01c9 }
            java.util.List r2 = r3.getOverLays()     // Catch:{ all -> 0x01c9 }
            r2.add(r4)     // Catch:{ all -> 0x01c9 }
            r3.setLocationOverlay(r4)     // Catch:{ all -> 0x01c9 }
            java.util.List r2 = r3.getOverLays()     // Catch:{ all -> 0x01c9 }
            r2.add(r5)     // Catch:{ all -> 0x01c9 }
            r3.mo15935a()     // Catch:{ all -> 0x01c9 }
            java.util.HashMap<java.lang.String, d.i.a.d.c> r2 = r8.f16531j     // Catch:{ all -> 0x01c9 }
            java.lang.String r3 = r1.toUpperCase()     // Catch:{ all -> 0x01c9 }
            r2.put(r3, r5)     // Catch:{ all -> 0x01c9 }
            java.util.HashMap<java.lang.String, java.lang.Float> r2 = r8.f16534m     // Catch:{ all -> 0x01c9 }
            java.lang.String r1 = r1.toUpperCase()     // Catch:{ all -> 0x01c9 }
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ all -> 0x01c9 }
            r2.put(r1, r3)     // Catch:{ all -> 0x01c9 }
        L_0x0151:
            int r9 = r9 + 1
            goto L_0x0019
        L_0x0155:
            android.widget.ImageButton r9 = new android.widget.ImageButton     // Catch:{ all -> 0x01c9 }
            android.content.Context r1 = r8.f16525d     // Catch:{ all -> 0x01c9 }
            r9.<init>(r1)     // Catch:{ all -> 0x01c9 }
            r8.f16516G = r9     // Catch:{ all -> 0x01c9 }
            android.widget.Button r9 = new android.widget.Button     // Catch:{ all -> 0x01c9 }
            android.content.Context r1 = r8.f16525d     // Catch:{ all -> 0x01c9 }
            r9.<init>(r1)     // Catch:{ all -> 0x01c9 }
            r8.f16515F = r9     // Catch:{ all -> 0x01c9 }
            android.widget.ImageButton r9 = new android.widget.ImageButton     // Catch:{ all -> 0x01c9 }
            android.content.Context r1 = r8.f16525d     // Catch:{ all -> 0x01c9 }
            r9.<init>(r1)     // Catch:{ all -> 0x01c9 }
            r8.f16517H = r9     // Catch:{ all -> 0x01c9 }
            r8.m22558k()     // Catch:{ all -> 0x01c9 }
            r8.m22552h()     // Catch:{ all -> 0x01c9 }
            r8.m22550g()     // Catch:{ all -> 0x01c9 }
            r8.m22554i()     // Catch:{ all -> 0x01c9 }
            r8.m22548f()     // Catch:{ all -> 0x01c9 }
            r8.m22562m()     // Catch:{ all -> 0x01c9 }
            r8.m22560l()     // Catch:{ all -> 0x01c9 }
            android.os.Handler r9 = new android.os.Handler     // Catch:{ all -> 0x01c9 }
            r9.<init>()     // Catch:{ all -> 0x01c9 }
            d.i.a.a.h r1 = new d.i.a.a.h     // Catch:{ all -> 0x01c9 }
            r1.<init>(r8, r9)     // Catch:{ all -> 0x01c9 }
            r4 = 1000(0x3e8, double:4.94E-321)
            r9.postDelayed(r1, r4)     // Catch:{ all -> 0x01c9 }
            d.i.a.e.c r9 = new d.i.a.e.c     // Catch:{ all -> 0x01c9 }
            r9.<init>(r2, r2, r0, r0)     // Catch:{ all -> 0x01c9 }
            r8.f16538q = r9     // Catch:{ all -> 0x01c9 }
            d.i.a.e.c r9 = r8.f16538q     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "STO_initial_floor"
            r9.mo15915a((java.lang.String) r0)     // Catch:{ all -> 0x01c9 }
            java.util.TreeMap r9 = new java.util.TreeMap     // Catch:{ all -> 0x01c9 }
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r8.f16535n     // Catch:{ all -> 0x01c9 }
            r9.<init>(r0)     // Catch:{ all -> 0x01c9 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x01c9 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01c9 }
            java.lang.Object r9 = r9.next()     // Catch:{ all -> 0x01c9 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x01c9 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x01c9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01c9 }
            r8.mo15766a((java.lang.String) r9)     // Catch:{ all -> 0x01c9 }
            r9 = 3
            r8.f16523b = r9     // Catch:{ all -> 0x01c9 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x01c9 }
            monitor-exit(r8)
            return r9
        L_0x01c9:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p193a.C5961q.mo15762a(java.util.HashMap):java.lang.Boolean");
    }

    /* renamed from: a */
    public void mo15763a(ViewGroup viewGroup) {
        this.f16536o = viewGroup;
    }

    /* renamed from: a */
    public void mo15764a(C5962a aVar) {
        this.f16522M = aVar;
    }

    /* renamed from: a */
    public void mo15765a(C6019c cVar) {
        this.f16539r = new C6019c(cVar.mo15921f().x, cVar.mo15921f().y, cVar.mo15913a(), 0);
        this.f16539r.mo15915a(this.f16535n.get(Integer.valueOf(cVar.mo15913a())));
        C6011b bVar = this.f16537p;
        if (bVar != null) {
            bVar.mo15890a((PointF) null);
        }
        C6011b bVar2 = this.f16537p;
        if (bVar2 == null) {
            this.f16537p = new C6011b(this.f16525d, this.f16530i.get(this.f16539r.mo15918c()));
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f16525d.getResources(), C5982b.icon_destination);
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight() * 2, Bitmap.Config.ARGB_8888);
            for (int i = 0; i < decodeResource.getWidth(); i++) {
                for (int i2 = 0; i2 < decodeResource.getHeight() * 2; i2++) {
                    if (i2 < decodeResource.getHeight()) {
                        createBitmap.setPixel(i, i2, decodeResource.getPixel(i, i2));
                    } else {
                        createBitmap.setPixel(i, i2, 0);
                    }
                }
            }
            this.f16537p.mo15894b(Bitmap.createScaledBitmap(createBitmap, createBitmap.getWidth() / 4, createBitmap.getHeight() / 4, true));
            this.f16537p.mo15897c(0.0f);
            this.f16537p.mo15893b(3);
            this.f16537p.mo15890a(this.f16539r.mo15921f());
            this.f16530i.get(this.f16539r.mo15918c()).getOverLays().add(this.f16537p);
            this.f16530i.get(this.f16539r.mo15918c()).mo15935a();
            return;
        }
        bVar2.mo15890a(this.f16539r.mo15921f());
    }

    /* renamed from: a */
    public synchronized void mo15766a(String str) {
        if (str != null) {
            if (str != this.f16540s) {
                ((Activity) this.f16525d).runOnUiThread(new C5953i(this, str));
            }
            m22564n();
        }
    }

    /* renamed from: a */
    public void mo15767a(String str, List list) {
        HashMap hashMap = this.f16532k.get(str);
        if (hashMap == null) {
            String str2 = f16509a;
            Log.e(str2, "Cannot get pois by " + str);
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (list.contains(entry.getKey()) || list.contains(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL)) {
                for (int i = 0; i < ((List) entry.getValue()).size(); i++) {
                    this.f16530i.get(str).getOverLays().add((C6010a) ((List) entry.getValue()).get(i));
                }
            }
        }
        C6011b locationOverlay = this.f16530i.get(str).getLocationOverlay();
        this.f16530i.get(str).getOverLays().remove(locationOverlay);
        this.f16530i.get(str).getOverLays().add(locationOverlay);
    }

    /* renamed from: a */
    public void mo15768a(int[] iArr) {
        if (this.f16523b != 3) {
            if (iArr == null || iArr.length == 3) {
                this.f16537p.mo15890a((PointF) null);
                for (String str : this.f16530i.keySet()) {
                    this.f16531j.get(str).mo15908a((int[]) null);
                }
                return;
            }
            this.f16539r = new C6019c((float) iArr[iArr.length - 3], (float) iArr[iArr.length - 2], iArr[iArr.length - 1], 0);
            this.f16539r.mo15915a(this.f16535n.get(Integer.valueOf(iArr[iArr.length - 1])));
            m22541b(iArr);
            C6011b bVar = this.f16537p;
            if (bVar == null) {
                this.f16537p = new C6011b(this.f16525d, this.f16530i.get(this.f16539r.mo15918c()));
                Bitmap decodeResource = BitmapFactory.decodeResource(this.f16525d.getResources(), C5982b.icon_destination);
                Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight() * 2, Bitmap.Config.ARGB_8888);
                for (int i = 0; i < decodeResource.getWidth(); i++) {
                    for (int i2 = 0; i2 < decodeResource.getHeight() * 2; i2++) {
                        if (i2 < decodeResource.getHeight()) {
                            createBitmap.setPixel(i, i2, decodeResource.getPixel(i, i2));
                        } else {
                            createBitmap.setPixel(i, i2, 0);
                        }
                    }
                }
                this.f16537p.mo15894b(Bitmap.createScaledBitmap(createBitmap, createBitmap.getWidth() / 4, createBitmap.getHeight() / 4, true));
                this.f16537p.mo15897c(0.0f);
                this.f16537p.mo15893b(3);
                this.f16537p.mo15890a(this.f16539r.mo15921f());
                this.f16530i.get(this.f16539r.mo15918c()).getOverLays().add(this.f16537p);
                this.f16530i.get(this.f16539r.mo15918c()).mo15935a();
                return;
            }
            bVar.mo15890a(this.f16539r.mo15921f());
        }
    }

    /* renamed from: b */
    public HashMap<String, List> mo15769b() {
        HashMap<String, List> hashMap = new HashMap<>();
        try {
            for (Map.Entry<Integer, String> value : this.f16535n.entrySet()) {
                String str = (String) value.getValue();
                hashMap.put(str, (List) this.f16532k.get(str).get("location"));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: int[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15770b(p101d.p191i.p192a.p200e.C6019c r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 3
            if (r1 != 0) goto L_0x000b
            r0.m22527a((int) r2)
            return
        L_0x000b:
            d.i.a.e.c r3 = new d.i.a.e.c
            r3.<init>(r1)
            java.lang.String r1 = f16509a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "current location: "
            r4.append(r5)
            d.i.a.e.c r5 = r0.f16538q
            java.lang.String r5 = r5.mo15922g()
            r4.append(r5)
            java.lang.String r5 = ", "
            r4.append(r5)
            java.lang.String r5 = r3.mo15922g()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r1, r4)
            java.util.List<java.lang.String> r1 = r0.f16526e
            if (r1 != 0) goto L_0x0044
            java.lang.String r1 = f16509a
            java.lang.String r2 = "Invalid buildingID or null resource"
            android.util.Log.e(r1, r2)
            return
        L_0x0044:
            java.lang.Boolean r1 = r0.f16543v
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = f16509a
            java.lang.String r2 = "The STOBuilding is now initializing..."
            android.util.Log.w(r1, r2)
            return
        L_0x0054:
            r1 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            java.util.HashMap<java.lang.Integer, java.lang.String> r5 = r0.f16535n
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0063:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x007e
            java.lang.Object r6 = r5.next()
            int r8 = r3.mo15913a()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r8 != r6) goto L_0x0063
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
        L_0x007e:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x00ac
            java.lang.String r1 = f16509a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Mismatch buildingID and location signal: ["
            r4.append(r5)
            java.lang.String r5 = r0.f16524c
            r4.append(r5)
            java.lang.String r5 = "] floorIndex: "
            r4.append(r5)
            int r3 = r3.mo15917b()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.e(r1, r3)
            r0.m22527a((int) r2)
            return
        L_0x00ac:
            java.util.HashMap<java.lang.Integer, java.lang.String> r4 = r0.f16535n
            int r5 = r3.mo15913a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r3.mo15915a((java.lang.String) r4)
            d.i.a.a.q$g r4 = r0.f16519J
            int[] r5 = r3.mo15920e()
            r4.mo15785a(r5)
            int r4 = r0.f16523b
            r5 = 2
            if (r4 == r5) goto L_0x00d4
            java.lang.String r4 = r3.mo15918c()
            r0.mo15766a((java.lang.String) r4)
        L_0x00d4:
            r0.m22543c((p101d.p191i.p192a.p200e.C6019c) r3)
            java.lang.String r4 = r3.mo15918c()
            d.i.a.e.c r6 = r0.f16538q
            java.lang.String r6 = r6.mo15918c()
            if (r4 == r6) goto L_0x00e5
            r4 = r7
            goto L_0x00e6
        L_0x00e5:
            r4 = r1
        L_0x00e6:
            int r6 = r0.f16523b
            if (r6 != r2) goto L_0x00ec
            r6 = r7
            goto L_0x00ed
        L_0x00ec:
            r6 = r1
        L_0x00ed:
            r4 = r4 | r6
            if (r4 == 0) goto L_0x0127
            d.i.a.e.c r4 = r0.f16538q
            java.lang.String r4 = r4.mo15918c()
            java.lang.String r6 = "STO_initial_floor"
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L_0x0114
            java.util.HashMap<java.lang.String, d.i.a.i> r4 = r0.f16530i
            d.i.a.e.c r6 = r0.f16538q
            java.lang.String r6 = r6.mo15918c()
            java.lang.Object r4 = r4.get(r6)
            d.i.a.i r4 = (p101d.p191i.p192a.C6027i) r4
            d.i.a.d.b r4 = r4.getLocationOverlay()
            r6 = 4
            r4.mo15893b((int) r6)
        L_0x0114:
            java.util.HashMap<java.lang.String, d.i.a.i> r4 = r0.f16530i
            java.lang.String r6 = r3.mo15918c()
            java.lang.Object r4 = r4.get(r6)
            d.i.a.i r4 = (p101d.p191i.p192a.C6027i) r4
            d.i.a.d.b r4 = r4.getLocationOverlay()
            r4.mo15893b((int) r2)
        L_0x0127:
            r0.f16538q = r3
            int r4 = r0.f16523b
            if (r4 != r2) goto L_0x012f
            r0.f16523b = r5
        L_0x012f:
            java.util.HashMap<java.lang.String, d.i.a.d.c> r4 = r0.f16531j
            java.util.HashMap<java.lang.Integer, java.lang.String> r6 = r0.f16535n
            int r3 = r3.mo15913a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r6.get(r3)
            java.lang.Object r3 = r4.get(r3)
            d.i.a.d.c r3 = (p101d.p191i.p192a.p199d.C6013c) r3
            java.util.List r3 = r3.mo15909b()
            int r4 = r3.size()
            if (r4 >= r7) goto L_0x0150
            return
        L_0x0150:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            r6 = 80
            android.content.Context r8 = r0.f16525d
            int r9 = p101d.p191i.p192a.C6024f.nav_info_instruction
            java.lang.String r8 = r8.getString(r9)
            int r9 = r3.size()
            java.lang.String r10 = "METER"
            java.lang.String r11 = "#.##"
            java.lang.String r12 = "ACTION"
            if (r9 >= r5) goto L_0x01c7
            java.lang.Object r2 = r3.get(r1)
            int[] r2 = (int[]) r2
            r2 = r2[r1]
            float r2 = (float) r2
            d.i.a.e.c r5 = r0.f16538q
            android.graphics.PointF r5 = r5.mo15921f()
            float r5 = r5.x
            float r2 = r2 - r5
            r4.x = r2
            java.lang.Object r1 = r3.get(r1)
            int[] r1 = (int[]) r1
            r1 = r1[r7]
            float r1 = (float) r1
            d.i.a.e.c r2 = r0.f16538q
            android.graphics.PointF r2 = r2.mo15921f()
            float r2 = r2.y
            float r1 = r1 - r2
            r4.y = r1
            float r1 = r4.x
            float r1 = r1 * r1
            float r2 = r4.y
            float r2 = r2 * r2
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            double r3 = (double) r6
            double r1 = r1 / r3
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            r3.<init>(r11)
            java.lang.String r1 = r3.format(r1)
            java.lang.String r1 = r8.replace(r10, r1)
            android.content.Context r2 = r0.f16525d
            int r3 = p101d.p191i.p192a.C6024f.nav_info_arrived
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r1 = r1.replace(r12, r2)
            android.content.Context r2 = r0.f16525d
            android.app.Activity r2 = (android.app.Activity) r2
            d.i.a.a.j r3 = new d.i.a.a.j
            r3.<init>(r0, r1)
            r2.runOnUiThread(r3)
            return
        L_0x01c7:
            int[] r2 = new int[r2]
            float r5 = r4.x
            float r5 = java.lang.Math.abs(r5)
            float r9 = r4.y
            float r9 = java.lang.Math.abs(r9)
            float r5 = r5 + r9
            r9 = r2
            r2 = r7
        L_0x01d8:
            int r13 = r3.size()
            r14 = 1092616192(0x41200000, float:10.0)
            if (r2 >= r13) goto L_0x0218
            java.lang.Object r5 = r3.get(r2)
            r9 = r5
            int[] r9 = (int[]) r9
            r5 = r9[r1]
            float r5 = (float) r5
            d.i.a.e.c r13 = r0.f16538q
            android.graphics.PointF r13 = r13.mo15921f()
            float r13 = r13.x
            float r5 = r5 - r13
            r4.x = r5
            r5 = r9[r7]
            float r5 = (float) r5
            d.i.a.e.c r13 = r0.f16538q
            android.graphics.PointF r13 = r13.mo15921f()
            float r13 = r13.y
            float r5 = r5 - r13
            r4.y = r5
            float r5 = r4.x
            float r5 = java.lang.Math.abs(r5)
            float r13 = r4.y
            float r13 = java.lang.Math.abs(r13)
            float r5 = r5 + r13
            int r13 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r13 < 0) goto L_0x0215
            goto L_0x0219
        L_0x0215:
            int r2 = r2 + 1
            goto L_0x01d8
        L_0x0218:
            r2 = r7
        L_0x0219:
            float r13 = r4.x
            float r13 = r13 * r13
            float r15 = r4.y
            float r15 = r15 * r15
            float r13 = r13 + r15
            r15 = r2
            double r1 = (double) r13
            double r1 = java.lang.Math.sqrt(r1)
            r16 = r15
            double r14 = (double) r6
            double r1 = r1 / r14
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            r6.<init>(r11)
            java.lang.String r1 = r6.format(r1)
            java.lang.String r1 = r8.replace(r10, r1)
            r2 = 1092616192(0x41200000, float:10.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x023f
            r2 = r7
            goto L_0x0240
        L_0x023f:
            r2 = 0
        L_0x0240:
            int r5 = r3.size()
            int r5 = r5 - r7
            r6 = r16
            if (r6 != r5) goto L_0x024b
            r5 = r7
            goto L_0x024c
        L_0x024b:
            r5 = 0
        L_0x024c:
            r2 = r2 | r5
            if (r2 == 0) goto L_0x0268
            android.content.Context r2 = r0.f16525d
            int r3 = p101d.p191i.p192a.C6024f.nav_info_arrived
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r1 = r1.replace(r12, r2)
            android.content.Context r2 = r0.f16525d
            android.app.Activity r2 = (android.app.Activity) r2
            d.i.a.a.k r3 = new d.i.a.a.k
            r3.<init>(r0, r1)
            r2.runOnUiThread(r3)
            return
        L_0x0268:
            int r2 = r6 + 1
            java.lang.Object r2 = r3.get(r2)
            int[] r2 = (int[]) r2
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>()
            r5 = 0
            r6 = r2[r5]
            r8 = r9[r5]
            int r6 = r6 - r8
            float r6 = (float) r6
            r3.x = r6
            r2 = r2[r7]
            r6 = r9[r7]
            int r2 = r2 - r6
            float r2 = (float) r2
            r3.y = r2
            float r2 = r4.x
            float r6 = r3.x
            float r2 = r2 * r6
            float r6 = r4.y
            float r8 = r3.y
            float r6 = r6 * r8
            float r2 = r2 + r6
            float r6 = r4.length()
            float r8 = r3.length()
            float r6 = r6 * r8
            float r2 = r2 / r6
            double r8 = (double) r2
            double r8 = java.lang.Math.acos(r8)
            r10 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r8 = r8 * r10
            float r2 = r4.x
            float r6 = r3.y
            float r2 = r2 * r6
            float r4 = r4.y
            float r3 = r3.x
            float r4 = r4 * r3
            float r2 = r2 - r4
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x02b7
            double r8 = -r8
        L_0x02b7:
            java.lang.String r2 = f16509a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "signed_angle:"
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r2, r3)
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x02d5
            r2 = r7
            goto L_0x02d6
        L_0x02d5:
            r2 = r5
        L_0x02d6:
            r3 = 4640185359819341824(0x4065400000000000, double:170.0)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x02e0
            r5 = r7
        L_0x02e0:
            r2 = r2 | r5
            if (r2 == 0) goto L_0x02f0
            android.content.Context r2 = r0.f16525d
            int r3 = p101d.p191i.p192a.C6024f.nav_info_action_continue
        L_0x02e7:
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r1 = r1.replace(r12, r2)
            goto L_0x0300
        L_0x02f0:
            r2 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x02fb
            android.content.Context r2 = r0.f16525d
            int r3 = p101d.p191i.p192a.C6024f.nav_info_action_right
            goto L_0x02e7
        L_0x02fb:
            android.content.Context r2 = r0.f16525d
            int r3 = p101d.p191i.p192a.C6024f.nav_info_action_left
            goto L_0x02e7
        L_0x0300:
            java.lang.String r2 = f16509a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = ""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r2, r3)
            android.content.Context r2 = r0.f16525d
            android.app.Activity r2 = (android.app.Activity) r2
            d.i.a.a.l r3 = new d.i.a.a.l
            r3.<init>(r0, r1)
            r2.runOnUiThread(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p193a.C5961q.mo15770b(d.i.a.e.c):void");
    }

    /* renamed from: c */
    public synchronized Boolean mo15771c() {
        this.f16535n = m22526a(this.f16529h.mo15732f(this.f16524c));
        return mo15762a((HashMap) this.f16535n);
    }

    /* renamed from: d */
    public boolean mo15772d() {
        JSONObject b = this.f16529h.mo15720b().mo15929b("freeSpace");
        if (b == null) {
            Log.e(f16509a, "null free space info.");
            return false;
        }
        Log.d(f16509a, b.toString());
        if (this.f16532k.size() != this.f16535n.size()) {
            return false;
        }
        new Matrix().postScale(0.15f, 0.15f);
        try {
            JSONObject jSONObject = b.getJSONObject(this.f16524c);
            Log.d(f16509a, jSONObject.toString());
            for (Integer next : this.f16535n.keySet()) {
                List list = (List) this.f16532k.get(this.f16535n.get(next)).get("location");
                JSONArray jSONArray = jSONObject.getJSONObject(this.f16535n.get(next)).getJSONArray("data");
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Boolean bool = false;
                    C6011b bVar = (C6011b) list.get(i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= jSONArray.length()) {
                            break;
                        }
                        String string = jSONArray.getJSONObject(i3).getString("NUMBER");
                        StringBuilder sb = new StringBuilder();
                        sb.append("sto_lot");
                        sb.append(string.substring(3));
                        if (sb.toString().compareTo(bVar.mo15898d()) == 0) {
                            bool = true;
                            break;
                        }
                        i3++;
                    }
                    if (bool.booleanValue()) {
                        bVar.mo15888a(this.f16546y);
                        i++;
                    } else {
                        bVar.mo15888a(this.f16545x);
                    }
                }
                this.f16547z.put(this.f16535n.get(next), i);
            }
            m22564n();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }
}
