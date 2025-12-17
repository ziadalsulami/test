package RiyadhMetro.StationSearch;

public class BSTNode {
    private int key; //station id
    private StationInfo data;
    private BSTNode left;
    private BSTNode right;

    public BSTNode() {
        left = right = null;
    }

    public BSTNode(int key, StationInfo data) {
        this.key=key;
        this.data = data;
        this.left=left;
        this.right=right;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public StationInfo getData() {
        return data;
    }

    public void setData(StationInfo data) {
        this.data = data;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
    
    public boolean isLeaf() {
        return left==null && right==null;
    }

}
