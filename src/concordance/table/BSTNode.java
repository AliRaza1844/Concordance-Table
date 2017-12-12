/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concordance.table;

public class BSTNode {
    private String name;
    public SinglyLinkedList list;
    public BSTNode left;
    public BSTNode right;
    
    /**
     *
     */
    public BSTNode(){
       this.name = null;
       this.list = new SinglyLinkedList();
       this.left = null;
       this.right = null;
    }
    
    /**
     *
     * @param number
     * @param name
     */
    public BSTNode(int number, String name){
        this.name = name;
        this.list = new SinglyLinkedList();
        this.list.insertAtEnd(number);
        this.left = null;
        this.right = null;
    }
    
    /**
     *
     * @return
     */
    public String getName(){
        return this.name;
    }
    
    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     *
     */
    public void print(){
        System.out.print(this.name + "            ");
        this.list.display();
    }
}
