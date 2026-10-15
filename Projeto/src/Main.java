import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuCarro menu = new MenuCarro();
        FuncaoCarro funcao = new FuncaoCarro();
        Scanner scanner = new Scanner(System.in);

        //Status Do Carro
        boolean carLigado = false;
        boolean carDesligado = true;
        // Pegar valores Velcidade e marcha
        int marcha = 0;

      boolean loop = true;
        while (loop){
            menu.painel();
            System.out.println("Escolha a opçao desejada");

            int opcaoMenu = scanner.nextInt();
            switch (opcaoMenu){
                // funcao de ligar o carro
                case 1:
                    if (carLigado){
                        System.out.println("O carro já está ligado.");
                    } else {
                        if (marcha > 0){
                            System.out.println("Coloque em Neutro!");
                        } else {
                            funcao.ligarCarro();
                            carLigado = true;
                            carDesligado = false;
                        }
                    } break;

                // funcao de desligar o carro
                case 2:
                    if (carDesligado){
                        System.out.println("O carro já está desligado.");
                    } else {
                        if (marcha == 0 && funcao.getVelocidade() == 0) {
                            funcao.desligarCarro();
                            carDesligado = true;
                            carLigado = false;
                        } else {
                            System.out.println("O carro tem que estar parado, e em Neutro!");
                        }
                    } break;

                // Funcao de acelerar
                case 3:
                    //Verificando se o carro esta ligado
                    if (carLigado){
                        // Verificando qual marcha está, para saber se pode ou não acelerar
                        switch (marcha){
                            case 0:
                                System.out.println("O carro está em Neutro. Passe a marcha.");
                                break;
                            case 1:
                                if (funcao.getVelocidade() >= 0 && funcao.getVelocidade() < 20){
                                    funcao.acelerar();
                                } else {
                                System.out.println("Passe a Marcha");
                                } break;
                            case 2:
                                if (funcao.getVelocidade() >= 20 && funcao.getVelocidade() < 40){
                                    funcao.acelerar();
                                } else {
                                    System.out.println("Passe a Marcha");
                                } break;
                            case 3:
                                if (funcao.getVelocidade() >= 40 && funcao.getVelocidade() < 60){
                                    funcao.acelerar();
                                } else {
                                    System.out.println("Passe a Marcha");
                                } break;
                            case 4:
                                if (funcao.getVelocidade() >= 60 && funcao.getVelocidade() < 80){
                                    funcao.acelerar();
                                } else {
                                    System.out.println("Passe a Marcha");
                                } break;
                            case 5:
                                if (funcao.getVelocidade() >= 80 && funcao.getVelocidade() < 100){
                                    funcao.acelerar();
                                } else {
                                    System.out.println("Passe a Marcha");
                                } break;
                            case 6:
                                if (funcao.getVelocidade() >= 100 && funcao.getVelocidade() < 120){
                                    funcao.acelerar();
                                } else {
                                    System.out.println("Passe a Marcha");
                                } break;
                        }
                     // Caso carro n estiver ligado, pedir para ligar
                    } else {
                        System.out.println("Ligue o carro!");
                    } break;

                // Funcao de diminuir a velocidade
                case 4:
                    // Verificando se o carro está ligado
                    if (carLigado){
                        // Verificando em qual marcha está, para saber se pode ou não diminuir a velocidade
                        switch (marcha) {
                            case 0:
                                System.out.println("O carro está em Neutro. Passe a marcha.");
                                break;
                            case 1:
                                if (funcao.getVelocidade() > 0 && funcao.getVelocidade() <= 20) {
                                    funcao.diminuir();
                                    if (funcao.getVelocidade() == 0) System.out.println("Você parou");
                                } else {
                                    System.out.println("Reduza a Marcha");
                                }
                                break;
                            case 2:
                                if (funcao.getVelocidade() > 20 && funcao.getVelocidade() <= 40) {
                                    funcao.diminuir();
                                } else {
                                    System.out.println("Reduza a Marcha");
                                }
                                break;
                            case 3:
                                if (funcao.getVelocidade() > 40 && funcao.getVelocidade() <= 60) {
                                    funcao.diminuir();
                                } else {
                                    System.out.println("Reduza a Marcha");
                                }
                                break;
                            case 4:
                                if (funcao.getVelocidade() > 60 && funcao.getVelocidade() <= 80) {
                                    funcao.diminuir();
                                } else {
                                    System.out.println("Reduza a Marcha");
                                }
                                break;
                            case 5:
                                if (funcao.getVelocidade() > 80 && funcao.getVelocidade() <= 100) {
                                    funcao.diminuir();
                                } else {
                                    System.out.println("Reduza a Marcha");
                                }
                                break;
                            case 6:
                                if (funcao.getVelocidade() > 100 && funcao.getVelocidade() <= 120) {
                                    funcao.diminuir();
                                } else {
                                    System.out.println("Reduza a Marcha");
                                }
                                break;
                        }
                     // Caso carro n estiver ligado, pedir para ligar
                    } else {
                        System.out.println("Ligue o carro!");
                    } break;

                // funcao para virar para esquerda/direita
                case 5:
                    if (carLigado){
                        System.out.println("Informe Esquerda ou Direita");
                        String lado = scanner.next();
                        if (lado.equalsIgnoreCase("Esquerda")){
                            funcao.virarEsquerda();
                        } else if (lado.equalsIgnoreCase("Direita")){
                            funcao.virarDireita();
                        } else {
                            System.out.println("Informe apenas direita ou esquerda!");
                        }
                    } else {
                        System.out.println("Ligue o carro!");
                    } break;

                 // verificar a velocidade
                case 6:
                    if (carLigado){
                        funcao.verificarVelocidade();
                    } else {
                        System.out.println("Ligue o carro!");
                    } break;

                 // funcoes de troca de marcha
                case 7:
                    menu.marcha();
                    System.out.println("Informe a opcao: ");

                    // criando regra para n pular marcha
                    int marchaNova = scanner.nextInt();
                    if (marchaNova == marcha + 1 || marchaNova == marcha -1){
                        // Regra para n reduzir a marcha se a velocidade n estiver no range.
                        if (funcao.getVelocidade() <= marchaNova * 20 && funcao.getVelocidade() >= (marchaNova - 1) * 20) {
                            marcha = funcao.trocarMarcha(marchaNova);
                        } else System.out.println("Velocidade incompatível com a marcha");
                    } else {
                        System.out.println("Passe apenas de 1 em 1 marcha");
                    }

                    break;

                case 8:
                    if (carLigado){
                        System.out.println("Desligue o carro");
                    } else {
                        System.out.println("=========");
                        System.out.println("Saindo...");
                        System.out.println("=========");
                        loop = false;
                    } break;
                    
            }

        }

    }

}