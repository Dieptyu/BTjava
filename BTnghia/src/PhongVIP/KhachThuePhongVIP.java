package PhongVIP;

import java.util.ArrayList;

import ChungCu.KhachThue;

public class KhachThuePhongVIP implements PhongVip<KhachThue>{

    public static KhachThue getInstance() {
        return new KhachThue();
    }

    @Override
    public int insert(KhachThue t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(KhachThue t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(KhachThue t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ArrayList<KhachThue> selectAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public KhachThue selectById(KhachThue t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<KhachThue> selectByCondition(String condition) {
        // TODO Auto-generated method stub
        return null;
    }

}