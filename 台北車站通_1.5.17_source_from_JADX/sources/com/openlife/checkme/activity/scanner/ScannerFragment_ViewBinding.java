package com.openlife.checkme.activity.scanner;

import android.support.design.widget.TextInputEditText;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.scanner.ScannerFragment;

public class ScannerFragment_ViewBinding<T extends ScannerFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13730a;

    /* renamed from: b */
    private View f13731b;

    /* renamed from: c */
    private View f13732c;

    /* renamed from: d */
    private View f13733d;

    public ScannerFragment_ViewBinding(T t, View view) {
        this.f13730a = t;
        t.cameraView = C1153c.m5849a(view, C4956g.camera_view, "field 'cameraView'");
        t.manualView = C1153c.m5849a(view, C4956g.manual_view, "field 'manualView'");
        t.previewView = (SurfaceView) C1153c.m5853c(view, C4956g.preview_view, "field 'previewView'", SurfaceView.class);
        t.qrcodeScanHintLayout = (LinearLayout) C1153c.m5853c(view, C4956g.qrcode_scan_hint_layout, "field 'qrcodeScanHintLayout'", LinearLayout.class);
        t.remind = (TextView) C1153c.m5853c(view, C4956g.remind, "field 'remind'", TextView.class);
        View a = C1153c.m5849a(view, C4956g.manual, "field 'manual' and method 'onManualClick'");
        t.manual = (Button) C1153c.m5850a(a, C4956g.manual, "field 'manual'", Button.class);
        this.f13731b = a;
        a.setOnClickListener(new C4776k(this, t));
        t.codeInput = (TextInputEditText) C1153c.m5853c(view, C4956g.code_input, "field 'codeInput'", TextInputEditText.class);
        t.dateInput = (TextInputEditText) C1153c.m5853c(view, C4956g.date_input, "field 'dateInput'", TextInputEditText.class);
        t.randomInput = (TextInputEditText) C1153c.m5853c(view, C4956g.random_input, "field 'randomInput'", TextInputEditText.class);
        t.sellerInput = (TextInputEditText) C1153c.m5853c(view, C4956g.seller_input, "field 'sellerInput'", TextInputEditText.class);
        t.leftDone = (ImageView) C1153c.m5853c(view, C4956g.left_done, "field 'leftDone'", ImageView.class);
        t.rightDone = (ImageView) C1153c.m5853c(view, C4956g.right_done, "field 'rightDone'", ImageView.class);
        View a2 = C1153c.m5849a(view, C4956g.back, "field 'back' and method 'onScanClick'");
        t.back = (Button) C1153c.m5850a(a2, C4956g.back, "field 'back'", Button.class);
        this.f13732c = a2;
        a2.setOnClickListener(new C4777l(this, t));
        View a3 = C1153c.m5849a(view, C4956g.send, "field 'send' and method 'onSendClick'");
        t.send = (Button) C1153c.m5850a(a3, C4956g.send, "field 'send'", Button.class);
        this.f13733d = a3;
        a3.setOnClickListener(new C4778m(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13730a;
        if (t != null) {
            t.cameraView = null;
            t.manualView = null;
            t.previewView = null;
            t.qrcodeScanHintLayout = null;
            t.remind = null;
            t.manual = null;
            t.codeInput = null;
            t.dateInput = null;
            t.randomInput = null;
            t.sellerInput = null;
            t.leftDone = null;
            t.rightDone = null;
            t.back = null;
            t.send = null;
            this.f13731b.setOnClickListener((View.OnClickListener) null);
            this.f13731b = null;
            this.f13732c.setOnClickListener((View.OnClickListener) null);
            this.f13732c = null;
            this.f13733d.setOnClickListener((View.OnClickListener) null);
            this.f13733d = null;
            this.f13730a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
