package com.sto.stonavigating;

import android.util.Log;
import java.util.Map;
import java.util.TreeMap;
import p000a.p001a.p004c.C0017b;

public class STONavigationManager {

    /* renamed from: a */
    private final String f14449a = "STONavigationManager";

    /* renamed from: b */
    private boolean f14450b = false;

    /* renamed from: c */
    private int[] f14451c = null;

    /* renamed from: d */
    private int[] f14452d = null;

    /* renamed from: e */
    private int f14453e = 0;

    static {
        System.loadLibrary("STONavigationManager");
    }

    public STONavigationManager(String str, Map<String, C0017b> map) {
        if (!this.f14450b) {
            if (map == null) {
                init_nativelocal(str);
                return;
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<String, C0017b> value : map.entrySet()) {
                C0017b bVar = (C0017b) value.getValue();
                if (!treeMap.containsKey(bVar.f56c)) {
                    treeMap.put(bVar.f56c, true);
                }
            }
            int[] iArr = new int[treeMap.size()];
            int i = 0;
            for (Map.Entry key : treeMap.entrySet()) {
                iArr[i] = ((Integer) key.getKey()).intValue();
                i++;
            }
            Log.i("STONavigationManager", "Allen:" + iArr[0] + " " + iArr[1]);
            init_nativenearest(str, iArr, treeMap.size());
        }
    }

    private native synchronized int[] build_native();

    private native synchronized void init_nativelocal(String str);

    private native synchronized void init_nativenearest(String str, int[] iArr, int i);

    private native synchronized void stop_native();

    private native synchronized boolean update_native(int[] iArr);

    /* renamed from: a */
    public boolean mo14172a(int[] iArr) {
        if (!this.f14450b) {
            return update_native(iArr);
        }
        int i = this.f14453e;
        if (i != 0 || iArr == null) {
            this.f14453e++;
            if (this.f14453e >= 10) {
                this.f14453e = 0;
            }
            return false;
        }
        this.f14452d = iArr;
        this.f14453e = i + 1;
        if (this.f14453e >= 10) {
            this.f14453e = 0;
        }
        return true;
    }

    /* renamed from: a */
    public int[] mo14173a() {
        int[] iArr;
        if (!this.f14450b) {
            return build_native();
        }
        int[] iArr2 = this.f14451c;
        if (iArr2 == null || (iArr = this.f14452d) == null) {
            return null;
        }
        if (iArr2[2] == iArr[2]) {
            return new int[]{iArr[0], iArr[1], iArr[2], iArr[0], iArr2[1], iArr[2], iArr2[0], iArr2[1], iArr2[2]};
        }
        return new int[]{iArr[0], iArr[1], iArr[2], iArr[0], 100, iArr[2], 100, 100, iArr[2], 100, 100, iArr2[2], 100, iArr2[1], iArr2[2], iArr2[0], iArr2[1], iArr2[2]};
    }

    /* renamed from: b */
    public void mo14174b() {
        if (this.f14450b) {
            this.f14451c = null;
            this.f14452d = null;
            return;
        }
        stop_native();
    }
}
