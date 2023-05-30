public class Teacher {
    public void sign(Student student)
    {
         //男生答到 女生答有
        System.out.println("老师点名");
        String gender=student.getGender();
        if(gender.equals("男"))
        {
            System.out.println(student.getName()+"到");
        }
        else{
            System.out.println(student.getName()+"有");
        }
    }
}
