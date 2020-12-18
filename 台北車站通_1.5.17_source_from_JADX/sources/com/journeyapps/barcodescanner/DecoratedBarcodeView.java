package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.journeyapps.barcodescanner.p077a.C4121m;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5861h;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p163b.p164a.C5759f;
import p101d.p129g.p159f.p163b.p164a.C5760g;
import p101d.p129g.p159f.p163b.p164a.C5766l;
import p101d.p129g.p159f.p163b.p164a.C5767m;
import p101d.p129g.p159f.p163b.p164a.C5770p;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a */
    private BarcodeView f12171a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ViewfinderView f12172b;

    /* renamed from: c */
    private TextView f12173c;

    /* renamed from: d */
    private C4103a f12174d;

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$a */
    public interface C4103a {
        /* renamed from: a */
        void mo11594a();

        /* renamed from: b */
        void mo11595b();
    }

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$b */
    private class C4104b implements C4107a {

        /* renamed from: a */
        private C4107a f12175a;

        public C4104b(C4107a aVar) {
            this.f12175a = aVar;
        }

        /* renamed from: a */
        public void mo11596a(C4132b bVar) {
            this.f12175a.mo11596a(bVar);
        }

        /* renamed from: a */
        public void mo11597a(List<C5919o> list) {
            for (C5919o a : list) {
                DecoratedBarcodeView.this.f12172b.mo11603a(a);
            }
            this.f12175a.mo11597a(list);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        m16396e();
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16395a(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16395a(attributeSet);
    }

    /* renamed from: a */
    private void m16395a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5770p.zxing_view);
        int resourceId = obtainStyledAttributes.getResourceId(C5770p.zxing_view_zxing_scanner_layout, C5767m.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        this.f12171a = (BarcodeView) findViewById(C5766l.zxing_barcode_surface);
        BarcodeView barcodeView = this.f12171a;
        if (barcodeView != null) {
            barcodeView.mo11690a(attributeSet);
            this.f12172b = (ViewfinderView) findViewById(C5766l.zxing_viewfinder_view);
            ViewfinderView viewfinderView = this.f12172b;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f12171a);
                this.f12173c = (TextView) findViewById(C5766l.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    /* renamed from: e */
    private void m16396e() {
        m16395a((AttributeSet) null);
    }

    /* renamed from: a */
    public void mo11582a() {
        this.f12171a.mo11556e();
    }

    /* renamed from: a */
    public void mo11583a(Intent intent) {
        int intExtra;
        Set<C5743a> a = C5759f.m21765a(intent);
        Map<C5806e, Object> a2 = C5760g.m21767a(intent);
        C4121m mVar = new C4121m();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            mVar.mo11647a(intExtra);
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new C5861h().mo15565a((Map<C5806e, ?>) a2);
        this.f12171a.setCameraSettings(mVar);
        this.f12171a.setDecoderFactory(new C4156y(a, a2, stringExtra2));
    }

    /* renamed from: a */
    public void mo11584a(C4107a aVar) {
        this.f12171a.mo11555a((C4107a) new C4104b(aVar));
    }

    /* renamed from: b */
    public void mo11585b() {
        this.f12171a.mo11695g();
    }

    /* renamed from: c */
    public void mo11586c() {
        this.f12171a.setTorch(false);
        C4103a aVar = this.f12174d;
        if (aVar != null) {
            aVar.mo11594a();
        }
    }

    /* renamed from: d */
    public void mo11587d() {
        this.f12171a.setTorch(true);
        C4103a aVar = this.f12174d;
        if (aVar != null) {
            aVar.mo11595b();
        }
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(C5766l.zxing_barcode_surface);
    }

    public TextView getStatusView() {
        return this.f12173c;
    }

    public ViewfinderView getViewFinder() {
        return this.f12172b;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            mo11587d();
            return true;
        } else if (i == 25) {
            mo11586c();
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setStatusText(String str) {
        TextView textView = this.f12173c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(C4103a aVar) {
        this.f12174d = aVar;
    }
}
