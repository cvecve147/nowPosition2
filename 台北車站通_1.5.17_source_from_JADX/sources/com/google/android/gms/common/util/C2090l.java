package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.common.util.l */
public final class C2090l {
    /* renamed from: a */
    public static long m9155a(InputStream inputStream, OutputStream outputStream, boolean z) {
        return m9156a(inputStream, outputStream, z, 1024);
    }

    /* renamed from: a */
    public static long m9156a(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    m9157a(inputStream);
                    m9157a(outputStream);
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public static void m9157a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static byte[] m9158a(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m9155a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
