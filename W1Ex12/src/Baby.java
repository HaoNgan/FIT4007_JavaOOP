public class Baby {
    //Properties
    public String name;
    private int age;
    float weight;
    float height;

    public Baby(String name) {
        this.name = name;
    }
    public Baby(float height) {
        this.height = height;
    }
    //Methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

