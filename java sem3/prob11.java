
public class prob11 {
    public static void main(String[] args) {

        Emp E1 = new Emp();
        Emp E2 = new Emp();
        Emp E3 = new Emp();
        Emp E4 = new Emp();

        E1.setEM_name("Mukesh");
        E1.setEM_ID(101);
        E1.setEM_salary(50000);

        E2.setEM_name("Ramesh");
        E2.setEM_ID(102);
        E2.setEM_salary(50000);

        E3.setEM_name("Ganesh");
        E3.setEM_ID(103);
        E3.setEM_salary(50000);

        E4.setEM_name("Mangesh");
        E4.setEM_ID(104);
        E4.setEM_salary(50000);

        System.out.println(E1.getEM_name());
        System.out.println(E1.getEM_ID());
        System.out.println(E1.getEM_salary());

        System.out.println(E2.getEM_name());
        System.out.println(E2.getEM_ID());
        System.out.println(E2.getEM_salary());

        System.out.println(E3.getEM_name());
        System.out.println(E3.getEM_ID());
        System.out.println(E3.getEM_salary());

        System.out.println(E4.getEM_name());
        System.out.println(E4.getEM_ID());
        System.out.println(E4.getEM_salary());
    }

}

class Emp {
    private String EM_name;
    private int EM_ID;
    private float EM_salary;

    public String getEM_name() {
        return this.EM_name;
    }

    public void setEM_name(String eM_name) {
        this.EM_name = eM_name;
    }

    public int getEM_ID() {
        return this.EM_ID;
    }

    public void setEM_ID(int eM_ID) {
        this.EM_ID = eM_ID;
    }

    public float getEM_salary() {
        return this.EM_salary;
    }

    public void setEM_salary(float eM_salary) {
        this.EM_salary = eM_salary;
    }
}
