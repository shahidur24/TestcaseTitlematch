package com.testcases;

import com.exam.TestBase;

public class TestCase002 extends TestBase {
    public static void main(String[] args) {
        firefoxLaunch();
        openURL("https://cnn.com");
        closeBrowser();
    }
}
