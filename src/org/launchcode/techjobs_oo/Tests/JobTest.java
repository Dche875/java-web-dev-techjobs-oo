package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job;
    Job test_job2;
    Job test_job3;

    @Before
    public void createJobObject() {
        test_job = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(1, test_job.getId());
        assertEquals(2, test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getcoreCompetency().getValue());
    }

//    @Test
//    public void testJobsForEquality() {
//        Job test_job = new Job("Full Stack Engineer", new Employer("Splitwise"), new Location("Rhode Island"), new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));
//        Job test_job2 = new Job("Full Stack Engineer", new Employer("Splitwise"), new Location("Rhode Island"), new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));
//        assertFalse(test_job.equals(test_job2));
//    }

}

























//        assertTrue(test_job.getName() instanceof String);
//        assertTrue(test_job.getEmployer() instanceof Employer);
//        assertTrue(test_job.getLocation() instanceof Location);
//        assertTrue(test_job.getPositionType() instanceof PositionType);
//        assertTrue(test_job.getcoreCompetency() instanceof CoreCompetency);