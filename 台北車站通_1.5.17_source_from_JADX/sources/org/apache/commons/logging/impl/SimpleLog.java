package org.apache.commons.logging.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import org.apache.commons.logging.Log;

public class SimpleLog implements Log, Serializable {
    protected static final String DEFAULT_DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss:SSS zzz";
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_DEBUG = 2;
    public static final int LOG_LEVEL_ERROR = 5;
    public static final int LOG_LEVEL_FATAL = 6;
    public static final int LOG_LEVEL_INFO = 3;
    public static final int LOG_LEVEL_OFF = 7;
    public static final int LOG_LEVEL_TRACE = 1;
    public static final int LOG_LEVEL_WARN = 4;
    static /* synthetic */ Class class$java$lang$Thread = null;
    static /* synthetic */ Class class$org$apache$commons$logging$impl$SimpleLog = null;
    protected static DateFormat dateFormatter = null;
    protected static volatile String dateTimeFormat = null;
    private static final long serialVersionUID = 136942970684951178L;
    protected static volatile boolean showDateTime = false;
    protected static volatile boolean showLogName = false;
    protected static volatile boolean showShortName = false;
    protected static final Properties simpleLogProps = new Properties();
    protected static final String systemPrefix = "org.apache.commons.logging.simplelog.";
    protected volatile int currentLogLevel;
    protected volatile String logName = null;
    private volatile String shortLogName = null;

