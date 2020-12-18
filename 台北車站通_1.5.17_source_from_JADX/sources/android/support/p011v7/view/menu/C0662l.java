package android.support.p011v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p033c.p034a.C1049a;
import p013b.p018b.p040i.p041a.C1104b;

/* renamed from: android.support.v7.view.menu.l */
public class C0662l implements C1049a {

    /* renamed from: a */
    private static final int[] f2532a = {1, 4, 5, 3, 2, 0};

    /* renamed from: b */
    private final Context f2533b;

    /* renamed from: c */
    private final Resources f2534c;

    /* renamed from: d */
    private boolean f2535d;

    /* renamed from: e */
    private boolean f2536e;

    /* renamed from: f */
    private C0663a f2537f;

    /* renamed from: g */
    private ArrayList<C0668p> f2538g;

    /* renamed from: h */
    private ArrayList<C0668p> f2539h;

    /* renamed from: i */
    private boolean f2540i;

    /* renamed from: j */
    private ArrayList<C0668p> f2541j;

    /* renamed from: k */
    private ArrayList<C0668p> f2542k;

    /* renamed from: l */
    private boolean f2543l;

    /* renamed from: m */
    private int f2544m = 0;

    /* renamed from: n */
    private ContextMenu.ContextMenuInfo f2545n;

    /* renamed from: o */
    CharSequence f2546o;

    /* renamed from: p */
    Drawable f2547p;

    /* renamed from: q */
    View f2548q;

    /* renamed from: r */
    private boolean f2549r = false;

    /* renamed from: s */
    private boolean f2550s = false;

    /* renamed from: t */
    private boolean f2551t = false;

    /* renamed from: u */
    private boolean f2552u = false;

    /* renamed from: v */
    private boolean f2553v = false;

    /* renamed from: w */
    private ArrayList<C0668p> f2554w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0679v>> f2555x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private C0668p f2556y;

    /* renamed from: z */
    private boolean f2557z;

    /* renamed from: android.support.v7.view.menu.l$a */
    public interface C0663a {
        /* renamed from: a */
        void mo362a(C0662l lVar);

