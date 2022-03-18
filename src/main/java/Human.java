public class Human {

    String Nombre;
    int Edad;

    public Human(String Nombre, int Edad){

        this.Edad=Edad;
        this.Nombre=Nombre;
    }

    public void print(){
        System.out.print("Nombre " + this.Nombre + " Edad " + this.Edad);
    }
}
