package p208e.p209a.p210a.p211a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: e.a.a.a.g */
class C6201g extends ContextWrapper {

    /* renamed from: a */
    private final String f17309a;

    /* renamed from: b */
    private final String f17310b;

    public C6201g(Context context, String str, String str2) {
        super(context);
        this.f17310b = str;
        this.f17309a = str2;
    }

    public File getCacheDir() {
        return new File(super.getCacheDir(), this.f17309a);
    }

    public File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.f17309a);
        file.mkdirs();
        return new File(file, str);
    }

    @TargetApi(8)
    public File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.f17309a);
    }

    @TargetApi(8)
    public File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.f17309a);
    }

    public File getFilesDir() {
        return new File(super.getFilesDir(), this.f17309a);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        return super.getSharedPreferences(this.f17310b + ":" + str, i);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    @TargetApi(11)
    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }
}
