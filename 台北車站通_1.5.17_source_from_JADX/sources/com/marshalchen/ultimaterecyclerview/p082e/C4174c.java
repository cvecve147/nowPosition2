package com.marshalchen.ultimaterecyclerview.p082e;

import android.graphics.Rect;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.C0525I;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.marshalchen.ultimaterecyclerview.e.c */
public class C4174c extends FrameLayout {

    /* renamed from: a */
    private static final C4176b f12425a = C4176b.Right;

    /* renamed from: b */
    private int f12426b;

    /* renamed from: c */
    private C4176b f12427c;

    /* renamed from: d */
    private C0525I f12428d;

    /* renamed from: e */
    private int f12429e;

    /* renamed from: f */
    private LinkedHashMap<C4176b, View> f12430f;

    /* renamed from: g */
    private C4178d f12431g;

    /* renamed from: h */
    private float[] f12432h;

    /* renamed from: i */
    private List<C4180f> f12433i;

    /* renamed from: j */
    private C4175a f12434j;

    /* renamed from: k */
    private boolean f12435k;

    /* renamed from: l */
    private boolean[] f12436l;

    /* renamed from: m */
    private boolean f12437m;

    /* renamed from: n */
    private List<C4177c> f12438n;

    /* renamed from: o */
    private boolean f12439o;

    /* renamed from: p */
    private float f12440p;

    /* renamed from: q */
    private float f12441q;

    /* renamed from: r */
    View.OnClickListener f12442r;

    /* renamed from: s */
    View.OnLongClickListener f12443s;

    /* renamed from: t */
    private Rect f12444t;

    /* renamed from: u */
    private GestureDetector f12445u;

    /* renamed from: com.marshalchen.ultimaterecyclerview.e.c$a */
    public interface C4175a {
    }

    /* renamed from: com.marshalchen.ultimaterecyclerview.e.c$b */
    public enum C4176b {
        Left,
        Top,
        Right,
        Bottom
    }

    /* renamed from: com.marshalchen.ultimaterecyclerview.e.c$c */
    public interface C4177c {
        /* renamed from: a */
        void mo11846a(C4174c cVar);
    }

    /* renamed from: com.marshalchen.ultimaterecyclerview.e.c$d */
    public enum C4178d {
        LayDown,
        PullOut
    }

    /* renamed from: com.marshalchen.ultimaterecyclerview.e.c$e */
    public enum C4179e {
        Middle,
        Open,
        Close
    }

    /* renamed from: com.marshalchen.ultimaterecyclerview.e.c$f */
    public interface C4180f {
        /* renamed from: a */
        boolean mo11847a(MotionEvent motionEvent);
    }

    /* renamed from: com.marshalchen.ultimaterecyclerview.e.c$g */
    public interface C4181g {
    }

