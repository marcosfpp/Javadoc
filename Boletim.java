package trabalhopp;

/**
 * Classe criada para simular um boletim para aprovacao
 *
 * @author Marcos Felipe Pessoa
 * @since 13/12/2022 at 20:33 
 */
public class Boletim {

    private String nome;
    private Double nota1, nota2, nota3, nota4, soma;

    Boletim(String nome, Double nota1, Double nota2, Double nota3, Double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    /**
     * Metodo criado para simular a media para verificar aprovacao
     *
     * @param nota1 - NOTA NUMERO UM
     * @param nota2 - NOTA NUMERO DOIS
     * @param nota3 - NOTA NUMERO TRES
     * @param nota4 - NOTA NUMERO QUATRO
     * @return RETORNO DO CALCULO DA MEDIA 
     * @throws ArithmeticException
     */
    public Double Media(Double nota1, Double nota2, Double nota3, Double nota4) throws ArithmeticException {

        try {
            return soma = (nota1 + nota2 + nota3 + nota4) / 4;
        } catch (ArithmeticException e) {
            return 0.00;
        }
    }

    /**
     * Metodo para validar a aprovacao
     *
     * @return A condiçao aprovado ou reprovado
     * @throws ArithmeticException
     */
    public String Aprovacao() {

        try {
            if (soma >= 60.00) {
                return "Parabens " + this.nome + " por pouco escapou!";

            } else {
                return ("Voce" + this.nome + " dessa vez não escapou! ");
            }
        } catch (ArithmeticException e) {

        }
        return "Esse foi o resultado final! ";

    }

}
