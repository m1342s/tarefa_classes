/**
 * @author matheus.viersa
 */
public class Carro {

    private String marca;
    private String modelo;
    private String cor;

    /**
     *Método que especifica a marca de um dado carro
     *
     * @return retorna a marca de um carro em questão
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
