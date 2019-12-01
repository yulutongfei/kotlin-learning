import com.sunxu.kotlin.A

/**
 * @Author 孙许
 * @Date 2019/11/30 19:57
 * @Description
 */

fun main(args: Array<String>) {
    println(function(""))
}

fun function(str: String) {
    val fmt1 = A.format(str)
//    println(fmt1.length)
//    val fmt2: String = A.format(str)
    val fmt3: String? = A.format(str)
    println(fmt3?.length)
}