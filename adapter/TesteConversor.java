public class TesteConversor {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new AdaptadorConversorTemperatura();

        System.out.println("=== Teste do Conversor de Temperatura ===");

        // Testando Celsius → Fahrenheit
        double f1 = conversor.celsiusParaFahrenheit(0);
        double f2 = conversor.celsiusParaFahrenheit(100);
        System.out.println("0°C = " + f1 + "°F");
        System.out.println("100°C = " + f2 + "°F");

        // Testando Fahrenheit → Celsius
        double c1 = conversor.fahrenheitParaCelsius(32);
        double c2 = conversor.fahrenheitParaCelsius(212);
        System.out.println("32°F = " + c1 + "°C");
        System.out.println("212°F = " + c2 + "°C");
    }
}
