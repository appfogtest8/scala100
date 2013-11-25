var x = readLine("integer? ").toInt
var i = 1


do {
	if (i % 15 == 0) { println("fizzbuzz"); i+=1 }
	if (i % 3 == 0) { println("fizz"); i+=1 }
	if (i % 5 == 0) { println("buzz"); i+=1 }
	else { println(i); i+=1 }
} while (i <= x)
