
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ngarciacarrillo
 */
public class Boletin4b_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    float km, litros = 50, vMedia;
    float pGas = 1.57f;
    //System.out.println("Introduce los km");
    //Scanner kmIntroducidos = new Scanner(System.in);
    
    //km = kmIntroducidos.nextFloat();
    km = Float.parseFloat(JOptionPane.showInputDialog("Introduce los km"));
   
    //System.out.println("Introduce el precio de la gasolina");
    //Scanner pGasIntroducidos = new Scanner(System.in);
    //pGas = pGasIntroducidos.nextFloat();
    
    //System.out.println("Introduce a velocidade Media");
    //Scanner vMediaIntrodu = new Scanner(System.in);
    //vMedia = vMediaIntrodu.nextFloat();
    vMedia = Float.parseFloat(JOptionPane.showInputDialog("Introduce la velocidad Media"));
   
    Consumo consumo1 = new Consumo(km, litros, pGas, vMedia);
    
    
    //System.out.println("O tempo empregado "+consumo1.gettempEmpre());
    JOptionPane.showMessageDialog(null,+consumo1.gettempEmpre(),"O tempo empregado é ",JOptionPane.INFORMATION_MESSAGE);
    //System.out.println("O consumo medio para 50 litros "+consumo1.getConsumoMedio());
    JOptionPane.showMessageDialog(null,+consumo1.getConsumoMedio(),"O consumo medio é ",JOptionPane.INFORMATION_MESSAGE);
    //System.out.println("El dinero gastado es "+consumo1.getEuros());
    JOptionPane.showMessageDialog(null,+consumo1.getEuros(),"Os euros gastados son ",JOptionPane.INFORMATION_MESSAGE);
    
     //System.out.println("Introduce los litros");
    //Scanner litrosIntroducidos = new Scanner(System.in);
    //litros = litrosIntroducidos.nextFloat();
   litros = Float.parseFloat(JOptionPane.showInputDialog("Introduce los litros consumidos"));
   consumo1.setLitros(litros);//cambiando el valor predefinido de 50 de litros
    //System.out.println("El consumo medio realizado consumiendo "+litros +"es "+consumo1.getConsumoMedio());
   JOptionPane.showMessageDialog(null,+consumo1.getConsumoMedio(),"O consumo medio realizado gastando "+litros + "es",JOptionPane.INFORMATION_MESSAGE);
    
    }
   
    
}