        /* renamed from: a */
        boolean mo363a(C0662l lVar, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.l$b */
    public interface C0664b {
        /* renamed from: a */
        boolean mo2736a(C0668p pVar);
    }

    public C0662l(Context context) {
        this.f2533b = context;
        this.f2534c = context.getResources();
        this.f2538g = new ArrayList<>();
        this.f2539h = new ArrayList<>();
        this.f2540i = true;
        this.f2541j = new ArrayList<>();
        this.f2542k = new ArrayList<>();
        this.f2543l = true;
        m3276e(true);
    }

    /* renamed from: a */
    private static int m3269a(ArrayList<C0668p> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo2921c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0668p m3270a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0668p(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: a */
    private void m3271a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources l = mo2898l();
        if (view != null) {
            this.f2548q = view;
            this.f2546o = null;
            this.f2547p = null;
        } else {
            if (i > 0) {
                this.f2546o = l.getText(i);
            } else if (charSequence != null) {
                this.f2546o = charSequence;
            }
            if (i2 > 0) {
                this.f2547p = C1006a.m5394c(mo2886e(), i2);
            } else if (drawable != null) {
                this.f2547p = drawable;
            }
            this.f2548q = null;
        }
        mo353b(false);
    }

    /* renamed from: a */
    private void m3272a(int i, boolean z) {
        if (i >= 0 && i < this.f2538g.size()) {
            this.f2538g.remove(i);
            if (z) {
                mo353b(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m3273a(C0647D d, C0679v vVar) {
        boolean z = false;
        if (this.f2555x.isEmpty()) {
            return false;
        }
        if (vVar != null) {
            z = vVar.mo323a(d);
        }
        Iterator<WeakReference<C0679v>> it = this.f2555x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0679v vVar2 = (C0679v) next.get();
            if (vVar2 == null) {
                this.f2555x.remove(next);
            } else if (!z) {
                z = vVar2.mo323a(d);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m3274d(boolean z) {
        if (!this.f2555x.isEmpty()) {
            mo2903r();
            Iterator<WeakReference<C0679v>> it = this.f2555x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0679v vVar = (C0679v) next.get();
                if (vVar == null) {
                    this.f2555x.remove(next);
                } else {
                    vVar.mo321a(z);
                }
            }
            mo2902q();
        }
    }

    /* renamed from: e */
    private void m3275e(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f2555x.isEmpty()) {
            Iterator<WeakReference<C0679v>> it = this.f2555x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0679v vVar = (C0679v) next.get();
                if (vVar == null) {
                    this.f2555x.remove(next);
                } else {
                    int id = vVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        vVar.mo316a(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private void m3276e(boolean z) {
        boolean z2 = true;
        if (!z || this.f2534c.getConfiguration().keyboard == 1 || !this.f2534c.getBoolean(C1104b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z2 = false;
        }
        this.f2536e = z2;
    }

    /* renamed from: f */
    private static int m3277f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f2532a;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: f */
    private void m3278f(Bundle bundle) {
        Parcelable b;
        if (!this.f2555x.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C0679v>> it = this.f2555x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0679v vVar = (C0679v) next.get();
                if (vVar == null) {
                    this.f2555x.remove(next);
                } else {
                    int id = vVar.getId();
                    if (id > 0 && (b = vVar.mo325b()) != null) {
                        sparseArray.put(id, b);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: a */
    public int mo2847a(int i) {
        return mo2848a(i, 0);
    }

    /* renamed from: a */
    public int mo2848a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f2538g.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0662l mo2849a(Drawable drawable) {
        m3271a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0662l mo2850a(View view) {
        m3271a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0662l mo2851a(CharSequence charSequence) {
        m3271a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0668p mo2852a(int i, KeyEvent keyEvent) {
        ArrayList<C0668p> arrayList = this.f2554w;
        arrayList.clear();
        mo2859a((List<C0668p>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean o = mo2715o();
        for (int i2 = 0; i2 < size; i2++) {
            C0668p pVar = arrayList.get(i2);
            char alphabeticShortcut = o ? pVar.getAlphabeticShortcut() : pVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (o && alphabeticShortcut == 8 && i == 67))) {
                return pVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo2853a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m3277f(i3);
        C0668p a = m3270a(i, i2, i3, f, charSequence, this.f2544m);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f2545n;
        if (contextMenuInfo != null) {
            a.mo2917a(contextMenuInfo);
        }
        ArrayList<C0668p> arrayList = this.f2538g;
        arrayList.add(m3269a(arrayList, f), a);
        mo353b(true);
        return a;
    }

    /* renamed from: a */
    public void mo2854a() {
        C0663a aVar = this.f2537f;
        if (aVar != null) {
            aVar.mo362a(this);
        }
    }

    /* renamed from: a */
    public void mo2855a(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo2712d());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0647D) item.getSubMenu()).mo2855a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: a */
    public void mo2708a(C0663a aVar) {
        this.f2537f = aVar;
    }

    /* renamed from: a */
    public void mo2856a(C0679v vVar) {
        mo2857a(vVar, this.f2533b);
    }

    /* renamed from: a */
    public void mo2857a(C0679v vVar, Context context) {
        this.f2555x.add(new WeakReference(vVar));
        vVar.mo313a(context, this);
        this.f2543l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2858a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2538g.size();
        mo2903r();
        for (int i = 0; i < size; i++) {
            C0668p pVar = this.f2538g.get(i);
            if (pVar.getGroupId() == groupId && pVar.mo2943i() && pVar.isCheckable()) {
                pVar.mo2920b(pVar == menuItem);
            }
        }
        mo2902q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2859a(List<C0668p> list, int i, KeyEvent keyEvent) {
        boolean o = mo2715o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f2538g.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0668p pVar = this.f2538g.get(i2);
                if (pVar.hasSubMenu()) {
                    ((C0662l) pVar.getSubMenu()).mo2859a(list, i, keyEvent);
                }
                char alphabeticShortcut = o ? pVar.getAlphabeticShortcut() : pVar.getNumericShortcut();
                if (((modifiers & 69647) == ((o ? pVar.getAlphabeticModifiers() : pVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (o && alphabeticShortcut == 8 && i == 67)) && pVar.isEnabled()) {
                        list.add(pVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2860a(boolean z) {
        if (!this.f2553v) {
            this.f2553v = true;
            Iterator<WeakReference<C0679v>> it = this.f2555x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0679v vVar = (C0679v) next.get();
                if (vVar == null) {
                    this.f2555x.remove(next);
                } else {
                    vVar.mo318a(this, z);
                }
            }
            this.f2553v = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2709a(C0662l lVar, MenuItem menuItem) {
        C0663a aVar = this.f2537f;
        return aVar != null && aVar.mo363a(lVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo2710a(C0668p pVar) {
        boolean z = false;
        if (!this.f2555x.isEmpty() && this.f2556y == pVar) {
            mo2903r();
            Iterator<WeakReference<C0679v>> it = this.f2555x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0679v vVar = (C0679v) next.get();
                if (vVar == null) {
                    this.f2555x.remove(next);
                } else {
                    z = vVar.mo329b(this, pVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo2902q();
            if (z) {
                this.f2556y = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo2861a(MenuItem menuItem, int i) {
        return mo2862a(menuItem, (C0679v) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2862a(android.view.MenuItem r7, android.support.p011v7.view.menu.C0679v r8, int r9) {
        /*
            r6 = this;
            android.support.v7.view.menu.p r7 = (android.support.p011v7.view.menu.C0668p) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo2928g()
            android.support.v4.view.e r2 = r7.mo2748a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo1937a()
            if (r4 == 0) goto L_0x001f
            r4 = r3
            goto L_0x0020
        L_0x001f:
            r4 = r0
        L_0x0020:
            boolean r5 = r7.mo2927f()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo2860a((boolean) r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo2860a((boolean) r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            android.support.v7.view.menu.D r9 = new android.support.v7.view.menu.D
            android.content.Context r0 = r6.mo2886e()
            r9.<init>(r0, r6, r7)
            r7.mo2916a((android.support.p011v7.view.menu.C0647D) r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            android.support.v7.view.menu.D r7 = (android.support.p011v7.view.menu.C0647D) r7
            if (r4 == 0) goto L_0x0063
            r2.mo1936a((android.view.SubMenu) r7)
        L_0x0063:
            boolean r7 = r6.m3273a((android.support.p011v7.view.menu.C0647D) r7, (android.support.p011v7.view.menu.C0679v) r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.view.menu.C0662l.mo2862a(android.view.MenuItem, android.support.v7.view.menu.v, int):boolean");
    }

    public MenuItem add(int i) {
        return mo2853a(0, 0, 0, this.f2534c.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2853a(i, i2, i3, this.f2534c.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2853a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo2853a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2533b.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f2534c.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f2534c.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0668p pVar = (C0668p) mo2853a(i, i2, i3, charSequence);
        C0647D d = new C0647D(this.f2533b, this, pVar);
        pVar.mo2916a(d);
        return d;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int mo2871b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f2538g.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo2872b() {
        ArrayList<C0668p> n = mo2899n();
        if (this.f2543l) {
            Iterator<WeakReference<C0679v>> it = this.f2555x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0679v vVar = (C0679v) next.get();
                if (vVar == null) {
                    this.f2555x.remove(next);
                } else {
                    z |= vVar.mo322a();
                }
            }
            if (z) {
                this.f2541j.clear();
                this.f2542k.clear();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    C0668p pVar = n.get(i);
                    (pVar.mo2941h() ? this.f2541j : this.f2542k).add(pVar);
                }
            } else {
                this.f2541j.clear();
                this.f2542k.clear();
                this.f2542k.addAll(mo2899n());
            }
            this.f2543l = false;
        }
    }

    /* renamed from: b */
    public void mo2873b(Bundle bundle) {
        m3275e(bundle);
    }

    /* renamed from: b */
    public void mo2874b(C0679v vVar) {
        Iterator<WeakReference<C0679v>> it = this.f2555x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0679v vVar2 = (C0679v) next.get();
            if (vVar2 == null || vVar2 == vVar) {
                this.f2555x.remove(next);
            }
        }
    }

    /* renamed from: b */
    public void mo353b(boolean z) {
        if (!this.f2549r) {
            if (z) {
                this.f2540i = true;
                this.f2543l = true;
            }
            m3274d(z);
            return;
        }
        this.f2550s = true;
        if (z) {
            this.f2551t = true;
        }
    }

    /* renamed from: b */
    public boolean mo2711b(C0668p pVar) {
        boolean z = false;
        if (this.f2555x.isEmpty()) {
            return false;
        }
        mo2903r();
        Iterator<WeakReference<C0679v>> it = this.f2555x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0679v vVar = (C0679v) next.get();
            if (vVar == null) {
                this.f2555x.remove(next);
            } else {
                z = vVar.mo324a(this, pVar);
                if (z) {
                    break;
                }
            }
        }
        mo2902q();
        if (z) {
            this.f2556y = pVar;
        }
        return z;
    }

    /* renamed from: c */
    public C0662l mo2875c(int i) {
        this.f2544m = i;
        return this;
    }

    /* renamed from: c */
    public ArrayList<C0668p> mo2876c() {
        mo2872b();
        return this.f2541j;
    }

    /* renamed from: c */
    public void mo2877c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0647D) item.getSubMenu()).mo2877c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2712d(), sparseArray);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2878c(C0668p pVar) {
        this.f2543l = true;
        mo353b(true);
    }

    /* renamed from: c */
    public void mo2879c(boolean z) {
        this.f2557z = z;
    }

    public void clear() {
        C0668p pVar = this.f2556y;
        if (pVar != null) {
            mo2710a(pVar);
        }
        this.f2538g.clear();
        mo353b(true);
    }

    public void clearHeader() {
        this.f2547p = null;
        this.f2546o = null;
        this.f2548q = null;
        mo353b(false);
    }

    public void close() {
        mo2860a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0662l mo2883d(int i) {
        m3271a(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo2712d() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: d */
    public void mo2884d(Bundle bundle) {
        m3278f(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2885d(C0668p pVar) {
        this.f2540i = true;
        mo353b(true);
    }

    /* renamed from: e */
    public Context mo2886e() {
        return this.f2533b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0662l mo2887e(int i) {
        m3271a(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: f */
    public C0668p mo2888f() {
        return this.f2556y;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0668p pVar = this.f2538g.get(i2);
            if (pVar.getItemId() == i) {
                return pVar;
            }
            if (pVar.hasSubMenu() && (findItem = pVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable mo2890g() {
        return this.f2547p;
    }

    public MenuItem getItem(int i) {
        return this.f2538g.get(i);
    }

    /* renamed from: h */
    public CharSequence mo2892h() {
        return this.f2546o;
    }

    public boolean hasVisibleItems() {
        if (this.f2557z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2538g.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View mo2894i() {
        return this.f2548q;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo2852a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0668p> mo2896j() {
        mo2872b();
        return this.f2542k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo2897k() {
        return this.f2552u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Resources mo2898l() {
        return this.f2534c;
    }

    /* renamed from: m */
    public C0662l mo2714m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0668p> mo2899n() {
        if (!this.f2540i) {
            return this.f2539h;
        }
        this.f2539h.clear();
        int size = this.f2538g.size();
        for (int i = 0; i < size; i++) {
            C0668p pVar = this.f2538g.get(i);
            if (pVar.isVisible()) {
                this.f2539h.add(pVar);
            }
        }
        this.f2540i = false;
        this.f2543l = true;
        return this.f2539h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo2715o() {
        return this.f2535d;
    }

    /* renamed from: p */
    public boolean mo2716p() {
        return this.f2536e;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo2861a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0668p a = mo2852a(i, keyEvent);
        boolean a2 = a != null ? mo2861a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo2860a(true);
        }
        return a2;
    }

    /* renamed from: q */
    public void mo2902q() {
        this.f2549r = false;
        if (this.f2550s) {
            this.f2550s = false;
            mo353b(this.f2551t);
        }
    }

    /* renamed from: r */
    public void mo2903r() {
        if (!this.f2549r) {
            this.f2549r = true;
            this.f2550s = false;
            this.f2551t = false;
        }
    }

    public void removeGroup(int i) {
        int a = mo2847a(i);
        if (a >= 0) {
            int size = this.f2538g.size() - a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f2538g.get(a).getGroupId() != i) {
                    mo353b(true);
                } else {
                    m3272a(a, false);
                    i2 = i3;
                }
            }
            mo353b(true);
        }
    }

    public void removeItem(int i) {
        m3272a(mo2871b(i), true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f2538g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0668p pVar = this.f2538g.get(i2);
            if (pVar.getGroupId() == i) {
                pVar.mo2922c(z2);
                pVar.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f2538g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0668p pVar = this.f2538g.get(i2);
            if (pVar.getGroupId() == i) {
                pVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f2538g.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0668p pVar = this.f2538g.get(i2);
            if (pVar.getGroupId() == i && pVar.mo2926e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo353b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f2535d = z;
        mo353b(false);
    }

    public int size() {
        return this.f2538g.size();
    }
}
