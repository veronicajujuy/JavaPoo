public class Patient {
    String name, email, address, phoneNumber, birthday, blood;
    double weight, height;

    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void showData(){
        System.out.println("name = " + name);
        System.out.println("email = " + email);
    }
}
