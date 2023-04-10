public class NhanVienFullTime extends NhanVien{
    public int tienthuong;
    public int tienphat;
    public int luongcung;

    public NhanVienFullTime(int employee, String name, int age, int phone, String email, int tienthuong, int tienphat, int luongcung) {
        super(employee, name, age, phone, email);
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    public NhanVienFullTime(int tienthuong, int tienphat, int luongcung) {
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    public NhanVienFullTime() {
    }

    public int getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(int tienthuong) {
        this.tienthuong = tienthuong;
    }

    public int getTienphat() {
        return tienphat;
    }

    public void setTienphat(int tienphat) {
        this.tienphat = tienphat;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }

    @Override
    public int luongthuclinh(){
        return luongcung + (tienthuong - tienphat);
    }

    @Override
    public String toString() {
        return "Nhân viên Full Time" + "\t" +
                "Thưởng: " + tienthuong + "\t" +
                "Phạt: " + tienphat + "\t" +
                "Lương: " + luongcung + "\t" +
                "Ngườilaođộng " + employee + "\t" +
                "Tên: " + name + "\t" +
                "Tuổi: " + age + "\t" +
                "SĐT: " + phone +"\t" +
                "Email: " + email + "\t"
                ;
    }
}
