/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Jordi Gisbert Ferriz
 */
public class TestData {
    public static void main(String[] args) {
        System.out.println("=== START - Prova de Constructors - START ===\n--- Cree un nou objecte utilitzant el constructor parametritzat int int int (16,1,2021) ---");
        Data op1 = new Data(16,1,2021);
        op1.mostrarEnFormatES();
        op1.mostrarEnFormatGB();
        op1.mostrarEnFormatText();
        System.out.println("La data és correcta: "+op1.isCorrecta());
        System.out.println("La data és festiu: "+op1.isFestiu());
        System.out.println("El dia de la setmana és: "+op1.getDiaSetmana());
        System.out.println("-------------------------------");
        
        System.out.println("\n--- Cree un nou objecte utilitzant el constructor String 16/1/2021 ---");
        Data op2 = new Data("16/1/2021");
        op2.mostrarEnFormatES();
        op2.mostrarEnFormatGB();
        op2.mostrarEnFormatText();
        System.out.println("La data és correcta: "+op2.isCorrecta());
        System.out.println("La data és festiu: "+op2.isFestiu());
        System.out.println("El dia de la setmana és: "+op2.getDiaSetmana());
        System.out.println("-------------------------------");
        
        System.out.println("\n--- Comprove mitjançant el mètode isIgual que les dates representades per tots dos objectes són iguals ---");
        System.out.println("La data creada amb els constructors anteriors són iguals: "+op1.isIgual(op2));
        System.out.println("-------------------------------");

        System.out.println("\n--- Cree un nou objecte utilitzant el constructor per defecte ---");
        Data op3 = new Data();
        op3.mostrarEnFormatES();
        op3.mostrarEnFormatGB();
        op3.mostrarEnFormatText();
        System.out.println("La data és correcta: "+op3.isCorrecta());
        System.out.println("La data és festiu: "+op3.isFestiu());
        System.out.println("El dia de la setmana és: "+op3.getDiaSetmana());
        System.out.println("-------------------------------");
        
        System.out.println("\n=== FI - Prova de Constructors - FI ===");
        System.out.println("\n=== START - Prova de Mètodes afegir/restar dies - START ====\n--- Endemà de la data inicial (16-1-2021) - (+1 dia) ---");
        op1.afegir(1).mostrarEnFormatES();
        op1.afegir(1).mostrarEnFormatGB();
        op1.afegir(1).mostrarEnFormatText();
        System.out.println("La data és correcta: "+op1.afegir(1).isCorrecta());
        System.out.println("La data és festiu: "+op1.afegir(1).isFestiu());
        System.out.println("El dia de la setmana és: "+op1.afegir(1).getDiaSetmana());
        System.out.println("-------------------------------");
        
        System.out.println("\n--- Dia anterior a la data inicial (16-1-2021) - (-1 dia) ---");
        op1.restar(1).mostrarEnFormatES();
        op1.restar(1).mostrarEnFormatGB();
        op1.restar(1).mostrarEnFormatText();
        System.out.println("La data és correcta: "+op1.restar(1).isCorrecta());
        System.out.println("La data és festiu: "+op1.restar(1).isFestiu());
        System.out.println("El dia de la setmana és: "+op1.restar(1).getDiaSetmana());
        System.out.println("-------------------------------");
        
        System.out.println("\n--- Data corresponent a restar 30 dies a la data inicial (16-1-2021) -(-30 dies) ---");
        op1.restar(30).mostrarEnFormatES();
        op1.restar(30).mostrarEnFormatGB();
        op1.restar(30).mostrarEnFormatText();
        System.out.println("La data és correcta: "+op1.restar(30).isCorrecta());
        System.out.println("La data és festiu: "+op1.restar(30).isFestiu());
        System.out.println("El dia de la setmana és: "+op1.restar(30).getDiaSetmana());
        System.out.println("-------------------------------");
        
        System.out.println("\n=== FI - Prova de Mètodes afegir/restar - FI ===\n=== START - Prova del mètode modificador - START ===");
        System.out.println("--- Modifique la data del primer objecte creat (16-1-2020) per la data 22-1-2021 ---");
        op1.set(22, 1, 2021);
        op1.mostrarEnFormatES();
        op1.mostrarEnFormatGB();
        op1.mostrarEnFormatText();
        System.out.println("La data és correcta: "+op1.isCorrecta());
        System.out.println("La data és festiu: "+op1.isFestiu());
        System.out.println("El dia de la setmana és: "+op1.getDiaSetmana());
        System.out.println("-------------------------------");
        
        System.out.println("\n=== FI - Prova del mètode modificador - FI ===");
        
    }
    
}
