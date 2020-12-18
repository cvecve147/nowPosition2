package p267i.p268a.p269a.p273c;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;
import p267i.p268a.p269a.C6684c;
import p267i.p268a.p269a.C6688d;

/* renamed from: i.a.a.c.a */
public class C6685a extends Dialog {
    public C6685a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo17131a(String str) {
        super.show();
        ((TextView) findViewById(C6684c.txtMsg)).setText(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(C6688d.dialog_avl_indicator);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    public void show() {
        mo17131a("");
    }
}
