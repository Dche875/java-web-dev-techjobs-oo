package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import org.launchcode.techjobs_oo.*;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste")); //Prints: "Data not available"
        Job job4 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency("")); // Prints: "OOPS! This job does not seem to exist."

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);

        for (Job job : jobs){
            System.out.println(job + "\n");
        }
    }
}

















//public class Main {
//    public static void main(String[] args) {
//        Job job1 = new Job("Software Developer", new Employer("Bayer"), new Location("Arizona"), new PositionType("IT"), new CoreCompetency(null));
//        Job job2 = new Job(null, new Employer(null), new Location(null), new PositionType(null), new CoreCompetency(null));
//        System.out.println(job1.toString() + "\n");
//        System.out.println(job2);
//    }
//}

//public class Main{
//    public static void main(String[] args) {
//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        System.out.println(job1.toString());
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//
//        System.out.println(test_job.getId());
//        System.out.println(test_job2.getId());
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Job test_job4 = new Job("Full Stack Engineer", new Employer("Splitwise"), new Location("Rhode Island"),new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));
//        Job test_job5 = new Job("Full Stack Engineer", new Employer("Splitwise"), new Location("Rhode Island"),new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));
//
//        System.out.println(test_job4.getId());
//        System.out.println(test_job4.getName());
//        System.out.println(test_job5.getId());
//        System.out.println(test_job5.getName());
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        System.out.println(job1.getEmployer());
//        System.out.println(job1.getEmployer().getValue();
//    }
//}

// returns ACME

//public class Main {
//    public static void main(String[] args) {
//        Employer o = new Employer();
//        System.out.println(o instanceof Employer);
//    }
// returns true

//    public static void main(String[] args) {
//        Job job1 = new Job();
//        Job job2 = new Job();
//
//        System.out.println(job1.getId());
//        System.out.println(job2.getId());
//    }
//returns 1 and 2

