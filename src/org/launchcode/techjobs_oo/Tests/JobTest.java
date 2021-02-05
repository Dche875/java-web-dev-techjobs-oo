package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job = new Job();
    Job test_job2 = new Job();
    Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job test_job4 = new Job("Product tester", new Employer(null), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


    @Before
    public void createJobObject() {
    }

    @Test
    public void testSettingJobId() {
        assertEquals(test_job.getId() + 1, test_job2.getId());
//        assertFalse(test_job.getId() == (test_job2.getId()));
//        assertTrue(test_job.getId() < test_job2.getId());
//        assertTrue(test_job2.getId() < test_job3.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getcoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job test_job = new Job("Full Stack Engineer", new Employer("Splitwise"), new Location("Rhode Island"), new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));
        Job test_job2 = new Job("Full Stack Engineer", new Employer("Splitwise"), new Location("Rhode Island"), new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));
        assertFalse(test_job.equals(test_job2));
    }

    @Test
    public void testForToString() {
        assertEquals("ID: " + test_job3.getId() + "\n" +
                "Name: " + test_job3.getName() + "\n" +
                "Employer: " + test_job3.getEmployer() + "\n" +
                "Location: " + test_job3.getLocation() + "\n" +
                "Position Type: " + test_job3.getPositionType() + "\n" +
                "Core Competency: " + test_job3.getcoreCompetency(), test_job3.toString());

    }

    @Test
    public void testForToString2() {
        assertEquals("ID: " + test_job4.getId() + "\n" +
                "Name: " + test_job4.getName() + "\n" +
                "Employer: " + "Data not available" + "\n" +
                "Location: " + test_job4.getLocation() + "\n" +
                "Position Type: " + test_job4.getPositionType() + "\n" +
                "Core Competency: " + test_job4.getcoreCompetency(), test_job4.toString());
    }
}

























//        assertTrue(test_job.getName() instanceof String);
//        assertTrue(test_job.getEmployer() instanceof Employer);
//        assertTrue(test_job.getLocation() instanceof Location);
//        assertTrue(test_job.getPositionType() instanceof PositionType);
//        assertTrue(test_job.getcoreCompetency() instanceof CoreCompetency);