    /* renamed from: a */
    private int m16642a(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    private Rect m16643a(C4178d dVar, Rect rect) {
        View currentBottomView = getCurrentBottomView();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if (dVar == C4178d.PullOut) {
            C4176b bVar = this.f12427c;
            if (bVar == C4176b.Left) {
                i -= this.f12429e;
            } else if (bVar == C4176b.Right) {
                i = i3;
            } else {
                i2 = bVar == C4176b.Top ? i2 - this.f12429e : i4;
            }
            C4176b bVar2 = this.f12427c;
            int i5 = 0;
            if (bVar2 == C4176b.Left || bVar2 == C4176b.Right) {
                int i6 = rect.bottom;
                if (currentBottomView != null) {
                    i5 = currentBottomView.getMeasuredWidth();
                }
                i3 = i + i5;
                i4 = i6;
            } else {
                if (currentBottomView != null) {
                    i5 = currentBottomView.getMeasuredHeight();
                }
                i4 = i5 + i2;
                i3 = rect.right;
            }
        } else if (dVar == C4178d.LayDown) {
            C4176b bVar3 = this.f12427c;
            if (bVar3 == C4176b.Left) {
                i3 = i + this.f12429e;
            } else if (bVar3 == C4176b.Right) {
                i = i3 - this.f12429e;
            } else if (bVar3 == C4176b.Top) {
                i4 = i2 + this.f12429e;
            } else {
                i2 = i4 - this.f12429e;
            }
        }
        return new Rect(i, i2, i3, i4);
    }

    /* renamed from: a */
    private Rect m16644a(boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (z) {
            C4176b bVar = this.f12427c;
            if (bVar == C4176b.Left) {
                paddingLeft = this.f12429e + getPaddingLeft();
            } else if (bVar == C4176b.Right) {
                paddingLeft = getPaddingLeft() - this.f12429e;
            } else if (bVar == C4176b.Top) {
                paddingTop = this.f12429e + getPaddingTop();
            } else {
                paddingTop = getPaddingTop() - this.f12429e;
            }
        }
        return new Rect(paddingLeft, paddingTop, getMeasuredWidth() + paddingLeft, getMeasuredHeight() + paddingTop);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16645a(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f12439o
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.marshalchen.ultimaterecyclerview.e.c$e r0 = r9.getOpenStatus()
            com.marshalchen.ultimaterecyclerview.e.c$e r1 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Middle
            r2 = 1
            if (r0 != r1) goto L_0x0011
            r9.f12439o = r2
            return
        L_0x0011:
            com.marshalchen.ultimaterecyclerview.e.c$e r0 = r9.getOpenStatus()
            float r1 = r10.getRawX()
            float r3 = r9.f12440p
            float r1 = r1 - r3
            float r10 = r10.getRawY()
            float r3 = r9.f12441q
            float r10 = r10 - r3
            float r3 = r10 / r1
            float r3 = java.lang.Math.abs(r3)
            double r3 = (double) r3
            double r3 = java.lang.Math.atan(r3)
            double r3 = java.lang.Math.toDegrees(r3)
            float r3 = (float) r3
            com.marshalchen.ultimaterecyclerview.e.c$e r4 = r9.getOpenStatus()
            com.marshalchen.ultimaterecyclerview.e.c$e r5 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Close
            if (r4 != r5) goto L_0x007b
            r4 = 1110704128(0x42340000, float:45.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L_0x005d
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x004f
            boolean r4 = r9.mo11811c()
            if (r4 == 0) goto L_0x004f
            com.marshalchen.ultimaterecyclerview.e.c$b r4 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Left
            goto L_0x0076
        L_0x004f:
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x005c
            boolean r4 = r9.mo11813d()
            if (r4 == 0) goto L_0x005c
            com.marshalchen.ultimaterecyclerview.e.c$b r4 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Right
            goto L_0x0076
        L_0x005c:
            return
        L_0x005d:
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x006a
            boolean r4 = r9.mo11815f()
            if (r4 == 0) goto L_0x006a
            com.marshalchen.ultimaterecyclerview.e.c$b r4 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Top
            goto L_0x0076
        L_0x006a:
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x007a
            boolean r4 = r9.mo11810b()
            if (r4 == 0) goto L_0x007a
            com.marshalchen.ultimaterecyclerview.e.c$b r4 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Bottom
        L_0x0076:
            r9.setCurrentDragEdge(r4)
            goto L_0x007b
        L_0x007a:
            return
        L_0x007b:
            com.marshalchen.ultimaterecyclerview.e.c$b r4 = r9.f12427c
            com.marshalchen.ultimaterecyclerview.e.c$b r5 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Right
            r6 = 1106247680(0x41f00000, float:30.0)
            r7 = 0
            if (r4 != r5) goto L_0x00b0
            com.marshalchen.ultimaterecyclerview.e.c$e r4 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Open
            if (r0 != r4) goto L_0x008f
            int r4 = r9.f12426b
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x009b
        L_0x008f:
            com.marshalchen.ultimaterecyclerview.e.c$e r4 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Close
            if (r0 != r4) goto L_0x009d
            int r4 = r9.f12426b
            int r4 = -r4
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x009d
        L_0x009b:
            r4 = r2
            goto L_0x009e
        L_0x009d:
            r4 = r7
        L_0x009e:
            if (r4 != 0) goto L_0x00a7
            com.marshalchen.ultimaterecyclerview.e.c$e r4 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Middle
            if (r0 != r4) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r4 = r7
            goto L_0x00a8
        L_0x00a7:
            r4 = r2
        L_0x00a8:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x00ae
            if (r4 != 0) goto L_0x00b0
        L_0x00ae:
            r4 = r2
            goto L_0x00b1
        L_0x00b0:
            r4 = r7
        L_0x00b1:
            com.marshalchen.ultimaterecyclerview.e.c$b r5 = r9.f12427c
            com.marshalchen.ultimaterecyclerview.e.c$b r8 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Left
            if (r5 != r8) goto L_0x00e2
            com.marshalchen.ultimaterecyclerview.e.c$e r5 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Open
            if (r0 != r5) goto L_0x00c3
            int r5 = r9.f12426b
            int r5 = -r5
            float r5 = (float) r5
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00ce
        L_0x00c3:
            com.marshalchen.ultimaterecyclerview.e.c$e r5 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Close
            if (r0 != r5) goto L_0x00d0
            int r5 = r9.f12426b
            float r5 = (float) r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d0
        L_0x00ce:
            r1 = r2
            goto L_0x00d1
        L_0x00d0:
            r1 = r7
        L_0x00d1:
            if (r1 != 0) goto L_0x00da
            com.marshalchen.ultimaterecyclerview.e.c$e r1 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Middle
            if (r0 != r1) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r1 = r7
            goto L_0x00db
        L_0x00da:
            r1 = r2
        L_0x00db:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x00e1
            if (r1 != 0) goto L_0x00e2
        L_0x00e1:
            r4 = r2
        L_0x00e2:
            com.marshalchen.ultimaterecyclerview.e.c$b r1 = r9.f12427c
            com.marshalchen.ultimaterecyclerview.e.c$b r5 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Top
            r6 = 1114636288(0x42700000, float:60.0)
            if (r1 != r5) goto L_0x0115
            com.marshalchen.ultimaterecyclerview.e.c$e r1 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Open
            if (r0 != r1) goto L_0x00f6
            int r1 = r9.f12426b
            int r1 = -r1
            float r1 = (float) r1
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0101
        L_0x00f6:
            com.marshalchen.ultimaterecyclerview.e.c$e r1 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Close
            if (r0 != r1) goto L_0x0103
            int r1 = r9.f12426b
            float r1 = (float) r1
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0103
        L_0x0101:
            r1 = r2
            goto L_0x0104
        L_0x0103:
            r1 = r7
        L_0x0104:
            if (r1 != 0) goto L_0x010d
            com.marshalchen.ultimaterecyclerview.e.c$e r1 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Middle
            if (r0 != r1) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r1 = r7
            goto L_0x010e
        L_0x010d:
            r1 = r2
        L_0x010e:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0114
            if (r1 != 0) goto L_0x0115
        L_0x0114:
            r4 = r2
        L_0x0115:
            com.marshalchen.ultimaterecyclerview.e.c$b r1 = r9.f12427c
            com.marshalchen.ultimaterecyclerview.e.c$b r5 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Bottom
            if (r1 != r5) goto L_0x0143
            com.marshalchen.ultimaterecyclerview.e.c$e r1 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Open
            if (r0 != r1) goto L_0x0126
            int r1 = r9.f12426b
            float r1 = (float) r1
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0132
        L_0x0126:
            com.marshalchen.ultimaterecyclerview.e.c$e r1 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Close
            if (r0 != r1) goto L_0x0134
            int r1 = r9.f12426b
            int r1 = -r1
            float r1 = (float) r1
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0134
        L_0x0132:
            r10 = r2
            goto L_0x0135
        L_0x0134:
            r10 = r7
        L_0x0135:
            if (r10 != 0) goto L_0x013b
            com.marshalchen.ultimaterecyclerview.e.c$e r10 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Middle
            if (r0 != r10) goto L_0x013c
        L_0x013b:
            r7 = r2
        L_0x013c:
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x0142
            if (r7 != 0) goto L_0x0143
        L_0x0142:
            r4 = r2
        L_0x0143:
            r10 = r4 ^ 1
            r9.f12439o = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marshalchen.ultimaterecyclerview.p082e.C4174c.m16645a(android.view.MotionEvent):void");
    }

    /* renamed from: b */
    private boolean m16647b(MotionEvent motionEvent) {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return false;
        }
        if (this.f12444t == null) {
            this.f12444t = new Rect();
        }
        surfaceView.getHitRect(this.f12444t);
        return this.f12444t.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private AdapterView getAdapterView() {
        ViewParent parent = getParent();
        if (parent instanceof AdapterView) {
            return (AdapterView) parent;
        }
        return null;
    }

    private float getCurrentOffset() {
        C4176b bVar = this.f12427c;
        if (bVar == null) {
            return 0.0f;
        }
        return this.f12432h[bVar.ordinal()];
    }

    /* renamed from: i */
    private boolean m16649i() {
        return getAdapterView() != null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = (android.widget.AdapterView) r0;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m16650j() {
        /*
            r5 = this;
            com.marshalchen.ultimaterecyclerview.e.c$e r0 = r5.getOpenStatus()
            com.marshalchen.ultimaterecyclerview.e.c$e r1 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Close
            if (r0 == r1) goto L_0x0009
            return
        L_0x0009:
            android.view.ViewParent r0 = r5.getParent()
            boolean r1 = r0 instanceof android.widget.AdapterView
            if (r1 == 0) goto L_0x002f
            android.widget.AdapterView r0 = (android.widget.AdapterView) r0
            int r1 = r0.getPositionForView(r5)
            r2 = -1
            if (r1 == r2) goto L_0x002f
            int r2 = r0.getFirstVisiblePosition()
            int r2 = r1 - r2
            android.view.View r2 = r0.getChildAt(r2)
            android.widget.Adapter r3 = r0.getAdapter()
            long r3 = r3.getItemId(r1)
            r0.performItemClick(r2, r1, r3)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marshalchen.ultimaterecyclerview.p082e.C4174c.m16650j():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m16651k() {
        AdapterView adapterView;
        int positionForView;
        if (getOpenStatus() != C4179e.Close) {
            return false;
        }
        ViewParent parent = getParent();
        if (!(parent instanceof AdapterView) || (positionForView = adapterView.getPositionForView(this)) == -1) {
            return false;
        }
        long itemIdAtPosition = (adapterView = (AdapterView) parent).getItemIdAtPosition(positionForView);
        try {
            Method declaredMethod = AbsListView.class.getDeclaredMethod("performLongPress", new Class[]{View.class, Integer.TYPE, Long.TYPE});
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(adapterView, new Object[]{this, Integer.valueOf(positionForView), Long.valueOf(itemIdAtPosition)})).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            boolean onItemLongClick = adapterView.getOnItemLongClickListener() != null ? adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition) : false;
            if (onItemLongClick) {
                adapterView.performHapticFeedback(0);
            }
            return onItemLongClick;
        }
    }

    /* renamed from: l */
    private void m16652l() {
        C4179e openStatus = getOpenStatus();
        List<View> bottomViews = getBottomViews();
        if (openStatus == C4179e.Close) {
            for (View next : bottomViews) {
                if (!(next == null || next.getVisibility() == 4)) {
                    next.setVisibility(4);
                }
            }
            return;
        }
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null && currentBottomView.getVisibility() != 0) {
            currentBottomView.setVisibility(0);
        }
    }

    /* renamed from: m */
    private void m16653m() {
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            C4176b bVar = this.f12427c;
            this.f12429e = ((bVar == C4176b.Left || bVar == C4176b.Right) ? currentBottomView.getMeasuredWidth() : currentBottomView.getMeasuredHeight()) - m16642a(getCurrentOffset());
        }
        C4178d dVar = this.f12431g;
        if (dVar == C4178d.PullOut) {
            mo11826h();
        } else if (dVar == C4178d.LayDown) {
            mo11816g();
        }
        m16652l();
    }

    private void setCurrentDragEdge(C4176b bVar) {
        this.f12427c = bVar;
        m16653m();
    }

    /* renamed from: a */
    public void mo11808a() {
        this.f12430f.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            java.lang.Class r1 = r6.getClass()     // Catch:{ Exception -> 0x0019 }
            java.lang.String r2 = "gravity"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ Exception -> 0x0019 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x0019 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0019 }
            int r0 = r1.intValue()     // Catch:{ Exception -> 0x0019 }
            goto L_0x001d
        L_0x0019:
            r1 = move-exception
            r1.printStackTrace()
        L_0x001d:
            if (r0 <= 0) goto L_0x0056
            int r1 = android.support.p007v4.view.C0487v.m2293i(r3)
            int r0 = android.support.p007v4.view.C0466f.m2170a(r0, r1)
            r1 = r0 & 3
            r2 = 3
            if (r1 != r2) goto L_0x0033
            java.util.LinkedHashMap<com.marshalchen.ultimaterecyclerview.e.c$b, android.view.View> r1 = r3.f12430f
            com.marshalchen.ultimaterecyclerview.e.c$b r2 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Left
            r1.put(r2, r4)
        L_0x0033:
            r1 = r0 & 5
            r2 = 5
            if (r1 != r2) goto L_0x003f
            java.util.LinkedHashMap<com.marshalchen.ultimaterecyclerview.e.c$b, android.view.View> r1 = r3.f12430f
            com.marshalchen.ultimaterecyclerview.e.c$b r2 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Right
            r1.put(r2, r4)
        L_0x003f:
            r1 = r0 & 48
            r2 = 48
            if (r1 != r2) goto L_0x004c
            java.util.LinkedHashMap<com.marshalchen.ultimaterecyclerview.e.c$b, android.view.View> r1 = r3.f12430f
            com.marshalchen.ultimaterecyclerview.e.c$b r2 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Top
            r1.put(r2, r4)
        L_0x004c:
            r1 = 80
            r0 = r0 & r1
            if (r0 != r1) goto L_0x007b
            java.util.LinkedHashMap<com.marshalchen.ultimaterecyclerview.e.c$b, android.view.View> r0 = r3.f12430f
            com.marshalchen.ultimaterecyclerview.e.c$b r1 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4176b.Bottom
            goto L_0x0078
        L_0x0056:
            java.util.LinkedHashMap<com.marshalchen.ultimaterecyclerview.e.c$b, android.view.View> r0 = r3.f12430f
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0060:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            if (r2 != 0) goto L_0x0060
            java.util.LinkedHashMap<com.marshalchen.ultimaterecyclerview.e.c$b, android.view.View> r0 = r3.f12430f
            java.lang.Object r1 = r1.getKey()
        L_0x0078:
            r0.put(r1, r4)
        L_0x007b:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 != r3) goto L_0x0082
            return
        L_0x0082:
            super.addView(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marshalchen.ultimaterecyclerview.p082e.C4174c.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void");
    }

    /* renamed from: b */
    public boolean mo11810b() {
        View view = this.f12430f.get(C4176b.Bottom);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.f12436l[C4176b.Bottom.ordinal()];
    }

    /* renamed from: c */
    public boolean mo11811c() {
        View view = this.f12430f.get(C4176b.Left);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.f12436l[C4176b.Left.ordinal()];
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f12428d.mo2146a(true)) {
            C0487v.m2261B(this);
        }
    }

    /* renamed from: d */
    public boolean mo11813d() {
        View view = this.f12430f.get(C4176b.Right);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.f12436l[C4176b.Right.ordinal()];
    }

    /* renamed from: e */
    public boolean mo11814e() {
        return this.f12435k;
    }

    /* renamed from: f */
    public boolean mo11815f() {
        View view = this.f12430f.get(C4176b.Top);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.f12436l[C4176b.Top.ordinal()];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11816g() {
        Rect a = m16644a(false);
        View surfaceView = getSurfaceView();
        if (surfaceView != null) {
            surfaceView.layout(a.left, a.top, a.right, a.bottom);
            bringChildToFront(surfaceView);
        }
        Rect a2 = m16643a(C4178d.LayDown, a);
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            currentBottomView.layout(a2.left, a2.top, a2.right, a2.bottom);
        }
    }

    public List<View> getBottomViews() {
        ArrayList arrayList = new ArrayList();
        for (C4176b bVar : C4176b.values()) {
            arrayList.add(this.f12430f.get(bVar));
        }
        return arrayList;
    }

    public View getCurrentBottomView() {
        List<View> bottomViews = getBottomViews();
        if (this.f12427c.ordinal() < bottomViews.size()) {
            return bottomViews.get(this.f12427c.ordinal());
        }
        return null;
    }

    public int getDragDistance() {
        return this.f12429e;
    }

    public C4176b getDragEdge() {
        return this.f12427c;
    }

    public Map<C4176b, View> getDragEdgeMap() {
        return this.f12430f;
    }

    @Deprecated
    public List<C4176b> getDragEdges() {
        return new ArrayList(this.f12430f.keySet());
    }

    public C4179e getOpenStatus() {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return C4179e.Close;
        }
        int left = surfaceView.getLeft();
        int top = surfaceView.getTop();
        return (left == getPaddingLeft() && top == getPaddingTop()) ? C4179e.Close : (left == getPaddingLeft() - this.f12429e || left == getPaddingLeft() + this.f12429e || top == getPaddingTop() - this.f12429e || top == getPaddingTop() + this.f12429e) ? C4179e.Open : C4179e.Middle;
    }

