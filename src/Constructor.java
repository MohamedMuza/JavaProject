
class Constructor{
    String food;
    String Name;
    //creating a parameterized constructor
    Constructor(String a,String b){
        Name = a;
        food = b;
    }
    //method to display the values
    void show(){System.out.println(Name+" Loves to eat "+food);}

    public static void main(String[] args){
        Constructor s1 = new Constructor("Sunil","Pakoda");
        Constructor s2 = new Constructor("Aryan","Biryani");
        //calling method to display the values of object
        s1.show();
        s2.show();
    }
}