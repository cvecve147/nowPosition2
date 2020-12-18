package com.marshalchen.ultimaterecyclerview.swipelistview;

import android.content.Context;
import android.support.p007v4.view.C0475j;
import android.support.p011v7.widget.LinearLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.List;

public class SwipeListView extends RecyclerView {

    /* renamed from: Ia */
    private int f12498Ia = 0;

    /* renamed from: Ja */
    int f12499Ja = 0;

    /* renamed from: Ka */
    int f12500Ka = 0;

    /* renamed from: La */
    private LinearLayoutManager f12501La;

    /* renamed from: Ma */
    public C4198a f12502Ma;

    /* renamed from: Na */
    private C4199b f12503Na;

    public SwipeListView(Context context, int i, int i2) {
        super(context);
        this.f12499Ja = i2;
        this.f12500Ka = i;
    }

    public SwipeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getCountSelected() {
        this.f12503Na.mo11893a();
        throw null;
    }

    public List<Integer> getPositionsSelected() {
        this.f12503Na.mo11899b();
        throw null;
    }

    public int getSwipeActionLeft() {
        this.f12503Na.mo11903c();
        throw null;
    }

    public int getSwipeActionRight() {
        this.f12503Na.mo11906d();
        throw null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0475j.m2208b(motionEvent);
        motionEvent.getX();
        motionEvent.getY();
        if (!isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.f12503Na.mo11907e();
        throw null;
    }

    public void setAdapter(RecyclerView.C0748a aVar) {
        super.setAdapter(aVar);
        this.f12503Na.mo11908f();
        throw null;
    }

    public void setAnimationTime(long j) {
        this.f12503Na.mo11896a(j);
        throw null;
    }

    public void setLayoutManager(RecyclerView.C0759i iVar) {
        super.setLayoutManager(iVar);
        this.f12501La = (LinearLayoutManager) iVar;
        C4199b bVar = this.f12503Na;
        if (bVar != null) {
            bVar.mo11897a(this.f12501La);
            throw null;
        }
    }

    public void setOffsetLeft(float f) {
        this.f12503Na.mo11894a(f);
        throw null;
    }

    public void setOffsetRight(float f) {
        this.f12503Na.mo11900b(f);
        throw null;
    }

    public void setOnlyOneOpenedWhenSwipe(boolean z) {
        this.f12503Na.mo11898a(z);
        throw null;
    }

    public void setSwipeActionLeft(int i) {
        this.f12503Na.mo11895a(i);
        throw null;
    }

    public void setSwipeActionRight(int i) {
        this.f12503Na.mo11901b(i);
        throw null;
    }

    public void setSwipeCloseAllItemsWhenMoveList(boolean z) {
        this.f12503Na.mo11902b(z);
        throw null;
    }

    public void setSwipeListViewListener(C4198a aVar) {
        this.f12502Ma = aVar;
    }

    public void setSwipeMode(int i) {
        this.f12503Na.mo11904c(i);
        throw null;
    }

    public void setSwipeOpenOnLongPress(boolean z) {
        this.f12503Na.mo11905c(z);
        throw null;
    }
}
