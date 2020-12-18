package com.askey.taipeinavi.p058d;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p299tw.navin.navinmap.map.C7095d;

/* renamed from: com.askey.taipeinavi.d.a */
public class C1207a {
    /* renamed from: a */
    private static String m6012a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = context.getAssets().open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, HTTP.UTF_8));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            open.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static ArrayList<C7095d> m6013a(Context context) {
        ArrayList<C7095d> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(m6012a(context, "ShowPOI"));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("ID");
                int i2 = jSONObject.getString("Type").startsWith("s") ? 1 : 2;
                C7095d dVar = new C7095d();
                dVar.mo21135b(string);
                dVar.mo21130a(i2);
                arrayList.add(dVar);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
