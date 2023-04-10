public class NhanVienPartTime extends NhanVien{
    public int sogiolamviec;

    public NhanVienPartTime(int sogiolamviec) {
        this.sogiolamviec = sogiolamviec;
    }

    public NhanVienPartTime(int employee, String name, int age, int phone, String email, int sogiolamviec) {
        super(employee, name, age, phone, email);
        this.sogiolamviec = sogiolamviec;
    }

    public NhanVienPartTime() {
    }

    public int getSogiolamviec() {
        return sogiolamviec;
    }

    public void setSogiolamviec(int sogiolamviec) {
        this.sogiolamviec = sogiolamviec;
    }

    @Override
    public int luongthuclinh(){
        return sogiolamviec * 100000;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "sogiolamviec=" + sogiolamviec +
                ", employee=" + employee +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\''
                ;
    }
}
