package p101d.p129g.p130a;

/* renamed from: d.g.a.a */
public enum C5457a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    

    /* renamed from: f */
    private final String f15362f;

    private C5457a(String str) {
        this.f15362f = str;
    }

    public final String toString() {
        return this.f15362f;
    }
}
