package android.support.p007v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.p007v4.widget.C0549i;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.h */
public abstract class C0546h extends BaseAdapter implements Filterable, C0549i.C0550a {

    /* renamed from: a */
    protected boolean f2051a;

    /* renamed from: b */
    protected boolean f2052b;

    /* renamed from: c */
    protected Cursor f2053c;

    /* renamed from: d */
    protected Context f2054d;

    /* renamed from: e */
    protected int f2055e;

    /* renamed from: f */
    protected C0547a f2056f;

    /* renamed from: g */
    protected DataSetObserver f2057g;

    /* renamed from: h */
    protected C0549i f2058h;

    /* renamed from: android.support.v4.widget.h$a */
    private class C0547a extends ContentObserver {
        C0547a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C0546h.this.mo2356b();
        }
    }

    /* renamed from: android.support.v4.widget.h$b */
    private class C0548b extends DataSetObserver {
        C0548b() {
        }

        public void onChanged() {
            C0546h hVar = C0546h.this;
            hVar.f2051a = true;
            hVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0546h hVar = C0546h.this;
            hVar.f2051a = false;
            hVar.notifyDataSetInvalidated();
        }
    }

    public C0546h(Context context, Cursor cursor, boolean z) {
        mo2351a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public Cursor mo2349a() {
        return this.f2053c;
    }

    /* renamed from: a */
    public abstract View mo2350a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2351a(Context context, Cursor cursor, int i) {
        C0548b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f2052b = true;
        } else {
            this.f2052b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f2053c = cursor;
        this.f2051a = z;
        this.f2054d = context;
        this.f2055e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f2056f = new C0547a();
            bVar = new C0548b();
        } else {
            bVar = null;
            this.f2056f = null;
        }
        this.f2057g = bVar;
        if (z) {
            C0547a aVar = this.f2056f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2057g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo2352a(Cursor cursor) {
        Cursor b = mo2354b(cursor);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: a */
    public abstract void mo2353a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public Cursor mo2354b(Cursor cursor) {
        Cursor cursor2 = this.f2053c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0547a aVar = this.f2056f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2057g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2053c = cursor;
        if (cursor != null) {
            C0547a aVar2 = this.f2056f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f2057g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f2055e = cursor.getColumnIndexOrThrow("_id");
            this.f2051a = true;
            notifyDataSetChanged();
        } else {
            this.f2055e = -1;
            this.f2051a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: b */
    public abstract View mo2355b(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2356b() {
        Cursor cursor;
        if (this.f2052b && (cursor = this.f2053c) != null && !cursor.isClosed()) {
            this.f2051a = this.f2053c.requery();
        }
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f2051a || (cursor = this.f2053c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2051a) {
            return null;
        }
        this.f2053c.moveToPosition(i);
        if (view == null) {
            view = mo2350a(this.f2054d, this.f2053c, viewGroup);
        }
        mo2353a(view, this.f2054d, this.f2053c);
        return view;
    }

    public Filter getFilter() {
        if (this.f2058h == null) {
            this.f2058h = new C0549i(this);
        }
        return this.f2058h;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f2051a || (cursor = this.f2053c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f2053c;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f2051a || (cursor = this.f2053c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f2053c.getLong(this.f2055e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2051a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2053c.moveToPosition(i)) {
            if (view == null) {
                view = mo2355b(this.f2054d, this.f2053c, viewGroup);
            }
            mo2353a(view, this.f2054d, this.f2053c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }
}
