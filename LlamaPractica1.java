public class LlamaPractica1 {

    public static void main(String[] args) {

        @SuppressWarnings("unused")
        Practica1<Integer, Integer> obj1 = new Practica1<>(5, 10);

        @SuppressWarnings("unused")
        Practica1<String, String> obj2 = new Practica1<>("Hola", "Mundo");

        @SuppressWarnings("unused")
        Practica1<Double, Double> obj3 = new Practica1<>(3.14, 2.71);

        @SuppressWarnings("unused")
        Practica1<Float, Float> obj4 = new Practica1<>(2.5f, 4.5f);
    }
}