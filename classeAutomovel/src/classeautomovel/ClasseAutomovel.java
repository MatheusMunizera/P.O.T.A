/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeautomovel;

import java.util.Scanner;

/**
 *
 * @author munizera
 */
public class ClasseAutomovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Automovel auto = new Automovel ("GP", "Polo", "GAY-2469", 2019);
        Scanner scan = new Scanner(System.in);
        System.out.println(auto.getAll());
        
        String novoProprietario;
        System.out.println("Digite o nome do novo proprietario: ");
        novoProprietario = scan.nextLine();
       
        auto.setNomeDoProprietario(novoProprietario);
        System.out.println(auto.getAll());
       
       
    }
    
}
