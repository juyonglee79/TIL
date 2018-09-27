public class Tire {
    public int maxRotation;
    public int accumulateRotaion;
    public String location;

    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll(){
        ++accumulateRotaion;
        if(accumulateRotaion<maxRotation) {
            System.out.println(location + "Tire 수명: " + (maxRotation-accumulateRotaion) +"회");
        return true;
        } else {
            System.out.println("*** " + location +"Tire 펑크 ***");
            return false;
        }
    }
}
