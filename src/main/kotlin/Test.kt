import com.sunxu.prospring.MessageProvider

/**
 * @Author 孙许
 * @Date 2019/11/30 20:04
 * @Description
 */
class Test : MessageProvider{
    override fun getMessage(): String {
        println("你好")
        return "你好"
    }
}