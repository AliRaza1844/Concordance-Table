/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concordance.table;

public class SLNode {
    private int data;
    public SLNode next;
    
    /*  Constructor  */
    public SLNode()
    {
        this.next = null;
        this.data = 0;
    }    

    /*  Constructor  */
    public SLNode(int data,SLNode node)
    {
        this.data = data;
        this.next = node;
    }       

    /*  Function to set data to current Node  */
    public void setData(int data)
    {
        this.data = data;
    }        

    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
    
}
