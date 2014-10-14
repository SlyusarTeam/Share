package com.example.vi34.test_project;

import junit.framework.TestCase;

public class LectureTest extends TestCase {

    public void testSum() throws Exception {
        Lecture lec = new Lecture();
        assertEquals(lec.sum(1,1),2);
    }
}