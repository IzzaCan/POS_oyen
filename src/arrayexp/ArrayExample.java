package arrayexp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;


public class ArrayExample {
    public static void main(String[] args) {
//        for (int i = 0; i <=5; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        
        int[][][] I = {
            {
                {5, 15}
            },
            {
                {1, 10}
            }
        };
        
        
//        System.out.println(I[][][]); //10
//        for (int i = 0; i < I.length; i++) {
//            System.out.println(I[i]);
//        }


        

        //framework => List
//        List L = new ArrayList();
//        L.add("1");
//        L.add(1);
//        L.add(1.5);
//        L.add(new JButton("OK"));
//        for (Object obj : L) {
//            if(obj instanceof JButton){
//                JButton B = (JButton) obj;
//                System.out.println(B.getText());
//            }else {
//                System.out.println(obj);
//            }
//        }

        List Mhs = new ArrayList();
        Mahasiswa M = new Mahasiswa();
        M.setNim(20090001); 
        M.setNama("Bambang"); 
        M.setKelas("3B"); 
        M.setAngkatan(2020); 
        Mhs.add(M);
    }
}
