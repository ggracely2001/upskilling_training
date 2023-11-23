package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

 
public class StudentTest {
 
    @Test
    public void testStudentDetails() {
        // Create a new student
        Student student = new Student();
        student.setName("Gracely");
        student.setAge(22);
        student.setSalary(50000.00);
 
        // Test student details
        assertEquals("Gracely", student.getName());
        assertEquals(22, student.getAge());
        assertEquals(50000.00, student.getSalary());
    }
}