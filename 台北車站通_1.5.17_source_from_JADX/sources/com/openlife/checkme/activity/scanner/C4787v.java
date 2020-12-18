package com.openlife.checkme.activity.scanner;

import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.scanner.C4779n;
import com.openlife.checkme.activity.scanner.C4781p;
import com.openlife.checkme.net.model.Execution;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p243h.C6418a;

/* renamed from: com.openlife.checkme.activity.scanner.v */
public class C4787v<V extends C4781p, M extends C4779n> extends C4780o {

    /* renamed from: d */
    private boolean f13782d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4781p f13783e;

    /* renamed from: f */
    private C4779n f13784f;

    public C4787v(V v, M m) {
        super(v, m);
        this.f13783e = v;
        this.f13784f = m;
    }

    /* renamed from: a */
    public void mo13219a(int i, Execution execution) {
        C4458a a = mo13150a();
        C4779n nVar = this.f13784f;
        a.mo12586a(nVar.mo13215a(nVar.mo13214a(i, execution)).mo16545b(C6418a.m23996b()).mo16533a((C6242d<? super C6223b>) new C4786u(this)).mo16544b((C6239a) new C4785t(this)).mo16540a(C6216b.m23500a()).mo16526a(new C4783r(this), (C6242d<? super Throwable>) new C4784s(this)));
    }

    /* renamed from: a */
    public void mo13220a(String str, String str2, String str3, String str4, int i, Execution execution) {
        if (str.equals("")) {
            this.f13783e.mo13163a(C4961l.invoice_a_nonInvoice);
        } else if (str2.equals("")) {
            this.f13783e.mo13163a(C4961l.invoice_a_nonDate);
        } else if (str3.equals("")) {
            this.f13783e.mo13163a(C4961l.invoice_a_nonRandom);
        } else if (str4.equals("")) {
            this.f13783e.mo13163a(C4961l.invoice_a_nonTaxID);
        } else {
            String upperCase = str.replaceAll("-", "").toUpperCase();
            String replaceAll = str2.replaceAll("-", "");
            String str5 = replaceAll.substring(0, 3) + String.format("%02d", new Object[]{Integer.valueOf((((Integer.parseInt(replaceAll.substring(3, 5)) - 1) / 2) + 1) * 2)});
            if (upperCase.length() != 10) {
                this.f13783e.mo13163a(C4961l.invoice_a_errInvoice);
            } else if (str3.length() != 4) {
                this.f13783e.mo13163a(C4961l.invoice_a_errRandom);
            } else if (str4.length() != 8) {
                this.f13783e.mo13163a(C4961l.invoice_a_errTaxIDice);
            } else {
                execution.setInvoiceQrCode("");
                execution.setInvoiceBarCode(str5 + upperCase + str3 + str4);
                mo13219a(i, execution);
            }
        }
    }

    /* renamed from: c */
    public void mo13221c() {
        this.f13783e.mo13169g();
        this.f13783e.mo13171k();
    }

    /* renamed from: d */
    public void mo13222d() {
        this.f13783e.mo13165b();
        this.f13783e.mo13162a();
    }

    /* renamed from: e */
    public void mo13223e() {
        this.f13783e.mo13164a(!this.f13782d);
        this.f13782d = !this.f13782d;
    }
}
