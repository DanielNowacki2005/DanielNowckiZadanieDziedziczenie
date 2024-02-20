public class Car extends Vehicle{
    protected String typeOfTires, typeOfCar;
    protected int numberOfDoors,cargoSpace;

    public Car(String brand, String name, String id, int productionID, int typeId, double price, double gasTankMax, double kilometersDriven, String type, String typeOfTires, String typeOfCar, int numberOfDoors, int cargoSpace) {
        super(brand, name, id, productionID, typeId, price, gasTankMax, kilometersDriven, type);
        this.typeOfTires = typeOfTires;
        this.typeOfCar = typeOfCar;
        this.numberOfDoors = numberOfDoors;
        this.cargoSpace = cargoSpace;
    }

    public String getTypeOfTires() {
        return typeOfTires;
    }

    public void setTypeOfTires(String typeOfTires) {
        this.typeOfTires = typeOfTires;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(int cargoSpace) {
        this.cargoSpace = cargoSpace;
    }
    /*********************************************************
     * nazwa funkcji: doCarGoSpace
     * parametry wejściowe: brak
     * wartość zwracana brak
     * autor: Daniel Nowacki
     * ****************************************************/
        public void doCarGoSpace(){
            System.out.println("No Car go road.");
        }
    /********************************************************
     * * nazwa funkcji: getCarTypeByDoors
     * * parametry wejściowe: brak
     * * wartość zwracana:gets car type by door amount
     * * autor: Daniel Nowacki
     * * ****************************************************/
        public void getCarTypeByDoors(){
            if(getNumberOfDoors() > 4){
                System.out.println("this car is not familly car");
            }
            else{
                System.out.println("this car is  familly car");
            }
        }
    /********************************************************
     * * nazwa funkcji: changeTiresToSummer
     * * parametry wejściowe: brak
     * * wartość zwracana:change Tires To Summer type and returns old tires
     * * autor: Daniel
     * * ****************************************************/
        public String changeTiresToSummer(){
            String oldTires = getTypeOfTires();
            setTypeOfTires("summer");
            System.out.println("old "+oldTires + " new "+ getTypeOfTires());
            return oldTires;
        }
}
