package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Barcode> CREATOR = new C4014c();

    /* renamed from: a */
    public int f11925a;

    /* renamed from: b */
    public String f11926b;

    /* renamed from: c */
    public String f11927c;

    /* renamed from: d */
    public int f11928d;

    /* renamed from: e */
    public Point[] f11929e;

    /* renamed from: f */
    public Email f11930f;

    /* renamed from: g */
    public Phone f11931g;

    /* renamed from: h */
    public Sms f11932h;

    /* renamed from: i */
    public WiFi f11933i;

    /* renamed from: j */
    public UrlBookmark f11934j;

    /* renamed from: k */
    public GeoPoint f11935k;

    /* renamed from: l */
    public CalendarEvent f11936l;

    /* renamed from: m */
    public ContactInfo f11937m;

    /* renamed from: n */
    public DriverLicense f11938n;

    public static class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Address> CREATOR = new C4013b();

        /* renamed from: a */
        public int f11939a;

        /* renamed from: b */
        public String[] f11940b;

        public Address() {
        }

        public Address(int i, String[] strArr) {
            this.f11939a = i;
            this.f11940b = strArr;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9030a(parcel, 2, this.f11939a);
            C2049b.m9043a(parcel, 3, this.f11940b, false);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator<CalendarDateTime> CREATOR = new C4016e();

        /* renamed from: a */
        public int f11941a;

        /* renamed from: b */
        public int f11942b;

        /* renamed from: c */
        public int f11943c;

        /* renamed from: d */
        public int f11944d;

        /* renamed from: e */
        public int f11945e;

        /* renamed from: f */
        public int f11946f;

        /* renamed from: g */
        public boolean f11947g;

        /* renamed from: h */
        public String f11948h;

        public CalendarDateTime() {
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
            this.f11941a = i;
            this.f11942b = i2;
            this.f11943c = i3;
            this.f11944d = i4;
            this.f11945e = i5;
            this.f11946f = i6;
            this.f11947g = z;
            this.f11948h = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9030a(parcel, 2, this.f11941a);
            C2049b.m9030a(parcel, 3, this.f11942b);
            C2049b.m9030a(parcel, 4, this.f11943c);
            C2049b.m9030a(parcel, 5, this.f11944d);
            C2049b.m9030a(parcel, 6, this.f11945e);
            C2049b.m9030a(parcel, 7, this.f11946f);
            C2049b.m9040a(parcel, 8, this.f11947g);
            C2049b.m9038a(parcel, 9, this.f11948h, false);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator<CalendarEvent> CREATOR = new C4017f();

        /* renamed from: a */
        public String f11949a;

        /* renamed from: b */
        public String f11950b;

        /* renamed from: c */
        public String f11951c;

        /* renamed from: d */
        public String f11952d;

        /* renamed from: e */
        public String f11953e;

        /* renamed from: f */
        public CalendarDateTime f11954f;

        /* renamed from: g */
        public CalendarDateTime f11955g;

        public CalendarEvent() {
        }

        public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
            this.f11949a = str;
            this.f11950b = str2;
            this.f11951c = str3;
            this.f11952d = str4;
            this.f11953e = str5;
            this.f11954f = calendarDateTime;
            this.f11955g = calendarDateTime2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9038a(parcel, 2, this.f11949a, false);
            C2049b.m9038a(parcel, 3, this.f11950b, false);
            C2049b.m9038a(parcel, 4, this.f11951c, false);
            C2049b.m9038a(parcel, 5, this.f11952d, false);
            C2049b.m9038a(parcel, 6, this.f11953e, false);
            C2049b.m9034a(parcel, 7, (Parcelable) this.f11954f, i, false);
            C2049b.m9034a(parcel, 8, (Parcelable) this.f11955g, i, false);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator<ContactInfo> CREATOR = new C4018g();

        /* renamed from: a */
        public PersonName f11956a;

        /* renamed from: b */
        public String f11957b;

        /* renamed from: c */
        public String f11958c;

        /* renamed from: d */
        public Phone[] f11959d;

        /* renamed from: e */
        public Email[] f11960e;

        /* renamed from: f */
        public String[] f11961f;

        /* renamed from: g */
        public Address[] f11962g;

        public ContactInfo() {
        }

        public ContactInfo(PersonName personName, String str, String str2, Phone[] phoneArr, Email[] emailArr, String[] strArr, Address[] addressArr) {
            this.f11956a = personName;
            this.f11957b = str;
            this.f11958c = str2;
            this.f11959d = phoneArr;
            this.f11960e = emailArr;
            this.f11961f = strArr;
            this.f11962g = addressArr;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9034a(parcel, 2, (Parcelable) this.f11956a, i, false);
            C2049b.m9038a(parcel, 3, this.f11957b, false);
            C2049b.m9038a(parcel, 4, this.f11958c, false);
            C2049b.m9042a(parcel, 5, (T[]) this.f11959d, i, false);
            C2049b.m9042a(parcel, 6, (T[]) this.f11960e, i, false);
            C2049b.m9043a(parcel, 7, this.f11961f, false);
            C2049b.m9042a(parcel, 8, (T[]) this.f11962g, i, false);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator<DriverLicense> CREATOR = new C4019h();

        /* renamed from: a */
        public String f11963a;

        /* renamed from: b */
        public String f11964b;

        /* renamed from: c */
        public String f11965c;

        /* renamed from: d */
        public String f11966d;

        /* renamed from: e */
        public String f11967e;

        /* renamed from: f */
        public String f11968f;

        /* renamed from: g */
        public String f11969g;

        /* renamed from: h */
        public String f11970h;

        /* renamed from: i */
        public String f11971i;

        /* renamed from: j */
        public String f11972j;

        /* renamed from: k */
        public String f11973k;

        /* renamed from: l */
        public String f11974l;

        /* renamed from: m */
        public String f11975m;

        /* renamed from: n */
        public String f11976n;

        public DriverLicense() {
        }

        public DriverLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.f11963a = str;
            this.f11964b = str2;
            this.f11965c = str3;
            this.f11966d = str4;
            this.f11967e = str5;
            this.f11968f = str6;
            this.f11969g = str7;
            this.f11970h = str8;
            this.f11971i = str9;
            this.f11972j = str10;
            this.f11973k = str11;
            this.f11974l = str12;
            this.f11975m = str13;
            this.f11976n = str14;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9038a(parcel, 2, this.f11963a, false);
            C2049b.m9038a(parcel, 3, this.f11964b, false);
            C2049b.m9038a(parcel, 4, this.f11965c, false);
            C2049b.m9038a(parcel, 5, this.f11966d, false);
            C2049b.m9038a(parcel, 6, this.f11967e, false);
            C2049b.m9038a(parcel, 7, this.f11968f, false);
            C2049b.m9038a(parcel, 8, this.f11969g, false);
            C2049b.m9038a(parcel, 9, this.f11970h, false);
            C2049b.m9038a(parcel, 10, this.f11971i, false);
            C2049b.m9038a(parcel, 11, this.f11972j, false);
            C2049b.m9038a(parcel, 12, this.f11973k, false);
            C2049b.m9038a(parcel, 13, this.f11974l, false);
            C2049b.m9038a(parcel, 14, this.f11975m, false);
            C2049b.m9038a(parcel, 15, this.f11976n, false);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Email> CREATOR = new C4020i();

        /* renamed from: a */
        public int f11977a;

        /* renamed from: b */
        public String f11978b;

        /* renamed from: c */
        public String f11979c;

        /* renamed from: d */
        public String f11980d;

        public Email() {
        }

        public Email(int i, String str, String str2, String str3) {
            this.f11977a = i;
            this.f11978b = str;
            this.f11979c = str2;
            this.f11980d = str3;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9030a(parcel, 2, this.f11977a);
            C2049b.m9038a(parcel, 3, this.f11978b, false);
            C2049b.m9038a(parcel, 4, this.f11979c, false);
            C2049b.m9038a(parcel, 5, this.f11980d, false);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GeoPoint> CREATOR = new C4021j();

        /* renamed from: a */
        public double f11981a;

        /* renamed from: b */
        public double f11982b;

        public GeoPoint() {
        }

        public GeoPoint(double d, double d2) {
            this.f11981a = d;
            this.f11982b = d2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9028a(parcel, 2, this.f11981a);
            C2049b.m9028a(parcel, 3, this.f11982b);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PersonName> CREATOR = new C4022k();

        /* renamed from: a */
        public String f11983a;

        /* renamed from: b */
        public String f11984b;

        /* renamed from: c */
        public String f11985c;

        /* renamed from: d */
        public String f11986d;

        /* renamed from: e */
        public String f11987e;

        /* renamed from: f */
        public String f11988f;

        /* renamed from: g */
        public String f11989g;

        public PersonName() {
        }

        public PersonName(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f11983a = str;
            this.f11984b = str2;
            this.f11985c = str3;
            this.f11986d = str4;
            this.f11987e = str5;
            this.f11988f = str6;
            this.f11989g = str7;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9038a(parcel, 2, this.f11983a, false);
            C2049b.m9038a(parcel, 3, this.f11984b, false);
            C2049b.m9038a(parcel, 4, this.f11985c, false);
            C2049b.m9038a(parcel, 5, this.f11986d, false);
            C2049b.m9038a(parcel, 6, this.f11987e, false);
            C2049b.m9038a(parcel, 7, this.f11988f, false);
            C2049b.m9038a(parcel, 8, this.f11989g, false);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Phone> CREATOR = new C4023l();

        /* renamed from: a */
        public int f11990a;

        /* renamed from: b */
        public String f11991b;

        public Phone() {
        }

        public Phone(int i, String str) {
            this.f11990a = i;
            this.f11991b = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9030a(parcel, 2, this.f11990a);
            C2049b.m9038a(parcel, 3, this.f11991b, false);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Sms> CREATOR = new C4024m();

        /* renamed from: a */
        public String f11992a;

        /* renamed from: b */
        public String f11993b;

        public Sms() {
        }

        public Sms(String str, String str2) {
            this.f11992a = str;
            this.f11993b = str2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9038a(parcel, 2, this.f11992a, false);
            C2049b.m9038a(parcel, 3, this.f11993b, false);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator<UrlBookmark> CREATOR = new C4025n();

        /* renamed from: a */
        public String f11994a;

        /* renamed from: b */
        public String f11995b;

        public UrlBookmark() {
        }

        public UrlBookmark(String str, String str2) {
            this.f11994a = str;
            this.f11995b = str2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9038a(parcel, 2, this.f11994a, false);
            C2049b.m9038a(parcel, 3, this.f11995b, false);
            C2049b.m9026a(parcel, a);
        }
    }

    public static class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator<WiFi> CREATOR = new C4026o();

        /* renamed from: a */
        public String f11996a;

        /* renamed from: b */
        public String f11997b;

        /* renamed from: c */
        public int f11998c;

        public WiFi() {
        }

        public WiFi(String str, String str2, int i) {
            this.f11996a = str;
            this.f11997b = str2;
            this.f11998c = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C2049b.m9025a(parcel);
            C2049b.m9038a(parcel, 2, this.f11996a, false);
            C2049b.m9038a(parcel, 3, this.f11997b, false);
            C2049b.m9030a(parcel, 4, this.f11998c);
            C2049b.m9026a(parcel, a);
        }
    }

    public Barcode() {
    }

    public Barcode(int i, String str, String str2, int i2, Point[] pointArr, Email email, Phone phone, Sms sms, WiFi wiFi, UrlBookmark urlBookmark, GeoPoint geoPoint, CalendarEvent calendarEvent, ContactInfo contactInfo, DriverLicense driverLicense) {
        this.f11925a = i;
        this.f11926b = str;
        this.f11927c = str2;
        this.f11928d = i2;
        this.f11929e = pointArr;
        this.f11930f = email;
        this.f11931g = phone;
        this.f11932h = sms;
        this.f11933i = wiFi;
        this.f11934j = urlBookmark;
        this.f11935k = geoPoint;
        this.f11936l = calendarEvent;
        this.f11937m = contactInfo;
        this.f11938n = driverLicense;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 2, this.f11925a);
        C2049b.m9038a(parcel, 3, this.f11926b, false);
        C2049b.m9038a(parcel, 4, this.f11927c, false);
        C2049b.m9030a(parcel, 5, this.f11928d);
        C2049b.m9042a(parcel, 6, (T[]) this.f11929e, i, false);
        C2049b.m9034a(parcel, 7, (Parcelable) this.f11930f, i, false);
        C2049b.m9034a(parcel, 8, (Parcelable) this.f11931g, i, false);
        C2049b.m9034a(parcel, 9, (Parcelable) this.f11932h, i, false);
        C2049b.m9034a(parcel, 10, (Parcelable) this.f11933i, i, false);
        C2049b.m9034a(parcel, 11, (Parcelable) this.f11934j, i, false);
        C2049b.m9034a(parcel, 12, (Parcelable) this.f11935k, i, false);
        C2049b.m9034a(parcel, 13, (Parcelable) this.f11936l, i, false);
        C2049b.m9034a(parcel, 14, (Parcelable) this.f11937m, i, false);
        C2049b.m9034a(parcel, 15, (Parcelable) this.f11938n, i, false);
        C2049b.m9026a(parcel, a);
    }
}
