public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Civic");
        Carro carro2 = new Carro("Corolla");

        carro1.setAno(2022);
        carro2.setAno(2023);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAno());

    }
}