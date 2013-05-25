public class testPerson
{
public static void main(String[] arc)
     {
       String nama = "ahmed";
     	int umur = 78;

     	String nama2 = "budi";
     	int umur2 = 20;

		person p = new person();
		person p1 = new person();

	    p.setName(nama);
	    p.setAge(umur);
	    
	    p1.setName(nama2);
	    p1.setAge(umur2);
	    
	    System.out.println("=====================");
	    System.out.println("data manusia pertama");
	    System.out.println("nama :"+p.getName());
	    System.out.println("umur :"+p.getAge());   
	    System.out.println("=====================");
	    System.out.println("");
	    System.out.println("=====================");
	    System.out.println("data manusia kedua");
	    System.out.println("nama :"+p1.getName());
	    System.out.println("umur :"+p1.getAge());   
	    System.out.println("=====================");
     }
}
