package p299tw.navin.navinmap.util;

import android.content.Context;
import android.os.Vibrator;

/* renamed from: tw.navin.navinmap.util.m */
public class C7174m {
    /* renamed from: a */
    public static void m27005a(Context context) {
        m27006a(context, new long[]{50, 200, 100, 200, 100, 200}, -1);
    }

    /* renamed from: a */
    private static void m27006a(Context context, long[] jArr, int i) {
        ((Vibrator) context.getSystemService("vibrator")).vibrate(jArr, i);
    }
}
