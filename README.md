# Ds-davi-tavares
Desenvolvimento de Sistemas por Prof João Siles e Davi Villar

package POO;

import javax.swing.*;
import java.util.ArrayList;

class Produto {
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, quantidade + "x " + nome + " - R$ " + (preco * quantidade));
    }

    public double getPrecoTotal() {
        return preco * quantidade;
    }
}

class Cafe extends Produto {
    protected String tamanho;

    public Cafe(String nome, double preco, String tamanho, int quantidade) {
        super(nome + " (" + tamanho + ")", preco, quantidade);
        this.tamanho = tamanho;
    }
}

class Doce extends Produto {
    protected boolean temRecheio;

    public Doce(String nome, double preco, boolean temRecheio, int quantidade) {
        super(nome + " (" + (temRecheio ? "Com recheio" : "Sem recheio") + ")", preco, quantidade);
        this.temRecheio = temRecheio;
    }
}

public class CafeteriaVirtual {
    public static void main(String[] args) {
        ArrayList<Produto> pedido = new ArrayList<>();

        JOptionPane.showMessageDialog(null, "Bem-vindo à Cafeteria Virtual!");

        double saldoCliente = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor disponível na sua carteira (R$):"));

        // Escolha de café
        String[] tiposCafe = {"Expresso - R$ 5,00", "Latte - R$ 7,50", "Cappuccino - R$ 6,50"};
        double[] precosCafe = {5.00, 7.50, 6.50};

        int escolhaTipo = JOptionPane.showOptionDialog(null, "Escolha o tipo de café:", "Café",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tiposCafe, tiposCafe[0]);

        String tipoCafeEscolhido = tiposCafe[escolhaTipo].split(" - ")[0];
        double precoBaseCafe = precosCafe[escolhaTipo];

        // Escolha de tamanho
        String[] tamanhosCafe = {"Pequeno - R$ 0,00", "Médio - R$ 2,00", "Grande - R$ 4,00"};
        double[] adicionaisPreco = {0.0, 2.0, 4.0};

        int escolhaTamanho = JOptionPane.showOptionDialog(null, "Escolha o tamanho do café:", "Tamanho",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tamanhosCafe, tamanhosCafe[0]);

        String tamanhoEscolhido = tamanhosCafe[escolhaTamanho].split(" - ")[0];
        double precoFinalCafe = precoBaseCafe + adicionaisPreco[escolhaTamanho];

        int quantidadeCafe = Integer.parseInt(JOptionPane.showInputDialog("Quantos cafés deseja pedir?"));

        pedido.add(new Cafe(tipoCafeEscolhido, precoFinalCafe, tamanhoEscolhido, quantidadeCafe));

        // Deseja doce?
        int desejaDoce = JOptionPane.showConfirmDialog(null, "Deseja adicionar um doce ao seu pedido?", "Doce",
                JOptionPane.YES_NO_OPTION);

        if (desejaDoce == JOptionPane.YES_OPTION) {
            Doce[] doces = {
                    new Doce("Brownie", 10.00, true, 1),
                    new Doce("Cookie", 8.00, false, 1),
                    new Doce("Bolo de Cenoura", 12.00, true, 1)
            };

            String[] opcoesDoces = new String[doces.length];
            for (int i = 0; i < doces.length; i++) {
                opcoesDoces[i] = doces[i].nome + " - R$ " + doces[i].preco + (doces[i].temRecheio ? " (com recheio)" : " (sem recheio)");
            }

            int escolhaDoce = JOptionPane.showOptionDialog(null, "Escolha um doce:", "Doce",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesDoces, opcoesDoces[0]);

            int quantidadeDoce = Integer.parseInt(JOptionPane.showInputDialog("Quantos doces deseja pedir?"));

            Doce doceEscolhido = doces[escolhaDoce];
            pedido.add(new Doce(doceEscolhido.nome, doceEscolhido.preco, doceEscolhido.temRecheio, quantidadeDoce));
        }

        // Calcular total
        double total = 0;
        StringBuilder resumoPedido = new StringBuilder("Seu pedido:\n");
        for (Produto item : pedido) {
            resumoPedido.append(item.quantidade).append("x ").append(item.nome)
                    .append(" - R$ ").append(String.format("%.2f", item.getPrecoTotal())).append("\n");
            total += item.getPrecoTotal();
        }

        if (saldoCliente >= total) {
            saldoCliente -= total;
            resumoPedido.append("\nTotal pago: R$ ").append(String.format("%.2f", total))
                    .append("\nSaldo restante: R$ ").append(String.format("%.2f", saldoCliente));
            JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!\n\n" + resumoPedido);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!\nSeu saldo: R$ " + saldoCliente +
                    "\nTotal do pedido: R$ " + String.format("%.2f", total));
        }

        JOptionPane.showMessageDialog(null, "Obrigado por visitar nossa Cafeteria Virtual!");
    }
}
https://github.com/davivilar/aulasds.git
