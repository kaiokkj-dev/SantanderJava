class Brasileirao {
    public static void main(String[] args) {
        Times time1 = new Times("Palmeiras");
        Times time2 = new Times("Flamengo");
        Times time3 = new Times("Corinthians");

        time1.setTitulos(11);
        time2.setTitulos(7);
        time3.setTitulos(2);

        System.out.println(time1.getNome());
        System.out.println(time1.getTitulos());
        System.out.println(time2.getNome());
        System.out.println(time2.getTitulos());
        System.out.println(time3.getNome());
        System.out.println(time3.getTitulos());
    }
}
