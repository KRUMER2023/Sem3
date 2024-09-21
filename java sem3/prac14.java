interface  A
{
    void getData();  
    void getName();
}
interface B extends A
{
    void getAge();
    void getEmail();
}


class C  implements B
{

    @Override
    public void getData() {
        System.out.println("Data:"+10000);
    }

    @Override
    public void getName() {
        System.out.println("Name: Akash");
    }

    @Override
    public void getAge() {
        System.out.println("Age: "+45);
    }

    @Override
    public void getEmail() {
        System.out.println("email: Akash123@gmail.com");
    }
}



public class prac14 {

    public static void main(String[] args) {
        C c=new C();
        c.getData();
        c.getName();
        c.getEmail();
        c.getAge();
    }

}