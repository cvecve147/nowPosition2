package p299tw.navin.navinmap.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.TypedValue;
import android.view.View;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p267i.p268a.p269a.C6689e;

/* renamed from: tw.navin.navinmap.util.l */
public class C7173l {
    /* renamed from: a */
    public static float m26990a(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static AlertDialog m26991a(Context context, View view, String str, int i, int i2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(true);
        if (str != null) {
            builder.setMessage(str);
        }
        if (view != null) {
            builder.setView(view);
        }
        if (i != -1) {
            if (onClickListener == null) {
                builder.setNegativeButton(i, new C7171j());
            } else {
                builder.setNegativeButton(i, onClickListener);
            }
        }
        if (onClickListener2 != null) {
            if (i2 != -1) {
                builder.setPositiveButton(i2, onClickListener2);
            } else {
                builder.setPositiveButton(C6689e.dialog_btn_ok, onClickListener2);
            }
        } else if (i2 != -1) {
            builder.setPositiveButton(i2, new C7172k());
        }
        AlertDialog create = builder.create();
        create.show();
        return create;
    }

    /* renamed from: a */
    public static String m26992a() {
        return m27003b("yyyyMMdd HH:mm:ss");
    }

    /* renamed from: a */
    public static String m26993a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        try {
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = bufferedReader2;
                    try {
                        e.printStackTrace();
                        bufferedReader.close();
                        return sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            bufferedReader.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    bufferedReader.close();
                    throw th;
                }
            }
            bufferedReader2.close();
        } catch (IOException e4) {
            e = e4;
            e.printStackTrace();
            bufferedReader.close();
            return sb.toString();
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m26994a(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        return str.substring(lastIndexOf == -1 ? 0 : lastIndexOf + 1, str.length());
    }

    /* renamed from: a */
    public static String m26995a(String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = File.separator;
        }
        int lastIndexOf = str.lastIndexOf(str2);
        return str.substring(lastIndexOf == -1 ? 0 : lastIndexOf + 1, str.length());
    }

    /* renamed from: a */
    public static void m26996a(Context context, int i, int i2, boolean z, DialogInterface.OnClickListener onClickListener) {
        m26997a(context, i != -1 ? context.getString(i) : null, context.getString(i2), z, onClickListener);
    }

    /* renamed from: a */
    public static void m26997a(Context context, String str, String str2, boolean z, DialogInterface.OnClickListener onClickListener) {
        m26998a(context, str, str2, z, (String) null, onClickListener);
    }

    /* renamed from: a */
    public static void m26998a(Context context, String str, String str2, boolean z, String str3, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setMessage(str2);
        if (str != null) {
            builder.setTitle(str);
        }
        if (z) {
            builder.setNegativeButton(C6689e.dialog_btn_cancel, new C7169h());
        }
        if (onClickListener == null) {
            builder.setPositiveButton(C6689e.dialog_btn_ok, new C7170i());
        } else if (str3 != null) {
            builder.setPositiveButton(str3, onClickListener);
        } else {
            builder.setPositiveButton(C6689e.dialog_btn_ok, onClickListener);
        }
        builder.create().show();
    }

    /* renamed from: a */
    public static boolean m26999a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
    }

    /* renamed from: a */
    public static boolean m27000a(String str, int i) {
        try {
            return (Calendar.getInstance().getTime().getTime() / 1000) - (new SimpleDateFormat("yyyyMMdd HH:mm:ss", Locale.getDefault()).parse(str).getTime() / 1000) >= ((long) (i * 60));
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static String[] m27001a(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: b */
    public static ImageLoader m27002b(Context context) {
        ImageLoader instance = ImageLoader.getInstance();
        if (!instance.isInited()) {
            instance.init(new ImageLoaderConfiguration.Builder(context).defaultDisplayImageOptions(new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true).imageScaleType(ImageScaleType.NONE).considerExifParams(true).bitmapConfig(Bitmap.Config.RGB_565).build()).build());
        }
        return instance;
    }

    /* renamed from: b */
    private static String m27003b(String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(System.currentTimeMillis()));
    }

    /* renamed from: b */
    public static boolean m27004b(String str, int i) {
        try {
            return (Calendar.getInstance().getTime().getTime() / 1000) - (new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).parse(str).getTime() / 1000) >= ((long) (((i * 24) * 60) * 60));
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }
}
