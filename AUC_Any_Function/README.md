# AUC Any function

So...I wasn't really satisfied with my earlier AUC tool, because it didn't let the user have much freedom. Well, all that has changed with my new AUC tool.
Now, you can type in any function (so long as it's syntactically correct in Java, with a semicolon, mind you) and voila! It will give you the area, so long as you choose some reasonable limits.

The most challenging part of this was trying to figure out how to get the computer to program itself, essentially. I made it write the required function to a file, but it still didn't give me a desired result. So, I decided to employ the compiler class and now it works like a charm.
The functio.java file will constantly change as per the required function entered into the main program, so be very wary of that.

* Test Run

So, the other day, my school wanted to piss us off (I guess), so they asked us to solve : 1/(1+x^4) integral from (-inf, inf).
This class was 1 hour long and that's all we had to do. I was clever and I used complex analysis to get the answer and I shouted it out. Then, they asked for the solution and I went erm....(because we weren't taught complex analysis yet). That was when I realised how we were supposed to do it. We were supposed to find the trivial antiderivative of this function and then substitute the limits. I mean, COME ON! Do you know how gruelling it is to calculate the antiderivate of a crappy fourth degree function! It took me a super long time and I caught myself wishing I had a calculator like-a this!

![alt-text](https://raw.githubusercontent.com/pranay-venkatesh/RandomStats/master/AUC_Any_Function/Output1.png)

This is a brute-force integral (for all those who haven't seen the original AUC project), which computes the integral using an approximate summation.

The clever way to solve this is using the Cauchy Residue Theorem, (which is what I did in class originally to get the answer). Anywho, here's the solution using complex analysis (Source :: MIT)

![alt-text](https://raw.githubusercontent.com/pranay-venkatesh/RandomStats/master/AUC_Any_Function/MITCauchy.png)

So, BOOM! You can do calculate any area you wish to (approximate to three or so decimal places) without gruelling calculations of antiderivatives, or finding out the residues of some arbitrary complex function.


* Plotter

The program also writes code into an R file called "fPlot.R", which you have to manually execute unfortunately. Once you execute fPlot.R, you get a .png file called "function.png", which when you open, will reveal a nice curve of the required function for the required range.

![alt-text](https://raw.githubusercontent.com/pranay-venkatesh/RandomStats/master/AUC_Any_Function/function.png)


Feel free to use this tool as you wish.

Enjoy!
