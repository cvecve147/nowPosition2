package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.constraint.b */
public class C0071b {

    /* renamed from: a */
    private static final int[] f396a = {0, 4, 8};

    /* renamed from: b */
    private static SparseIntArray f397b = new SparseIntArray();

    /* renamed from: c */
    private HashMap<Integer, C0072a> f398c = new HashMap<>();

    /* renamed from: android.support.constraint.b$a */
    private static class C0072a {

        /* renamed from: A */
        public int f399A;

        /* renamed from: B */
        public int f400B;

        /* renamed from: C */
        public int f401C;

        /* renamed from: D */
        public int f402D;

        /* renamed from: E */
        public int f403E;

        /* renamed from: F */
        public int f404F;

        /* renamed from: G */
        public int f405G;

        /* renamed from: H */
        public int f406H;

        /* renamed from: I */
        public int f407I;

        /* renamed from: J */
        public int f408J;

        /* renamed from: K */
        public int f409K;

        /* renamed from: L */
        public int f410L;

        /* renamed from: M */
        public int f411M;

        /* renamed from: N */
        public float f412N;

        /* renamed from: O */
        public float f413O;

        /* renamed from: P */
        public int f414P;

        /* renamed from: Q */
        public int f415Q;

        /* renamed from: R */
        public float f416R;

        /* renamed from: S */
        public boolean f417S;

        /* renamed from: T */
        public float f418T;

        /* renamed from: U */
        public float f419U;

        /* renamed from: V */
        public float f420V;

        /* renamed from: W */
        public float f421W;

        /* renamed from: X */
        public float f422X;

        /* renamed from: Y */
        public float f423Y;

        /* renamed from: Z */
        public float f424Z;

        /* renamed from: a */
        boolean f425a;

        /* renamed from: aa */
        public float f426aa;

        /* renamed from: b */
        public int f427b;

        /* renamed from: ba */
        public float f428ba;

        /* renamed from: c */
        public int f429c;

        /* renamed from: ca */
        public float f430ca;

        /* renamed from: d */
        int f431d;

        /* renamed from: da */
        public int f432da;

        /* renamed from: e */
        public int f433e;

        /* renamed from: ea */
        public int f434ea;

        /* renamed from: f */
        public int f435f;

        /* renamed from: fa */
        public int f436fa;

        /* renamed from: g */
        public float f437g;

        /* renamed from: ga */
        public int f438ga;

        /* renamed from: h */
        public int f439h;

        /* renamed from: ha */
        public int f440ha;

        /* renamed from: i */
        public int f441i;

        /* renamed from: ia */
        public int f442ia;

        /* renamed from: j */
        public int f443j;

        /* renamed from: k */
        public int f444k;

        /* renamed from: l */
        public int f445l;

        /* renamed from: m */
        public int f446m;

        /* renamed from: n */
        public int f447n;

        /* renamed from: o */
        public int f448o;

        /* renamed from: p */
        public int f449p;

        /* renamed from: q */
        public int f450q;

        /* renamed from: r */
        public int f451r;

        /* renamed from: s */
        public int f452s;

        /* renamed from: t */
        public int f453t;

        /* renamed from: u */
        public float f454u;

        /* renamed from: v */
        public float f455v;

        /* renamed from: w */
        public String f456w;

        /* renamed from: x */
        public int f457x;

        /* renamed from: y */
        public int f458y;

        /* renamed from: z */
        public int f459z;

        private C0072a() {
            this.f425a = false;
            this.f433e = -1;
            this.f435f = -1;
            this.f437g = -1.0f;
            this.f439h = -1;
            this.f441i = -1;
            this.f443j = -1;
            this.f444k = -1;
            this.f445l = -1;
            this.f446m = -1;
            this.f447n = -1;
            this.f448o = -1;
            this.f449p = -1;
            this.f450q = -1;
            this.f451r = -1;
            this.f452s = -1;
            this.f453t = -1;
            this.f454u = 0.5f;
            this.f455v = 0.5f;
            this.f456w = null;
            this.f457x = -1;
            this.f458y = -1;
            this.f459z = -1;
            this.f399A = -1;
            this.f400B = -1;
            this.f401C = -1;
            this.f402D = -1;
            this.f403E = -1;
            this.f404F = -1;
            this.f405G = 0;
            this.f406H = -1;
            this.f407I = -1;
            this.f408J = -1;
            this.f409K = -1;
            this.f410L = -1;
            this.f411M = -1;
            this.f412N = 0.0f;
            this.f413O = 0.0f;
            this.f414P = 0;
            this.f415Q = 0;
            this.f416R = 1.0f;
            this.f417S = false;
            this.f418T = 0.0f;
            this.f419U = 0.0f;
            this.f420V = 0.0f;
            this.f421W = 1.0f;
            this.f422X = 1.0f;
            this.f423Y = 0.0f;
            this.f424Z = 0.0f;
            this.f426aa = 0.0f;
            this.f428ba = 0.0f;
            this.f430ca = 0.0f;
            this.f432da = -1;
            this.f434ea = -1;
            this.f436fa = -1;
            this.f438ga = -1;
            this.f440ha = -1;
            this.f442ia = -1;
        }

