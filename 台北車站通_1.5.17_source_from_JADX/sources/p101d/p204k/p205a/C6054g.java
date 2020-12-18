package p101d.p204k.p205a;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p208e.p221b.p244i.C6428a;

/* renamed from: d.k.a.g */
public class C6054g extends Fragment {

    /* renamed from: a */
    private Map<String, C6428a<C6048a>> f16963a = new HashMap();

    /* renamed from: b */
    private boolean f16964b;

    /* renamed from: a */
    public C6428a<C6048a> mo16007a(String str, C6428a<C6048a> aVar) {
        return this.f16963a.put(str, aVar);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(23)
    /* renamed from: a */
    public void mo16008a(String[] strArr) {
        requestPermissions(strArr, 42);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16009a(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            mo16014e("onRequestPermissionsResult  " + strArr[i]);
            C6428a aVar = this.f16963a.get(strArr[i]);
            if (aVar == null) {
                Log.e("RxPermissions", "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.f16963a.remove(strArr[i]);
            aVar.mo13341a(new C6048a(strArr[i], iArr[i] == 0, zArr[i]));
            aVar.mo13343c();
        }
    }

    /* renamed from: a */
    public boolean mo16010a(String str) {
        return this.f16963a.containsKey(str);
    }

    /* renamed from: b */
    public C6428a<C6048a> mo16011b(String str) {
        return this.f16963a.get(str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(23)
    /* renamed from: c */
    public boolean mo16012c(String str) {
        return getActivity().checkSelfPermission(str) == 0;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(23)
    /* renamed from: d */
    public boolean mo16013d(String str) {
        return getActivity().getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo16014e(String str) {
        if (this.f16964b) {
            Log.d("RxPermissions", str);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @TargetApi(23)
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 42) {
            boolean[] zArr = new boolean[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
            }
            mo16009a(strArr, iArr, zArr);
        }
    }
}
