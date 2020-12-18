package p267i.p274b.p282c;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

/* renamed from: i.b.c.a */
public class C6739a extends Dialog {
    public C6739a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo17222a(String str) {
        super.show();
        ((TextView) findViewById(C6753n.txtMsg)).setText(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(C6754o.dialog_avloading_indicator);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    public void show() {
        mo17222a("");
    }
}
