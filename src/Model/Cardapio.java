package Model;


public class Cardapio {
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
    }

    @Override
    public String toString() {
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

}
