package android.support.p007v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: android.support.v4.widget.i */
class C0549i extends Filter {

    /* renamed from: a */
    C0550a f2061a;

    /* renamed from: android.support.v4.widget.i$a */
    interface C0550a {
        /* renamed from: a */
        Cursor mo2349a();

        /* renamed from: a */
        Cursor mo2370a(CharSequence charSequence);

        /* renamed from: a */
        void mo2352a(Cursor cursor);

        CharSequence convertToString(Cursor cursor);
    }

    C0549i(C0550a aVar) {
        this.f2061a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f2061a.convertToString((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f2061a.mo2370a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.f2061a.mo2349a();
        Object obj = filterResults.values;
        if (obj != null && obj != a) {
            this.f2061a.mo2352a((Cursor) obj);
        }
    }
}
