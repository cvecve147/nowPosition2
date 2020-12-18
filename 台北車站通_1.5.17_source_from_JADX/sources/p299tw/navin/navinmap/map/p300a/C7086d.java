package p299tw.navin.navinmap.map.p300a;

import android.graphics.Picture;
import android.net.Uri;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p299tw.navin.navinmap.map.p300a.C7084c;

/* renamed from: tw.navin.navinmap.map.a.d */
class C7086d extends Thread {

    /* renamed from: a */
    final /* synthetic */ String f19527a;

    /* renamed from: b */
    final /* synthetic */ C7087e f19528b;

    C7086d(C7087e eVar, String str) {
        this.f19528b = eVar;
        this.f19527a = str;
    }

    public void run() {
        boolean z;
        try {
            Uri b = this.f19528b.mo21119b(this.f19527a);
            if (b != null) {
                SVG unused = this.f19528b.f19529d = SVG.getFromInputStream(new FileInputStream(b.getPath()));
            } else {
                SVG unused2 = this.f19528b.f19529d = SVG.getFromInputStream(((HttpURLConnection) new URL(this.f19527a).openConnection()).getInputStream());
            }
            Picture unused3 = this.f19528b.f19530e = this.f19528b.f19529d.renderToPicture();
            z = true;
        } catch (SVGParseException | IOException | NullPointerException e) {
            e.printStackTrace();
            z = false;
        }
        C7084c.C7085a aVar = this.f19528b.f19526c;
        if (aVar == null) {
            return;
        }
        if (z) {
            aVar.mo21032a();
        } else {
            aVar.mo21033b();
        }
    }
}
