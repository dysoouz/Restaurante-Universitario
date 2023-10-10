package Model;


public class Cardapio {
<<<<<<< HEAD
    private String tipoArroz;
    private String tipoFeijao;
    private String farofa;
    private String tipoCarne;
    private String salada;
    private String tipoBebida;
    private String tipoSobremesa;

    public Cardapio(String tipoArroz, String tipoFeijao, String farofa, String tipoCarne,String salada, String tipoBebida, String tipoSobremesa) {

        this.tipoArroz = tipoArroz;
        this.tipoFeijao = tipoFeijao;
        this.farofa = farofa;
        this.tipoCarne = tipoCarne;
        this.salada = salada;
        this.tipoBebida = tipoBebida;
        this.tipoSobremesa = tipoSobremesa;
=======
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
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Cardápio:\n" +
                tipoArroz +
                tipoFeijao +
                farofa +
                tipoCarne +
                salada +
                "\nBebida:\n" +
                tipoBebida +
                "\nSobremesa:\n" +
                tipoSobremesa;
    }

    //Padrão Builder
    public static class CardapioBuilder{
        private String tipoArroz;
        private String tipoFeijao;
        private String farofa;
        private String tipoCarne;
        private String salada;
        private String tipoBebida;
        private String tipoSobremesa;


        public CardapioBuilder tipoArroz(String tipoArroz){
            this.tipoArroz = tipoArroz;
            return this;
        }
        public CardapioBuilder tipoFeijao(String tipoFeijao){
            this.tipoFeijao = tipoFeijao;
            return this;
        }
        public CardapioBuilder tipoCarne(String tipoCarne){
            this.tipoCarne = tipoCarne;
            return this;
        }
        public CardapioBuilder salada(String salada){
            this.salada = salada;
            return this;
        }
        public CardapioBuilder farofa(String farofa){
            this.farofa = farofa;
            return this;
        }
        public CardapioBuilder tipoBebida(String tipoBebida){
            this.tipoBebida = tipoBebida;
            return this;
        }
        public CardapioBuilder tipoSobremesa(String tipoSobremesa){
            this.tipoSobremesa = tipoSobremesa;
            return this;
        }

        public Cardapio builder(){
            return new Cardapio( tipoArroz, tipoFeijao,
                                    tipoCarne, farofa,salada, tipoBebida, tipoSobremesa);
        }
    }

=======
        return "Cardapio\n" + diaCardapio + "\n\nBebida:\n" + diaBebida + "\n\nSobremesa:\n" + diaSobremesa ;
    }
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775
}
