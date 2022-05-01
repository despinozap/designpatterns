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

		/**
		 * Abstract Factory
		 */
		{		
			new examples.abstractfactory.Example();
		}

		/**
		 * Prototype
		 */
		{
			new examples.prototype.Example();
		}

		/**
		 * Facade
		 */
		{
			new examples.facade.Example();
		}

		/**
		 * Decorator
		 */
		{
			new examples.decorator.Example();
		}

		/**
		 * Proxy
		 */
		{
			new examples.proxy.Example();
		}

		/**
		 * Command
		 */
		{
			new examples.command.Example();
		}

		/**
		 * Memento
		 */
		{
			new examples.memento.Example();
		}
	}
}