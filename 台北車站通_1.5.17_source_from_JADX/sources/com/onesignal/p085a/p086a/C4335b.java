package com.onesignal.p085a.p086a;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.onesignal.a.a.b */
public class C4335b {
    /* renamed from: a */
    public static void m17282a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public static void m17283a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
