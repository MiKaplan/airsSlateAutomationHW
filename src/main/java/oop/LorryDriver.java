package oop;

public class LorryDriver extends Driver{

    private int experienceYears = 10;

    @Override
    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
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
