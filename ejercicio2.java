import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main(String arg[]){
        int cant,total1,ivad,total2;
        String res2,res1;
        res1=JOptionPane.showInputDialog("hay productos por cobrar?");
        int preciou,subtotal=0;
        while(res1.equalsIgnoreCase("si")){            
            preciou=Integer.parseInt(JOptionPane.showInputDialog("cual es el valor unitario del producto? (sin iva)"));
            cant=Integer.parseInt(JOptionPane.showInputDialog("cantidad del producto"));
            total1=preciou*cant;
            res2=JOptionPane.showInputDialog("el producto tiene iva? (si o no)");
            if(res2.equalsIgnoreCase("si")){
                ivad=(total1*19)/100;
                total2=total1+ivad;
                subtotal=subtotal+total2;
                System.out.println(total2);
                JOptionPane.showMessageDialog(null,"IVA incluido");
            }
            else if(res2.equalsIgnoreCase("no")){
                subtotal=subtotal+total1;
                JOptionPane.showMessageDialog(null,"PRODUCTO SIN IVA");
            }
            JOptionPane.showMessageDialog(null,"SUBTOTAL: $"+subtotal);
            res1=JOptionPane.showInputDialog("hay productos por cobrar?");
        }
        JOptionPane.showMessageDialog(null,"TOTAL A COBRAR: $"+subtotal);

    }
}
