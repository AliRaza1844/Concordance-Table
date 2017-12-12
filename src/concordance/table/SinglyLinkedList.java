/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concordance.table;

public class SinglyLinkedList {
    
    public SLNode start;
    public SLNode end ;
    public int size ;

    /*  Constructor  */
    public SinglyLinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }

    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }

    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }    

    /*  Function to insert an element at begining  */
    public void insertAtStart(int value)
    {

        SLNode nptr = new SLNode(value, null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            nptr.next = start;
            start = nptr;
        }
    }

    /*  Function to insert an element at end  */

    public void insertAtEnd(int value)
    {
        SLNode nptr = new SLNode(value,null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            if(value != end.getData()){
                end.next = nptr;
                end = nptr;
            }
        } 
    }

    /*  Function to display elements  */
    public void display()
    {
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    

        if (start.next == null) 
        {
            System.out.format("%05d", start.getData());
            return;
        }

        SLNode ptr = start;
        System.out.format("%05d    ", ptr.getData());
        ptr = start.next;

        while (ptr != null)
        {
            System.out.format("%05d    ", ptr.getData());
            ptr = ptr.next;
        }
    }
}