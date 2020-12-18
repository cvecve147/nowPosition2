package p267i.p274b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.apache.http.HttpStatus;

/* renamed from: i.b.a */
public class C6691a {

    /* renamed from: a */
    private final int f18570a = HttpStatus.SC_BAD_REQUEST;

    /* renamed from: b */
    private C6692a f18571b;

    /* renamed from: c */
    protected SQLiteDatabase f18572c;

    /* renamed from: d */
    protected Context f18573d;

    /* renamed from: e */
    private StringBuilder f18574e = null;

    /* renamed from: f */
    private String f18575f;

    /* renamed from: g */
    private String f18576g = null;

    /* renamed from: h */
    private String[] f18577h = null;

    /* renamed from: i */
    private int f18578i = 0;

    /* renamed from: i.b.a$a */
    private class C6692a extends SQLiteOpenHelper {
        C6692a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C6691a.this.mo5506a(sQLiteDatabase, i, i2);
        }
    }

    public C6691a(Context context, String str, int i) {
        this.f18573d = context;
        this.f18575f = str;
        this.f18571b = new C6692a(context, this.f18575f, (SQLiteDatabase.CursorFactory) null, i);
    }

    /* renamed from: a */
    public synchronized void mo17135a() {
        if (this.f18572c != null) {
            this.f18572c.close();
            this.f18572c = null;
        }
        this.f18573d = null;
    }

    /* renamed from: a */
    public void mo17136a(ContentValues contentValues) {
        this.f18572c.insert(this.f18576g, (String) null, contentValues);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5506a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public synchronized void mo17137a(String str) {
        this.f18572c.delete(str, (String) null, (String[]) null);
    }

    /* renamed from: a */
    public void mo17138a(String str, String[] strArr) {
        this.f18578i = 0;
        this.f18576g = str;
        this.f18577h = strArr;
    }

    /* renamed from: b */
    public void mo17139b() {
        if (this.f18572c.inTransaction()) {
            try {
                this.f18572c.setTransactionSuccessful();
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.f18572c.endTransaction();
                throw th;
            }
            this.f18572c.endTransaction();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo5511c() {
        this.f18572c = this.f18571b.getWritableDatabase();
    }

    /* renamed from: d */
    public void mo17140d() {
        this.f18572c.beginTransaction();
    }
}
