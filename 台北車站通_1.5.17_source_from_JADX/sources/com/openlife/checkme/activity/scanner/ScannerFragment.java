package com.openlife.checkme.activity.scanner;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.TextInputEditText;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4958i;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.scanner.p089a.C4763d;
import com.openlife.checkme.net.model.Execution;
import com.openlife.checkme.p093c.C4878i;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p108c.p109a.C5197l;
import p101d.p129g.p159f.C5743a;
import p101d.p204k.p205a.C6053f;

public class ScannerFragment extends C4672k<C4787v, C4782q> implements C4781p {

    /* renamed from: a */
    private C4763d f13719a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4787v f13720b;
    Button back;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4878i f13721c;
    View cameraView;
    TextInputEditText codeInput;

    /* renamed from: d */
    private Context f13722d;
    TextInputEditText dateInput;

    /* renamed from: e */
    private int f13723e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public CountDownTimer f13724f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String[] f13725g = new String[2];
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Execution f13726h = new Execution();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f13727i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<String> f13728j = new ArrayList();

    /* renamed from: k */
    private C4878i.C4879a f13729k = new C4767b(this);
    ImageView leftDone;
    Button manual;
    View manualView;
    SurfaceView previewView;
    LinearLayout qrcodeScanHintLayout;
    TextInputEditText randomInput;
    TextView remind;
    ImageView rightDone;
    TextInputEditText sellerInput;
    Button send;

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m18741A() {
        String[] strArr = this.f13725g;
        strArr[0] = strArr[0].replaceAll("~", "");
        Execution execution = this.f13726h;
        execution.setInvoiceQrCode(this.f13725g[0] + "!@$" + this.f13725g[1]);
        this.f13726h.setInvoiceBarCode("");
        this.f13720b.mo13219a(this.f13727i, this.f13726h);
    }

    /* renamed from: a */
    public static ScannerFragment m18742a(int i, int i2) {
        ScannerFragment scannerFragment = new ScannerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("LAUNCH_TYPE", i2);
        bundle.putInt("ID", i);
        scannerFragment.setArguments(bundle);
        return scannerFragment;
    }

    /* renamed from: a */
    public static ScannerFragment m18743a(int i, int i2, List<String> list) {
        ScannerFragment scannerFragment = new ScannerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("LAUNCH_TYPE", i2);
        bundle.putInt("ID", i);
        bundle.putStringArrayList("BEACON_LIST", (ArrayList) list);
        scannerFragment.setArguments(bundle);
        return scannerFragment;
    }

