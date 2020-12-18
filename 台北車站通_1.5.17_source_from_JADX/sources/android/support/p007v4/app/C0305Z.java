package android.support.p007v4.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p007v4.app.C0297Y;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.Z */
class C0305Z implements C0296X {

    /* renamed from: a */
    private final Notification.Builder f1299a;

    /* renamed from: b */
    private final C0297Y.C0301d f1300b;

    /* renamed from: c */
    private RemoteViews f1301c;

    /* renamed from: d */
    private RemoteViews f1302d;

    /* renamed from: e */
    private final List<Bundle> f1303e = new ArrayList();

    /* renamed from: f */
    private final Bundle f1304f = new Bundle();

    /* renamed from: g */
    private int f1305g;

    /* renamed from: h */
    private RemoteViews f1306h;

    C0305Z(C0297Y.C0301d dVar) {
        ArrayList<String> arrayList;
        String str;
        Bundle bundle;
        this.f1300b = dVar;
        this.f1299a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(dVar.f1268a, dVar.f1261H) : new Notification.Builder(dVar.f1268a);
        Notification notification = dVar.f1266M;
        this.f1299a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f1274g).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f1270c).setContentText(dVar.f1271d).setContentInfo(dVar.f1276i).setContentIntent(dVar.f1272e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f1273f, (notification.flags & 128) != 0).setLargeIcon(dVar.f1275h).setNumber(dVar.f1277j).setProgress(dVar.f1284q, dVar.f1285r, dVar.f1286s);
        if (Build.VERSION.SDK_INT < 21) {
            this.f1299a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1299a.setSubText(dVar.f1282o).setUsesChronometer(dVar.f1280m).setPriority(dVar.f1278k);
            Iterator<C0297Y.C0298a> it = dVar.f1269b.iterator();
            while (it.hasNext()) {
                m1379a(it.next());
            }
            Bundle bundle2 = dVar.f1254A;
            if (bundle2 != null) {
                this.f1304f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.f1290w) {
                    this.f1304f.putBoolean("android.support.localOnly", true);
                }
                String str2 = dVar.f1287t;
                if (str2 != null) {
                    this.f1304f.putString("android.support.groupKey", str2);
                    if (dVar.f1288u) {
                        bundle = this.f1304f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f1304f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = dVar.f1289v;
                if (str3 != null) {
                    this.f1304f.putString("android.support.sortKey", str3);
                }
            }
            this.f1301c = dVar.f1258E;
            this.f1302d = dVar.f1259F;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1299a.setShowWhen(dVar.f1279l);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = dVar.f1267N) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f1304f;
                ArrayList<String> arrayList2 = dVar.f1267N;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f1299a.setLocalOnly(dVar.f1290w).setGroup(dVar.f1287t).setGroupSummary(dVar.f1288u).setSortKey(dVar.f1289v);
            this.f1305g = dVar.f1265L;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1299a.setCategory(dVar.f1293z).setColor(dVar.f1255B).setVisibility(dVar.f1256C).setPublicVersion(dVar.f1257D).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = dVar.f1267N.iterator();
            while (it2.hasNext()) {
                this.f1299a.addPerson(it2.next());
            }
            this.f1306h = dVar.f1260G;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1299a.setExtras(dVar.f1254A).setRemoteInputHistory(dVar.f1283p);
            RemoteViews remoteViews = dVar.f1258E;
            if (remoteViews != null) {
                this.f1299a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.f1259F;
            if (remoteViews2 != null) {
                this.f1299a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.f1260G;
            if (remoteViews3 != null) {
                this.f1299a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1299a.setBadgeIconType(dVar.f1262I).setShortcutId(dVar.f1263J).setTimeoutAfter(dVar.f1264K).setGroupAlertBehavior(dVar.f1265L);
            if (dVar.f1292y) {
                this.f1299a.setColorized(dVar.f1291x);
            }
            if (!TextUtils.isEmpty(dVar.f1261H)) {
                this.f1299a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
    }

    /* renamed from: a */
    private void m1378a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    /* renamed from: a */
    private void m1379a(C0297Y.C0298a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.mo1187e(), aVar.mo1189g(), aVar.mo1183a());
            if (aVar.mo1188f() != null) {
                for (RemoteInput addRemoteInput : C0323da.m1450a(aVar.mo1188f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.mo1186d() != null ? new Bundle(aVar.mo1186d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1184b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo1184b());
            }
            builder.addExtras(bundle);
            this.f1299a.addAction(builder.build());
        } else if (i >= 16) {
            this.f1303e.add(C0307aa.m1383a(this.f1299a, aVar));
        }
    }

    /* renamed from: a */
    public Notification.Builder mo1182a() {
        return this.f1299a;
    }

    /* renamed from: b */
    public Notification mo1231b() {
        Bundle a;
        RemoteViews d;
        RemoteViews b;
        C0297Y.C0304g gVar = this.f1300b.f1281n;
        if (gVar != null) {
            gVar.mo1192a((C0296X) this);
        }
        RemoteViews c = gVar != null ? gVar.mo1229c(this) : null;
        Notification c2 = mo1232c();
        if (!(c == null && (c = this.f1300b.f1258E) == null)) {
            c2.contentView = c;
        }
        if (!(Build.VERSION.SDK_INT < 16 || gVar == null || (b = gVar.mo1228b(this)) == null)) {
            c2.bigContentView = b;
        }
        if (!(Build.VERSION.SDK_INT < 21 || gVar == null || (d = this.f1300b.f1281n.mo1230d(this)) == null)) {
            c2.headsUpContentView = d;
        }
        if (!(Build.VERSION.SDK_INT < 16 || gVar == null || (a = C0297Y.m1324a(c2)) == null)) {
            gVar.mo1226a(a);
        }
        return c2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Notification mo1232c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f1299a.build();
        }
        if (i >= 24) {
            Notification build = this.f1299a.build();
            if (this.f1305g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f1305g != 2)) {
                    m1378a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f1305g == 1) {
                    m1378a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f1299a.setExtras(this.f1304f);
            Notification build2 = this.f1299a.build();
            RemoteViews remoteViews = this.f1301c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1302d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f1306h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f1305g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f1305g != 2)) {
                    m1378a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f1305g == 1) {
                    m1378a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f1299a.setExtras(this.f1304f);
            Notification build3 = this.f1299a.build();
            RemoteViews remoteViews4 = this.f1301c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1302d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f1305g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f1305g != 2)) {
                    m1378a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f1305g == 1) {
                    m1378a(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C0307aa.m1386a(this.f1303e);
            if (a != null) {
                this.f1304f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f1299a.setExtras(this.f1304f);
            Notification build4 = this.f1299a.build();
            RemoteViews remoteViews6 = this.f1301c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1302d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f1299a.getNotification();
        } else {
            Notification build5 = this.f1299a.build();
            Bundle a2 = C0297Y.m1324a(build5);
            Bundle bundle = new Bundle(this.f1304f);
            for (String str : this.f1304f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0307aa.m1386a(this.f1303e);
            if (a3 != null) {
                C0297Y.m1324a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f1301c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f1302d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
