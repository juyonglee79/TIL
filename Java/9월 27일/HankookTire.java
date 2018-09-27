public class HankookTire extends Tire {
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll(){
        ++accumulateRotaion;
        if(accumulateRotaion<maxRotation) {
            System.out.println(location+"한국타이어 수명: "+ (maxRotation-accumulateRotaion)+"회");
            return true;
        } else {
            System.out.println("*** "+location+ "한국타이어 펑크*** ");
            return false;
        }
    }
}
