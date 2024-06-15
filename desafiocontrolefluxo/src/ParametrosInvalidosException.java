public class ParametrosInvalidosException extends RuntimeException{

    public ParametrosInvalidosException(){
        super("O primeiro parâmetro não pode ser maior que o segundo.");
    }

}
