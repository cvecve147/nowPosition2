package p013b.p018b.p040i.p050h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.p007v4.view.C0463e;
import android.support.p007v4.view.C0471i;
import android.support.p011v7.view.menu.C0668p;
import android.support.p011v7.view.menu.C0669q;
import android.support.p011v7.widget.C0831fa;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p013b.p018b.p028h.p033c.p034a.C1049a;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: b.b.i.h.g */
public class C1143g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f4150a = {Context.class};

    /* renamed from: b */
    static final Class<?>[] f4151b = f4150a;

    /* renamed from: c */
    final Object[] f4152c;

    /* renamed from: d */
    final Object[] f4153d = this.f4152c;

    /* renamed from: e */
    Context f4154e;

    /* renamed from: f */
    private Object f4155f;

    /* renamed from: b.b.i.h.g$a */
    private static class C1144a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f4156a = {MenuItem.class};

        /* renamed from: b */
        private Object f4157b;

        /* renamed from: c */
        private Method f4158c;

        public C1144a(Object obj, String str) {
            this.f4157b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f4158c = cls.getMethod(str, f4156a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f4158c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f4158c.invoke(this.f4157b, new Object[]{menuItem})).booleanValue();
                }
                this.f4158c.invoke(this.f4157b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b.b.i.h.g$b */
    private class C1145b {

        /* renamed from: A */
        C0463e f4159A;

        /* renamed from: B */
        private CharSequence f4160B;

        /* renamed from: C */
        private CharSequence f4161C;

        /* renamed from: D */
        private ColorStateList f4162D = null;

        /* renamed from: E */
        private PorterDuff.Mode f4163E = null;

        /* renamed from: a */
        private Menu f4165a;

        /* renamed from: b */
        private int f4166b;

        /* renamed from: c */
        private int f4167c;

        /* renamed from: d */
        private int f4168d;

        /* renamed from: e */
        private int f4169e;

        /* renamed from: f */
        private boolean f4170f;

        /* renamed from: g */
        private boolean f4171g;

        /* renamed from: h */
        private boolean f4172h;

        /* renamed from: i */
        private int f4173i;

        /* renamed from: j */
        private int f4174j;

        /* renamed from: k */
        private CharSequence f4175k;

        /* renamed from: l */
        private CharSequence f4176l;

        /* renamed from: m */
        private int f4177m;

        /* renamed from: n */
        private char f4178n;

        /* renamed from: o */
        private int f4179o;

        /* renamed from: p */
        private char f4180p;

        /* renamed from: q */
        private int f4181q;

        /* renamed from: r */
        private int f4182r;

        /* renamed from: s */
        private boolean f4183s;

        /* renamed from: t */
        private boolean f4184t;

        /* renamed from: u */
        private boolean f4185u;

        /* renamed from: v */
        private int f4186v;

        /* renamed from: w */
        private int f4187w;

        /* renamed from: x */
        private String f4188x;

        /* renamed from: y */
        private String f4189y;

        /* renamed from: z */
        private String f4190z;

        public C1145b(Menu menu) {
            this.f4165a = menu;
            mo5351d();
        }

        /* renamed from: a */
        private char m5819a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m5820a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C1143g.this.f4154e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: a */
        private void m5821a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f4183s).setVisible(this.f4184t).setEnabled(this.f4185u).setCheckable(this.f4182r >= 1).setTitleCondensed(this.f4176l).setIcon(this.f4177m);
            int i = this.f4186v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f4190z != null) {
                if (!C1143g.this.f4154e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C1144a(C1143g.this.mo5343a(), this.f4190z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0668p;
            if (z2) {
                C0668p pVar = (C0668p) menuItem;
            }
            if (this.f4182r >= 2) {
                if (z2) {
                    ((C0668p) menuItem).mo2922c(true);
                } else if (menuItem instanceof C0669q) {
                    ((C0669q) menuItem).mo2971a(true);
                }
            }
            String str = this.f4188x;
            if (str != null) {
                menuItem.setActionView((View) m5820a(str, C1143g.f4150a, C1143g.this.f4152c));
                z = true;
            }
            int i2 = this.f4187w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0463e eVar = this.f4159A;
            if (eVar != null) {
                C0471i.m2181a(menuItem, eVar);
            }
            C0471i.m2185a(menuItem, this.f4160B);
            C0471i.m2187b(menuItem, this.f4161C);
            C0471i.m2182a(menuItem, this.f4178n, this.f4179o);
            C0471i.m2186b(menuItem, this.f4180p, this.f4181q);
            PorterDuff.Mode mode = this.f4163E;
            if (mode != null) {
                C0471i.m2184a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f4162D;
            if (colorStateList != null) {
                C0471i.m2183a(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo5346a() {
            this.f4172h = true;
            m5821a(this.f4165a.add(this.f4166b, this.f4173i, this.f4174j, this.f4175k));
        }

        /* renamed from: a */
        public void mo5347a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1143g.this.f4154e.obtainStyledAttributes(attributeSet, C1112j.MenuGroup);
            this.f4166b = obtainStyledAttributes.getResourceId(C1112j.MenuGroup_android_id, 0);
            this.f4167c = obtainStyledAttributes.getInt(C1112j.MenuGroup_android_menuCategory, 0);
            this.f4168d = obtainStyledAttributes.getInt(C1112j.MenuGroup_android_orderInCategory, 0);
            this.f4169e = obtainStyledAttributes.getInt(C1112j.MenuGroup_android_checkableBehavior, 0);
            this.f4170f = obtainStyledAttributes.getBoolean(C1112j.MenuGroup_android_visible, true);
            this.f4171g = obtainStyledAttributes.getBoolean(C1112j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public SubMenu mo5348b() {
            this.f4172h = true;
            SubMenu addSubMenu = this.f4165a.addSubMenu(this.f4166b, this.f4173i, this.f4174j, this.f4175k);
            m5821a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: b */
        public void mo5349b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1143g.this.f4154e.obtainStyledAttributes(attributeSet, C1112j.MenuItem);
            this.f4173i = obtainStyledAttributes.getResourceId(C1112j.MenuItem_android_id, 0);
            this.f4174j = (obtainStyledAttributes.getInt(C1112j.MenuItem_android_menuCategory, this.f4167c) & -65536) | (obtainStyledAttributes.getInt(C1112j.MenuItem_android_orderInCategory, this.f4168d) & 65535);
            this.f4175k = obtainStyledAttributes.getText(C1112j.MenuItem_android_title);
            this.f4176l = obtainStyledAttributes.getText(C1112j.MenuItem_android_titleCondensed);
            this.f4177m = obtainStyledAttributes.getResourceId(C1112j.MenuItem_android_icon, 0);
            this.f4178n = m5819a(obtainStyledAttributes.getString(C1112j.MenuItem_android_alphabeticShortcut));
            this.f4179o = obtainStyledAttributes.getInt(C1112j.MenuItem_alphabeticModifiers, SVGParser.ENTITY_WATCH_BUFFER_SIZE);
            this.f4180p = m5819a(obtainStyledAttributes.getString(C1112j.MenuItem_android_numericShortcut));
            this.f4181q = obtainStyledAttributes.getInt(C1112j.MenuItem_numericModifiers, SVGParser.ENTITY_WATCH_BUFFER_SIZE);
            this.f4182r = obtainStyledAttributes.hasValue(C1112j.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(C1112j.MenuItem_android_checkable, false) : this.f4169e;
            this.f4183s = obtainStyledAttributes.getBoolean(C1112j.MenuItem_android_checked, false);
            this.f4184t = obtainStyledAttributes.getBoolean(C1112j.MenuItem_android_visible, this.f4170f);
            this.f4185u = obtainStyledAttributes.getBoolean(C1112j.MenuItem_android_enabled, this.f4171g);
            this.f4186v = obtainStyledAttributes.getInt(C1112j.MenuItem_showAsAction, -1);
            this.f4190z = obtainStyledAttributes.getString(C1112j.MenuItem_android_onClick);
            this.f4187w = obtainStyledAttributes.getResourceId(C1112j.MenuItem_actionLayout, 0);
            this.f4188x = obtainStyledAttributes.getString(C1112j.MenuItem_actionViewClass);
            this.f4189y = obtainStyledAttributes.getString(C1112j.MenuItem_actionProviderClass);
            boolean z = this.f4189y != null;
            if (z && this.f4187w == 0 && this.f4188x == null) {
                this.f4159A = (C0463e) m5820a(this.f4189y, C1143g.f4151b, C1143g.this.f4153d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f4159A = null;
            }
            this.f4160B = obtainStyledAttributes.getText(C1112j.MenuItem_contentDescription);
            this.f4161C = obtainStyledAttributes.getText(C1112j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C1112j.MenuItem_iconTintMode)) {
                this.f4163E = C0831fa.m4812a(obtainStyledAttributes.getInt(C1112j.MenuItem_iconTintMode, -1), this.f4163E);
            } else {
                this.f4163E = null;
            }
            if (obtainStyledAttributes.hasValue(C1112j.MenuItem_iconTint)) {
                this.f4162D = obtainStyledAttributes.getColorStateList(C1112j.MenuItem_iconTint);
            } else {
                this.f4162D = null;
            }
            obtainStyledAttributes.recycle();
            this.f4172h = false;
        }

        /* renamed from: c */
        public boolean mo5350c() {
            return this.f4172h;
        }

        /* renamed from: d */
        public void mo5351d() {
            this.f4166b = 0;
            this.f4167c = 0;
            this.f4168d = 0;
            this.f4169e = 0;
            this.f4170f = true;
            this.f4171g = true;
        }
    }

    public C1143g(Context context) {
        super(context);
        this.f4154e = context;
        this.f4152c = new Object[]{context};
    }

    /* renamed from: a */
    private Object m5816a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m5816a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: a */
    private void m5817a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C1145b bVar = new C1145b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo5351d();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo5350c()) {
                                C0463e eVar = bVar.f4159A;
                                if (eVar == null || !eVar.mo1937a()) {
                                    bVar.mo5346a();
                                } else {
                                    bVar.mo5348b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo5347a(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo5349b(attributeSet);
                    } else if (name3.equals("menu")) {
                        m5817a(xmlPullParser, attributeSet, bVar.mo5348b());
                    } else {
                        z2 = true;
                        str = name3;
                    }
                }
                i = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo5343a() {
        if (this.f4155f == null) {
            this.f4155f = m5816a(this.f4154e);
        }
        return this.f4155f;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C1049a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f4154e.getResources().getLayout(i);
            m5817a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
