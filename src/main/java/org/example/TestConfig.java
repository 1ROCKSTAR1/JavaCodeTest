package org.example;

public enum TestConfig {

    Uri("uri");

    public final String value;

    TestConfig(String value) {
        this.value = Configuration.getConfiguration().getProperty(value);

    }
}
