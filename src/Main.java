// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // esto es igual a la definición de abajo
       Doctor myDoctor = new Doctor("Dr. Pablo Menendez", "Gastroenterólogo");
        System.out.println("myDoctor.name = " + myDoctor.name);
        System.out.println("myDoctor.speciality = " + myDoctor.speciality);
        myDoctor.showId();

        Doctor myDoctor2 = new Doctor("Dr. Carlos Santos", "Reumatólogo");
        System.out.println("myDoctor2 = " + myDoctor2.name);
        System.out.println("myDoctor2 = " + myDoctor2.speciality);
        myDoctor2.showId();

        Patient paciente1 = new Patient("Vero", "veronica@gmail.com");
        paciente1.showData();
    }

}