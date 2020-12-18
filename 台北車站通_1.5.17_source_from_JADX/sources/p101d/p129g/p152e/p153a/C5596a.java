package p101d.p129g.p152e.p153a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: d.g.e.a.a */
public @interface C5596a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
