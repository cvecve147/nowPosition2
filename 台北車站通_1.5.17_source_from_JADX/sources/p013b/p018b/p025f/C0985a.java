package p013b.p018b.p025f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;
import org.apache.http.cookie.ClientCookie;

/* renamed from: b.b.f.a */
public final class C0985a {

    /* renamed from: a */
    private static final Set<File> f3877a = new HashSet();

    /* renamed from: b */
    private static final boolean f3878b = m5341a(System.getProperty("java.vm.version"));

    /* renamed from: b.b.f.a$a */
    private static final class C0986a {

        /* renamed from: a */
        private static final int f3879a = 4;

        /* renamed from: b */
        private final C0987a f3880b;

        /* renamed from: b.b.f.a$a$a */
        private interface C0987a {
            /* renamed from: a */
            Object mo4995a(File file, DexFile dexFile);
        }

        /* renamed from: b.b.f.a$a$b */
        private static class C0988b implements C0987a {

            /* renamed from: a */
            private final Constructor<?> f3881a;

            C0988b(Class<?> cls) {
                this.f3881a = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.f3881a.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo4995a(File file, DexFile dexFile) {
                return this.f3881a.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        /* renamed from: b.b.f.a$a$c */
        private static class C0989c implements C0987a {

            /* renamed from: a */
            private final Constructor<?> f3882a;

            C0989c(Class<?> cls) {
                this.f3882a = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.f3882a.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo4995a(File file, DexFile dexFile) {
                return this.f3882a.newInstance(new Object[]{file, file, dexFile});
            }
        }

        /* renamed from: b.b.f.a$a$d */
        private static class C0990d implements C0987a {

            /* renamed from: a */
            private final Constructor<?> f3883a;

            C0990d(Class<?> cls) {
                this.f3883a = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.f3883a.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo4995a(File file, DexFile dexFile) {
                return this.f3883a.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C0986a() {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                b.b.f.a$a$b r1 = new b.b.f.a$a$b     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                b.b.f.a$a$c r1 = new b.b.f.a$a$c     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                b.b.f.a$a$d r1 = new b.b.f.a$a$d
                r1.<init>(r0)
            L_0x001a:
                r2.f3880b = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p025f.C0985a.C0986a.<init>():void");
        }

        /* renamed from: a */
        private static String m5347a(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f3879a) + ".dex").getPath();
        }

        /* renamed from: a */
        static void m5348a(ClassLoader classLoader, List<? extends File> list) {
            Object obj = C0985a.m5342b(classLoader, "pathList").get(classLoader);
            Object[] a = new C0986a().m5349a(list);
            try {
                C0985a.m5345b(obj, "dexElements", a);
            } catch (NoSuchFieldException e) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
                C0985a.m5345b(obj, "pathElements", a);
            }
        }

        /* renamed from: a */
        private Object[] m5349a(List<? extends File> list) {
            Object[] objArr = new Object[list.size()];
            for (int i = 0; i < objArr.length; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.f3880b.mo4995a(file, DexFile.loadDex(file.getPath(), m5347a(file), 0));
            }
            return objArr;
        }
    }

    /* renamed from: b.b.f.a$b */
    private static final class C0991b {
        /* renamed from: a */
        static void m5354a(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = C0985a.m5342b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C0985a.m5345b(obj, "dexElements", m5355a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field a = C0985a.m5342b(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* renamed from: a */
        private static Object[] m5355a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) C0985a.m5343b(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: b.b.f.a$c */
    private static final class C0992c {
        /* renamed from: a */
        static void m5356a(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field a = C0985a.m5342b(classLoader, ClientCookie.PATH_ATTR);
            StringBuilder sb = new StringBuilder((String) a.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            a.set(classLoader, sb.toString());
            C0985a.m5345b((Object) classLoader, "mPaths", (Object[]) strArr);
            C0985a.m5345b((Object) classLoader, "mFiles", (Object[]) fileArr);
            C0985a.m5345b((Object) classLoader, "mZips", (Object[]) zipFileArr);
            C0985a.m5345b((Object) classLoader, "mDexs", (Object[]) dexFileArr);
        }
    }

    /* renamed from: a */
    private static File m5333a(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            m5338a(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m5338a(file2);
        }
        File file3 = new File(file2, str);
        m5338a(file3);
        return file3;
    }

    /* renamed from: a */
    public static void m5336a(Context context) {
        String str;
        Log.i("MultiDex", "Installing application");
        if (f3878b) {
            str = "VM has multidex support, MultiDex support library is disabled.";
        } else if (Build.VERSION.SDK_INT >= 4) {
            try {
                ApplicationInfo c = m5346c(context);
                if (c == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                m5337a(context, new File(c.sourceDir), new File(c.dataDir), "secondary-dexes", "", true);
                str = "install done";
            } catch (Exception e) {
                Log.e("MultiDex", "MultiDex installation failure", e);
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        } else {
            throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is " + 4 + ".");
        }
        Log.i("MultiDex", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a5, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        android.util.Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00a4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5337a(android.content.Context r5, java.io.File r6, java.io.File r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            java.util.Set<java.io.File> r0 = f3877a
            monitor-enter(r0)
            java.util.Set<java.io.File> r1 = f3877a     // Catch:{ all -> 0x00af }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x000d:
            java.util.Set<java.io.File> r1 = f3877a     // Catch:{ all -> 0x00af }
            r1.add(r6)     // Catch:{ all -> 0x00af }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00af }
            r2 = 20
            if (r1 <= r2) goto L_0x0055
            java.lang.String r1 = "MultiDex"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r3.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r4 = "MultiDex is not guaranteed to work in SDK version "
            r3.append(r4)     // Catch:{ all -> 0x00af }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00af }
            r3.append(r4)     // Catch:{ all -> 0x00af }
            java.lang.String r4 = ": SDK version higher than "
            r3.append(r4)     // Catch:{ all -> 0x00af }
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = " should be backed by "
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "runtime with built-in multidex capabilty but it's not the "
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "case here: java.vm.version=\""
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x00af }
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "\""
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00af }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x00af }
        L_0x0055:
            java.lang.ClassLoader r1 = r5.getClassLoader()     // Catch:{ RuntimeException -> 0x00a5 }
            if (r1 != 0) goto L_0x0064
            java.lang.String r5 = "MultiDex"
            java.lang.String r6 = "Context class loader is null. Must be running in test mode. Skip patching."
            android.util.Log.e(r5, r6)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x0064:
            m5344b(r5)     // Catch:{ Throwable -> 0x0068 }
            goto L_0x0070
        L_0x0068:
            r2 = move-exception
            java.lang.String r3 = "MultiDex"
            java.lang.String r4 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r3, r4, r2)     // Catch:{ all -> 0x00af }
        L_0x0070:
            java.io.File r7 = m5333a((android.content.Context) r5, (java.io.File) r7, (java.lang.String) r8)     // Catch:{ all -> 0x00af }
            b.b.f.d r8 = new b.b.f.d     // Catch:{ all -> 0x00af }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x00af }
            r6 = 0
            r2 = 0
            java.util.List r2 = r8.mo4998a(r5, r9, r2)     // Catch:{ all -> 0x00a0 }
            m5339a((java.lang.ClassLoader) r1, (java.io.File) r7, (java.util.List<? extends java.io.File>) r2)     // Catch:{ IOException -> 0x0083 }
            goto L_0x0095
        L_0x0083:
            r2 = move-exception
            if (r10 == 0) goto L_0x009f
            java.lang.String r10 = "MultiDex"
            java.lang.String r3 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r10, r3, r2)     // Catch:{ all -> 0x00a0 }
            r10 = 1
            java.util.List r5 = r8.mo4998a(r5, r9, r10)     // Catch:{ all -> 0x00a0 }
            m5339a((java.lang.ClassLoader) r1, (java.io.File) r7, (java.util.List<? extends java.io.File>) r5)     // Catch:{ all -> 0x00a0 }
        L_0x0095:
            r8.close()     // Catch:{ IOException -> 0x0099 }
            goto L_0x009a
        L_0x0099:
            r6 = move-exception
        L_0x009a:
            if (r6 != 0) goto L_0x009e
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x009e:
            throw r6     // Catch:{ all -> 0x00af }
        L_0x009f:
            throw r2     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r5 = move-exception
            r8.close()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            throw r5     // Catch:{ all -> 0x00af }
        L_0x00a5:
            r5 = move-exception
            java.lang.String r6 = "MultiDex"
            java.lang.String r7 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r6, r7, r5)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00af:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p025f.C0985a.m5337a(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    private static void m5338a(File file) {
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
            } else {
                str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
            }
            Log.e("MultiDex", str);
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }

    /* renamed from: a */
    private static void m5339a(ClassLoader classLoader, File file, List<? extends File> list) {
        if (!list.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                C0991b.m5354a(classLoader, list, file);
            } else if (i >= 14) {
                C0986a.m5348a(classLoader, list);
            } else {
                C0992c.m5356a(classLoader, list);
            }
        }
    }

    /* renamed from: a */
    static boolean m5341a(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Field m5342b(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Method m5343b(Object obj, String str, Class<?>... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: b */
    private static void m5344b(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!file2.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
                return;
            }
            Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m5345b(Object obj, String str, Object[] objArr) {
        Field b = m5342b(obj, str);
        Object[] objArr2 = (Object[]) b.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        b.set(obj, objArr3);
    }

    /* renamed from: c */
    private static ApplicationInfo m5346c(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }
}
