import java.util.*;
import java.io.*;
public class RanjiCorrelationData {
	public static void main (String[]args) throws IOException
	{
		File f = new File ("RanjiData.txt");
		Scanner in = new Scanner (f);
		
		/*xValues is a list of points assigned to the winning team for a given season.
		 *  It's 1, if the win is only first innings lead and 2 if it's a solid win.
		 *  yValues is a check on whether the winning team was the same team that won the match,
		 *  It's 0 if the winning team did not win the toss, else 1.  		
		 */
		
		ArrayList<Integer> xValues = new ArrayList<Integer>();
		ArrayList<Integer> yValues = new ArrayList<Integer>();
		
		in.nextLine();
		
		while (in.hasNextLine())
		{
			int currx=0, curry=0;
			String l = in.nextLine();
			String words[] = l.split(" ");
			if (words[0].charAt(words[0].length()-1) == '*')
				currx = 1;
			else currx = 2;
			
			if (words[0].equals(words[1])) curry = 1;
			else curry = 0;
			
			xValues.add(currx);
			yValues.add(curry);
				
		}
		
		double r=0;
		double meanx=0;
		double meany=0;
		
		double numerator = 0;
		double denx = 0;
		double deny = 0;
		
		for (int i = 0; i < xValues.size(); i++)
		{
			meanx += xValues.get(i);
			meany += yValues.get(i);
		}
		
		meanx = meanx/(xValues.size());
		meany = meany/(yValues.size());
		
		for (int i = 0; i < xValues.size(); i++)
		{
			numerator += (xValues.get(i) - meanx)*(yValues.get(i) - meany);
			denx += Math.pow((xValues.get(i) - meanx), 2);
			deny += Math.pow((yValues.get(i) - meany),2);
		}
		denx = Math.pow(denx, 0.5);
		deny = Math.pow(deny, 0.5);
		double denominator = denx*deny;
		
		r = numerator/denominator;
		
		System.out.println("r value of correlation = " + r);
		
		
		
	}

}
