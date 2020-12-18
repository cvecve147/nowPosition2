package p013b.p018b.p025f;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: b.b.f.d */
final class C0995d implements Closeable {

    /* renamed from: a */
    private final File f3885a;

    /* renamed from: b */
    private final long f3886b;

    /* renamed from: c */
    private final File f3887c;

    /* renamed from: d */
    private final RandomAccessFile f3888d;

    /* renamed from: e */
    private final FileChannel f3889e;

    /* renamed from: f */
    private final FileLock f3890f;

    /* renamed from: b.b.f.d$a */
    private static class C0996a extends File {

        /* renamed from: a */
        public long f3891a = -1;

        public C0996a(File file, String str) {
            super(file, str);
        }
    }

    C0995d(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f3885a = file;
        this.f3887c = file2;
        this.f3886b = m5365b(file);
        File file3 = new File(file2, "MultiDex.lock");
        this.f3888d = new RandomAccessFile(file3, "rw");
        try {
            this.f3889e = this.f3888d.getChannel();
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f3890f = this.f3889e.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m5362a((Closeable) this.f3889e);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                m5362a((Closeable) this.f3889e);
                throw e;
            } catch (Error e3) {
                e = e3;
                m5362a((Closeable) this.f3889e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m5362a((Closeable) this.f3888d);
            throw e4;
        }
    }

    /* renamed from: a */
    private static long m5357a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: a */
    private static SharedPreferences m5358a(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: a */
    private List<C0996a> m5359a(Context context, String str) {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str3 = this.f3885a.getName() + ".classes";
        SharedPreferences a = m5358a(context);
        int i = a.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            C0996a aVar = new C0996a(this.f3887c, str3 + i2 + ".zip");
            if (aVar.isFile()) {
                aVar.f3891a = m5365b(aVar);
                long j = a.getLong(str2 + "dex.crc." + i2, -1);
                long j2 = a.getLong(str2 + "dex.time." + i2, -1);
                long lastModified = aVar.lastModified();
                if (j2 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = a;
                    if (j == aVar.f3891a) {
                        arrayList.add(aVar);
                        i2++;
                        a = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + aVar + " (key \"" + str2 + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + aVar.f3891a);
            }
            throw new IOException("Missing extracted secondary dex file '" + aVar.getPath() + "'");
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m5360a() {
        File[] listFiles = this.f3887c.listFiles(new C0994c(this));
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f3887c.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    /* renamed from: a */
    private static void m5361a(Context context, String str, long j, long j2, List<C0996a> list) {
        SharedPreferences.Editor edit = m5358a(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C0996a next : list) {
            edit.putLong(str + "dex.crc." + i, next.f3891a);
            edit.putLong(str + "dex.time." + i, next.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: a */
    private static void m5362a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* renamed from: a */
    private static void m5363a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    m5362a((Closeable) inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            m5362a((Closeable) inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: a */
    private static boolean m5364a(Context context, File file, long j, String str) {
        SharedPreferences a = m5358a(context);
        if (a.getLong(str + "timestamp", -1) == m5357a(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("crc");
            return a.getLong(sb.toString(), -1) != j;
        }
    }

    /* renamed from: b */
    private static long m5365b(File file) {
        long a = C0997e.m5368a(file);
        return a == -1 ? a - 1 : a;
    }

    /* renamed from: b */
    private List<C0996a> m5366b() {
        C0996a aVar;
        boolean z;
        String str = this.f3885a.getName() + ".classes";
        m5360a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f3885a);
        try {
            ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
            int i = 2;
            while (entry != null) {
                aVar = new C0996a(this.f3887c, str + i + ".zip");
                arrayList.add(aVar);
                Log.i("MultiDex", "Extraction is needed for file " + aVar);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    m5363a(zipFile, entry, (File) aVar, str);
                    aVar.f3891a = m5365b(aVar);
                    z = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(aVar.getAbsolutePath());
                    sb.append("': length ");
                    int i4 = i3;
                    sb.append(aVar.length());
                    sb.append(" - crc: ");
                    sb.append(aVar.f3891a);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        aVar.delete();
                        if (aVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + aVar.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i2 = i4;
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + aVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
            return arrayList;
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to read crc from " + aVar.getAbsolutePath(), e2);
            z = false;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<? extends File> mo4998a(Context context, String str, boolean z) {
        List<C0996a> list;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f3885a.getPath() + ", " + z + ", " + str + ")");
        if (this.f3890f.isValid()) {
            if (z || m5364a(context, this.f3885a, this.f3886b, str)) {
                Log.i("MultiDex", z ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
            } else {
                try {
                    list = m5359a(context, str);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            list = m5366b();
            m5361a(context, str, m5357a(this.f3885a), this.f3886b, list);
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public void close() {
        this.f3890f.release();
        this.f3889e.close();
        this.f3888d.close();
    }
}
