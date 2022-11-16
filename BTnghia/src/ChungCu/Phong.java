package ChungCu;

public class Phong {
    private String soPhong;
    private String loaiPhong;
    private float giaPhong;
    private int thoiGianThue;

    public Phong() {
        super();
    }

    public Phong(String soPhong, String loaiPhong, float giaPhong, int thoiGianThue) {
        super();
        this.soPhong = soPhong;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.thoiGianThue = thoiGianThue;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public float getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(float giaPhong) {
        this.giaPhong = giaPhong;
    }

    public int getThoiGianThue() {
        return thoiGianThue;
    }

    public void setThoiGianThue(int thoiGianThue) {
        this.thoiGianThue = thoiGianThue;
    }

}