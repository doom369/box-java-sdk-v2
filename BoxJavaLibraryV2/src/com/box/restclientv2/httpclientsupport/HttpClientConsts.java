package com.box.restclientv2.httpclientsupport;

import java.nio.charset.Charset;

public class HttpClientConsts {

    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final Charset ASCII = Charset.forName("US-ASCII");
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /**
     * Private constructor to avoid instantiation of the class.
     */
    private HttpClientConsts() {
    }
}
