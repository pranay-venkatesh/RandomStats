# RandomStats
A bunch of random statistics calculations (mainly R and Java)

# Ranji Correlation

After watching the reason Ranji Trophy finals, it occurred to me that there is a strong connection between winning the toss in the finals and winning the match. So, I quickly wrote a Java program to use Pearson's Correlation Formula to find out whether there is a correlation between winning Ranji Finals and winning the toss in Ranji Finals.

It chews data from a file containing various matchwins + tosswins for different season and spits out one line of text

![alt text](https://raw.githubusercontent.com/pranay-venkatesh/RandomStats/master/RanjiCorrelationData/rValueScreenshot.png)


# Area under the curve and Weighted Average

A common required calculation is area under the curve. Weighted average is 1/range * integral(xf(x)) for the range (pardon my formatting skills, I'm working on it).

![alt-text](https://raw.githubusercontent.com/pranay-venkatesh/RandomStats/master/AUC/epowx.png)

for the above curve which is exp (-x^2), we get the area under the curve to be:

![alt-text](https://raw.githubusercontent.com/pranay-venkatesh/RandomStats/master/AUC/Output1.png)

The actual area is supposed to be pi/root2, and this value ends up being accurate! So, not bad.

# AUC Any function

A new tool! So, I have a maths exam coming up and I often feel like checking my work and seeing whether I'm computing my integrals correctly or not. So, I use this tool to find out::

![alt-text](https://raw.githubusercontent.com/pranay-venkatesh/RandomStats/master/AUC_Any_Function/Output1.png)

Enter any syntactically correct function in Java and the program will find you your solution for a neat range.
