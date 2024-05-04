public class PrimeiroMetodo {
    public static void main(String[] args) {
        String primeiroNome = "Cesar";
        String segundoNome = "Santana";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do Metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
