public class DmbCellPhone extends CellPhone {
    String channel;

    DmbCellPhone(String model, String color, String  channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb(){
        System.out.println("채널 "+channel+"번으로 바꿉니다.");
    }
    void changeChannelDmb(String channel) {
        this.channel = channel;
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
//String channel로 해야지만 돌아감 int로 해야지 맞는건데 int로 하면 오류가남