package com.testcases;

import com.exam.TestBase;

public class TestCase001 extends TestBase {
    public static void main(String[] args) {
        firefoxLaunch();
        openURL("https://bbc.com");
        closeBrowser();
    }
}
