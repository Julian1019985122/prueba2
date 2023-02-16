import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio1{
    public static void main (String arg []){
        int Num, max=50, min=0, conta=1;
        
        Random random=new Random();
        int azar=random.nextInt(max+min)+min;
        System.out.println(azar);
        Num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while(Num!=azar){
            if(Num>max||Num<min){
                JOptionPane.showMessageDialog(null,"Te saliste del intervalo");
                Num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            }
            else if(Num>azar){
            JOptionPane.showMessageDialog(null,"!Ups¡ Te pasaste");
            Num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            conta=conta+1;
        }
        else if(Num<azar){
            JOptionPane.showMessageDialog(null,"!Ups¡ estas por debajo");
            Num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            conta=conta+1;
        }
    }
    JOptionPane.showMessageDialog(null,"Lo lograste, usaste "+conta+" Intentos");
}
}