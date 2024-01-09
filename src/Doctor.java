public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor (){
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre asignado es "+ name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    // comportamiento
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("Id doctor "+ id);
    }
}