        /* renamed from: a */
        public void mo271a(ConstraintLayout.C0044a aVar) {
            aVar.f180d = this.f439h;
            aVar.f181e = this.f441i;
            aVar.f182f = this.f443j;
            aVar.f183g = this.f444k;
            aVar.f184h = this.f445l;
            aVar.f185i = this.f446m;
            aVar.f186j = this.f447n;
            aVar.f187k = this.f448o;
            aVar.f188l = this.f449p;
            aVar.f189m = this.f450q;
            aVar.f190n = this.f451r;
            aVar.f191o = this.f452s;
            aVar.f192p = this.f453t;
            aVar.leftMargin = this.f399A;
            aVar.rightMargin = this.f400B;
            aVar.topMargin = this.f401C;
            aVar.bottomMargin = this.f402D;
            aVar.f197u = this.f411M;
            aVar.f198v = this.f410L;
            aVar.f199w = this.f454u;
            aVar.f200x = this.f455v;
            aVar.f201y = this.f456w;
            aVar.f162L = this.f457x;
            aVar.f163M = this.f458y;
            aVar.f153C = this.f412N;
            aVar.f152B = this.f413O;
            aVar.f155E = this.f415Q;
            aVar.f154D = this.f414P;
            aVar.f156F = this.f432da;
            aVar.f157G = this.f434ea;
            aVar.f160J = this.f436fa;
            aVar.f161K = this.f438ga;
            aVar.f158H = this.f440ha;
            aVar.f159I = this.f442ia;
            aVar.f164N = this.f459z;
            aVar.f179c = this.f437g;
            aVar.f177a = this.f433e;
            aVar.f178b = this.f435f;
            aVar.width = this.f427b;
            aVar.height = this.f429c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.f404F);
                aVar.setMarginEnd(this.f403E);
            }
            aVar.mo94a();
        }

        public C0072a clone() {
            C0072a aVar = new C0072a();
            aVar.f425a = this.f425a;
            aVar.f427b = this.f427b;
            aVar.f429c = this.f429c;
            aVar.f433e = this.f433e;
            aVar.f435f = this.f435f;
            aVar.f437g = this.f437g;
            aVar.f439h = this.f439h;
            aVar.f441i = this.f441i;
            aVar.f443j = this.f443j;
            aVar.f444k = this.f444k;
            aVar.f445l = this.f445l;
            aVar.f446m = this.f446m;
            aVar.f447n = this.f447n;
            aVar.f448o = this.f448o;
            aVar.f449p = this.f449p;
            aVar.f450q = this.f450q;
            aVar.f451r = this.f451r;
            aVar.f452s = this.f452s;
            aVar.f453t = this.f453t;
            aVar.f454u = this.f454u;
            aVar.f455v = this.f455v;
            aVar.f456w = this.f456w;
            aVar.f457x = this.f457x;
            aVar.f458y = this.f458y;
            aVar.f454u = this.f454u;
            aVar.f454u = this.f454u;
            aVar.f454u = this.f454u;
            aVar.f454u = this.f454u;
            aVar.f454u = this.f454u;
            aVar.f459z = this.f459z;
            aVar.f399A = this.f399A;
            aVar.f400B = this.f400B;
            aVar.f401C = this.f401C;
            aVar.f402D = this.f402D;
            aVar.f403E = this.f403E;
            aVar.f404F = this.f404F;
            aVar.f405G = this.f405G;
            aVar.f406H = this.f406H;
            aVar.f407I = this.f407I;
            aVar.f408J = this.f408J;
            aVar.f409K = this.f409K;
            aVar.f410L = this.f410L;
            aVar.f411M = this.f411M;
            aVar.f412N = this.f412N;
            aVar.f413O = this.f413O;
            aVar.f414P = this.f414P;
            aVar.f415Q = this.f415Q;
            aVar.f416R = this.f416R;
            aVar.f417S = this.f417S;
            aVar.f418T = this.f418T;
            aVar.f419U = this.f419U;
            aVar.f420V = this.f420V;
            aVar.f421W = this.f421W;
            aVar.f422X = this.f422X;
            aVar.f423Y = this.f423Y;
            aVar.f424Z = this.f424Z;
            aVar.f426aa = this.f426aa;
            aVar.f428ba = this.f428ba;
            aVar.f430ca = this.f430ca;
            aVar.f432da = this.f432da;
            aVar.f434ea = this.f434ea;
            aVar.f436fa = this.f436fa;
            aVar.f438ga = this.f438ga;
            aVar.f440ha = this.f440ha;
            aVar.f442ia = this.f442ia;
            return aVar;
        }
    }

    static {
        f397b.append(C0073c.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f397b.append(C0073c.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f397b.append(C0073c.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f397b.append(C0073c.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f397b.append(C0073c.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f397b.append(C0073c.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f397b.append(C0073c.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f397b.append(C0073c.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f397b.append(C0073c.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f397b.append(C0073c.ConstraintSet_layout_editor_absoluteX, 6);
        f397b.append(C0073c.ConstraintSet_layout_editor_absoluteY, 7);
        f397b.append(C0073c.ConstraintSet_layout_constraintGuide_begin, 17);
        f397b.append(C0073c.ConstraintSet_layout_constraintGuide_end, 18);
        f397b.append(C0073c.ConstraintSet_layout_constraintGuide_percent, 19);
        f397b.append(C0073c.ConstraintSet_android_orientation, 27);
        f397b.append(C0073c.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f397b.append(C0073c.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f397b.append(C0073c.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f397b.append(C0073c.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f397b.append(C0073c.ConstraintSet_layout_goneMarginLeft, 13);
        f397b.append(C0073c.ConstraintSet_layout_goneMarginTop, 16);
        f397b.append(C0073c.ConstraintSet_layout_goneMarginRight, 14);
        f397b.append(C0073c.ConstraintSet_layout_goneMarginBottom, 11);
        f397b.append(C0073c.ConstraintSet_layout_goneMarginStart, 15);
        f397b.append(C0073c.ConstraintSet_layout_goneMarginEnd, 12);
        f397b.append(C0073c.ConstraintSet_layout_constraintVertical_weight, 40);
        f397b.append(C0073c.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f397b.append(C0073c.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f397b.append(C0073c.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f397b.append(C0073c.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f397b.append(C0073c.ConstraintSet_layout_constraintVertical_bias, 37);
        f397b.append(C0073c.ConstraintSet_layout_constraintDimensionRatio, 5);
        f397b.append(C0073c.ConstraintSet_layout_constraintLeft_creator, 60);
        f397b.append(C0073c.ConstraintSet_layout_constraintTop_creator, 60);
        f397b.append(C0073c.ConstraintSet_layout_constraintRight_creator, 60);
        f397b.append(C0073c.ConstraintSet_layout_constraintBottom_creator, 60);
        f397b.append(C0073c.ConstraintSet_layout_constraintBaseline_creator, 60);
        f397b.append(C0073c.ConstraintSet_android_layout_marginLeft, 24);
        f397b.append(C0073c.ConstraintSet_android_layout_marginRight, 28);
        f397b.append(C0073c.ConstraintSet_android_layout_marginStart, 31);
        f397b.append(C0073c.ConstraintSet_android_layout_marginEnd, 8);
        f397b.append(C0073c.ConstraintSet_android_layout_marginTop, 34);
        f397b.append(C0073c.ConstraintSet_android_layout_marginBottom, 2);
        f397b.append(C0073c.ConstraintSet_android_layout_width, 23);
        f397b.append(C0073c.ConstraintSet_android_layout_height, 21);
        f397b.append(C0073c.ConstraintSet_android_visibility, 22);
        f397b.append(C0073c.ConstraintSet_android_alpha, 43);
        f397b.append(C0073c.ConstraintSet_android_elevation, 44);
        f397b.append(C0073c.ConstraintSet_android_rotationX, 45);
        f397b.append(C0073c.ConstraintSet_android_rotationY, 46);
        f397b.append(C0073c.ConstraintSet_android_scaleX, 47);
        f397b.append(C0073c.ConstraintSet_android_scaleY, 48);
        f397b.append(C0073c.ConstraintSet_android_transformPivotX, 49);
        f397b.append(C0073c.ConstraintSet_android_transformPivotY, 50);
        f397b.append(C0073c.ConstraintSet_android_translationX, 51);
        f397b.append(C0073c.ConstraintSet_android_translationY, 52);
        f397b.append(C0073c.ConstraintSet_android_translationZ, 53);
        f397b.append(C0073c.ConstraintSet_layout_constraintWidth_default, 54);
        f397b.append(C0073c.ConstraintSet_layout_constraintHeight_default, 55);
        f397b.append(C0073c.ConstraintSet_layout_constraintWidth_max, 56);
        f397b.append(C0073c.ConstraintSet_layout_constraintHeight_max, 57);
        f397b.append(C0073c.ConstraintSet_layout_constraintWidth_min, 58);
        f397b.append(C0073c.ConstraintSet_layout_constraintHeight_min, 59);
        f397b.append(C0073c.ConstraintSet_android_id, 38);
    }

    /* renamed from: a */
    private static int m336a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    private C0072a m337a(Context context, AttributeSet attributeSet) {
        C0072a aVar = new C0072a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0073c.ConstraintSet);
        m338a(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0229, code lost:
        r8.f447n = m336a(r9, r2, r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m338a(android.support.constraint.C0071b.C0072a r8, android.content.res.TypedArray r9) {
        /*
            r7 = this;
            int r0 = r9.getIndexCount()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0258
            int r2 = r9.getIndex(r1)
            android.util.SparseIntArray r3 = f397b
            int r3 = r3.get(r2)
            r4 = 60
            java.lang.String r5 = "   "
            java.lang.String r6 = "ConstraintSet"
            if (r3 == r4) goto L_0x024b
            switch(r3) {
                case 1: goto L_0x0242;
                case 2: goto L_0x0239;
                case 3: goto L_0x0230;
                case 4: goto L_0x0227;
                case 5: goto L_0x0220;
                case 6: goto L_0x0217;
                case 7: goto L_0x020e;
                case 8: goto L_0x0205;
                case 9: goto L_0x0202;
                case 10: goto L_0x01f9;
                case 11: goto L_0x01f0;
                case 12: goto L_0x01e7;
                case 13: goto L_0x01dd;
                case 14: goto L_0x01d3;
                case 15: goto L_0x01c9;
                case 16: goto L_0x01bf;
                case 17: goto L_0x01b5;
                case 18: goto L_0x01ab;
                case 19: goto L_0x01a1;
                case 20: goto L_0x0197;
                case 21: goto L_0x018d;
                case 22: goto L_0x017b;
                case 23: goto L_0x0171;
                case 24: goto L_0x0167;
                case 25: goto L_0x015d;
                case 26: goto L_0x0153;
                case 27: goto L_0x0149;
                case 28: goto L_0x013f;
                case 29: goto L_0x0135;
                case 30: goto L_0x012b;
                case 31: goto L_0x0121;
                case 32: goto L_0x0117;
                case 33: goto L_0x010d;
                case 34: goto L_0x0103;
                case 35: goto L_0x00f9;
                case 36: goto L_0x00ef;
                case 37: goto L_0x00e5;
                case 38: goto L_0x00db;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00c7;
                case 41: goto L_0x00bd;
                case 42: goto L_0x00b3;
                case 43: goto L_0x00a9;
                case 44: goto L_0x009c;
                case 45: goto L_0x0092;
                case 46: goto L_0x0088;
                case 47: goto L_0x007e;
                case 48: goto L_0x0074;
                case 49: goto L_0x006a;
                case 50: goto L_0x0060;
                case 51: goto L_0x0056;
                case 52: goto L_0x004c;
                case 53: goto L_0x0042;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown attribute 0x"
        L_0x0023:
            r3.append(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r2)
            r3.append(r4)
            r3.append(r5)
            android.util.SparseIntArray r4 = f397b
            int r2 = r4.get(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.w(r6, r2)
            goto L_0x0254
        L_0x0042:
            float r3 = r8.f430ca
            float r2 = r9.getFloat(r2, r3)
            r8.f430ca = r2
            goto L_0x0254
        L_0x004c:
            float r3 = r8.f428ba
            float r2 = r9.getFloat(r2, r3)
            r8.f428ba = r2
            goto L_0x0254
        L_0x0056:
            float r3 = r8.f426aa
            float r2 = r9.getFloat(r2, r3)
            r8.f426aa = r2
            goto L_0x0254
        L_0x0060:
            float r3 = r8.f424Z
            float r2 = r9.getFloat(r2, r3)
            r8.f424Z = r2
            goto L_0x0254
        L_0x006a:
            float r3 = r8.f423Y
            float r2 = r9.getFloat(r2, r3)
            r8.f423Y = r2
            goto L_0x0254
        L_0x0074:
            float r3 = r8.f422X
            float r2 = r9.getFloat(r2, r3)
            r8.f422X = r2
            goto L_0x0254
        L_0x007e:
            float r3 = r8.f421W
            float r2 = r9.getFloat(r2, r3)
            r8.f421W = r2
            goto L_0x0254
        L_0x0088:
            float r3 = r8.f420V
            float r2 = r9.getFloat(r2, r3)
            r8.f420V = r2
            goto L_0x0254
        L_0x0092:
            float r3 = r8.f419U
            float r2 = r9.getFloat(r2, r3)
            r8.f419U = r2
            goto L_0x0254
        L_0x009c:
            r3 = 1
            r8.f417S = r3
            float r3 = r8.f418T
            float r2 = r9.getFloat(r2, r3)
            r8.f418T = r2
            goto L_0x0254
        L_0x00a9:
            float r3 = r8.f416R
            float r2 = r9.getFloat(r2, r3)
            r8.f416R = r2
            goto L_0x0254
        L_0x00b3:
            int r3 = r8.f415Q
            int r2 = r9.getInt(r2, r3)
            r8.f415Q = r2
            goto L_0x0254
        L_0x00bd:
            int r3 = r8.f414P
            int r2 = r9.getInt(r2, r3)
            r8.f414P = r2
            goto L_0x0254
        L_0x00c7:
            float r3 = r8.f412N
            float r2 = r9.getFloat(r2, r3)
            r8.f412N = r2
            goto L_0x0254
        L_0x00d1:
            float r3 = r8.f413O
            float r2 = r9.getFloat(r2, r3)
            r8.f413O = r2
            goto L_0x0254
        L_0x00db:
            int r3 = r8.f431d
            int r2 = r9.getResourceId(r2, r3)
            r8.f431d = r2
            goto L_0x0254
        L_0x00e5:
            float r3 = r8.f455v
            float r2 = r9.getFloat(r2, r3)
            r8.f455v = r2
            goto L_0x0254
        L_0x00ef:
            int r3 = r8.f445l
            int r2 = m336a(r9, r2, r3)
            r8.f445l = r2
            goto L_0x0254
        L_0x00f9:
            int r3 = r8.f446m
            int r2 = m336a(r9, r2, r3)
            r8.f446m = r2
            goto L_0x0254
        L_0x0103:
            int r3 = r8.f401C
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f401C = r2
            goto L_0x0254
        L_0x010d:
            int r3 = r8.f451r
            int r2 = m336a(r9, r2, r3)
            r8.f451r = r2
            goto L_0x0254
        L_0x0117:
            int r3 = r8.f450q
            int r2 = m336a(r9, r2, r3)
            r8.f450q = r2
            goto L_0x0254
        L_0x0121:
            int r3 = r8.f404F
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f404F = r2
            goto L_0x0254
        L_0x012b:
            int r3 = r8.f444k
            int r2 = m336a(r9, r2, r3)
            r8.f444k = r2
            goto L_0x0254
        L_0x0135:
            int r3 = r8.f443j
            int r2 = m336a(r9, r2, r3)
            r8.f443j = r2
            goto L_0x0254
        L_0x013f:
            int r3 = r8.f400B
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f400B = r2
            goto L_0x0254
        L_0x0149:
            int r3 = r8.f459z
            int r2 = r9.getInt(r2, r3)
            r8.f459z = r2
            goto L_0x0254
        L_0x0153:
            int r3 = r8.f441i
            int r2 = m336a(r9, r2, r3)
            r8.f441i = r2
            goto L_0x0254
        L_0x015d:
            int r3 = r8.f439h
            int r2 = m336a(r9, r2, r3)
            r8.f439h = r2
            goto L_0x0254
        L_0x0167:
            int r3 = r8.f399A
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f399A = r2
            goto L_0x0254
        L_0x0171:
            int r3 = r8.f427b
            int r2 = r9.getLayoutDimension(r2, r3)
            r8.f427b = r2
            goto L_0x0254
        L_0x017b:
            int r3 = r8.f405G
            int r2 = r9.getInt(r2, r3)
            r8.f405G = r2
            int[] r2 = f396a
            int r3 = r8.f405G
            r2 = r2[r3]
            r8.f405G = r2
            goto L_0x0254
        L_0x018d:
            int r3 = r8.f429c
            int r2 = r9.getLayoutDimension(r2, r3)
            r8.f429c = r2
            goto L_0x0254
        L_0x0197:
            float r3 = r8.f454u
            float r2 = r9.getFloat(r2, r3)
            r8.f454u = r2
            goto L_0x0254
        L_0x01a1:
            float r3 = r8.f437g
            float r2 = r9.getFloat(r2, r3)
            r8.f437g = r2
            goto L_0x0254
        L_0x01ab:
            int r3 = r8.f435f
            int r2 = r9.getDimensionPixelOffset(r2, r3)
            r8.f435f = r2
            goto L_0x0254
        L_0x01b5:
            int r3 = r8.f433e
            int r2 = r9.getDimensionPixelOffset(r2, r3)
            r8.f433e = r2
            goto L_0x0254
        L_0x01bf:
            int r3 = r8.f407I
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f407I = r2
            goto L_0x0254
        L_0x01c9:
            int r3 = r8.f411M
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f411M = r2
            goto L_0x0254
        L_0x01d3:
            int r3 = r8.f408J
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f408J = r2
            goto L_0x0254
        L_0x01dd:
            int r3 = r8.f406H
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f406H = r2
            goto L_0x0254
        L_0x01e7:
            int r3 = r8.f410L
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f410L = r2
            goto L_0x0254
        L_0x01f0:
            int r3 = r8.f409K
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f409K = r2
            goto L_0x0254
        L_0x01f9:
            int r3 = r8.f452s
            int r2 = m336a(r9, r2, r3)
            r8.f452s = r2
            goto L_0x0254
        L_0x0202:
            int r3 = r8.f453t
            goto L_0x0229
        L_0x0205:
            int r3 = r8.f403E
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f403E = r2
            goto L_0x0254
        L_0x020e:
            int r3 = r8.f458y
            int r2 = r9.getDimensionPixelOffset(r2, r3)
            r8.f458y = r2
            goto L_0x0254
        L_0x0217:
            int r3 = r8.f457x
            int r2 = r9.getDimensionPixelOffset(r2, r3)
            r8.f457x = r2
            goto L_0x0254
        L_0x0220:
            java.lang.String r2 = r9.getString(r2)
            r8.f456w = r2
            goto L_0x0254
        L_0x0227:
            int r3 = r8.f447n
        L_0x0229:
            int r2 = m336a(r9, r2, r3)
            r8.f447n = r2
            goto L_0x0254
        L_0x0230:
            int r3 = r8.f448o
            int r2 = m336a(r9, r2, r3)
            r8.f448o = r2
            goto L_0x0254
        L_0x0239:
            int r3 = r8.f402D
            int r2 = r9.getDimensionPixelSize(r2, r3)
            r8.f402D = r2
            goto L_0x0254
        L_0x0242:
            int r3 = r8.f449p
            int r2 = m336a(r9, r2, r3)
            r8.f449p = r2
            goto L_0x0254
        L_0x024b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unused attribute 0x"
            goto L_0x0023
        L_0x0254:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.C0071b.m338a(android.support.constraint.b$a, android.content.res.TypedArray):void");
    }

    /* renamed from: a */
    public void mo269a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0072a a = m337a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f425a = true;
                    }
                    this.f398c.put(Integer.valueOf(a.f431d), a);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo270a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f398c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.f398c.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0072a aVar = this.f398c.get(Integer.valueOf(id));
                ConstraintLayout.C0044a aVar2 = (ConstraintLayout.C0044a) childAt.getLayoutParams();
                aVar.mo271a(aVar2);
                childAt.setLayoutParams(aVar2);
                childAt.setVisibility(aVar.f405G);
                if (Build.VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(aVar.f416R);
                    childAt.setRotationX(aVar.f419U);
                    childAt.setRotationY(aVar.f420V);
                    childAt.setScaleX(aVar.f421W);
                    childAt.setScaleY(aVar.f422X);
                    childAt.setPivotX(aVar.f423Y);
                    childAt.setPivotY(aVar.f424Z);
                    childAt.setTranslationX(aVar.f426aa);
                    childAt.setTranslationY(aVar.f428ba);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(aVar.f430ca);
                        if (aVar.f417S) {
                            childAt.setElevation(aVar.f418T);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0072a aVar3 = this.f398c.get(num);
            if (aVar3.f425a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0044a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar3.mo271a(generateDefaultLayoutParams);
                constraintLayout.addView(guideline, generateDefaultLayoutParams);
            }
        }
    }
}
