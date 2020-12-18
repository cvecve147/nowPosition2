package com.askey.taipeinavi.p058d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.askey.taipeinavi.p059ui.C1320c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p267i.p274b.C6691a;
import p299tw.navin.navinmap.map.C7095d;

/* renamed from: com.askey.taipeinavi.d.c */
public class C1209c extends C6691a {

    /* renamed from: j */
    private static String f4401j = "TaipeiNaviDB";

    /* renamed from: k */
    private static int f4402k = 3;

    /* renamed from: l */
    private static final String[] f4403l = {"_id", "id", "name", "map_name", "my_order", "ori_my_order", SVGParser.XML_STYLESHEET_ATTR_TYPE, "is_history", "name_cht", "name_en", "map_name_cht", "map_name_en", "rid"};

    /* renamed from: m */
    private static final String[] f4404m = {"name_cht", "name_en", "map_name_cht", "map_name_en"};

    public C1209c(Context context) {
        super(context, f4401j, f4402k);
    }

    /* renamed from: a */
    private String m6014a(C7095d dVar) {
        return String.format("%d", new Object[]{Integer.valueOf((dVar.mo21148i() * 10000) + Integer.parseInt(dVar.mo21132b()))});
    }

    /* renamed from: a */
    private String m6015a(String[] strArr) {
        String str;
        StringBuilder sb = null;
        for (String str2 : strArr) {
            if (sb != null) {
                str = " OR ";
            } else {
                sb = new StringBuilder();
                str = "(";
            }
            sb.append(str);
            sb.append(str2);
            sb.append(" LIKE ?");
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private String m6016a(String[] strArr, int i) {
        StringBuilder sb = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (sb != null) {
                sb.append(" AND ");
            } else {
                sb = new StringBuilder();
            }
            sb.append(m6015a(strArr));
        }
        return sb.toString();
    }

    /* renamed from: b */
    private String[] m6017b(String[] strArr, int i) {
        String[] strArr2 = new String[(strArr.length * i)];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                strArr2[(i2 * i) + i3] = "%" + strArr[i2] + "%";
            }
        }
        return strArr2;
    }

    /* renamed from: a */
    public C1320c mo5505a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex("id");
        int columnIndex3 = cursor.getColumnIndex("name");
        int columnIndex4 = cursor.getColumnIndex("map_name");
        int columnIndex5 = cursor.getColumnIndex(SVGParser.XML_STYLESHEET_ATTR_TYPE);
        int columnIndex6 = cursor.getColumnIndex("ori_my_order");
        int columnIndex7 = cursor.getColumnIndex("is_history");
        C1320c cVar = new C1320c();
        cVar.f4631o = cursor.getInt(columnIndex);
        cVar.mo21135b(cursor.getString(columnIndex2));
        cVar.mo21131a(cursor.getString(columnIndex3));
        cVar.mo21137c(cursor.getString(columnIndex4));
        cVar.mo21130a(cursor.getInt(columnIndex5));
        cVar.f4633q = cursor.getInt(columnIndex6);
        cVar.f4632p = cursor.getInt(columnIndex7);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5506a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1) {
            sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"Poi", "name_cht"}));
            sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"Poi", "name_en"}));
            sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"Poi", "map_name_cht"}));
            sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"Poi", "map_name_en"}));
        } else if (i != 2) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"Poi", "rid"}));
    }

    /* renamed from: a */
    public void mo5507a(ArrayList<C1320c> arrayList) {
        mo17140d();
        Iterator<C1320c> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C1320c next = it.next();
            ContentValues contentValues = new ContentValues();
            if (i != 5) {
                contentValues.put("my_order", Integer.valueOf(i));
                contentValues.put("is_history", Integer.valueOf(next.f4632p));
                i++;
            } else {
                contentValues.put("my_order", Integer.valueOf(next.f4633q));
                contentValues.put("is_history", Integer.valueOf(next.f4632p));
            }
            this.f18572c.update("Poi", contentValues, "_id=?", new String[]{String.valueOf(next.f4631o)});
        }
        mo17139b();
    }

    /* renamed from: b */
    public C7095d mo5508b(String str) {
        Cursor query = this.f18572c.query("Poi", (String[]) null, String.format("%s=?", new Object[]{"rid"}), new String[]{str}, (String) null, (String) null, (String) null);
        query.moveToFirst();
        if (!query.isAfterLast()) {
            return mo5505a(query);
        }
        return null;
    }

    /* renamed from: b */
    public void mo5509b(ArrayList<C7095d> arrayList) {
        ArrayList<C1320c> e = mo5513e();
        mo17137a("Poi");
        mo17140d();
        Iterator<C7095d> it = arrayList.iterator();
        int i = 6;
        while (it.hasNext()) {
            C7095d next = it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_id", m6014a(next));
            contentValues.put("id", next.mo21132b());
            contentValues.put("name", next.mo21127a());
            contentValues.put("map_name", next.mo21136c());
            contentValues.put(SVGParser.XML_STYLESHEET_ATTR_TYPE, Integer.valueOf(next.mo21148i()));
            contentValues.put("my_order", Integer.valueOf(i));
            contentValues.put("ori_my_order", Integer.valueOf(i));
            contentValues.put("is_history", 0);
            contentValues.put("name_cht", next.mo21142f());
            contentValues.put("name_en", next.mo21144g());
            contentValues.put("map_name_cht", next.mo21138d());
            contentValues.put("map_name_en", next.mo21140e());
            contentValues.put("rid", next.mo21146h());
            mo17136a(contentValues);
            i++;
        }
        mo17139b();
        if (e != null) {
            mo5507a(e);
        }
    }

    /* renamed from: c */
    public C7095d mo5510c(String str) {
        Cursor query = this.f18572c.query("Poi", (String[]) null, String.format("%s=? AND %s=?", new Object[]{"id", SVGParser.XML_STYLESHEET_ATTR_TYPE}), new String[]{str, "1"}, (String) null, (String) null, (String) null);
        query.moveToFirst();
        if (!query.isAfterLast()) {
            return mo5505a(query);
        }
        return null;
    }

    /* renamed from: c */
    public void mo5511c() {
        super.mo5511c();
        this.f18572c.execSQL("CREATE TABLE IF NOT EXISTS Poi (_id INT,id TEXT,name TEXT,map_name TEXT,my_order INT,ori_my_order INT,type INT,is_history INT,name_cht TEXT,name_en TEXT,map_name_cht TEXT,map_name_en TEXT,rid TEXT)");
        this.f18572c.setLocale(Locale.getDefault());
    }

    /* renamed from: d */
    public Cursor mo5512d(String str) {
        String[] strArr;
        String str2;
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(" ");
            if (split.length != 0) {
                String a = m6016a(f4404m, split.length);
                strArr = m6017b(split, f4404m.length);
                str2 = a;
                return this.f18572c.query("Poi", (String[]) null, str2, strArr, (String) null, (String) null, "is_history DESC, name COLLATE LOCALIZED ASC");
            }
        }
        str2 = null;
        strArr = null;
        return this.f18572c.query("Poi", (String[]) null, str2, strArr, (String) null, (String) null, "is_history DESC, name COLLATE LOCALIZED ASC");
    }

    /* renamed from: e */
    public ArrayList<C1320c> mo5513e() {
        ArrayList<C1320c> arrayList = new ArrayList<>();
        Cursor query = this.f18572c.query("Poi", (String[]) null, "is_history>?", new String[]{"0"}, (String) null, (String) null, "my_order DESC");
        query.moveToFirst();
        int columnIndex = query.getColumnIndex("_id");
        int columnIndex2 = query.getColumnIndex("id");
        int columnIndex3 = query.getColumnIndex("name");
        int columnIndex4 = query.getColumnIndex("map_name");
        int columnIndex5 = query.getColumnIndex(SVGParser.XML_STYLESHEET_ATTR_TYPE);
        int columnIndex6 = query.getColumnIndex("ori_my_order");
        int columnIndex7 = query.getColumnIndex("is_history");
        while (!query.isAfterLast()) {
            try {
                C1320c cVar = new C1320c();
                cVar.f4631o = query.getInt(columnIndex);
                cVar.mo21135b(query.getString(columnIndex2));
                cVar.mo21131a(query.getString(columnIndex3));
                cVar.mo21137c(query.getString(columnIndex4));
                cVar.mo21130a(query.getInt(columnIndex5));
                cVar.f4633q = query.getInt(columnIndex6);
                cVar.f4632p = query.getInt(columnIndex7);
                arrayList.add(cVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
            query.moveToNext();
        }
        query.close();
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: e */
    public void mo5514e(String str) {
        mo5511c();
        if (str.equals("Poi")) {
            mo17138a("Poi", f4403l);
        }
    }
}
