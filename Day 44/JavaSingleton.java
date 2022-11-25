import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSingleton
{

	public String str;
    private static Singleton singleton = new Singleton();
    
    private Singleton(){};
    
    public static Singleton getSingleInstance()
    {
        return singleton;
    }
}
