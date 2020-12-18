package p267i.p274b.p277b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import org.apache.http.HttpStatus;

/* renamed from: i.b.b.b */
public class C6715b {

    /* renamed from: a */
    private final int f18653a = HttpStatus.SC_BAD_REQUEST;

    /* renamed from: b */
    private C6716a f18654b;

    /* renamed from: c */
    protected SQLiteDatabase f18655c;

    /* renamed from: d */
    protected Context f18656d;

    /* renamed from: e */
    private StringBuilder f18657e = null;

    /* renamed from: f */
    private String f18658f;

    /* renamed from: g */
    private String f18659g = null;

    /* renamed from: h */
    private String[] f18660h = null;

    /* renamed from: i */
    private int f18661i = 0;

    /* renamed from: i.b.b.b$a */
    private class C6716a extends SQLiteOpenHelper {
        C6716a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C6715b.this.mo17093a(sQLiteDatabase, i, i2);
        }
    }

    public C6715b(Context context, String str, int i) {
        this.f18656d = context;
        this.f18658f = str;
        this.f18654b = new C6716a(context, this.f18658f, (SQLiteDatabase.CursorFactory) null, i);
    }

    /* renamed from: a */
    private StringBuilder m25471a(String str, String[] strArr, ContentValues contentValues) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR REPLACE INTO '");
        sb.append(str);
        sb.append("' SELECT");
        int i = 0;
        for (String str2 : strArr) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(" '");
            sb.append(contentValues.get(str2));
            sb.append("' AS '");
            sb.append(str2);
            sb.append("'");
            i++;
        }
        return sb;
    }

    /* renamed from: a */
    private void m25472a(StringBuilder sb, String str, String[] strArr, ContentValues contentValues) {
        sb.append(" UNION SELECT");
        int i = 0;
        for (String str2 : strArr) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(" '");
            sb.append(contentValues.get(str2));
            sb.append("'");
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17092a() {
        this.f18655c = this.f18654b.getWritableDatabase();
    }

    /* renamed from: a */
    public void mo17170a(ContentValues contentValues) {
        StringBuilder sb = this.f18657e;
        if (sb == null) {
            this.f18657e = m25471a(this.f18659g, this.f18660h, contentValues);
        } else {
            m25472a(sb, this.f18659g, this.f18660h, contentValues);
        }
        this.f18661i++;
        if (this.f18661i % HttpStatus.SC_BAD_REQUEST == 0) {
            mo17173b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17093a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public synchronized void mo17171a(String str) {
        this.f18655c.delete(str, (String) null, (String[]) null);
    }

    /* renamed from: a */
    public void mo17172a(String str, String[] strArr) {
        this.f18661i = 0;
        this.f18659g = str;
        this.f18660h = strArr;
    }

    /* renamed from: b */
    public void mo17173b() {
        StringBuilder sb = this.f18657e;
        if (sb != null) {
            this.f18655c.execSQL(sb.toString());
            this.f18657e = null;
            this.f18661i = 0;
        }
    }

    /* renamed from: b */
    public void mo17174b(String str, String[] strArr) {
        this.f18655c.execSQL(String.format("DELETE FROM %s WHERE %s IN (%s);", new Object[]{this.f18659g, str, TextUtils.join(",", strArr)}));
    }

    /* renamed from: c */
    public synchronized void mo17175c() {
        if (this.f18655c != null) {
            this.f18655c.close();
            this.f18655c = null;
        }
        this.f18656d = null;
    }
}
