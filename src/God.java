public class God {
    public static Human[] create(){
        Human[] result;
        result = new Human[]{new Man(), new Woman()};
        //code
        return result;
    }

}
class Human{}
class Man extends Human{
}
class Woman extends Human{
}
