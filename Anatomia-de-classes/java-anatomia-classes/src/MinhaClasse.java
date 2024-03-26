//Trabalhando com métodos

public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Daniel";

        String segundoNome = "Valadão" ;

        String nomeCompleto = nomeCompleto (primeiroNome , segundoNome) ;

        System.out.print(nomeCompleto);


    }
    public static String nomeCompleto (String primeiroNome , String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
