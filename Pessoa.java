public class Pessoa implements IPessoa{
    
    @Override
    public String adicionar(){
        
        return "Adicionando pessoa";

    }

    @Override
    public String excluir(){

        return "Excluindo Pessoa";

    }

    @Override
    public String pesquisar(){

        return "Pesquisando pessoa";
        
    }

}
