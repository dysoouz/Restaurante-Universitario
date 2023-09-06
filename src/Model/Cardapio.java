package Model;


public class Cardapio {
    //atributos
    private String diaCardapio="", diaBebida="", diaSobremesa="";


    public Cardapio() {}

    public Cardapio(String diaCardapio, String diaBebida, String diaSobremesa){
        this.diaBebida=diaBebida;
        this.diaSobremesa=diaSobremesa;
        this.diaCardapio=diaCardapio;
    }

    public String getDiaCardapio() {
        return diaCardapio;
    }

    public void setDiaCardapio(String diaCardapio) {
        this.diaCardapio = diaCardapio;
    }

    public String getDiaBebida() {
        return diaBebida;
    }

    public void setDiaBebida(String diaBebida) {
        this.diaBebida = diaBebida;
    }

    public String getDiaSobremesa() {
        return diaSobremesa;
    }

    public void setDiaSobremesa(String diaSobremesa) {
        this.diaSobremesa = diaSobremesa;
    }

    @Override
    public String toString() {
        return "Cardapio\n" + diaCardapio + "\n\nBebida:\n" + diaBebida + "\n\nSobremesa:\n" + diaSobremesa ;
    }
}
