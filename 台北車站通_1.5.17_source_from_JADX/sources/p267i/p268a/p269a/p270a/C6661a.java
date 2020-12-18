package p267i.p268a.p269a.p270a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PointF;
import java.util.ArrayList;
import p267i.p274b.p277b.C6715b;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.util.C7159c;

/* renamed from: i.a.a.a.a */
public class C6661a extends C6715b {

    /* renamed from: j */
    private static final String[] f18449j = {"id", "is_default", "info", "info_zh_cht", "img_url", "img_url_zh_cht", "img_type", "azimuth", "scale", "env_android", "updated_at", "rid"};

    /* renamed from: k */
    private static final String[] f18450k = {"id", "name", SVGParser.XML_STYLESHEET_ATTR_TYPE, "uuid", "major", "minor", "ori_x", "ori_y", "power", "power_update_at", "map_id", "updated_at"};

    /* renamed from: l */
    private static final String[] f18451l = {"id", SVGParser.XML_STYLESHEET_ATTR_TYPE, "ori_x", "ori_y", "map_id", "updated_at", "area"};

    /* renamed from: m */
    private static final String[] f18452m = {"id", "node_a", "node_b", "width", "map_id", SVGParser.XML_STYLESHEET_ATTR_TYPE, "updated_at"};

    /* renamed from: n */
    private static final String[] f18453n = {"id", "name", "name_zh_cht", SVGParser.XML_STYLESHEET_ATTR_TYPE, "subtype", "mark_img_url", "store_img_url", "description", "description_zh_cht", "ori_x", "ori_y", "map_id", "updated_at", "rid"};

    /* renamed from: o */
    private static final String[] f18454o = {"id", "name", "name_zh_cht", SVGParser.XML_STYLESHEET_ATTR_TYPE, "ori_x", "ori_y", "lat", "lng", "map_id", "updated_at", "rid"};

    public C6661a(Context context) {
        super(context, "NavinMapDB", 3);
    }

