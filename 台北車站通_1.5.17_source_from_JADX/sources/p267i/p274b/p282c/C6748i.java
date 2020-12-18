package p267i.p274b.p282c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;

/* renamed from: i.b.c.i */
public class C6748i extends RecyclerView.C0758h {

    /* renamed from: a */
    private int f18756a;

    /* renamed from: b */
    private Paint f18757b;

    /* renamed from: c */
    private Rect f18758c;

    /* renamed from: d */
    private int f18759d;

    /* renamed from: e */
    private int f18760e;

    /* renamed from: f */
    private int f18761f;

    /* renamed from: g */
    private boolean f18762g;

    /* renamed from: h */
    private boolean f18763h = false;

    public C6748i(int i, int i2, boolean z, int i3) {
        this.f18759d = i;
        this.f18760e = i2;
        this.f18762g = z;
        this.f18761f = i3;
        this.f18758c = new Rect();
        this.f18757b = new Paint();
        this.f18757b.setAntiAlias(true);
    }

    /* renamed from: b */
    private Rect m25565b(int i) {
        int i2;
        Rect rect = new Rect();
        int i3 = i - this.f18761f;
        if (i3 >= 0) {
            int i4 = this.f18759d;
            int i5 = i3 % i4;
            if (this.f18762g) {
                int i6 = this.f18760e;
                rect.left = i6 - ((i5 * i6) / i4);
                rect.right = ((i5 + 1) * i6) / i4;
                if (i3 < i4) {
                    rect.top = i6;
                }
                i2 = this.f18760e;
            } else {
                int i7 = this.f18760e;
                rect.left = (i5 * i7) / i4;
                rect.right = i7 - (((i5 + 1) * i7) / i4);
                if (i3 >= i4) {
                    rect.top = i7;
                }
                return rect;
            }
        } else {
            i2 = 0;
            rect.left = 0;
            rect.right = 0;
            rect.top = 0;
        }
        rect.bottom = i2;
        return rect;
    }

    /* renamed from: a */
    public void mo17245a(int i) {
        this.f18756a = i;
        this.f18757b.setColor(this.f18756a);
    }

    /* renamed from: a */
    public void mo3843a(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0775t tVar) {
        if (this.f18763h) {
            int childCount = recyclerView.getChildCount();
            boolean z = childCount % this.f18759d != 0;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.C0762j jVar = (RecyclerView.C0762j) childAt.getLayoutParams();
                Rect b = m25565b(i);
                this.f18758c.top = childAt.getBottom() + jVar.bottomMargin;
                Rect rect = this.f18758c;
                rect.bottom = rect.top + b.bottom;
                rect.left = jVar.leftMargin;
                rect.right = recyclerView.getWidth() - jVar.rightMargin;
                canvas.drawRect(this.f18758c, this.f18757b);
                this.f18758c.top = (childAt.getTop() - jVar.topMargin) - b.top;
                this.f18758c.bottom = childAt.getTop();
                Rect rect2 = this.f18758c;
                rect2.left = jVar.leftMargin;
                rect2.right = recyclerView.getWidth() - jVar.rightMargin;
                canvas.drawRect(this.f18758c, this.f18757b);
                this.f18758c.top = childAt.getTop() + jVar.topMargin;
                this.f18758c.bottom = childAt.getBottom() + jVar.bottomMargin;
                this.f18758c.left = (childAt.getLeft() - jVar.leftMargin) - b.left;
                this.f18758c.right = childAt.getLeft();
                canvas.drawRect(this.f18758c, this.f18757b);
                if (z && i == childCount - 1) {
                    b.right *= 2;
                }
                this.f18758c.top = childAt.getTop() + jVar.topMargin;
                this.f18758c.bottom = childAt.getBottom() + jVar.bottomMargin;
                this.f18758c.left = childAt.getRight();
                this.f18758c.right = childAt.getRight() + jVar.rightMargin + b.right;
                canvas.drawRect(this.f18758c, this.f18757b);
            }
        }
    }

    /* renamed from: a */
    public void mo3845a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0775t tVar) {
        rect.set(m25565b(recyclerView.mo3688f(view)));
    }

    /* renamed from: b */
    public void mo17246b(boolean z) {
        this.f18763h = z;
    }
}
