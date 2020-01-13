//Method Overriding - RUN-TIME /DYNAMIC POLYMORPHISM
public class method_overriding {
int id;
void display()
{
    System.out.println("I'm a method of Parent class!");
}
}
class childclass extends method_overriding
{
    void display()
    {
        super.display();//Used to invoke the method of immediate parent class 
        System.out.println("I'm a method of child class!");
    }
public static void main(String args[])
{
    childclass c=new childclass();
    c.display();
}
}