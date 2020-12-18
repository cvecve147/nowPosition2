package android.support.p007v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.app.Y */
public class C0297Y {

    /* renamed from: android.support.v4.app.Y$a */
    public static class C0298a {

        /* renamed from: a */
        final Bundle f1243a;

        /* renamed from: b */
        private final C0323da[] f1244b;

        /* renamed from: c */
        private final C0323da[] f1245c;

        /* renamed from: d */
        private boolean f1246d;

        /* renamed from: e */
        public int f1247e;

        /* renamed from: f */
        public CharSequence f1248f;

        /* renamed from: g */
        public PendingIntent f1249g;

        public C0298a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), (C0323da[]) null, (C0323da[]) null, true);
        }

        C0298a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0323da[] daVarArr, C0323da[] daVarArr2, boolean z) {
            this.f1247e = i;
            this.f1248f = C0301d.m1337a(charSequence);
            this.f1249g = pendingIntent;
            this.f1243a = bundle == null ? new Bundle() : bundle;
            this.f1244b = daVarArr;
            this.f1245c = daVarArr2;
            this.f1246d = z;
        }

        /* renamed from: a */
        public PendingIntent mo1183a() {
            return this.f1249g;
        }

        /* renamed from: b */
        public boolean mo1184b() {
            return this.f1246d;
        }

        /* renamed from: c */
        public C0323da[] mo1185c() {
            return this.f1245c;
        }

        /* renamed from: d */
        public Bundle mo1186d() {
            return this.f1243a;
        }

        /* renamed from: e */
        public int mo1187e() {
            return this.f1247e;
        }

        /* renamed from: f */
        public C0323da[] mo1188f() {
            return this.f1244b;
        }

        /* renamed from: g */
        public CharSequence mo1189g() {
            return this.f1248f;
        }
    }

    /* renamed from: android.support.v4.app.Y$b */
    public static class C0299b extends C0304g {

        /* renamed from: e */
        private Bitmap f1250e;

        /* renamed from: f */
        private Bitmap f1251f;

        /* renamed from: g */
        private boolean f1252g;

        /* renamed from: a */
        public C0299b mo1190a(Bitmap bitmap) {
            this.f1250e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0299b mo1191a(CharSequence charSequence) {
            this.f1297c = C0301d.m1337a(charSequence);
            this.f1298d = true;
            return this;
        }

        /* renamed from: a */
        public void mo1192a(C0296X x) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(x.mo1182a()).setBigContentTitle(this.f1296b).bigPicture(this.f1250e);
                if (this.f1252g) {
                    bigPicture.bigLargeIcon(this.f1251f);
                }
                if (this.f1298d) {
                    bigPicture.setSummaryText(this.f1297c);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.Y$c */
    public static class C0300c extends C0304g {

        /* renamed from: e */
        private CharSequence f1253e;

        /* renamed from: a */
        public C0300c mo1193a(CharSequence charSequence) {
            this.f1253e = C0301d.m1337a(charSequence);
            return this;
        }

        /* renamed from: a */
        public void mo1192a(C0296X x) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(x.mo1182a()).setBigContentTitle(this.f1296b).bigText(this.f1253e);
                if (this.f1298d) {
                    bigText.setSummaryText(this.f1297c);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.Y$d */
    public static class C0301d {

        /* renamed from: A */
        Bundle f1254A;

        /* renamed from: B */
        int f1255B;

        /* renamed from: C */
        int f1256C;

        /* renamed from: D */
        Notification f1257D;

        /* renamed from: E */
        RemoteViews f1258E;

        /* renamed from: F */
        RemoteViews f1259F;

        /* renamed from: G */
        RemoteViews f1260G;

        /* renamed from: H */
        String f1261H;

        /* renamed from: I */
        int f1262I;

        /* renamed from: J */
        String f1263J;

        /* renamed from: K */
        long f1264K;

        /* renamed from: L */
        int f1265L;

        /* renamed from: M */
        Notification f1266M;
        @Deprecated

        /* renamed from: N */
        public ArrayList<String> f1267N;

        /* renamed from: a */
        public Context f1268a;

        /* renamed from: b */
        public ArrayList<C0298a> f1269b;

        /* renamed from: c */
        CharSequence f1270c;

        /* renamed from: d */
        CharSequence f1271d;

        /* renamed from: e */
        PendingIntent f1272e;

        /* renamed from: f */
        PendingIntent f1273f;

        /* renamed from: g */
        RemoteViews f1274g;

        /* renamed from: h */
        Bitmap f1275h;

        /* renamed from: i */
        CharSequence f1276i;

        /* renamed from: j */
        int f1277j;

        /* renamed from: k */
        int f1278k;

        /* renamed from: l */
        boolean f1279l;

        /* renamed from: m */
        boolean f1280m;

        /* renamed from: n */
        C0304g f1281n;

        /* renamed from: o */
        CharSequence f1282o;

        /* renamed from: p */
        CharSequence[] f1283p;

        /* renamed from: q */
        int f1284q;

        /* renamed from: r */
        int f1285r;

        /* renamed from: s */
        boolean f1286s;

        /* renamed from: t */
        String f1287t;

        /* renamed from: u */
        boolean f1288u;

        /* renamed from: v */
        String f1289v;

        /* renamed from: w */
        boolean f1290w;

        /* renamed from: x */
        boolean f1291x;

        /* renamed from: y */
        boolean f1292y;

        /* renamed from: z */
        String f1293z;

        @Deprecated
        public C0301d(Context context) {
            this(context, (String) null);
        }

        public C0301d(Context context, String str) {
            this.f1269b = new ArrayList<>();
            this.f1279l = true;
            this.f1290w = false;
            this.f1255B = 0;
            this.f1256C = 0;
            this.f1262I = 0;
            this.f1265L = 0;
            this.f1266M = new Notification();
            this.f1268a = context;
            this.f1261H = str;
            this.f1266M.when = System.currentTimeMillis();
            this.f1266M.audioStreamType = -1;
            this.f1278k = 0;
            this.f1267N = new ArrayList<>();
        }

        /* renamed from: a */
        protected static CharSequence m1337a(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: a */
        private void m1338a(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f1266M;
                i2 = i | notification.flags;
            } else {
                notification = this.f1266M;
                i2 = (~i) & notification.flags;
            }
            notification.flags = i2;
        }

        /* renamed from: a */
        public Notification mo1194a() {
            return new C0305Z(this).mo1231b();
        }

        /* renamed from: a */
        public C0301d mo1195a(int i) {
            this.f1255B = i;
            return this;
        }

        /* renamed from: a */
        public C0301d mo1196a(int i, int i2, int i3) {
            Notification notification = this.f1266M;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (notification.ledOnMS == 0 || notification.ledOffMS == 0) ? 0 : 1;
            Notification notification2 = this.f1266M;
            notification2.flags = i4 | (notification2.flags & -2);
            return this;
        }

        /* renamed from: a */
        public C0301d mo1197a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1269b.add(new C0298a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C0301d mo1198a(long j) {
            this.f1266M.when = j;
            return this;
        }

        /* renamed from: a */
        public C0301d mo1199a(PendingIntent pendingIntent) {
            this.f1272e = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public C0301d mo1200a(Bitmap bitmap) {
            this.f1275h = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0301d mo1201a(Uri uri) {
            Notification notification = this.f1266M;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public C0301d mo1202a(C0302e eVar) {
            eVar.mo1223a(this);
            return this;
        }

        /* renamed from: a */
        public C0301d mo1203a(C0304g gVar) {
            if (this.f1281n != gVar) {
                this.f1281n = gVar;
                C0304g gVar2 = this.f1281n;
                if (gVar2 != null) {
                    gVar2.mo1227a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C0301d mo1204a(RemoteViews remoteViews) {
            this.f1266M.contentView = remoteViews;
            return this;
        }

        /* renamed from: a */
        public C0301d mo1205a(String str) {
            this.f1293z = str;
            return this;
        }

        /* renamed from: a */
        public C0301d mo1206a(boolean z) {
            m1338a(16, z);
            return this;
        }

        /* renamed from: a */
        public C0301d mo1207a(long[] jArr) {
            this.f1266M.vibrate = jArr;
            return this;
        }

        /* renamed from: b */
        public C0301d mo1208b(int i) {
            Notification notification = this.f1266M;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: b */
        public C0301d mo1209b(PendingIntent pendingIntent) {
            this.f1266M.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public C0301d mo1210b(CharSequence charSequence) {
            this.f1271d = m1337a(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0301d mo1211b(String str) {
            this.f1261H = str;
            return this;
        }

        /* renamed from: b */
        public C0301d mo1212b(boolean z) {
            this.f1288u = z;
            return this;
        }

        /* renamed from: c */
        public C0301d mo1213c(int i) {
            this.f1265L = i;
            return this;
        }

        /* renamed from: c */
        public C0301d mo1214c(CharSequence charSequence) {
            this.f1270c = m1337a(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0301d mo1215c(String str) {
            this.f1287t = str;
            return this;
        }

        /* renamed from: c */
        public C0301d mo1216c(boolean z) {
            this.f1290w = z;
            return this;
        }

        /* renamed from: d */
        public C0301d mo1217d(int i) {
            this.f1277j = i;
            return this;
        }

        /* renamed from: d */
        public C0301d mo1218d(CharSequence charSequence) {
            this.f1266M.tickerText = m1337a(charSequence);
            return this;
        }

        /* renamed from: d */
        public C0301d mo1219d(boolean z) {
            m1338a(8, z);
            return this;
        }

        /* renamed from: e */
        public C0301d mo1220e(int i) {
            this.f1278k = i;
            return this;
        }

        /* renamed from: f */
        public C0301d mo1221f(int i) {
            this.f1266M.icon = i;
            return this;
        }

        /* renamed from: g */
        public C0301d mo1222g(int i) {
            this.f1256C = i;
            return this;
        }
    }

    /* renamed from: android.support.v4.app.Y$e */
    public interface C0302e {
        /* renamed from: a */
        C0301d mo1223a(C0301d dVar);
    }

    /* renamed from: android.support.v4.app.Y$f */
    public static class C0303f extends C0304g {

        /* renamed from: e */
        private ArrayList<CharSequence> f1294e = new ArrayList<>();

        /* renamed from: a */
        public C0303f mo1224a(CharSequence charSequence) {
            this.f1294e.add(C0301d.m1337a(charSequence));
            return this;
        }

        /* renamed from: a */
        public void mo1192a(C0296X x) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(x.mo1182a()).setBigContentTitle(this.f1296b);
                if (this.f1298d) {
                    bigContentTitle.setSummaryText(this.f1297c);
                }
                Iterator<CharSequence> it = this.f1294e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        /* renamed from: b */
        public C0303f mo1225b(CharSequence charSequence) {
            this.f1296b = C0301d.m1337a(charSequence);
            return this;
        }
    }

    /* renamed from: android.support.v4.app.Y$g */
    public static abstract class C0304g {

        /* renamed from: a */
        protected C0301d f1295a;

        /* renamed from: b */
        CharSequence f1296b;

        /* renamed from: c */
        CharSequence f1297c;

        /* renamed from: d */
        boolean f1298d = false;

        /* renamed from: a */
        public void mo1226a(Bundle bundle) {
        }

        /* renamed from: a */
        public abstract void mo1192a(C0296X x);

        /* renamed from: a */
        public void mo1227a(C0301d dVar) {
            if (this.f1295a != dVar) {
                this.f1295a = dVar;
                C0301d dVar2 = this.f1295a;
                if (dVar2 != null) {
                    dVar2.mo1203a(this);
                }
            }
        }

        /* renamed from: b */
        public RemoteViews mo1228b(C0296X x) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews mo1229c(C0296X x) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo1230d(C0296X x) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bundle m1324a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0307aa.m1384a(notification);
        }
        return null;
    }
}
