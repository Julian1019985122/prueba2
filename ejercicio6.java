import java.util.Random;

import javax.swing.JOptionPane;

public class ejercicio6 {
    public static void main(String arg[]){
        int i=1, min=1, max=50;
        int menor=0,mayor=0;
        while(i<=20){
            Random random=new Random();
            int azar=random.nextInt(max+min)+min;
            System.out.println(azar);
            if(i==1){
                menor=azar;
                mayor=azar;
            }
            if(azar>mayor){
                mayor=azar;
            }
            else if(azar<menor){
                menor=azar;
            }
            i=i+1;
        }
        JOptionPane.showMessageDialog(null, "el numero menor es "+menor);
    }
    
}

