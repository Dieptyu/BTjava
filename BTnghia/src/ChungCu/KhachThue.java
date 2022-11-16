package ChungCu;

import java.sql.Date;

public class KhachThue {
    private int id;
    private String hovaten;
    private Date ngaysinh;
    private String diachi;

    public KhachThue() {
        super();
    }

    public KhachThue(int id, String hovaten, Date ngaysinh, String diachi) {
        super();
        this.id = id;
        this.hovaten = hovaten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String gethovaten() {
        return hovaten;
    }

    public void sethovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public Date getngaysinh() {
        return ngaysinh;
    }

    public void setngaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getdiachi() {
        return diachi;
    }

    public void setdiachi(String diachi) {
        this.diachi = diachi;
    }


}