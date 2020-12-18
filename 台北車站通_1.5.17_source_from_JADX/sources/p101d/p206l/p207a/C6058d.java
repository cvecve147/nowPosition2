package p101d.p206l.p207a;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.location.LocationManager;
import android.os.Build;
import android.support.p007v4.app.C0308b;
import android.support.p011v7.app.C0621l;
import com.whatsmedia.ibeaconshakingproject.shakingDetect.C5169d;
import com.whatsmedia.ibeaconshakingproject.shakingDetect.C5171f;
import p013b.p018b.p028h.p029a.C1006a;

/* renamed from: d.l.a.d */
public class C6058d {

    /* renamed from: a */
    private static C6058d f16967a;

    /* renamed from: b */
    public static boolean f16968b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Activity f16969c;

    /* renamed from: d */
    private C6059a f16970d;

    /* renamed from: d.l.a.d$a */
    public interface C6059a {
        /* renamed from: a */
        void mo5550a();

        /* renamed from: a */
        void mo5551a(String str);
    }

    private C6058d(Activity activity) {
        this.f16969c = activity;
    }

    /* renamed from: a */
    public static C6058d m22968a(Activity activity) {
        if (f16967a == null) {
            f16967a = new C6058d(activity);
        }
        return f16967a;
    }

    /* renamed from: a */
    public static void m22969a() {
        f16968b = false;
    }

    /* renamed from: b */
    public static void m22970b() {
        f16968b = true;
    }

    /* renamed from: e */
    public static C6058d m22971e() {
        return f16967a;
    }

    /* renamed from: a */
    public void mo16019a(C6059a aVar) {
        this.f16970d = aVar;
    }

    /* renamed from: a */
    public void mo16020a(String str) {
        C6059a aVar = this.f16970d;
        if (aVar != null) {
            aVar.mo5551a(str);
        }
    }

    /* renamed from: b */
    public void mo16021b(String str) {
        new C5171f().execute(new String[]{str});
    }

    /* renamed from: c */
    public void mo16022c() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            while (!defaultAdapter.isEnabled()) {
                defaultAdapter.enable();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            mo16024f();
        }
    }

    /* renamed from: d */
    public void mo16023d() {
        if (C1006a.m5387a((Context) this.f16969c, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            C0308b.m1391a(this.f16969c, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, 1);
        } else if (C5169d.m20002a((Context) this.f16969c) != null) {
            C5169d.m20002a((Context) this.f16969c).mo14326b();
        }
    }

    /* renamed from: f */
    public void mo16024f() {
        Activity activity = this.f16969c;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                LocationManager locationManager = (LocationManager) activity.getSystemService("location");
                if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
                    C0621l.C0622a aVar = new C0621l.C0622a(this.f16969c);
                    aVar.mo2594a(C6055a.dialog_location_permission_msg);
                    aVar.mo2602a(false);
                    aVar.mo2607b(C6055a.dialog_btn_setting, (DialogInterface.OnClickListener) new C6056b(this));
                    aVar.mo2595a(C6055a.dialog_btn_setting_later, (DialogInterface.OnClickListener) new C6057c(this));
                    aVar.mo2610c();
                    return;
                }
            }
            mo16023d();
        }
    }

    /* renamed from: g */
    public void mo16025g() {
        C6059a aVar = this.f16970d;
        if (aVar != null) {
            aVar.mo5550a();
        }
    }

    /* renamed from: h */
    public void mo16026h() {
        C5169d a = C5169d.m20002a((Context) this.f16969c);
        if (a != null) {
            a.mo14327b("");
        }
    }
}
