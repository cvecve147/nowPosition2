package p299tw.navin.navinmap.map;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.o */
class C7133o {
    /* renamed from: a */
    public static C7112l.C7118f m26846a(Context context) {
        ArrayList<C7112l.C7116d> arrayList = new ArrayList<>();
        HashMap<String, C7112l.C7116d> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(C7173l.m26993a(context, "GlobalMapData"));
            for (int i = 0; i < jSONArray.length(); i++) {
                C7112l.C7116d dVar = new C7112l.C7116d();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                dVar.f19604a = jSONObject.getString("global_area");
                JSONArray jSONArray2 = jSONObject.getJSONArray("touch_rect");
                RectF[] rectFArr = new RectF[jSONArray2.length()];
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONArray jSONArray3 = jSONArray2.getJSONArray(i2);
                    RectF rectF = new RectF();
                    rectF.left = (float) jSONArray3.getDouble(0);
                    rectF.top = (float) jSONArray3.getDouble(1);
                    rectF.right = rectF.left + ((float) jSONArray3.getDouble(2));
                    rectF.bottom = rectF.top + ((float) jSONArray3.getDouble(3));
                    rectFArr[i2] = rectF;
                }
                dVar.f19605b = rectFArr;
                JSONArray jSONArray4 = jSONObject.getJSONArray("maps");
                String[] strArr = new String[jSONArray4.length()];
                for (int i3 = 0; i3 < jSONArray4.length(); i3++) {
                    strArr[i3] = jSONArray4.getString(i3);
                    hashMap.put(strArr[i3], dVar);
                }
                dVar.f19606c = strArr;
                PointF pointF = new PointF();
                pointF.set((float) jSONObject.getDouble("show_x"), (float) jSONObject.getDouble("show_y"));
                dVar.f19607d = pointF;
                arrayList.add(dVar);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C7112l.C7118f fVar = new C7112l.C7118f();
        fVar.f19624f = "https://tms.sto-tek.com/resource/TMS_ALL/map/b1.svg?apiKey=9eb557beea409cf9997f8fe6ecf38a8f";
        fVar.f19625g = "SVG";
        fVar.f19626h = 0.0f;
        fVar.f19628j = 10;
        fVar.f19627i = 15.6f;
        fVar.f19611t = arrayList;
        fVar.f19612u = hashMap;
        return fVar;
    }
}
