public class Lasagna {
    public int expectedMinutesInOven()
    {
        return 40;
    }
    public int remainingMinutesInOven(int min)
    {
        return expectedMinutesInOven() - min;
    }
    public int preparationTimeInMinutes(int layers)
    {
        return 2 * layers;
    }
    public int totalTimeInMinutes(int layers, int min)
    {
        return preparationTimeInMinutes(layers) + (expectedMinutesInOven() - remainingMinutesInOven(min));
    }
}
