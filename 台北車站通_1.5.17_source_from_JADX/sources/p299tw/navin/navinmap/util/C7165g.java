package p299tw.navin.navinmap.util;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import java.util.HashMap;

/* renamed from: tw.navin.navinmap.util.g */
public class C7165g {

    /* renamed from: a */
    private final int f19858a = 121;

    /* renamed from: b */
    private final String f19859b = "com.google.android.tts";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f19860c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextToSpeech f19861d;

    /* renamed from: e */
    private C7168c f19862e;

    /* renamed from: f */
    private C7167b f19863f;

    /* renamed from: tw.navin.navinmap.util.g$a */
    private class C7166a implements TextToSpeech.OnInitListener {
        private C7166a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r4 = java.util.Locale.getDefault();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onInit(int r4) {
            /*
                r3 = this;
                r0 = 0
                if (r4 != 0) goto L_0x002a
                java.util.Locale r4 = java.util.Locale.getDefault()
                tw.navin.navinmap.util.g r1 = p299tw.navin.navinmap.util.C7165g.this
                android.speech.tts.TextToSpeech r1 = r1.f19861d
                int r1 = r1.isLanguageAvailable(r4)
                r2 = 1
                if (r1 == 0) goto L_0x0016
                if (r1 != r2) goto L_0x002a
            L_0x0016:
                tw.navin.navinmap.util.g r0 = p299tw.navin.navinmap.util.C7165g.this
                android.speech.tts.TextToSpeech r0 = r0.f19861d
                r0.setLanguage(r4)
                tw.navin.navinmap.util.g r4 = p299tw.navin.navinmap.util.C7165g.this
                boolean unused = r4.f19860c = r2
                tw.navin.navinmap.util.g r4 = p299tw.navin.navinmap.util.C7165g.this
                r4.mo21282a((boolean) r2)
                goto L_0x002f
            L_0x002a:
                tw.navin.navinmap.util.g r4 = p299tw.navin.navinmap.util.C7165g.this
                r4.mo21282a((boolean) r0)
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.util.C7165g.C7166a.onInit(int):void");
        }
    }

    /* renamed from: tw.navin.navinmap.util.g$b */
    public interface C7167b {
    }

    /* renamed from: tw.navin.navinmap.util.g$c */
    public interface C7168c {
        /* renamed from: a */
        void mo21284a(boolean z);
    }

    /* renamed from: a */
    public void mo21279a() {
        TextToSpeech textToSpeech = this.f19861d;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            this.f19861d = null;
            this.f19862e = null;
            this.f19863f = null;
        }
        this.f19860c = false;
    }

    /* renamed from: a */
    public void mo21280a(Context context, C7168c cVar) {
        this.f19862e = cVar;
        this.f19861d = new TextToSpeech(context, new C7166a(), "com.google.android.tts");
    }

    /* renamed from: a */
    public void mo21281a(String str) {
        if (!this.f19860c) {
            return;
        }
        if (Build.VERSION.SDK_INT < 21) {
            this.f19861d.speak(str, 0, (HashMap) null);
        } else {
            this.f19861d.speak(str, 0, (Bundle) null, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21282a(boolean z) {
        C7168c cVar = this.f19862e;
        if (cVar != null) {
            cVar.mo21284a(z);
        }
    }
}
