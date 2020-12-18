package com.askey.taipeinavi.common;

import android.content.Context;
import android.support.p011v7.widget.GridLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.askey.taipeinavi.R;
import java.util.ArrayList;
import p013b.p018b.p028h.p029a.C1006a;
import p267i.p274b.p282c.C6751l;
import p267i.p274b.p282c.C6756q;
import p267i.p274b.p282c.C6760r;

/* renamed from: com.askey.taipeinavi.common.b */
public class C1198b {
    /* renamed from: a */
    public static View m5995a(Context context, ViewGroup viewGroup, C6751l lVar) {
        ArrayList arrayList = new ArrayList();
        C1200d dVar = new C1200d();
        dVar.f4385a = R.mipmap.icon_nav;
        dVar.f4386b = R.string.btxt_navi;
        arrayList.add(dVar);
        C1200d dVar2 = new C1200d();
        dVar2.f4385a = R.mipmap.icon_quicknavi;
        dVar2.f4386b = R.string.btxt_quick_navi;
        arrayList.add(dVar2);
        C1200d dVar3 = new C1200d();
        dVar3.f4385a = R.mipmap.icon_train;
        dVar3.f4386b = R.string.btxt_trans;
        arrayList.add(dVar3);
        C1200d dVar4 = new C1200d();
        dVar4.f4385a = R.mipmap.icon_parking;
        dVar4.f4386b = R.string.btxt_parking;
        arrayList.add(dVar4);
        C1200d dVar5 = new C1200d();
        dVar5.f4385a = R.mipmap.icon_store;
        dVar5.f4386b = R.string.btxt_store;
        arrayList.add(dVar5);
        C1200d dVar6 = new C1200d();
        dVar6.f4385a = R.mipmap.icon_gift;
        dVar6.f4386b = R.string.btxt_gift;
        arrayList.add(dVar6);
        return m5996a(context, viewGroup, lVar, arrayList, R.color.tc_function_button_black);
    }

    /* renamed from: a */
    private static View m5996a(Context context, ViewGroup viewGroup, C6751l lVar, ArrayList<C1200d> arrayList, int i) {
        View a = C6760r.m25584a(context, viewGroup, new GridLayoutManager(context, 2), new C6756q(new C1201e(C1006a.m5386a(context, i)), arrayList, R.layout.item_fuction_button), lVar);
        RecyclerView recyclerView = (RecyclerView) a.findViewById(R.id.rcView);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.mo3633a((RecyclerView.C0758h) new C1199c(context));
        return a;
    }

    /* renamed from: b */
    public static View m5997b(Context context, ViewGroup viewGroup, C6751l lVar) {
        ArrayList arrayList = new ArrayList();
        C1200d dVar = new C1200d();
        dVar.f4385a = R.mipmap.icon_taiwan_train;
        dVar.f4386b = R.string.btxt_rail;
        arrayList.add(dVar);
        C1200d dVar2 = new C1200d();
        dVar2.f4385a = R.mipmap.icon_highspeed;
        dVar2.f4386b = R.string.btxt_hs_rail;
        arrayList.add(dVar2);
        C1200d dVar3 = new C1200d();
        dVar3.f4385a = R.mipmap.icon_taipei_mrt;
        dVar3.f4386b = R.string.btxt_tpe_mrt;
        arrayList.add(dVar3);
        C1200d dVar4 = new C1200d();
        dVar4.f4385a = R.mipmap.icon_taoyuan_mrt;
        dVar4.f4386b = R.string.btxt_ty_mrt;
        arrayList.add(dVar4);
        return m5996a(context, viewGroup, lVar, arrayList, R.color.tc_function_button_black);
    }

    /* renamed from: c */
    public static View m5998c(Context context, ViewGroup viewGroup, C6751l lVar) {
        ArrayList arrayList = new ArrayList();
        C1200d dVar = new C1200d();
        dVar.f4385a = R.mipmap.icon_taiwan_train;
        dVar.f4386b = R.string.btxt_rail;
        arrayList.add(dVar);
        C1200d dVar2 = new C1200d();
        dVar2.f4385a = R.mipmap.icon_highspeed;
        dVar2.f4386b = R.string.btxt_hs_rail;
        arrayList.add(dVar2);
        C1200d dVar3 = new C1200d();
        dVar3.f4385a = R.mipmap.icon_taipei_mrt;
        dVar3.f4386b = R.string.btxt_tpe_mrt;
        arrayList.add(dVar3);
        C1200d dVar4 = new C1200d();
        dVar4.f4385a = R.mipmap.icon_taoyuan_mrt;
        dVar4.f4386b = R.string.btxt_ty_mrt;
        arrayList.add(dVar4);
        C1200d dVar5 = new C1200d();
        dVar5.f4385a = R.mipmap.icon_taipeibus;
        dVar5.f4386b = R.string.btxt_tb_station;
        arrayList.add(dVar5);
        return m5996a(context, viewGroup, lVar, arrayList, R.color.tc_function_button_black);
    }

