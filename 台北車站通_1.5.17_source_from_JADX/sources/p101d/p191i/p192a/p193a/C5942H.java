package p101d.p191i.p192a.p193a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p119e.p120a.p121a.C5262j;
import p101d.p191i.p192a.C5931a;
import p101d.p191i.p192a.p198c.C6007b;
import p101d.p191i.p192a.p200e.C6021e;
import p101d.p191i.p192a.p200e.C6023g;

/* renamed from: d.i.a.a.H */
public class C5942H {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f16462a = "STOResourceManager";

    /* renamed from: b */
    private static int f16463b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C6007b f16464c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C5931a f16465d = null;

    /* renamed from: e */
    private static String f16466e = "";

    /* renamed from: f */
    public static int f16467f = 0;

    /* renamed from: g */
    public static int f16468g = 1;

    /* renamed from: h */
    public static int f16469h = 2;

    /* renamed from: i */
    public static int f16470i = 3;

    /* renamed from: j */
    public static int f16471j = 4;

    /* renamed from: k */
    public static int f16472k = 5;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static int f16473l;

    /* renamed from: m */
    private static List<C5944b> f16474m = new ArrayList();

    /* renamed from: d.i.a.a.H$a */
    private static class C5943a implements C6007b.C6008a {

        /* renamed from: a */
        private int f16475a = 0;

        /* renamed from: b */
        private int f16476b = 0;

        /* renamed from: c */
        private String f16477c = "";

        /* renamed from: d */
        private Boolean f16478d = false;

        /* renamed from: e */
        private Context f16479e;

        public C5943a(Context context, int i, String str) {
            this.f16479e = context;
            this.f16475a = i;
            this.f16477c = str;
            new Thread(new C5941G(this)).start();
        }

        /* renamed from: a */
        public void mo15744a(String str) {
            String a = C5942H.f16462a;
            Log.e(a, "下載更新資料失敗：" + str);
            int i = C5942H.f16472k;
            C5942H.m22502b(i, "下載更新資料失敗：" + str);
            this.f16475a = this.f16475a - 1;
            this.f16478d = true;
        }

        /* renamed from: a */
        public void mo15745a(String str, String str2) {
            this.f16476b++;
            Log.d(C5942H.f16462a, "下載更新資料成功：[" + str + "]" + str2);
            int unused = C5942H.f16473l = 0;
            if (this.f16476b == this.f16475a) {
                Log.d(C5942H.f16462a, "更新地圖資源完成。");
                C5942H.m22502b(C5942H.f16470i, "更新地圖資源完成。");
                C5942H.m22512j();
                if (!this.f16478d.booleanValue()) {
                    C5942H.f16464c.mo15882a();
                    C6021e eVar = new C6021e();
                    eVar.mo15926a(this.f16479e);
                    eVar.mo15924a("resKey", this.f16477c);
                }
            }
        }
    }

    /* renamed from: d.i.a.a.H$b */
    public interface C5944b {
        /* renamed from: a */
        void mo5612a();

        /* renamed from: a */
        void mo5613a(int i, String str);

        /* renamed from: b */
        void mo5614b();
    }

