# An important calculator: Area under the curve and Weighted averages

I needed an area under the curve and weighted average calculator for a small project of mine, so I decided to make a simple program to compute it.


# Area under the curve

Simple concept. The program does a brute force calculation of the summation of the function times the small change in the function value. It turns out to be quite accurate.
If you solve this integral: exp (-x^2) from -inf to inf, you get the value of the integral as pi/root2.

On using the area-under-the-curve calculator you get the value as: 1.77245 Which is SUPER accurate actually! And I only took the range from -25 to 25. 0.01 is the change in x, which is a pretty small number so it changes quite nicely. -25 to 25 only works because the curve of exp(-x^2) starts to fall flat quite soon on either side (which is why I picked this particular function to be honest)

![alt-text](https://raw.githubusercontent.com/pranay-venkatesh/RandomStats/master/AUC/Output1.png)



# Weighted average

The weighted average function (as I define it) is the integral of xf(x) for a given range divided by the length of the range. So, what is the average value of the above function? Well, the integral of x exp(-x^2) is a trifle matter to calculate. And the area comes out to be 1! So, we take the average for our set range (-25 to 25), and hence we divide 1 by 50 to get 0.02 as the required weighted average.

Our computation, here, follows the same integration brute force principle as the area calculation.

The value we got was SUPER close:

![alt-text](https://raw.githubusercontent.com/pranay-venkatesh/RandomStats/master/AUC/Output2.png)

# Plotting the curve

Nothing to say here. Basic R graph-plotting. The graph came out quite nicely, too.

![alt-text](https://raw.githubusercontent.com/pranay-venkatesh/RandomStats/master/AUC/epowx.png)


