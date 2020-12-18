package p101d.p191i.p192a.p194b.p196b.p197a;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.message.TokenParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: d.i.a.b.b.a.g */
public class C5997g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f16684a = false;

    /* renamed from: b */
    private static boolean f16685b = true;

    /* renamed from: c */
    private static final Pattern f16686c = Pattern.compile("[\\s,]*");

    /* renamed from: d */
    private static final RectF f16687d = new RectF();

    /* renamed from: e */
    private static final Matrix f16688e = new Matrix();

    /* renamed from: f */
    private static final Matrix f16689f = new Matrix();

    /* renamed from: d.i.a.b.b.a.g$a */
    private static class C5998a {

        /* renamed from: a */
        String f16690a;

        /* renamed from: b */
        String f16691b;

        /* renamed from: c */
        boolean f16692c;

        /* renamed from: d */
        float f16693d;

        /* renamed from: e */
        float f16694e;

        /* renamed from: f */
        float f16695f;

        /* renamed from: g */
        float f16696g;

        /* renamed from: h */
        float f16697h;

        /* renamed from: i */
        float f16698i;

        /* renamed from: j */
        float f16699j;

        /* renamed from: k */
        ArrayList<Float> f16700k;

        /* renamed from: l */
        ArrayList<Integer> f16701l;

        /* renamed from: m */
        Matrix f16702m;

        /* renamed from: n */
        public Shader f16703n;

        /* renamed from: o */
        public boolean f16704o;

        /* renamed from: p */
        public Shader.TileMode f16705p;

        private C5998a() {
            this.f16700k = new ArrayList<>();
            this.f16701l = new ArrayList<>();
            this.f16702m = null;
            this.f16703n = null;
            this.f16704o = false;
        }

        /* renamed from: a */
        public C5998a mo15862a(C5998a aVar) {
            C5998a aVar2 = new C5998a();
            aVar2.f16690a = aVar.f16690a;
            aVar2.f16691b = this.f16690a;
            aVar2.f16692c = aVar.f16692c;
            aVar2.f16693d = aVar.f16693d;
            aVar2.f16695f = aVar.f16695f;
            aVar2.f16694e = aVar.f16694e;
            aVar2.f16696g = aVar.f16696g;
            aVar2.f16697h = aVar.f16697h;
            aVar2.f16698i = aVar.f16698i;
            aVar2.f16699j = aVar.f16699j;
            aVar2.f16700k = this.f16700k;
            aVar2.f16701l = this.f16701l;
            aVar2.f16702m = this.f16702m;
            Matrix matrix = aVar.f16702m;
            if (matrix != null) {
                Matrix matrix2 = this.f16702m;
                if (matrix2 != null) {
                    matrix = new Matrix(matrix2);
                    matrix.preConcat(aVar.f16702m);
                }
                aVar2.f16702m = matrix;
            }
            aVar2.f16704o = aVar.f16704o;
            aVar2.f16703n = aVar.f16703n;
            aVar2.f16705p = aVar.f16705p;
            return aVar2;
        }
    }

    /* renamed from: d.i.a.b.b.a.g$b */
    private static class C5999b {

        /* renamed from: a */
        public final float f16706a;

        public C5999b(float f) {
            this.f16706a = f;
        }
    }

    /* renamed from: d.i.a.b.b.a.g$c */
    private static class C6000c {

        /* renamed from: a */
        public Path f16707a;

        /* renamed from: b */
        public float f16708b;

        /* renamed from: c */
        public float f16709c;

        private C6000c() {
        }
    }

    /* renamed from: d.i.a.b.b.a.g$d */
    private static class C6001d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ArrayList<Float> f16710a;

        /* renamed from: b */
        private int f16711b;

        public C6001d(ArrayList<Float> arrayList, int i) {
            this.f16710a = arrayList;
            this.f16711b = i;
        }
    }

    /* renamed from: d.i.a.b.b.a.g$e */
    private static class C6002e {

        /* renamed from: a */
        C6004g f16712a;

        /* renamed from: b */
        Attributes f16713b;

        private C6002e(Attributes attributes) {
            this.f16712a = null;
            this.f16713b = attributes;
            String b = C5997g.m22736f("style", attributes);
            if (b != null) {
                this.f16712a = new C6004g(b);
            }
        }

        /* renamed from: a */
        private int m22739a(int i) {
            int i2 = i & 3840;
            int i3 = i & 240;
            int i4 = i & 15;
            return i4 | (i2 << 12) | (i2 << 8) | (i3 << 4) | (i3 << 8) | (i4 << 4);
        }

        /* renamed from: a */
        private Integer m22740a(int i, int i2, int i3) {
            return Integer.valueOf(((i & 255) << 16) | ((i2 & 255) << 8) | (i3 & 255));
        }

        /* renamed from: e */
        private int m22741e(String str) {
            return str.endsWith("%") ? Math.round((Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f) * 255.0f) : Integer.parseInt(str);
        }

        /* renamed from: a */
        public float mo15863a(String str, float f) {
            String a = mo15865a(str);
            if (a == null) {
                return f;
            }
            try {
                return Float.parseFloat(a);
            } catch (NumberFormatException unused) {
                return f;
            }
        }

        /* renamed from: a */
        public Float mo15864a(String str, Float f) {
            String a = mo15865a(str);
            if (a == null) {
                return f;
            }
            try {
                return Float.valueOf(Float.parseFloat(a));
            } catch (NumberFormatException unused) {
                return f;
            }
        }

        /* renamed from: a */
        public String mo15865a(String str) {
            C6004g gVar = this.f16712a;
            String a = gVar != null ? gVar.mo15879a(str) : null;
            return a == null ? C5997g.m22736f(str, this.f16713b) : a;
        }

        /* renamed from: b */
        public Integer mo15866b(String str) {
            String a = mo15865a(str);
            if (a == null) {
                return null;
            }
            if (a.startsWith("#")) {
                try {
                    int parseInt = Integer.parseInt(a.substring(1), 16);
                    if (a.length() == 4) {
                        parseInt = m22739a(parseInt);
                    }
                    return Integer.valueOf(parseInt);
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else if (!a.startsWith("rgb(") || !a.endsWith(")")) {
                return C5994d.m22715a(a);
            } else {
                String[] split = a.substring(4, a.length() - 1).split(",");
                try {
                    return m22740a(m22741e(split[0]), m22741e(split[1]), m22741e(split[2]));
                } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused2) {
                    return null;
                }
            }
        }

        /* renamed from: c */
        public Float mo15867c(String str) {
            return mo15864a(str, (Float) null);
        }

        /* renamed from: d */
        public String mo15868d(String str) {
            return mo15865a(str);
        }
    }

    /* renamed from: d.i.a.b.b.a.g$f */
    static class C6003f extends DefaultHandler {

        /* renamed from: A */
        C5998a f16714A = null;

        /* renamed from: B */
        private List<String> f16715B = null;

        /* renamed from: C */
        private final Matrix f16716C = new Matrix();

        /* renamed from: D */
        private boolean f16717D = false;

        /* renamed from: E */
        private int f16718E = 0;

        /* renamed from: F */
        private boolean f16719F = false;

        /* renamed from: G */
        private final RectF f16720G = new RectF();

        /* renamed from: a */
        private Picture f16721a;

        /* renamed from: b */
        private Canvas f16722b;

        /* renamed from: c */
        private Float f16723c;

        /* renamed from: d */
        private Float f16724d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f16725e = "";

        /* renamed from: f */
        private JSONArray f16726f = new JSONArray();

        /* renamed from: g */
        final LinkedList<C5999b> f16727g = new LinkedList<>();

        /* renamed from: h */
        Paint f16728h = new Paint();

        /* renamed from: i */
        boolean f16729i = false;

        /* renamed from: j */
        final LinkedList<Paint> f16730j = new LinkedList<>();

        /* renamed from: k */
        final LinkedList<Boolean> f16731k = new LinkedList<>();

        /* renamed from: l */
        Paint f16732l;

        /* renamed from: m */
        boolean f16733m = false;

        /* renamed from: n */
        final LinkedList<Paint> f16734n = new LinkedList<>();

        /* renamed from: o */
        final LinkedList<Boolean> f16735o = new LinkedList<>();

        /* renamed from: p */
        final RectF f16736p = new RectF();

        /* renamed from: q */
        RectF f16737q = null;

        /* renamed from: r */
        final RectF f16738r = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

        /* renamed from: s */
        Integer f16739s = null;

        /* renamed from: t */
        Integer f16740t = null;

        /* renamed from: u */
        Float f16741u = null;

        /* renamed from: v */
        boolean f16742v = false;

        /* renamed from: w */
        Integer f16743w;

        /* renamed from: x */
        final LinkedList<Boolean> f16744x = new LinkedList<>();

        /* renamed from: y */
        final LinkedList<Matrix> f16745y = new LinkedList<>();

        /* renamed from: z */
        final HashMap<String, C5998a> f16746z = new HashMap<>();

        public C6003f() {
            this.f16728h.setAntiAlias(true);
            this.f16728h.setStyle(Paint.Style.STROKE);
            this.f16732l = new Paint();
            this.f16732l.setAntiAlias(true);
            this.f16732l.setStyle(Paint.Style.FILL);
            this.f16745y.addFirst(new Matrix());
            this.f16727g.addFirst(new C5999b(1.0f));
        }

        /* renamed from: a */
        private static float m22748a(String str, float f) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException unused) {
                return f;
            }
        }

        /* renamed from: a */
        private Matrix m22749a(Attributes attributes) {
            String b = C5997g.m22736f("transform", attributes);
            boolean z = b != null;
            this.f16744x.addLast(Boolean.valueOf(z));
            if (!z) {
                return null;
            }
            Matrix a = C5997g.m22732c(b);
            this.f16722b.save();
            this.f16722b.concat(a);
            a.postConcat(this.f16745y.getLast());
            this.f16745y.addLast(a);
            return a;
        }

        /* renamed from: a */
        private C5998a m22750a(boolean z, Attributes attributes) {
            C5998a aVar = new C5998a();
            aVar.f16690a = C5997g.m22736f("id", attributes);
            aVar.f16692c = z;
            if (z) {
                aVar.f16693d = C5997g.m22727b("x1", attributes, 0.0f);
                aVar.f16695f = C5997g.m22727b("x2", attributes, 1.0f);
                aVar.f16694e = C5997g.m22727b("y1", attributes, 0.0f);
                aVar.f16696g = C5997g.m22727b("y2", attributes, 0.0f);
            } else {
                aVar.f16697h = C5997g.m22727b("cx", attributes, 0.0f);
                aVar.f16698i = C5997g.m22727b("cy", attributes, 0.0f);
                aVar.f16699j = C5997g.m22727b("r", attributes, 0.0f);
            }
            String b = C5997g.m22736f("gradientTransform", attributes);
            if (b != null) {
                aVar.f16702m = C5997g.m22732c(b);
            }
            String b2 = C5997g.m22736f("spreadMethod", attributes);
            if (b2 == null) {
                b2 = "pad";
            }
            aVar.f16705p = b2.equals("reflect") ? Shader.TileMode.MIRROR : b2.equals("repeat") ? Shader.TileMode.REPEAT : Shader.TileMode.CLAMP;
            String b3 = C5997g.m22736f("gradientUnits", attributes);
            if (b3 == null) {
                b3 = "objectBoundingBox";
            }
            aVar.f16704o = !b3.equals("userSpaceOnUse");
            String b4 = C5997g.m22736f(SVGParser.XML_STYLESHEET_ATTR_HREF, attributes);
            if (b4 != null) {
                if (b4.startsWith("#")) {
                    b4 = b4.substring(1);
                }
                aVar.f16691b = b4;
            }
            return aVar;
        }

        /* renamed from: a */
        private void m22752a(float f, float f2) {
            RectF rectF = this.f16738r;
            if (f < rectF.left) {
                rectF.left = f;
            }
            RectF rectF2 = this.f16738r;
            if (f > rectF2.right) {
                rectF2.right = f;
            }
            RectF rectF3 = this.f16738r;
            if (f2 < rectF3.top) {
                rectF3.top = f2;
            }
            RectF rectF4 = this.f16738r;
            if (f2 > rectF4.bottom) {
                rectF4.bottom = f2;
            }
        }

        /* renamed from: a */
        private void m22753a(RectF rectF) {
            m22754a(rectF, (Paint) null);
        }

        /* renamed from: a */
        private void m22754a(RectF rectF, Paint paint) {
            this.f16745y.getLast().mapRect(this.f16720G, rectF);
            float strokeWidth = paint == null ? 0.0f : paint.getStrokeWidth() / 2.0f;
            RectF rectF2 = this.f16720G;
            m22752a(rectF2.left - strokeWidth, rectF2.top - strokeWidth);
            RectF rectF3 = this.f16720G;
            m22752a(rectF3.right + strokeWidth, rectF3.bottom + strokeWidth);
        }

        /* renamed from: a */
        private void m22755a(C6002e eVar, Integer num, boolean z, Paint paint) {
            int intValue = (num.intValue() & 16777215) | -16777216;
            Integer num2 = this.f16739s;
            if (num2 != null && num2.intValue() == intValue) {
                intValue = this.f16740t.intValue();
            }
            paint.setShader((Shader) null);
            paint.setColor(intValue);
            Float c = eVar.mo15867c("opacity");
            if (c == null) {
                c = eVar.mo15867c(z ? "fill-opacity" : "stroke-opacity");
            }
            float floatValue = (c != null ? c.floatValue() : 1.0f) * mo15869a().f16706a;
            Float f = this.f16741u;
            if (f != null) {
                floatValue *= f.floatValue();
            }
            paint.setAlpha((int) (floatValue * 255.0f));
        }

        /* renamed from: a */
        private void m22756a(String str, String str2) {
            if (str != null) {
                if (str.equals("none") || str.equals("null")) {
                    this.f16728h.setPathEffect((PathEffect) null);
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(str, " ,");
                int countTokens = stringTokenizer.countTokens();
                if ((countTokens & 1) == 1) {
                    countTokens *= 2;
                }
                float[] fArr = new float[countTokens];
                int i = 0;
                float f = 0.0f;
                float f2 = 1.0f;
                int i2 = 0;
                float f3 = 0.0f;
                while (stringTokenizer.hasMoreTokens()) {
                    f2 = m22748a(stringTokenizer.nextToken(), f2);
                    fArr[i2] = f2;
                    f3 += f2;
                    i2++;
                }
                while (i2 < fArr.length) {
                    float f4 = fArr[i];
                    fArr[i2] = f4;
                    f3 += f4;
                    i2++;
                    i++;
                }
                if (str2 != null) {
                    try {
                        f = Float.parseFloat(str2) % f3;
                    } catch (NumberFormatException unused) {
                    }
                }
                this.f16728h.setPathEffect(new DashPathEffect(fArr, f));
            }
        }

        /* renamed from: a */
        private void m22757a(String str, String str2, String str3) {
            if (str.compareTo("null") != 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    jSONObject.put("locX", str2);
                    jSONObject.put("locY", str3);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                this.f16726f.put(jSONObject);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m22758a(p101d.p191i.p192a.p194b.p196b.p197a.C5997g.C6002e r6) {
            /*
                r5 = this;
                boolean r0 = r5.f16742v
                r1 = 0
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                java.lang.String r0 = "display"
                java.lang.String r0 = r6.mo15868d(r0)
                java.lang.String r2 = "none"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0015
                return r1
            L_0x0015:
                java.lang.String r0 = "stroke-width"
                java.lang.Float r0 = r6.mo15867c(r0)
                if (r0 == 0) goto L_0x0026
                android.graphics.Paint r3 = r5.f16728h
                float r0 = r0.floatValue()
                r3.setStrokeWidth(r0)
            L_0x0026:
                java.lang.String r0 = "stroke-linecap"
                java.lang.String r0 = r6.mo15868d(r0)
                java.lang.String r3 = "round"
                boolean r4 = r3.equals(r0)
                if (r4 == 0) goto L_0x003c
                android.graphics.Paint r0 = r5.f16728h
                android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            L_0x0038:
                r0.setStrokeCap(r4)
                goto L_0x0056
            L_0x003c:
                java.lang.String r4 = "square"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0049
                android.graphics.Paint r0 = r5.f16728h
                android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
                goto L_0x0038
            L_0x0049:
                java.lang.String r4 = "butt"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L_0x0056
                android.graphics.Paint r0 = r5.f16728h
                android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
                goto L_0x0038
            L_0x0056:
                java.lang.String r0 = "stroke-linejoin"
                java.lang.String r0 = r6.mo15868d(r0)
                java.lang.String r4 = "miter"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x006c
                android.graphics.Paint r0 = r5.f16728h
                android.graphics.Paint$Join r3 = android.graphics.Paint.Join.MITER
            L_0x0068:
                r0.setStrokeJoin(r3)
                goto L_0x0084
            L_0x006c:
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0077
                android.graphics.Paint r0 = r5.f16728h
                android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
                goto L_0x0068
            L_0x0077:
                java.lang.String r3 = "bevel"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x0084
                android.graphics.Paint r0 = r5.f16728h
                android.graphics.Paint$Join r3 = android.graphics.Paint.Join.BEVEL
                goto L_0x0068
            L_0x0084:
                java.lang.String r0 = "stroke-dasharray"
                java.lang.String r0 = r6.mo15868d(r0)
                java.lang.String r3 = "stroke-dashoffset"
                java.lang.String r3 = r6.mo15868d(r3)
                r5.m22756a((java.lang.String) r0, (java.lang.String) r3)
                java.lang.String r0 = "stroke"
                java.lang.String r3 = r6.mo15865a((java.lang.String) r0)
                r4 = 1
                if (r3 == 0) goto L_0x00d1
                boolean r2 = r3.equalsIgnoreCase(r2)
                if (r2 == 0) goto L_0x00a8
            L_0x00a2:
                android.graphics.Paint r6 = r5.f16728h
                r6.setColor(r1)
                return r1
            L_0x00a8:
                java.lang.Integer r0 = r6.mo15866b(r0)
                if (r0 == 0) goto L_0x00b4
                android.graphics.Paint r2 = r5.f16728h
                r5.m22755a(r6, r0, r1, r2)
                return r4
            L_0x00b4:
                boolean r6 = p101d.p191i.p192a.p194b.p196b.p197a.C5997g.f16684a
                if (r6 == 0) goto L_0x00a2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Unrecognized stroke color, using none: "
                r6.append(r0)
                r6.append(r3)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "SVGAndroid"
                android.util.Log.w(r0, r6)
                goto L_0x00a2
            L_0x00d1:
                boolean r6 = r5.f16729i
                if (r6 == 0) goto L_0x00a2
                android.graphics.Paint r6 = r5.f16728h
                int r6 = r6.getColor()
                if (r6 == 0) goto L_0x00de
                r1 = r4
            L_0x00de:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p194b.p196b.p197a.C5997g.C6003f.m22758a(d.i.a.b.b.a.g$e):boolean");
        }

        /* renamed from: a */
        private boolean m22759a(C6002e eVar, RectF rectF) {
            String d = eVar.mo15868d("id");
            int i = 0;
            if (d != null && d.contains("sto_lot_")) {
                if (C5997g.f16684a) {
                    Log.d("SVGAndroid", "yaha change its colors: " + d);
                }
                Boolean bool = false;
                if (this.f16715B != null) {
                    while (true) {
                        if (i >= this.f16715B.size()) {
                            break;
                        } else if (d.compareTo(this.f16715B.get(i)) == 0) {
                            bool = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(bool.booleanValue() ? -16711936 : -65536);
                    if (valueOf != null) {
                        m22755a(eVar, valueOf, true, this.f16732l);
                        return true;
                    }
                    m22755a(eVar, -16777216, true, this.f16732l);
                    return true;
                }
            }
            if ("none".equals(eVar.mo15868d("display"))) {
                return false;
            }
            if (this.f16742v) {
                this.f16732l.setShader((Shader) null);
                this.f16732l.setColor(-1);
                return true;
            }
            String d2 = eVar.mo15868d("fill");
            if (d2 != null) {
                if (d2.startsWith("url(#")) {
                    String substring = d2.substring(5, d2.length() - 1);
                    C5998a aVar = this.f16746z.get(substring);
                    Shader shader = aVar != null ? aVar.f16703n : null;
                    if (shader != null) {
                        this.f16732l.setShader(shader);
                        this.f16716C.set(aVar.f16702m);
                        if (aVar.f16704o && rectF != null) {
                            this.f16716C.preTranslate(rectF.left, rectF.top);
                            this.f16716C.preScale(rectF.width(), rectF.height());
                        }
                        shader.setLocalMatrix(this.f16716C);
                        return true;
                    }
                    if (C5997g.f16684a) {
                        Log.w("SVGAndroid", "Didn't find shader, using black: " + substring);
                    }
                    this.f16732l.setShader((Shader) null);
                    m22755a(eVar, -16777216, true, this.f16732l);
                    return true;
                } else if (d2.equalsIgnoreCase("none")) {
                    this.f16732l.setShader((Shader) null);
                    this.f16732l.setColor(0);
                    return true;
                } else {
                    this.f16732l.setShader((Shader) null);
                    Integer b = eVar.mo15866b("fill");
                    if (b != null) {
                        m22755a(eVar, b, true, this.f16732l);
                        return true;
                    }
                    if (C5997g.f16684a) {
                        Log.w("SVGAndroid", "Unrecognized fill color, using black: " + d2);
                    }
                    m22755a(eVar, -16777216, true, this.f16732l);
                    return true;
                }
            } else if (this.f16733m) {
                return this.f16732l.getColor() != 0;
            } else {
                this.f16732l.setShader((Shader) null);
                this.f16732l.setColor(-16777216);
                return true;
            }
        }

        /* renamed from: b */
        private void m22760b() {
            if (this.f16744x.removeLast().booleanValue()) {
                this.f16722b.restore();
                this.f16745y.removeLast();
            }
        }

        /* renamed from: a */
        public C5999b mo15869a() {
            return this.f16727g.getLast();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15870a(Picture picture) {
            this.f16721a = picture;
        }

        /* renamed from: a */
        public void mo15871a(Integer num, Integer num2, boolean z) {
            this.f16739s = num;
            this.f16740t = num2;
            this.f16741u = (num2 == null || !z) ? null : Float.valueOf(((float) ((num2.intValue() >> 24) & 255)) / 255.0f);
        }

        /* renamed from: a */
        public void mo15872a(List<String> list) {
            this.f16715B = list;
        }

        /* renamed from: a */
        public void mo15873a(boolean z) {
            this.f16742v = z;
        }

        public void characters(char[] cArr, int i, int i2) {
        }

        public void endDocument() {
        }

        /* JADX WARNING: type inference failed for: r11v1, types: [android.graphics.Shader] */
        /* JADX WARNING: type inference failed for: r1v17, types: [android.graphics.RadialGradient] */
        /* JADX WARNING: type inference failed for: r1v18, types: [android.graphics.LinearGradient] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void endElement(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            /*
                r9 = this;
                java.lang.String r10 = "svg"
                boolean r10 = r11.equals(r10)
                if (r10 == 0) goto L_0x005c
                java.lang.Integer r10 = r9.f16743w
                if (r10 == 0) goto L_0x0015
                android.graphics.Canvas r11 = r9.f16722b
                int r10 = r10.intValue()
                r11.restoreToCount(r10)
            L_0x0015:
                java.lang.Float r10 = r9.f16723c
                if (r10 == 0) goto L_0x0031
                android.graphics.RectF r11 = r9.f16738r
                float r12 = r11.left
                float r10 = r10.floatValue()
                float r12 = r12 + r10
                r11.left = r12
                android.graphics.RectF r10 = r9.f16738r
                float r11 = r10.right
                java.lang.Float r12 = r9.f16723c
                float r12 = r12.floatValue()
                float r11 = r11 + r12
                r10.right = r11
            L_0x0031:
                java.lang.Float r10 = r9.f16724d
                if (r10 == 0) goto L_0x004d
                android.graphics.RectF r11 = r9.f16738r
                float r12 = r11.top
                float r10 = r10.floatValue()
                float r12 = r12 + r10
                r11.top = r12
                android.graphics.RectF r10 = r9.f16738r
                float r11 = r10.bottom
                java.lang.Float r12 = r9.f16724d
                float r12 = r12.floatValue()
                float r11 = r11 + r12
                r10.bottom = r11
            L_0x004d:
                android.graphics.Picture r10 = r9.f16721a
                r10.endRecording()
                org.json.JSONArray r10 = r9.f16726f
                java.lang.String r10 = r10.toString()
                r9.f16725e = r10
                goto L_0x0171
            L_0x005c:
                java.lang.String r10 = "linearGradient"
                boolean r12 = r11.equals(r10)
                r0 = 0
                if (r12 != 0) goto L_0x00ce
                java.lang.String r12 = "radialGradient"
                boolean r12 = r11.equals(r12)
                if (r12 == 0) goto L_0x006e
                goto L_0x00ce
            L_0x006e:
                java.lang.String r10 = "g"
                boolean r10 = r11.equals(r10)
                if (r10 == 0) goto L_0x0171
                boolean r10 = r9.f16719F
                if (r10 == 0) goto L_0x007c
                r9.f16719F = r0
            L_0x007c:
                boolean r10 = r9.f16717D
                if (r10 == 0) goto L_0x008c
                int r10 = r9.f16718E
                int r10 = r10 + -1
                r9.f16718E = r10
                int r10 = r9.f16718E
                if (r10 != 0) goto L_0x008c
                r9.f16717D = r0
            L_0x008c:
                r9.m22760b()
                java.util.LinkedList<android.graphics.Paint> r10 = r9.f16734n
                java.lang.Object r10 = r10.removeLast()
                android.graphics.Paint r10 = (android.graphics.Paint) r10
                r9.f16732l = r10
                java.util.LinkedList<java.lang.Boolean> r10 = r9.f16735o
                java.lang.Object r10 = r10.removeLast()
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                r9.f16733m = r10
                java.util.LinkedList<android.graphics.Paint> r10 = r9.f16730j
                java.lang.Object r10 = r10.removeLast()
                android.graphics.Paint r10 = (android.graphics.Paint) r10
                r9.f16728h = r10
                java.util.LinkedList<java.lang.Boolean> r10 = r9.f16731k
                java.lang.Object r10 = r10.removeLast()
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                r9.f16729i = r10
                java.util.LinkedList<d.i.a.b.b.a.g$b> r10 = r9.f16727g
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L_0x0171
                java.util.LinkedList<d.i.a.b.b.a.g$b> r10 = r9.f16727g
                r10.removeLast()
                goto L_0x0171
            L_0x00ce:
                d.i.a.b.b.a.g$a r12 = r9.f16714A
                java.lang.String r1 = r12.f16690a
                if (r1 == 0) goto L_0x0171
                java.lang.String r12 = r12.f16691b
                if (r12 == 0) goto L_0x00ea
                java.util.HashMap<java.lang.String, d.i.a.b.b.a.g$a> r1 = r9.f16746z
                java.lang.Object r12 = r1.get(r12)
                d.i.a.b.b.a.g$a r12 = (p101d.p191i.p192a.p194b.p196b.p197a.C5997g.C5998a) r12
                if (r12 == 0) goto L_0x00ea
                d.i.a.b.b.a.g$a r1 = r9.f16714A
                d.i.a.b.b.a.g$a r12 = r12.mo15862a(r1)
                r9.f16714A = r12
            L_0x00ea:
                d.i.a.b.b.a.g$a r12 = r9.f16714A
                java.util.ArrayList<java.lang.Integer> r12 = r12.f16701l
                int r12 = r12.size()
                int[] r12 = new int[r12]
                r1 = r0
            L_0x00f5:
                int r2 = r12.length
                if (r1 >= r2) goto L_0x010b
                d.i.a.b.b.a.g$a r2 = r9.f16714A
                java.util.ArrayList<java.lang.Integer> r2 = r2.f16701l
                java.lang.Object r2 = r2.get(r1)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r12[r1] = r2
                int r1 = r1 + 1
                goto L_0x00f5
            L_0x010b:
                d.i.a.b.b.a.g$a r1 = r9.f16714A
                java.util.ArrayList<java.lang.Float> r1 = r1.f16700k
                int r1 = r1.size()
                float[] r7 = new float[r1]
            L_0x0115:
                int r1 = r7.length
                if (r0 >= r1) goto L_0x012b
                d.i.a.b.b.a.g$a r1 = r9.f16714A
                java.util.ArrayList<java.lang.Float> r1 = r1.f16700k
                java.lang.Object r1 = r1.get(r0)
                java.lang.Float r1 = (java.lang.Float) r1
                float r1 = r1.floatValue()
                r7[r0] = r1
                int r0 = r0 + 1
                goto L_0x0115
            L_0x012b:
                int r0 = r12.length
                if (r0 != 0) goto L_0x0139
                boolean r0 = p101d.p191i.p192a.p194b.p196b.p197a.C5997g.f16684a
                if (r0 == 0) goto L_0x0139
                java.lang.String r0 = "BAD"
                android.util.Log.d(r0, r0)
            L_0x0139:
                boolean r10 = r11.equals(r10)
                if (r10 == 0) goto L_0x0153
                d.i.a.b.b.a.g$a r10 = r9.f16714A
                android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
                float r2 = r10.f16693d
                float r3 = r10.f16694e
                float r4 = r10.f16695f
                float r5 = r10.f16696g
                android.graphics.Shader$TileMode r8 = r10.f16705p
                r1 = r11
                r6 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x0166
            L_0x0153:
                d.i.a.b.b.a.g$a r10 = r9.f16714A
                android.graphics.RadialGradient r11 = new android.graphics.RadialGradient
                float r2 = r10.f16697h
                float r3 = r10.f16698i
                float r4 = r10.f16699j
                android.graphics.Shader$TileMode r0 = r10.f16705p
                r1 = r11
                r5 = r12
                r6 = r7
                r7 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
            L_0x0166:
                r10.f16703n = r11
                java.util.HashMap<java.lang.String, d.i.a.b.b.a.g$a> r10 = r9.f16746z
                d.i.a.b.b.a.g$a r11 = r9.f16714A
                java.lang.String r12 = r11.f16690a
                r10.put(r12, r11)
            L_0x0171:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p194b.p196b.p197a.C5997g.C6003f.endElement(java.lang.String, java.lang.String, java.lang.String):void");
        }

        public void startDocument() {
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            float f;
            Float f2;
            Float f3;
            float f4;
            C5998a a;
            String str4 = str2;
            Attributes attributes2 = attributes;
            String b = C5997g.m22736f("id", attributes2);
            if (b != null && "sto_lot_001".compareTo(b) == 0) {
                String unused = C5997g.m22736f("id", attributes2);
                if (C5997g.f16684a) {
                    Log.d("SVGAndroid", "Get");
                }
            }
            this.f16728h.setAlpha(255);
            this.f16732l.setAlpha(255);
            if (!this.f16719F) {
                boolean z = false;
                if (str4.equals("svg")) {
                    this.f16722b = null;
                    String b2 = C5997g.m22736f("viewBox", attributes2);
                    if (b2 != null) {
                        String[] split = b2.replace(',', TokenParser.f19315SP).split("\\s+");
                        if (split.length == 4) {
                            Float a2 = C5997g.m22730b(split[0], (Float) null);
                            Float a3 = C5997g.m22730b(split[1], (Float) null);
                            Float a4 = C5997g.m22730b(split[2], (Float) null);
                            Float a5 = C5997g.m22730b(split[3], (Float) null);
                            if (!(a2 == null || a4 == null || a3 == null || a5 == null)) {
                                float ceil = (float) Math.ceil((double) (a4.floatValue() - a2.floatValue()));
                                float ceil2 = (float) Math.ceil((double) (a5.floatValue() - a3.floatValue()));
                                this.f16722b = this.f16721a.beginRecording((int) ceil, (int) ceil2);
                                this.f16743w = Integer.valueOf(this.f16722b.save());
                                this.f16722b.clipRect(0.0f, 0.0f, ceil, ceil2);
                                this.f16723c = Float.valueOf(-a2.floatValue());
                                this.f16724d = Float.valueOf(-a3.floatValue());
                                this.f16722b.translate(this.f16723c.floatValue(), this.f16724d.floatValue());
                            }
                        }
                    }
                    if (this.f16722b == null) {
                        this.f16722b = this.f16721a.beginRecording((int) Math.ceil((double) C5997g.m22734d("width", attributes2).floatValue()), (int) Math.ceil((double) C5997g.m22734d("height", attributes2).floatValue()));
                        this.f16743w = null;
                    }
                } else if (!str4.equals("defs")) {
                    if (str4.equals("linearGradient")) {
                        a = m22750a(true, attributes2);
                    } else if (str4.equals("radialGradient")) {
                        a = m22750a(false, attributes2);
                    } else if (str4.equals("stop")) {
                        if (this.f16714A != null) {
                            C6002e eVar = new C6002e(attributes2);
                            Integer b3 = eVar.mo15866b("stop-color");
                            if (b3 != null) {
                                z = b3.intValue() | (Math.round((eVar.mo15863a("stop-opacity", 1.0f) * mo15869a().f16706a) * 255.0f) << 24);
                            }
                            this.f16714A.f16701l.add(Integer.valueOf(z ? 1 : 0));
                            this.f16714A.f16700k.add(Float.valueOf(eVar.mo15863a("offset", 0.0f)));
                            return;
                        }
                        return;
                    } else if (str4.equals("g")) {
                        C6002e eVar2 = new C6002e(attributes2);
                        if ("bounds".equalsIgnoreCase(C5997g.m22736f("id", attributes2))) {
                            this.f16719F = true;
                        }
                        if (this.f16717D) {
                            this.f16718E++;
                        }
                        if (("none".equals(C5997g.m22736f("display", attributes2)) || "none".equals(eVar2.mo15868d("display"))) && !this.f16717D) {
                            this.f16717D = true;
                            this.f16718E = 1;
                        }
                        this.f16727g.addLast(new C5999b(mo15869a().f16706a * eVar2.mo15863a("opacity", 1.0f)));
                        m22749a(attributes2);
                        this.f16734n.addLast(new Paint(this.f16732l));
                        this.f16730j.addLast(new Paint(this.f16728h));
                        this.f16735o.addLast(Boolean.valueOf(this.f16733m));
                        this.f16731k.addLast(Boolean.valueOf(this.f16729i));
                        m22759a(eVar2, (RectF) null);
                        m22758a(eVar2);
                        this.f16733m |= eVar2.mo15868d("fill") != null;
                        boolean z2 = this.f16729i;
                        if (eVar2.mo15868d("stroke") != null) {
                            z = true;
                        }
                        this.f16729i = z2 | z;
                        return;
                    } else {
                        if (this.f16717D || !str4.equals("rect")) {
                            float f5 = 0.0f;
                            if (!this.f16717D && str4.equals("line")) {
                                Float c = C5997g.m22734d("x1", attributes2);
                                Float c2 = C5997g.m22734d("x2", attributes2);
                                Float c3 = C5997g.m22734d("y1", attributes2);
                                Float c4 = C5997g.m22734d("y2", attributes2);
                                if (m22758a(new C6002e(attributes2))) {
                                    m22749a(attributes2);
                                    this.f16736p.set(c.floatValue(), c3.floatValue(), c2.floatValue(), c4.floatValue());
                                    this.f16722b.drawLine(c.floatValue(), c3.floatValue(), c2.floatValue(), c4.floatValue(), this.f16728h);
                                    m22754a(this.f16736p, this.f16728h);
                                    m22760b();
                                    String.valueOf((c2.floatValue() + c.floatValue()) / 2.0f);
                                    f = (c4.floatValue() + c3.floatValue()) / 2.0f;
                                } else {
                                    return;
                                }
                            } else if (!this.f16717D && (str4.equals("circle") || str4.equals("ellipse"))) {
                                Float c5 = C5997g.m22734d("cx", attributes2);
                                Float c6 = C5997g.m22734d("cy", attributes2);
                                if (str4.equals("ellipse")) {
                                    f3 = C5997g.m22734d("rx", attributes2);
                                    f2 = C5997g.m22734d("ry", attributes2);
                                } else {
                                    f3 = C5997g.m22734d("r", attributes2);
                                    f2 = f3;
                                }
                                if (c5 != null && c6 != null && f3 != null && f2 != null) {
                                    m22749a(attributes2);
                                    C6002e eVar3 = new C6002e(attributes2);
                                    this.f16736p.set(c5.floatValue() - f3.floatValue(), c6.floatValue() - f2.floatValue(), c5.floatValue() + f3.floatValue(), c6.floatValue() + f2.floatValue());
                                    if (m22759a(eVar3, this.f16736p)) {
                                        this.f16722b.drawOval(this.f16736p, this.f16732l);
                                        m22753a(this.f16736p);
                                    }
                                    if (m22758a(eVar3)) {
                                        this.f16722b.drawOval(this.f16736p, this.f16728h);
                                        m22754a(this.f16736p, this.f16728h);
                                    }
                                    m22760b();
                                    String.valueOf(f3);
                                    String.valueOf(f2);
                                    return;
                                }
                                return;
                            } else if (!this.f16717D && (str4.equals("polygon") || str4.equals("polyline"))) {
                                C6001d a6 = C5997g.m22735e("points", attributes2);
                                if (a6 != null) {
                                    Path path = new Path();
                                    ArrayList a7 = a6.f16710a;
                                    if (a7.size() > 1) {
                                        m22749a(attributes2);
                                        C6002e eVar4 = new C6002e(attributes2);
                                        path.moveTo(((Float) a7.get(0)).floatValue(), ((Float) a7.get(1)).floatValue());
                                        float f6 = 0.0f;
                                        for (int i = 2; i < a7.size(); i += 2) {
                                            float floatValue = ((Float) a7.get(i)).floatValue();
                                            float floatValue2 = ((Float) a7.get(i + 1)).floatValue();
                                            path.lineTo(floatValue, floatValue2);
                                            f6 += floatValue;
                                            f5 += floatValue2;
                                        }
                                        float size = f6 / (((float) a7.size()) / 2.0f);
                                        float size2 = f5 / (((float) a7.size()) / 2.0f);
                                        if (str4.equals("polygon")) {
                                            path.close();
                                        }
                                        path.computeBounds(this.f16736p, false);
                                        if (m22759a(eVar4, this.f16736p)) {
                                            this.f16722b.drawPath(path, this.f16732l);
                                            m22753a(this.f16736p);
                                        }
                                        if (m22758a(eVar4)) {
                                            this.f16722b.drawPath(path, this.f16728h);
                                            m22754a(this.f16736p, this.f16728h);
                                        }
                                        m22760b();
                                        String.valueOf(size);
                                        String.valueOf(size2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (!this.f16717D && str4.equals(ClientCookie.PATH_ATTR)) {
                                C6000c a8 = C5997g.m22728b(C5997g.m22736f("d", attributes2), b);
                                Matrix a9 = m22749a(attributes2);
                                C6002e eVar5 = new C6002e(attributes2);
                                a8.f16707a.computeBounds(this.f16736p, true);
                                if (m22759a(eVar5, this.f16736p)) {
                                    this.f16722b.drawPath(a8.f16707a, this.f16732l);
                                    m22753a(this.f16736p);
                                }
                                if (m22758a(eVar5)) {
                                    this.f16722b.drawPath(a8.f16707a, this.f16728h);
                                    m22754a(this.f16736p, this.f16728h);
                                }
                                m22760b();
                                if (a9 != null) {
                                    a9.mapRect(this.f16736p);
                                }
                                String valueOf = String.valueOf(this.f16736p.centerX());
                                String valueOf2 = String.valueOf(this.f16736p.centerY());
                                if (b.startsWith("sto_lot_")) {
                                    m22757a(b, valueOf, valueOf2);
                                    return;
                                }
                                return;
                            } else if (!this.f16717D && C5997g.f16684a) {
                                Log.w("SVGAndroid", "UNRECOGNIZED SVG COMMAND: " + str4);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            Float c7 = C5997g.m22734d("x", attributes2);
                            if (c7 == null) {
                                f4 = 0.0f;
                                c7 = Float.valueOf(0.0f);
                            } else {
                                f4 = 0.0f;
                            }
                            Float c8 = C5997g.m22734d("y", attributes2);
                            if (c8 == null) {
                                c8 = Float.valueOf(f4);
                            }
                            Float c9 = C5997g.m22734d("width", attributes2);
                            Float c10 = C5997g.m22734d("height", attributes2);
                            Float valueOf3 = Float.valueOf(C5997g.m22727b("rx", attributes2, f4));
                            Float valueOf4 = Float.valueOf(C5997g.m22727b("ry", attributes2, f4));
                            m22749a(attributes2);
                            C6002e eVar6 = new C6002e(attributes2);
                            this.f16736p.set(c7.floatValue(), c8.floatValue(), c7.floatValue() + c9.floatValue(), c8.floatValue() + c10.floatValue());
                            if (m22759a(eVar6, this.f16736p)) {
                                this.f16736p.set(c7.floatValue(), c8.floatValue(), c7.floatValue() + c9.floatValue(), c8.floatValue() + c10.floatValue());
                                if (valueOf3.floatValue() > 0.0f || valueOf4.floatValue() > 0.0f) {
                                    this.f16722b.drawRoundRect(this.f16736p, valueOf3.floatValue(), valueOf4.floatValue(), this.f16732l);
                                } else {
                                    this.f16722b.drawRect(this.f16736p, this.f16732l);
                                }
                                m22753a(this.f16736p);
                            }
                            if (m22758a(eVar6)) {
                                this.f16736p.set(c7.floatValue(), c8.floatValue(), c7.floatValue() + c9.floatValue(), c8.floatValue() + c10.floatValue());
                                if (valueOf3.floatValue() > 0.0f || valueOf4.floatValue() > 0.0f) {
                                    this.f16722b.drawRoundRect(this.f16736p, valueOf3.floatValue(), valueOf4.floatValue(), this.f16728h);
                                } else {
                                    this.f16722b.drawRect(this.f16736p, this.f16728h);
                                }
                                m22754a(this.f16736p, this.f16728h);
                            }
                            m22760b();
                            String.valueOf(c7.floatValue() + (c9.floatValue() / 2.0f));
                            f = c8.floatValue() + (c10.floatValue() / 2.0f);
                        }
                        String.valueOf(f);
                        return;
                    }
                    this.f16714A = a;
                }
            } else if (str4.equals("rect")) {
                Float c11 = C5997g.m22734d("x", attributes2);
                if (c11 == null) {
                    c11 = Float.valueOf(0.0f);
                }
                Float c12 = C5997g.m22734d("y", attributes2);
                if (c12 == null) {
                    c12 = Float.valueOf(0.0f);
                }
                this.f16737q = new RectF(c11.floatValue(), c12.floatValue(), c11.floatValue() + C5997g.m22734d("width", attributes2).floatValue(), c12.floatValue() + C5997g.m22734d("height", attributes2).floatValue());
            }
        }
    }

    /* renamed from: d.i.a.b.b.a.g$g */
    private static class C6004g {

        /* renamed from: a */
        HashMap<String, String> f16747a;

        private C6004g(String str) {
            this.f16747a = new HashMap<>();
            for (String split : str.split(";")) {
                String[] split2 = split.split(":");
                if (split2.length == 2) {
                    this.f16747a.put(split2[0], split2[1]);
                }
            }
        }

        /* renamed from: a */
        public String mo15879a(String str) {
            return this.f16747a.get(str);
        }
    }

    /* renamed from: a */
    private static float m22716a(float f, float f2, float f3, float f4) {
        return ((float) Math.toDegrees(Math.atan2((double) f, (double) f2) - Math.atan2((double) f3, (double) f4))) % 360.0f;
    }

    /* renamed from: a */
    private static Matrix m22719a(String str, Matrix matrix) {
        float f;
        float f2 = 0.0f;
        if (str.startsWith("matrix(")) {
            C6001d b = m22729b(str.substring(7));
            if (b.f16710a.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{((Float) b.f16710a.get(0)).floatValue(), ((Float) b.f16710a.get(2)).floatValue(), ((Float) b.f16710a.get(4)).floatValue(), ((Float) b.f16710a.get(1)).floatValue(), ((Float) b.f16710a.get(3)).floatValue(), ((Float) b.f16710a.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            }
        } else if (str.startsWith("translate(")) {
            C6001d b2 = m22729b(str.substring(10));
            if (b2.f16710a.size() > 0) {
                float floatValue = ((Float) b2.f16710a.get(0)).floatValue();
                if (b2.f16710a.size() > 1) {
                    f2 = ((Float) b2.f16710a.get(1)).floatValue();
                }
                matrix.preTranslate(floatValue, f2);
            }
        } else if (str.startsWith("scale(")) {
            C6001d b3 = m22729b(str.substring(6));
            if (b3.f16710a.size() > 0) {
                float floatValue2 = ((Float) b3.f16710a.get(0)).floatValue();
                matrix.preScale(floatValue2, b3.f16710a.size() > 1 ? ((Float) b3.f16710a.get(1)).floatValue() : floatValue2);
            }
        } else if (str.startsWith("skewX(")) {
            C6001d b4 = m22729b(str.substring(6));
            if (b4.f16710a.size() > 0) {
                matrix.preSkew((float) Math.tan((double) ((Float) b4.f16710a.get(0)).floatValue()), 0.0f);
            }
        } else if (str.startsWith("skewY(")) {
            C6001d b5 = m22729b(str.substring(6));
            if (b5.f16710a.size() > 0) {
                matrix.preSkew(0.0f, (float) Math.tan((double) ((Float) b5.f16710a.get(0)).floatValue()));
            }
        } else if (str.startsWith("rotate(")) {
            C6001d b6 = m22729b(str.substring(7));
            if (b6.f16710a.size() > 0) {
                float floatValue3 = ((Float) b6.f16710a.get(0)).floatValue();
                if (b6.f16710a.size() > 2) {
                    f2 = ((Float) b6.f16710a.get(1)).floatValue();
                    f = ((Float) b6.f16710a.get(2)).floatValue();
                } else {
                    f = 0.0f;
                }
                matrix.postRotate(floatValue3, f2, f);
            }
        } else if (f16684a) {
            Log.w("SVGAndroid", "Invalid transform (" + str + ")");
        }
        return matrix;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p101d.p191i.p192a.p194b.p196b.p197a.C5992b m22720a(org.xml.sax.InputSource r5, p101d.p191i.p192a.p194b.p196b.p197a.C5997g.C6003f r6) {
        /*
            android.graphics.Picture r0 = new android.graphics.Picture     // Catch:{ Exception -> 0x004b }
            r0.<init>()     // Catch:{ Exception -> 0x004b }
            r6.mo15870a((android.graphics.Picture) r0)     // Catch:{ Exception -> 0x004b }
            javax.xml.parsers.SAXParserFactory r1 = javax.xml.parsers.SAXParserFactory.newInstance()     // Catch:{ Exception -> 0x004b }
            javax.xml.parsers.SAXParser r1 = r1.newSAXParser()     // Catch:{ Exception -> 0x004b }
            org.xml.sax.XMLReader r1 = r1.getXMLReader()     // Catch:{ Exception -> 0x004b }
            r1.setContentHandler(r6)     // Catch:{ Exception -> 0x004b }
            java.lang.String r2 = "http://xml.org/sax/features/validation"
            r3 = 0
            r1.setFeature(r2, r3)     // Catch:{ Exception -> 0x004b }
            boolean r2 = f16685b     // Catch:{ Exception -> 0x004b }
            if (r2 == 0) goto L_0x002a
            java.lang.String r2 = "http://apache.org/xml/features/disallow-doctype-decl"
            r4 = 1
            r1.setFeature(r2, r4)     // Catch:{ SAXNotRecognizedException -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            f16685b = r3     // Catch:{ Exception -> 0x004b }
        L_0x002a:
            r1.parse(r5)     // Catch:{ Exception -> 0x004b }
            d.i.a.b.b.a.b r5 = new d.i.a.b.b.a.b     // Catch:{ Exception -> 0x004b }
            android.graphics.RectF r1 = r6.f16737q     // Catch:{ Exception -> 0x004b }
            r5.<init>(r0, r1)     // Catch:{ Exception -> 0x004b }
            java.lang.String r0 = r6.f16725e     // Catch:{ Exception -> 0x004b }
            r5.mo15856a((java.lang.String) r0)     // Catch:{ Exception -> 0x004b }
            android.graphics.RectF r0 = r6.f16738r     // Catch:{ Exception -> 0x004b }
            float r0 = r0.top     // Catch:{ Exception -> 0x004b }
            boolean r0 = java.lang.Float.isInfinite(r0)     // Catch:{ Exception -> 0x004b }
            if (r0 != 0) goto L_0x004a
            android.graphics.RectF r6 = r6.f16738r     // Catch:{ Exception -> 0x004b }
            r5.mo15855a((android.graphics.RectF) r6)     // Catch:{ Exception -> 0x004b }
        L_0x004a:
            return r5
        L_0x004b:
            r5 = move-exception
            boolean r6 = f16684a
            if (r6 == 0) goto L_0x0057
            java.lang.String r6 = "SVGAndroid"
            java.lang.String r0 = "Failed to parse SVG."
            android.util.Log.e(r6, r0, r5)
        L_0x0057:
            d.i.a.b.b.a.e r6 = new d.i.a.b.b.a.e
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p194b.p196b.p197a.C5997g.m22720a(org.xml.sax.InputSource, d.i.a.b.b.a.g$f):d.i.a.b.b.a.b");
    }

    /* renamed from: a */
    private static Float m22724a(String str, Attributes attributes, Float f) {
        return m22730b(m22736f(str, attributes), f);
    }

    /* renamed from: a */
    private static void m22725a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
        float f8;
        Path path2 = path;
        float f9 = f3;
        float f10 = f4;
        float f11 = f7;
        int i3 = i2;
        if (f5 == 0.0f || f6 == 0.0f) {
            path2.lineTo(f9, f10);
        } else if (f9 != f || f10 != f2) {
            float abs = Math.abs(f5);
            float abs2 = Math.abs(f6);
            double d = (double) ((3.1415927f * f11) / 180.0f);
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f12 = (f - f9) / 2.0f;
            float f13 = (f2 - f10) / 2.0f;
            float f14 = (cos * f12) + (sin * f13);
            float f15 = ((-sin) * f12) + (f13 * cos);
            float f16 = f14 * f14;
            float f17 = f15 * f15;
            float f18 = abs * abs;
            float f19 = abs2 * abs2;
            float f20 = ((f16 / f18) + (f17 / f19)) * 1.001f;
            if (f20 > 1.0f) {
                f8 = f17;
                float sqrt = (float) Math.sqrt((double) f20);
                abs *= sqrt;
                abs2 *= sqrt;
                f18 = abs * abs;
                f19 = abs2 * abs2;
            } else {
                f8 = f17;
            }
            float f21 = f18 * f19;
            float f22 = f18 * f8;
            float f23 = f19 * f16;
            float sqrt2 = ((float) Math.sqrt((double) (((f21 - f22) - f23) / (f22 + f23)))) * ((float) (i == i3 ? -1 : 1));
            float f24 = ((sqrt2 * abs) * f15) / abs2;
            float f25 = (((-sqrt2) * abs2) * f14) / abs;
            float f26 = ((cos * f24) - (sin * f25)) + ((f + f9) / 2.0f);
            float f27 = (sin * f24) + (cos * f25) + ((f2 + f10) / 2.0f);
            float f28 = (f14 - f24) / abs;
            float f29 = (f15 - f25) / abs2;
            float a = m22716a(1.0f, 0.0f, f28, f29);
            float a2 = m22716a(f28, f29, ((-f14) - f24) / abs, ((-f15) - f25) / abs2);
            if (i3 == 0 && a2 > 0.0f) {
                a2 -= 360.0f;
            } else if (i3 != 0 && a2 < 0.0f) {
                a2 += 360.0f;
            }
            if (f11 % 360.0f == 0.0f) {
                f16687d.set(f26 - abs, f27 - abs2, f26 + abs, f27 + abs2);
                path2.arcTo(f16687d, a, a2);
                return;
            }
            f16687d.set(-abs, -abs2, abs, abs2);
            f16688e.reset();
            f16688e.postRotate(f11);
            f16688e.postTranslate(f26, f27);
            f16688e.invert(f16689f);
            path2.transform(f16689f);
            path2.arcTo(f16687d, a, a2);
            path2.transform(f16688e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static float m22727b(String str, Attributes attributes, float f) {
        return m22730b(m22736f(str, attributes), Float.valueOf(f)).floatValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014a, code lost:
        r13 = r13 + 1;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01e4, code lost:
        r11 = r25;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01e7, code lost:
        if (r3 != false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e9, code lost:
        r19 = r5;
        r18 = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p101d.p191i.p192a.p194b.p196b.p197a.C5997g.C6000c m22728b(java.lang.String r26, java.lang.String r27) {
        /*
            r0 = r26
            int r1 = r26.length()
            d.i.a.b.b.a.a r2 = new d.i.a.b.b.a.a
            r3 = 0
            r2.<init>(r0, r3)
            r2.mo15853f()
            android.graphics.Path r14 = new android.graphics.Path
            r14.<init>()
            r15 = 0
            r4 = r3
            r13 = r4
            r5 = r15
            r6 = r5
            r11 = r6
            r12 = r11
            r16 = r12
            r17 = r16
            r18 = r17
            r19 = r18
        L_0x0023:
            int r7 = r2.f16668e
            if (r7 >= r1) goto L_0x01f8
            char r7 = r0.charAt(r7)
            r8 = 43
            r9 = 109(0x6d, float:1.53E-43)
            if (r7 == r8) goto L_0x0039
            r8 = 45
            if (r7 == r8) goto L_0x0039
            switch(r7) {
                case 48: goto L_0x0039;
                case 49: goto L_0x0039;
                case 50: goto L_0x0039;
                case 51: goto L_0x0039;
                case 52: goto L_0x0039;
                case 53: goto L_0x0039;
                case 54: goto L_0x0039;
                case 55: goto L_0x0039;
                case 56: goto L_0x0039;
                case 57: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x004e
        L_0x0039:
            if (r4 == r9) goto L_0x0054
            r8 = 77
            if (r4 != r8) goto L_0x0040
            goto L_0x0054
        L_0x0040:
            char r8 = java.lang.Character.toLowerCase(r4)
            java.lang.String r10 = "lhvcsqta"
            int r8 = r10.indexOf(r8)
            if (r8 < 0) goto L_0x004e
            r7 = r4
            goto L_0x0051
        L_0x004e:
            r2.mo15848a()
        L_0x0051:
            r20 = r7
            goto L_0x0059
        L_0x0054:
            int r7 = r4 + -1
            char r7 = (char) r7
            r20 = r4
        L_0x0059:
            r21 = 1
            switch(r7) {
                case 65: goto L_0x019f;
                case 67: goto L_0x014f;
                case 72: goto L_0x0137;
                case 76: goto L_0x011b;
                case 77: goto L_0x00f2;
                case 81: goto L_0x00a6;
                case 83: goto L_0x00a6;
                case 84: goto L_0x011b;
                case 86: goto L_0x008e;
                case 90: goto L_0x007e;
                case 97: goto L_0x019f;
                case 99: goto L_0x014f;
                case 104: goto L_0x0137;
                case 108: goto L_0x011b;
                case 109: goto L_0x00f2;
                case 113: goto L_0x00a6;
                case 115: goto L_0x00a6;
                case 116: goto L_0x011b;
                case 118: goto L_0x008e;
                case 122: goto L_0x007e;
                default: goto L_0x005e;
            }
        L_0x005e:
            r25 = r11
            r3 = r12
            r0 = r13
            boolean r4 = f16684a
            if (r4 == 0) goto L_0x01df
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Invalid path command: "
            r4.append(r8)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "SVGAndroid"
            android.util.Log.w(r7, r4)
            goto L_0x01df
        L_0x007e:
            r14.close()
            r14.moveTo(r11, r12)
            r5 = r11
            r19 = r5
            r6 = r12
            r18 = r6
        L_0x008a:
            r3 = r21
            goto L_0x01e7
        L_0x008e:
            float r4 = r2.mo15850c()
            r8 = 118(0x76, float:1.65E-43)
            if (r7 != r8) goto L_0x009c
            r14.rLineTo(r15, r4)
            float r6 = r6 + r4
            r4 = r6
            goto L_0x009f
        L_0x009c:
            r14.lineTo(r5, r4)
        L_0x009f:
            float r16 = r16 + r4
            int r13 = r13 + 1
            r6 = r4
            goto L_0x01e7
        L_0x00a6:
            float r4 = r2.mo15850c()
            float r8 = r2.mo15850c()
            float r9 = r2.mo15850c()
            float r10 = r2.mo15850c()
            boolean r7 = java.lang.Character.isLowerCase(r7)
            if (r7 == 0) goto L_0x00c0
            float r4 = r4 + r5
            float r9 = r9 + r5
            float r8 = r8 + r6
            float r10 = r10 + r6
        L_0x00c0:
            r23 = r4
            r22 = r8
            r24 = r9
            r25 = r10
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r4
            float r5 = r5 - r19
            float r6 = r6 * r4
            float r6 = r6 - r18
            r4 = r14
            r7 = r23
            r8 = r22
            r9 = r24
            r10 = r25
            r4.cubicTo(r5, r6, r7, r8, r9, r10)
            float r17 = r17 + r23
            float r16 = r16 + r22
            float r17 = r17 + r24
            float r16 = r16 + r25
            int r13 = r13 + 2
            r3 = r21
            r18 = r22
            r19 = r23
            r5 = r24
            r6 = r25
            goto L_0x01e7
        L_0x00f2:
            float r4 = r2.mo15850c()
            float r8 = r2.mo15850c()
            if (r7 != r9) goto L_0x010a
            float r7 = r11 + r4
            float r9 = r12 + r8
            r14.rMoveTo(r4, r8)
            float r5 = r5 + r4
            float r6 = r6 + r8
            r11 = r5
            r12 = r6
            r4 = r7
            r8 = r9
            goto L_0x010f
        L_0x010a:
            r14.moveTo(r4, r8)
            r11 = r4
            r12 = r8
        L_0x010f:
            float r17 = r17 + r4
            float r16 = r16 + r8
            int r13 = r13 + 1
            r5 = r11
            r6 = r12
            r11 = r4
            r12 = r8
            goto L_0x01e7
        L_0x011b:
            float r4 = r2.mo15850c()
            float r8 = r2.mo15850c()
            r9 = 108(0x6c, float:1.51E-43)
            if (r7 != r9) goto L_0x012e
            r14.rLineTo(r4, r8)
            float r5 = r5 + r4
            float r6 = r6 + r8
            r4 = r5
            goto L_0x0132
        L_0x012e:
            r14.lineTo(r4, r8)
            r6 = r8
        L_0x0132:
            float r17 = r17 + r4
            float r16 = r16 + r6
            goto L_0x014a
        L_0x0137:
            float r4 = r2.mo15850c()
            r8 = 104(0x68, float:1.46E-43)
            if (r7 != r8) goto L_0x0145
            r14.rLineTo(r4, r15)
            float r5 = r5 + r4
            r4 = r5
            goto L_0x0148
        L_0x0145:
            r14.lineTo(r4, r6)
        L_0x0148:
            float r17 = r17 + r4
        L_0x014a:
            int r13 = r13 + 1
            r5 = r4
            goto L_0x01e7
        L_0x014f:
            float r4 = r2.mo15850c()
            float r8 = r2.mo15850c()
            float r9 = r2.mo15850c()
            float r10 = r2.mo15850c()
            float r18 = r2.mo15850c()
            float r19 = r2.mo15850c()
            r3 = 99
            if (r7 != r3) goto L_0x0173
            float r4 = r4 + r5
            float r9 = r9 + r5
            float r18 = r18 + r5
            float r8 = r8 + r6
            float r10 = r10 + r6
            float r19 = r19 + r6
        L_0x0173:
            r5 = r4
            r6 = r8
            r3 = r10
            r22 = r19
            r19 = r18
            r18 = r9
            r4 = r14
            r7 = r18
            r8 = r3
            r9 = r19
            r10 = r22
            r4.cubicTo(r5, r6, r7, r8, r9, r10)
            float r17 = r17 + r18
            float r16 = r16 + r3
            float r4 = r19 + r19
            float r17 = r17 + r4
            float r4 = r22 + r22
            float r16 = r16 + r4
            int r13 = r13 + 2
            r5 = r19
            r6 = r22
            r19 = r18
            r18 = r3
            goto L_0x008a
        L_0x019f:
            float r9 = r2.mo15850c()
            float r10 = r2.mo15850c()
            float r3 = r2.mo15850c()
            int r21 = r2.mo15849b()
            int r22 = r2.mo15849b()
            float r4 = r2.mo15850c()
            float r8 = r2.mo15850c()
            r15 = 97
            if (r7 != r15) goto L_0x01c1
            float r4 = r4 + r5
            float r8 = r8 + r6
        L_0x01c1:
            r24 = r4
            r15 = r8
            r4 = r14
            r7 = r24
            r8 = r15
            r25 = r11
            r11 = r3
            r3 = r12
            r12 = r21
            r0 = r13
            r13 = r22
            m22725a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            float r17 = r17 + r24
            float r16 = r16 + r15
            int r13 = r0 + 1
            r12 = r3
            r6 = r15
            r5 = r24
            goto L_0x01e4
        L_0x01df:
            r2.mo15848a()
            r13 = r0
            r12 = r3
        L_0x01e4:
            r11 = r25
            r3 = 0
        L_0x01e7:
            if (r3 != 0) goto L_0x01ed
            r19 = r5
            r18 = r6
        L_0x01ed:
            r2.mo15853f()
            r4 = r20
            r3 = 0
            r15 = 0
            r0 = r26
            goto L_0x0023
        L_0x01f8:
            r0 = r13
            d.i.a.b.b.a.g$c r1 = new d.i.a.b.b.a.g$c
            r2 = 0
            r1.<init>()
            r1.f16707a = r14
            float r0 = (float) r0
            float r2 = r17 / r0
            r1.f16708b = r2
            float r0 = r16 / r0
            r1.f16709c = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p194b.p196b.p197a.C5997g.m22728b(java.lang.String, java.lang.String):d.i.a.b.b.a.g$c");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r7 != false) goto L_0x0066;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p101d.p191i.p192a.p194b.p196b.p197a.C5997g.C6001d m22729b(java.lang.String r10) {
        /*
            int r0 = r10.length()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r5 = r2
            r6 = r5
            r7 = r6
            r4 = r3
        L_0x000f:
            if (r4 >= r0) goto L_0x006a
            if (r6 == 0) goto L_0x0015
            r6 = r2
            goto L_0x0067
        L_0x0015:
            char r8 = r10.charAt(r4)
            switch(r8) {
                case 9: goto L_0x0041;
                case 10: goto L_0x0041;
                case 32: goto L_0x0041;
                case 41: goto L_0x0022;
                case 44: goto L_0x0041;
                case 45: goto L_0x001f;
                case 65: goto L_0x0022;
                case 67: goto L_0x0022;
                case 72: goto L_0x0022;
                case 76: goto L_0x0022;
                case 77: goto L_0x0022;
                case 81: goto L_0x0022;
                case 83: goto L_0x0022;
                case 84: goto L_0x0022;
                case 86: goto L_0x0022;
                case 90: goto L_0x0022;
                case 97: goto L_0x0022;
                case 99: goto L_0x0022;
                case 101: goto L_0x001d;
                case 104: goto L_0x0022;
                case 108: goto L_0x0022;
                case 109: goto L_0x0022;
                case 113: goto L_0x0022;
                case 115: goto L_0x0022;
                case 116: goto L_0x0022;
                case 118: goto L_0x0022;
                case 122: goto L_0x0022;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0066
        L_0x001d:
            r7 = r3
            goto L_0x0067
        L_0x001f:
            if (r7 == 0) goto L_0x0041
            goto L_0x0066
        L_0x0022:
            java.lang.String r10 = r10.substring(r5, r4)
            java.lang.String r0 = r10.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x003b
            float r10 = java.lang.Float.parseFloat(r10)
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r1.add(r10)
        L_0x003b:
            d.i.a.b.b.a.g$d r10 = new d.i.a.b.b.a.g$d
            r10.<init>(r1, r4)
            return r10
        L_0x0041:
            java.lang.String r7 = r10.substring(r5, r4)
            java.lang.String r9 = r7.trim()
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0064
            float r5 = java.lang.Float.parseFloat(r7)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1.add(r5)
            r5 = 45
            if (r8 != r5) goto L_0x0060
            r5 = r4
            goto L_0x0066
        L_0x0060:
            int r5 = r4 + 1
            r6 = r3
            goto L_0x0066
        L_0x0064:
            int r5 = r5 + 1
        L_0x0066:
            r7 = r2
        L_0x0067:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x006a:
            java.lang.String r0 = r10.substring(r5)
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x0083
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x007f }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NumberFormatException -> 0x007f }
            r1.add(r0)     // Catch:{ NumberFormatException -> 0x007f }
        L_0x007f:
            int r5 = r10.length()
        L_0x0083:
            d.i.a.b.b.a.g$d r10 = new d.i.a.b.b.a.g$d
            r10.<init>(r1, r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p194b.p196b.p197a.C5997g.m22729b(java.lang.String):d.i.a.b.b.a.g$d");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Float m22730b(String str, Float f) {
        float parseFloat;
        if (str == null) {
            return f;
        }
        if (str.endsWith("px")) {
            str = str.substring(0, str.length() - 2);
            parseFloat = Float.parseFloat(str);
        } else {
            if (str.endsWith("%")) {
                parseFloat = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
            }
            parseFloat = Float.parseFloat(str);
        }
        return Float.valueOf(parseFloat);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static Matrix m22732c(String str) {
        int i;
        Matrix matrix = new Matrix();
        while (true) {
            m22719a(str, matrix);
            int indexOf = str.indexOf(")");
            if (indexOf <= 0 || str.length() <= (i = indexOf + 1)) {
                return matrix;
            }
            str = f16686c.matcher(str.substring(i)).replaceFirst("");
        }
        return matrix;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Float m22734d(String str, Attributes attributes) {
        return m22724a(str, attributes, (Float) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C6001d m22735e(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return m22729b(attributes.getValue(i));
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m22736f(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }
}
