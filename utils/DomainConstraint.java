package utils;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DomainConstraint {
    String type();
    boolean mutable();
    boolean optional();
    int min() default 0;
    int length() default 0;
}