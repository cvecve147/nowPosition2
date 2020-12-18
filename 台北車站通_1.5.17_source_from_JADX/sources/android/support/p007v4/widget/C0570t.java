package android.support.p007v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.t */
public abstract class C0570t extends C0546h {

    /* renamed from: i */
    private int f2075i;

    /* renamed from: j */
    private int f2076j;

    /* renamed from: k */
    private LayoutInflater f2077k;

    @Deprecated
    public C0570t(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f2076j = i;
        this.f2075i = i;
        this.f2077k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo2350a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2077k.inflate(this.f2076j, viewGroup, false);
    }

    /* renamed from: b */
    public View mo2355b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2077k.inflate(this.f2075i, viewGroup, false);
    }
}
