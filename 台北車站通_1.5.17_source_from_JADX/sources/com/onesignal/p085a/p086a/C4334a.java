package com.onesignal.p085a.p086a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: com.onesignal.a.a.a */
public class C4334a {
    /* renamed from: a */
    public static boolean m17281a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }
}
