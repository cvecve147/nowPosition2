package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.protocol.HTTP;

@C2478La
/* renamed from: com.google.android.gms.internal.ads._x */
final class C2933_x {

    /* renamed from: a */
    final zzjj f8874a;

    /* renamed from: b */
    final String f8875b;

    /* renamed from: c */
    final int f8876c;

    C2933_x(C2795Vx vx) {
        this(vx.mo8981d(), vx.mo8976a(), vx.mo8979b());
    }

    private C2933_x(zzjj zzjj, String str, int i) {
        this.f8874a = zzjj;
        this.f8875b = str;
        this.f8876c = i;
    }

    /* renamed from: a */
    static C2933_x m11896a(String str) {
        String[] split = str.split("\u0000");
        if (split.length == 3) {
            Parcel obtain = Parcel.obtain();
            try {
                String str2 = new String(Base64.decode(split[0], 0), HTTP.UTF_8);
                int parseInt = Integer.parseInt(split[1]);
                byte[] decode = Base64.decode(split[2], 0);
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                C2933_x _xVar = new C2933_x(zzjj.CREATOR.createFromParcel(obtain), str2, parseInt);
                obtain.recycle();
                return _xVar;
            } catch (C2047a.C2048a | IllegalArgumentException | IllegalStateException e) {
                C1697X.m7702i().mo8319a(e, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } else {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo9184a() {
        Parcel obtain = Parcel.obtain();
        try {
            String encodeToString = Base64.encodeToString(this.f8875b.getBytes(HTTP.UTF_8), 0);
            String num = Integer.toString(this.f8876c);
            this.f8874a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 2 + String.valueOf(num).length() + String.valueOf(encodeToString2).length());
            sb.append(encodeToString);
            sb.append("\u0000");
            sb.append(num);
            sb.append("\u0000");
            sb.append(encodeToString2);
            String sb2 = sb.toString();
            obtain.recycle();
            return sb2;
        } catch (UnsupportedEncodingException unused) {
            C2227Cf.m9529a("QueueSeed encode failed because UTF-8 is not available.");
            obtain.recycle();
            return "";
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
