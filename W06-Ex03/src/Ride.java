import java.util.Scanner;

public class Ride {
    protected String maSoChuyen,hoTenTaiXe,soXe;
    protected double doanhThu;
    Scanner in = new Scanner(System.in);

    public Ride () {
        this.maSoChuyen = "";
        this.hoTenTaiXe = "";
        this.soXe = "";
        this.doanhThu = 0;
    }

    public Ride(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public void nhap() {
        System.out.println("Nhap MaSo Chuyen: ");
        this.maSoChuyen = in.nextLine();
        System.out.println("Ho Ten Tai Xe: ");
        this.hoTenTaiXe = in.nextLine();
        System.out.println("So Xe: ");
        this.soXe = in.nextLine();
        System.out.println("Doanh Thu: ");
        this.doanhThu = in.nextDouble();
        in.nextLine();
    }

    public String toString() {
        return "ChuyenXe{" +
                "maSoChuyen='" + maSoChuyen + '\'' +
                ", hoTenTaiXe='" + hoTenTaiXe + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }
}
