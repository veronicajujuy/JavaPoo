// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // esto es igual a la definición de abajo
       Doctor myDoctor = new Doctor("Dr. Pablo Menendez", "mm", "Gastroenterólogo");
        System.out.println("myDoctor.name = " + myDoctor.getName());
        System.out.println("myDoctor.speciality = " + myDoctor.getSpeciality());

        Doctor myDoctor2 = new Doctor("Dr. Carlos Santos", "mail","Reumatólogo");
        System.out.println("myDoctor2 = " + myDoctor2.getName());
        System.out.println("myDoctor2 = " + myDoctor2.getSpeciality());

        // clase paciente
        Patient paciente1 = new Patient("Vero", "veronica@gmail.com");
        paciente1.setHeight(1.54);
        System.out.println("paciente1.getHeight() = " + paciente1.getHeight());
        paciente1.setWeight(54.5);
        System.out.println("paciente1.getWeight() = " + paciente1.getWeight());

        // variables y objetos
        int i = 0;
        System.out.println("i = " + i);
           int b = 2;
        System.out.println("b = " + b);
        b = i;
        System.out.println("b = " + b);

        Patient patient1 = new Patient("Juan", "JuanPerez@gmail.com");
        Patient patient2 = new Patient("Julia", "Julia@gmail.com");
        System.out.println("patient1 = " + patient1);
        System.out.println("patient1 = " + patient1.getName());
        System.out.println("patient2 = " + patient2);
        System.out.println("patient2 = " + patient2.getName());

        patient2 = patient1;
        System.out.println("patient1 = " + patient1);
        System.out.println("patient2 = " + patient2);
        System.out.println("patient1 = " + patient1.getName());
        System.out.println("patient2 = " + patient2.getName());

        patient2.setName("Vanina");

        System.out.println("patient1 = " + patient1);
        System.out.println("patient2 = " + patient2);
        System.out.println("patient1 = " + patient1.getName());
        System.out.println("patient3 = " + patient2.getName());

    }

}