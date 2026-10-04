import java.util.Scanner;

public class Ejem6<T, U> {
    T valor1;
    U valor2;

    public Ejem6(T valor1, U valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public T getValor1() {
        return valor1;
    }

    public U getValor2() {
        return valor2;
    }

    public void setValor1(T valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(U valor2) {
        this.valor2 = valor2;
    }

    public void verificatipo() {
        if (valor1 instanceof String && valor2 instanceof String) {
            concatenar();
        } else if (valor1 instanceof Integer && valor2 instanceof Integer) {
            operaciones();
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
            operaciones();
        } else if (valor1 instanceof Boolean && valor2 instanceof Boolean) {
            System.out.println("Ambos valores son de tipo Boolean");
        } else if (valor1 instanceof Character && valor2 instanceof Character) {
            concatenar();
        } else if (valor1 instanceof Float && valor2 instanceof Float) {
            operaciones();
        } else {
            System.out.println("Los valores son de tipos diferentes");
        }
    }

       public void operaciones() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            System.out.println("Menu de opciones");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("Que opcion desea realizar");
            opcion = scanner.nextInt();
            
            double v1 = Double.parseDouble(valor1.toString());
            double v2 = Double.parseDouble(valor2.toString());

            switch (opcion) {
                case 1 -> System.out.println("La suma es: " + (v1 + v2));
                case 2 -> System.out.println("La resta es: " + (v1 - v2));
                case 3 -> System.out.println("La multiplicación es: " + (v1 * v2));
                default -> System.out.println("Opción inválida");
            }
            scanner.close();
        } catch (NumberFormatException e) {
            //
            System.out.println("Error: Ingrese valores numéricos válidos");
        }
    }

    private void concatenar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}