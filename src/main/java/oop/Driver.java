package oop;

public abstract class Driver {
    private String name;
    private int experienceYears;
    private String licenseNumber;

//    public Driver(String name, int experienceYears, String licenseNumber) {
//        this.name = name;
//        this.experienceYears = experienceYears;
//        this.licenseNumber = licenseNumber;
//    }



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

    public void putCarKey() {
        System.out.println("Key put");
    }

    public void turnCarKey() {
        System.out.println("Key turned");
    }
}
