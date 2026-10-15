public class FuncaoCarro {

    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void ligarCarro(){
        System.out.println("==============");
        System.out.println("   LIGANDO...");
        System.out.println("==============");
        System.out.println("   LIGADO!    ");

    }

    public void desligarCarro(){
        System.out.println("===============");
        System.out.println("  Desligando...");
        System.out.println("===============");
        System.out.println("  DESLIGADO!   ");
    }

    public void acelerar(){
        if (velocidade == 120){
            System.out.println("Velocidade Maxima atingida");
        } else {
            velocidade += 2;
        }
    }

    public void diminuir(){
        if (velocidade == 0){
            System.out.println("Você parou!");
        } else {
            velocidade -= 2;
        }
    }

    public void virarEsquerda(){
        if (velocidade > 0 && velocidade <= 40){
            System.out.println("============================");
            System.out.println("<--- Virando à esquerda");
            System.out.println("============================");
        } else {
            if (velocidade == 0) {
            System.out.println("Não foi possível virar. Ande com o Carro");
            } else System.out.println("Não foi possível virar. Diminua a velocidade");
        }
    }

    public void virarDireita(){
        if (velocidade > 0 && velocidade <= 40){
            System.out.println("========================");
            System.out.println("  Virando à direita --->");
            System.out.println("========================");
        } else {
            if (velocidade == 0) {
                System.out.println("Não foi possível virar. Ande com o Carro");
            } else System.out.println("Não foi possível virar. Diminua a velocidade");
        }
    }

    public void verificarVelocidade(){
        System.out.println("=====================");
        System.out.println("      Velocidade     ");
        System.out.println("=====================");
        System.out.println(velocidade + "Km/h");
    }

    public int trocarMarcha(int marcha){
            switch (marcha){
                case 0:
                    System.out.println("=========================");
                    System.out.println("Você passou para Neutro");
                    System.out.println("=========================");
                    break;
                case 1:
                    System.out.println("==========================");
                    System.out.println("Você passou para Primeira");
                    System.out.println("==========================");
                    break;
                case 2:
                    System.out.println("==========================");
                    System.out.println("Você passou para Segunda");
                    System.out.println("==========================");
                    break;
                case 3:
                    System.out.println("==========================");
                    System.out.println("Você passou para Terceira");
                    System.out.println("==========================");
                    break;
                case 4:
                    System.out.println("==========================");
                    System.out.println("Você passou para Quarta");
                    System.out.println("==========================");
                    break;
                case 5:
                    System.out.println("==========================");
                    System.out.println("Você passou para Quinta");
                    System.out.println("==========================");
                    break;
                case 6:
                    System.out.println("==========================");
                    System.out.println("Você passou para Sexta");
                    System.out.println("==========================");
                    break;
                default:
                    System.out.println("Marcha inválida");
                    break;
            }   return marcha;
    }

}
