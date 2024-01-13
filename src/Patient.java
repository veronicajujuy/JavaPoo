public class Patient extends User{
    private String birthday, blood;
    private double weight, height;

    Patient(String name, String email){
        super(name,email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getWeight(){
        return weight+ " Kg.";
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getHeight() {
        return height + "Mts.";
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Age: "+ birthday + "\n Weight: "+ getWeight() + "\n Height: "+ getHeight();
    }
}
