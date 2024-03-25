package ch.hslu.oop.S05.A1_3;

public abstract class AbstractNamed {

    private String name;

    AbstractNamed() {
        name = this.getClass().getSimpleName();
        System.out.println("AbstractNamed constructor called " + name);
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

}
