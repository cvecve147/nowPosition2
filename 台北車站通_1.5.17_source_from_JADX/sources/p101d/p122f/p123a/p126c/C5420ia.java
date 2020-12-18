package p101d.p122f.p123a.p126c;

import android.app.ActivityManager;
import android.os.Build;
import java.util.List;
import java.util.Map;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;

/* renamed from: d.f.a.c.ia */
class C5420ia {

    /* renamed from: a */
    private static final C5399b f15282a = C5399b.m20722a("0");

    /* renamed from: b */
    private static final C5399b f15283b = C5399b.m20722a("Unity");

    /* renamed from: a */
    private static int m20811a() {
        return C5407f.m20749a(1, f15282a) + 0 + C5407f.m20749a(2, f15282a) + C5407f.m20748a(3, 0);
    }

    /* renamed from: a */
    private static int m20812a(int i, C5399b bVar, C5399b bVar2, int i2, long j, long j2, boolean z, Map<C6091u.C6092a, String> map, int i3, C5399b bVar3, C5399b bVar4) {
        int i4 = 0;
        int a = C5407f.m20749a(1, bVar) + 0 + C5407f.m20747a(3, i) + (bVar2 == null ? 0 : C5407f.m20749a(4, bVar2)) + C5407f.m20761c(5, i2) + C5407f.m20748a(6, j) + C5407f.m20748a(7, j2) + C5407f.m20750a(10, z);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                int a2 = m20821a((C6091u.C6092a) next.getKey(), (String) next.getValue());
                a += C5407f.m20763e(11) + C5407f.m20760c(a2) + a2;
            }
        }
        int c = a + C5407f.m20761c(12, i3) + (bVar3 == null ? 0 : C5407f.m20749a(13, bVar3));
        if (bVar4 != null) {
            i4 = C5407f.m20749a(14, bVar4);
        }
        return c + i4;
    }

    /* renamed from: a */
    private static int m20813a(long j, String str, C5428la laVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, C5399b bVar, C5399b bVar2, Float f, int i3, boolean z, long j2, long j3, C5399b bVar3) {
        long j4 = j;
        int a = C5407f.m20748a(1, j) + 0 + C5407f.m20749a(2, C5399b.m20722a(str));
        int a2 = m20820a(laVar, thread, stackTraceElementArr, threadArr, list, i, bVar, bVar2, map, runningAppProcessInfo, i2);
        int a3 = m20822a(f, i3, z, i2, j2, j3);
        int e = a + C5407f.m20763e(3) + C5407f.m20760c(a2) + a2 + C5407f.m20763e(5) + C5407f.m20760c(a3) + a3;
        if (bVar3 == null) {
            return e;
        }
        int a4 = m20814a(bVar3);
        return e + C5407f.m20763e(6) + C5407f.m20760c(a4) + a4;
    }

    /* renamed from: a */
    private static int m20814a(C5399b bVar) {
        return C5407f.m20749a(1, bVar);
    }

    /* renamed from: a */
    private static int m20815a(C5399b bVar, C5399b bVar2) {
        int a = C5407f.m20748a(1, 0) + 0 + C5407f.m20748a(2, 0) + C5407f.m20749a(3, bVar);
        return bVar2 != null ? a + C5407f.m20749a(4, bVar2) : a;
    }

    /* renamed from: a */
    private static int m20816a(C5399b bVar, C5399b bVar2, C5399b bVar3, C5399b bVar4, C5399b bVar5, int i, C5399b bVar6) {
        int b = m20841b(bVar2);
        int a = C5407f.m20749a(1, bVar) + 0 + C5407f.m20749a(2, bVar3) + C5407f.m20749a(3, bVar4) + C5407f.m20763e(5) + C5407f.m20760c(b) + b + C5407f.m20749a(6, bVar5);
        if (bVar6 != null) {
            a = a + C5407f.m20749a(8, f15283b) + C5407f.m20749a(9, bVar6);
        }
        return a + C5407f.m20747a(10, i);
    }

    /* renamed from: a */
    private static int m20817a(C5399b bVar, C5399b bVar2, boolean z) {
        return C5407f.m20747a(1, 3) + 0 + C5407f.m20749a(2, bVar) + C5407f.m20749a(3, bVar2) + C5407f.m20750a(4, z);
    }

    /* renamed from: a */
    private static int m20818a(C5428la laVar, int i, int i2) {
        int i3 = 0;
        int a = C5407f.m20749a(1, C5399b.m20722a(laVar.f15296b)) + 0;
        String str = laVar.f15295a;
        if (str != null) {
            a += C5407f.m20749a(3, C5399b.m20722a(str));
        }
        int i4 = a;
        for (StackTraceElement a2 : laVar.f15297c) {
            int a3 = m20823a(a2, true);
            i4 += C5407f.m20763e(4) + C5407f.m20760c(a3) + a3;
        }
        C5428la laVar2 = laVar.f15298d;
        if (laVar2 == null) {
            return i4;
        }
        if (i < i2) {
            int a4 = m20818a(laVar2, i + 1, i2);
            return i4 + C5407f.m20763e(6) + C5407f.m20760c(a4) + a4;
        }
        while (laVar2 != null) {
            laVar2 = laVar2.f15298d;
            i3++;
        }
        return i4 + C5407f.m20761c(7, i3);
    }

    /* renamed from: a */
    private static int m20819a(C5428la laVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C5399b bVar, C5399b bVar2) {
        int a = m20825a(thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        int e = C5407f.m20763e(1) + C5407f.m20760c(a) + a + 0;
        for (int i2 = 0; i2 < length; i2++) {
            int a2 = m20825a(threadArr[i2], list.get(i2), 0, false);
            e += C5407f.m20763e(1) + C5407f.m20760c(a2) + a2;
        }
        int a3 = m20818a(laVar, 1, i);
        int a4 = m20811a();
        int a5 = m20815a(bVar, bVar2);
        return e + C5407f.m20763e(2) + C5407f.m20760c(a3) + a3 + C5407f.m20763e(3) + C5407f.m20760c(a4) + a4 + C5407f.m20763e(3) + C5407f.m20760c(a5) + a5;
    }

    /* renamed from: a */
    private static int m20820a(C5428la laVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C5399b bVar, C5399b bVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int a = m20819a(laVar, thread, stackTraceElementArr, threadArr, list, i, bVar, bVar2);
        int e = C5407f.m20763e(1) + C5407f.m20760c(a) + a;
        boolean z = false;
        int i3 = e + 0;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                int a2 = m20824a((String) next.getKey(), (String) next.getValue());
                i3 += C5407f.m20763e(2) + C5407f.m20760c(a2) + a2;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z = true;
            }
            i3 += C5407f.m20750a(3, z);
        }
        return i3 + C5407f.m20761c(4, i2);
    }

    /* renamed from: a */
    private static int m20821a(C6091u.C6092a aVar, String str) {
        return C5407f.m20747a(1, aVar.f17050i) + C5407f.m20749a(2, C5399b.m20722a(str));
    }

    /* renamed from: a */
    private static int m20822a(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + C5407f.m20746a(1, f.floatValue());
        }
        return i3 + C5407f.m20758b(2, i) + C5407f.m20750a(3, z) + C5407f.m20761c(4, i2) + C5407f.m20748a(5, j) + C5407f.m20748a(6, j2);
    }

    /* renamed from: a */
    private static int m20823a(StackTraceElement stackTraceElement, boolean z) {
        int i = 0;
        int a = C5407f.m20748a(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0) + 0 + C5407f.m20749a(2, C5399b.m20722a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            a += C5407f.m20749a(3, C5399b.m20722a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            a += C5407f.m20748a(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return a + C5407f.m20761c(5, i);
    }

    /* renamed from: a */
    private static int m20824a(String str, String str2) {
        int a = C5407f.m20749a(1, C5399b.m20722a(str));
        if (str2 == null) {
            str2 = "";
        }
        return a + C5407f.m20749a(2, C5399b.m20722a(str2));
    }

    /* renamed from: a */
    private static int m20825a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int a = C5407f.m20749a(1, C5399b.m20722a(thread.getName())) + C5407f.m20761c(2, i);
        for (StackTraceElement a2 : stackTraceElementArr) {
            int a3 = m20823a(a2, z);
            a += C5407f.m20763e(3) + C5407f.m20760c(a3) + a3;
        }
        return a;
    }

    /* renamed from: a */
    private static C5399b m20826a(String str) {
        if (str == null) {
            return null;
        }
        return C5399b.m20722a(str);
    }

    /* renamed from: a */
    private static void m20827a(C5407f fVar, int i, StackTraceElement stackTraceElement, boolean z) {
        fVar.mo14844f(i, 2);
        fVar.mo14851l(m20823a(stackTraceElement, z));
        fVar.mo14834b(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0);
        fVar.mo14835b(2, C5399b.m20722a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            fVar.mo14835b(3, C5399b.m20722a(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            fVar.mo14834b(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        fVar.mo14846g(5, i2);
    }

    /* renamed from: a */
    public static void m20828a(C5407f fVar, long j, String str, C5428la laVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, C5369V v, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) {
        C5407f fVar2 = fVar;
        String str4 = str3;
        C5399b a = C5399b.m20722a(str2);
        C5399b a2 = str4 == null ? null : C5399b.m20722a(str4.replace("-", ""));
        C5399b b = v.mo14801b();
        if (b == null) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "No log data to include with this event.");
        }
        v.mo14797a();
        fVar2.mo14844f(10, 2);
        fVar2.mo14851l(m20813a(j, str, laVar, thread, stackTraceElementArr, threadArr, list, 8, map, runningAppProcessInfo, i, a, a2, f, i2, z, j2, j3, b));
        fVar2.mo14834b(1, j);
        fVar2.mo14835b(2, C5399b.m20722a(str));
        m20832a(fVar, laVar, thread, stackTraceElementArr, threadArr, list, 8, a, a2, map, runningAppProcessInfo, i);
        m20833a(fVar, f, i2, z, i, j2, j3);
        m20829a(fVar2, b);
    }

    /* renamed from: a */
    private static void m20829a(C5407f fVar, C5399b bVar) {
        if (bVar != null) {
            fVar.mo14844f(6, 2);
            fVar.mo14851l(m20814a(bVar));
            fVar.mo14835b(1, bVar);
        }
    }

    /* renamed from: a */
    private static void m20830a(C5407f fVar, C5428la laVar, int i, int i2, int i3) {
        fVar.mo14844f(i3, 2);
        fVar.mo14851l(m20818a(laVar, 1, i2));
        fVar.mo14835b(1, C5399b.m20722a(laVar.f15296b));
        String str = laVar.f15295a;
        if (str != null) {
            fVar.mo14835b(3, C5399b.m20722a(str));
        }
        int i4 = 0;
        for (StackTraceElement a : laVar.f15297c) {
            m20827a(fVar, 4, a, true);
        }
        C5428la laVar2 = laVar.f15298d;
        if (laVar2 == null) {
            return;
        }
        if (i < i2) {
            m20830a(fVar, laVar2, i + 1, i2, 6);
            return;
        }
        while (laVar2 != null) {
            laVar2 = laVar2.f15298d;
            i4++;
        }
        fVar.mo14846g(7, i4);
    }

    /* renamed from: a */
    private static void m20831a(C5407f fVar, C5428la laVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C5399b bVar, C5399b bVar2) {
        fVar.mo14844f(1, 2);
        fVar.mo14851l(m20819a(laVar, thread, stackTraceElementArr, threadArr, list, i, bVar, bVar2));
        m20838a(fVar, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            m20838a(fVar, threadArr[i2], list.get(i2), 0, false);
        }
        m20830a(fVar, laVar, 1, i, 2);
        fVar.mo14844f(3, 2);
        fVar.mo14851l(m20811a());
        fVar.mo14835b(1, f15282a);
        fVar.mo14835b(2, f15282a);
        fVar.mo14834b(3, 0);
        fVar.mo14844f(4, 2);
        fVar.mo14851l(m20815a(bVar, bVar2));
        fVar.mo14834b(1, 0);
        fVar.mo14834b(2, 0);
        fVar.mo14835b(3, bVar);
        if (bVar2 != null) {
            fVar.mo14835b(4, bVar2);
        }
    }

    /* renamed from: a */
    private static void m20832a(C5407f fVar, C5428la laVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C5399b bVar, C5399b bVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        fVar.mo14844f(3, 2);
        fVar.mo14851l(m20820a(laVar, thread, stackTraceElementArr, threadArr, list, i, bVar, bVar2, map, runningAppProcessInfo, i2));
        m20831a(fVar, laVar, thread, stackTraceElementArr, threadArr, list, i, bVar, bVar2);
        if (map != null && !map.isEmpty()) {
            m20839a(fVar, map);
        }
        if (runningAppProcessInfo != null) {
            fVar.mo14836b(3, runningAppProcessInfo.importance != 100);
        }
        fVar.mo14846g(4, i2);
    }

    /* renamed from: a */
    private static void m20833a(C5407f fVar, Float f, int i, boolean z, int i2, long j, long j2) {
        fVar.mo14844f(5, 2);
        fVar.mo14851l(m20822a(f, i, z, i2, j, j2));
        if (f != null) {
            fVar.mo14833b(1, f.floatValue());
        }
        fVar.mo14843e(2, i);
        fVar.mo14836b(3, z);
        fVar.mo14846g(4, i2);
        fVar.mo14834b(5, j);
        fVar.mo14834b(6, j2);
    }

    /* renamed from: a */
    public static void m20834a(C5407f fVar, String str, int i, String str2, int i2, long j, long j2, boolean z, Map<C6091u.C6092a, String> map, int i3, String str3, String str4) {
        C5407f fVar2 = fVar;
        C5399b a = C5399b.m20722a(str);
        C5399b a2 = m20826a(str2);
        C5399b a3 = m20826a(str4);
        C5399b a4 = m20826a(str3);
        fVar2.mo14844f(9, 2);
        C5399b bVar = a4;
        C5399b bVar2 = a3;
        fVar2.mo14851l(m20812a(i, a, a2, i2, j, j2, z, map, i3, a4, a3));
        fVar2.mo14835b(1, a);
        fVar2.mo14841d(3, i);
        fVar2.mo14835b(4, a2);
        fVar2.mo14846g(5, i2);
        fVar2.mo14834b(6, j);
        fVar2.mo14834b(7, j2);
        fVar2.mo14836b(10, z);
        for (Map.Entry next : map.entrySet()) {
            fVar2.mo14844f(11, 2);
            fVar2.mo14851l(m20821a((C6091u.C6092a) next.getKey(), (String) next.getValue()));
            fVar2.mo14841d(1, ((C6091u.C6092a) next.getKey()).f17050i);
            fVar2.mo14835b(2, C5399b.m20722a((String) next.getValue()));
        }
        fVar2.mo14846g(12, i3);
        C5399b bVar3 = bVar;
        if (bVar3 != null) {
            fVar2.mo14835b(13, bVar3);
        }
        C5399b bVar4 = bVar2;
        if (bVar4 != null) {
            fVar2.mo14835b(14, bVar4);
        }
    }

    /* renamed from: a */
    public static void m20835a(C5407f fVar, String str, String str2, long j) {
        fVar.mo14835b(1, C5399b.m20722a(str2));
        fVar.mo14835b(2, C5399b.m20722a(str));
        fVar.mo14834b(3, j);
    }

    /* renamed from: a */
    public static void m20836a(C5407f fVar, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        C5399b a = C5399b.m20722a(str);
        C5399b a2 = m20826a(str2);
        C5399b a3 = m20826a(str3);
        int a4 = C5407f.m20749a(1, a) + 0;
        if (str2 != null) {
            a4 += C5407f.m20749a(2, a2);
        }
        if (str3 != null) {
            a4 += C5407f.m20749a(3, a3);
        }
        fVar.mo14844f(6, 2);
        fVar.mo14851l(a4);
        fVar.mo14835b(1, a);
        if (str2 != null) {
            fVar.mo14835b(2, a2);
        }
        if (str3 != null) {
            fVar.mo14835b(3, a3);
        }
    }

    /* renamed from: a */
    public static void m20837a(C5407f fVar, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        C5399b a = C5399b.m20722a(str);
        C5399b a2 = C5399b.m20722a(str2);
        C5399b a3 = C5399b.m20722a(str3);
        C5399b a4 = C5399b.m20722a(str4);
        C5399b a5 = C5399b.m20722a(str5);
        C5399b a6 = str6 != null ? C5399b.m20722a(str6) : null;
        fVar.mo14844f(7, 2);
        fVar.mo14851l(m20816a(a, a2, a3, a4, a5, i, a6));
        fVar.mo14835b(1, a);
        fVar.mo14835b(2, a3);
        fVar.mo14835b(3, a4);
        fVar.mo14844f(5, 2);
        fVar.mo14851l(m20841b(a2));
        fVar.mo14835b(1, a2);
        fVar.mo14835b(6, a5);
        if (a6 != null) {
            fVar.mo14835b(8, f15283b);
            fVar.mo14835b(9, a6);
        }
        fVar.mo14841d(10, i);
    }

    /* renamed from: a */
    private static void m20838a(C5407f fVar, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        fVar.mo14844f(1, 2);
        fVar.mo14851l(m20825a(thread, stackTraceElementArr, i, z));
        fVar.mo14835b(1, C5399b.m20722a(thread.getName()));
        fVar.mo14846g(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            m20827a(fVar, 3, a, z);
        }
    }

    /* renamed from: a */
    private static void m20839a(C5407f fVar, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            fVar.mo14844f(2, 2);
            fVar.mo14851l(m20824a((String) next.getKey(), (String) next.getValue()));
            fVar.mo14835b(1, C5399b.m20722a((String) next.getKey()));
            String str = (String) next.getValue();
            if (str == null) {
                str = "";
            }
            fVar.mo14835b(2, C5399b.m20722a(str));
        }
    }

    /* renamed from: a */
    public static void m20840a(C5407f fVar, boolean z) {
        C5399b a = C5399b.m20722a(Build.VERSION.RELEASE);
        C5399b a2 = C5399b.m20722a(Build.VERSION.CODENAME);
        fVar.mo14844f(8, 2);
        fVar.mo14851l(m20817a(a, a2, z));
        fVar.mo14841d(1, 3);
        fVar.mo14835b(2, a);
        fVar.mo14835b(3, a2);
        fVar.mo14836b(4, z);
    }

    /* renamed from: b */
    private static int m20841b(C5399b bVar) {
        return C5407f.m20749a(1, bVar) + 0;
    }
}
