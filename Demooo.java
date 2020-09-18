class Mythread extends Thread
{
	public void run()
	{
		for(int i=1; i<=100; i++)
		{
		System.out.print(i + " ");
		}
	}
}

class Demooo
{
	public static void main(String args[])
	{

	Mythread obj = new Mythread();
	Thread t =  new Thread(obj);
	t.start();

	}
}
