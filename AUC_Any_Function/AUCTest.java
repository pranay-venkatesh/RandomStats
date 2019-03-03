
/*Area Test in Java
 */

import java.io.*;
import java.util.*;
import javax.tools.*;


public class AUCTest {
    
    void setF (String fun) throws Exception
    {
        File f = new File ("functio.java");
        f.delete();
        f.createNewFile();
        //System.out.println(f.canWrite());
        PrintWriter pw = new PrintWriter(f);
        
        
        pw.println("import java.util.*;");

        pw.println("public class functio {");
        
        pw.println("double function (double x) {");
        
        pw.println("double val = " + fun);
        
        pw.println("return(val);");
        
        pw.println("}}");
        
        pw.close();
        
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, null, null, "functio.java");
        
    }
    
    void plot(String f1, double lB, double uB) throws Exception
    {
        File f = new File ("fPlot.R");
        f.createNewFile();
        PrintWriter pw = new PrintWriter (f);
        
                
        pw.println("f = function(x){" + f1 + "}");
        
        pw.println("png ('function.png')");
        String m = "plot (f(" + lB + ":" + uB + ")" + " xlab = 'x', ylab = '1/(1 + x^4)', type = 'l')";
        pw.println(m);
        pw.println("dev.off()");
        pw.close();
    }
    
    double findArea(double lowerBound, double upperBound, double deltai)
    {
        functio ob = new functio();
        
        double area = 0;
        
        for (double i = lowerBound; i <= upperBound; i += deltai)
        {
            area += deltai * ob.function(i);
        }
        
        return(area);
    }
    
    public static void main (String[]args) throws Exception
    {
        
        Scanner in = new Scanner (System.in);
        AUCTest ob = new AUCTest();
        System.out.println("Enter the function in Java syntax");
        String f = in.nextLine();
        ob.setF(f);
        System.out.println("Set lower bound, upper bound, variation");
        double lB = in.nextDouble();
        double uB = in.nextDouble();
        double v = in.nextDouble();
        System.out.println(ob.findArea(lB, uB, v)); 
        
        ob.plot(f, lB, uB);
        
        in.close();
        
        
    }
    
}
