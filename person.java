public class person
{
  String name;
	int age;

	public void setName(String name) //void dan tidak ada nilai yang harus  kembali
	{
    this.name=name;
	}

	public String getName() //non void dan harus ada nilai yang dikembalikan (return)//
	{
		return name;
	}

	public void setAge(int age)
	{
    this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
}
