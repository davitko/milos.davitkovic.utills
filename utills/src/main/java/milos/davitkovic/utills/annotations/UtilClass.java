package milos.davitkovic.utills.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * UtilClass annotation
 * has runtime visibility, and we can apply it to types (classes).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Service
public @interface UtilClass {
    @AliasFor(
            annotation = Component.class
    )
    String value() default "";
}