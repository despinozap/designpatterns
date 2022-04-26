/**
 *
 * @author David Espinoza
 */

public class App {
	
	public static void main(String[] args)
	{
		System.out.println("[*] Application running");

		/**
		 * Singleton
		 */
		{		
			new examples.singleton.Example();
		}

		/**
		 * Factory
		 */
		{		
			new examples.factory.Example();
		}
	}
}