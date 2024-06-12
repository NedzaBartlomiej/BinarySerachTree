import java.util.List;
import java.util.ArrayList;





class Bst {
    private Node root;
    
    Bst() {
        root = null;
    }
    
    Bst(int rootValue) {
        this.root = new Node(rootValue);
    }

    Bst(int rootValue, int... values) {
        this.root = new Node(rootValue);
        for (int value : values) {
            add(value);
        }
    }
    
    
    // ADD
    public void add(int value) {
        this.root = add(this.root, value);
    }
    
    private Node add(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value == current.value) {
            return current;
        }
        if (value < current.value) {
            current.left = add(current.left, value);
        } else {
            current.right = add(current.right, value);
        }
        
        return current;
    }
    
    // PARSE
    public void ascParse() {
        System.out.println("Your BST ASC parse:");
        this.ascParse(this.root);
        System.out.println("====");
    }
    
    private void ascParse(Node current) {
        if (current == null) {
            return;
        }
        ascParse(current.left);
        System.out.println(current.value);
        ascParse(current.right);
        
    }
    
    public void descParse() {
        System.out.println("Your BST DESC parse:");
        this.descParse(this.root);
        System.out.println("====");
    }
    
    private void descParse(Node current) {
        if (current == null) {
            return;
        }
        descParse(current.right);
        System.out.println(current.value);
        descParse(current.left);
        
    }
    
    // SEARCH
    public boolean search(int value) {
        return this.search(this.root, value);
    }
    
    private boolean search(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (current.value == value) {
            return true;
        }
        
        if (value < current.value) {
            return search(current.left, value);
        } else {
            return search(current.right, value);
        }
    }
    
    // MIN MAX
    
    public Integer minValue() {
        return this.minValue(this.root);
    }
    
    private Integer minValue(Node current) {
        if (current == null) {
            return null;
        }
        if (current.left == null) {
            return current.value;
        } else {
            return minValue(current.left);
        }
    }
    
    public Integer maxValue() {
        return this.maxValue(this.root);
    }
    
    private Integer maxValue(Node current) {
         if (current == null) {
            return null;
        }
        if (current.right == null) {
            return current.value;
        } else {
            return maxValue(current.right);
        }
    }
    
    
    // CONVERT BT -> BST
    public static Bst convert(Bt bt) {
        List<Integer> btValues = new ArrayList<>();
        getBtValues(bt.root, btValues);
        Bst bst = new Bst();
        for (Integer btValue : btValues) {
            int intBtValue = btValue;
            bst.add(intBtValue);
        }
        return bst;
    }
    
    private static void getBtValues(Node current, List<Integer> btValues) {
        if (current == null) {
            return;
        }
        
        getBtValues(current.left, btValues);
        btValues.add(current.value);
        getBtValues(current.right, btValues);
    }
    
    
    // DELETE
    public void delete(int value) {
        this.root = this.delete(this.root, value);
    }
    
    private Node delete(Node current, int value) {
        if (current == null) {
            return null;
        }
        
        if (value < current.value) {
            current.left = delete(current.left, value);
        } else if (value > current.value) {
            current.right = delete(current.right, value);
        } else {
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }
            
            current.value = this.minValue(current.right);
            current.right = delete(current.right, current.value);
        }
        return current;
    }
}