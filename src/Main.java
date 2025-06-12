import figurasGeometricas.Circulo;
import figurasGeometricas.CirculoDibujable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        figurasGeometricas.CirculoDibujable circulo= new CirculoDibujable(100,0,0);
        System.out.println("El perimetro del circulo es: "+ circulo.getPerimetro());
        System.out.println("El perimetro del circulo es: "+ circulo.getArea());
    }
}