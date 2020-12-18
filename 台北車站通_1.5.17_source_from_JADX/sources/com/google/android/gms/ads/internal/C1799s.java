package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2880Yz;
import com.google.android.gms.internal.ads.C2903Zv;
import com.google.android.gms.internal.ads.C2931_v;
import com.google.android.gms.internal.ads.C2965bA;
import com.google.android.gms.internal.ads.C3449rv;
import com.google.android.gms.internal.ads.C3506tv;
import com.google.android.gms.internal.ads.C3520uh;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.s */
public final class C1799s {
    /* renamed from: a */
    public static View m8035a(C2254Dd dd) {
        C3520uh uhVar;
        if (dd == null) {
            C2227Cf.m9529a("AdState is null");
            return null;
        } else if (m8047b(dd) && (uhVar = dd.f6863b) != null) {
            return uhVar.getView();
        } else {
            try {
                C5464b view = dd.f6878q != null ? dd.f6878q.getView() : null;
                if (view != null) {
                    return (View) C5468d.m20962z(view);
                }
                C2227Cf.m9536d("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e) {
                C2227Cf.m9535c("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    static C1718E<C3520uh> m8036a(C2880Yz yz, C2965bA bAVar, C1706d dVar) {
        return new C1809x(yz, dVar, bAVar);
    }

    /* renamed from: a */
    private static C2903Zv m8037a(Object obj) {
        if (obj instanceof IBinder) {
            return C2931_v.m11894a((IBinder) obj);
        }
        return null;
    }

    /* renamed from: a */
    private static String m8038a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            C2227Cf.m9536d("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
    }

    /* renamed from: a */
    private static String m8039a(C2903Zv zv) {
        if (zv == null) {
            C2227Cf.m9536d("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri uri = zv.getUri();
            if (uri != null) {
                return uri.toString();
            }
        } catch (RemoteException unused) {
            C2227Cf.m9536d("Unable to get image uri. Trying data uri next");
        }
        return m8045b(zv);
    }

    /* renamed from: a */
    private static JSONObject m8040a(Bundle bundle, String str) {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (bundle.containsKey(next)) {
                    if ("image".equals(jSONObject2.getString(next))) {
                        Object obj = bundle.get(next);
                        if (obj instanceof Bitmap) {
                            str2 = m8038a((Bitmap) obj);
                            jSONObject.put(next, str2);
                        } else {
                            str3 = "Invalid type. An image type extra should return a bitmap";
                        }
                    } else if (bundle.get(next) instanceof Bitmap) {
                        str3 = "Invalid asset type. Bitmap should be returned only for image type";
                    } else {
                        str2 = String.valueOf(bundle.get(next));
                        jSONObject.put(next, str2);
                    }
                    C2227Cf.m9536d(str3);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    static final /* synthetic */ void m8041a(C3449rv rvVar, String str, C3520uh uhVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", rvVar.mo9689b());
            jSONObject.put("body", rvVar.mo9697h());
            jSONObject.put("call_to_action", rvVar.mo9692d());
            jSONObject.put("price", rvVar.mo9700s());
            jSONObject.put("star_rating", String.valueOf(rvVar.mo9702u()));
            jSONObject.put("store", rvVar.mo9704z());
            jSONObject.put("icon", m8039a(rvVar.mo9701t()));
            JSONArray jSONArray = new JSONArray();
            List<Object> a = rvVar.mo9687a();
            if (a != null) {
                for (Object a2 : a) {
                    jSONArray.put(m8039a(m8037a(a2)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", m8040a(rvVar.getExtras(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            uhVar.mo7967b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            C2227Cf.m9535c("Exception occurred when loading assets", e);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m8042a(C3506tv tvVar, String str, C3520uh uhVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", tvVar.mo9903b());
            jSONObject.put("body", tvVar.mo9911h());
            jSONObject.put("call_to_action", tvVar.mo9906d());
            jSONObject.put("advertiser", tvVar.mo9915y());
            jSONObject.put("logo", m8039a(tvVar.mo9900W()));
            JSONArray jSONArray = new JSONArray();
            List<Object> a = tvVar.mo9901a();
            if (a != null) {
                for (Object a2 : a) {
                    jSONArray.put(m8039a(m8037a(a2)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", m8040a(tvVar.getExtras(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            uhVar.mo7967b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            C2227Cf.m9535c("Exception occurred when loading assets", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0134  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8044a(com.google.android.gms.internal.ads.C3520uh r25, com.google.android.gms.internal.ads.C2276Dz r26, java.util.concurrent.CountDownLatch r27) {
        /*
            r0 = r25
            r1 = r26
            r7 = r27
            r8 = 0
            android.view.View r2 = r25.getView()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r2 != 0) goto L_0x0014
            java.lang.String r0 = "AdWebView is null"
        L_0x000f:
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            goto L_0x0132
        L_0x0014:
            r3 = 4
            r2.setVisibility(r3)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.vz r2 = r1.f6935b     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.util.List<java.lang.String> r2 = r2.f10422r     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r2 == 0) goto L_0x0123
            boolean r3 = r2.isEmpty()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r3 == 0) goto L_0x0026
            goto L_0x0123
        L_0x0026:
            java.lang.String r3 = "/nativeExpressAssetsLoaded"
            com.google.android.gms.ads.internal.v r4 = new com.google.android.gms.ads.internal.v     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r0.mo8157b(r3, r4)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r3 = "/nativeExpressAssetsLoadingFailed"
            com.google.android.gms.ads.internal.w r4 = new com.google.android.gms.ads.internal.w     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r0.mo8157b(r3, r4)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.Pz r3 = r1.f6936c     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.Yz r3 = r3.mo8706Ba()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.Pz r4 = r1.f6936c     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bA r4 = r4.mo8707Ja()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r5 = "2"
            boolean r5 = r2.contains(r5)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r6 = 0
            if (r5 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.rv r2 = new com.google.android.gms.internal.ads.rv     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r10 = r3.mo9099b()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.util.List r11 = r3.mo9096a()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r12 = r3.mo9107h()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.Zv r13 = r3.mo9110t()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r14 = r3.mo9103d()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            double r15 = r3.mo9111u()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r17 = r3.mo9112z()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r18 = r3.mo9109s()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r19 = 0
            android.os.Bundle r20 = r3.getExtras()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r21 = 0
            d.g.b.a.b.b r4 = r3.mo9093E()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r4 == 0) goto L_0x008c
            d.g.b.a.b.b r4 = r3.mo9093E()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.Object r4 = p101d.p129g.p131b.p132a.p134b.C5468d.m20962z(r4)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r6 = r4
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
        L_0x008c:
            r22 = r6
            d.g.b.a.b.b r23 = r3.mo9101c()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r24 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.vz r3 = r1.f6935b     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r3 = r3.f10421q     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bi r4 = r25.mo8182mb()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.ads.internal.t r5 = new com.google.android.gms.ads.internal.t     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
        L_0x00a5:
            r4.mo9230a((com.google.android.gms.internal.ads.C3003ci) r5)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            goto L_0x0100
        L_0x00a9:
            java.lang.String r3 = "1"
            boolean r2 = r2.contains(r3)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r2 == 0) goto L_0x011f
            if (r4 == 0) goto L_0x011f
            com.google.android.gms.internal.ads.tv r2 = new com.google.android.gms.internal.ads.tv     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r10 = r4.mo9214b()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.util.List r11 = r4.mo9211a()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r12 = r4.mo9222h()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.Zv r13 = r4.mo9210W()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r14 = r4.mo9218d()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r15 = r4.mo9224y()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r16 = 0
            android.os.Bundle r17 = r4.getExtras()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r18 = 0
            d.g.b.a.b.b r3 = r4.mo9207E()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r3 == 0) goto L_0x00e6
            d.g.b.a.b.b r3 = r4.mo9207E()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.Object r3 = p101d.p129g.p131b.p132a.p134b.C5468d.m20962z(r3)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r6 = r3
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
        L_0x00e6:
            r19 = r6
            d.g.b.a.b.b r20 = r4.mo9216c()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r21 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.vz r3 = r1.f6935b     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r3 = r3.f10421q     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bi r4 = r25.mo8182mb()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.ads.internal.u r5 = new com.google.android.gms.ads.internal.u     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            goto L_0x00a5
        L_0x0100:
            com.google.android.gms.internal.ads.vz r2 = r1.f6935b     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r3 = r2.f10419o     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.vz r1 = r1.f6935b     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r2 = r1.f10420p     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r2 == 0) goto L_0x0115
            java.lang.String r4 = "text/html"
            java.lang.String r5 = "UTF-8"
            r6 = 0
            r1 = r25
            r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            goto L_0x011c
        L_0x0115:
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "UTF-8"
            r0.loadData(r3, r1, r2)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
        L_0x011c:
            r0 = 1
            r8 = r0
            goto L_0x0132
        L_0x011f:
            java.lang.String r0 = "No matching template id and mapper"
            goto L_0x000f
        L_0x0123:
            java.lang.String r0 = "No template ids present in mediation response"
            goto L_0x000f
        L_0x0127:
            r0 = move-exception
            r27.countDown()
            throw r0
        L_0x012c:
            r0 = move-exception
            java.lang.String r1 = "Unable to invoke load assets"
            com.google.android.gms.internal.ads.C2227Cf.m9535c(r1, r0)
        L_0x0132:
            if (r8 != 0) goto L_0x0137
            r27.countDown()
        L_0x0137:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1799s.m8044a(com.google.android.gms.internal.ads.uh, com.google.android.gms.internal.ads.Dz, java.util.concurrent.CountDownLatch):boolean");
    }

    /* renamed from: b */
    private static String m8045b(C2903Zv zv) {
        String str;
        try {
            C5464b na = zv.mo9130na();
            if (na == null) {
                C2227Cf.m9536d("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) C5468d.m20962z(na);
            if (drawable instanceof BitmapDrawable) {
                return m8038a(((BitmapDrawable) drawable).getBitmap());
            }
            str = "Drawable is not an instance of BitmapDrawable. Returning empty string";
            C2227Cf.m9536d(str);
            return "";
        } catch (RemoteException unused) {
            str = "Unable to get drawable. Returning empty string";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8046b(C3520uh uhVar) {
        View.OnClickListener onClickListener = uhVar.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(uhVar.getView());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r1 = r1.f6877p;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8047b(com.google.android.gms.internal.ads.C2254Dd r1) {
        /*
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1.f6876o
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.internal.ads.vz r1 = r1.f6877p
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = r1.f10419o
            if (r1 == 0) goto L_0x0010
            r1 = 1
            return r1
        L_0x0010:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1799s.m8047b(com.google.android.gms.internal.ads.Dd):boolean");
    }
}
