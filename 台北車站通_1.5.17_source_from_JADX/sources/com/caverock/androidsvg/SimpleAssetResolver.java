package com.caverock.androidsvg;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SimpleAssetResolver extends SVGExternalFileResolver {
    private static final String TAG = "SimpleAssetResolver";
    private static final Set<String> supportedFormats = new HashSet(8);
    private AssetManager assetManager;

    static {
        supportedFormats.add("image/svg+xml");
        supportedFormats.add("image/jpeg");
        supportedFormats.add("image/png");
        supportedFormats.add("image/pjpeg");
        supportedFormats.add("image/gif");
        supportedFormats.add("image/bmp");
        supportedFormats.add("image/x-windows-bmp");
        if (Build.VERSION.SDK_INT >= 14) {
            supportedFormats.add("image/webp");
        }
    }

    public SimpleAssetResolver(AssetManager assetManager2) {
        this.assetManager = assetManager2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[SYNTHETIC, Splitter:B:18:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f A[SYNTHETIC, Splitter:B:26:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getAssetAsString(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            android.content.res.AssetManager r1 = r7.assetManager     // Catch:{ IOException -> 0x003c, all -> 0x0032 }
            java.io.InputStream r8 = r1.open(r8)     // Catch:{ IOException -> 0x003c, all -> 0x0032 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003d, all -> 0x0030 }
            java.lang.String r2 = "UTF-8"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)     // Catch:{ IOException -> 0x003d, all -> 0x0030 }
            r1.<init>(r8, r2)     // Catch:{ IOException -> 0x003d, all -> 0x0030 }
            r2 = 4096(0x1000, float:5.74E-42)
            char[] r2 = new char[r2]     // Catch:{ IOException -> 0x003d, all -> 0x0030 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003d, all -> 0x0030 }
            r3.<init>()     // Catch:{ IOException -> 0x003d, all -> 0x0030 }
        L_0x001b:
            int r4 = r1.read(r2)     // Catch:{ IOException -> 0x003d, all -> 0x0030 }
            if (r4 <= 0) goto L_0x0026
            r5 = 0
            r3.append(r2, r5, r4)     // Catch:{ IOException -> 0x003d, all -> 0x0030 }
            goto L_0x001b
        L_0x0026:
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x003d, all -> 0x0030 }
            if (r8 == 0) goto L_0x002f
            r8.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        L_0x0030:
            r0 = move-exception
            goto L_0x0036
        L_0x0032:
            r8 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0036:
            if (r8 == 0) goto L_0x003b
            r8.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            r8 = r0
        L_0x003d:
            if (r8 == 0) goto L_0x0042
            r8.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SimpleAssetResolver.getAssetAsString(java.lang.String):java.lang.String");
    }

    public boolean isFormatSupported(String str) {
        return supportedFormats.contains(str);
    }

    public String resolveCSSStyleSheet(String str) {
        String str2 = TAG;
        Log.i(str2, "resolveCSSStyleSheet(" + str + ")");
        return getAssetAsString(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r5 = r3.assetManager;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0058, code lost:
        return android.graphics.Typeface.createFromAsset(r5, r4 + ".otf");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface resolveFont(java.lang.String r4, int r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "resolveFont("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ","
            r1.append(r2)
            r1.append(r5)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r5 = ")"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.util.Log.i(r0, r5)
            android.content.res.AssetManager r5 = r3.assetManager     // Catch:{ RuntimeException -> 0x0041 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0041 }
            r6.<init>()     // Catch:{ RuntimeException -> 0x0041 }
            r6.append(r4)     // Catch:{ RuntimeException -> 0x0041 }
            java.lang.String r0 = ".ttf"
            r6.append(r0)     // Catch:{ RuntimeException -> 0x0041 }
            java.lang.String r6 = r6.toString()     // Catch:{ RuntimeException -> 0x0041 }
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromAsset(r5, r6)     // Catch:{ RuntimeException -> 0x0041 }
            return r4
        L_0x0041:
            android.content.res.AssetManager r5 = r3.assetManager     // Catch:{ RuntimeException -> 0x0059 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0059 }
            r6.<init>()     // Catch:{ RuntimeException -> 0x0059 }
            r6.append(r4)     // Catch:{ RuntimeException -> 0x0059 }
            java.lang.String r4 = ".otf"
            r6.append(r4)     // Catch:{ RuntimeException -> 0x0059 }
            java.lang.String r4 = r6.toString()     // Catch:{ RuntimeException -> 0x0059 }
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromAsset(r5, r4)     // Catch:{ RuntimeException -> 0x0059 }
            return r4
        L_0x0059:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SimpleAssetResolver.resolveFont(java.lang.String, int, java.lang.String):android.graphics.Typeface");
    }

    public Bitmap resolveImage(String str) {
        String str2 = TAG;
        Log.i(str2, "resolveImage(" + str + ")");
        try {
            return BitmapFactory.decodeStream(this.assetManager.open(str));
        } catch (IOException unused) {
            return null;
        }
    }
}
