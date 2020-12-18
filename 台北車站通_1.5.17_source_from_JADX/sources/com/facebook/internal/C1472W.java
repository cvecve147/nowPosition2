package com.facebook.internal;

import com.facebook.C1601x;
import java.util.Collection;

/* renamed from: com.facebook.internal.W */
public final class C1472W {

    /* renamed from: a */
    public static final Collection<String> f5105a = C1480ba.m6955b((T[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"});

    /* renamed from: b */
    public static final Collection<String> f5106b = C1480ba.m6955b((T[]) new String[]{"access_denied", "OAuthAccessDeniedException"});

    /* renamed from: a */
    public static final String m6905a() {
        return "v2.8";
    }

    /* renamed from: b */
    public static final String m6906b() {
        return String.format("m.%s", new Object[]{C1601x.m7396i()});
    }

    /* renamed from: c */
    public static final String m6907c() {
        return String.format("https://graph.%s", new Object[]{C1601x.m7396i()});
    }

    /* renamed from: d */
    public static final String m6908d() {
        return String.format("https://graph-video.%s", new Object[]{C1601x.m7396i()});
    }
}
