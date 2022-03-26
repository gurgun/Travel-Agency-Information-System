package TravelAgencyInformationSystem;


public class Advices {
    private String AdviceSubject; // data members for giving advices
    private String Explaining;

    //set get methods:
    public void setSubject(String subject){
        AdviceSubject = subject;
    }
    public String getSubject() {
        return AdviceSubject;
    }
    public void setExplaining(String explaining) {
        Explaining = explaining;
    }
    public String getExplaining(){
        return Explaining;
    }
}