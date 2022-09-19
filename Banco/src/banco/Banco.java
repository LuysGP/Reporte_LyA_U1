package banco;
import javax.swing.JOptionPane;

public class Banco {

    private long numero;
    private String titular;
    private float saldo;
    private float interesAnual;
        
    public Banco(long aNumero, String aTitular, float aInteresAnual) {
        numero = aNumero;
        titular = aTitular;
        saldo = 0;
        interesAnual = aInteresAnual;
        
    }
    public void ingreso (float cantidad) {
        saldo += cantidad;
    }
    
    public void reintegro (float cantidad) {
        saldo -= cantidad;
    }
    
    public void ingresoInteresAnual () {
        saldo += interesAnual * saldo / 1200;
    }
    
    public boolean enRojos() {return saldo < 0;}
    public float leerSaldo() {return saldo;}
    
    public static void main(String[] args) {
        
        String opcion = "";
        String menus = "";
        String[] menu = {"Ingresar dinero", "Retirar dinero", "Saldo de la cuenta", "Calcular Interes Anual","Salir del Menu"};
        int sizeMenu = menu.length;
        int opcMenu;

        
        for (int i = 0; i < menu.length; i++) {
            menus+= (i+1) + ".\t " + menu[i] + "\n";
        }
        
        String cuenta = JOptionPane.showInputDialog("\tBANCO\nIngrese su numero de cuenta");
        String Titular   = JOptionPane.showInputDialog("Ingrese numero de titular");
        String interesAnual = JOptionPane.showInputDialog("Ingrese el interes anual");
        
        int numCuenta = Integer.parseInt(cuenta);
        float InteresAnual = Float.parseFloat(interesAnual);
        
        //Se crea el usuario
        Banco cuentaUser = new Banco(numCuenta, Titular, InteresAnual);
        
        opcion = JOptionPane.showInputDialog(menus);
        opcMenu = Integer.parseInt(opcion);
        
        while(opcMenu != sizeMenu){
           
            switch(opcMenu) {
                case 1: //Ingresar dinero
                        String dineroIn = JOptionPane.showInputDialog("Digite el dinero a ingresar a su cuenta");
                        float dineroIngresa = Float.parseFloat(dineroIn);
                        cuentaUser.ingreso(dineroIngresa);
                    break;
                case 2: //Reitrar dinero
                        String dineroOut = JOptionPane.showInputDialog("Digite el dinero a retirar a su cuenta");
                        float dineroRetira = Float.parseFloat(dineroOut);
                        cuentaUser.reintegro(dineroRetira);
                        JOptionPane.showMessageDialog(null, "Dinero restante en cuenta: " + cuentaUser.leerSaldo());
                    break;
                case 3:
                    if(cuentaUser.enRojos()){
                        JOptionPane.showMessageDialog(null, "El saldo de su cuenta es negativo, cantidad de: " + cuentaUser.leerSaldo());
                    } else {
                        JOptionPane.showMessageDialog(null, "El saldo de su cuenta es: " + cuentaUser.leerSaldo());
                    }
                    break;
                case 4:
                        cuentaUser.ingresoInteresAnual();
                        JOptionPane.showMessageDialog(null, "El saldo de su cuenta con el interes anual es de: " + cuentaUser.leerSaldo());
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Favor de elegir una opcion del menu", "Reingreso de opcion", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
            
            opcion = JOptionPane.showInputDialog(menus);
            opcMenu = Integer.parseInt(opcion);
            
        }   
    }    
}
