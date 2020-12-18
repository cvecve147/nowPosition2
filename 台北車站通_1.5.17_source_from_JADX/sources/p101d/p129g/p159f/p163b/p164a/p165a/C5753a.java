package p101d.p129g.p159f.p163b.p164a.p165a;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.http.HttpStatus;
import org.apache.http.message.TokenParser;

/* renamed from: d.g.f.b.a.a.a */
public final class C5753a {

    /* renamed from: a */
    private static final Pattern f15903a = Pattern.compile(";");

    @TargetApi(15)
    /* renamed from: a */
    private static String m21741a(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area next : iterable) {
            sb.append(next.rect);
            sb.append(':');
            sb.append(next.weight);
            sb.append(TokenParser.f19315SP);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m21742a(String str, Collection<String> collection, String... strArr) {
        Log.i("CameraConfiguration", "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    /* renamed from: a */
    private static String m21743a(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @TargetApi(15)
    /* renamed from: a */
    private static List<Camera.Area> m21744a(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    /* renamed from: a */
    public static void m21745a(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i("CameraConfiguration", "Barcode scene mode already set");
            return;
        }
        String a = m21742a("scene mode", (Collection<String>) parameters.getSupportedSceneModes(), "barcode");
        if (a != null) {
            parameters.setSceneMode(a);
        }
    }

    /* renamed from: a */
    public static void m21746a(Camera.Parameters parameters, int i, int i2) {
        String str;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i("CameraConfiguration", "Supported FPS ranges: " + m21743a((Collection<int[]>) supportedPreviewFpsRange));
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            int[] iArr = null;
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] next = it.next();
                int i3 = next[0];
                int i4 = next[1];
                if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                    iArr = next;
                    break;
                }
            }
            if (iArr == null) {
                str = "No suitable FPS range?";
            } else {
                int[] iArr2 = new int[2];
                parameters.getPreviewFpsRange(iArr2);
                if (Arrays.equals(iArr2, iArr)) {
                    str = "FPS range already set to " + Arrays.toString(iArr);
                } else {
                    Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                    parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    return;
                }
            }
            Log.i("CameraConfiguration", str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21747a(android.hardware.Camera.Parameters r5, com.journeyapps.barcodescanner.p077a.C4121m.C4122a r6, boolean r7) {
        /*
            java.util.List r0 = r5.getSupportedFocusModes()
            java.lang.String r1 = "macro"
            java.lang.String r2 = "auto"
            java.lang.String r3 = "focus mode"
            if (r7 != 0) goto L_0x0034
            com.journeyapps.barcodescanner.a.m$a r4 = com.journeyapps.barcodescanner.p077a.C4121m.C4122a.AUTO
            if (r6 != r4) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            com.journeyapps.barcodescanner.a.m$a r4 = com.journeyapps.barcodescanner.p077a.C4121m.C4122a.CONTINUOUS
            if (r6 != r4) goto L_0x001e
            java.lang.String r6 = "continuous-picture"
            java.lang.String r4 = "continuous-video"
            java.lang.String[] r6 = new java.lang.String[]{r6, r4, r2}
            goto L_0x0038
        L_0x001e:
            com.journeyapps.barcodescanner.a.m$a r2 = com.journeyapps.barcodescanner.p077a.C4121m.C4122a.INFINITY
            if (r6 != r2) goto L_0x0029
            java.lang.String r6 = "infinity"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            goto L_0x0038
        L_0x0029:
            com.journeyapps.barcodescanner.a.m$a r2 = com.journeyapps.barcodescanner.p077a.C4121m.C4122a.MACRO
            if (r6 != r2) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[]{r1}
            goto L_0x0038
        L_0x0032:
            r6 = 0
            goto L_0x003c
        L_0x0034:
            java.lang.String[] r6 = new java.lang.String[]{r2}
        L_0x0038:
            java.lang.String r6 = m21742a((java.lang.String) r3, (java.util.Collection<java.lang.String>) r0, (java.lang.String[]) r6)
        L_0x003c:
            if (r7 != 0) goto L_0x004a
            if (r6 != 0) goto L_0x004a
            java.lang.String r6 = "edof"
            java.lang.String[] r6 = new java.lang.String[]{r1, r6}
            java.lang.String r6 = m21742a((java.lang.String) r3, (java.util.Collection<java.lang.String>) r0, (java.lang.String[]) r6)
        L_0x004a:
            if (r6 == 0) goto L_0x0070
            java.lang.String r7 = r5.getFocusMode()
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x006d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Focus mode already set to "
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "CameraConfiguration"
            android.util.Log.i(r6, r5)
            goto L_0x0070
        L_0x006d:
            r5.setFocusMode(r6)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p163b.p164a.p165a.C5753a.m21747a(android.hardware.Camera$Parameters, com.journeyapps.barcodescanner.a.m$a, boolean):void");
    }

    /* renamed from: a */
    public static void m21748a(Camera.Parameters parameters, boolean z) {
        String str;
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (!(minExposureCompensation == 0 && maxExposureCompensation == 0)) {
            float f = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z) {
                    f = 1.5f;
                }
                int round = Math.round(f / exposureCompensationStep);
                float f2 = exposureCompensationStep * ((float) round);
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    str = "Exposure compensation already set to " + max + " / " + f2;
                    Log.i("CameraConfiguration", str);
                }
                Log.i("CameraConfiguration", "Setting exposure compensation to " + max + " / " + f2);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        str = "Camera does not support exposure compensation";
        Log.i("CameraConfiguration", str);
    }

    /* renamed from: b */
    public static void m21749b(Camera.Parameters parameters) {
        m21746a(parameters, 10, 20);
    }

    /* renamed from: b */
    public static void m21750b(Camera.Parameters parameters, boolean z) {
        String a = m21742a("flash mode", (Collection<String>) parameters.getSupportedFlashModes(), z ? new String[]{"torch", "on"} : new String[]{"off"});
        if (a == null) {
            return;
        }
        if (a.equals(parameters.getFlashMode())) {
            Log.i("CameraConfiguration", "Flash mode already set to " + a);
            return;
        }
        Log.i("CameraConfiguration", "Setting flash mode to " + a);
        parameters.setFlashMode(a);
    }

    @TargetApi(15)
    /* renamed from: c */
    public static void m21751c(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            Log.i("CameraConfiguration", "Old focus areas: " + m21741a((Iterable<Camera.Area>) parameters.getFocusAreas()));
            List<Camera.Area> a = m21744a((int) HttpStatus.SC_BAD_REQUEST);
            Log.i("CameraConfiguration", "Setting focus area to : " + m21741a((Iterable<Camera.Area>) a));
            parameters.setFocusAreas(a);
            return;
        }
        Log.i("CameraConfiguration", "Device does not support focus areas");
    }

    /* renamed from: d */
    public static void m21752d(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i("CameraConfiguration", "Negative effect already set");
            return;
        }
        String a = m21742a("color effect", (Collection<String>) parameters.getSupportedColorEffects(), "negative");
        if (a != null) {
            parameters.setColorEffect(a);
        }
    }

    @TargetApi(15)
    /* renamed from: e */
    public static void m21753e(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Log.i("CameraConfiguration", "Old metering areas: " + parameters.getMeteringAreas());
            List<Camera.Area> a = m21744a((int) HttpStatus.SC_BAD_REQUEST);
            Log.i("CameraConfiguration", "Setting metering area to : " + m21741a((Iterable<Camera.Area>) a));
            parameters.setMeteringAreas(a);
            return;
        }
        Log.i("CameraConfiguration", "Device does not support metering areas");
    }

    @TargetApi(15)
    /* renamed from: f */
    public static void m21754f(Camera.Parameters parameters) {
        String str;
        if (!parameters.isVideoStabilizationSupported()) {
            str = "This device does not support video stabilization";
        } else if (parameters.getVideoStabilization()) {
            str = "Video stabilization already enabled";
        } else {
            Log.i("CameraConfiguration", "Enabling video stabilization...");
            parameters.setVideoStabilization(true);
            return;
        }
        Log.i("CameraConfiguration", str);
    }
}
