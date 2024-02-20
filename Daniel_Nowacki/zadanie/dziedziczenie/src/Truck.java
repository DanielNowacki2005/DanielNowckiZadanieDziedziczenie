public class Truck extends Vehicle{
    protected float maxWeight,height,width,depth;
    protected String typeOfTrailer;

    public Truck(String brand, String name, String id, int productionID, int typeId, double price, double gasTankMax, double kilometersDriven, String type, float maxWeight, float height, float width, float depth, String typeOfTrailer) {
        super(brand, name, id, productionID, typeId, price, gasTankMax, kilometersDriven, type);
        this.maxWeight = maxWeight;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.typeOfTrailer = typeOfTrailer;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public String getTypeOfTrailer() {
        return typeOfTrailer;
    }

    public void setTypeOfTrailer(String typeOfTrailer) {
        this.typeOfTrailer = typeOfTrailer;
    }

    /********************************************************
     * * nazwa funkcji: checkIfWeightIsAllowed
     * * parametry wejściowe: float weightMeasured
     * * wartość zwracana: boolean allowed compares if given weight is allowed on truck
     * * autor: Daniel Nowacki
     * * ****************************************************/
    public boolean checkIfWeightIsAllowed(float weightMeasured){
        if(getMaxWeight() <= weightMeasured){
            return true;
        }
        else{
            return false;
        }
    }
    /********************************************************
     * * nazwa funkcji: checkIfCanPassUnderBridge
     * * parametry wejściowe: bridgeHeight
     * * wartość zwracana: boolean allowed compares if truck can pass under bridge
     * * autor: Daniel Nowacki
     * * ****************************************************/
    public boolean checkIfCanPassUnderBridge(float bridgeHeight){
        if(getHeight() <= bridgeHeight){
            return true;
        }
        else{
            return false;
        }
    }
    /********************************************************
     * * nazwa funkcji: approximateVolumeOfTruck
     * * parametry wejściowe: brak
     * * wartość zwracana: float volume calculates maximum volume of truck
     * * autor: Daniel Nowacki
     * * ****************************************************/
    public float approximateVolumeOfTruck(){
        System.out.println(getHeight()*getDepth()*getWidth());
        return getHeight()*getDepth()*getWidth();
    }
}
