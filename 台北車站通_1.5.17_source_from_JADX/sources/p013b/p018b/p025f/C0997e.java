package p013b.p018b.p025f;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: b.b.f.e */
final class C0997e {

    /* renamed from: b.b.f.e$a */
    static class C0998a {

        /* renamed from: a */
        long f3892a;

        /* renamed from: b */
        long f3893b;

        C0998a() {
        }
    }

    /* renamed from: a */
    static long m5368a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m5369a(randomAccessFile, m5370a(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    static long m5369a(RandomAccessFile randomAccessFile, C0998a aVar) {
        CRC32 crc32 = new CRC32();
        long j = aVar.f3893b;
        randomAccessFile.seek(aVar.f3892a);
        int min = (int) Math.min(16384, j);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = randomAccessFile.read(bArr, 0, min);
            if (read == -1) {
                break;
            }
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            min = (int) Math.min(16384, j);
        }
        return crc32.getValue();
    }

    /* renamed from: a */
    static C0998a m5370a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C0998a aVar = new C0998a();
                    aVar.f3893b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f3892a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }
}
