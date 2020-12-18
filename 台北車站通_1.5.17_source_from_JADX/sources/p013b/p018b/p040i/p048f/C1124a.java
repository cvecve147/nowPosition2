package p013b.p018b.p040i.p048f;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: b.b.i.f.a */
public class C1124a implements TransformationMethod {

    /* renamed from: a */
    private Locale f4102a;

    public C1124a(Context context) {
        this.f4102a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f4102a);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
