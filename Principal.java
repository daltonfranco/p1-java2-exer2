public class Principal {
    
    public static void main(String[] args) {
        
        Aluno a = new Aluno();

        a.setNome("Dalton");
        a.setRa("123123123123");
        a.setSala("Segundo ano");
        a.adicionar();

        System.out.println(a.getNome());
        System.out.println(a.getRa());
        System.out.println(a.getSala());
        System.out.println(a.pesquisar());
    }

}
