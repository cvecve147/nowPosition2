package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.onesignal.C4306Xa;
import java.util.ArrayList;
import org.apache.http.HttpStatus;

/* renamed from: com.onesignal.cb */
public class C4353cb extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final String[] f12874a = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* renamed from: b */
    private static C4353cb f12875b;

    C4353cb(Context context) {
        super(context, "OneSignal.db", (SQLiteDatabase.CursorFactory) null, m17328d());
    }

    /* renamed from: a */
    public static synchronized C4353cb m17322a(Context context) {
        C4353cb cbVar;
        synchronized (C4353cb.class) {
            if (f12875b == null) {
                f12875b = new C4353cb(context.getApplicationContext());
            }
            cbVar = f12875b;
        }
        return cbVar;
    }

    /* renamed from: a */
    private static void m17323a(SQLiteDatabase sQLiteDatabase) {
        m17325a(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        m17325a(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    /* renamed from: a */
    private static void m17324a(SQLiteDatabase sQLiteDatabase, int i) {
        if (i < 2) {
            m17323a(sQLiteDatabase);
        }
        if (i < 3) {
            m17326b(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    private static void m17325a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m17326b(SQLiteDatabase sQLiteDatabase) {
        m17325a(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        m17325a(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        m17325a(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    /* renamed from: c */
    static StringBuilder m17327c() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (currentTimeMillis - 604800) + " AND " + "dismissed" + " = 0 AND " + "opened" + " = 0 AND " + "is_summary" + " = 0");
        if (C4370gb.m17355a(C4370gb.f12909a, "OS_RESTORE_TTL_FILTER", true)) {
            sb.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb;
    }

    /* renamed from: d */
    private static int m17328d() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized SQLiteDatabase mo12480a() {
        int i = 0;
        while (true) {
            try {
            } catch (Throwable th) {
                i++;
                if (i < 5) {
                    SystemClock.sleep((long) (i * HttpStatus.SC_BAD_REQUEST));
                } else {
                    throw th;
                }
            }
        }
        return getReadableDatabase();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized SQLiteDatabase mo12481b() {
        int i = 0;
        while (true) {
            try {
            } catch (Throwable th) {
                i++;
                if (i < 5) {
                    SystemClock.sleep((long) (i * HttpStatus.SC_BAD_REQUEST));
                } else {
                    throw th;
                }
            }
        }
        return getWritableDatabase();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);");
        for (String execSQL : f12874a) {
            sQLiteDatabase.execSQL(execSQL);
        }
    }

    /* JADX INFO: finally extract failed */
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C4306Xa.m17135a(C4306Xa.C4316j.WARN, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.");
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", (String[]) null);
        try {
            ArrayList<String> arrayList = new ArrayList<>(rawQuery.getCount());
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(0));
            }
            for (String str : arrayList) {
                if (!str.startsWith("sqlite_")) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            rawQuery.close();
            onCreate(sQLiteDatabase);
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            m17324a(sQLiteDatabase, i);
        } catch (SQLiteException e) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Error in upgrade, migration may have already run! Skipping!", (Throwable) e);
        }
    }
}
