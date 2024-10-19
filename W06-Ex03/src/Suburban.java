import java.util.Scanner;

public class Suburban extends Ride {
    private int soTuyen;
    private double soKmDiDuoc;
    Scanner in = new Scanner(System.in);

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }   

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public Scanner getIn() {
        return in;
    }

    public Suburban (String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen, double soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public void nhap() {
        super.nhap();
        System.out.println("So Tuyen: ");
        this.soTuyen = in.nextInt();
        System.out.println("So Km Di Duoc: ");
        this.soKmDiDuoc = in.nextDouble();
        in.nextLine();
    }

    public String toString() {
        return "ChuyenXeNgoaiThanh{" +
                "maSoChuyen='" + maSoChuyen + '\'' +
                ", hoTenTaiXe='" + hoTenTaiXe + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                ", soTuyen=" + soTuyen +
                ", soKmDiDuoc=" + soKmDiDuoc +
                '}';
    }
}
