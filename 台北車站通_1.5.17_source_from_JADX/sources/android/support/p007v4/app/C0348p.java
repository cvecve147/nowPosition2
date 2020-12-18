package android.support.p007v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.p */
public class C0348p {

    /* renamed from: a */
    private final C0349q<?> f1478a;

    private C0348p(C0349q<?> qVar) {
        this.f1478a = qVar;
    }

    /* renamed from: a */
    public static C0348p m1643a(C0349q<?> qVar) {
        return new C0348p(qVar);
    }

    /* renamed from: a */
    public C0339l mo1464a(String str) {
        return this.f1478a.f1483e.mo1549b(str);
    }

    /* renamed from: a */
    public View mo1465a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1478a.f1483e.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void mo1466a() {
        this.f1478a.f1483e.mo1571h();
    }

    /* renamed from: a */
    public void mo1467a(Configuration configuration) {
        this.f1478a.f1483e.mo1531a(configuration);
    }

    /* renamed from: a */
    public void mo1468a(Parcelable parcelable, C0370z zVar) {
        this.f1478a.f1483e.mo1533a(parcelable, zVar);
    }

    /* renamed from: a */
    public void mo1469a(C0339l lVar) {
        C0349q<?> qVar = this.f1478a;
        qVar.f1483e.mo1541a((C0349q) qVar, (C0347o) qVar, lVar);
    }

    /* renamed from: a */
    public void mo1470a(Menu menu) {
        this.f1478a.f1483e.mo1543a(menu);
    }

    /* renamed from: a */
    public void mo1471a(boolean z) {
        this.f1478a.f1483e.mo1544a(z);
    }

    /* renamed from: a */
    public boolean mo1472a(Menu menu, MenuInflater menuInflater) {
        return this.f1478a.f1483e.mo1545a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo1473a(MenuItem menuItem) {
        return this.f1478a.f1483e.mo1546a(menuItem);
    }

    /* renamed from: b */
    public void mo1474b() {
        this.f1478a.f1483e.mo1574i();
    }

    /* renamed from: b */
    public void mo1475b(boolean z) {
        this.f1478a.f1483e.mo1555b(z);
    }

    /* renamed from: b */
    public boolean mo1476b(Menu menu) {
        return this.f1478a.f1483e.mo1556b(menu);
    }

    /* renamed from: b */
    public boolean mo1477b(MenuItem menuItem) {
        return this.f1478a.f1483e.mo1557b(menuItem);
    }

    /* renamed from: c */
    public void mo1478c() {
        this.f1478a.f1483e.mo1576j();
    }

    /* renamed from: d */
    public void mo1479d() {
        this.f1478a.f1483e.mo1581l();
    }

    /* renamed from: e */
    public void mo1480e() {
        this.f1478a.f1483e.mo1582m();
    }

    /* renamed from: f */
    public void mo1481f() {
        this.f1478a.f1483e.mo1584n();
    }

    /* renamed from: g */
    public void mo1482g() {
        this.f1478a.f1483e.mo1586o();
    }

    /* renamed from: h */
    public void mo1483h() {
        this.f1478a.f1483e.mo1590p();
    }

    /* renamed from: i */
    public void mo1484i() {
        this.f1478a.f1483e.mo1591q();
    }

    /* renamed from: j */
    public boolean mo1485j() {
        return this.f1478a.f1483e.mo1593s();
    }

    /* renamed from: k */
    public C0350r mo1486k() {
        return this.f1478a.mo1492d();
    }

    /* renamed from: l */
    public void mo1487l() {
        this.f1478a.f1483e.mo1597v();
    }

    /* renamed from: m */
    public C0370z mo1488m() {
        return this.f1478a.f1483e.mo1599x();
    }

    /* renamed from: n */
    public Parcelable mo1489n() {
        return this.f1478a.f1483e.mo1600y();
    }
}
