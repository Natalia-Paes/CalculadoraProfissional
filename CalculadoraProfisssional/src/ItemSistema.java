public class ItemSistema {
    int tipo;
    String nome;
    int complexidade;

    public String getTipo() {
        switch (tipo) {
            case 1:
                return "Tela de Login";
            case 2:
                return "Tela de Cadastro";
            case 3:
                return "Tela de Pesquisa";
            case 4:
                return "Tela de Saída";
        }

        return "Tipo indefinido";
    }

    public int calculaQtdHoras() {
        int qtdHoras = 0;

        if (tipo == 1) {
            switch (complexidade) {
                case 1:
                    qtdHoras = 8;
                    break;
                case 2:
                    qtdHoras = 12;
                    break;
                case 3:
                    qtdHoras = 16;
                case 4:
                    qtdHoras = 20;
                    break;
            }
        } else if (tipo == 2) {
            switch (complexidade) {
                case 1:
                    qtdHoras = 4;
                    break;
                case 2:
                    qtdHoras = 6;
                    break;
                case 3:
                    qtdHoras = 8;
                case 4:
                    qtdHoras = 10;
                    break;
            }
        } else if (tipo == 3) {
            switch (complexidade) {
                case 1:
                    qtdHoras = 16;
                    break;
                case 2:
                    qtdHoras = 24;
                    break;
                case 3:
                    qtdHoras = 36;
                case 4:
                    qtdHoras = 48;
                    break;
            }
        }
        return qtdHoras;
    }
}
