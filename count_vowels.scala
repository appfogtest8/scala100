var x = readLine("? ").toLowerCase.toList.toSeq

var vowels = "aeiou".toList.toSeq

println(x.size - (x.filter((i: Char) => !vowels.contains(i)).size))