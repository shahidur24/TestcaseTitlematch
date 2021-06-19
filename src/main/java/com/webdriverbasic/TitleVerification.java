package com.webdriverbasic;

import com.exam.TestBase;

public class TitleVerification extends TestBase {
    public static void main(String[] args) {
        firefoxLaunch();
        testCase01();
        testCase02();
        testCase03();
        testCase04();
        closeBrowser();
    }

    public static void testCase02() {
        //step1
        openURL("http://apple.com");
        String expcted_title = "APPLE";
        String actual_title = driver.getTitle();
        if (!expcted_title.equals(actual_title)) {
            System.out.println("Title not Verified. Test Passed");
        } else {
            System.out.println("Test fail");
        }
    }

    public static void testCase01() {
        //step1
        openURL("http://apple.com");
        String expcted_title = "apple";
        String actual_title = driver.getTitle();
        if (!expcted_title.equals(actual_title)) {
            System.out.println("Title not Verified. Test Passed");
        } else {
            System.out.println(" Test fail");
        }
    }

    public static void testCase03() {
        //step1
        openURL("http://apple.com");
        String expcted_title = "Apple";
        String actual_title = driver.getTitle();
        if (expcted_title.equals(actual_title)) {
            System.out.println("Title Verified. Test Passed");
        } else {
            System.out.println("Test fail");
        }
    }

    public static void testCase04() {
        //step1
        openURL("http://apple.com");
        String expcted_title = "";
        String actual_title = driver.getTitle();
        if (!expcted_title.equals(actual_title)) {
            System.out.println("Title not Verified. Test Passed");
        } else {
            System.out.println("Test fail");
        }
    }
}
