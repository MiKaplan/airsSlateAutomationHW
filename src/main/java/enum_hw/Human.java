package enum_hw;

public enum Human {
    QA("Misha", 26, "black", false),
    AQA("Sasha", 28, "yellow", false),
    DEV("Serega", 27, "red", true);

    private String name;
    private Integer age;
    private String favoriteColor;
    private Boolean isVegan;

    Human(String name, Integer age, String favoriteColor, Boolean isVegan) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public Boolean getVegan() {
        return isVegan;
    }

    public String getVeganString() {
        if (this.getVegan()) {
            return "is vegan";
        }
        return "is not vegan";
    }

    public void printInfo() {
        switch (this) {
            case QA:
                System.out.println("Work position: QA"
                        + "\nName: " + QA.getName()
                        + "\nAge: " + QA.getAge()
                        + "\nFavorite Color: " + QA.getFavoriteColor()
                        + "\nVegan: " + QA.getVeganString()
                        + "\n");
                break;
            case AQA:
                System.out.println("Work position: AQA"
                        + "\nName: " + AQA.getName()
                        + "\nAge: " + AQA.getAge()
                        + "\nFavorite Color: " + AQA.getFavoriteColor()
                        + "\nVegan: " + AQA.getVeganString()
                        + "\n");
                break;
            case DEV:
                System.out.println("Work position: Developer"
                        + "\nName: " + DEV.getName()
                        + "\nAge: " + DEV.getAge()
                        + "\nFavorite Color: " + DEV.getFavoriteColor()
                        + "\nVegan: " + DEV.getVeganString()
                        + "\n");
                break;
        }
    }
}
