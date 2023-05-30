public class EmploeeDemo {
    public static void main(String[] args) {
        Employee p1=new Employee();
        p1.setSalary(5000);
       Employee p2=new Manager(6000,2000);
        System.out.println(p1.print()+","+p2.print());

    }
}
