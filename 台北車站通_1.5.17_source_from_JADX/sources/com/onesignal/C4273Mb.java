package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.C4306Xa;
import com.onesignal.C4416rb;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.Mb */
class C4273Mb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f12668a = -99;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Class<?> f12669b;

    /* renamed from: c */
    private ServiceConnection f12670c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Object f12671d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Method f12672e;

    /* renamed from: f */
    private Method f12673f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Context f12674g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ArrayList<String> f12675h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f12676i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f12677j;

    C4273Mb(Context context) {
        boolean z = false;
        this.f12677j = false;
        this.f12674g = context;
        this.f12675h = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(C4370gb.m17351a("GTPlayerPurchases", "purchaseTokens", "[]"));
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f12675h.add(jSONArray.get(i).toString());
            }
            this.f12676i = jSONArray.length() == 0 ? true : z;
            if (this.f12676i) {
                this.f12676i = C4370gb.m17355a("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo12359b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16950a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.f12673f == null) {
                this.f12673f = m16961e((Class) f12669b);
                this.f12673f.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) this.f12673f.invoke(this.f12671d, new Object[]{3, this.f12674g.getPackageName(), "inapp", bundle});
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap hashMap = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", divide.toString());
                    hashMap.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (hashMap.containsKey(next)) {
                        jSONArray.put(hashMap.get(next));
                    }
                }
                if (jSONArray.length() > 0) {
                    C4306Xa.m17141a(jSONArray, this.f12676i, (C4416rb.C4417a) new C4263Lb(this, arrayList2));
                }
            }
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.WARN, "Failed to track IAP purchases", th);
        }
    }

    /* renamed from: a */
    static boolean m16951a(Context context) {
        if (f12668a == -99) {
            f12668a = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (f12668a == 0) {
                f12669b = Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            return f12668a == 0;
        } catch (Throwable unused) {
            f12668a = 0;
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static Method m16957c(Class cls) {
        for (Method method : cls.getMethods()) {
            Class<IBinder>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                return method;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m16958c() {
        if (!this.f12677j) {
            new Thread(new C4260Kb(this)).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Method m16960d(Class cls) {
        for (Method method : cls.getMethods()) {
            Class<String>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: e */
    private static Method m16961e(Class cls) {
        for (Method method : cls.getMethods()) {
            Class<Bundle>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                return method;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12359b() {
        if (this.f12670c == null) {
            this.f12670c = new C4257Jb(this);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f12674g.bindService(intent, this.f12670c, 1);
        } else if (this.f12671d != null) {
            m16958c();
        }
    }
}
