import com.sun.org.apache.xml.internal.security.utils.Constants;

import java.io.IOException;
import java.lang.reflect.*;
public class App {
    static public StringBuffer pomoika;
    static public void main (String args[]) throws NoSuchFieldException {
        System.out.println("Hello");
        myfunc(Potomok.class);

    }
    static public Object myfunc (Class Myclass) throws IndexOutOfBoundsException {
        Field[] fl;
        Method[] Mt;
       // Constructor[] Cr;
        Class st;
        App.pomoika.setLength(100);
        Class PredokInter = null;
        Class[] interHuinter = new Class[0];
        Class[] Perdok = new Class[0];
        fl = Myclass.getDeclaredFields();
        Mt = Myclass.getDeclaredMethods();
        //st = Myclass.getClass();
       //st = Myclass.getDeclaringClass();
       st = Myclass.getSuperclass();
        interHuinter = Myclass.getInterfaces();
       try{
           Perdok = interHuinter[0].getInterfaces();
       }
       catch (IndexOutOfBoundsException e)
       {
          System.out.println("ERROR");
          if(st != null) {
              myfunc(st);
          }
          else {
              return 0;
          }
          return 0;
       }
       myfunc(Perdok[0]);


       //throw new NoSuchFieldException("String can not be empty!");
           


        //Cr = Myclass.getDeclaredConstructors();
        //Field fl2 = Myclass.getDeclaredField("absoulythuinya");
        return 0;

    }
}
