package com.google.android.gms.internal.ads;

import android.os.Environment;
import com.google.android.gms.ads.internal.C1697X;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ls */
public final class C3275ls {

    /* renamed from: a */
    private final C3389ps f9753a;

    /* renamed from: b */
    private final C2212Bs f9754b;

    /* renamed from: c */
    private final boolean f9755c;

    private C3275ls() {
        this.f9755c = false;
        this.f9753a = new C3389ps();
        this.f9754b = new C2212Bs();
        m13005b();
    }

    public C3275ls(C3389ps psVar) {
        this.f9753a = psVar;
        this.f9755c = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7922ke)).booleanValue();
        this.f9754b = new C2212Bs();
        m13005b();
    }

    /* renamed from: a */
    public static C3275ls m13004a() {
        return new C3275ls();
    }

    /* renamed from: b */
    private final synchronized void m13005b() {
        this.f9754b.f6764l = new C3533us();
        this.f9754b.f6764l.f10317f = new C3617xs();
        this.f9754b.f6761i = new C3674zs();
    }

    /* renamed from: b */
    private final synchronized void m13006b(C3332ns nsVar) {
        this.f9754b.f6760h = m13008c();
        C3446rs a = this.f9753a.mo9898a(C2408Io.m10310a((C2408Io) this.f9754b));
        a.mo9990b(nsVar.mo8218d());
        a.mo9989a();
        String valueOf = String.valueOf(Integer.toString(nsVar.mo8218d(), 10));
        C2857Yd.m11615f(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    /* renamed from: c */
    private final synchronized void m13007c(C3332ns nsVar) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m13009d(nsVar).getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        C2857Yd.m11615f("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    C2857Yd.m11615f("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        C2857Yd.m11615f("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                C2857Yd.m11615f("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    C2857Yd.m11615f("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: c */
    private static long[] m13008c() {
        int i;
        List<String> b = C2558Nu.m10775b();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = it.next().split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    C2857Yd.m11615f("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }

    /* renamed from: d */
    private final synchronized String m13009d(C3332ns nsVar) {
        return String.format("id=%s,timestamp=%s,event=%s", new Object[]{this.f9754b.f6756d, Long.valueOf(C1697X.m7705l().mo7726b()), Integer.valueOf(nsVar.mo8218d())});
    }

    /* renamed from: a */
    public final synchronized void mo9685a(C3303ms msVar) {
        if (this.f9755c) {
            try {
                msVar.mo6880a(this.f9754b);
            } catch (NullPointerException e) {
                C1697X.m7702i().mo8319a((Throwable) e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo9686a(C3332ns nsVar) {
        if (this.f9755c) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7928le)).booleanValue()) {
                m13007c(nsVar);
            } else {
                m13006b(nsVar);
            }
        }
    }
}
