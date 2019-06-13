package com.github.sandokandias.transformer;

public final class FakeTarget {

    //Fake for test purposes
    public static final String FAKE = "fake";
    public static final String FAKE_CLASS = "com.github.sandokandias.transformer.FakeTarget";
    public static final String FAKE_METHOD = "fake";

    public void fake(String param) {
        System.out.println("FakeTarget.fake method called with param: " + param);
    }
}
