public class NhanVien {
    private String tenNhanVien;
    private double heSoLuong;
    final double LUONG_CO_BAN = 750000;
    final double LUONG_MAX = 20000000;

    public double tinhLuong(double heSoLuong) {
        return LUONG_CO_BAN*heSoLuong;
    }

    public boolean tangLuong(double thuong){
        heSoLuong += thuong;
        if (tinhLuong(heSoLuong) < LUONG_MAX){
            return true;
        }else {
            heSoLuong -= thuong;
            return false;
        }
    }
}
