public class KumhoTire extends Tire {
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll(){
        ++accumulateRotaion;
        if(accumulateRotaion<maxRotation) {
            System.out.println(location+"금호타이어 수명: "+ (maxRotation-accumulateRotaion)+"회");
            return true;
        } else {
            System.out.println("*** "+location+ "금호타이어 펑크*** ");
            return false;
        }
    }
}
