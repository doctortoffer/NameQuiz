package com.trifork.ckp.namequiz.model;

import android.graphics.Bitmap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;
    private Department department;

    @Mock
    private Bitmap image;

    @Before
    public void setUp() throws Exception {
        department = new Department(1, "Copenhagen");
        person = new Person(
                "John",
                "John Doe",
                department,
                image,
                Gender.MALE
        );
    }

    @Test
    public void testFirstName() throws Exception {
        assertEquals("John", person.firstName());
    }

    @Test
    public void testFullName() throws Exception {
        assertEquals("John Doe", person.fullName());
    }

    @Test
    public void testDepartment() throws Exception {
        assertEquals(department, person.department());
    }

    @Test
    public void testImage() throws Exception {
        assertEquals(image, person.image());
    }

    @Test
    public void testGender() throws Exception {
        assertEquals(Gender.MALE, person.gender());
    }
}