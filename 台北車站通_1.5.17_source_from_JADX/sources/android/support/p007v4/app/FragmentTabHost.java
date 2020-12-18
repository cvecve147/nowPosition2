package android.support.p007v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.FragmentTabHost */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C0274b> f1167a = new ArrayList<>();

    /* renamed from: b */
    private FrameLayout f1168b;

    /* renamed from: c */
    private Context f1169c;

    /* renamed from: d */
    private C0350r f1170d;

    /* renamed from: e */
    private int f1171e;

    /* renamed from: f */
    private TabHost.OnTabChangeListener f1172f;

    /* renamed from: g */
    private C0274b f1173g;

    /* renamed from: h */
    private boolean f1174h;

    /* renamed from: android.support.v4.app.FragmentTabHost$SavedState */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0269C();

        /* renamed from: a */
        String f1175a;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1175a = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f1175a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1175a);
        }
    }

    /* renamed from: android.support.v4.app.FragmentTabHost$a */
    static class C0273a implements TabHost.TabContentFactory {

        /* renamed from: a */
        private final Context f1176a;

        public C0273a(Context context) {
            this.f1176a = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.f1176a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: android.support.v4.app.FragmentTabHost$b */
    static final class C0274b {

        /* renamed from: a */
        final String f1177a;

        /* renamed from: b */
        final Class<?> f1178b;

        /* renamed from: c */
        final Bundle f1179c;

        /* renamed from: d */
        C0339l f1180d;

        C0274b(String str, Class<?> cls, Bundle bundle) {
            this.f1177a = str;
            this.f1178b = cls;
            this.f1179c = bundle;
        }
    }

    public FragmentTabHost(Context context) {
        super(context, (AttributeSet) null);
        m1221a(context, (AttributeSet) null);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1221a(context, attributeSet);
    }

    /* renamed from: a */
    private C0270D m1217a(String str, C0270D d) {
        C0339l lVar;
        C0274b a = m1218a(str);
        if (this.f1173g != a) {
            if (d == null) {
                d = this.f1170d.mo1494a();
            }
            C0274b bVar = this.f1173g;
            if (!(bVar == null || (lVar = bVar.f1180d) == null)) {
                d.mo1129b(lVar);
            }
            if (a != null) {
                C0339l lVar2 = a.f1180d;
                if (lVar2 == null) {
                    a.f1180d = C0339l.m1487a(this.f1169c, a.f1178b.getName(), a.f1179c);
                    d.mo1124a(this.f1171e, a.f1180d, a.f1177a);
                } else {
                    d.mo1125a(lVar2);
                }
            }
            this.f1173g = a;
        }
        return d;
    }

    /* renamed from: a */
    private C0274b m1218a(String str) {
        int size = this.f1167a.size();
        for (int i = 0; i < size; i++) {
            C0274b bVar = this.f1167a.get(i);
            if (bVar.f1177a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m1219a() {
        if (this.f1168b == null) {
            this.f1168b = (FrameLayout) findViewById(this.f1171e);
            if (this.f1168b == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f1171e);
            }
        }
    }

    /* renamed from: a */
    private void m1220a(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f1168b = frameLayout2;
            this.f1168b.setId(this.f1171e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    /* renamed from: a */
    private void m1221a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f1171e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* renamed from: a */
    public void mo1138a(Context context, C0350r rVar, int i) {
        m1220a(context);
        super.setup();
        this.f1169c = context;
        this.f1170d = rVar;
        this.f1171e = i;
        m1219a();
        this.f1168b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    /* renamed from: a */
    public void mo1139a(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new C0273a(this.f1169c));
        String tag = tabSpec.getTag();
        C0274b bVar = new C0274b(tag, cls, bundle);
        if (this.f1174h) {
            bVar.f1180d = this.f1170d.mo1495a(tag);
            C0339l lVar = bVar.f1180d;
            if (lVar != null && !lVar.mo1317D()) {
                C0270D a = this.f1170d.mo1494a();
                a.mo1129b(bVar.f1180d);
                a.mo1122a();
            }
        }
        this.f1167a.add(bVar);
        addTab(tabSpec);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f1167a.size();
        C0270D d = null;
        for (int i = 0; i < size; i++) {
            C0274b bVar = this.f1167a.get(i);
            bVar.f1180d = this.f1170d.mo1495a(bVar.f1177a);
            C0339l lVar = bVar.f1180d;
            if (lVar != null && !lVar.mo1317D()) {
                if (bVar.f1177a.equals(currentTabTag)) {
                    this.f1173g = bVar;
                } else {
                    if (d == null) {
                        d = this.f1170d.mo1494a();
                    }
                    d.mo1129b(bVar.f1180d);
                }
            }
        }
        this.f1174h = true;
        C0270D a = m1217a(currentTabTag, d);
        if (a != null) {
            a.mo1122a();
            this.f1170d.mo1498b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1174h = false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f1175a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1175a = getCurrentTabTag();
        return savedState;
    }

    public void onTabChanged(String str) {
        C0270D a;
        if (this.f1174h && (a = m1217a(str, (C0270D) null)) != null) {
            a.mo1122a();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f1172f;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f1172f = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
