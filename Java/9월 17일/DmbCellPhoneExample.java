public class DmbCellPhoneExample  {
    public static void main(String[] arg){
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정","10");

        System.out.println("모델: "+ dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);
        System.out.println("채널: "+ dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕");
        dmbCellPhone.sendVoice("ㅎㅇㅎㅇ");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb("12");
        dmbCellPhone.turnOnDmb();
    }
}
