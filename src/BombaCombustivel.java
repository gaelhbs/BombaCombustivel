public class BombaCombustivel {

    private final String idBomba;
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;
    private double valor;

    public BombaCombustivel(int idBomba, String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.idBomba = String.valueOf(idBomba);
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.valor = 0;
    }

    public String getIdBomba() {
        return idBomba;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public double abastecerPorLitro(double litros) {
        if (litros > this.quantidadeCombustivel) {
            System.out.println("Quantidade de combustível insuficiente.");
            return 0;
        }
        this.quantidadeCombustivel -= litros;
        return litros * this.valorLitro;
    }

    public double abastecerPorValor(double valorLitro) {
        double litros = valor / this.valorLitro;
        if (litros > this.quantidadeCombustivel) {
            System.out.println("Quantidade de combustível insuficiente.");
            return 0;
        }
        this.quantidadeCombustivel -= litros;
        return valorLitro;
    }



}
