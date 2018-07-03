public class Person {
    private String name = "Sơn";
    private String address = "Hà Nội";

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [name " + getName() + ",address " + getAddress()+ "]";
    }
}
