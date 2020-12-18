package android.support.p007v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.o */
public class C0558o {

    /* renamed from: a */
    static final C0560b f2069a = (Build.VERSION.SDK_INT >= 21 ? new C0561c() : new C0559a());

    /* renamed from: android.support.v4.widget.o$a */
    static class C0559a implements C0560b {
        C0559a() {
        }

        /* renamed from: a */
        public PorterDuff.Mode mo2386a(ImageView imageView) {
            if (imageView instanceof C0522F) {
                return ((C0522F) imageView).getSupportImageTintMode();
            }
            return null;
        }

        /* renamed from: a */
        public void mo2387a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof C0522F) {
                ((C0522F) imageView).setSupportImageTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo2388a(ImageView imageView, PorterDuff.Mode mode) {
            if (imageView instanceof C0522F) {
                ((C0522F) imageView).setSupportImageTintMode(mode);
            }
        }

        /* renamed from: b */
        public ColorStateList mo2389b(ImageView imageView) {
            if (imageView instanceof C0522F) {
                return ((C0522F) imageView).getSupportImageTintList();
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.widget.o$b */
    interface C0560b {
        /* renamed from: a */
        PorterDuff.Mode mo2386a(ImageView imageView);

        /* renamed from: a */
        void mo2387a(ImageView imageView, ColorStateList colorStateList);

        /* renamed from: a */
        void mo2388a(ImageView imageView, PorterDuff.Mode mode);

        /* renamed from: b */
        ColorStateList mo2389b(ImageView imageView);
    }

    /* renamed from: android.support.v4.widget.o$c */
    static class C0561c extends C0559a {
        C0561c() {
        }

        /* renamed from: a */
        public PorterDuff.Mode mo2386a(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: a */
        public void mo2387a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        /* renamed from: a */
        public void mo2388a(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        /* renamed from: b */
        public ColorStateList mo2389b(ImageView imageView) {
            return imageView.getImageTintList();
        }
    }

    /* renamed from: a */
    public static ColorStateList m2742a(ImageView imageView) {
        return f2069a.mo2389b(imageView);
    }

    /* renamed from: a */
    public static void m2743a(ImageView imageView, ColorStateList colorStateList) {
        f2069a.mo2387a(imageView, colorStateList);
    }

    /* renamed from: a */
    public static void m2744a(ImageView imageView, PorterDuff.Mode mode) {
        f2069a.mo2388a(imageView, mode);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m2745b(ImageView imageView) {
        return f2069a.mo2386a(imageView);
    }
}
