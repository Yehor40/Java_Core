package org.others;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@SuppressWarnings("all")

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface CustomAnnotation {
String aut() default "Yegor40";
int date() default 2022;
String purp();
}
