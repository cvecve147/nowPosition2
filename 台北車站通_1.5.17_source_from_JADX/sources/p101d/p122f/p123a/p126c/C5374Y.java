package p101d.p122f.p123a.p126c;

/* renamed from: d.f.a.c.Y */
class C5374Y implements C5426ka {

    /* renamed from: a */
    private final int f15170a;

    /* renamed from: b */
    private final C5426ka[] f15171b;

    /* renamed from: c */
    private final C5375Z f15172c;

    public C5374Y(int i, C5426ka... kaVarArr) {
        this.f15170a = i;
        this.f15171b = kaVarArr;
        this.f15172c = new C5375Z(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo14806a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f15170a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C5426ka kaVar : this.f15171b) {
            if (stackTraceElementArr2.length <= this.f15170a) {
                break;
            }
            stackTraceElementArr2 = kaVar.mo14806a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f15170a ? this.f15172c.mo14806a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
