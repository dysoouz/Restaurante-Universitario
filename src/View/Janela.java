package View;

import Model.Cardapio;

<<<<<<< HEAD
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

=======
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Janela extends JFrame implements ActionListener {
    //Atributos
    private JButton btProx, btInserir, btCardapio, btSair, btApagar;
    private JTextField  tfCardapio, tfBebida, tfSobremesa;
    private JLabel lbDia, lbCardapio, lbBebida, lbSobremesa;
    private JPanel pnBotoes, pnDia, pnCardapio;
    private Cardapio cardapio, segunda, terca, quarta, quinta, sexta;
    private List<Cardapio> cardapios = new ArrayList<>(5);
    private String[] semana={"Segunda","Terça","Quarta","Quinta","Sexta"};
    private JComboBox<String> caixaSemana = new JComboBox<>(semana), caixaApagar= new JComboBox<>(semana);
    private String diaSelecionado ;
    private int i;



    //Métodos
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775
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
<<<<<<< HEAD
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

=======
        tfCardapio = new JTextField(100);
        tfBebida = new JTextField(50);
        tfSobremesa = new JTextField(50);

        //Instanciar Paineis
        pnBotoes = new JPanel();
        pnBotoes.setLayout(new GridLayout(1, 5));
        pnDia = new JPanel();
        pnDia.setPreferredSize(new Dimension(800,275));
        pnDia.setLayout(new GridLayout(4, 1));
        pnDia.setBackground(Color.GRAY);
        pnCardapio = new JPanel();
        pnCardapio.setPreferredSize(new Dimension(800,275));
        pnCardapio.setLayout(new GridLayout(4, 1));
        pnCardapio.setBackground(Color.GRAY);

        //Define o layout da Janela
        this.setLayout(new BorderLayout());
        this.add(pnBotoes, BorderLayout.NORTH);
        this.add(pnDia, BorderLayout.CENTER);
        this.add(pnCardapio, BorderLayout.SOUTH);

        //Adiciona os dados em geral nos Paineis
        pnBotoes.add(btProx);
        pnBotoes.add(btInserir);
        pnBotoes.add(btCardapio);
        pnBotoes.add(btSair);
        pnBotoes.add(btApagar);
        pnDia.add(lbDia);
        pnDia.add(caixaSemana);
        pnDia.add(lbCardapio);
        pnDia.add(tfCardapio);
        pnCardapio.add(lbBebida);
        pnCardapio.add(tfBebida);
        pnCardapio.add(lbSobremesa);
        pnCardapio.add(tfSobremesa);
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775

        //Evento dos Botões
        btProx.addActionListener(this);
        btInserir.addActionListener(this);
        btCardapio.addActionListener(this);
        btSair.addActionListener(this);
        btApagar.addActionListener(this);
        caixaSemana.addActionListener(this);

<<<<<<< HEAD
=======
        //Instanciar dias da semana e adicionar a lista cardapios
        segunda = new Cardapio();
        cardapios.add(segunda);
        terca = new Cardapio();
        cardapios.add(terca);
        quarta = new Cardapio();
        cardapios.add(quarta);
        quinta = new Cardapio();
        cardapios.add(quinta);
        sexta = new Cardapio();
        cardapios.add(sexta);

        //Icone da Janela
        Image icon;
        icon = ImageIO.read(new File("C:\\Users\\jota1\\Downloads\\ufj.png"));

        this.setIconImage(icon);
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775
        this.setSize(800,600);
        this.setTitle("RESTAURANTE UNIVERSITÁRIO");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
<<<<<<< HEAD

    //Avança para o proximo cardapio e apaga os campos de texto
    private void ProxCardapio(){
        taCardapio.setText("");
        limparCheckBox();
=======
    //Avança para o proximo cardapio e apaga os campos de texto
    private void ProxCardapio(){
        tfCardapio.setText("");
        tfBebida.setText("");
        tfSobremesa.setText("");
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775
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
<<<<<<< HEAD

=======
    }

    //Salva o cardápio no dia respectivo
    private void InseriCardapio() {
        diaSelecionado = (String) caixaSemana.getSelectedItem();
        if (diaSelecionado != null) {
            if (diaSelecionado.equals("Segunda")) {
                segunda = new Cardapio(tfCardapio.getText(), tfBebida.getText(), tfSobremesa.getText());
                cardapios.set(0,new Cardapio(tfCardapio.getText(), tfBebida.getText(), tfSobremesa.getText()));
            } else if (diaSelecionado.equals("Terça")) {
                terca = new Cardapio(tfCardapio.getText(), tfBebida.getText(), tfSobremesa.getText());
                cardapios.set(1,new Cardapio(tfCardapio.getText(), tfBebida.getText(), tfSobremesa.getText()));
            } else if (diaSelecionado.equals("Quarta")) {
                quarta = new Cardapio(tfCardapio.getText(), tfBebida.getText(), tfSobremesa.getText());
                cardapios.set(2,new Cardapio(tfCardapio.getText(), tfBebida.getText(), tfSobremesa.getText()));
            } else if (diaSelecionado.equals("Quinta")) {
                quinta = new Cardapio(tfCardapio.getText(), tfBebida.getText(), tfSobremesa.getText());
                cardapios.set(3,new Cardapio(tfCardapio.getText(), tfBebida.getText(), tfSobremesa.getText()));
            } else if (diaSelecionado.equals("Sexta")) {
                sexta = new Cardapio(tfCardapio.getText(), tfBebida.getText(), tfSobremesa.getText());
                cardapios.set(4,new Cardapio(tfCardapio.getText(), tfBebida.getText(), tfSobremesa.getText()));
            }
        }
    }

    //Mostra os cardápios salvos
    private void CardapioSemanal(){
        int t = 0;
        for ( i = 0; i < cardapios.size(); i++) {

            JOptionPane.showMessageDialog(null, cardapios.get(i), semana[i], 1);
        }

    }

    //Encerra a aplicação
    private void EncerrarApp(){
        String title = "Atenção";
        String message = "Deseja sair Realmente?";
        int retry = JOptionPane.showConfirmDialog(null,message,getTitle(),JOptionPane.YES_NO_OPTION);
        if(retry==0)System.exit(0);
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775
    }

    //De acordo com o dia selecionado, mostra seu respectivo cardápio
    private void seleciaonaDia(){

        if (caixaSemana.getSelectedIndex() == 0) {
<<<<<<< HEAD
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
=======
            tfCardapio.setText(segunda.getDiaCardapio());
            tfBebida.setText(segunda.getDiaBebida());
            tfSobremesa.setText(segunda.getDiaSobremesa());
        } else if (caixaSemana.getSelectedIndex() == 1) {
            tfCardapio.setText(terca.getDiaCardapio());
            tfBebida.setText(terca.getDiaBebida());
            tfSobremesa.setText(terca.getDiaSobremesa());
        } else if (caixaSemana.getSelectedIndex() == 2) {
            tfCardapio.setText(quarta.getDiaCardapio());
            tfBebida.setText(quarta.getDiaBebida());
            tfSobremesa.setText(quarta.getDiaSobremesa());
        } else if (caixaSemana.getSelectedIndex() == 3) {
            tfCardapio.setText(quinta.getDiaCardapio());
            tfBebida.setText(quinta.getDiaBebida());
            tfSobremesa.setText(quinta.getDiaSobremesa());
        } else if (caixaSemana.getSelectedIndex() == 4) {
            tfCardapio.setText(sexta.getDiaCardapio());
            tfBebida.setText(sexta.getDiaBebida());
            tfSobremesa.setText(sexta.getDiaSobremesa());
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775
        }

    }

    //Apaga todos os cardápios ou apaga um cardápio selecionado
    private void ApagarCardapio(){
        String title = "Atenção";
        String message = "Deseja apagar o Cardápio inteiro?";
        int retry = JOptionPane.showConfirmDialog(null,message,getTitle(),JOptionPane.YES_NO_OPTION);
        if(retry==JOptionPane.YES_OPTION){
<<<<<<< HEAD
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
=======
            segunda = new Cardapio("", "", "");
            terca = new Cardapio("", "", "");
            quarta = new Cardapio("", "", "");
            quinta = new Cardapio("", "", "");
            sexta = new Cardapio("", "", "");
            ProxCardapio();
        }else if (retry==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,caixaApagar);
            if (caixaApagar.getSelectedIndex() == 0) {
                segunda = new Cardapio("", "", "");
                cardapios.set(0,new Cardapio("","",""));
            } else if (caixaApagar.getSelectedIndex() == 1) {
                terca = new Cardapio("", "", "");
                cardapios.set(1,new Cardapio("","",""));
            }else if (caixaApagar.getSelectedIndex() == 2) {
                quarta = new Cardapio("", "", "");
                cardapios.set(2,new Cardapio("","",""));
            }else if (caixaApagar.getSelectedIndex() == 3) {
                quinta = new Cardapio("", "", "");
                cardapios.set(3,new Cardapio("","",""));
            }else if (caixaApagar.getSelectedIndex() == 4) {
                sexta = new Cardapio("", "", "");
                cardapios.set(4,new Cardapio("","",""));
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775
            }
        }
    }

<<<<<<< HEAD
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

=======
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775
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
<<<<<<< HEAD
            limparCheckBox();
=======
>>>>>>> 6f1e8f052dad7afecb1f232bf616b023791bc775
            seleciaonaDia();
        }
        else if (e.getSource() == btApagar) {
            ApagarCardapio();
        }
    }
}
