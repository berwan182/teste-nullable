package br.com.teste;

import org.springframework.lang.NonNull;

import java.util.Collection;
import java.util.Objects;

public class Util {

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isNotNull(Object obj) {
        return !Util.isNull(obj);
    }

    public static boolean isEmpty(String str) {
        return Util.isNull(str) || str.isEmpty();
    }

    public static boolean isNotEmpty(String str) {
        return !Util.isEmpty(str);
    }

    public static boolean isEmpty(Collection collection) {
        return Util.isNull(collection) || collection.isEmpty();
    }

    @NonNull
    public static boolean isNotEmpty(Collection collection) {
        return Objects.nonNull(collection) && !Util.isEmpty(collection);
    }

}