    /* renamed from: g */
    private void m25312g(ArrayList<String> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            super.mo17174b("id", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    /* renamed from: a */
    public void mo17092a() {
        super.mo17092a();
        this.f18655c.execSQL("CREATE TABLE IF NOT EXISTS Map (id INT PRIMARY KEY,is_default INT,info TEXT,info_zh_cht TEXT,img_url TEXT,img_url_zh_cht TEXT,img_type TEXT,azimuth REAL,scale REAL,env_android TEXT,updated_at TEXT,rid TEXT)");
        this.f18655c.execSQL("CREATE TABLE IF NOT EXISTS Beacon (id INT PRIMARY KEY,name TEXT,type TEXT,uuid TEXT,major INT,minor INT,ori_x REAL,ori_y REAL,power INT,power_update_at TEXT,map_id INT,updated_at TEXT)");
        this.f18655c.execSQL("CREATE TABLE IF NOT EXISTS Node (id INT PRIMARY KEY,type TEXT,ori_x REAL,ori_y REAL,map_id INT,updated_at TEXT,area TEXT)");
        this.f18655c.execSQL("CREATE TABLE IF NOT EXISTS NodeList (id INT PRIMARY KEY,node_a INT,node_b INT,width REAL,map_id INT,type TEXT,updated_at TEXT)");
        this.f18655c.execSQL("CREATE TABLE IF NOT EXISTS Store (id INT PRIMARY KEY,name TEXT,name_zh_cht TEXT,type TEXT,subtype TEXT,mark_img_url TEXT,store_img_url TEXT,description TEXT,description_zh_cht TEXT,ori_x REAL,ori_y REAL,map_id INT,updated_at TEXT,rid TEXT)");
        this.f18655c.execSQL("CREATE TABLE IF NOT EXISTS Facility (id INT PRIMARY KEY,name TEXT,name_zh_cht TEXT,type TEXT,ori_x REAL,ori_y REAL,lat REAL,lng REAL,map_id INT,updated_at TEXT,rid TEXT)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17093a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1) {
            sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"Node", "area"}));
            C6667g.m25363e(this.f18656d, "2018-03-01 00:00:00");
        } else if (i != 2) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"Map", "rid"}));
        C6667g.m25359c(this.f18656d, "1970-01-01 00:00:00");
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"Store", "rid"}));
        C6667g.m25366g(this.f18656d, "1970-01-01 00:00:00");
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"Facility", "rid"}));
        C6667g.m25369h(this.f18656d, "1970-01-01 00:00:00");
    }

    /* renamed from: a */
    public void mo17094a(ArrayList<String> arrayList) {
        m25312g(arrayList);
    }

    /* renamed from: b */
    public void mo17095b(String str) {
        String[] strArr;
        mo17092a();
        String str2 = "Map";
        if (str.equals(str2)) {
            strArr = f18449j;
        } else {
            str2 = "Beacon";
            if (str.equals(str2)) {
                strArr = f18450k;
            } else {
                str2 = "Node";
                if (str.equals(str2)) {
                    strArr = f18451l;
                } else {
                    str2 = "NodeList";
                    if (str.equals(str2)) {
                        strArr = f18452m;
                    } else {
                        str2 = "Store";
                        if (str.equals(str2)) {
                            strArr = f18453n;
                        } else {
                            str2 = "Facility";
                            if (str.equals(str2)) {
                                strArr = f18454o;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
        mo17172a(str2, strArr);
    }

    /* renamed from: b */
    public void mo17096b(ArrayList<String> arrayList) {
        m25312g(arrayList);
    }

    /* renamed from: c */
    public String mo17097c(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("'", "''");
    }

    /* renamed from: c */
    public void mo17098c(ArrayList<String> arrayList) {
        m25312g(arrayList);
    }

    /* renamed from: d */
    public void mo17099d() {
        mo17171a("Map");
        mo17171a("Beacon");
        mo17171a("Node");
        mo17171a("NodeList");
        mo17171a("Store");
        mo17171a("Facility");
    }

    /* renamed from: d */
    public void mo17100d(ArrayList<String> arrayList) {
        m25312g(arrayList);
    }

    /* renamed from: e */
    public void mo17101e() {
        mo17092a();
        mo17175c();
    }

    /* renamed from: e */
    public void mo17102e(ArrayList<String> arrayList) {
        m25312g(arrayList);
    }

    /* renamed from: f */
    public ArrayList<C7112l.C7120h> mo17103f() {
        int i;
        String str;
        String a = C7159c.m26968a();
        String format = String.format("SELECT * FROM %s ORDER BY %s COLLATE LOCALIZED ASC", new Object[]{"Map", (a.equals("zh-cht") || a.equals("zh-chs")) ? "info_zh_cht" : "info"});
        ArrayList<C7112l.C7120h> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f18655c.rawQuery(format, (String[]) null);
        rawQuery.moveToFirst();
        int columnIndex = rawQuery.getColumnIndex("id");
        int columnIndex2 = rawQuery.getColumnIndex("is_default");
        int columnIndex3 = rawQuery.getColumnIndex("info");
        int columnIndex4 = rawQuery.getColumnIndex("info_zh_cht");
        int columnIndex5 = rawQuery.getColumnIndex("img_url");
        rawQuery.getColumnIndex("img_url_zh_cht");
        int columnIndex6 = rawQuery.getColumnIndex("img_type");
        int columnIndex7 = rawQuery.getColumnIndex("azimuth");
        int columnIndex8 = rawQuery.getColumnIndex("scale");
        int columnIndex9 = rawQuery.getColumnIndex("env_android");
        int columnIndex10 = rawQuery.getColumnIndex("rid");
        while (!rawQuery.isAfterLast()) {
            try {
                C7112l.C7120h hVar = new C7112l.C7120h();
                ArrayList<C7112l.C7120h> arrayList2 = arrayList;
                try {
                    hVar.f19619a = rawQuery.getString(columnIndex);
                    i = columnIndex;
                    try {
                        hVar.f19620b = rawQuery.getInt(columnIndex2) == 1;
                        hVar.f19622d = rawQuery.getString(columnIndex4);
                        hVar.f19623e = rawQuery.getString(columnIndex3);
                        hVar.f19625g = rawQuery.getString(columnIndex6);
                        hVar.f19626h = rawQuery.getFloat(columnIndex7);
                        hVar.f19627i = rawQuery.getFloat(columnIndex8);
                        hVar.f19628j = rawQuery.getInt(columnIndex9);
                        hVar.f19629k = rawQuery.getString(columnIndex10);
                        if (!a.equals("zh-cht")) {
                            if (!a.equals("zh-chs")) {
                                hVar.f19621c = hVar.f19623e;
                                str = rawQuery.getString(columnIndex5);
                                hVar.f19624f = str;
                                arrayList = arrayList2;
                                arrayList.add(hVar);
                                rawQuery.moveToNext();
                                columnIndex = i;
                            }
                        }
                        hVar.f19621c = hVar.f19622d;
                        str = rawQuery.getString(columnIndex5);
                        hVar.f19624f = str;
                        arrayList = arrayList2;
                        try {
                            arrayList.add(hVar);
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        arrayList = arrayList2;
                        e.printStackTrace();
                        rawQuery.moveToNext();
                        columnIndex = i;
                    }
                } catch (Exception e3) {
                    e = e3;
                    i = columnIndex;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    rawQuery.moveToNext();
                    columnIndex = i;
                }
            } catch (Exception e4) {
                e = e4;
                i = columnIndex;
                e.printStackTrace();
                rawQuery.moveToNext();
                columnIndex = i;
            }
            rawQuery.moveToNext();
            columnIndex = i;
        }
        rawQuery.close();
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: f */
    public void mo17104f(ArrayList<String> arrayList) {
        m25312g(arrayList);
    }

    /* renamed from: g */
    public ArrayList<C7112l.C7119g> mo17105g() {
        String format = String.format("SELECT * FROM %s", new Object[]{"Beacon"});
        ArrayList<C7112l.C7119g> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f18655c.rawQuery(format, (String[]) null);
        rawQuery.moveToFirst();
        int columnIndex = rawQuery.getColumnIndex("id");
        int columnIndex2 = rawQuery.getColumnIndex("name");
        int columnIndex3 = rawQuery.getColumnIndex(SVGParser.XML_STYLESHEET_ATTR_TYPE);
        int columnIndex4 = rawQuery.getColumnIndex("uuid");
        int columnIndex5 = rawQuery.getColumnIndex("major");
        int columnIndex6 = rawQuery.getColumnIndex("minor");
        int columnIndex7 = rawQuery.getColumnIndex("ori_x");
        int columnIndex8 = rawQuery.getColumnIndex("ori_y");
        int columnIndex9 = rawQuery.getColumnIndex("power");
        int columnIndex10 = rawQuery.getColumnIndex("map_id");
        while (!rawQuery.isAfterLast()) {
            try {
                C7112l.C7119g gVar = new C7112l.C7119g();
                gVar.f19613j = rawQuery.getString(columnIndex);
                gVar.f19614k = rawQuery.getString(columnIndex2);
                gVar.f19615l = rawQuery.getString(columnIndex3);
                gVar.f18676a = rawQuery.getString(columnIndex4);
                gVar.f18677b = rawQuery.getInt(columnIndex5);
                gVar.f18678c = rawQuery.getInt(columnIndex6);
                gVar.f19616m = new PointF(rawQuery.getFloat(columnIndex7), rawQuery.getFloat(columnIndex8));
                gVar.f18684i = rawQuery.getInt(columnIndex9);
                gVar.f19617n = rawQuery.getString(columnIndex10);
                arrayList.add(gVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
            rawQuery.moveToNext();
        }
        rawQuery.close();
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: h */
    public ArrayList<C7112l.C7122j> mo17106h() {
        String format = String.format("SELECT * FROM %s", new Object[]{"Node"});
        ArrayList<C7112l.C7122j> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f18655c.rawQuery(format, (String[]) null);
        rawQuery.moveToFirst();
        int columnIndex = rawQuery.getColumnIndex("id");
        int columnIndex2 = rawQuery.getColumnIndex(SVGParser.XML_STYLESHEET_ATTR_TYPE);
        int columnIndex3 = rawQuery.getColumnIndex("ori_x");
        int columnIndex4 = rawQuery.getColumnIndex("ori_y");
        int columnIndex5 = rawQuery.getColumnIndex("map_id");
        int columnIndex6 = rawQuery.getColumnIndex("area");
        while (!rawQuery.isAfterLast()) {
            try {
                C7112l.C7122j jVar = new C7112l.C7122j();
                jVar.f19648a = rawQuery.getInt(columnIndex);
                jVar.f19649b = rawQuery.getString(columnIndex2);
                jVar.f19650c = new PointF(rawQuery.getFloat(columnIndex3), rawQuery.getFloat(columnIndex4));
                jVar.f19651d = rawQuery.getString(columnIndex5);
                C7112l.C7125m.m26805a(jVar, rawQuery.getString(columnIndex6));
                arrayList.add(jVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
            rawQuery.moveToNext();
        }
        rawQuery.close();
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<C7112l.C7121i> mo17107i() {
        String format = String.format("SELECT * FROM %s", new Object[]{"NodeList"});
        ArrayList<C7112l.C7121i> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f18655c.rawQuery(format, (String[]) null);
        rawQuery.moveToFirst();
        int columnIndex = rawQuery.getColumnIndex("id");
        int columnIndex2 = rawQuery.getColumnIndex("node_a");
        int columnIndex3 = rawQuery.getColumnIndex("node_b");
        int columnIndex4 = rawQuery.getColumnIndex("width");
        int columnIndex5 = rawQuery.getColumnIndex("map_id");
        int columnIndex6 = rawQuery.getColumnIndex(SVGParser.XML_STYLESHEET_ATTR_TYPE);
        while (!rawQuery.isAfterLast()) {
            try {
                C7112l.C7121i iVar = new C7112l.C7121i();
                iVar.f19638a = rawQuery.getString(columnIndex);
                iVar.f19639b = rawQuery.getInt(columnIndex2);
                iVar.f19640c = rawQuery.getInt(columnIndex3);
                iVar.f19646i = rawQuery.getFloat(columnIndex4);
                iVar.f19643f = rawQuery.getString(columnIndex5);
                iVar.f19644g = rawQuery.getString(columnIndex6);
                arrayList.add(iVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
            rawQuery.moveToNext();
        }
        rawQuery.close();
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: j */
    public ArrayList<C7112l.C7124l> mo17108j() {
        int i;
        int i2;
        String str;
        String format = String.format("SELECT * FROM %s", new Object[]{"Store"});
        ArrayList<C7112l.C7124l> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f18655c.rawQuery(format, (String[]) null);
        rawQuery.moveToFirst();
        int columnIndex = rawQuery.getColumnIndex("id");
        int columnIndex2 = rawQuery.getColumnIndex("name");
        int columnIndex3 = rawQuery.getColumnIndex("name_zh_cht");
        int columnIndex4 = rawQuery.getColumnIndex(SVGParser.XML_STYLESHEET_ATTR_TYPE);
        int columnIndex5 = rawQuery.getColumnIndex("subtype");
        int columnIndex6 = rawQuery.getColumnIndex("mark_img_url");
        int columnIndex7 = rawQuery.getColumnIndex("store_img_url");
        int columnIndex8 = rawQuery.getColumnIndex("description");
        int columnIndex9 = rawQuery.getColumnIndex("description_zh_cht");
        int columnIndex10 = rawQuery.getColumnIndex("ori_x");
        int columnIndex11 = rawQuery.getColumnIndex("ori_y");
        int columnIndex12 = rawQuery.getColumnIndex("map_id");
        int columnIndex13 = rawQuery.getColumnIndex("rid");
        while (!rawQuery.isAfterLast()) {
            try {
                C7112l.C7124l lVar = new C7112l.C7124l();
                ArrayList<C7112l.C7124l> arrayList2 = arrayList;
                try {
                    lVar.f19656b = rawQuery.getString(columnIndex);
                    lVar.f19658d = rawQuery.getString(columnIndex3);
                    lVar.f19659e = rawQuery.getString(columnIndex2);
                    lVar.f19668n = rawQuery.getInt(columnIndex4);
                    lVar.f19669o = rawQuery.getInt(columnIndex5);
                    lVar.f19670p = rawQuery.getString(columnIndex6);
                    lVar.f19671q = rawQuery.getString(columnIndex7);
                    i2 = columnIndex;
                } catch (Exception e) {
                    e = e;
                    i2 = columnIndex;
                    i = columnIndex2;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    rawQuery.moveToNext();
                    columnIndex = i2;
                    columnIndex2 = i;
                }
                try {
                    i = columnIndex2;
                    try {
                        lVar.f19661g = new PointF(rawQuery.getFloat(columnIndex10), rawQuery.getFloat(columnIndex11));
                        lVar.f19660f = rawQuery.getString(columnIndex12);
                        lVar.f19662h = rawQuery.getString(columnIndex13);
                        lVar.f19655a = -Integer.parseInt(lVar.f19656b);
                        if (C7159c.m26968a().equals("zh-cht")) {
                            lVar.f19657c = lVar.f19658d;
                            str = rawQuery.getString(columnIndex9);
                        } else {
                            lVar.f19657c = lVar.f19659e;
                            str = rawQuery.getString(columnIndex8);
                        }
                        lVar.f19672r = str;
                        arrayList = arrayList2;
                        try {
                            arrayList.add(lVar);
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        arrayList = arrayList2;
                        e.printStackTrace();
                        rawQuery.moveToNext();
                        columnIndex = i2;
                        columnIndex2 = i;
                    }
                } catch (Exception e4) {
                    e = e4;
                    i = columnIndex2;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    rawQuery.moveToNext();
                    columnIndex = i2;
                    columnIndex2 = i;
                }
            } catch (Exception e5) {
                e = e5;
                i2 = columnIndex;
                i = columnIndex2;
                e.printStackTrace();
                rawQuery.moveToNext();
                columnIndex = i2;
                columnIndex2 = i;
            }
            rawQuery.moveToNext();
            columnIndex = i2;
            columnIndex2 = i;
        }
        rawQuery.close();
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e1 A[Catch:{ Exception -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3 A[SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<p299tw.navin.navinmap.map.C7112l.C7117e> mo17109k() {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "Facility"
            r0[r2] = r3
            java.lang.String r2 = "SELECT * FROM %s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r17
            android.database.sqlite.SQLiteDatabase r4 = r3.f18655c
            r5 = 0
            android.database.Cursor r4 = r4.rawQuery(r0, r5)
            r4.moveToFirst()
            java.lang.String r0 = "id"
            int r6 = r4.getColumnIndex(r0)
            java.lang.String r0 = "name"
            int r7 = r4.getColumnIndex(r0)
            java.lang.String r0 = "name_zh_cht"
            int r8 = r4.getColumnIndex(r0)
            java.lang.String r0 = "type"
            int r9 = r4.getColumnIndex(r0)
            java.lang.String r0 = "ori_x"
            int r10 = r4.getColumnIndex(r0)
            java.lang.String r0 = "ori_y"
            int r11 = r4.getColumnIndex(r0)
            java.lang.String r0 = "lat"
            int r12 = r4.getColumnIndex(r0)
            java.lang.String r0 = "lng"
            int r13 = r4.getColumnIndex(r0)
            java.lang.String r0 = "map_id"
            int r14 = r4.getColumnIndex(r0)
            java.lang.String r0 = "rid"
            int r15 = r4.getColumnIndex(r0)
        L_0x005b:
            boolean r0 = r4.isAfterLast()
            if (r0 != 0) goto L_0x00fd
            tw.navin.navinmap.map.l$e r0 = new tw.navin.navinmap.map.l$e     // Catch:{ Exception -> 0x00ed }
            r0.<init>()     // Catch:{ Exception -> 0x00ed }
            java.lang.String r5 = r4.getString(r6)     // Catch:{ Exception -> 0x00ed }
            r0.f19656b = r5     // Catch:{ Exception -> 0x00ed }
            java.lang.String r5 = r4.getString(r8)     // Catch:{ Exception -> 0x00ed }
            r0.f19658d = r5     // Catch:{ Exception -> 0x00ed }
            java.lang.String r5 = r4.getString(r7)     // Catch:{ Exception -> 0x00ed }
            r0.f19659e = r5     // Catch:{ Exception -> 0x00ed }
            int r5 = r4.getInt(r9)     // Catch:{ Exception -> 0x00ed }
            r0.f19608n = r5     // Catch:{ Exception -> 0x00ed }
            android.graphics.PointF r5 = new android.graphics.PointF     // Catch:{ Exception -> 0x00ed }
            float r1 = r4.getFloat(r10)     // Catch:{ Exception -> 0x00e9 }
            float r3 = r4.getFloat(r11)     // Catch:{ Exception -> 0x00e9 }
            r5.<init>(r1, r3)     // Catch:{ Exception -> 0x00e9 }
            r0.f19661g = r5     // Catch:{ Exception -> 0x00e9 }
            r1 = r6
            double r5 = r4.getDouble(r12)     // Catch:{ Exception -> 0x00e7 }
            r0.f19609o = r5     // Catch:{ Exception -> 0x00e7 }
            double r5 = r4.getDouble(r13)     // Catch:{ Exception -> 0x00e7 }
            r0.f19610p = r5     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r3 = r4.getString(r14)     // Catch:{ Exception -> 0x00e7 }
            r0.f19660f = r3     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r3 = r4.getString(r15)     // Catch:{ Exception -> 0x00e7 }
            r0.f19662h = r3     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r3 = r0.f19656b     // Catch:{ Exception -> 0x00e7 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x00e7 }
            r0.f19655a = r3     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r3 = p299tw.navin.navinmap.util.C7159c.m26968a()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r5 = "zh-cht"
            boolean r3 = r3.equals(r5)     // Catch:{ Exception -> 0x00e7 }
            if (r3 == 0) goto L_0x00bf
            java.lang.String r3 = r0.f19658d     // Catch:{ Exception -> 0x00e7 }
        L_0x00bc:
            r0.f19657c = r3     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00c2
        L_0x00bf:
            java.lang.String r3 = r0.f19659e     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00bc
        L_0x00c2:
            int r3 = r0.f19608n     // Catch:{ Exception -> 0x00e7 }
            r5 = 1
            if (r3 == r5) goto L_0x00d8
            int r3 = r0.f19608n     // Catch:{ Exception -> 0x00e7 }
            r5 = 33
            if (r3 == r5) goto L_0x00d6
            int r3 = r0.f19608n     // Catch:{ Exception -> 0x00e7 }
            r5 = 34
            if (r3 != r5) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r3 = 1
            goto L_0x00db
        L_0x00d6:
            r3 = 1
            goto L_0x00d9
        L_0x00d8:
            r3 = r5
        L_0x00d9:
            r0.f19665k = r3     // Catch:{ Exception -> 0x00e5 }
        L_0x00db:
            int r5 = r0.f19608n     // Catch:{ Exception -> 0x00e5 }
            r6 = 28
            if (r5 == r6) goto L_0x00f3
            r2.add(r0)     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00f3
        L_0x00e5:
            r0 = move-exception
            goto L_0x00f0
        L_0x00e7:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e9:
            r0 = move-exception
            r1 = r6
        L_0x00eb:
            r3 = 1
            goto L_0x00f0
        L_0x00ed:
            r0 = move-exception
            r3 = r1
            r1 = r6
        L_0x00f0:
            r0.printStackTrace()
        L_0x00f3:
            r4.moveToNext()
            r5 = 0
            r6 = r1
            r1 = r3
            r3 = r17
            goto L_0x005b
        L_0x00fd:
            r4.close()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0109
            r16 = 0
            goto L_0x010b
        L_0x0109:
            r16 = r2
        L_0x010b:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p267i.p268a.p269a.p270a.C6661a.mo17109k():java.util.ArrayList");
    }
}
