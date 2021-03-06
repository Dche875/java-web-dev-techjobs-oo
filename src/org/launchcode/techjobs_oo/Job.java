package org.launchcode.techjobs_oo;

import javax.swing.text.Position;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // Constructors

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getcoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public String toString() {
        if (getName() == "" && getEmployer().getValue() == "" && getLocation().getValue() == "" && getPositionType().getValue() == "" && getcoreCompetency().getValue() == "") {
            return "OOPS! This job does not seem to exist.";
        }else if (getName() == "") {
            return "ID: " + id + "\n" + "Name: " + "Data not available" + "\n" + "Employer: " + employer + "\n" + "Location: " + location + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + coreCompetency;
        } else if (getEmployer().getValue() == "") {
            return "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + "Data not available" + "\n" + "Location: " + location + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + coreCompetency;
        } else if (getLocation().getValue() == "") {
            return "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer + "\n" + "Location: " + "Data not available" + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + coreCompetency;
        } else if (getPositionType().getValue() == "") {
            return "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer + "\n" + "Location: " + location + "\n" + "Position Type: " + "Data not available" + "\n" + "Core Competency: " + coreCompetency;
        } else if (getcoreCompetency().getValue() == "") {
            return "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer + "\n" + "Location: " + location + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + "Data not available";
        } else {
            return "ID: " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer + "\n" + "Location: " + location + "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + coreCompetency;
        }
    }
}

//} else if (getName() == null && getEmployer().getValue() == null && getLocation().getValue() == null && getPositionType().getValue() == null && getcoreCompetency().getValue() == null) {
//        return "OOPS! This job does not seem to exist.";