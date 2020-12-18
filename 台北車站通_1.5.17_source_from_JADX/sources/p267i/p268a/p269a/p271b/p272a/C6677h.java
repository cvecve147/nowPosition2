package p267i.p268a.p269a.p271b.p272a;

import android.app.Activity;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import p267i.p268a.p269a.C6689e;
import p267i.p268a.p269a.p270a.C6667g;
import p267i.p274b.p277b.p278a.C6707b;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: i.a.a.b.a.h */
public class C6677h extends C6670a {

    /* renamed from: q */
    private final String f18557q = "token";

    public C6677h(Activity activity, C6705b bVar) {
        super(activity, bVar, 310101);
    }

    public void onResponse(Call call, Response response) {
        try {
            JSONObject jSONObject = new JSONObject(response.body().string());
            if (jSONObject.has("success")) {
                String string = jSONObject.getString("success");
                this.f18619f = string;
                C6667g.m25353a(this.f18614a, string);
                C6707b c = this.f18621h.mo17162c();
                if (c != null) {
                    c.mo17159a("token", string);
                }
                this.f18616c = true;
            } else {
                this.f18617d = String.valueOf(310105);
                this.f18618e = this.f18614a.getResources().getString(C6689e.dialog_get_token_failed_msg);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            this.f18617d = String.valueOf(310102);
            this.f18618e = this.f18614a.getString(C6689e.dialog_parse_json_failed_msg);
        }
        if (response != null) {
            response.body().close();
        }
        mo17154a();
    }
}
