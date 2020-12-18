package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p011v7.widget.C0878q;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import java.lang.reflect.Field;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p101d.p108c.p109a.C5208m;
import p101d.p108c.p109a.C5211p;
import p101d.p108c.p109a.p110a.C5182c;

/* renamed from: com.afollestad.materialdialogs.internal.f */
public class C1160f {
    /* renamed from: a */
    private static ColorStateList m5880a(Context context, int i) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{C5182c.m20050d(context, C5208m.colorControlNormal), C5182c.m20050d(context, C5208m.colorControlNormal), i});
    }

    /* renamed from: a */
    public static void m5881a(CheckBox checkBox, int i) {
        int a = C5182c.m20034a(checkBox.getContext());
        m5882a(checkBox, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{C5182c.m20050d(checkBox.getContext(), C5208m.colorControlNormal), i, a, a}));
    }

    /* renamed from: a */
    public static void m5882a(CheckBox checkBox, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            checkBox.setButtonTintList(colorStateList);
            return;
        }
        Drawable i = C1026a.m5462i(C1006a.m5394c(checkBox.getContext(), C5211p.abc_btn_check_material));
        C1026a.m5447a(i, colorStateList);
        checkBox.setButtonDrawable(i);
    }

    /* renamed from: a */
    public static void m5883a(EditText editText, int i) {
        ColorStateList a = m5880a(editText.getContext(), i);
        if (editText instanceof C0878q) {
            ((C0878q) editText).setSupportBackgroundTintList(a);
        } else if (Build.VERSION.SDK_INT >= 21) {
            editText.setBackgroundTintList(a);
        }
        m5888b(editText, i);
    }

    /* renamed from: a */
    public static void m5884a(ProgressBar progressBar, int i) {
        m5885a(progressBar, i, false);
    }

    /* renamed from: a */
    private static void m5885a(ProgressBar progressBar, int i, boolean z) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (Build.VERSION.SDK_INT >= 21) {
            progressBar.setProgressTintList(valueOf);
            progressBar.setSecondaryProgressTintList(valueOf);
            if (!z) {
                progressBar.setIndeterminateTintList(valueOf);
                return;
            }
            return;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (Build.VERSION.SDK_INT <= 10) {
            mode = PorterDuff.Mode.MULTIPLY;
        }
        if (!z && progressBar.getIndeterminateDrawable() != null) {
            progressBar.getIndeterminateDrawable().setColorFilter(i, mode);
        }
        if (progressBar.getProgressDrawable() != null) {
            progressBar.getProgressDrawable().setColorFilter(i, mode);
        }
    }

    /* renamed from: a */
    public static void m5886a(RadioButton radioButton, int i) {
        int a = C5182c.m20034a(radioButton.getContext());
        m5887a(radioButton, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{C5182c.m20050d(radioButton.getContext(), C5208m.colorControlNormal), i, a, a}));
    }

    /* renamed from: a */
    public static void m5887a(RadioButton radioButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            radioButton.setButtonTintList(colorStateList);
            return;
        }
        Drawable i = C1026a.m5462i(C1006a.m5394c(radioButton.getContext(), C5211p.abc_btn_radio_material));
        C1026a.m5447a(i, colorStateList);
        radioButton.setButtonDrawable(i);
    }

    /* renamed from: b */
    private static void m5888b(EditText editText, int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {C1006a.m5394c(editText.getContext(), i2), C1006a.m5394c(editText.getContext(), i2)};
            drawableArr[0].setColorFilter(i, PorterDuff.Mode.SRC_IN);
            drawableArr[1].setColorFilter(i, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, drawableArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
