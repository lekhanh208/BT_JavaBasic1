package JAVABASICBT1;

public class SinhVien {
    public int age = 23;
    public static String address = "Hồ Chí Minh";

    public static void main(String[] args) {
        String name = "Lê Thị Mỹ Khánh";
        System.out.println("Tên học viên: " + name);
        SinhVien sv = new SinhVien();
        System.out.println("Độ tuổi: " + sv.age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: "+ ThongTin.phone);
        System.out.println("Số năm kinh nghiệm: "+ ThongTin.year);
    }
}
