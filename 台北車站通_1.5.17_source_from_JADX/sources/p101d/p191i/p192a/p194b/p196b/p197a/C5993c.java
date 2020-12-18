package p101d.p191i.p192a.p194b.p196b.p197a;

import android.graphics.ColorFilter;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import org.xml.sax.InputSource;
import p101d.p191i.p192a.p194b.p196b.p197a.C5997g;

/* renamed from: d.i.a.b.b.a.c */
public class C5993c {

    /* renamed from: a */
    private boolean f16674a = false;

    /* renamed from: b */
    private InputStream f16675b;

    /* renamed from: c */
    private Integer f16676c = null;

    /* renamed from: d */
    private Integer f16677d = null;

    /* renamed from: e */
    private ColorFilter f16678e = null;

    /* renamed from: f */
    private ColorFilter f16679f = null;

    /* renamed from: g */
    private boolean f16680g = false;

    /* renamed from: h */
    private boolean f16681h = false;

    /* renamed from: i */
    private boolean f16682i = true;

    /* renamed from: a */
    public C5992b mo15858a() {
        if (this.f16675b != null) {
            try {
                C5997g.C6003f fVar = new C5997g.C6003f();
                fVar.mo15871a(this.f16676c, this.f16677d, this.f16681h);
                fVar.mo15873a(this.f16680g);
                if (this.f16678e != null) {
                    fVar.f16728h.setColorFilter(this.f16678e);
                }
                if (this.f16679f != null) {
                    fVar.f16732l.setColorFilter(this.f16679f);
                }
                if (!this.f16675b.markSupported()) {
                    this.f16675b = new BufferedInputStream(this.f16675b);
                }
                this.f16675b.mark(4);
                byte[] bArr = new byte[2];
                int read = this.f16675b.read(bArr, 0, 2);
                int i = 65535 & (bArr[0] + (bArr[1] << 8));
                this.f16675b.reset();
                if (read == 2 && i == 35615) {
                    if (this.f16674a) {
                        Log.d("SVGAndroid", "SVG is gzipped");
                    }
                    this.f16675b = new GZIPInputStream(this.f16675b);
                }
                C5992b a = C5997g.m22720a(new InputSource(this.f16675b), fVar);
                if (this.f16682i) {
                    try {
                        this.f16675b.close();
                    } catch (IOException e) {
                        if (this.f16674a) {
                            Log.e("SVGAndroid", "Error closing SVG input stream.", e);
                        }
                    }
                }
                return a;
            } catch (IOException e2) {
                throw new C5995e(e2);
            } catch (Throwable th) {
                if (this.f16682i) {
                    try {
                        this.f16675b.close();
                    } catch (IOException e3) {
                        if (this.f16674a) {
                            Log.e("SVGAndroid", "Error closing SVG input stream.", e3);
                        }
                    }
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("SVG input not specified. Call one of the readFrom...() methods first.");
        }
    }

    /* renamed from: a */
    public C5992b mo15859a(List<String> list) {
        if (this.f16675b != null) {
            try {
                C5997g.C6003f fVar = new C5997g.C6003f();
                if (list != null) {
                    fVar.mo15872a(list);
                }
                fVar.mo15871a(this.f16676c, this.f16677d, this.f16681h);
                fVar.mo15873a(this.f16680g);
                if (this.f16678e != null) {
                    fVar.f16728h.setColorFilter(this.f16678e);
                }
                if (this.f16679f != null) {
                    fVar.f16732l.setColorFilter(this.f16679f);
                }
                if (!this.f16675b.markSupported()) {
                    this.f16675b = new BufferedInputStream(this.f16675b);
                }
                this.f16675b.mark(4);
                byte[] bArr = new byte[2];
                int read = this.f16675b.read(bArr, 0, 2);
                int i = 65535 & (bArr[0] + (bArr[1] << 8));
                this.f16675b.reset();
                if (read == 2 && i == 35615) {
                    if (this.f16674a) {
                        Log.d("SVGAndroid", "SVG is gzipped");
                    }
                    this.f16675b = new GZIPInputStream(this.f16675b);
                }
                C5992b a = C5997g.m22720a(new InputSource(this.f16675b), fVar);
                if (this.f16682i) {
                    try {
                        this.f16675b.close();
                    } catch (IOException e) {
                        if (this.f16674a) {
                            Log.e("SVGAndroid", "Error closing SVG input stream.", e);
                        }
                    }
                }
                return a;
            } catch (IOException e2) {
                throw new C5995e(e2);
            } catch (Throwable th) {
                if (this.f16682i) {
                    try {
                        this.f16675b.close();
                    } catch (IOException e3) {
                        if (this.f16674a) {
                            Log.e("SVGAndroid", "Error closing SVG input stream.", e3);
                        }
                    }
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("SVG input not specified. Call one of the readFrom...() methods first.");
        }
    }

    /* renamed from: a */
    public C5993c mo15860a(InputStream inputStream) {
        this.f16675b = inputStream;
        return this;
    }

    /* renamed from: a */
    public C5993c mo15861a(boolean z) {
        this.f16682i = z;
        return this;
    }
}
