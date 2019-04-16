public class Genus {
    private String name;
    public Genus(String name) {
        this.name = name;
    }
    public void setGenusName(String s) {
        this.name = s;
    }
    public String getGenusName() {
        return this.name;
    }
    public String toString() {
        return "The genus of this is " + this.name + ".";
    }
}
//Construct code for the Genus object including a constructor, accessor methods and a
//toString() method. [3]