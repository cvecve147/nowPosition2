package p101d.p108c.p109a;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.p011v7.widget.RecyclerView;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.C1155a;
import com.afollestad.materialdialogs.internal.C1160f;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.util.ArrayList;
import java.util.Arrays;
import p101d.p108c.p109a.C5197l;
import p101d.p108c.p109a.p110a.C5182c;

/* renamed from: d.c.a.e */
class C5190e {
    /* renamed from: a */
    static int m20069a(C5197l.C5198a aVar) {
        return aVar.f14675p != null ? C5213r.md_dialog_custom : (aVar.f14667l == null && aVar.f14639U == null) ? aVar.f14660ha > -2 ? C5213r.md_dialog_progress : aVar.f14656fa ? aVar.f14694ya ? C5213r.md_dialog_progress_indeterminate_horizontal : C5213r.md_dialog_progress_indeterminate : aVar.f14668la != null ? aVar.f14684ta != null ? C5213r.md_dialog_input_check : C5213r.md_dialog_input : aVar.f14684ta != null ? C5213r.md_dialog_basic_check : C5213r.md_dialog_basic : aVar.f14684ta != null ? C5213r.md_dialog_list_check : C5213r.md_dialog_list;
    }

    /* renamed from: a */
    private static void m20070a(ProgressBar progressBar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 11 && i < 18 && progressBar.isHardwareAccelerated() && progressBar.getLayerType() != 1) {
            progressBar.setLayerType(1, (Paint) null);
        }
    }

    /* renamed from: a */
    public static void m20071a(C5197l lVar) {
        boolean z;
        C5197l.C5206i iVar;
        C5197l.C5198a aVar = lVar.f14601p;
        lVar.setCancelable(aVar.f14623I);
        lVar.setCanceledOnTouchOutside(aVar.f14625J);
        if (aVar.f14652da == 0) {
            aVar.f14652da = C5182c.m20035a(aVar.f14645a, C5208m.md_background_color, C5182c.m20050d(lVar.getContext(), C5208m.colorBackgroundFloating));
        }
        if (aVar.f14652da != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(aVar.f14645a.getResources().getDimension(C5210o.md_bg_corner_radius));
            gradientDrawable.setColor(aVar.f14652da);
            lVar.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!aVar.f14612Ca) {
            aVar.f14681s = C5182c.m20038a(aVar.f14645a, C5208m.md_positive_color, aVar.f14681s);
        }
        if (!aVar.f14614Da) {
            aVar.f14685u = C5182c.m20038a(aVar.f14645a, C5208m.md_neutral_color, aVar.f14685u);
        }
        if (!aVar.f14616Ea) {
            aVar.f14683t = C5182c.m20038a(aVar.f14645a, C5208m.md_negative_color, aVar.f14683t);
        }
        if (!aVar.f14618Fa) {
            aVar.f14677q = C5182c.m20035a(aVar.f14645a, C5208m.md_widget_color, aVar.f14677q);
        }
        if (!aVar.f14696za) {
            aVar.f14661i = C5182c.m20035a(aVar.f14645a, C5208m.md_title_color, C5182c.m20050d(lVar.getContext(), 16842806));
        }
        if (!aVar.f14608Aa) {
            aVar.f14663j = C5182c.m20035a(aVar.f14645a, C5208m.md_content_color, C5182c.m20050d(lVar.getContext(), 16842808));
        }
        if (!aVar.f14610Ba) {
            aVar.f14654ea = C5182c.m20035a(aVar.f14645a, C5208m.md_item_color, aVar.f14663j);
        }
        lVar.f14603r = (TextView) lVar.f14574a.findViewById(C5212q.md_title);
        lVar.f14602q = (ImageView) lVar.f14574a.findViewById(C5212q.md_icon);
        lVar.f14589d = lVar.f14574a.findViewById(C5212q.md_titleFrame);
        lVar.f14604s = (TextView) lVar.f14574a.findViewById(C5212q.md_content);
        lVar.f14588c = (RecyclerView) lVar.f14574a.findViewById(C5212q.md_contentRecyclerView);
        lVar.f14595j = (CheckBox) lVar.f14574a.findViewById(C5212q.md_promptCheckbox);
        lVar.f14596k = (MDButton) lVar.f14574a.findViewById(C5212q.md_buttonDefaultPositive);
        lVar.f14597l = (MDButton) lVar.f14574a.findViewById(C5212q.md_buttonDefaultNeutral);
        lVar.f14598m = (MDButton) lVar.f14574a.findViewById(C5212q.md_buttonDefaultNegative);
        if (aVar.f14668la != null && aVar.f14669m == null) {
            aVar.f14669m = aVar.f14645a.getText(17039370);
        }
        lVar.f14596k.setVisibility(aVar.f14669m != null ? 0 : 8);
        lVar.f14597l.setVisibility(aVar.f14671n != null ? 0 : 8);
        lVar.f14598m.setVisibility(aVar.f14673o != null ? 0 : 8);
        if (aVar.f14636R != null) {
            lVar.f14602q.setVisibility(0);
            lVar.f14602q.setImageDrawable(aVar.f14636R);
        } else {
            Drawable f = C5182c.m20052f(aVar.f14645a, C5208m.md_icon);
            if (f != null) {
                lVar.f14602q.setVisibility(0);
                lVar.f14602q.setImageDrawable(f);
            } else {
                lVar.f14602q.setVisibility(8);
            }
        }
        int i = aVar.f14638T;
        if (i == -1) {
            i = C5182c.m20051e(aVar.f14645a, C5208m.md_icon_max_size);
        }
        if (aVar.f14637S || C5182c.m20049c(aVar.f14645a, C5208m.md_icon_limit_icon_to_default_size)) {
            i = aVar.f14645a.getResources().getDimensionPixelSize(C5210o.md_icon_max_size);
        }
        if (i > -1) {
            lVar.f14602q.setAdjustViewBounds(true);
            lVar.f14602q.setMaxHeight(i);
            lVar.f14602q.setMaxWidth(i);
            lVar.f14602q.requestLayout();
        }
        if (!aVar.f14620Ga) {
            aVar.f14650ca = C5182c.m20035a(aVar.f14645a, C5208m.md_divider_color, C5182c.m20050d(lVar.getContext(), C5208m.md_divider));
        }
        lVar.f14574a.setDividerColor(aVar.f14650ca);
        TextView textView = lVar.f14603r;
        if (textView != null) {
            lVar.mo14365a(textView, aVar.f14635Q);
            lVar.f14603r.setTextColor(aVar.f14661i);
            lVar.f14603r.setGravity(aVar.f14649c.mo14355a());
            if (Build.VERSION.SDK_INT >= 17) {
                lVar.f14603r.setTextAlignment(aVar.f14649c.mo14356b());
            }
            CharSequence charSequence = aVar.f14647b;
            if (charSequence == null) {
                lVar.f14589d.setVisibility(8);
            } else {
                lVar.f14603r.setText(charSequence);
                lVar.f14589d.setVisibility(0);
            }
        }
        TextView textView2 = lVar.f14604s;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            lVar.mo14365a(lVar.f14604s, aVar.f14634P);
            lVar.f14604s.setLineSpacing(0.0f, aVar.f14627K);
            ColorStateList colorStateList = aVar.f14687v;
            if (colorStateList == null) {
                lVar.f14604s.setLinkTextColor(C5182c.m20050d(lVar.getContext(), 16842806));
            } else {
                lVar.f14604s.setLinkTextColor(colorStateList);
            }
            lVar.f14604s.setTextColor(aVar.f14663j);
            lVar.f14604s.setGravity(aVar.f14651d.mo14355a());
            if (Build.VERSION.SDK_INT >= 17) {
                lVar.f14604s.setTextAlignment(aVar.f14651d.mo14356b());
            }
            CharSequence charSequence2 = aVar.f14665k;
            if (charSequence2 != null) {
                lVar.f14604s.setText(charSequence2);
                lVar.f14604s.setVisibility(0);
            } else {
                lVar.f14604s.setVisibility(8);
            }
        }
        CheckBox checkBox = lVar.f14595j;
        if (checkBox != null) {
            checkBox.setText(aVar.f14684ta);
            lVar.f14595j.setChecked(aVar.f14686ua);
            lVar.f14595j.setOnCheckedChangeListener(aVar.f14688va);
            lVar.mo14365a((TextView) lVar.f14595j, aVar.f14634P);
            lVar.f14595j.setTextColor(aVar.f14663j);
            C1160f.m5881a(lVar.f14595j, aVar.f14677q);
        }
        lVar.f14574a.setButtonGravity(aVar.f14657g);
        lVar.f14574a.setButtonStackedGravity(aVar.f14653e);
        lVar.f14574a.setStackingBehavior(aVar.f14646aa);
        if (Build.VERSION.SDK_INT < 14 || (z = C5182c.m20044a(aVar.f14645a, 16843660, true))) {
            z = C5182c.m20044a(aVar.f14645a, C5208m.textAllCaps, true);
        }
        MDButton mDButton = lVar.f14596k;
        lVar.mo14365a((TextView) mDButton, aVar.f14635Q);
        mDButton.setAllCapsCompat(z);
        mDButton.setText(aVar.f14669m);
        mDButton.setTextColor(aVar.f14681s);
        lVar.f14596k.setStackedSelector(lVar.mo14362a(C5188c.POSITIVE, true));
        lVar.f14596k.setDefaultSelector(lVar.mo14362a(C5188c.POSITIVE, false));
        lVar.f14596k.setTag(C5188c.POSITIVE);
        lVar.f14596k.setOnClickListener(lVar);
        lVar.f14596k.setVisibility(0);
        MDButton mDButton2 = lVar.f14598m;
        lVar.mo14365a((TextView) mDButton2, aVar.f14635Q);
        mDButton2.setAllCapsCompat(z);
        mDButton2.setText(aVar.f14673o);
        mDButton2.setTextColor(aVar.f14683t);
        lVar.f14598m.setStackedSelector(lVar.mo14362a(C5188c.NEGATIVE, true));
        lVar.f14598m.setDefaultSelector(lVar.mo14362a(C5188c.NEGATIVE, false));
        lVar.f14598m.setTag(C5188c.NEGATIVE);
        lVar.f14598m.setOnClickListener(lVar);
        lVar.f14598m.setVisibility(0);
        MDButton mDButton3 = lVar.f14597l;
        lVar.mo14365a((TextView) mDButton3, aVar.f14635Q);
        mDButton3.setAllCapsCompat(z);
        mDButton3.setText(aVar.f14671n);
        mDButton3.setTextColor(aVar.f14685u);
        lVar.f14597l.setStackedSelector(lVar.mo14362a(C5188c.NEUTRAL, true));
        lVar.f14597l.setDefaultSelector(lVar.mo14362a(C5188c.NEUTRAL, false));
        lVar.f14597l.setTag(C5188c.NEUTRAL);
        lVar.f14597l.setOnClickListener(lVar);
        lVar.f14597l.setVisibility(0);
        if (aVar.f14615E != null) {
            lVar.f14600o = new ArrayList();
        }
        if (lVar.f14588c != null) {
            RecyclerView.C0748a<?> aVar2 = aVar.f14639U;
            if (aVar2 == null) {
                if (aVar.f14613D != null) {
                    iVar = C5197l.C5206i.SINGLE;
                } else if (aVar.f14615E != null) {
                    lVar.f14599n = C5197l.C5206i.MULTI;
                    Integer[] numArr = aVar.f14631M;
                    if (numArr != null) {
                        lVar.f14600o = new ArrayList(Arrays.asList(numArr));
                        aVar.f14631M = null;
                    }
                    aVar.f14639U = new C5185b(lVar, C5197l.C5206i.m20124a(lVar.f14599n));
                } else {
                    iVar = C5197l.C5206i.REGULAR;
                }
                lVar.f14599n = iVar;
                aVar.f14639U = new C5185b(lVar, C5197l.C5206i.m20124a(lVar.f14599n));
            } else if (aVar2 instanceof C1155a) {
                ((C1155a) aVar2).mo5395a(lVar);
            }
        }
        m20074c(lVar);
        m20073b(lVar);
        if (aVar.f14675p != null) {
            ((MDRootLayout) lVar.f14574a.findViewById(C5212q.md_root)).mo5385a();
            FrameLayout frameLayout = (FrameLayout) lVar.f14574a.findViewById(C5212q.md_customViewFrame);
            lVar.f14590e = frameLayout;
            View view = aVar.f14675p;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (aVar.f14648ba) {
                Resources resources = lVar.getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C5210o.md_dialog_frame_margin);
                ScrollView scrollView = new ScrollView(lVar.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C5210o.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(C5210o.md_content_padding_bottom);
                scrollView.setClipToPadding(false);
                if (view instanceof EditText) {
                    scrollView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                } else {
                    scrollView.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
                scrollView.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = scrollView;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = aVar.f14644Z;
        if (onShowListener != null) {
            lVar.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = aVar.f14642X;
        if (onCancelListener != null) {
            lVar.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = aVar.f14641W;
        if (onDismissListener != null) {
            lVar.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = aVar.f14643Y;
        if (onKeyListener != null) {
            lVar.setOnKeyListener(onKeyListener);
        }
        lVar.mo14347a();
        lVar.mo14372g();
        lVar.mo14348a(lVar.f14574a);
        lVar.mo14366b();
        Display defaultDisplay = lVar.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i2 = point.x;
        int i3 = point.y;
        int dimensionPixelSize4 = aVar.f14645a.getResources().getDimensionPixelSize(C5210o.md_dialog_vertical_margin);
        int dimensionPixelSize5 = aVar.f14645a.getResources().getDimensionPixelSize(C5210o.md_dialog_horizontal_margin);
        lVar.f14574a.setMaxHeight(i3 - (dimensionPixelSize4 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(lVar.getWindow().getAttributes());
        layoutParams.width = Math.min(aVar.f14645a.getResources().getDimensionPixelSize(C5210o.md_dialog_max_width), i2 - (dimensionPixelSize5 * 2));
        lVar.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: b */
    static int m20072b(C5197l.C5198a aVar) {
        boolean a = C5182c.m20044a(aVar.f14645a, C5208m.md_dark_theme, aVar.f14621H == C5217v.DARK);
        aVar.f14621H = a ? C5217v.DARK : C5217v.LIGHT;
        return a ? C5214s.MD_Dark : C5214s.MD_Light;
    }

    /* renamed from: b */
    private static void m20073b(C5197l lVar) {
        C5197l.C5198a aVar = lVar.f14601p;
        lVar.f14605t = (EditText) lVar.f14574a.findViewById(16908297);
        EditText editText = lVar.f14605t;
        if (editText != null) {
            lVar.mo14365a((TextView) editText, aVar.f14634P);
            CharSequence charSequence = aVar.f14664ja;
            if (charSequence != null) {
                lVar.f14605t.setText(charSequence);
            }
            lVar.mo14373h();
            lVar.f14605t.setHint(aVar.f14666ka);
            lVar.f14605t.setSingleLine();
            lVar.f14605t.setTextColor(aVar.f14663j);
            lVar.f14605t.setHintTextColor(C5182c.m20033a(aVar.f14663j, 0.3f));
            C1160f.m5883a(lVar.f14605t, lVar.f14601p.f14677q);
            int i = aVar.f14672na;
            if (i != -1) {
                lVar.f14605t.setInputType(i);
                int i2 = aVar.f14672na;
                if (i2 != 144 && (i2 & 128) == 128) {
                    lVar.f14605t.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            lVar.f14594i = (TextView) lVar.f14574a.findViewById(C5212q.md_minMax);
            if (aVar.f14676pa > 0 || aVar.f14678qa > -1) {
                lVar.mo14364a(lVar.f14605t.getText().toString().length(), !aVar.f14670ma);
                return;
            }
            lVar.f14594i.setVisibility(8);
            lVar.f14594i = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: me.zhanghai.android.materialprogressbar.IndeterminateProgressDrawable} */
    /* JADX WARNING: type inference failed for: r1v31, types: [me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m20074c(p101d.p108c.p109a.C5197l r7) {
        /*
            d.c.a.l$a r0 = r7.f14601p
            boolean r1 = r0.f14656fa
            if (r1 != 0) goto L_0x000b
            int r1 = r0.f14660ha
            r2 = -2
            if (r1 <= r2) goto L_0x0109
        L_0x000b:
            com.afollestad.materialdialogs.internal.MDRootLayout r1 = r7.f14574a
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r7.f14591f = r1
            android.widget.ProgressBar r1 = r7.f14591f
            if (r1 != 0) goto L_0x001d
            return
        L_0x001d:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 14
            if (r2 < r3) goto L_0x005d
            boolean r1 = r0.f14656fa
            if (r1 == 0) goto L_0x0044
            boolean r1 = r0.f14694ya
            if (r1 == 0) goto L_0x0035
            me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable r1 = new me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable
            android.content.Context r2 = r0.mo14388b()
            r1.<init>(r2)
            goto L_0x003e
        L_0x0035:
            me.zhanghai.android.materialprogressbar.IndeterminateProgressDrawable r1 = new me.zhanghai.android.materialprogressbar.IndeterminateProgressDrawable
            android.content.Context r2 = r0.mo14388b()
            r1.<init>(r2)
        L_0x003e:
            int r2 = r0.f14677q
            r1.setTint(r2)
            goto L_0x0052
        L_0x0044:
            me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable r1 = new me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable
            android.content.Context r2 = r0.mo14388b()
            r1.<init>(r2)
            int r2 = r0.f14677q
            r1.setTint(r2)
        L_0x0052:
            android.widget.ProgressBar r2 = r7.f14591f
            r2.setProgressDrawable(r1)
            android.widget.ProgressBar r2 = r7.f14591f
            r2.setIndeterminateDrawable(r1)
            goto L_0x0062
        L_0x005d:
            int r2 = r0.f14677q
            com.afollestad.materialdialogs.internal.C1160f.m5884a((android.widget.ProgressBar) r1, (int) r2)
        L_0x0062:
            boolean r1 = r0.f14656fa
            if (r1 == 0) goto L_0x006a
            boolean r1 = r0.f14694ya
            if (r1 == 0) goto L_0x0109
        L_0x006a:
            android.widget.ProgressBar r1 = r7.f14591f
            boolean r2 = r0.f14656fa
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0078
            boolean r2 = r0.f14694ya
            if (r2 == 0) goto L_0x0078
            r2 = r3
            goto L_0x0079
        L_0x0078:
            r2 = r4
        L_0x0079:
            r1.setIndeterminate(r2)
            android.widget.ProgressBar r1 = r7.f14591f
            r1.setProgress(r4)
            android.widget.ProgressBar r1 = r7.f14591f
            int r2 = r0.f14662ia
            r1.setMax(r2)
            com.afollestad.materialdialogs.internal.MDRootLayout r1 = r7.f14574a
            int r2 = p101d.p108c.p109a.C5212q.md_label
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.f14592g = r1
            android.widget.TextView r1 = r7.f14592g
            if (r1 == 0) goto L_0x00b1
            int r2 = r0.f14663j
            r1.setTextColor(r2)
            android.widget.TextView r1 = r7.f14592g
            android.graphics.Typeface r2 = r0.f14635Q
            r7.mo14365a((android.widget.TextView) r1, (android.graphics.Typeface) r2)
            android.widget.TextView r1 = r7.f14592g
            java.text.NumberFormat r2 = r0.f14692xa
            r5 = 0
            java.lang.String r2 = r2.format(r5)
            r1.setText(r2)
        L_0x00b1:
            com.afollestad.materialdialogs.internal.MDRootLayout r1 = r7.f14574a
            int r2 = p101d.p108c.p109a.C5212q.md_minMax
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.f14593h = r1
            android.widget.TextView r1 = r7.f14593h
            if (r1 == 0) goto L_0x0107
            int r2 = r0.f14663j
            r1.setTextColor(r2)
            android.widget.TextView r1 = r7.f14593h
            android.graphics.Typeface r2 = r0.f14634P
            r7.mo14365a((android.widget.TextView) r1, (android.graphics.Typeface) r2)
            boolean r1 = r0.f14658ga
            if (r1 == 0) goto L_0x00ff
            android.widget.TextView r1 = r7.f14593h
            r1.setVisibility(r4)
            android.widget.TextView r1 = r7.f14593h
            java.lang.String r2 = r0.f14690wa
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5[r4] = r6
            int r0 = r0.f14662ia
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r3] = r0
            java.lang.String r0 = java.lang.String.format(r2, r5)
            r1.setText(r0)
            android.widget.ProgressBar r0 = r7.f14591f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.leftMargin = r4
            r0.rightMargin = r4
            goto L_0x0109
        L_0x00ff:
            android.widget.TextView r0 = r7.f14593h
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0109
        L_0x0107:
            r0.f14658ga = r4
        L_0x0109:
            android.widget.ProgressBar r7 = r7.f14591f
            if (r7 == 0) goto L_0x0110
            m20070a((android.widget.ProgressBar) r7)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p108c.p109a.C5190e.m20074c(d.c.a.l):void");
    }
}
