package Streams;

public class Employee {
    private Integer id;
    private String name;
    private Integer experience;
    private String location;

    public Employee(Integer id, String name, Integer experience, String location) {
        this.id = id;
        this.name = name;

        this.experience = experience;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Streams.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", experience='" + experience + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

