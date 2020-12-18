package org.apache.commons.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.logging.impl.NoOpLog;

public class LogSource {
    protected static boolean jdk14IsAvailable;
    protected static boolean log4jIsAvailable;
    protected static Constructor logImplctor = null;
    protected static Hashtable logs = new Hashtable();

    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f A[Catch:{ Throwable -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0051 A[SYNTHETIC, Splitter:B:34:0x0051] */
    static {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            logs = r0
            r0 = 0
            log4jIsAvailable = r0
            jdk14IsAvailable = r0
            r1 = 0
            logImplctor = r1
            java.lang.String r2 = "org.apache.log4j.Logger"
            r3 = 1
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = r3
            goto L_0x001b
        L_0x001a:
            r2 = r0
        L_0x001b:
            log4jIsAvailable = r2     // Catch:{ Throwable -> 0x001e }
            goto L_0x0020
        L_0x001e:
            log4jIsAvailable = r0
        L_0x0020:
            java.lang.String r2 = "java.util.logging.Logger"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x0035 }
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = "org.apache.commons.logging.impl.Jdk14Logger"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x0035 }
            if (r2 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r3 = r0
        L_0x0032:
            jdk14IsAvailable = r3     // Catch:{ Throwable -> 0x0035 }
            goto L_0x0037
        L_0x0035:
            jdk14IsAvailable = r0
        L_0x0037:
            java.lang.String r0 = "org.apache.commons.logging.log"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ Throwable -> 0x0045 }
            if (r1 != 0) goto L_0x0045
            java.lang.String r0 = "org.apache.commons.logging.Log"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ Throwable -> 0x0045 }
        L_0x0045:
            java.lang.String r0 = "org.apache.commons.logging.impl.NoOpLog"
            if (r1 == 0) goto L_0x0051
        L_0x0049:
            setLogImplementation((java.lang.String) r1)     // Catch:{ Throwable -> 0x004d }
            goto L_0x0062
        L_0x004d:
            setLogImplementation((java.lang.String) r0)     // Catch:{ Throwable -> 0x0062 }
            goto L_0x0062
        L_0x0051:
            boolean r1 = log4jIsAvailable     // Catch:{ Throwable -> 0x004d }
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = "org.apache.commons.logging.impl.Log4JLogger"
            goto L_0x0049
        L_0x0058:
            boolean r1 = jdk14IsAvailable     // Catch:{ Throwable -> 0x004d }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "org.apache.commons.logging.impl.Jdk14Logger"
            goto L_0x0049
        L_0x005f:
            setLogImplementation((java.lang.String) r0)     // Catch:{ Throwable -> 0x004d }
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogSource.<clinit>():void");
    }

    private LogSource() {
    }

    public static Log getInstance(Class cls) {
        return getInstance(cls.getName());
    }

    public static Log getInstance(String str) {
        Log log = (Log) logs.get(str);
        if (log != null) {
            return log;
        }
        Log makeNewLogInstance = makeNewLogInstance(str);
        logs.put(str, makeNewLogInstance);
        return makeNewLogInstance;
    }

    public static String[] getLogNames() {
        return (String[]) logs.keySet().toArray(new String[logs.size()]);
    }

    public static Log makeNewLogInstance(String str) {
        Log log;
        try {
            log = (Log) logImplctor.newInstance(new Object[]{str});
        } catch (Throwable unused) {
            log = null;
        }
        return log == null ? new NoOpLog(str) : log;
    }

    public static void setLogImplementation(Class cls) {
        logImplctor = cls.getConstructor(new Class[]{"".getClass()});
    }

    public static void setLogImplementation(String str) {
        try {
            logImplctor = Class.forName(str).getConstructor(new Class[]{"".getClass()});
        } catch (Throwable unused) {
            logImplctor = null;
        }
    }
}
