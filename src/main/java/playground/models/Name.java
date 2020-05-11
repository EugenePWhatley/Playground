package playground.models;

public class Name {
    private String first;
    private String last;
    private Sex sex;

    public Name(String first, String last, Sex sex) {
        this.first = first;
        this.last = last;
        this.sex = sex;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public Sex getSex() {
        return sex;
    }
}