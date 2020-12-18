package com.askey.taipeinavi.p053a.p054a;

import android.app.Activity;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.p058d.C1213g;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import p267i.p274b.p275a.C6697b;
import p267i.p274b.p275a.p276a.C6695b;

/* renamed from: com.askey.taipeinavi.a.a.b */
public class C1175b extends C1174a {

    /* renamed from: l */
    private final String f4348l = "token";

    public C1175b(Activity activity, C6695b bVar, int i) {
        super(activity, bVar, 210101, i);
    }

    public void onResponse(Call call, Response response) {
        try {
            JSONObject jSONObject = new JSONObject(response.body().string());
            if (jSONObject.has("success")) {
                String string = jSONObject.getString("success");
                this.f18586f = string;
                C1213g.m6053c(this.f18581a, string);
                C6697b b = this.f18589i.mo17151b();
                if (b != null) {
                    b.mo17149a("token", string);
                }
                this.f18583c = true;
            } else {
                this.f18584d = String.valueOf(210104);
                this.f18585e = this.f18581a.getResources().getString(R.string.dialog_get_token_failed_msg);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            this.f18584d = String.valueOf(210102);
            this.f18585e = this.f18581a.getString(R.string.dialog_parse_json_failed_msg);
        }
        if (response != null) {
            response.body().close();
        }
        mo17144a();
    }
}
