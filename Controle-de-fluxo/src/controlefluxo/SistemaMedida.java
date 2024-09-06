package controlefluxo;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "A";

        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Nedio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
            System.out.println("Indefinido");
                
            }
    }
} 
