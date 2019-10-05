
/**
 * A simple program that demonstrates Fibonacci Sequence What is a Fibonacci Sequence? : https://www.mathsisfun.com/numbers/fibonacci-sequence.html
 * The program is based on my own Gist created on GitHub with the use JavaScript. : https://gist.github.com/iasjem/fcebad64c56008ceb4340dbae5291e3b 
 * Java version of program: https://github.com/iasjem/fibonacci-sequence-java
 */

fun main (args: Array<String>) {
	
	var a:Int=0
	var b:Int=1
	var c:Int
	
	for (i in 0..13){
		c = a+b;
		print("$a + $b = $c \n")
		a=b;
		b=c;
	}
}

// Look how short my program is here in Kotlin? Wonderful! :D
