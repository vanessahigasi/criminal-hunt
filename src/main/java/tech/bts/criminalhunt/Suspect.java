package tech.bts.criminalhunt;

public class Suspect {


    private String name;
    private int age;
    private double height;
    private double weight;
    private String haircolor;
    private String eyecolor;
    private Boolean male;

    public Suspect(String name, int age, double height, double weight, String haircolor, String eyecolor, Boolean male) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.haircolor = haircolor;
        this.eyecolor = eyecolor;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public Boolean getMale() {
        return male;
    }

    public Boolean isMale() {
        return male;
    }

    @Override
    public boolean equals(Object obj) {
        Suspect other = (Suspect) obj;
        return super.equals(obj);
    }
}
