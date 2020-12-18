package android.support.p011v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p011v7.app.AlertController;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import p013b.p018b.p040i.p041a.C1103a;

/* renamed from: android.support.v7.app.l */
public class C0621l extends C0591E implements DialogInterface {

    /* renamed from: b */
    final AlertController f2341b = new AlertController(getContext(), this, getWindow());

    /* renamed from: android.support.v7.app.l$a */
    public static class C0622a {

        /* renamed from: a */
        private final AlertController.C0578a f2342a;

        /* renamed from: b */
        private final int f2343b;

        public C0622a(Context context) {
            this(context, C0621l.m3036a(context, 0));
        }

        public C0622a(Context context, int i) {
            this.f2342a = new AlertController.C0578a(new ContextThemeWrapper(context, C0621l.m3036a(context, i)));
            this.f2343b = i;
        }

        /* renamed from: a */
        public C0622a mo2594a(int i) {
            AlertController.C0578a aVar = this.f2342a;
            aVar.f2156h = aVar.f2149a.getText(i);
            return this;
        }

        /* renamed from: a */
        public C0622a mo2595a(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0578a aVar = this.f2342a;
            aVar.f2160l = aVar.f2149a.getText(i);
            this.f2342a.f2162n = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0622a mo2596a(DialogInterface.OnKeyListener onKeyListener) {
            this.f2342a.f2169u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0622a mo2597a(Drawable drawable) {
            this.f2342a.f2152d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0622a mo2598a(View view) {
            this.f2342a.f2155g = view;
            return this;
        }

        /* renamed from: a */
        public C0622a mo2599a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0578a aVar = this.f2342a;
            aVar.f2171w = listAdapter;
            aVar.f2172x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0622a mo2600a(CharSequence charSequence) {
            this.f2342a.f2156h = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0622a mo2601a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0578a aVar = this.f2342a;
            aVar.f2160l = charSequence;
            aVar.f2162n = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0622a mo2602a(boolean z) {
            this.f2342a.f2166r = z;
            return this;
        }

        /* renamed from: a */
        public C0622a mo2603a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0578a aVar = this.f2342a;
            aVar.f2170v = charSequenceArr;
            aVar.f2172x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0621l mo2604a() {
            C0621l lVar = new C0621l(this.f2342a.f2149a, this.f2343b);
            this.f2342a.mo2421a(lVar.f2341b);
            lVar.setCancelable(this.f2342a.f2166r);
            if (this.f2342a.f2166r) {
                lVar.setCanceledOnTouchOutside(true);
            }
            lVar.setOnCancelListener(this.f2342a.f2167s);
            lVar.setOnDismissListener(this.f2342a.f2168t);
            DialogInterface.OnKeyListener onKeyListener = this.f2342a.f2169u;
            if (onKeyListener != null) {
                lVar.setOnKeyListener(onKeyListener);
            }
            return lVar;
        }

        /* renamed from: b */
        public Context mo2605b() {
            return this.f2342a.f2149a;
        }

        /* renamed from: b */
        public C0622a mo2606b(int i) {
            AlertController.C0578a aVar = this.f2342a;
            aVar.f2154f = aVar.f2149a.getText(i);
            return this;
        }

        /* renamed from: b */
        public C0622a mo2607b(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0578a aVar = this.f2342a;
            aVar.f2157i = aVar.f2149a.getText(i);
            this.f2342a.f2159k = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0622a mo2608b(CharSequence charSequence) {
            this.f2342a.f2154f = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0622a mo2609b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0578a aVar = this.f2342a;
            aVar.f2157i = charSequence;
            aVar.f2159k = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C0621l mo2610c() {
            C0621l a = mo2604a();
            a.show();
            return a;
        }
    }

    protected C0621l(Context context, int i) {
        super(context, m3036a(context, i));
    }

    /* renamed from: a */
    static int m3036a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1103a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2341b.mo2408a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f2341b.mo2413a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f2341b.mo2417b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2341b.mo2416b(charSequence);
    }
}
