package p101d.p129g.p152e.p154b;

import java.io.Writer;
import p101d.p129g.p152e.C5737u;
import p101d.p129g.p152e.p154b.p155a.C5658ja;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.B */
public final class C5603B {

    /* renamed from: d.g.e.b.B$a */
    private static final class C5604a extends Writer {

        /* renamed from: a */
        private final Appendable f15579a;

        /* renamed from: b */
        private final C5605a f15580b = new C5605a();

        /* renamed from: d.g.e.b.B$a$a */
        static class C5605a implements CharSequence {

            /* renamed from: a */
            char[] f15581a;

            C5605a() {
            }

            public char charAt(int i) {
                return this.f15581a[i];
            }

            public int length() {
                return this.f15581a.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f15581a, i, i2 - i);
            }
        }

        C5604a(Appendable appendable) {
            this.f15579a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) {
            this.f15579a.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) {
            C5605a aVar = this.f15580b;
            aVar.f15581a = cArr;
            this.f15579a.append(aVar, i, i2 + i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new p101d.p129g.p152e.C5738v((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new p101d.p129g.p152e.C5588D((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return p101d.p129g.p152e.C5739w.f15854a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new p101d.p129g.p152e.C5588D((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new p101d.p129g.p152e.C5588D((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: e (r2v4 'e' d.g.e.d.e A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p101d.p129g.p152e.C5737u m21254a(p101d.p129g.p152e.p158d.C5716b r2) {
        /*
            r2.mo15165p()     // Catch:{ EOFException -> 0x0024, e -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            d.g.e.I<d.g.e.u> r1 = p101d.p129g.p152e.p154b.p155a.C5658ja.f15647X     // Catch:{ EOFException -> 0x000d, e -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo15096a((p101d.p129g.p152e.p158d.C5716b) r2)     // Catch:{ EOFException -> 0x000d, e -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            d.g.e.u r2 = (p101d.p129g.p152e.C5737u) r2     // Catch:{ EOFException -> 0x000d, e -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            d.g.e.D r0 = new d.g.e.D
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            d.g.e.v r0 = new d.g.e.v
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            d.g.e.D r0 = new d.g.e.D
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            d.g.e.w r2 = p101d.p129g.p152e.C5739w.f15854a
            return r2
        L_0x002b:
            d.g.e.D r0 = new d.g.e.D
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p154b.C5603B.m21254a(d.g.e.d.b):d.g.e.u");
    }

    /* renamed from: a */
    public static Writer m21255a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C5604a(appendable);
    }

    /* renamed from: a */
    public static void m21256a(C5737u uVar, C5718d dVar) {
        C5658ja.f15647X.mo15097a(dVar, uVar);
    }
}
