public class Principal {
    
    public static void main(String[] args) {

        Aluno a = new Aluno();

        a.adicionar();
        a.excluir();
        a.pesquisar();
        
        System.out.println(a.adicionar());
        System.out.println(a.excluir());
        System.out.println(a.pesquisar());

        Professor p = new Professor();

        p.adicionar();
        p.excluir();
        p.pesquisar();

        System.out.println(p.adicionar());
        System.out.println(p.excluir());
        System.out.println(p.pesquisar());
        
    }

}
