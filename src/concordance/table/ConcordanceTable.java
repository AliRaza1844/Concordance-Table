/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concordance.table;

public class ConcordanceTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Give the path of your txt file here...
        String path = "C:\\Users\\Ali_Raza\\Documents\\NetBeansProjects\\Concordance Table\\src\\concordance\\table\\names.txt";
        
        BinarySearchTree tree = new BinarySearchTree();  
        Nomenclator nomenclator = new Nomenclator(path, true);  
        while (nomenclator.hasNext())  
        {  
          tree.insert(nomenclator.nextNumber(), nomenclator.nextName());  
        }
        
        // Now displaying the concordance table...
        System.out.print("\n*************** The Concordance table is given as ***************\n");
        tree.traverse(); 
    
    }
}
