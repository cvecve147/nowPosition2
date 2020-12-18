package com.askey.taipeinavi.p059ui;

import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;

/* renamed from: com.askey.taipeinavi.ui.d */
class C1321d implements SimpleCursorAdapter.ViewBinder {

    /* renamed from: a */
    final /* synthetic */ C1322e f4634a;

    C1321d(C1322e eVar) {
        this.f4634a = eVar;
    }

    public boolean setViewValue(View view, Cursor cursor, int i) {
        if (!(view instanceof ImageView)) {
            return false;
        }
        if (cursor.getInt(i) > 0) {
            view.setVisibility(0);
            return true;
        }
        view.setVisibility(8);
        return true;
    }
}
