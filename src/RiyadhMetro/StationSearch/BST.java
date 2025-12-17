package RiyadhMetro.StationSearch;

public class BST {
    private BSTNode root;

    public BST(){
        root= null;

    }

    public StationInfo search(int key) {
        BSTNode info = searchTree(key,root);
        if(info==null) return null;
        else return info.getData();
    }

    private BSTNode searchTree(int key,BSTNode root)  {
        if(root==null) return null;

        else if(key< root.getKey()) {
            return searchTree(key,root.getLeft());
        } else if(key==root.getKey()) return root;
        else return searchTree(key,root.getRight());

    }

    public void insert(int key, StationInfo data) {

        BSTNode parent = null;
        BSTNode trav = root;
        while(trav!=null) {
            parent=trav;
            if(key<trav.getKey()) {
                trav=trav.getLeft();
            } else trav=trav.getRight();
        }
        BSTNode newNode = new BSTNode(key, data);
        if(root==null) root=newNode;
        else if(key<parent.getKey()) parent.setLeft(newNode);
        else parent.setRight(newNode);
    }

    public StationInfo delete(int key) {
        BSTNode parent=null;
        BSTNode trav=root;
        while(trav!=null && trav.getKey()!=key) {
            parent = trav;
            if(trav.getKey()>key) {
                trav=trav.getLeft();
            } else trav=trav.getRight(); //wouldnt trav get to null?
        }
        if(trav==null) return null;
        else {
            StationInfo data = trav.getData();
            deleteNode(trav,parent);
            return data;
        }

    }
    private void deleteNode(BSTNode toDelete, BSTNode parent) {
       if(toDelete.getLeft()!=null && toDelete.getRight()!=null) { //case 3
        BSTNode replaceParent = toDelete; //important PARENT
        BSTNode replace = replaceParent.getRight(); //right subtree
        while(replace.getLeft()!=null) { //leftmost rstree
            replaceParent=replace;
            replace = replace.getLeft();
        }

        toDelete.setKey(replace.getKey());
        toDelete.setData(replace.getData());
        deleteNode(replace, replaceParent);
       }
       else {
        BSTNode toDeleteChild;
        if(toDelete.getLeft()!=null) toDeleteChild = toDelete.getLeft();
        else toDeleteChild=toDelete.getRight();

        if(toDelete==root) root=toDeleteChild;

        else if(parent.getKey()>toDeleteChild.getKey()) parent.setLeft(toDeleteChild);
        else parent.setRight(toDeleteChild);
       }
    }

    public void display() {
        inOrder(root);
    }

    public void inOrder(BSTNode n) {
        if (n==null) return;
        inOrder(n.getLeft());
        System.out.print(" "+n.getData());
        inOrder(n.getRight());
    }

    public StationInfo min() {
        BSTNode min = null;
        BSTNode trav = root;
        while(trav!=null) {
            min =trav;
            trav=trav.getLeft();
        }
        return min.getData();
    }

    public void findRange( int min, int max) {
        System.out.println("----STATIONS BETWEEN "+ min + " AND "+max+" -----");
        range(root, min, max);
    }
    private void range(BSTNode n, int min, int max) { 
        if(root.getKey()>min) {
            range(root.getLeft(), min, max);
        }
        if(root.getKey()>=min && root.getKey()<=max) {
            System.out.print(" "+root.getData()+" ");
        }
        if(root.getKey()<max) {
            range(root.getRight(), min, max);
        }

    }





}
