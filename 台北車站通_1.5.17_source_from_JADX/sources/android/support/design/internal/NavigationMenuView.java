package android.support.design.internal;

import android.content.Context;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0681w;
import android.support.p011v7.widget.LinearLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.util.AttributeSet;

public class NavigationMenuView extends RecyclerView implements C0681w {
    public NavigationMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    /* renamed from: a */
    public void mo289a(C0662l lVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
