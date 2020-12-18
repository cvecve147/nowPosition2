package p299tw.navin.navinmap.map;

import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import p267i.p268a.p269a.C6684c;
import p267i.p268a.p269a.C6689e;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.L */
class C7054L extends Handler {

    /* renamed from: a */
    final /* synthetic */ C7066T f19401a;

    C7054L(C7066T t) {
        this.f19401a = t;
    }

    public void handleMessage(Message message) {
        ImageView a;
        float f;
        int i = message.what;
        if (i == C6684c.enableUserWhereButton) {
            if (this.f19401a.f19480e != null) {
                this.f19401a.f19480e.setEnabled(true);
                a = this.f19401a.f19480e;
                f = 1.0f;
            } else {
                return;
            }
        } else if (i == C6684c.disableUserWhereButton) {
            if (this.f19401a.f19480e != null) {
                this.f19401a.f19480e.setEnabled(false);
                a = this.f19401a.f19480e;
                f = 0.5f;
            } else {
                return;
            }
        } else if (i == C6684c.changeIndicator) {
            String str = (String) message.obj;
            this.f19401a.f19489n.setText(str);
            if (message.arg1 == 99) {
                C7173l.m26998a(this.f19401a.getContext(), (String) null, str, false, this.f19401a.getContext().getString(C6689e.dialog_btn_ok), new C7053K(this));
                this.f19401a.mo21095i();
                return;
            }
            return;
        } else if (i == C6684c.changeRemainingDistance) {
            this.f19401a.f19490o.setText((String) message.obj);
            return;
        } else {
            return;
        }
        a.setAlpha(f);
    }
}
