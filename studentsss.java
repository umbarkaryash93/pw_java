class Studen{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }

}
public class studentsss 
{
    public static void main(String args[]) {
        Studen st=new Studen();
        st.setAge(18);
        st.setName("Yash");
        System.out.println(st.getAge());
        System.out.println(st.getName());

        Studen st1=new Studen();
        st1.setAge(188);
        st1.setName("YashUmbarkar");
        System.out.println(st1.getAge());
        System.out.println(st1.getName());
    }
}
