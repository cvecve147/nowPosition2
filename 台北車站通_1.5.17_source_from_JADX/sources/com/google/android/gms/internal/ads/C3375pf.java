package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.pf */
public final class C3375pf {

    /* renamed from: a */
    private static Map<String, List<Map<String, Object>>> f9993a = new HashMap();

    /* renamed from: b */
    private static List<MediaCodecInfo> f9994b;

    /* renamed from: c */
    private static final Object f9995c = new Object();

    @TargetApi(16)
    /* renamed from: a */
    public static List<Map<String, Object>> m13335a(String str) {
        List<MediaCodecInfo> emptyList;
        synchronized (f9995c) {
            if (f9993a.containsKey(str)) {
                List<Map<String, Object>> list = f9993a.get(str);
                return list;
            }
            try {
                synchronized (f9995c) {
                    if (f9994b == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            emptyList = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (Build.VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f9994b = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                f9994b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            emptyList = Collections.emptyList();
                        }
                        f9994b = emptyList;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo next : f9994b) {
                    if (!next.isEncoder() && Arrays.asList(next.getSupportedTypes()).contains(str)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("codecName", next.getName());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = next.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", m13336a(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", m13336a(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", m13336a(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", m13336a(videoCapabilities.getSupportedHeights()));
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                f9993a.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f9993a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    private static Integer[] m13336a(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}
