package com.example.MobileStore;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MobileStoreApplicationTests extends TestCase {

    public MobileStoreApplicationTests(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(MobileStoreApplicationTests.class);
    }

    public void testApp() {
        assertTrue(true);
    }
}
