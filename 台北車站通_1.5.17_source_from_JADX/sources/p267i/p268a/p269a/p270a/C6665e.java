package p267i.p268a.p269a.p270a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p267i.p268a.p269a.C6668b;
import p299tw.navin.navinmap.map.C7112l;

/* renamed from: i.a.a.a.e */
public class C6665e {

    /* renamed from: a */
    private static C6665e f18469a;

    /* renamed from: b */
    private HashMap<String, C6666f> f18470b = new HashMap<>();

    /* renamed from: c */
    private BitmapFactory.Options f18471c;

    /* renamed from: d */
    private float f18472d;

    private C6665e() {
    }

    /* renamed from: a */
    private int m25343a(String str, Class<?> cls) {
        if (str != null && !str.isEmpty()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                return declaredField.getInt(declaredField);
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    private Bitmap m25344a(Context context, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return BitmapFactory.decodeStream(context.getResources().openRawResource(i), (Rect) null, this.f18471c);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C6665e m25345a() {
        if (f18469a == null) {
            f18469a = new C6665e();
        }
        return f18469a;
    }

    /* renamed from: b */
    private String m25346b(C7112l.C7123k kVar) {
        Object[] objArr;
        String str;
        if (kVar instanceof C7112l.C7124l) {
            objArr = new Object[]{Integer.valueOf(((C7112l.C7124l) kVar).f19668n)};
            str = "s%d";
        } else {
            objArr = new Object[]{Integer.valueOf(((C7112l.C7117e) kVar).f19608n)};
            str = "f%d";
        }
        return String.format(str, objArr);
    }

    /* renamed from: a */
    public int mo17117a(C7112l.C7123k kVar) {
        return m25343a(m25346b(kVar), (Class<?>) C6668b.class);
    }

    /* renamed from: a */
    public C6666f mo17118a(Context context, C7112l.C7123k kVar) {
        Bitmap a;
        String b = m25346b(kVar);
        C6666f fVar = this.f18470b.get(b);
        if (fVar != null || (a = m25344a(context, m25343a(b, (Class<?>) C6668b.class))) == null) {
            return fVar;
        }
        PointF pointF = new PointF();
        pointF.set(((float) a.getWidth()) * 0.5f, ((float) a.getHeight()) * 0.5f);
        C6666f fVar2 = new C6666f();
        fVar2.f18475c = (float) a.getWidth();
        fVar2.f18476d = (float) a.getHeight();
        fVar2.f18473a = a;
        fVar2.f18474b = pointF;
        this.f18470b.put(b, fVar2);
        this.f18472d = pointF.x;
        return fVar2;
    }

    /* renamed from: a */
    public synchronized void mo17119a(Context context, ArrayList<? extends C7112l.C7123k> arrayList) {
        if (arrayList != null) {
            if (this.f18471c == null) {
                int i = context.getResources().getDisplayMetrics().densityDpi;
                this.f18471c = new BitmapFactory.Options();
                this.f18471c.inDensity = 480;
                this.f18471c.inTargetDensity = i;
                this.f18471c.inSampleSize = 8;
            }
            Iterator<? extends C7112l.C7123k> it = arrayList.iterator();
            while (it.hasNext()) {
                mo17118a(context, (C7112l.C7123k) it.next());
            }
        }
    }

    /* renamed from: b */
    public float mo17120b() {
        return this.f18472d;
    }

    /* renamed from: c */
    public void mo17121c() {
        Bitmap bitmap;
        for (String str : this.f18470b.keySet()) {
            C6666f fVar = this.f18470b.get(str);
            if (!(fVar == null || (bitmap = fVar.f18473a) == null)) {
                bitmap.recycle();
                fVar.f18473a = null;
            }
        }
        this.f18470b.clear();
    }
}
