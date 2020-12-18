package android.support.p011v7.app;

import android.content.Context;
import android.database.Cursor;
import android.support.p011v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* renamed from: android.support.v7.app.i */
class C0618i extends CursorAdapter {

    /* renamed from: a */
    private final int f2331a;

    /* renamed from: b */
    private final int f2332b;

    /* renamed from: c */
    final /* synthetic */ AlertController.RecycleListView f2333c;

    /* renamed from: d */
    final /* synthetic */ AlertController f2334d;

    /* renamed from: e */
    final /* synthetic */ AlertController.C0578a f2335e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0618i(AlertController.C0578a aVar, Context context, Cursor cursor, boolean z, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, z);
        this.f2335e = aVar;
        this.f2333c = recycleListView;
        this.f2334d = alertController;
        Cursor cursor2 = getCursor();
        this.f2331a = cursor2.getColumnIndexOrThrow(this.f2335e.f2144L);
        this.f2332b = cursor2.getColumnIndexOrThrow(this.f2335e.f2145M);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f2331a));
        AlertController.RecycleListView recycleListView = this.f2333c;
        int position = cursor.getPosition();
        boolean z = true;
        if (cursor.getInt(this.f2332b) != 1) {
            z = false;
        }
        recycleListView.setItemChecked(position, z);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2335e.f2150b.inflate(this.f2334d.f2098M, viewGroup, false);
    }
}
