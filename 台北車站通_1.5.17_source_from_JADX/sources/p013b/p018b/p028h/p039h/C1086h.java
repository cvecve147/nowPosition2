package p013b.p018b.p028h.p039h;

import android.util.Log;
import java.io.Writer;

/* renamed from: b.b.h.h.h */
public class C1086h extends Writer {

    /* renamed from: a */
    private final String f4048a;

    /* renamed from: b */
    private StringBuilder f4049b = new StringBuilder(128);

    public C1086h(String str) {
        this.f4048a = str;
    }

    /* renamed from: a */
    private void m5640a() {
        if (this.f4049b.length() > 0) {
            Log.d(this.f4048a, this.f4049b.toString());
            StringBuilder sb = this.f4049b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m5640a();
    }

    public void flush() {
        m5640a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m5640a();
            } else {
                this.f4049b.append(c);
            }
        }
    }
}
