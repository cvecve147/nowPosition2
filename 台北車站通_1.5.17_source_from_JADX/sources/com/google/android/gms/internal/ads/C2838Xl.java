package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2838Xl;
import com.google.android.gms.internal.ads.C2866Yl;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Xl */
public abstract class C2838Xl<MessageType extends C2838Xl<MessageType, BuilderType>, BuilderType extends C2866Yl<MessageType, BuilderType>> implements C3498tn {
    private static boolean zzdpg = false;
    protected int zzdpf = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8612a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public final C3150hm mo9039h() {
        try {
            C3297mm d = C3150hm.m12541d(mo8615e());
            mo8613a(d.mo9751b());
            return d.mo9750a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: i */
    public final byte[] mo9040i() {
        try {
            byte[] bArr = new byte[mo8615e()];
            C3525um a = C3525um.m14078a(bArr);
            mo8613a(a);
            a.mo10102b();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo8621j() {
        throw new UnsupportedOperationException();
    }
}
