package Thu;

import java.util.Iterator;

import PhongVIP.PhongLoai1;
import ChungCu.Phong;

public class ThuThuePhongVIP {
    public static void main(String[] args) {
        /* Test Insert */

		Phong Phong1 = new Phong("001", "Thuong", 1000000, 12);
		Phong Phong2 = new Phong("010", "VIP", 2000000, 10);

		PhongLoai1.getInstance().insert(Phong2);


		for (int i = 0; i < 1000; i++) {
			Phong Phong = new Phong("01"+i, "VIP: "+i, 2000000, 10);
			PhongLoai1.getInstance().insert(Phong);
		}


        /* Test update */
        Phong phong12 = new Phong("012", "VIP", 2000000, 10);
        PhongLoai1.getInstance().update(phong12);

        /* Test delete */
        for (int i = 0; i < 1000; i++) {
            Phong phong = new Phong("02"+i, "VIP: "+i, 2000000, 10);
            PhongLoai1.getInstance().delete(phong);
        }
    }
}