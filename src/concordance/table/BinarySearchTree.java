
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package concordance.table;

public class BinarySearchTree {
    private BSTNode root;
    
    public BinarySearchTree(){
        this.root = null;
    }
    
    public BinarySearchTree(BSTNode node){
        this.root = node;
    }
    
    /**
     * This function inserts an node in the tree...
     * @param number
     * @param name
     */
    public void insert(int number, String name){
        BSTNode node = new BSTNode(number,name);
        if(this.root == null){
            /* If the tree is null add the node to the root node*/
            this.root = node;
        }else{
            BSTNode rNode = this.root;
            BSTNode bNode = rNode;
            int compare = 0;
            /* Finding where to add the coming node*/
            while(rNode != null){
                bNode = rNode;
                compare = node.getName().trim().compareTo(bNode.getName().trim());
                if(compare == 0){
                    rNode.list.insertAtEnd(number);
                    return;
                }else if(compare > 0){
                    rNode = rNode.right;
                }else{
                    rNode = rNode.left;
                }
            }
            /* Adding the node...*/
            if(compare > 0){
                bNode.right = node;
            }else{
                bNode.left = node;
            }
        }
    }
    
    /**
     *
     */
    public void traverse(){
        this.postOrder(this.root);
    }
    
    /**
     * This is a recursive function for printing the whole tree...
     * @param root
     */
    public void postOrder(BSTNode root){
        if(root != null){
            if(root.left != null){
                this.postOrder(root.left);
            }
            
            root.print();
            System.out.print("\n");
            if(root.right != null){
                this.postOrder(root.right);
            }
        }
    }
}
    
    


