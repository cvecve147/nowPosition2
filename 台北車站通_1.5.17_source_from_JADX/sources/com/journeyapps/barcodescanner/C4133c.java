package com.journeyapps.barcodescanner;

import android.os.Handler;
import android.os.Message;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.List;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p163b.p164a.C5766l;

/* renamed from: com.journeyapps.barcodescanner.c */
class C4133c implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ BarcodeView f12274a;

    C4133c(BarcodeView barcodeView) {
        this.f12274a = barcodeView;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == C5766l.zxing_decode_succeeded) {
            C4132b bVar = (C4132b) message.obj;
            if (!(bVar == null || this.f12274a.f12152C == null || this.f12274a.f12151B == BarcodeView.C4100a.NONE)) {
                this.f12274a.f12152C.mo11596a(bVar);
                if (this.f12274a.f12151B == BarcodeView.C4100a.SINGLE) {
                    this.f12274a.mo11560i();
                }
            }
            return true;
        } else if (i == C5766l.zxing_decode_failed) {
            return true;
        } else {
            if (i != C5766l.zxing_possible_result_points) {
                return false;
            }
            List list = (List) message.obj;
            if (!(this.f12274a.f12152C == null || this.f12274a.f12151B == BarcodeView.C4100a.NONE)) {
                this.f12274a.f12152C.mo11597a((List<C5919o>) list);
            }
            return true;
        }
    }
}
