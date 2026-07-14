public class Car {

    private boolean ligado;
    private int velocidade;
    private int marcha;
    public Car() {
        ligado = false;
        velocidade = 0;
        marcha = 0;
    }
    public void ligar() {
        ligado = true;
    }
    public void desligarCarro() {
        if (velocidade == 0 && marcha == 0) {
            ligado = false;
        } else {
            System.out.println("O carro precisa estar parado e em ponto morto para desligar.");
        }
    }
    public void acelerarCarro() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }
        if (velocidade >= 120) {
            System.out.println("Velocidade máxima atingida.");
            return;
        }
        if ((marcha == 1 && velocidade >= 20) ||
            (marcha == 2 && velocidade >= 40) ||
            (marcha == 3 && velocidade >= 60) ||
            (marcha == 4 && velocidade >= 80) ||
            (marcha == 5 && velocidade >= 100) ||
            (marcha == 6 && velocidade >= 120)) {
            System.out.println("Troque de marcha para continuar acelerando.");
            return;
        }
        velocidade++;
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
    public void desacelerarCarro() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }
        if (velocidade == 0) {
            System.out.println("O carro já está parado.");
            return;
        }
        velocidade--;
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
    public void subirMarcha() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }
        if (marcha == 6) {
            System.out.println("O carro já está na última marcha.");
            return;
        }
        if (marcha == 1 && velocidade >= 21) {
            marcha++;
        } else if (marcha == 2 && velocidade >= 41) {
            marcha++;
        } else if (marcha == 3 && velocidade >= 61) {
            marcha++;
        } else if (marcha == 4 && velocidade >= 81) {
            marcha++;
        } else if (marcha == 5 && velocidade >= 101) {
            marcha++;
        } else {
            System.out.println("A velocidade não permite subir de marcha.");
            return;
        }
        System.out.println("Marcha atual: " + marcha);
    }
    public void descerMarcha() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }
        if (marcha == 0) {
            System.out.println("O carro já está em ponto morto.");
            return;
        }
        if (marcha == 6 && velocidade <= 100) {
            marcha--;
        } else if (marcha == 5 && velocidade <= 80) {
            marcha--;
        } else if (marcha == 4 && velocidade <= 60) {
            marcha--;
        } else if (marcha == 3 && velocidade <= 40) {
            marcha--;
        } else if (marcha == 2 && velocidade <= 20) {
            marcha--;
        } else if (marcha == 1 && velocidade == 0) {
            marcha--;
        } else {
            System.out.println("Diminua a velocidade antes de reduzir a marcha.");
            return;
        }
        System.out.println("Marcha atual: " + marcha);
    }
        public int verificarVelocidade() {
        return velocidade;
    }
        public void virarEsquerda() {
            if (!ligado) {
                System.out.println("O carro esta desligado.");
                return;
            }
            if (velocidade < 1 || velocidade > 40) {
                System.out.println("A velocidade nao permite virar.");
                return;
            }
            System.out.println("Virando para a esquerda.");
    }
        public void virarDireita() {
            if (!ligado) {
                System.out.println("O carro esta desligado.");
                return;
            }
            if (velocidade < 1 || velocidade > 40) {
                System.out.println("A velocidade nao permite virar.");
                return;
            }
            System.out.println("Virando para a direita.");
    }
}