package p267i.p274b.p283d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;

/* renamed from: i.b.d.e */
public class C6766e {

    /* renamed from: a */
    private final int f18775a = 121;

    /* renamed from: b */
    private final String f18776b = "com.google.android.tts";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f18777c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextToSpeech f18778d;

    /* renamed from: e */
    private C6769c f18779e;

    /* renamed from: f */
    private C6768b f18780f;

    /* renamed from: i.b.d.e$a */
    private class C6767a implements TextToSpeech.OnInitListener {
        private C6767a() {
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
                i.b.d.e r1 = p267i.p274b.p283d.C6766e.this
                android.speech.tts.TextToSpeech r1 = r1.f18778d
                int r1 = r1.isLanguageAvailable(r4)
                r2 = 1
                if (r1 == 0) goto L_0x0016
                if (r1 != r2) goto L_0x002a
            L_0x0016:
                i.b.d.e r0 = p267i.p274b.p283d.C6766e.this
                android.speech.tts.TextToSpeech r0 = r0.f18778d
                r0.setLanguage(r4)
                i.b.d.e r4 = p267i.p274b.p283d.C6766e.this
                boolean unused = r4.f18777c = r2
                i.b.d.e r4 = p267i.p274b.p283d.C6766e.this
                r4.mo17256a((boolean) r2)
                goto L_0x002f
            L_0x002a:
                i.b.d.e r4 = p267i.p274b.p283d.C6766e.this
                r4.mo17256a((boolean) r0)
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p267i.p274b.p283d.C6766e.C6767a.onInit(int):void");
        }
    }

    /* renamed from: i.b.d.e$b */
    public interface C6768b {
    }

    /* renamed from: i.b.d.e$c */
    public interface C6769c {
        /* renamed from: a */
        void mo5649a(boolean z);
    }

    /* renamed from: a */
    public static void m25594a(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.speech.tts.engine.INSTALL_TTS_DATA");
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public void mo17254a() {
        TextToSpeech textToSpeech = this.f18778d;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            this.f18778d = null;
            this.f18779e = null;
            this.f18780f = null;
        }
        this.f18777c = false;
    }

    /* renamed from: a */
    public void mo17255a(Context context, C6769c cVar) {
        this.f18779e = cVar;
        this.f18778d = new TextToSpeech(context, new C6767a(), "com.google.android.tts");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17256a(boolean z) {
        C6769c cVar = this.f18779e;
        if (cVar != null) {
            cVar.mo5649a(z);
        }
    }
}
