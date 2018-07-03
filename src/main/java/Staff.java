public class Staff extends Person{
    private String school = "CG";
    private double pay = 2.5;

    public Staff() {

    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool() {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay() {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff [Person [name " + getName() + ", address " + getAddress() + "], school " + getSchool() + ", pay " + getPay() + "]";
    }
}
