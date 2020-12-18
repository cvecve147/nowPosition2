package p101d.p122f.p123a.p126c;

/* renamed from: d.f.a.c.Z */
class C5375Z implements C5426ka {

    /* renamed from: a */
    private final int f15173a;

    public C5375Z(int i) {
        this.f15173a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo14806a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f15173a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
