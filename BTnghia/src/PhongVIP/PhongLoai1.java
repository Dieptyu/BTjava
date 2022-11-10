package PhongVIP;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dataBase.JD;
import ChungCu.Phong;

public class PhongLoai1 implements PhongVip<Phong>{

    public static PhongLoai1 getInstance() {
        return new PhongLoai1();
    }

    @Override
    public int insert(Phong t) {
        int ketQua = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection con = JD.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = "INSERT INTO Phong (soPhong, loaiPhong, giaPhong, thoiGianthue) "+
                    " VALUES ('"+t.getSoPhong()+"' , '"+t.getLoaiPhong()+"' , "+ t.getGiaPhong()+" , '"+t.getThoiGianThue()+"')";

            ketQua = st.executeUpdate(sql);

            // Bước 4:
            System.out.println("Bạn đã thực thi: "+ sql);
            System.out.println("Có "+ ketQua+" dòng bị thay đổi!");

            // Bước 5:
            JD.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public int update(Phong t) {
        int ketQua = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection con = JD.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL

            String sql = "UPDATE Phong"+
                    " SET " +
                    " tendungcu='"+ t.getLoaiPhong()+"'"+
                    ", giadungcu="+ t.getGiaPhong()+
                    ", hansudung="+ t.getThoiGianThue()+
                    " WHERE id='"+t.getSoPhong()+"\'";
            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            // Bước 4:
            System.out.println("Bạn đã thực thi: "+ sql);
            System.out.println("Có "+ ketQua+" dòng bị thay đổi!");

            // Bước 5:
            JD.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public int delete(Phong t) {
        int ketQua = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection con = JD.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL

            String sql = "DELETE from Phong "+
                    " WHERE soPhong='"+t.getSoPhong()+"'";
            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            // Bước 4:
            System.out.println("Bạn đã thực thi: "+ sql);
            System.out.println("Có "+ ketQua+" dòng bị thay đổi!");

            // Bước 5:
            JD.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ketQua;
    }

    @Override
    public ArrayList<Phong> selectAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Phong selectById(Phong t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Phong> selectByCondition(String condition) {
        // TODO Auto-generated method stub
        return null;
    }

}