    public C4178d getShowMode() {
        return this.f12431g;
    }

    public View getSurfaceView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo11826h() {
        Rect a = m16644a(false);
        View surfaceView = getSurfaceView();
        if (surfaceView != null) {
            surfaceView.layout(a.left, a.top, a.right, a.bottom);
            bringChildToFront(surfaceView);
        }
        Rect a2 = m16643a(C4178d.PullOut, a);
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            currentBottomView.layout(a2.left, a2.top, a2.right, a2.bottom);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m16649i()) {
            if (this.f12442r == null) {
                setOnClickListener(new C4172a(this));
            }
            if (this.f12443s == null) {
                setOnLongClickListener(new C4173b(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r0 != 3) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.mo11814e()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r4.f12437m
            r2 = 1
            if (r0 == 0) goto L_0x001c
            com.marshalchen.ultimaterecyclerview.e.c$e r0 = r4.getOpenStatus()
            com.marshalchen.ultimaterecyclerview.e.c$e r3 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Open
            if (r0 != r3) goto L_0x001c
            boolean r0 = r4.m16647b((android.view.MotionEvent) r5)
            if (r0 == 0) goto L_0x001c
            return r2
        L_0x001c:
            java.util.List<com.marshalchen.ultimaterecyclerview.e.c$f> r0 = r4.f12433i
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r0.next()
            com.marshalchen.ultimaterecyclerview.e.c$f r3 = (com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4180f) r3
            if (r3 == 0) goto L_0x0022
            boolean r3 = r3.mo11847a(r5)
            if (r3 == 0) goto L_0x0022
            return r1
        L_0x0037:
            int r0 = r5.getAction()
            if (r0 == 0) goto L_0x0067
            if (r0 == r2) goto L_0x0064
            r3 = 2
            if (r0 == r3) goto L_0x004b
            r2 = 3
            if (r0 == r2) goto L_0x0064
        L_0x0045:
            android.support.v4.widget.I r0 = r4.f12428d
            r0.mo2141a((android.view.MotionEvent) r5)
            goto L_0x0084
        L_0x004b:
            boolean r0 = r4.f12439o
            r4.m16645a((android.view.MotionEvent) r5)
            boolean r5 = r4.f12439o
            if (r5 == 0) goto L_0x005d
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == 0) goto L_0x005d
            r5.requestDisallowInterceptTouchEvent(r2)
        L_0x005d:
            if (r0 != 0) goto L_0x0084
            boolean r5 = r4.f12439o
            if (r5 == 0) goto L_0x0084
            return r1
        L_0x0064:
            r4.f12439o = r1
            goto L_0x0045
        L_0x0067:
            android.support.v4.widget.I r0 = r4.f12428d
            r0.mo2141a((android.view.MotionEvent) r5)
            r4.f12439o = r1
            float r0 = r5.getRawX()
            r4.f12440p = r0
            float r5 = r5.getRawY()
            r4.f12441q = r5
            com.marshalchen.ultimaterecyclerview.e.c$e r5 = r4.getOpenStatus()
            com.marshalchen.ultimaterecyclerview.e.c$e r0 = com.marshalchen.ultimaterecyclerview.p082e.C4174c.C4179e.Middle
            if (r5 != r0) goto L_0x0084
            r4.f12439o = r2
        L_0x0084:
            boolean r5 = r4.f12439o
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marshalchen.ultimaterecyclerview.p082e.C4174c.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m16653m();
        if (this.f12438n != null) {
            for (int i5 = 0; i5 < this.f12438n.size(); i5++) {
                this.f12438n.get(i5).mo11846a(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 != 3) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.mo11814e()
            if (r0 != 0) goto L_0x000b
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L_0x000b:
            int r0 = r5.getActionMasked()
            android.view.GestureDetector r1 = r4.f12445u
            r1.onTouchEvent(r5)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r2) goto L_0x0026
            r3 = 2
            if (r0 == r3) goto L_0x003a
            r3 = 3
            if (r0 == r3) goto L_0x0026
        L_0x0020:
            android.support.v4.widget.I r3 = r4.f12428d
            r3.mo2141a((android.view.MotionEvent) r5)
            goto L_0x0049
        L_0x0026:
            r4.f12439o = r1
            goto L_0x0020
        L_0x0029:
            android.support.v4.widget.I r3 = r4.f12428d
            r3.mo2141a((android.view.MotionEvent) r5)
            float r3 = r5.getRawX()
            r4.f12440p = r3
            float r3 = r5.getRawY()
            r4.f12441q = r3
        L_0x003a:
            r4.m16645a((android.view.MotionEvent) r5)
            boolean r3 = r4.f12439o
            if (r3 == 0) goto L_0x0049
            android.view.ViewParent r3 = r4.getParent()
            r3.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0020
        L_0x0049:
            boolean r5 = super.onTouchEvent(r5)
            if (r5 != 0) goto L_0x0055
            boolean r5 = r4.f12439o
            if (r5 != 0) goto L_0x0055
            if (r0 != 0) goto L_0x0056
        L_0x0055:
            r1 = r2
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marshalchen.ultimaterecyclerview.p082e.C4174c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onViewRemoved(View view) {
        for (Map.Entry entry : new HashMap(this.f12430f).entrySet()) {
            if (entry.getValue() == view) {
                this.f12430f.remove(entry.getKey());
            }
        }
    }

    public void setBottomSwipeEnabled(boolean z) {
        this.f12436l[C4176b.Bottom.ordinal()] = z;
    }

    public void setClickToClose(boolean z) {
        this.f12437m = z;
    }

    public void setDragDistance(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f12429e = m16642a((float) i);
        requestLayout();
    }

    @Deprecated
    public void setDragEdge(C4176b bVar) {
        mo11808a();
        if (getChildCount() >= 2) {
            this.f12430f.put(bVar, getChildAt(getChildCount() - 2));
        }
        setCurrentDragEdge(bVar);
    }

    @Deprecated
    public void setDragEdges(List<C4176b> list) {
        mo11808a();
        int min = Math.min(list.size(), getChildCount() - 1);
        for (int i = 0; i < min; i++) {
            this.f12430f.put(list.get(i), getChildAt(i));
        }
        setCurrentDragEdge((list.size() == 0 || list.contains(f12425a)) ? f12425a : list.get(0));
    }

    @Deprecated
    public void setDragEdges(C4176b... bVarArr) {
        mo11808a();
        setDragEdges((List<C4176b>) Arrays.asList(bVarArr));
    }

    public void setLeftSwipeEnabled(boolean z) {
        this.f12436l[C4176b.Left.ordinal()] = z;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f12442r = onClickListener;
    }

    public void setOnDoubleClickListener(C4175a aVar) {
        this.f12434j = aVar;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f12443s = onLongClickListener;
    }

    public void setRightSwipeEnabled(boolean z) {
        this.f12436l[C4176b.Right.ordinal()] = z;
    }

    public void setShowMode(C4178d dVar) {
        this.f12431g = dVar;
        requestLayout();
    }

    public void setSwipeEnabled(boolean z) {
        this.f12435k = z;
    }

    public void setTopSwipeEnabled(boolean z) {
        this.f12436l[C4176b.Top.ordinal()] = z;
    }
}
