public class Dog {

    String Nombre;
    int Edad;

    public Dog(String Nombre, int Edad){

        this.Edad=Edad;
        this.Nombre=Nombre;
    }

    public void print(){
        System.out.print("Nombre " + this.Nombre + " Edad " + this.Edad);
    }
}
}
