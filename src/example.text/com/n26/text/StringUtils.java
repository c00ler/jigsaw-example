package com.n26.text;

import java.sql.Timestamp;
import java.time.Instant;

public class StringUtils {

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public Timestamp now() {
        return new Timestamp(Instant.now().toEpochMilli());
    }

    private String getPassword() {
        return "42";
    }

}
