package p101d.p129g.p159f;

import java.util.List;

/* renamed from: d.g.f.e */
public enum C5806e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(C5920p.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);
    

    /* renamed from: m */
    private final Class<?> f16083m;

    private C5806e(Class<?> cls) {
        this.f16083m = cls;
    }

    /* renamed from: a */
    public Class<?> mo15474a() {
        return this.f16083m;
    }
}
