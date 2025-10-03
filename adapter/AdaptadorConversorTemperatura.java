public class AdaptadorConversorTemperatura implements ConversorTemperatura {
    private ConversorCelsius conversorCelsius;

    public AdaptadorConversorTemperatura() {
        this.conversorCelsius = new ConversorCelsius();
    }

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return conversorCelsius.converterParaFahrenheit(celsius);
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
