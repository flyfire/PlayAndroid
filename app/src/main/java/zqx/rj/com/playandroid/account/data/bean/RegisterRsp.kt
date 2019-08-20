package zqx.rj.com.playandroid.account.data.bean

/**
 * author：  HyZhan
 * created： 2018/10/30 16:31
 * desc：    注册返回bean
 */
data class RegisterRsp(
        val username: String,
        val id: Int,
        val icon: String,
        val type: Int,
        val collectIds: List<Int>
)