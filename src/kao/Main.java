package kao;

public class Main {
	public static void main(String[] args) {
        double lado = 5.0;
        TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);
        
        System.out.println("Lado do triângulo: " + triangulo.getLado());
        System.out.println("Área do triângulo: " + String.format("%.2f", triangulo.getArea()));
        System.out.println("Perímetro do triângulo: " + triangulo.getPerimetro());
    }
}
