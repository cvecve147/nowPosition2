package p101d.p191i.p192a.p200e;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: d.i.a.e.e */
public class C6021e {

    /* renamed from: a */
    private static C6021e f16840a = new C6021e();

    /* renamed from: b */
    private SharedPreferences f16841b;

    /* renamed from: a */
    public static C6021e m22848a() {
        return f16840a;
    }

    /* renamed from: a */
    public Boolean mo15923a(String str, Boolean bool) {
        SharedPreferences sharedPreferences = this.f16841b;
        if (sharedPreferences != null) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, bool.booleanValue()));
        }
        throw new UnsupportedOperationException("No valid shared preference.");
    }

    /* renamed from: a */
    public Boolean mo15924a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f16841b;
        if (sharedPreferences != null) {
            return Boolean.valueOf(sharedPreferences.edit().putString(str, str2).commit());
        }
        throw new UnsupportedOperationException("No valid shared preference.");
    }

    /* renamed from: a */
    public Boolean mo15925a(String str, JSONObject jSONObject) {
        SharedPreferences sharedPreferences = this.f16841b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, jSONObject.toString()).apply();
            return true;
        }
        throw new UnsupportedOperationException("No valid shared preference.");
    }

    /* renamed from: a */
    public void mo15926a(Context context) {
        if (context != null) {
            this.f16841b = context.getSharedPreferences("sto.parameters", 0);
        } else {
            Log.e("SharedPreferencesManager", "Passed context is NULL");
        }
    }

    /* renamed from: a */
    public void mo15927a(String str) {
        SharedPreferences.Editor edit = this.f16841b.edit();
        edit.remove(str);
        edit.commit();
    }

    /* renamed from: b */
    public Boolean mo15928b(String str, Boolean bool) {
        SharedPreferences sharedPreferences = this.f16841b;
        if (sharedPreferences != null) {
            return Boolean.valueOf(sharedPreferences.edit().putBoolean(str, bool.booleanValue()).commit());
        }
        throw new UnsupportedOperationException("No valid shared preference.");
    }

    /* renamed from: b */
    public JSONObject mo15929b(String str) {
        SharedPreferences sharedPreferences = this.f16841b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, (String) null);
            if (string == null) {
                return null;
            }
            try {
                return new JSONObject(string);
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        } else {
            throw new UnsupportedOperationException("No valid shared preference.");
        }
    }

    /* renamed from: c */
    public String mo15930c(String str) {
        SharedPreferences sharedPreferences = this.f16841b;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, "");
        }
        throw new UnsupportedOperationException("No valid shared preference.");
    }
}
