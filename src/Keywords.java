public class Keywords {
    int id;
    //current class instance "this" is used
    public Keywords(int id)
    {
    this.id = id;
    System.out.println("My id card Number is " + id);
    }
    public void simpleFun()
    {
        System.out.println("I am a normal function called by object");
    }
    public static void main(String[] args){
        final Integer a =6;
        // final value cannot be changed to a=5;
        Keywords obj1 = new Keywords(27);
        obj1.simpleFun();
    }
}
