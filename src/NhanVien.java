public abstract class NhanVien {
    public int employee;
    public String name;
    public int age;
    public int phone;
    public String email;

    public AddRess addRess;


    public NhanVien(int employee, String name, int age, int phone, String email, AddRess addRess) {
        this.employee = employee;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.addRess = addRess;
    }

    //    public NhanVien(int employee, String name, int age, int phone, String email) {
//        this.employee = employee;
//        this.name = name;
//        this.age = age;
//        this.phone = phone;
//        this.email = email;
//    }

    public abstract int luongthuclinh();

    public NhanVien() {
    }

    public NhanVien(int employee, String name, int age, int phone, String email) {
        this.employee = employee;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddRess getAddRess() {
        return addRess;
    }

    public void setAddRess(AddRess addRess) {
        this.addRess = addRess;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "employee=" + employee +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
