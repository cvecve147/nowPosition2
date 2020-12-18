package p287me.tatarka.support.p288os;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import p245f.p246a.p247a.p248a.p249a.C6455g;

/* renamed from: me.tatarka.support.os.PersistableBundle */
public final class PersistableBundle implements Parcelable, Cloneable, C6455g.C6457b {
    public static final Parcelable.Creator<PersistableBundle> CREATOR = new C6813a();

    /* renamed from: a */
    public static final PersistableBundle f18932a = new PersistableBundle(C6814b.f18934a);

    /* renamed from: b */
    private Object f18933b;

    /* renamed from: me.tatarka.support.os.PersistableBundle$a */
    public static class C6812a implements C6455g.C6456a {
        /* renamed from: a */
        public Object mo16626a(XmlPullParser xmlPullParser, String str) {
            if ("pbundle_as_map".equals(str)) {
                return PersistableBundle.m25910a(xmlPullParser);
            }
            throw new XmlPullParserException("Unknown tag=" + str);
        }
    }

    public PersistableBundle() {
        this.f18933b = C6814b.m25918a();
    }

    private PersistableBundle(Parcel parcel) {
        this.f18933b = C6814b.m25919a(parcel);
    }

    /* synthetic */ PersistableBundle(Parcel parcel, C6813a aVar) {
        this(parcel);
    }

    public PersistableBundle(Object obj) {
        this.f18933b = obj;
    }

    private PersistableBundle(Map<String, Object> map) {
        this.f18933b = C6814b.m25918a();
        mo17458a((Map) map);
    }

    public PersistableBundle(PersistableBundle persistableBundle) {
        this.f18933b = C6814b.m25933b(persistableBundle.f18933b);
    }

    /* renamed from: a */
    public static PersistableBundle m25909a(Parcel parcel) {
        return new PersistableBundle(C6814b.m25919a(parcel));
    }

    /* renamed from: a */
    public static PersistableBundle m25910a(XmlPullParser xmlPullParser) {
        int next;
        int depth = xmlPullParser.getDepth();
        String name = xmlPullParser.getName();
        String[] strArr = new String[1];
        do {
            next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() >= depth)) {
                return f18932a;
            }
        } while (next != 2);
        return new PersistableBundle((Map<String, Object>) C6455g.m24107a(xmlPullParser, name, strArr, (C6455g.C6456a) new C6812a()));
    }

    /* renamed from: a */
    public static void m25911a(PersistableBundle persistableBundle, Parcel parcel) {
        C6814b.m25922a(parcel, persistableBundle.f18933b);
    }

    /* renamed from: a */
    public Object mo17457a(String str) {
        return C6814b.m25920a(this.f18933b, str);
    }

    /* renamed from: a */
    public void mo16627a(Object obj, String str, XmlSerializer xmlSerializer) {
        if (obj instanceof PersistableBundle) {
            xmlSerializer.startTag((String) null, "pbundle_as_map");
            xmlSerializer.attribute((String) null, "name", str);
            ((PersistableBundle) obj).mo17459a(xmlSerializer);
            xmlSerializer.endTag((String) null, "pbundle_as_map");
            return;
        }
        throw new XmlPullParserException("Unknown Object o=" + obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17458a(Map map) {
        C6814b.m25932a(this.f18933b, (Map<String, Object>) map);
    }

    /* renamed from: a */
    public void mo17459a(XmlSerializer xmlSerializer) {
        HashMap hashMap = new HashMap();
        for (String next : mo17461d()) {
            hashMap.put(next, mo17457a(next));
        }
        C6455g.m24113a((Map) hashMap, xmlSerializer, (C6455g.C6457b) this);
    }

    public Object clone() {
        return new PersistableBundle(this);
    }

    /* renamed from: d */
    public Set<String> mo17461d() {
        return C6814b.m25921a(this.f18933b);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f18933b.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C6814b.m25922a(parcel, this.f18933b);
    }
}
