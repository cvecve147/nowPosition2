package p267i.p274b.p275a.p276a;

import android.content.Context;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import p267i.p274b.p275a.C6697b;
import p267i.p274b.p275a.C6700c;
import p267i.p274b.p275a.p276a.C6695b;

/* renamed from: i.b.a.a.a */
public class C6694a implements Callback {

    /* renamed from: a */
    protected Context f18581a = null;

    /* renamed from: b */
    protected C6695b f18582b = null;

    /* renamed from: c */
    protected boolean f18583c = false;

    /* renamed from: d */
    protected String f18584d = null;

    /* renamed from: e */
    protected String f18585e = null;

    /* renamed from: f */
    protected Object f18586f = null;

    /* renamed from: g */
    protected int f18587g = -1;

    /* renamed from: h */
    protected Object f18588h = null;

    /* renamed from: i */
    protected C6697b f18589i;

    public C6694a(Context context, C6695b bVar, int i, int i2) {
        this.f18581a = context;
        this.f18582b = bVar;
        this.f18587g = i2;
        mo5465a(i);
    }

    /* renamed from: a */
    private void mo5465a(int i) {
        this.f18584d = String.valueOf(i);
        this.f18585e = this.f18581a.getString(C6700c.sango_dialog_api_connection_failed_msg);
    }

    /* renamed from: c */
    private void m25427c() {
        this.f18581a = null;
        this.f18582b = null;
    }

    /* renamed from: a */
    public void mo17144a() {
        C6695b bVar = this.f18582b;
        if (bVar != null) {
            if (this.f18583c) {
                bVar.mo5472a(this.f18587g, this.f18586f);
            } else {
                C6695b.C6696a aVar = new C6695b.C6696a();
                aVar.f18590a = this.f18584d;
                aVar.f18591b = this.f18585e;
                this.f18582b.mo5471a(this.f18587g, aVar, this.f18586f);
            }
        }
        C6697b bVar2 = this.f18589i;
        if (bVar2 != null) {
            bVar2.mo17150a(bVar2, this.f18583c);
        }
        m25427c();
    }

    /* renamed from: a */
    public void mo17145a(C6697b bVar) {
        this.f18589i = bVar;
    }

    /* renamed from: b */
    public Object mo17146b() {
        return this.f18588h;
    }

    public void onFailure(Call call, IOException iOException) {
        mo17144a();
    }

    public void onResponse(Call call, Response response) {
    }
}
