import java.util.Scanner;

    public class Conversor {

        double celsius;
        double fahrenheit;
        double kelvin;

    public void obterDados() {

        Scanner leitorDouble = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = leitorDouble.nextDouble();

        exibirResultados();

    }

    private void conversorTemperatura() {

        fahrenheit = ((celsius*1.8) + 32);

        kelvin = (celsius + 273.15);
    }

    private void exibirResultados() {

        conversorTemperatura();

        System.out.println(celsius + "°C equivalem a:");

        System.out.println(fahrenheit + "°F (Fahrenheit)");

        System.out.println(kelvin + "°K (Kelvin)");
    }
}
