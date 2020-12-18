package p101d.p108c.p109a.p110a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p108c.p109a.C5192g;
import p101d.p108c.p109a.C5197l;

/* renamed from: d.c.a.a.c */
public class C5182c {
    /* renamed from: a */
    public static int m20033a(int i, float f) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    public static int m20034a(Context context) {
        return m20033a(m20043a(m20050d(context, 16842806)) ? -16777216 : -1, 0.3f);
    }

    /* renamed from: a */
    public static int m20035a(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private static int m20036a(C5192g gVar) {
        int i = C5181b.f14561a[gVar.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static ColorStateList m20037a(Context context, int i) {
        int d = m20050d(context, 16842806);
        if (i != 0) {
            d = i;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m20033a(d, 0.4f), d});
    }

    /* renamed from: a */
    public static ColorStateList m20038a(Context context, int i, ColorStateList colorStateList) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            if (peekValue.type < 28 || peekValue.type > 31) {
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
                if (colorStateList2 != null) {
                    obtainStyledAttributes.recycle();
                    return colorStateList2;
                }
                obtainStyledAttributes.recycle();
                return colorStateList;
            }
            ColorStateList a = m20037a(context, peekValue.data);
            obtainStyledAttributes.recycle();
            return a;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private static Drawable m20039a(Context context, int i, Drawable drawable) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 == null && drawable != null) {
                drawable2 = drawable;
            }
            return drawable2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static C5192g m20040a(Context context, int i, C5192g gVar) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            int i2 = obtainStyledAttributes.getInt(0, m20036a(gVar));
            if (i2 == 1) {
                C5192g gVar2 = C5192g.CENTER;
                obtainStyledAttributes.recycle();
                return gVar2;
            } else if (i2 != 2) {
                return C5192g.START;
            } else {
                C5192g gVar3 = C5192g.END;
                obtainStyledAttributes.recycle();
                return gVar3;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static void m20041a(DialogInterface dialogInterface, C5197l.C5198a aVar) {
        InputMethodManager inputMethodManager;
        C5197l lVar = (C5197l) dialogInterface;
        if (lVar.mo14368d() != null && (inputMethodManager = (InputMethodManager) aVar.mo14388b().getSystemService("input_method")) != null) {
            View currentFocus = lVar.getCurrentFocus();
            IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : lVar.mo14371f().getWindowToken();
            if (windowToken != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }

    /* renamed from: a */
    public static void m20042a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }

    /* renamed from: a */
    public static boolean m20043a(int i) {
        return 1.0d - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    /* renamed from: a */
    public static boolean m20044a(Context context, int i, boolean z) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getBoolean(0, z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static <T> boolean m20045a(T t, T[] tArr) {
        if (!(tArr == null || tArr.length == 0)) {
            for (T equals : tArr) {
                if (equals.equals(t)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m20046b(Context context, int i) {
        return C1006a.m5386a(context, i);
    }

    /* renamed from: b */
    private static int m20047b(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static void m20048b(DialogInterface dialogInterface, C5197l.C5198a aVar) {
        C5197l lVar = (C5197l) dialogInterface;
        if (lVar.mo14368d() != null) {
            lVar.mo14368d().post(new C5180a(lVar, aVar));
        }
    }

    /* renamed from: c */
    public static boolean m20049c(Context context, int i) {
        return m20044a(context, i, false);
    }

    /* renamed from: d */
    public static int m20050d(Context context, int i) {
        return m20035a(context, i, 0);
    }

    /* renamed from: e */
    public static int m20051e(Context context, int i) {
        return m20047b(context, i, -1);
    }

    /* renamed from: f */
    public static Drawable m20052f(Context context, int i) {
        return m20039a(context, i, (Drawable) null);
    }

    /* renamed from: g */
    public static String m20053g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return (String) typedValue.string;
    }
}
