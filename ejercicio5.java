import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio5 {
    public static void main(String arg[]){
        int in, fin;
        in= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero inicial"));
        fin= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero final"));
        for(;in<=fin;in++){
            int acum=0;
            for(int i=1;i<=in;i++){
                if(in%i==0){
                    acum++;
                }
            }
            if(acum==2){
                JOptionPane.showMessageDialog(null, in);
            }
        }
    }
}
