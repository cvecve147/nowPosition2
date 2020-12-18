package p101d.p122f.p123a.p125b;

import java.io.InputStream;
import java.util.Properties;

/* renamed from: d.f.a.b.f */
class C5339f {

    /* renamed from: a */
    public final String f15106a;

    /* renamed from: b */
    public final String f15107b;

    /* renamed from: c */
    public final String f15108c;

    /* renamed from: d */
    public final String f15109d;

    C5339f(String str, String str2, String str3, String str4) {
        this.f15106a = str;
        this.f15107b = str2;
        this.f15108c = str3;
        this.f15109d = str4;
    }

    /* renamed from: a */
    public static C5339f m20598a(InputStream inputStream) {
        Properties properties = new Properties();
        properties.load(inputStream);
        return m20599a(properties);
    }

    /* renamed from: a */
    public static C5339f m20599a(Properties properties) {
        return new C5339f(properties.getProperty("version_code"), properties.getProperty("version_name"), properties.getProperty("build_id"), properties.getProperty("package_name"));
    }
}
