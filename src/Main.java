// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // esto es igual a la definición de abajo
        // Doctor myDoctor;
        // myDoctor = new Doctor();
        Doctor myDoctor = new Doctor();
        myDoctor.name ="Dr. Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        System.out.println(Doctor.id);
    }

}