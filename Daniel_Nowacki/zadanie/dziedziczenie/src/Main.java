public class Main {
    public static void main(String[] args) {

        Vehicle tester = new Vehicle("some","car","92",0,1,20.555,16.31,2000.43,"none");
        Vehicle testing = new Vehicle("other","carr","91",1,2,2200.555,12.51,0,"car");
        Vehicle testing2 = new Vehicle("car","carrr","90",2,3,2420.555,22.22,0,"car");

        Car car1 = new Car("some","car","92",0,1,20,6.31,20000.43,"none","winter","some",3,90);
        Car car2 = new Car("awsome","cool","2",2,1,0.555,1.31,20.43,"none","winter","some",2,190);
        Car car3 = new Car("not truck","truck","9",5,5,421520.555,0.31,20020.43,"none","winter","some",4,40);

        Truck truck1 = new Truck("some","car","92",0,1,20,6.31,20000.43,"none",200,200,200,200,"tooMuchWriting");
        Truck truck2 = new Truck("some","car","92",0,1,20,6.31,20000.43,"none",200,200,200,200,"tooMuchWriting");
        Truck truck3 = new Truck("some","car","92",0,1,20,6.31,20000.43,"none",200,200,200,200,"tooMuchWriting");

        tester.showInformation();
        testing.showInformation();
        testing2.showInformation();

        car1.changeTiresToSummer();
        car2.changeTiresToSummer();
        car3.changeTiresToSummer();

        truck1.approximateVolumeOfTruck();
        truck2.approximateVolumeOfTruck();
        truck3.approximateVolumeOfTruck();

    }
}