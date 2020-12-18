package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C2066m;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.common.util.C2087i;
import p013b.p018b.p028h.p039h.C1101r;
import p101d.p129g.p131b.p132a.p133a.C5461b;

/* renamed from: com.google.android.gms.common.internal.g */
public final class C2028g {

    /* renamed from: a */
    private static final C1101r<String, String> f6489a = new C1101r<>();

    /* renamed from: a */
    public static String m8944a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C1989c.m8748b(context).mo7522b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    public static String m8945a(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : C5461b.common_google_play_services_enable_button : C5461b.common_google_play_services_update_button : C5461b.common_google_play_services_install_button);
    }

    /* renamed from: a */
    private static String m8946a(Context context, String str) {
        synchronized (f6489a) {
            String str2 = f6489a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            f6489a.put(str, string);
            return string;
        }
    }

    /* renamed from: a */
    private static String m8947a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m8946a(context, str);
        if (a == null) {
            a = resources.getString(C2066m.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* renamed from: b */
    public static String m8948b(Context context) {
        return context.getResources().getString(C5461b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: b */
    public static String m8949b(Context context, int i) {
        Resources resources = context.getResources();
        String a = m8944a(context);
        if (i == 1) {
            return resources.getString(C5461b.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C5461b.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m8947a(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m8947a(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C5461b.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m8947a(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m8947a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m8947a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C5461b.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C2066m.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C2087i.m9152d(context)) {
            return resources.getString(C5461b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C5461b.common_google_play_services_update_text, new Object[]{a});
        }
    }

    /* renamed from: c */
    public static String m8950c(Context context, int i) {
        return i == 6 ? m8947a(context, "common_google_play_services_resolution_required_text", m8944a(context)) : m8949b(context, i);
    }

    /* renamed from: d */
    public static String m8951d(Context context, int i) {
        String a = i == 6 ? m8946a(context, "common_google_play_services_resolution_required_title") : m8952e(context, i);
        return a == null ? context.getResources().getString(C5461b.common_google_play_services_notification_ticker) : a;
    }

    /* renamed from: e */
    public static String m8952e(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C5461b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C5461b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C5461b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m8946a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m8946a(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m8946a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m8946a(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }
}
