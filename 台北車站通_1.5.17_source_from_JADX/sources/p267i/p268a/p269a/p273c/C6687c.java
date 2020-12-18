package p267i.p268a.p269a.p273c;

import android.content.Context;
import android.content.DialogInterface;
import android.support.p011v7.app.C0621l;
import p267i.p268a.p269a.C6690f;

/* renamed from: i.a.a.c.c */
public class C6687c {
    /* renamed from: a */
    public static C0621l.C0622a m25417a(Context context, String[] strArr, int i, int i2, DialogInterface.OnClickListener onClickListener) {
        C0621l.C0622a aVar = new C0621l.C0622a(context, C6690f.NavinMapSelectDialogTheme);
        aVar.mo2602a(true);
        aVar.mo2606b(i);
        aVar.mo2603a((CharSequence[]) strArr, onClickListener);
        aVar.mo2607b(i2, (DialogInterface.OnClickListener) new C6686b());
        return aVar;
    }
}
