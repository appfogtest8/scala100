// built with scala 2.10.3

var x = readLine("? ")

var b = x.toLowerCase.toList.filter((i: Char) => i != ' ')

if ((b take (b.length / 2)) == (b.reverse take (b.length / 2))){
	println("yes");
	}else{
	println("no");
}