    /* renamed from: a */
    public static boolean m18746a(Context context, String str) {
        return C1006a.m5387a(context, str) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m18758u() {
        getActivity().setResult(10002, getActivity().getIntent());
        getActivity().finish();
    }

    /* renamed from: v */
    private void m18759v() {
        if (m18746a((Context) getActivity(), "android.permission.CAMERA")) {
            mo13168e(this.f13723e);
        } else {
            m18760w();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m18760w() {
        new C6053f(getActivity()).mo16004c("android.permission.CAMERA").mo16543b(new C4759a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m18761x() {
        this.f13724f = new C4775j(this, 8000, 1000);
    }

    /* renamed from: y */
    private void m18762y() {
        this.f13725g = new String[2];
        String[] strArr = this.f13725g;
        strArr[0] = "";
        strArr[1] = "";
        mo13186s();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m18763z() {
        CountDownTimer countDownTimer = this.f13724f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f13724f = null;
        }
    }

    /* renamed from: a */
    public void mo13162a() {
        this.f13719a.mo13200d();
    }

    /* renamed from: a */
    public void mo13163a(int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14395c();
    }

    /* renamed from: a */
    public void mo13164a(boolean z) {
        this.f13719a.mo13197a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
        if (z) {
            this.manual.setBackgroundColor(getResources().getColor(i));
            this.back.getBackground().setColorFilter(getResources().getColor(i), PorterDuff.Mode.SRC);
            this.send.getBackground().setColorFilter(getResources().getColor(i), PorterDuff.Mode.SRC);
        }
    }

    /* renamed from: b */
    public void mo13165b() {
        this.cameraView.setVisibility(8);
        this.manualView.setVisibility(0);
    }

    /* renamed from: c */
    public void mo13166c(int i) {
        Activity activity = getActivity();
        Intent intent = activity.getIntent();
        intent.putExtra("POINT", i);
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* renamed from: d */
    public void mo13167d(int i) {
        this.previewView.setVisibility(0);
        this.remind.setVisibility(0);
        if (i == 112) {
            this.remind.setText(this.f13722d.getString(C4961l.scanner_p_barcode_remind));
            this.qrcodeScanHintLayout.setVisibility(8);
            this.manual.setVisibility(8);
        } else if (i == 113) {
            this.remind.setText(this.f13722d.getString(C4961l.scanner_p_qrcode_remind));
            this.qrcodeScanHintLayout.setVisibility(0);
            this.manual.setVisibility(0);
        }
    }

    /* renamed from: e */
    public void mo13168e(int i) {
        C5743a aVar;
        ArrayList arrayList = new ArrayList();
        if (i != 112) {
            if (i == 113) {
                arrayList.add(C5743a.QR_CODE);
                arrayList.add(C5743a.DATA_MATRIX);
                aVar = C5743a.MAXICODE;
            }
            C4763d.C4765b bVar = new C4763d.C4765b(getActivity(), this.previewView, new C4770e(this, i));
            bVar.mo13205c(0);
            bVar.mo13202a(true);
            bVar.mo13204b(this.previewView.getHeight());
            bVar.mo13201a(this.previewView.getWidth());
            this.f13719a = bVar.mo13203a();
        }
        arrayList.add(C5743a.CODABAR);
        arrayList.add(C5743a.CODE_39);
        arrayList.add(C5743a.CODE_93);
        arrayList.add(C5743a.CODE_128);
        arrayList.add(C5743a.EAN_8);
        aVar = C5743a.EAN_13;
        arrayList.add(aVar);
        C4763d.C4765b bVar2 = new C4763d.C4765b(getActivity(), this.previewView, new C4770e(this, i));
        bVar2.mo13205c(0);
        bVar2.mo13202a(true);
        bVar2.mo13204b(this.previewView.getHeight());
        bVar2.mo13201a(this.previewView.getWidth());
        this.f13719a = bVar2.mo13203a();
    }

    /* renamed from: f */
    public void mo12965f(String str) {
        Intent intent = getActivity().getIntent();
        intent.putExtra("INTENT_ERROR_NAME", str);
        getActivity().setResult(10001, intent);
        getActivity().finish();
    }

    /* renamed from: g */
    public void mo13169g() {
        this.cameraView.setVisibility(0);
        this.manualView.setVisibility(8);
    }

    /* renamed from: h */
    public void mo13170h(int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4771f(this));
        aVar.mo14395c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_scanner_cm;
    }

    /* renamed from: k */
    public void mo13171k() {
        if (!this.f13719a.mo13198b()) {
            this.f13719a.mo13195a();
        }
        m18762y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C4787v mo12600l() {
        return this.f13720b;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13722d = getActivity().getBaseContext();
        this.f13727i = getArguments().getInt("ID");
        this.f13723e = getArguments().getInt("LAUNCH_TYPE");
        if (this.f13723e == 112) {
            if (!getActivity().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || Build.VERSION.SDK_INT < 18) {
                Toast.makeText(getActivity(), C4961l.g_ble_not_supported, 0).show();
            } else {
                ArrayList<String> stringArrayList = getArguments().getStringArrayList("BEACON_LIST");
                this.f13721c = new C4878i(getActivity().getBaseContext());
                this.f13721c.mo13393a(this.f13729k);
                this.f13728j = stringArrayList;
            }
        }
        mo13183p();
        mo13167d(this.f13723e);
        mo13169g();
        m18759v();
        m18762y();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13720b = new C4787v(this, new C4782q());
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C4958i.menu_scanner, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public void onDestroy() {
        super.onDestroy();
        C4878i iVar = this.f13721c;
        if (iVar != null) {
            iVar.mo13396b(getActivity());
        }
        this.f13720b.mo13154b();
        m18763z();
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }

    /* access modifiers changed from: package-private */
    public void onManualClick() {
        this.f13720b.mo13222d();
        m18763z();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C4956g.flashlight) {
            return false;
        }
        this.f13720b.mo13223e();
        return false;
    }

    public void onPause() {
        super.onPause();
        C4763d dVar = this.f13719a;
        if (dVar != null) {
            dVar.mo13199c();
        }
    }

    public void onResume() {
        super.onResume();
        C4763d dVar = this.f13719a;
        if (dVar != null) {
            dVar.mo13196a(this.previewView);
            if (!this.f13719a.mo13198b()) {
                this.f13719a.mo13195a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onScanClick() {
        this.f13720b.mo13221c();
    }

    /* access modifiers changed from: package-private */
    public void onSendClick() {
        this.f13720b.mo13220a(this.codeInput.getText().toString(), this.dateInput.getText().toString(), this.randomInput.getText().toString(), this.sellerInput.getText().toString(), this.f13727i, this.f13726h);
    }

    /* renamed from: p */
    public void mo13183p() {
        getActivity().getWindow().addFlags(128);
        setHasOptionsMenu(true);
        mo13169g();
        this.codeInput.setInputType(1);
        this.dateInput.setInputType(5);
        this.randomInput.setInputType(3);
        this.sellerInput.setInputType(3);
        this.codeInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
        this.randomInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        this.sellerInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
        this.dateInput.setFocusable(false);
        this.dateInput.setOnClickListener(new C4768c(this));
    }

    /* renamed from: q */
    public void mo13184q() {
        this.leftDone.setVisibility(0);
    }

    /* renamed from: r */
    public void mo13185r() {
        this.rightDone.setVisibility(0);
    }

    /* renamed from: s */
    public void mo13186s() {
        this.leftDone.setVisibility(4);
        this.rightDone.setVisibility(4);
    }

    /* renamed from: t */
    public void mo13187t() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new C4772g(this), Calendar.getInstance().get(1), Calendar.getInstance().get(2), Calendar.getInstance().get(5));
        datePickerDialog.getDatePicker().setMaxDate(Calendar.getInstance().getTimeInMillis());
        datePickerDialog.show();
    }
}
