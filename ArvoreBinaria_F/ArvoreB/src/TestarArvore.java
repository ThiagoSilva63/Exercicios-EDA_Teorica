public class TestarArvore {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        tree.inserir(6);
        tree.inserir(4);
        tree.inserir(8);
        tree.inserir(3);
        tree.inserir(5);
        tree.inserir(7);
        tree.inserir(9);

        tree.delete(tree.root, 7);

        System.out.println("imprimir em ordem: ");
        tree.imprimirOrdem(tree.root);
    }
}
