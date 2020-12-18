package p101d.p129g.p152e.p153a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: d.g.e.a.c */
public @interface C5598c {
    String[] alternate() default {};

    String value();
}
