package application.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domain.IntentionTreeNode;

public class IntentionTreeSeed {
    public static List<IntentionTreeNode> getSeedTree() {
        List<IntentionTreeNode> nodes = new ArrayList<>();

        nodes.add(
                new IntentionTreeNode(
                        "EMPRESTIMO", Arrays.asList(
                                new IntentionTreeNode("REALIZAR",
                                        "Para realizar um empréstimo, você precisa ir no aplicativo Banco Norte e consultar a disponibilidade de crédito."),
                                new IntentionTreeNode("TAXA",
                                        "as taxas dos emprestimos variam. Geralmente giram em torno de 1,5% a 3,5% ao mês para crédito consignado e podem ultrapassar 4% a 8% ao mês no crédito pessoal comum."))));

        nodes.add(
                new IntentionTreeNode(
                        "SACAR", Arrays.asList(
                                new IntentionTreeNode("LUGAR",
                                        "Você pode sacar em qualquer agência física ou caixa eletrônico autorizado pelo Banco Norte."),
                                new IntentionTreeNode("QUANTIDADE",
                                        "Isso vai depender muito da agência ou caixa eletrônico. Geralmente, Horário Diurno (Geralmente das 6h às 22h): entre R$ 1.000 e R$ 2.000, dependendo do seu perfil e do banco. Horário Noturno / Madrugada (Geralmente das 22h às 6h:  o limite máximo para saques cai para R$ 300, mesmo que o seu limite diurno seja superior."),
                                new IntentionTreeNode("LIMITE",
                                        "O limite do seu saque é uma combinação do que você tem na conta e o quanto você pode sacar, dependendo do horário em que estiver na agência ou caixa eletrônico: Geralmente, Horário Diurno (Geralmente das 6h às 22h): entre R$ 1.000 e R$ 2.000, dependendo do seu perfil e do banco. Horário Noturno / Madrugada (Geralmente das 22h às 6h:  o limite máximo para saques cai para R$ 300, mesmo que o seu limite diurno seja superior."))));

        nodes.add(
                new IntentionTreeNode(
                        "FINANCIAMENTO", Arrays.asList(
                                new IntentionTreeNode("PARCELAS",
                                        "Isso pode variar muito do que exatamente você quer financiar. Você quer financiar uma casa? Digite 'financiar casa', se não, digite 'financiar carro'"),
                                new IntentionTreeNode("CASA",
                                        "O financiamento de casa funciona como um empréstimo de longo prazo em que o banco paga o valor total do imóvel ao vendedor e o comprador devolve esse dinheiro à instituição em parcelas mensais com juros."),
                                new IntentionTreeNode("CARRO",
                                        "O financiamento de um carro funciona como um empréstimo em que um banco paga o veículo ao vendedor e você devolve esse dinheiro em parcelas mensais com juros."))));

        nodes.add(
                new IntentionTreeNode(
                        "CARTAO", Arrays.asList(
                                new IntentionTreeNode("CONSEGUIR",
                                        "Para conseguir um cartão, é necessário ter um bom relacionamento com o banco. Em outras palavras, isso quer dizer: ter movimentações recentes que condizam com o valor do crédito, poucas ou nenhuma dívida, etc."),
                                new IntentionTreeNode("PARCELA",
                                        "O parcelamento do cartão é uma forma de aliviar o pagamento das parcelas do seu cartão de crédito. As taxas do parcelamento podem variar conforme a quantidade de parcelas. Entre no seu aplicativo Banco Norte e confira."))));

        nodes.add(
                new IntentionTreeNode(
                        "BOLETO", Arrays.asList(
                                new IntentionTreeNode("PAGAMENTO",
                                        "Para realizar o pagamento de um boleto, é necessário realizá-lo antes do prazo do vencimento, para pagá-lo sem juros. Além disso, o horário permitido é das 6h às 18h."))));

        nodes.add(
                new IntentionTreeNode(
                        "RECARGA", Arrays.asList(
                                new IntentionTreeNode("CELULAR",
                                        "É possível realizar recarga do seu celular via app Banco Norte. Acesse o aplicativo e vá no menu 'Recargas de Celular'"))));

        nodes.add(
                new IntentionTreeNode(
                        "INVESTIMENTO", Arrays.asList(
                                new IntentionTreeNode("TIPOS",
                                        "Há algumas categorias e opções: Renda Fixa, com: Tesouro Direto, CDB, LCI e LCA, Poupança. Renda Variável, com: Ações, FIIs e ETFs. Por fim, temos: Fundos de Investimento e Previdência Privada."))));

        nodes.add(
                new IntentionTreeNode("CASHBACK",
                        "O programa de cashback é uma recompensa pós compra que todos os cidadãos que possuirem um cartão de crédito, ao comparem em nossas lojas parceiras, adquirem um saldo de uso posterior em compras."));

        return nodes;
    }
}
