public class MaquinaBanho {
    private int agua;
    private int shampoo;
    private boolean petNaMaquina;
    private boolean maquinaSuja;

    public MaquinaBanho() {
        agua = 0;
        shampoo = 0;
        petNaMaquina = false;
        maquinaSuja = false;
    }

    public void abastecerAgua() {
        if (agua >= 30) {
            System.out.println("A maquina ja esta com o nivel maximo de agua.");
            return;
        }
        agua += 2;
        System.out.println("Agua abastecida. Nivel atual: " + agua + " litros.");
    }
    public void abastecerShampoo() {
        if (shampoo >= 10) {
            System.out.println("A maquina ja esta com o nivel maximo de shampoo.");
            return;
        }
            shampoo += 2;
        System.out.println("Shampoo abastecido. Nivel atual: " + shampoo + " litros.");
    }
    public int verificarNivelAgua() {
        return agua;
    }
    public int verificarNivelShampoo() {
        return shampoo;
    }
    public void colocarPet() {
    if (petNaMaquina) {
        System.out.println("Ja existe um pet na maquina.");
        return;
    }
    if (maquinaSuja) {
        System.out.println("A maquina precisa ser limpa antes de colocar outro pet.");
        return;
    }
    petNaMaquina = true;
    System.out.println("Pet colocado na maquina com sucesso.");
}
public void darBanho() {
    if (!petNaMaquina) {
        System.out.println("Nao existe pet na maquina.");
        return;
    }
    if (agua < 10) {
        System.out.println("Agua insuficiente para dar banho.");
        return;
    }
    if (shampoo < 2) {
        System.out.println("Shampoo insuficiente para dar banho.");
        return;
    }
    agua -= 10;
    shampoo -= 2;
    maquinaSuja = false;
    System.out.println("Banho realizado com sucesso!");
}
public void retirarPet() {
    if (!petNaMaquina) {
        System.out.println("Nao existe pet na maquina.");
        return;
    }
    petNaMaquina = false;
    maquinaSuja = true;
    System.out.println("Pet retirado da maquina.");
}
public void limparMaquina() {
    if (!maquinaSuja) {
        System.out.println("A maquina ja esta limpa.");
        return;
    }
    if (agua < 3) {
        System.out.println("Agua insuficiente para limpeza.");
        return;
    }
    if (shampoo < 1) {
        System.out.println("Shampoo insuficiente para limpeza.");
        return;
    }
    agua -= 3;
    shampoo -= 1;
    maquinaSuja = false;
    System.out.println("Maquina limpa com sucesso.");
}
public boolean verificarPet() {
    return petNaMaquina;
}
}
