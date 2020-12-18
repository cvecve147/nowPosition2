package com.openlife.checkme.activity.mission.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.support.p007v4.view.C0483r;
import android.support.p007v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.openlife.checkme.C4948e;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.scanner.ScannerActivity;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.net.model.MissionDetailData;
import com.openlife.checkme.p093c.C4878i;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p100ui.PointAnimationActivity;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.protocol.HTTP;

public class MissionDetailFragment extends C4672k<C4720p, C4717m> implements C4716l {

    /* renamed from: a */
    C4709e f13607a;

    /* renamed from: b */
    private Context f13608b;

    /* renamed from: c */
    private C4878i f13609c;

    /* renamed from: d */
    private C4704a f13610d;
    TextView desc;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4720p f13611e;
    Button execute;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f13612f;

    /* renamed from: g */
    private boolean f13613g;

    /* renamed from: h */
    private boolean f13614h = false;

    /* renamed from: i */
    private int f13615i;
    CirclePageIndicator indicator;

    /* renamed from: j */
    private List<String> f13616j = new ArrayList();

    /* renamed from: k */
    private C4878i.C4879a f13617k = new C4705a(this);
    TextView notice;
    LinearLayout tagLayout;
    TextView time;
    TextView title;
    ViewPager viewPager;
    WebView webView;

    /* renamed from: com.openlife.checkme.activity.mission.detail.MissionDetailFragment$a */
    public enum C4704a {
        COME_STORE(1),
        SCAN_BARCODE(2),
        INVOICE(7);
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final int f13622e;

        private C4704a(int i) {
            this.f13622e = i;
        }
    }

    /* renamed from: d */
    public static MissionDetailFragment m18545d(int i) {
        MissionDetailFragment missionDetailFragment = new MissionDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ID", i);
        missionDetailFragment.setArguments(bundle);
        return missionDetailFragment;
    }

    /* renamed from: g */
    private void m18546g() {
        C4704a aVar = this.f13610d;
        if (aVar != null) {
            int i = C4707c.f13627a[aVar.ordinal()];
            if (i == 1) {
                if (!this.f13609c.mo13397b()) {
                    this.f13609c.mo13398c();
                }
                if (this.f13609c.mo13397b() && !this.f13609c.mo13395a()) {
                    this.f13609c.mo13394a(this.f13616j);
                    this.f13609c.mo13392a(getActivity());
                }
            } else if (i == 2) {
                ScannerActivity.m18738a(getActivity(), this.f13612f, 112, this.f13616j);
            } else if (i == 3) {
                ScannerActivity.m18737a(getActivity(), this.f13612f, 113);
            }
        }
    }

    /* renamed from: h */
    private void m18547h(int i) {
        PointAnimationActivity.m19814a(getActivity(), i);
    }

    /* renamed from: a */
    public void mo13045a() {
        this.f13611e.mo12683b(this.f13612f);
    }

