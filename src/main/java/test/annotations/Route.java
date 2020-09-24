package test.annotations;

//import uk.org.eduserv.iam.restletcommons.annotations.Priority;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ TYPE })
@Qualifier
public @interface Route {

    String[] to();

    BaseRouter using();

//    Priority priority() default Priority.NORMAL;

    enum BaseRouter {
        APIV1, ROOT
    }

}
