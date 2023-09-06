package View;

import Model.Cardapio;

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

        //Evento dos Botões
        btProx.addActionListener(this);
        btInserir.addActionListener(this);
        btCardapio.addActionListener(this);
        btSair.addActionListener(this);
        btApagar.addActionListener(this);
        caixaSemana.addActionListener(this);

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
        this.setSize(800,600);
        this.setTitle("RESTAURANTE UNIVERSITÁRIO");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    //Avança para o proximo cardapio e apaga os campos de texto
    private void ProxCardapio(){
        tfCardapio.setText("");
        tfBebida.setText("");
        tfSobremesa.setText("");
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
    }

    //De acordo com o dia selecionado, mostra seu respectivo cardápio
    private void seleciaonaDia(){

        if (caixaSemana.getSelectedIndex() == 0) {
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
        }

    }

    //Apaga todos os cardápios ou apaga um cardápio selecionado
    private void ApagarCardapio(){
        String title = "Atenção";
        String message = "Deseja apagar o Cardápio inteiro?";
        int retry = JOptionPane.showConfirmDialog(null,message,getTitle(),JOptionPane.YES_NO_OPTION);
        if(retry==JOptionPane.YES_OPTION){
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
            }
        }
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
            seleciaonaDia();
        }
        else if (e.getSource() == btApagar) {
            ApagarCardapio();
        }
    }
}
