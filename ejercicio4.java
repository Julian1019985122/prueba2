import javax.swing.JOptionPane;

public class ejercicio4 {
    public static void main(String arg[]){
        int num,res,novo=0;
        num=Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero para invertirlo"));
        while(num!=0){
            res=num%10;
            System.out.println("residuo "+res);
            novo=novo+res;
            System.out.println("suma residuo "+novo);
            novo=novo*10;
            System.out.println("num invertido "+novo);
            num=num/10;
            System.out.println("division "+num);
        }
        novo=novo/10;
        JOptionPane.showMessageDialog(null, ""+novo);
    }
}


