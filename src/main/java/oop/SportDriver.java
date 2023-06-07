package oop;

public class SportDriver implements Driver{

    private String name;
    private int experienceYears;
    private String licenseNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void putCarKey() {
        System.out.println("Sport Driver, Key put");
    }

    @Override
    public void turnCarKey() {
        System.out.println("Sport Driver, Key turned");
    }
}