    /* renamed from: d */
    public static View m5999d(Context context, ViewGroup viewGroup, C6751l lVar) {
        ArrayList arrayList = new ArrayList();
        C1200d dVar = new C1200d();
        dVar.f4385a = R.mipmap.quick_icon_m;
        dVar.f4386b = R.string.btxt_toilet_male;
        arrayList.add(dVar);
        C1200d dVar2 = new C1200d();
        dVar2.f4385a = R.mipmap.quick_icon_w;
        dVar2.f4386b = R.string.btxt_toilet_female;
        arrayList.add(dVar2);
        C1200d dVar3 = new C1200d();
        dVar3.f4385a = R.mipmap.quick_icon_feed;
        dVar3.f4386b = R.string.btxt_toilet_family;
        arrayList.add(dVar3);
        C1200d dVar4 = new C1200d();
        dVar4.f4385a = R.mipmap.quick_icon_disabilities;
        dVar4.f4386b = R.string.btxt_toilet_accessible;
        arrayList.add(dVar4);
        return m5996a(context, viewGroup, lVar, arrayList, R.color.tc_function_button_black);
    }

    /* renamed from: e */
    public static View m6000e(Context context, ViewGroup viewGroup, C6751l lVar) {
        ArrayList arrayList = new ArrayList();
        C1200d dVar = new C1200d();
        dVar.f4385a = R.mipmap.quick_mrt_blue;
        dVar.f4386b = R.string.btxt_tpe_mrt_bl;
        arrayList.add(dVar);
        C1200d dVar2 = new C1200d();
        dVar2.f4385a = R.mipmap.quick_mrt_red;
        dVar2.f4386b = R.string.btxt_tpe_mrt_r;
        arrayList.add(dVar2);
        C1200d dVar3 = new C1200d();
        dVar3.f4385a = R.mipmap.quick_mrt_green;
        dVar3.f4386b = R.string.btxt_tpe_mrt_g;
        arrayList.add(dVar3);
        return m5996a(context, viewGroup, lVar, arrayList, R.color.tc_function_button_black);
    }

    /* renamed from: f */
    public static View m6001f(Context context, ViewGroup viewGroup, C6751l lVar) {
        ArrayList arrayList = new ArrayList();
        C1200d dVar = new C1200d();
        dVar.f4385a = R.mipmap.quick_icon_ticket;
        dVar.f4386b = R.string.btxt_ticket_counter;
        arrayList.add(dVar);
        C1200d dVar2 = new C1200d();
        dVar2.f4385a = R.mipmap.quick_icon_ticketgate;
        dVar2.f4386b = R.string.btxt_gate;
        arrayList.add(dVar2);
        C1200d dVar3 = new C1200d();
        dVar3.f4385a = R.mipmap.quick_icon_exit;
        dVar3.f4386b = R.string.btxt_exit;
        arrayList.add(dVar3);
        C1200d dVar4 = new C1200d();
        dVar4.f4385a = R.mipmap.quick_icon_atm;
        dVar4.f4386b = R.string.btxt_atm;
        arrayList.add(dVar4);
        C1200d dVar5 = new C1200d();
        dVar5.f4385a = R.mipmap.quick_icon_all;
        dVar5.f4386b = R.string.btxt_toilet;
        arrayList.add(dVar5);
        C1200d dVar6 = new C1200d();
        dVar6.f4385a = R.mipmap.quick_icon_bag;
        dVar6.f4386b = R.string.btxt_locker;
        arrayList.add(dVar6);
        return m5996a(context, viewGroup, lVar, arrayList, R.color.tc_function_button_black);
    }

    /* renamed from: g */
    public static View m6002g(Context context, ViewGroup viewGroup, C6751l lVar) {
        ArrayList arrayList = new ArrayList();
        C1200d dVar = new C1200d();
        dVar.f4385a = R.mipmap.icon_taiwan_train;
        dVar.f4386b = R.string.btxt_rail;
        arrayList.add(dVar);
        C1200d dVar2 = new C1200d();
        dVar2.f4385a = R.mipmap.icon_highspeed;
        dVar2.f4386b = R.string.btxt_hs_rail;
        arrayList.add(dVar2);
        C1200d dVar3 = new C1200d();
        dVar3.f4385a = R.mipmap.icon_taipei_mrt;
        dVar3.f4386b = R.string.btxt_tpe_mrt;
        arrayList.add(dVar3);
        C1200d dVar4 = new C1200d();
        dVar4.f4385a = R.mipmap.icon_taoyuan_mrt;
        dVar4.f4386b = R.string.btxt_ty_mrt;
        arrayList.add(dVar4);
        C1200d dVar5 = new C1200d();
        dVar5.f4385a = R.mipmap.icon_taoyuan_airport;
        dVar5.f4386b = R.string.btxt_ty_airport;
        arrayList.add(dVar5);
        C1200d dVar6 = new C1200d();
        dVar6.f4385a = R.mipmap.icon_songshan_airport;
        dVar6.f4386b = R.string.btxt_ss_airport;
        arrayList.add(dVar6);
        C1200d dVar7 = new C1200d();
        dVar7.f4385a = R.mipmap.icon_youbike;
        dVar7.f4386b = R.string.btxt_youbike;
        arrayList.add(dVar7);
        C1200d dVar8 = new C1200d();
        dVar8.f4385a = R.mipmap.icon_taipeibus;
        dVar8.f4386b = R.string.btxt_tb_station;
        arrayList.add(dVar8);
        C1200d dVar9 = new C1200d();
        dVar9.f4385a = R.mipmap.icon_bus_mrt;
        dVar9.f4386b = R.string.btxt_tpe_pb;
        arrayList.add(dVar9);
        return m5996a(context, viewGroup, lVar, arrayList, R.color.tc_function_button_black);
    }
}
