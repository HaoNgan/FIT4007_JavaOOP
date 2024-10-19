import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NhanVien {
    private String ten;

    public NhanVien(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public static void main(String[] args) {
        List<NhanVien> nhanVienList = new ArrayList<>();

        nhanVienList.add(new NhanVien("Nga"));
        nhanVienList.add(new NhanVien("Lan"));
        nhanVienList.add(new NhanVien("Ngoc"));

        Random rand = new Random();
        int index = rand.nextInt(nhanVienList.size());
        NhanVien nhanVienMayMan = nhanVienList.get(index);
        System.out.println("Nhan vien may man: " + nhanVienMayMan.getTen());
    }
}