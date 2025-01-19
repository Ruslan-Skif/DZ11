
public class Autor {
    private String name;
    private String family;

    public Autor(String name, String family) {
        this.name = name;
        this.family = family;
    }

    @Override
    public String toString() {
        return name + " " + family;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }


}