    /* renamed from: a */
    public void mo13046a(int i) {
        m18547h(i);
        this.f13611e.mo12683b(this.f13612f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    @android.annotation.SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13047a(int r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = -3
            r1 = 1
            r2 = 0
            if (r5 == r0) goto L_0x0054
            r0 = -2
            if (r5 == r0) goto L_0x0049
            r0 = -1
            if (r5 == r0) goto L_0x003e
            if (r5 == 0) goto L_0x0033
            android.content.Context r5 = r4.f13608b
            boolean r0 = r4.f13614h
            if (r0 == 0) goto L_0x0016
            int r0 = r4.f13615i
            goto L_0x0018
        L_0x0016:
            int r0 = com.openlife.checkme.C4948e.cyan
        L_0x0018:
            android.content.res.ColorStateList r5 = p013b.p018b.p028h.p029a.C1006a.m5392b(r5, r0)
            boolean r0 = r4.f13613g
            if (r0 == 0) goto L_0x002b
            int r0 = com.openlife.checkme.C4961l.missiondetail_b_excute
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r2] = r6
            java.lang.String r6 = r4.getString(r0, r3)
            goto L_0x0031
        L_0x002b:
            int r6 = com.openlife.checkme.C4961l.missiondetail_b_excute_not_show_point
            java.lang.String r6 = r4.getString(r6)
        L_0x0031:
            r2 = r1
            goto L_0x0062
        L_0x0033:
            android.content.Context r5 = r4.f13608b
            int r6 = com.openlife.checkme.C4948e.mediumgray
            android.content.res.ColorStateList r5 = p013b.p018b.p028h.p029a.C1006a.m5392b(r5, r6)
            int r6 = com.openlife.checkme.C4961l.missiondetail_b_finished
            goto L_0x005e
        L_0x003e:
            android.content.Context r5 = r4.f13608b
            int r6 = com.openlife.checkme.C4948e.mediumgray
            android.content.res.ColorStateList r5 = p013b.p018b.p028h.p029a.C1006a.m5392b(r5, r6)
            int r6 = com.openlife.checkme.C4961l.missiondetail_b_full
            goto L_0x005e
        L_0x0049:
            android.content.Context r5 = r4.f13608b
            int r6 = com.openlife.checkme.C4948e.mediumgray
            android.content.res.ColorStateList r5 = p013b.p018b.p028h.p029a.C1006a.m5392b(r5, r6)
            int r6 = com.openlife.checkme.C4961l.missiondetail_b_lock
            goto L_0x005e
        L_0x0054:
            android.content.Context r5 = r4.f13608b
            int r6 = com.openlife.checkme.C4948e.mediumgray
            android.content.res.ColorStateList r5 = p013b.p018b.p028h.p029a.C1006a.m5392b(r5, r6)
            int r6 = com.openlife.checkme.C4961l.missiondetail_b_close
        L_0x005e:
            java.lang.String r6 = r4.getString(r6)
        L_0x0062:
            android.widget.Button r0 = r4.execute
            r0.setText(r6)
            android.widget.Button r6 = r4.execute
            r6.setEnabled(r2)
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r6 != r0) goto L_0x007a
            android.widget.Button r6 = r4.execute
            android.support.v7.widget.m r6 = (android.support.p011v7.widget.C0858m) r6
            r6.setSupportBackgroundTintList(r5)
            goto L_0x007f
        L_0x007a:
            android.widget.Button r6 = r4.execute
            android.support.p007v4.view.C0487v.m2270a((android.view.View) r6, (android.content.res.ColorStateList) r5)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.openlife.checkme.activity.mission.detail.MissionDetailFragment.mo13047a(int, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13048a(int r2, java.util.List<java.lang.String> r3) {
        /*
            r1 = this;
            com.openlife.checkme.activity.mission.detail.MissionDetailFragment$a r0 = com.openlife.checkme.activity.mission.detail.MissionDetailFragment.C4704a.COME_STORE
            int r0 = r0.f13622e
            if (r0 != r2) goto L_0x000d
            com.openlife.checkme.activity.mission.detail.MissionDetailFragment$a r0 = com.openlife.checkme.activity.mission.detail.MissionDetailFragment.C4704a.COME_STORE
        L_0x000a:
            r1.f13610d = r0
            goto L_0x0023
        L_0x000d:
            com.openlife.checkme.activity.mission.detail.MissionDetailFragment$a r0 = com.openlife.checkme.activity.mission.detail.MissionDetailFragment.C4704a.SCAN_BARCODE
            int r0 = r0.f13622e
            if (r0 != r2) goto L_0x0018
            com.openlife.checkme.activity.mission.detail.MissionDetailFragment$a r0 = com.openlife.checkme.activity.mission.detail.MissionDetailFragment.C4704a.SCAN_BARCODE
            goto L_0x000a
        L_0x0018:
            com.openlife.checkme.activity.mission.detail.MissionDetailFragment$a r0 = com.openlife.checkme.activity.mission.detail.MissionDetailFragment.C4704a.INVOICE
            int r0 = r0.f13622e
            if (r0 != r2) goto L_0x0023
            com.openlife.checkme.activity.mission.detail.MissionDetailFragment$a r0 = com.openlife.checkme.activity.mission.detail.MissionDetailFragment.C4704a.INVOICE
            goto L_0x000a
        L_0x0023:
            com.openlife.checkme.activity.mission.detail.MissionDetailFragment$a r0 = com.openlife.checkme.activity.mission.detail.MissionDetailFragment.C4704a.COME_STORE
            int r0 = r0.f13622e
            if (r0 == r2) goto L_0x0033
            com.openlife.checkme.activity.mission.detail.MissionDetailFragment$a r0 = com.openlife.checkme.activity.mission.detail.MissionDetailFragment.C4704a.SCAN_BARCODE
            int r0 = r0.f13622e
            if (r0 != r2) goto L_0x004c
        L_0x0033:
            android.app.Activity r2 = r1.getActivity()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.bluetooth_le"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L_0x004d
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r2 >= r0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            r1.f13616j = r3
        L_0x004c:
            return
        L_0x004d:
            android.app.Activity r2 = r1.getActivity()
            int r3 = com.openlife.checkme.C4961l.g_ble_not_supported
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.openlife.checkme.activity.mission.detail.MissionDetailFragment.mo13048a(int, java.util.List):void");
    }

    /* renamed from: a */
    public void mo13049a(MissionDetailData missionDetailData) {
        setHasOptionsMenu(true);
        this.f13607a = Build.VERSION.SDK_INT >= 17 ? new C4709e(getChildFragmentManager(), missionDetailData.getImage()) : new C4709e(getFragmentManager(), missionDetailData.getImage());
        this.viewPager.setOffscreenPageLimit(this.f13607a.mo1972a());
        this.viewPager.setAdapter(this.f13607a);
        this.indicator.setViewPager(this.viewPager);
        this.indicator.setFillColor(getResources().getColor(C4948e.indicator_fill));
        this.indicator.setPageColor(getResources().getColor(C4948e.indicator_page));
        String string = getString(C4961l.missiondetail_p_time, new Object[]{C4883m.m19223a(C4883m.m19225a(), C4883m.m19239c(), missionDetailData.getStartDate()), C4883m.m19223a(C4883m.m19225a(), C4883m.m19239c(), missionDetailData.getEndDate())});
        this.title.setText(missionDetailData.getName());
        this.desc.setText(missionDetailData.getProductDesc());
        this.time.setText(string);
        this.notice.setText(missionDetailData.getNotice());
        this.webView.loadDataWithBaseURL((String) null, missionDetailData.getDesc(), "text/html", HTTP.UTF_8, (String) null);
    }

    /* renamed from: a */
    public void mo13050a(List<String> list) {
        this.tagLayout.removeAllViews();
        int i = 0;
        while (i < list.size()) {
            View inflate = LayoutInflater.from(this.f13608b).inflate(C4957h.view_mission_detail_tag_cm, (ViewGroup) null, false);
            ImageView imageView = (ImageView) inflate.findViewById(C4956g.icon);
            TextView textView = (TextView) inflate.findViewById(C4956g.title);
            imageView.setImageResource(i != 0 ? i != 1 ? C4959j.icon_number03 : C4959j.icon_number02 : C4959j.icon_number01);
            textView.setText(list.get(i));
            this.tagLayout.addView(inflate);
            i++;
        }
    }

    /* renamed from: a */
    public void mo13051a(boolean z) {
        this.f13613g = z;
        WebSettings settings = this.webView.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setSupportZoom(true);
        this.webView.setWebChromeClient(new WebChromeClient());
        this.webView.setWebViewClient(new C4706b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
        this.f13614h = z;
        this.f13615i = i;
        if (z) {
            this.execute.getBackground().setColorFilter(getResources().getColor(i), PorterDuff.Mode.SRC);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C4720p mo12600l() {
        return this.f13611e;
    }

    /* renamed from: c */
    public void mo13053c(int i) {
        C4789a aVar = new C4789a();
        aVar.mo13235a(C4947j.m19536a().mo13553d().mo13494j());
        this.f13611e.mo13085a(aVar);
    }

    /* renamed from: e */
    public void mo13054e(int i) {
        mo12959b(mo12966g(i));
    }

    /* access modifiers changed from: package-private */
    public void executeMission() {
        m18546g();
    }

    /* renamed from: i */
    public void mo12968i() {
        mo13045a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_mission_detail_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13608b = getActivity().getBaseContext();
        this.f13612f = getArguments().getInt("ID");
        this.f13609c = new C4878i(getActivity().getBaseContext());
        this.f13609c.mo13393a(this.f13617k);
        this.f13611e.mo13086c();
        this.f13611e.mo13087d();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            Activity activity = getActivity();
            if (i == 101) {
                activity.setResult(-1, activity.getIntent());
                activity.finish();
            } else if (i == 9999) {
                PointAnimationActivity.m19814a(activity, intent.getIntExtra("POINT", 0));
            }
        }
        if (i2 == 10001 && intent.hasExtra("INTENT_ERROR_NAME")) {
            mo12965f(intent.getStringExtra("INTENT_ERROR_NAME"));
        }
        if (i2 == 10002) {
            m18546g();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13611e = new C4720p(this, new C4717m());
    }

    public void onDestroyView() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.viewPager.setAdapter((C0483r) null);
        }
        this.f13609c.mo13396b(getActivity());
        this.f13609c = null;
        super.onDestroyView();
        mo12970m().mo5375a();
    }
}
