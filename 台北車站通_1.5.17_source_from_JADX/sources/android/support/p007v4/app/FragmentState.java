package android.support.p007v4.app;

import android.arch.lifecycle.C0042p;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: android.support.v4.app.FragmentState */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0268B();

    /* renamed from: a */
    final String f1155a;

    /* renamed from: b */
    final int f1156b;

    /* renamed from: c */
    final boolean f1157c;

    /* renamed from: d */
    final int f1158d;

    /* renamed from: e */
    final int f1159e;

    /* renamed from: f */
    final String f1160f;

    /* renamed from: g */
    final boolean f1161g;

    /* renamed from: h */
    final boolean f1162h;

    /* renamed from: i */
    final Bundle f1163i;

    /* renamed from: j */
    final boolean f1164j;

    /* renamed from: k */
    Bundle f1165k;

    /* renamed from: l */
    C0339l f1166l;

    FragmentState(Parcel parcel) {
        this.f1155a = parcel.readString();
        this.f1156b = parcel.readInt();
        boolean z = true;
        this.f1157c = parcel.readInt() != 0;
        this.f1158d = parcel.readInt();
        this.f1159e = parcel.readInt();
        this.f1160f = parcel.readString();
        this.f1161g = parcel.readInt() != 0;
        this.f1162h = parcel.readInt() != 0;
        this.f1163i = parcel.readBundle();
        this.f1164j = parcel.readInt() == 0 ? false : z;
        this.f1165k = parcel.readBundle();
    }

    FragmentState(C0339l lVar) {
        this.f1155a = lVar.getClass().getName();
        this.f1156b = lVar.f1422g;
        this.f1157c = lVar.f1430o;
        this.f1158d = lVar.f1441z;
        this.f1159e = lVar.f1396A;
        this.f1160f = lVar.f1397B;
        this.f1161g = lVar.f1400E;
        this.f1162h = lVar.f1399D;
        this.f1163i = lVar.f1424i;
        this.f1164j = lVar.f1398C;
    }

    /* renamed from: a */
    public C0339l mo1135a(C0349q qVar, C0347o oVar, C0339l lVar, C0370z zVar, C0042p pVar) {
        if (this.f1166l == null) {
            Context c = qVar.mo1491c();
            Bundle bundle = this.f1163i;
            if (bundle != null) {
                bundle.setClassLoader(c.getClassLoader());
            }
            this.f1166l = oVar != null ? oVar.mo1311a(c, this.f1155a, this.f1163i) : C0339l.m1487a(c, this.f1155a, this.f1163i);
            Bundle bundle2 = this.f1165k;
            if (bundle2 != null) {
                bundle2.setClassLoader(c.getClassLoader());
                this.f1166l.f1419d = this.f1165k;
            }
            this.f1166l.mo1344a(this.f1156b, lVar);
            C0339l lVar2 = this.f1166l;
            lVar2.f1430o = this.f1157c;
            lVar2.f1432q = true;
            lVar2.f1441z = this.f1158d;
            lVar2.f1396A = this.f1159e;
            lVar2.f1397B = this.f1160f;
            lVar2.f1400E = this.f1161g;
            lVar2.f1399D = this.f1162h;
            lVar2.f1398C = this.f1164j;
            lVar2.f1435t = qVar.f1483e;
            if (C0360y.f1498a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f1166l);
            }
        }
        C0339l lVar3 = this.f1166l;
        lVar3.f1438w = zVar;
        lVar3.f1439x = pVar;
        return lVar3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1155a);
        parcel.writeInt(this.f1156b);
        parcel.writeInt(this.f1157c ? 1 : 0);
        parcel.writeInt(this.f1158d);
        parcel.writeInt(this.f1159e);
        parcel.writeString(this.f1160f);
        parcel.writeInt(this.f1161g ? 1 : 0);
        parcel.writeInt(this.f1162h ? 1 : 0);
        parcel.writeBundle(this.f1163i);
        parcel.writeInt(this.f1164j ? 1 : 0);
        parcel.writeBundle(this.f1165k);
    }
}
