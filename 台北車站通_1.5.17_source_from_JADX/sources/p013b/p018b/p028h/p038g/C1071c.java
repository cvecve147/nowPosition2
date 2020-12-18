package p013b.p018b.p028h.p038g;

import java.util.Locale;

/* renamed from: b.b.h.g.c */
public final class C1071c {

    /* renamed from: a */
    public static final C1070b f4016a = new C1076e((C1074c) null, false);

    /* renamed from: b */
    public static final C1070b f4017b = new C1076e((C1074c) null, true);

    /* renamed from: c */
    public static final C1070b f4018c = new C1076e(C1073b.f4025a, false);

    /* renamed from: d */
    public static final C1070b f4019d = new C1076e(C1073b.f4025a, true);

    /* renamed from: e */
    public static final C1070b f4020e = new C1076e(C1072a.f4022a, false);

    /* renamed from: f */
    public static final C1070b f4021f = C1077f.f4028b;

    /* renamed from: b.b.h.g.c$a */
    private static class C1072a implements C1074c {

        /* renamed from: a */
        static final C1072a f4022a = new C1072a(true);

        /* renamed from: b */
        static final C1072a f4023b = new C1072a(false);

        /* renamed from: c */
        private final boolean f4024c;

        private C1072a(boolean z) {
            this.f4024c = z;
        }

        /* renamed from: a */
        public int mo5102a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C1071c.m5588a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f4024c) {
                        return 1;
                    }
                } else if (this.f4024c) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f4024c ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: b.b.h.g.c$b */
    private static class C1073b implements C1074c {

        /* renamed from: a */
        static final C1073b f4025a = new C1073b();

        private C1073b() {
        }

        /* renamed from: a */
        public int mo5102a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C1071c.m5589b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: b.b.h.g.c$c */
    private interface C1074c {
        /* renamed from: a */
        int mo5102a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: b.b.h.g.c$d */
    private static abstract class C1075d implements C1070b {

        /* renamed from: a */
        private final C1074c f4026a;

        C1075d(C1074c cVar) {
            this.f4026a = cVar;
        }

        /* renamed from: a */
        private boolean m5593a(CharSequence charSequence, int i, int i2) {
            int a = this.f4026a.mo5102a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo5103a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo5103a();

        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f4026a == null ? mo5103a() : m5593a(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b.b.h.g.c$e */
    private static class C1076e extends C1075d {

        /* renamed from: b */
        private final boolean f4027b;

        C1076e(C1074c cVar, boolean z) {
            super(cVar);
            this.f4027b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo5103a() {
            return this.f4027b;
        }
    }

    /* renamed from: b.b.h.g.c$f */
    private static class C1077f extends C1075d {

        /* renamed from: b */
        static final C1077f f4028b = new C1077f();

        C1077f() {
            super((C1074c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo5103a() {
            return C1078d.m5597a(Locale.getDefault()) == 1;
        }
    }

    /* renamed from: a */
    static int m5588a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m5589b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
