import java.util.Random;

import javax.swing.JOptionPane;

public class ejercicio8 {
    public static void main(String arg[]){
        int res1, pusu=0, pma=0;
        String res2;
        res1=Integer.parseInt(JOptionPane.showInputDialog(null, "desea jugar piedra, papel o tijera?\n1. si\n2. no"));
        while(res1==1){
            String[] x = {"piedra", "papel", "tijera"};
            Random rand = new Random();
            int n = rand.nextInt(3);
            String z = x [n];
            System.out.println(z);
            res2=JOptionPane.showInputDialog("piedra, papel o tijera?");
            JOptionPane.showMessageDialog(null, "maquina: "+z);
            if(res2.equalsIgnoreCase(z)){
                JOptionPane.showMessageDialog(null,"empate, no hay puntos");
            }
            else if(res2.equalsIgnoreCase("tijera") && z=="papel"){
                JOptionPane.showMessageDialog(null,"usted gano, mas 1 punto");
                pusu=pusu+1;
            }
            else if(res2.equalsIgnoreCase("papel") && z=="piedra"){
                JOptionPane.showMessageDialog(null,"usted gano, mas 1 punto");
                pusu=pusu+1;
            }
            else if(res2.equalsIgnoreCase("piedra") && z=="tijera"){
                JOptionPane.showMessageDialog(null,"usted gano, mas 1 punto");
                pusu=pusu+1;
            }
            else if(res2.equalsIgnoreCase("tijera") && z=="piedra"){
                JOptionPane.showMessageDialog(null,"maquina gano, mas 1 punto");
                pma=pma+1;
            }
            else if(res2.equalsIgnoreCase("papel") && z=="tijera"){
                JOptionPane.showMessageDialog(null,"maquina gano, mas 1 punto");
                pma=pma+1;
            }
            else if(res2.equalsIgnoreCase("piedra") && z=="papel"){
                JOptionPane.showMessageDialog(null,"maquina gano, mas 1 punto");
                pma=pma+1;
            }
            res1=Integer.parseInt(JOptionPane.showInputDialog(null, "desea jugar piedra, papel o tijera?\n1. si\n2. no"));
        }
        JOptionPane.showMessageDialog(null, "puntos de usuario: "+pusu+"\npuntos de maquina: "+pma);
        if(pma<pusu){
            JOptionPane.showMessageDialog(null, "usted es el ganador!");
        }
        else if(pma>pusu){
            JOptionPane.showMessageDialog(null, "maquina es ganadora!");

        }
        else if(pma==pusu){
            JOptionPane.showMessageDialog(null, "empate!");
        }
    }
}
