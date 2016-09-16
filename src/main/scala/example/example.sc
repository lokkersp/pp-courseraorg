
def sumSegment(a: Array[Int],p:Double,s:Int,t:Int):Int = {
var acc = 0
  for (i <- s until t-1) {
  acc += Math.abs(a((i))) ~^ p
}
  return acc
}