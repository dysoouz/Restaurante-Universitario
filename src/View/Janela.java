package View;

import Model.Cardapio;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Janela extends JFrame implements ActionListener {

    private JButton btProx, btInserir, btCardapio, btSair, btApagar;
    private JTextArea  taCardapio;
    private JLabel lbDia, lbCardapio, lbBebida, lbSobremesa;
    private JPanel pnBotoes, pnDados, pnDia, pnTexArea, pnCardapio, pnBebidas, pnSobremesa, pnCaixa;
    private JCheckBox cbArroz, cbArrozInte, cbFeijao, cbFeijaoPreto, cbFarofa, cbSalada;
    private JCheckBox cbCarne, cbCarneSui, cbFrango, cbSCLaranja, cbSCAcerola, cbPudim;
    private Cardapio  builder;
    private String[] semana={"Segunda","Terça","Quarta","Quinta","Sexta"};
    private JComboBox<String> caixaSemana = new JComboBox<>(semana), caixaApagar= new JComboBox<>(semana);
    private String segunda, terca, quarta, quinta, sexta, diaSelecionado ;

    public Janela() throws IOException {
        //Instanciar os Botões
        btProx = new JButton(">>>");
        btInserir = new JButton("Inserir Cardapio");
        btCardapio = new JButton("Cardápio Semanal");
        btSair = new JButton("Sair");
        btApagar = new JButton("Apagar Cardápio");

        //Instanciar rótulos
        lbDia = new JLabel("Dia da Semana:");
        lbCardapio = new JLabel("Cardápio Diário:");
        lbBebida = new JLabel("Bebida:");
        lbSobremesa = new JLabel("Sobremesa");

        //Instanciar Campos de texto
        taCardapio = new JTextArea();

        //Instanciar CheckBox
        cbArroz = new JCheckBox(" Arroz");
        cbArrozInte = new JCheckBox(" Arroz Integral");
        cbFeijao = new JCheckBox(" Feijão");
        cbFeijaoPreto = new JCheckBox(" Feijão Preto");
        cbFarofa = new JCheckBox(" Farofa");
        cbSalada = new JCheckBox(" Salada");
         cbCarne = new JCheckBox(" Carne de  Panela");
         cbCarneSui = new JCheckBox(" Bisteca Suína");
         cbFrango = new JCheckBox(" Frango assado");
         cbSCLaranja = new JCheckBox(" Suco de Laraja");
         cbSCAcerola = new JCheckBox(" Suco de Acerola");
         cbPudim = new JCheckBox(" Pudim");


        //Instanciar Paineis
        Border borda = BorderFactory.createLineBorder(Color.BLACK, 2);
        pnDados = new JPanel();
        pnDados.setLayout(new GridLayout(1, 2));

        pnBotoes = new JPanel();
        pnBotoes.setLayout(new GridLayout(1, 5));

        pnDia = new JPanel();
        pnDia.setLayout(new GridLayout(6, 1));
        pnDia.setBackground(Color.GRAY);
        pnDia.setBorder(borda);

        pnTexArea = new JPanel();
        pnTexArea.setLayout(new BorderLayout());
        pnTexArea.setBackground(Color.GRAY);
        pnTexArea.setBorder(borda);

        pnCaixa = new JPanel();
        pnCaixa.setPreferredSize(new Dimension(350,50));

        pnCardapio = new JPanel();
        pnCardapio.setLayout(new GridLayout(3, 3));
        pnCardapio.setBackground(Color.GRAY);

        pnBebidas = new JPanel();
        pnBebidas.setLayout(new GridLayout(1, 2));
        pnBebidas.setBackground(Color.GRAY);

        pnSobremesa = new JPanel();
        pnSobremesa.setLayout(new GridLayout(1, 1));
        pnSobremesa.setBackground(Color.GRAY);

        //Adiciona os dados em geral nos Paineis

        pnBotoes.add(btProx);pnBotoes.add(btInserir);
        pnBotoes.add(btCardapio);pnBotoes.add(btSair);
        pnBotoes.add(btApagar);


        pnCardapio.add(cbArroz);pnCardapio.add(cbArrozInte);pnCardapio.add(cbFeijao);
        pnCardapio.add(cbFeijaoPreto);pnCardapio.add(cbFarofa);pnCardapio.add(cbSalada);
        pnCardapio.add(cbCarne);pnCardapio.add(cbCarneSui);pnCardapio.add(cbFrango);

        pnBebidas.add(cbSCLaranja);pnBebidas.add(cbSCAcerola);

        pnSobremesa.add(cbPudim);

        pnDia.add(lbCardapio);pnDia.add(pnCardapio);
        pnDia.add(lbBebida);pnDia.add(pnBebidas);
        pnDia.add(lbSobremesa);pnDia.add(pnSobremesa);

        pnDados.add(pnDia);pnDados.add(pnTexArea);

        pnCaixa.add(caixaSemana);

        pnTexArea.add(caixaSemana,BorderLayout.NORTH);
        pnTexArea.add(taCardapio,BorderLayout.CENTER);

        //Define o layout da Janela
        this.setLayout(new FlowLayout());
        this.add(pnBotoes);
        this.add(pnDados);


        //Evento dos Botões
        btProx.addActionListener(this);
        btInserir.addActionListener(this);
        btCardapio.addActionListener(this);
        btSair.addActionListener(this);
        btApagar.addActionListener(this);
        caixaSemana.addActionListener(this);

        this.setSize(800,600);
        this.setTitle("RESTAURANTE UNIVERSITÁRIO");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    //Avança para o proximo cardapio e apaga os campos de texto
    private void ProxCardapio(){
        taCardapio.setText("");
        limparCheckBox();
        diaSelecionado = (String) caixaSemana.getSelectedItem();
        switch (diaSelecionado){
            case "Segunda":
                caixaSemana.setSelectedIndex(1);
                break;
            case "Terça":
                caixaSemana.setSelectedIndex(2);
                break;
            case "Quarta":
                caixaSemana.setSelectedIndex(3);
                break;
            case "Quinta":
                caixaSemana.setSelectedIndex(4);
                break;
            default:
                break;
        }

    }

    //De acordo com o dia selecionado, mostra seu respectivo cardápio
    private void seleciaonaDia(){

        if (caixaSemana.getSelectedIndex() == 0) {
            taCardapio.setText(segunda);
        } else if (caixaSemana.getSelectedIndex() == 1) {
            taCardapio.setText(terca);
        } else if (caixaSemana.getSelectedIndex() == 2) {
            taCardapio.setText(quarta);
        } else if (caixaSemana.getSelectedIndex() == 3) {
            taCardapio.setText(quinta);
        } else if (caixaSemana.getSelectedIndex() == 4) {
            taCardapio.setText(sexta);
        }

    }

    //Salva o cardápio no dia respectivo
    private void InseriCardapio() {
        String tipoArroz = "";
        String tipoFeijao = "";
        String tipoCarne = "";
        String tipoSuco = "";
        String farofa = "";
        String sobremesa = "";
        String salada = "";

        if(cbArroz.isSelected() || cbArrozInte.isSelected()){
            if(cbArroz.isSelected()){
                tipoArroz = "\t- Arroz\n";
            } else if (cbArrozInte.isSelected()) {
                tipoArroz = "\t- Arroz Integral\n";
            }
        }

        if(cbFeijao.isSelected() || cbFeijaoPreto.isSelected()){
            if(cbFeijao.isSelected()){
                tipoFeijao = "\t- Feijão\n";
            } else if (cbArrozInte.isSelected()) {
                tipoFeijao = "\t- Feijão Preto\n";
            }
        }

        if(cbCarne.isSelected() || cbCarneSui.isSelected() || cbFrango.isSelected()){
            if(cbCarne.isSelected()){
                 tipoCarne = "\t- Carne de Panela\n";
            } else if (cbCarneSui.isSelected()) {
                 tipoCarne = "\t- Bisteca de Suína\n";
            } else if (cbFrango.isSelected()) {
                 tipoCarne = "\t- Frango Assado\n";
            }
        }

        if(cbSCLaranja.isSelected() || cbSCAcerola.isSelected()){
            if(cbSCLaranja.isSelected()){
                 tipoSuco = "\t- Suco de Laranja\n";
            } else if (cbSCAcerola.isSelected()) {
                 tipoSuco = "\t- Suco de Acerola\n";
            }
        }

        if(cbFarofa.isSelected()) farofa = "\t- Farofa\n";

        if(cbPudim.isSelected()) sobremesa = "\t- Pudim\n";

        if(cbSalada.isSelected()) salada = "\t- Salada\n";

        builder = new Cardapio.CardapioBuilder()
                .tipoArroz(tipoArroz)
                .tipoFeijao(tipoFeijao)
                .tipoCarne(tipoCarne)
                .farofa(farofa)
                .salada(salada)
                .tipoBebida(tipoSuco)
                .tipoSobremesa(sobremesa)
                .builder();

        if (caixaSemana.getSelectedIndex() == 0) {
            segunda = builder.toString();
            caixaSemana.setSelectedIndex(0);
        } else if (caixaSemana.getSelectedIndex() == 1) {
            terca = builder.toString();
            caixaSemana.setSelectedIndex(1);
        }else if (caixaSemana.getSelectedIndex() == 2) {
            quarta = builder.toString();
            caixaSemana.setSelectedIndex(2);
        }else if (caixaSemana.getSelectedIndex() == 3) {
            quinta = builder.toString();
            caixaSemana.setSelectedIndex(3);
        }else if (caixaSemana.getSelectedIndex() == 4) {
            sexta = builder.toString();
            caixaSemana.setSelectedIndex(4);
        }

    }

    //Apaga todos os cardápios ou apaga um cardápio selecionado
    private void ApagarCardapio(){
        String title = "Atenção";
        String message = "Deseja apagar o Cardápio inteiro?";
        int retry = JOptionPane.showConfirmDialog(null,message,getTitle(),JOptionPane.YES_NO_OPTION);
        if(retry==JOptionPane.YES_OPTION){
            segunda = "";
            terca = "";
            quarta = "";
            quinta = "";
            sexta = "";
            ProxCardapio();
        }else if (retry==JOptionPane.NO_OPTION){
            int i = caixaSemana.getSelectedIndex();
            JOptionPane.showMessageDialog(null,caixaApagar);
            if (caixaApagar.getSelectedIndex() == 0) {
                segunda = "";
                caixaSemana.setSelectedIndex(0);
            } else if (caixaApagar.getSelectedIndex() == 1) {
                terca = "";
                caixaSemana.setSelectedIndex(1);
            }else if (caixaApagar.getSelectedIndex() == 2) {
                quarta = "";
                caixaSemana.setSelectedIndex(2);
            }else if (caixaApagar.getSelectedIndex() == 3) {
                quinta = "";
                caixaSemana.setSelectedIndex(3);
            }else if (caixaApagar.getSelectedIndex() == 4) {
                sexta = "";
                caixaSemana.setSelectedIndex(4);
            }
        }
    }

    //Mostra os cardápios salvos
    private void CardapioSemanal(){
        String[] cardapios = {segunda, terca, quarta, quinta, sexta};

        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, cardapios[i], semana[i], 1);
        }
    }

    //Desmarca todos os CheckBox
    public void limparCheckBox(){
        cbArroz.setSelected(false);
        cbArrozInte.setSelected(false);
        cbFeijao.setSelected(false);
        cbFeijaoPreto.setSelected(false);
        cbCarne.setSelected(false);
        cbCarneSui.setSelected(false);
        cbFrango.setSelected(false);
        cbFarofa.setSelected(false);
        cbSalada.setSelected(false);
        cbSCLaranja.setSelected(false);
        cbSCAcerola.setSelected(false);
        cbPudim.setSelected(false);
    }

    //Encerra a Aplicação
    private void EncerrarApp(){
        String title = "Atenção";
        String message = "Deseja sair Realmente?";
        int retry = JOptionPane.showConfirmDialog(null,message,getTitle(),JOptionPane.YES_NO_OPTION);
        if(retry==0)System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btProx){
            ProxCardapio();
        }
        else if (e.getSource() == btInserir) {
            InseriCardapio();
        }

        else if (e.getSource() == btCardapio) {
            CardapioSemanal();
        }
        else if (e.getSource() == btSair) {
            EncerrarApp();
        }
        else if (e.getSource() == caixaSemana) {
            limparCheckBox();
            seleciaonaDia();
        }
        else if (e.getSource() == btApagar) {
            ApagarCardapio();
        }
    }
}
