class Bt {
    
    Node root;
    
     Bt(int rootValue, int... values) {
        this.root = new Node(rootValue);
        for (int value : values) {
            this.add(value);
        }
    }
    
    private void add(int value) {
        this.root = this.add(this.root, value);
    }
    
    private Node add(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        
        if (current.left == null) {
            current.left = add(current.left, value);
        } else if (current.right == null) {
            current.right = add(current.right, value);
        } else {
            current.left = add(current.left, value);
        }
        
        return current;
    }
}