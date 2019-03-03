f = function(x){1/(1 + (x*x*x*x))}

png ('function.png')

plot (f(-25:25), xlab = "x", ylab = "1/(1 + x^4)", type = "l")
dev.off()
