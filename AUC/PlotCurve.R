# An unnecessary, but fun plot of the exp (-x^2) curve. Just for fun
# This is to improve my R skills. You may ignore this, as it has no relevance to the project.

eq = function(x){exp(-(x*x))}

png ('epowx.png')

plot (eq(-25:25), xlab = "x", ylab = "e^x*x", type = "l")

dev.off()
