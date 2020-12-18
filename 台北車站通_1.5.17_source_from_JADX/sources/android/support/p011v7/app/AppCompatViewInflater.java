package android.support.p011v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.widget.AppCompatCheckBox;
import android.support.p011v7.widget.AppCompatImageView;
import android.support.p011v7.widget.AppCompatRadioButton;
import android.support.p011v7.widget.C0701B;
import android.support.p011v7.widget.C0721I;
import android.support.p011v7.widget.C0818bb;
import android.support.p011v7.widget.C0849k;
import android.support.p011v7.widget.C0858m;
import android.support.p011v7.widget.C0863n;
import android.support.p011v7.widget.C0878q;
import android.support.p011v7.widget.C0885s;
import android.support.p011v7.widget.C0895u;
import android.support.p011v7.widget.C0909x;
import android.support.p011v7.widget.C0912y;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p013b.p018b.p028h.p039h.C1080b;
import p013b.p018b.p040i.p041a.C1112j;
import p013b.p018b.p040i.p050h.C1139d;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
public class AppCompatViewInflater {

    /* renamed from: a */
    private static final Class<?>[] f2176a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f2177b = {16843375};

    /* renamed from: c */
    private static final String[] f2178c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f2179d = new C1080b();

    /* renamed from: e */
    private final Object[] f2180e = new Object[2];

    /* renamed from: android.support.v7.app.AppCompatViewInflater$a */
    private static class C0582a implements View.OnClickListener {

        /* renamed from: a */
        private final View f2181a;

        /* renamed from: b */
        private final String f2182b;

        /* renamed from: c */
        private Method f2183c;

        /* renamed from: d */
        private Context f2184d;

        public C0582a(View view, String str) {
            this.f2181a = view;
            this.f2182b = str;
        }

        /* renamed from: a */
        private void m2825a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f2182b, new Class[]{View.class})) != null) {
                        this.f2183c = method;
                        this.f2184d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f2181a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f2181a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f2182b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f2181a.getClass() + str2);
        }

        public void onClick(View view) {
            if (this.f2183c == null) {
                m2825a(this.f2181a.getContext(), this.f2182b);
            }
            try {
                this.f2183c.invoke(this.f2184d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private static Context m2805a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1112j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C1112j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C1112j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C1139d) || ((C1139d) context).mo5317a() != resourceId) ? new C1139d(context, resourceId) : context : context;
    }

    /* renamed from: a */
    private View m2806a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = f2179d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f2176a);
                f2179d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2180e);
    }

    /* renamed from: a */
    private void m2807a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C0487v.m2305u(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2177b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0582a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m2808a(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(AppCompatViewInflater.class.getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* renamed from: b */
    private View m2809b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.f2180e[0] = context;
            this.f2180e[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f2178c) {
                    View a2 = m2806a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                Object[] objArr = this.f2180e;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View a3 = m2806a(context, str, (String) null);
            Object[] objArr2 = this.f2180e;
            objArr2[0] = null;
            objArr2[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.f2180e;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0849k mo2426a(Context context, AttributeSet attributeSet) {
        return new C0849k(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo2427a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo2428a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m2805a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0818bb.m4769a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo2440m(context2, attributeSet);
                break;
            case 1:
                view2 = mo2434g(context2, attributeSet);
                break;
            case 2:
                view2 = mo2429b(context2, attributeSet);
                break;
            case 3:
                view2 = mo2432e(context2, attributeSet);
                break;
            case 4:
                view2 = mo2439l(context2, attributeSet);
                break;
            case 5:
                view2 = mo2433f(context2, attributeSet);
                break;
            case 6:
                view2 = mo2430c(context2, attributeSet);
                break;
            case 7:
                view2 = mo2436i(context2, attributeSet);
                break;
            case 8:
                view2 = mo2431d(context2, attributeSet);
                break;
            case 9:
                view2 = mo2426a(context2, attributeSet);
                break;
            case 10:
                view2 = mo2435h(context2, attributeSet);
                break;
            case 11:
                view2 = mo2437j(context2, attributeSet);
                break;
            case 12:
                view2 = mo2438k(context2, attributeSet);
                break;
            default:
                view2 = mo2427a(context2, str, attributeSet);
                break;
        }
        m2808a(view2, str);
        if (view2 == null && context != context2) {
            view2 = m2809b(context2, str, attributeSet);
        }
        if (view2 != null) {
            m2807a(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0858m mo2429b(Context context, AttributeSet attributeSet) {
        return new C0858m(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AppCompatCheckBox mo2430c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0863n mo2431d(Context context, AttributeSet attributeSet) {
        return new C0863n(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0878q mo2432e(Context context, AttributeSet attributeSet) {
        return new C0878q(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0885s mo2433f(Context context, AttributeSet attributeSet) {
        return new C0885s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AppCompatImageView mo2434g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0895u mo2435h(Context context, AttributeSet attributeSet) {
        return new C0895u(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AppCompatRadioButton mo2436i(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0909x mo2437j(Context context, AttributeSet attributeSet) {
        return new C0909x(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0912y mo2438k(Context context, AttributeSet attributeSet) {
        return new C0912y(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0701B mo2439l(Context context, AttributeSet attributeSet) {
        return new C0701B(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0721I mo2440m(Context context, AttributeSet attributeSet) {
        return new C0721I(context, attributeSet);
    }
}
