public class Pessoa implements IPessoa{
    
    @Override
    public void adicionar(boolean adicionar){
        
        this.adicionar = adicionar;

    }

    @Override
    public boolean excluir(){
        return true;
    }

    @Override
    public String pesquisar(){

        if(adicionar() == true){
            System.out.println("Adicionado com sucesso");
        }

        return "Pesquisa concluida";
    }

}
