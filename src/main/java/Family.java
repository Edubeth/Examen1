public class Family <E extends object> {

    private E Mama;
    private E Papa;
    private E[] Hijos;

    public Family(E Mama, E Papa, E[] Hijos){

        this.Papa=Papa;
        this.Mama=Mama;
        this.Hijos=Hijos;
    }
}
