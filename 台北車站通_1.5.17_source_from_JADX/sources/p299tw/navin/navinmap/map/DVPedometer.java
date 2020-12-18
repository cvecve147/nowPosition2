package p299tw.navin.navinmap.map;

/* renamed from: tw.navin.navinmap.map.DVPedometer */
class DVPedometer {
    DVPedometer() {
        init();
    }

    private native void init();

    /* access modifiers changed from: package-private */
    public native float refreshFrequency(float[] fArr, int i);
}
