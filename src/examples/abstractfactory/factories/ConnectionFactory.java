package examples.abstractfactory.factories;

import examples.abstractfactory.models.Connection;
import examples.abstractfactory.models.ConnectionMsSQL;
import examples.abstractfactory.models.ConnectionMySQL;
import examples.abstractfactory.models.Shape;

public class ConnectionFactory extends AbstractFactory {
  
  @Override
  public Connection getConnection(String type)
  {
    Connection connection = null;

    switch(type)
    {
      case "mysql": {

        connection = new ConnectionMySQL();
        break;
      }
      
      case "mssql": {
        
        connection = new ConnectionMsSQL();
        break;
      }

      default: {
        break;
      }
    }

    return connection;
  }

  @Override
  public Shape getShape(String type)
  {
    return null;
  }
}
