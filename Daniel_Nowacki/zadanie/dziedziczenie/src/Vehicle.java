public class Vehicle {
    String brand,name,id;
    int productionID, typeId;
    double price,gasTankMax,kilometersDriven;
    protected String type;

    public Vehicle(String brand, String name, String id, int productionID, int typeId, double price, double gasTankMax, double kilometersDriven, String type) {
        this.brand = brand;
        this.name = name;
        this.id = id;
        this.productionID = productionID;
        this.typeId = typeId;
        this.price = price;
        this.gasTankMax = gasTankMax;
        this.kilometersDriven = kilometersDriven;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getProductionID() {
        return productionID;
    }

    public void setProductionID(int productionID) {
        this.productionID = productionID;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getGasTankMax() {
        return gasTankMax;
    }

    public void setGasTankMax(double gasTankMax) {
        this.gasTankMax = gasTankMax;
    }

    public double getKilometersDriven() {
        return kilometersDriven;
    }

    public void setKilometersDriven(double kilometersDriven) {
        this.kilometersDriven = kilometersDriven;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    /********************************************************
     * * nazwa funkcji: showInformation
     * * parametry wejściowe: brak
     * * wartość zwracana:shows vehicle information in console
     * * autor: Daniel Nowacki
     * * ****************************************************/
    public void showInformation(){
        System.out.println(getBrand()+" "+getType()+" "+getName()+" "+getPrice()+" "+getKilometersDriven()+" "+getGasTankMax()+" "+getId());
    }
    /********************************************************
     * * nazwa funkcji: findType
     * * parametry wejściowe: brak
     * * wartość zwracana: returns String type of vehicle by segregating car as vehicles with less than 30 liters of gas maximum in gastank and truck as above 30 liters.
     * * autor: Daniel Nowacki
     * * ****************************************************/
    public String findType(){
        if(getGasTankMax() >= 30){
            System.out.println("car");
            return "car";
        }
        else {
            System.out.println("truck");
            return "truck";
        }
    }
    /********************************************************
     * * nazwa funkcji: addKilometersAndDecrease
     * * parametry wejściowe:double kilometers - how much kilometers to add , double hundredKilometesToPriceReduction - how many zł reduce per 100 kilometers added
     * * wartość zwracana: returns type of vehicle by segregating car as vehicles with less than 30 liters of gas maximum in gastank and truck as above 30 liters.
     * * autor: Daniel Nowacki
     * * ****************************************************/
    public void addKilometersAndDecreasePrice(double kilometers,double hundredKilometesToPriceReduction){
        setPrice(getPrice() -  kilometers * hundredKilometesToPriceReduction / 100);
        System.out.println(price);
    }
}
