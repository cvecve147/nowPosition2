package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.protocol.HTTP;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ae */
public final class C2169Ae {

    /* renamed from: a */
    private final Context f6672a;

    /* renamed from: b */
    private String f6673b;

    /* renamed from: c */
    private String f6674c;

    /* renamed from: d */
    private String f6675d;

    /* renamed from: e */
    private String f6676e;

    /* renamed from: f */
    private final float f6677f;

    /* renamed from: g */
    private float f6678g;

    /* renamed from: h */
    private float f6679h;

    /* renamed from: i */
    private float f6680i;

    /* renamed from: j */
    private int f6681j;

    /* renamed from: k */
    private int f6682k;

    /* renamed from: l */
    private float f6683l;

    /* renamed from: m */
    private float f6684m;

    /* renamed from: n */
    private float f6685n;

    /* renamed from: o */
    private float f6686o;

    /* renamed from: p */
    private Handler f6687p;

    /* renamed from: q */
    private Runnable f6688q;

    public C2169Ae(Context context) {
        this.f6681j = 0;
        this.f6688q = new C2198Be(this);
        this.f6672a = context;
        this.f6677f = context.getResources().getDisplayMetrics().density;
        this.f6682k = ViewConfiguration.get(this.f6672a).getScaledTouchSlop();
        C1697X.m7713t().mo9309b();
        this.f6687p = C1697X.m7713t().mo9308a();
    }

    public C2169Ae(Context context, String str) {
        this(context);
        this.f6673b = str;
    }

    /* renamed from: a */
    private static int m9324a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* renamed from: a */
    private final void m9325a(int i, float f, float f2) {
        if (i == 0) {
            this.f6681j = 0;
            this.f6678g = f;
            this.f6679h = f2;
            this.f6680i = f2;
            return;
        }
        int i2 = this.f6681j;
        if (i2 != -1) {
            if (i == 2) {
                if (f2 > this.f6679h) {
                    this.f6679h = f2;
                } else if (f2 < this.f6680i) {
                    this.f6680i = f2;
                }
                if (this.f6679h - this.f6680i > this.f6677f * 30.0f) {
                    this.f6681j = -1;
                    return;
                }
                int i3 = this.f6681j;
                if (i3 == 0 || i3 == 2 ? f - this.f6678g >= this.f6677f * 50.0f : !(!(i3 == 1 || i3 == 3) || f - this.f6678g > this.f6677f * -50.0f)) {
                    this.f6678g = f;
                    this.f6681j++;
                }
                int i4 = this.f6681j;
                if (i4 == 1 || i4 == 3) {
                    if (f > this.f6678g) {
                        this.f6678g = f;
                    }
                } else if (i4 == 2 && f < this.f6678g) {
                    this.f6678g = f;
                }
            } else if (i == 1 && i2 == 4) {
                mo7806a();
            }
        }
    }

