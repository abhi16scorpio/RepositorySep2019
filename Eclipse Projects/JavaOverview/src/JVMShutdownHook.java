class CreateShutdownHook extends Thread
{
	public void run()
	{
		System.out.println("Shutdown hook called...");
	}
}

class CreateShutdownHook1 extends Thread
{
	public void run()
	{
		System.out.println("Shutdown1 hook called...");
	}
}

class CreateShutdownHook2 extends Thread
{
	public void run()
	{
		System.out.println("Shutdown2 hook called...");
	}
}

class CreateShutdownHook3 extends Thread
{
	public void run()
	{
		System.out.println("Shutdown3 hook called...");
	}
}

public class JVMShutdownHook
{
	public static void main(String[] args) 
	{
		Runtime.getRuntime().addShutdownHook(new CreateShutdownHook1());
		Runtime.getRuntime().addShutdownHook(new CreateShutdownHook2());
		Runtime.getRuntime().addShutdownHook(new CreateShutdownHook3());
		Runtime.getRuntime().addShutdownHook(new CreateShutdownHook());
		System.out.println("JVM is shutting down...");
		System.exit(0);
	}
}