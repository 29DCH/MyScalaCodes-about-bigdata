object TestHash {

  def main(args: Array[String]) {
    val key = "php.itcast.cn"
    val mod = 5
    val rawMod = key.hashCode % mod
    val partNum = rawMod + (if (rawMod < 0) mod else 0)
    println(partNum)
  }

}
