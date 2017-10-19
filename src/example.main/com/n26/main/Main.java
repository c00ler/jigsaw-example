package com.n26.main;

import com.n26.text.StringUtils;

import java.lang.reflect.Method;
import java.sql.Timestamp;

import static java.lang.System.out;

public class Main {

    public static void main(String... args) throws Exception {
        StringUtils utils = new StringUtils();
        out.println(utils.reverse("bank"));

        Method secret = StringUtils.class.getDeclaredMethod("getPassword");
        secret.setAccessible(true);
        out.println("Password: " + secret.invoke(utils));

        final Timestamp now = utils.now();
        out.println("Now: " + now);
    }

}
