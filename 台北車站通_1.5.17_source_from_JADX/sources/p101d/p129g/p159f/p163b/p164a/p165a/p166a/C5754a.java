package p101d.p129g.p159f.p163b.p164a.p165a.p166a;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: d.g.f.b.a.a.a.a */
public final class C5754a {

    /* renamed from: a */
    private static final String f15904a = "d.g.f.b.a.a.a.a";

    /* renamed from: a */
    public static int m21755a(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f15904a, "No cameras!");
            return -1;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        return i < numberOfCameras ? i : z ? -1 : 0;
    }

    /* renamed from: b */
    public static Camera m21756b(int i) {
        int a = m21755a(i);
        if (a == -1) {
            return null;
        }
        return Camera.open(a);
    }
}