    static {
        showLogName = false;
        showShortName = true;
        showDateTime = false;
        dateTimeFormat = DEFAULT_DATE_TIME_FORMAT;
        dateFormatter = null;
        InputStream resourceAsStream = getResourceAsStream("simplelog.properties");
        if (resourceAsStream != null) {
            try {
                simpleLogProps.load(resourceAsStream);
                resourceAsStream.close();
            } catch (IOException unused) {
            }
        }
        showLogName = getBooleanProperty("org.apache.commons.logging.simplelog.showlogname", showLogName);
        showShortName = getBooleanProperty("org.apache.commons.logging.simplelog.showShortLogname", showShortName);
        showDateTime = getBooleanProperty("org.apache.commons.logging.simplelog.showdatetime", showDateTime);
        if (showDateTime) {
            dateTimeFormat = getStringProperty("org.apache.commons.logging.simplelog.dateTimeFormat", dateTimeFormat);
            try {
                dateFormatter = new SimpleDateFormat(dateTimeFormat);
            } catch (IllegalArgumentException unused2) {
                dateTimeFormat = DEFAULT_DATE_TIME_FORMAT;
                dateFormatter = new SimpleDateFormat(dateTimeFormat);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SimpleLog(java.lang.String r8) {
        /*
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.logName = r0
            r7.shortLogName = r0
            r7.logName = r8
            r0 = 3
            r7.setLevel(r0)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "org.apache.commons.logging.simplelog.log."
            r1.append(r2)
            java.lang.String r3 = r7.logName
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = getStringProperty(r1)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            java.lang.String r4 = "."
        L_0x002b:
            int r3 = r3.lastIndexOf(r4)
            r5 = 0
            if (r1 != 0) goto L_0x0051
            r6 = -1
            if (r3 <= r6) goto L_0x0051
            java.lang.String r8 = r8.substring(r5, r3)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = getStringProperty(r1)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            goto L_0x002b
        L_0x0051:
            if (r1 != 0) goto L_0x0059
            java.lang.String r8 = "org.apache.commons.logging.simplelog.defaultlog"
            java.lang.String r1 = getStringProperty(r8)
        L_0x0059:
            java.lang.String r8 = "all"
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x0065
            r7.setLevel(r5)
            goto L_0x00b0
        L_0x0065:
            java.lang.String r8 = "trace"
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x0072
            r8 = 1
        L_0x006e:
            r7.setLevel(r8)
            goto L_0x00b0
        L_0x0072:
            java.lang.String r8 = "debug"
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x007c
            r8 = 2
            goto L_0x006e
        L_0x007c:
            java.lang.String r8 = "info"
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x0088
            r7.setLevel(r0)
            goto L_0x00b0
        L_0x0088:
            java.lang.String r8 = "warn"
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x0092
            r8 = 4
            goto L_0x006e
        L_0x0092:
            java.lang.String r8 = "error"
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x009c
            r8 = 5
            goto L_0x006e
        L_0x009c:
            java.lang.String r8 = "fatal"
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x00a6
            r8 = 6
            goto L_0x006e
        L_0x00a6:
            java.lang.String r8 = "off"
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x00b0
            r8 = 7
            goto L_0x006e
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.SimpleLog.<init>(java.lang.String):void");
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static boolean getBooleanProperty(String str, boolean z) {
        String stringProperty = getStringProperty(str);
        return stringProperty == null ? z : "true".equalsIgnoreCase(stringProperty);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.ClassLoader getContextClassLoader() {
        /*
            r0 = 0
            java.lang.Class r1 = class$java$lang$Thread     // Catch:{ NoSuchMethodException -> 0x0038 }
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "java.lang.Thread"
            java.lang.Class r1 = class$(r1)     // Catch:{ NoSuchMethodException -> 0x0038 }
            class$java$lang$Thread = r1     // Catch:{ NoSuchMethodException -> 0x0038 }
            goto L_0x0010
        L_0x000e:
            java.lang.Class r1 = class$java$lang$Thread     // Catch:{ NoSuchMethodException -> 0x0038 }
        L_0x0010:
            java.lang.String r2 = "getContextClassLoader"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch:{ NoSuchMethodException -> 0x0038 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            r0 = r1
            goto L_0x0038
        L_0x0022:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getTargetException()     // Catch:{ NoSuchMethodException -> 0x0038 }
            boolean r2 = r2 instanceof java.lang.SecurityException     // Catch:{ NoSuchMethodException -> 0x0038 }
            if (r2 == 0) goto L_0x002c
            goto L_0x0038
        L_0x002c:
            org.apache.commons.logging.LogConfigurationException r2 = new org.apache.commons.logging.LogConfigurationException     // Catch:{ NoSuchMethodException -> 0x0038 }
            java.lang.String r3 = "Unexpected InvocationTargetException"
            java.lang.Throwable r1 = r1.getTargetException()     // Catch:{ NoSuchMethodException -> 0x0038 }
            r2.<init>(r3, r1)     // Catch:{ NoSuchMethodException -> 0x0038 }
            throw r2     // Catch:{ NoSuchMethodException -> 0x0038 }
        L_0x0038:
            if (r0 != 0) goto L_0x004a
            java.lang.Class r0 = class$org$apache$commons$logging$impl$SimpleLog
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "org.apache.commons.logging.impl.SimpleLog"
            java.lang.Class r0 = class$(r0)
            class$org$apache$commons$logging$impl$SimpleLog = r0
        L_0x0046:
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.SimpleLog.getContextClassLoader():java.lang.ClassLoader");
    }

    private static InputStream getResourceAsStream(final String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                ClassLoader access$000 = SimpleLog.getContextClassLoader();
                return access$000 != null ? access$000.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
            }
        });
    }

    private static String getStringProperty(String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        return str2 == null ? simpleLogProps.getProperty(str) : str2;
    }

    private static String getStringProperty(String str, String str2) {
        String stringProperty = getStringProperty(str);
        return stringProperty == null ? str2 : stringProperty;
    }

    public final void debug(Object obj) {
        if (isLevelEnabled(2)) {
            log(2, obj, (Throwable) null);
        }
    }

    public final void debug(Object obj, Throwable th) {
        if (isLevelEnabled(2)) {
            log(2, obj, th);
        }
    }

    public final void error(Object obj) {
        if (isLevelEnabled(5)) {
            log(5, obj, (Throwable) null);
        }
    }

    public final void error(Object obj, Throwable th) {
        if (isLevelEnabled(5)) {
            log(5, obj, th);
        }
    }

    public final void fatal(Object obj) {
        if (isLevelEnabled(6)) {
            log(6, obj, (Throwable) null);
        }
    }

    public final void fatal(Object obj, Throwable th) {
        if (isLevelEnabled(6)) {
            log(6, obj, th);
        }
    }

    public int getLevel() {
        return this.currentLogLevel;
    }

    public final void info(Object obj) {
        if (isLevelEnabled(3)) {
            log(3, obj, (Throwable) null);
        }
    }

    public final void info(Object obj, Throwable th) {
        if (isLevelEnabled(3)) {
            log(3, obj, th);
        }
    }

    public final boolean isDebugEnabled() {
        return isLevelEnabled(2);
    }

    public final boolean isErrorEnabled() {
        return isLevelEnabled(5);
    }

    public final boolean isFatalEnabled() {
        return isLevelEnabled(6);
    }

    public final boolean isInfoEnabled() {
        return isLevelEnabled(3);
    }

    /* access modifiers changed from: protected */
    public boolean isLevelEnabled(int i) {
        return i >= this.currentLogLevel;
    }

    public final boolean isTraceEnabled() {
        return isLevelEnabled(1);
    }

    public final boolean isWarnEnabled() {
        return isLevelEnabled(4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void log(int r5, java.lang.Object r6, java.lang.Throwable r7) {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            boolean r1 = showDateTime
            if (r1 == 0) goto L_0x0024
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.text.DateFormat r2 = dateFormatter
            monitor-enter(r2)
            java.text.DateFormat r3 = dateFormatter     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = r3.format(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            goto L_0x0024
        L_0x0021:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r5
        L_0x0024:
            switch(r5) {
                case 1: goto L_0x0037;
                case 2: goto L_0x0034;
                case 3: goto L_0x0031;
                case 4: goto L_0x002e;
                case 5: goto L_0x002b;
                case 6: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x003c
        L_0x0028:
            java.lang.String r5 = "[FATAL] "
            goto L_0x0039
        L_0x002b:
            java.lang.String r5 = "[ERROR] "
            goto L_0x0039
        L_0x002e:
            java.lang.String r5 = "[WARN] "
            goto L_0x0039
        L_0x0031:
            java.lang.String r5 = "[INFO] "
            goto L_0x0039
        L_0x0034:
            java.lang.String r5 = "[DEBUG] "
            goto L_0x0039
        L_0x0037:
            java.lang.String r5 = "[TRACE] "
        L_0x0039:
            r0.append(r5)
        L_0x003c:
            boolean r5 = showShortName
            if (r5 == 0) goto L_0x0065
            java.lang.String r5 = r4.shortLogName
            if (r5 != 0) goto L_0x0062
            java.lang.String r5 = r4.logName
            java.lang.String r1 = r4.logName
            java.lang.String r2 = "."
            int r1 = r1.lastIndexOf(r2)
            int r1 = r1 + 1
            java.lang.String r5 = r5.substring(r1)
            java.lang.String r1 = "/"
            int r1 = r5.lastIndexOf(r1)
            int r1 = r1 + 1
            java.lang.String r5 = r5.substring(r1)
            r4.shortLogName = r5
        L_0x0062:
            java.lang.String r5 = r4.shortLogName
            goto L_0x006b
        L_0x0065:
            boolean r5 = showLogName
            if (r5 == 0) goto L_0x0077
            java.lang.String r5 = r4.logName
        L_0x006b:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.append(r5)
            java.lang.String r5 = " - "
            r0.append(r5)
        L_0x0077:
            java.lang.String r5 = java.lang.String.valueOf(r6)
            r0.append(r5)
            if (r7 == 0) goto L_0x00aa
            java.lang.String r5 = " <"
            r0.append(r5)
            java.lang.String r5 = r7.toString()
            r0.append(r5)
            java.lang.String r5 = ">"
            r0.append(r5)
            java.io.StringWriter r5 = new java.io.StringWriter
            r6 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6)
            java.io.PrintWriter r6 = new java.io.PrintWriter
            r6.<init>(r5)
            r7.printStackTrace(r6)
            r6.close()
            java.lang.String r5 = r5.toString()
            r0.append(r5)
        L_0x00aa:
            r4.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.SimpleLog.log(int, java.lang.Object, java.lang.Throwable):void");
    }

    public void setLevel(int i) {
        this.currentLogLevel = i;
    }

    public final void trace(Object obj) {
        if (isLevelEnabled(1)) {
            log(1, obj, (Throwable) null);
        }
    }

    public final void trace(Object obj, Throwable th) {
        if (isLevelEnabled(1)) {
            log(1, obj, th);
        }
    }

    public final void warn(Object obj) {
        if (isLevelEnabled(4)) {
            log(4, obj, (Throwable) null);
        }
    }

    public final void warn(Object obj, Throwable th) {
        if (isLevelEnabled(4)) {
            log(4, obj, th);
        }
    }

    /* access modifiers changed from: protected */
    public void write(StringBuffer stringBuffer) {
        System.err.println(stringBuffer.toString());
    }
}
