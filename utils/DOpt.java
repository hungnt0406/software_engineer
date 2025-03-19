package utils;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD) // Can only be used on methods
public @interface DOpt {
    OptType type(); // Requires an OptType value
}