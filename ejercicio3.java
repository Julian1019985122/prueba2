import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String arg[]){
        JOptionPane.showMessageDialog(null,"bienvenido! en esta aplicacion los estudiantes podran gestionar las notas de su materia");
        String nom,mat,res1="si";
        int not,porcen,porcen2,suma1=0,suma2=0;
        nom=JOptionPane.showInputDialog("nombre del estudiante");
        mat=JOptionPane.showInputDialog("nombre de la materia");
        
        while(res1.equalsIgnoreCase("si") && suma1<100){
            res1=JOptionPane.showInputDialog("hay notas por registrar?");
            not=Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota obtenida (de 0 a 50)"));
            if(not>50 || not<0){
                JOptionPane.showMessageDialog(null,"ingrese una nota correcta");
            }
            else {
                porcen=Integer.parseInt(JOptionPane.showInputDialog("ingrese el porcentaje de la nota (de 0 a 100)"));
                suma1=suma1+porcen;
                System.out.println("suma porcentajes correctos "+suma1);
                while(suma1>100){
                    suma1=suma1-porcen;
                    System.out.println("resta al porcentaje incorrecto "+suma1);
                    JOptionPane.showMessageDialog(null,"el porcentaje evaluado de una materia no puede ser mayor a 100");
                    porcen=Integer.parseInt(JOptionPane.showInputDialog("ingrese el porcentaje de la nota (de 0 a 100)"));
                    suma1=suma1+porcen;
                    System.out.println("correccion "+suma1);
                }
                porcen2=(not*porcen)/100;
                System.out.println(porcen2);
                suma2=suma2+porcen2;
                System.out.println("suma notas acumuladas "+suma2);
            }
        }
        
        if(suma2>=30){
            JOptionPane.showMessageDialog(null,"el estudiante "+nom+" curso la materia "+mat+" y obtuvo "+suma2+" resultando en APROBADO");
        }
        else{
            JOptionPane.showMessageDialog(null,"el estudiante "+nom+" curso la materia "+mat+" y obtuvo "+suma2+" resultando en REPROBADO");
        }
        
    }
    

}
