import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    //int employee, String name, int age, int phone, String email, int tienthuong, int tienphat, int luongcung
    public static void main(String[] args) {
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
        nhanViens.add(new NhanVienFullTime(1, "Quốc Vũ", 25, 99, "quocvu25@gmail.com", 5000000, 200000, 30000000));
        nhanViens.add(new NhanVienFullTime(2, "Tiến Anh", 22, 98, "tienanh22@gmail.com", 300000, 300000, 20000000));
        nhanViens.add(new NhanVienFullTime(3, "Hải Sơn", 30, 97, "haison30@gmail.com", 400000, 500000, 15000000));
        nhanViens.add(new NhanVienFullTime(4, "Dủa", 22, 96, "dua22@gmail.com", 800000, 600000, 12000000));
        nhanViens.add(new NhanVienFullTime(5, "Uyên", 22, 95, "uyen22@gmail.com", 800000, 400000, 14000000));
        nhanViens.add(new NhanVienPartTime(7, "Dũng", 26, 94, "vandung26@gmail.com", 100));
        nhanViens.add(new NhanVienPartTime(8, "Công", 29, 93, "cong26@gmail.com", 120));
        nhanViens.add(new NhanVienPartTime(9, "Tuấn", 26, 92, "tuan26@gmail.com", 80));
        int a = 0;
        int b = 0;
        int count = 0;
        int averrageSalary = 0;
        for (NhanVien p : nhanViens) {
            if (p instanceof NhanVienFullTime) {
                System.out.println("Tiền Lương của nhân viên FullTime: " + p.name);
                a += ((NhanVienFullTime) p).luongthuclinh();
                System.out.println(a);
            } else {
                System.out.println("Tiền lương của nhân viên PartTime: " + p.name);
                b += (((NhanVienPartTime) p).luongthuclinh());
                System.out.println(b);
            }
            count++;
        }
        for (NhanVien x : nhanViens) {
            if (x instanceof NhanVienPartTime) {
                System.out.println("Tiền lương của nhân viên PartTime: " + x.name);
                System.out.println(((NhanVienPartTime) x).luongthuclinh());
            }
        }
        System.out.println("Đây là tổng số lương của nhân viên cả cty: " + (a + b));
        averrageSalary = (a + b)/count;
        System.out.println("Lương trung bình của cả cty: " + averrageSalary);

//        System.out.println();
        for(NhanVien i : nhanViens){
            if(i instanceof NhanVienFullTime){
                if(averrageSalary > ((NhanVienFullTime) i).luongcung ){
                    System.out.println("Danhsáchnhânviên: có ML>LTB của CTY: " + i);
                }
            }
        }
        int sum = 0;
        sum += b;
        System.out.println("Đây là số lương phải trả cho nhân viên PartTime: " + sum);

      nhanViens.sort(Comparator.comparingInt(NhanVien::luongthuclinh));//sắp xếp lương của nhân viên
        for (NhanVien i : nhanViens) {
            System.out.printf( "%s ",i.luongthuclinh());

        }
    }
}//Viết phương thức liệt kê danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
//Viết phương thức tính số lương phải trả cho tất cả các nhân viên bán thời gian.
//Viết phương thức sắp xếp nhân viên toàn thời gian theo số lương tăng dần.