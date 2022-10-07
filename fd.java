class Flight implements Cloneable {
    public float ticketPrice;
    public int passengerCapacity;
    Flight(float price, int capacity)
    {
        ticketPrice = price;
        passengerCapacity = capacity;
    }
    public float Condition()
    {
        float allTicPrice = (float) this.passengerCapacity * this.ticketPrice;
        return allTicPrice;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static Flight foo(Flight flight2) throws CloneNotSupportedException {
        Flight flight1 = null;
        flight1 = (Flight)flight2.clone();
        return flight1;
    }
}


class Route
{

    int passengersRoute1;
    int passengersRoute2;
    int passengersRoute3;

    float summFirst;
    float summSecond;
    float summThird;
    float summAll;

    // наибольший доход
    public void highestIncome()
    {
        if (summFirst > summSecond && summFirst > summThird)
        {
            System.out.println("First race");
        }
        if (summSecond > summFirst && summSecond > summThird)
        {
            System.out.println("First race");
        }
        if (summThird > summFirst && summThird > summSecond)
        {
            System.out.println("First race");
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Route route = new Route();

        Flight flight1 = new Flight(30, 50);
        Flight flight2 = new Flight(40, 50);
        flight2 = flight2.foo(flight1);
        System.out.println(String.valueOf(flight2.ticketPrice));
        System.out.println(String.valueOf(flight1.passengerCapacity));


        route.passengersRoute1 = 30;
        route.passengersRoute2 = 50;
        route.passengersRoute3 = 70;

        route.highestIncome();
    }
}

