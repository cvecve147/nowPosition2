package com.onesignal;

/* renamed from: com.onesignal.Qa */
class C4286Qa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f12707a;

    C4286Qa(int i) {
        this.f12707a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008e A[SYNTHETIC, Splitter:B:20:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8 A[SYNTHETIC, Splitter:B:27:0x00a8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            java.lang.String r0 = "dismissed"
            java.lang.String r1 = "notification"
            java.lang.String r2 = "Error closing transaction! "
            android.content.Context r3 = com.onesignal.C4306Xa.f12759e
            com.onesignal.cb r3 = com.onesignal.C4353cb.m17322a((android.content.Context) r3)
            r4 = 0
            android.database.sqlite.SQLiteDatabase r3 = r3.mo12481b()     // Catch:{ Throwable -> 0x006e }
            r3.beginTransaction()     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            r5.<init>()     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            java.lang.String r6 = "android_notification_id = "
            r5.append(r6)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            int r6 = r8.f12707a     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            java.lang.String r6 = " AND "
            r5.append(r6)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            java.lang.String r6 = "opened"
            r5.append(r6)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            java.lang.String r6 = " = 0 AND "
            r5.append(r6)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            java.lang.String r6 = " = 0"
            r5.append(r6)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            r6.<init>()     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            r7 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            r6.put(r0, r7)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            int r0 = r3.update(r1, r6, r5, r4)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            if (r0 <= 0) goto L_0x0058
            android.content.Context r0 = com.onesignal.C4306Xa.f12759e     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            int r4 = r8.f12707a     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            com.onesignal.C4322Y.m17228a(r0, r3, r4)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
        L_0x0058:
            android.content.Context r0 = com.onesignal.C4306Xa.f12759e     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            com.onesignal.C4381j.m17375a((android.database.sqlite.SQLiteDatabase) r3, (android.content.Context) r0)     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            r3.setTransactionSuccessful()     // Catch:{ Throwable -> 0x0068, all -> 0x0066 }
            if (r3 == 0) goto L_0x0098
            r3.endTransaction()     // Catch:{ Throwable -> 0x0092 }
            goto L_0x0098
        L_0x0066:
            r0 = move-exception
            goto L_0x00a6
        L_0x0068:
            r0 = move-exception
            r4 = r3
            goto L_0x006f
        L_0x006b:
            r0 = move-exception
            r3 = r4
            goto L_0x00a6
        L_0x006e:
            r0 = move-exception
        L_0x006f:
            com.onesignal.Xa$j r3 = com.onesignal.C4306Xa.C4316j.ERROR     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r5.<init>()     // Catch:{ all -> 0x006b }
            java.lang.String r6 = "Error marking a notification id "
            r5.append(r6)     // Catch:{ all -> 0x006b }
            int r6 = r8.f12707a     // Catch:{ all -> 0x006b }
            r5.append(r6)     // Catch:{ all -> 0x006b }
            java.lang.String r6 = " as dismissed! "
            r5.append(r6)     // Catch:{ all -> 0x006b }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x006b }
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r3, (java.lang.String) r5, (java.lang.Throwable) r0)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0098
            r4.endTransaction()     // Catch:{ Throwable -> 0x0092 }
            goto L_0x0098
        L_0x0092:
            r0 = move-exception
            com.onesignal.Xa$j r3 = com.onesignal.C4306Xa.C4316j.ERROR
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r3, (java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x0098:
            android.content.Context r0 = com.onesignal.C4306Xa.f12759e
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            int r1 = r8.f12707a
            r0.cancel(r1)
            return
        L_0x00a6:
            if (r3 == 0) goto L_0x00b2
            r3.endTransaction()     // Catch:{ Throwable -> 0x00ac }
            goto L_0x00b2
        L_0x00ac:
            r1 = move-exception
            com.onesignal.Xa$j r3 = com.onesignal.C4306Xa.C4316j.ERROR
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r3, (java.lang.String) r2, (java.lang.Throwable) r1)
        L_0x00b2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4286Qa.run():void");
    }
}
