public class BinaryTree{
    public Node root;
    
    //Metodo para inserir
    public void inserir(int data){
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent = null;
        while (true) {
            parent = current;
            if (data < current.valor) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                    }
                }
             }
        }
    }

    //Metodo para encontrar o menor valor na subarvore
    Node minValor(Node node){
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    //Metodo para deletar
    public Node delete(Node root, int valor) {
        if (root == null) {
            return root;
        } else if (valor < root.valor) {
            root.left = delete(root.left, valor);
        } else if (valor > root.valor) {
            root.right = delete(root.right, valor);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node temp = minValor(root.right);
                root.valor = temp.valor;
                root.right = delete(root.right, temp.valor);
            }
        }
        return root;
    }

    //Metodo para imprimir arvore em ordem
    public void imprimirOrdem(Node node) {
        if (node == null) {
            return;
        }
        imprimirOrdem(node.left);
        System.out.print(node.valor + " ");
        imprimirOrdem(node.right);
    }
}
