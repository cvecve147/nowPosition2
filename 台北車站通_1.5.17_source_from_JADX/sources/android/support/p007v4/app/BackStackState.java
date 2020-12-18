package android.support.p007v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.app.C0321d;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.BackStackState */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0324e();

    /* renamed from: a */
    final int[] f1129a;

    /* renamed from: b */
    final int f1130b;

    /* renamed from: c */
    final int f1131c;

    /* renamed from: d */
    final String f1132d;

    /* renamed from: e */
    final int f1133e;

    /* renamed from: f */
    final int f1134f;

    /* renamed from: g */
    final CharSequence f1135g;

    /* renamed from: h */
    final int f1136h;

    /* renamed from: i */
    final CharSequence f1137i;

    /* renamed from: j */
    final ArrayList<String> f1138j;

    /* renamed from: k */
    final ArrayList<String> f1139k;

    /* renamed from: l */
    final boolean f1140l;

    public BackStackState(Parcel parcel) {
        this.f1129a = parcel.createIntArray();
        this.f1130b = parcel.readInt();
        this.f1131c = parcel.readInt();
        this.f1132d = parcel.readString();
        this.f1133e = parcel.readInt();
        this.f1134f = parcel.readInt();
        this.f1135g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1136h = parcel.readInt();
        this.f1137i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1138j = parcel.createStringArrayList();
        this.f1139k = parcel.createStringArrayList();
        this.f1140l = parcel.readInt() != 0;
    }

    public BackStackState(C0321d dVar) {
        int size = dVar.f1346b.size();
        this.f1129a = new int[(size * 6)];
        if (dVar.f1353i) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C0321d.C0322a aVar = dVar.f1346b.get(i2);
                int[] iArr = this.f1129a;
                int i3 = i + 1;
                iArr[i] = aVar.f1366a;
                int i4 = i3 + 1;
                C0339l lVar = aVar.f1367b;
                iArr[i3] = lVar != null ? lVar.f1422g : -1;
                int[] iArr2 = this.f1129a;
                int i5 = i4 + 1;
                iArr2[i4] = aVar.f1368c;
                int i6 = i5 + 1;
                iArr2[i5] = aVar.f1369d;
                int i7 = i6 + 1;
                iArr2[i6] = aVar.f1370e;
                i = i7 + 1;
                iArr2[i7] = aVar.f1371f;
            }
            this.f1130b = dVar.f1351g;
            this.f1131c = dVar.f1352h;
            this.f1132d = dVar.f1355k;
            this.f1133e = dVar.f1357m;
            this.f1134f = dVar.f1358n;
            this.f1135g = dVar.f1359o;
            this.f1136h = dVar.f1360p;
            this.f1137i = dVar.f1361q;
            this.f1138j = dVar.f1362r;
            this.f1139k = dVar.f1363s;
            this.f1140l = dVar.f1364t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0321d mo1117a(C0360y yVar) {
        C0321d dVar = new C0321d(yVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f1129a.length) {
            C0321d.C0322a aVar = new C0321d.C0322a();
            int i3 = i + 1;
            aVar.f1366a = this.f1129a[i];
            if (C0360y.f1498a) {
                Log.v("FragmentManager", "Instantiate " + dVar + " op #" + i2 + " base fragment #" + this.f1129a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f1129a[i3];
            aVar.f1367b = i5 >= 0 ? yVar.f1518k.get(i5) : null;
            int[] iArr = this.f1129a;
            int i6 = i4 + 1;
            aVar.f1368c = iArr[i4];
            int i7 = i6 + 1;
            aVar.f1369d = iArr[i6];
            int i8 = i7 + 1;
            aVar.f1370e = iArr[i7];
            aVar.f1371f = iArr[i8];
            dVar.f1347c = aVar.f1368c;
            dVar.f1348d = aVar.f1369d;
            dVar.f1349e = aVar.f1370e;
            dVar.f1350f = aVar.f1371f;
            dVar.mo1257a(aVar);
            i2++;
            i = i8 + 1;
        }
        dVar.f1351g = this.f1130b;
        dVar.f1352h = this.f1131c;
        dVar.f1355k = this.f1132d;
        dVar.f1357m = this.f1133e;
        dVar.f1353i = true;
        dVar.f1358n = this.f1134f;
        dVar.f1359o = this.f1135g;
        dVar.f1360p = this.f1136h;
        dVar.f1361q = this.f1137i;
        dVar.f1362r = this.f1138j;
        dVar.f1363s = this.f1139k;
        dVar.f1364t = this.f1140l;
        dVar.mo1256a(1);
        return dVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1129a);
        parcel.writeInt(this.f1130b);
        parcel.writeInt(this.f1131c);
        parcel.writeString(this.f1132d);
        parcel.writeInt(this.f1133e);
        parcel.writeInt(this.f1134f);
        TextUtils.writeToParcel(this.f1135g, parcel, 0);
        parcel.writeInt(this.f1136h);
        TextUtils.writeToParcel(this.f1137i, parcel, 0);
        parcel.writeStringList(this.f1138j);
        parcel.writeStringList(this.f1139k);
        parcel.writeInt(this.f1140l ? 1 : 0);
    }
}
