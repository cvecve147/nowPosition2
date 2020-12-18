package android.support.p011v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p007v4.widget.C0570t;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1108f;

/* renamed from: android.support.v7.widget.Ya */
class C0806Ya extends C0570t implements View.OnClickListener {

    /* renamed from: l */
    private final SearchManager f3328l = ((SearchManager) this.f2054d.getSystemService("search"));

    /* renamed from: m */
    private final SearchView f3329m;

    /* renamed from: n */
    private final SearchableInfo f3330n;

    /* renamed from: o */
    private final Context f3331o;

    /* renamed from: p */
    private final WeakHashMap<String, Drawable.ConstantState> f3332p;

    /* renamed from: q */
    private final int f3333q;

    /* renamed from: r */
    private boolean f3334r = false;

    /* renamed from: s */
    private int f3335s = 1;

    /* renamed from: t */
    private ColorStateList f3336t;

    /* renamed from: u */
    private int f3337u = -1;

    /* renamed from: v */
    private int f3338v = -1;

    /* renamed from: w */
    private int f3339w = -1;

    /* renamed from: x */
    private int f3340x = -1;

    /* renamed from: y */
    private int f3341y = -1;

    /* renamed from: z */
    private int f3342z = -1;

    /* renamed from: android.support.v7.widget.Ya$a */
    private static final class C0807a {

        /* renamed from: a */
        public final TextView f3343a;

        /* renamed from: b */
        public final TextView f3344b;

        /* renamed from: c */
        public final ImageView f3345c;

        /* renamed from: d */
        public final ImageView f3346d;

        /* renamed from: e */
        public final ImageView f3347e;

        public C0807a(View view) {
            this.f3343a = (TextView) view.findViewById(16908308);
            this.f3344b = (TextView) view.findViewById(16908309);
            this.f3345c = (ImageView) view.findViewById(16908295);
            this.f3346d = (ImageView) view.findViewById(16908296);
            this.f3347e = (ImageView) view.findViewById(C1108f.edit_query);
        }
    }

    public C0806Ya(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f3329m = searchView;
        this.f3330n = searchableInfo;
        this.f3333q = searchView.getSuggestionCommitIconResId();
        this.f3331o = context;
        this.f3332p = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m4730a(ComponentName componentName) {
        String nameNotFoundException;
        PackageManager packageManager = this.f2054d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", nameNotFoundException);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e.toString();
        }
    }

    /* renamed from: a */
    private Drawable m4731a(String str) {
        Drawable.ConstantState constantState = this.f3332p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private static String m4732a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m4733a(Cursor cursor, String str) {
        return m4732a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m4734a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m4735a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m4736a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f3332p.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m4737b(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f3332p.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f3332p.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f3331o.getResources());
        }
        Drawable a = m4730a(componentName);
        if (a != null) {
            constantState = a.getConstantState();
        }
        this.f3332p.put(flattenToShortString, constantState);
        return a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m4738b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo4423a((android.net.Uri) r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f3331o     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0806Ya.m4738b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Drawable m4739b(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f3331o.getPackageName() + "/" + parseInt;
            Drawable a = m4731a(str2);
            if (a != null) {
                return a;
            }
            Drawable c = C1006a.m5394c(this.f3331o, parseInt);
            m4736a(str2, c);
            return c;
        } catch (NumberFormatException unused) {
            Drawable a2 = m4731a(str);
            if (a2 != null) {
                return a2;
            }
            Drawable b = m4738b(Uri.parse(str));
            m4736a(str, b);
            return b;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: b */
    private CharSequence m4740b(CharSequence charSequence) {
        if (this.f3336t == null) {
            TypedValue typedValue = new TypedValue();
            this.f2054d.getTheme().resolveAttribute(C1103a.textColorSearchUrl, typedValue, true);
            this.f3336t = this.f2054d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f3336t, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: c */
    private Drawable m4741c(Cursor cursor) {
        Drawable b = m4737b(this.f3330n.getSearchActivity());
        return b != null ? b : this.f2054d.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: d */
    private Drawable m4742d(Cursor cursor) {
        int i = this.f3340x;
        if (i == -1) {
            return null;
        }
        Drawable b = m4739b(cursor.getString(i));
        return b != null ? b : m4741c(cursor);
    }

    /* renamed from: e */
    private Drawable m4743e(Cursor cursor) {
        int i = this.f3341y;
        if (i == -1) {
            return null;
        }
        return m4739b(cursor.getString(i));
    }

    /* renamed from: f */
    private void m4744f(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cursor mo4422a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f2054d.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: a */
    public Cursor mo2370a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f3329m.getVisibility() == 0 && this.f3329m.getWindowVisibility() == 0) {
            try {
                Cursor a = mo4422a(this.f3330n, charSequence2, 50);
                if (a != null) {
                    a.getCount();
                    return a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo4423a(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f2054d.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* renamed from: a */
    public void mo4424a(int i) {
        this.f3335s = i;
    }

    /* renamed from: a */
    public void mo2352a(Cursor cursor) {
        if (this.f3334r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo2352a(cursor);
            if (cursor != null) {
                this.f3337u = cursor.getColumnIndex("suggest_text_1");
                this.f3338v = cursor.getColumnIndex("suggest_text_2");
                this.f3339w = cursor.getColumnIndex("suggest_text_2_url");
                this.f3340x = cursor.getColumnIndex("suggest_icon_1");
                this.f3341y = cursor.getColumnIndex("suggest_icon_2");
                this.f3342z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public void mo2353a(View view, Context context, Cursor cursor) {
        C0807a aVar = (C0807a) view.getTag();
        int i = this.f3342z;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f3343a != null) {
            m4735a(aVar.f3343a, (CharSequence) m4732a(cursor, this.f3337u));
        }
        if (aVar.f3344b != null) {
            String a = m4732a(cursor, this.f3339w);
            CharSequence b = a != null ? m4740b((CharSequence) a) : m4732a(cursor, this.f3338v);
            if (TextUtils.isEmpty(b)) {
                TextView textView = aVar.f3343a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f3343a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f3343a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f3343a.setMaxLines(1);
                }
            }
            m4735a(aVar.f3344b, b);
        }
        ImageView imageView = aVar.f3345c;
        if (imageView != null) {
            m4734a(imageView, m4742d(cursor), 4);
        }
        ImageView imageView2 = aVar.f3346d;
        if (imageView2 != null) {
            m4734a(imageView2, m4743e(cursor), 8);
        }
        int i3 = this.f3335s;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f3347e.setVisibility(0);
            aVar.f3347e.setTag(aVar.f3343a.getText());
            aVar.f3347e.setOnClickListener(this);
            return;
        }
        aVar.f3347e.setVisibility(8);
    }

    /* renamed from: b */
    public View mo2355b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View b = super.mo2355b(context, cursor, viewGroup);
        b.setTag(new C0807a(b));
        ((ImageView) b.findViewById(C1108f.edit_query)).setImageResource(this.f3333q);
        return b;
    }

    public CharSequence convertToString(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m4733a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f3330n.shouldRewriteQueryFromData() && (a2 = m4733a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f3330n.shouldRewriteQueryFromText() || (a = m4733a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo2350a(this.f2054d, this.f2053c, viewGroup);
            if (a != null) {
                ((C0807a) a.getTag()).f3343a.setText(e.toString());
            }
            return a;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo2355b(this.f2054d, this.f2053c, viewGroup);
            if (b != null) {
                ((C0807a) b.getTag()).f3343a.setText(e.toString());
            }
            return b;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m4744f(mo2349a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m4744f(mo2349a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3329m.mo4063a((CharSequence) tag);
        }
    }
}
