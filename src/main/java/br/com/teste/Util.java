package br.com.teste;

import java.util.Collection;

public class Util {

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isNotNull(Object obj) {
        return !Util.isNull(obj);
    }

    public static boolean isEmpty(String str) {
        return isNull(str) || str.isEmpty();
    }

    public static boolean isNotEmpty(String str) {
        return !Util.isEmpty(str);
    }

    public static boolean isEmpty(Collection collection) {
        return isNull(collection) || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection collection) {
        return !Util.isEmpty(collection);
    }

}