    /* renamed from: a */
    public static void m22497a(Context context) {
        if (!Boolean.valueOf(m22504b(context)).booleanValue()) {
            m22502b(4, "無網路服務, 請稍候再試！");
            C6023g.m22858a(context, "無網路服務, 請稍候再試！");
            m22512j();
            return;
        }
        f16464c = new C6007b(context);
        f16465d = new C5931a(context);
        C6021e b = f16465d.mo15720b();
        String str = context.getExternalFilesDir((String) null).toString() + "/";
        Log.d(f16462a, str);
        if (!b.mo15923a("isInitialized", (Boolean) false).booleanValue()) {
            Log.d(f16462a, "初始化地圖資源: " + str);
            m22502b(f16467f, "初始化地圖資源...");
            m22498a(context, "base_icon.zip", str + "temp.zip");
            f16464c.mo15885b(str + "temp.zip", str);
            f16464c.mo15881a(str + "temp.zip");
            m22498a(context, "defaultResource.zip", str + "temp.zip");
            f16464c.mo15885b(str + "temp.zip", str + "/resource/keelung01/");
            f16464c.mo15881a(str + "temp.zip");
            b.mo15928b("isInitialized", true);
            b.mo15924a("resKey", "");
            Log.d(f16462a, "初始化地圖資源完成");
            m22502b(f16468g, "初始化地圖資源完成");
        }
        f16466e = b.mo15930c("resKey");
        f16465d.mo15714a().mo15734a(new C5262j(0, f16465d.mo15725c(f16466e), new C5937C(context, str), new C5938D(context)));
        m22513k();
    }

    /* renamed from: a */
    private static void m22498a(Context context, String str, String str2) {
        try {
            byte[] bArr = new byte[2048];
            InputStream open = context.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    open.close();
                    fileOutputStream.close();
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22500a(C5944b bVar) {
        f16474m.add(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m22502b(int i, String str) {
        for (int i2 = 0; i2 < f16474m.size(); i2++) {
            f16474m.get(i2).mo5613a(i, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m22503b(Context context, JSONObject jSONObject, String str) {
        String str2;
        int i;
        try {
            f16466e = jSONObject.getString(ClientCookie.VERSION_ATTR);
            JSONArray jSONArray = jSONObject.getJSONArray("file");
            if (jSONArray.length() > 0) {
                f16463b = jSONArray.length();
                f16464c.mo15883a((C6007b.C6008a) new C5943a(context, jSONArray.length(), f16466e));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String replace = ((String) jSONArray.get(i2)).replace("icon//icon", "icon").replace(" ", "%20");
                    if (replace.substring(0, 1).compareTo("/") != 0) {
                        replace = "/" + replace;
                    }
                    if (replace.contains(".png")) {
                        if (!replace.contains("/icon/")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("/icon");
                            sb.append(replace);
                            replace = sb.toString();
                        }
                    }
                    C6007b bVar = f16464c;
                    String d = f16465d.mo15729d(replace);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("resource");
                    sb2.append(replace);
                    bVar.mo15884a(d, sb2.toString());
                }
            }
        } catch (JSONException e) {
            if (f16466e.compareTo("") != 0) {
                e.printStackTrace();
                C6023g.m22858a(context, "來源資料格式錯誤");
                i = f16471j;
                str2 = "來源資料格式錯誤: " + jSONObject.toString();
            } else {
                str2 = "更新地圖資源完成。";
                Log.d(f16462a, str2);
                i = f16470i;
            }
            m22502b(i, str2);
            m22512j();
        }
    }

    /* renamed from: b */
    private static boolean m22504b(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
    }

    /* renamed from: e */
    static /* synthetic */ int m22507e() {
        int i = f16473l;
        f16473l = i + 1;
        return i;
    }

    /* renamed from: h */
    public static void m22510h() {
        List<C5944b> list = f16474m;
        list.removeAll(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m22511i() {
        for (int i = 0; i < f16474m.size(); i++) {
            f16474m.get(i).mo5614b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static void m22512j() {
        for (int i = 0; i < f16474m.size(); i++) {
            f16474m.get(i).mo5612a();
        }
    }

    /* renamed from: k */
    private static void m22513k() {
        JSONArray c = f16465d.mo15728c();
        for (int i = 0; i < c.length(); i++) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("https://tms.sto-tek.com/api/pois?building=");
                sb.append(c.get(i));
                sb.append("&floor=all&apiKey=5fba51d1f036aa4c7a1a808eb98482f9&typeID=5");
                f16465d.mo15714a().mo15734a(new C5262j(0, sb.toString(), new C5939E(c, i), new C5940F()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
