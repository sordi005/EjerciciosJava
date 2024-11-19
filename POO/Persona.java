public class Persona {

    String name;
    String lastName;
    int document;
    String dateOfBirthd ;
    String birthdCountry;
    String gender;

    Persona(String name,  String lastName, int document,String dateOfBirthd,String birthdCountry, String gender){
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.dateOfBirthd = dateOfBirthd;
        this.birthdCountry = birthdCountry;
        this.gender = gender;

    }

    void showInformation() {

        System.out.println("Nombre: "+name);
        System.out.println("Apellido: "+ lastName);
        System.out.println("Documento: " + document );
        System.out.println("Fecha/Nacimiento: "+ dateOfBirthd);
        System.out.println("Pais De Nacimineto: "+ birthdCountry);
        System.out.println("Género: "+ gender);


    }

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan","Rodriguez",46547484,"04/08/05", "Australia","No Definido" );
        persona1.showInformation();


    }
}