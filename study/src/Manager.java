public class Manager extends Employee{
    int allowance;

    public Manager(int salary,int allowance )
    {
        this.salary=salary;
        this.allowance=allowance;
    }
    public int print( )
    {
     return this.allowance+this.salary;
    }

}
