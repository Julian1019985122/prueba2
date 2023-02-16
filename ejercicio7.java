import javax.swing.JOptionPane;

public class ejercicio7 {
    public static void main(String arg[]){
        int num, res, suma=0;
        num=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero para determinar si es perfecto"));
        for(int divs=1; divs<num; divs++){
            res=num%divs;
            if(res==0){
                System.out.println(divs);
                suma=suma+divs;
            }
        }
        JOptionPane.showMessageDialog(null, "la suma de sus divisores es: "+suma);
        if(suma==num){
            JOptionPane.showMessageDialog(null, num+" es numero perfecto");
        }
        else{
            JOptionPane.showMessageDialog(null, num+" no es numero perfecto");
        }
    }
}
