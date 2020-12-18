package p101d.p119e.p120a;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.http.protocol.HTTP;

/* renamed from: d.e.a.h */
class C5275h {

    /* renamed from: a */
    private static final char[] f14924a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m20405a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            byte[] bytes = str.getBytes(HTTP.UTF_8);
            instance.update(bytes, 0, bytes.length);
            return m20406a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static String m20406a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f14924a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