    /* renamed from: a */
    private final boolean m9326a(float f, float f2, float f3, float f4) {
        return Math.abs(this.f6683l - f) < ((float) this.f6682k) && Math.abs(this.f6684m - f2) < ((float) this.f6682k) && Math.abs(this.f6685n - f3) < ((float) this.f6682k) && Math.abs(this.f6686o - f4) < ((float) this.f6682k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006c, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0071;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9327e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f6672a
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.C2227Cf.m9534c(r0)
            return
        L_0x000c:
            java.lang.String r0 = r5.f6673b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "\\+"
            java.lang.String r2 = "%20"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            android.net.Uri$Builder r0 = r1.encodedQuery(r0)
            android.net.Uri r0 = r0.build()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.google.android.gms.ads.internal.C1697X.m7698e()
            java.util.Map r0 = com.google.android.gms.internal.ads.C3114ge.m12404a((android.net.Uri) r0)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0060
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r4 = " = "
            r1.append(r4)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r3 = "\n\n"
            r1.append(r3)
            goto L_0x003d
        L_0x0060:
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            java.lang.String r0 = "No debug information"
        L_0x0071:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.content.Context r2 = r5.f6672a
            r1.<init>(r2)
            r1.setMessage(r0)
            java.lang.String r2 = "Ad Information"
            r1.setTitle(r2)
            com.google.android.gms.internal.ads.De r2 = new com.google.android.gms.internal.ads.De
            r2.<init>(r5, r0)
            java.lang.String r0 = "Share"
            r1.setPositiveButton(r0, r2)
            android.content.DialogInterface$OnClickListener r0 = com.google.android.gms.internal.ads.C2283Ee.f6952a
            java.lang.String r2 = "Close"
            r1.setNegativeButton(r2, r0)
            android.app.AlertDialog r0 = r1.create()
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2169Ae.m9327e():void");
    }

    /* renamed from: a */
    public final void mo7806a() {
        try {
            if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7852Zd)).booleanValue()) {
                if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7847Yd)).booleanValue()) {
                    m9327e();
                    return;
                }
            }
            if (!(this.f6672a instanceof Activity)) {
                C2227Cf.m9534c("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(C1697X.m7708o().mo8259a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = C1697X.m7708o().mo8263b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a = m9324a((List<String>) arrayList, "Ad Information", true);
            int a2 = m9324a((List<String>) arrayList, str, ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7847Yd)).booleanValue());
            int a3 = m9324a((List<String>) arrayList, str2, ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7852Zd)).booleanValue());
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f6672a, C1697X.m7700g().mo9732f());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new C2226Ce(this, a, a2, a3));
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            if (C2857Yd.m11614a()) {
                Log.v("Ads", "", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo7807a(int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (i4 == i) {
            m9327e();
            return;
        }
        if (i4 == i2) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7847Yd)).booleanValue()) {
                C2227Cf.m9532b("Debug mode [Creative Preview] selected.");
                C3057ee.m12269a((Runnable) new C2312Fe(this));
                return;
            }
        }
        if (i4 == i3) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7852Zd)).booleanValue()) {
                C2227Cf.m9532b("Debug mode [Troubleshooting] selected.");
                C3057ee.m12269a((Runnable) new C2340Ge(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo7808a(MotionEvent motionEvent) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7856_d)).booleanValue()) {
            int actionMasked = motionEvent.getActionMasked();
            int historySize = motionEvent.getHistorySize();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked == 0) {
                this.f6681j = 0;
                this.f6683l = motionEvent.getX();
                this.f6684m = motionEvent.getY();
                return;
            }
            int i = this.f6681j;
            if (i != -1) {
                boolean z = true;
                if (i == 0 && actionMasked == 5) {
                    this.f6681j = 5;
                    this.f6685n = motionEvent.getX(1);
                    this.f6686o = motionEvent.getY(1);
                    this.f6687p.postDelayed(this.f6688q, ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7862ae)).longValue());
                } else if (this.f6681j == 5) {
                    if (pointerCount == 2) {
                        if (actionMasked == 2) {
                            boolean z2 = false;
                            for (int i2 = 0; i2 < historySize; i2++) {
                                if (!m9326a(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2))) {
                                    z2 = true;
                                }
                            }
                            if (m9326a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                                z = z2;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f6681j = -1;
                        this.f6687p.removeCallbacks(this.f6688q);
                    }
                }
            }
        } else {
            int historySize2 = motionEvent.getHistorySize();
            for (int i3 = 0; i3 < historySize2; i3++) {
                m9325a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3));
            }
            m9325a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
        }
    }

    /* renamed from: a */
    public final void mo7809a(String str) {
        this.f6674c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo7810a(String str, DialogInterface dialogInterface, int i) {
        C1697X.m7698e();
        C3114ge.m12407a(this.f6672a, Intent.createChooser(new Intent("android.intent.action.SEND").setType(HTTP.PLAIN_TEXT_TYPE).putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo7811b() {
        C1697X.m7708o().mo8261a(this.f6672a, this.f6674c, this.f6675d, this.f6676e);
    }

    /* renamed from: b */
    public final void mo7812b(String str) {
        this.f6675d = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo7813c() {
        C1697X.m7708o().mo8260a(this.f6672a, this.f6674c, this.f6675d);
    }

    /* renamed from: c */
    public final void mo7814c(String str) {
        this.f6673b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo7815d() {
        this.f6681j = 4;
        mo7806a();
    }

    /* renamed from: d */
    public final void mo7816d(String str) {
        this.f6676e = str;
    }
}
