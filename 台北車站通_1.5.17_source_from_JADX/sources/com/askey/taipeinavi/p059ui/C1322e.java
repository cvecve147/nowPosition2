package com.askey.taipeinavi.p059ui;

import android.content.Context;
import android.database.Cursor;
import android.widget.SimpleCursorAdapter;
import com.askey.taipeinavi.R;

/* renamed from: com.askey.taipeinavi.ui.e */
public class C1322e extends SimpleCursorAdapter {
    public C1322e(Context context, String[] strArr, int[] iArr) {
        super(context, R.layout.item_search_result, (Cursor) null, strArr, iArr, 2);
        setViewBinder(new C1321d(this));
    }
}
