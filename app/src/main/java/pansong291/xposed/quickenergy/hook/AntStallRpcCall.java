package pansong291.xposed.quickenergy.hook;

import java.util.UUID;

/**
 * @author Constanline
 * @since 2023/08/22
 */
public class AntStallRpcCall {
    private static final String VERSION = "0.1.2308081346.4";

    public static String home() {
        return RpcUtil.request("com.alipay.antstall.self.home",
                "[{\"arouseAppParams\":{},\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" +
                        VERSION + "\"}]");
    }

    public static String settle(String assetId, int settleCoin) {
        return RpcUtil.request("com.alipay.antstall.self.settle",
                "[{\"assetId\":\"" + assetId + "\",\"coinType\":\"MASTER\",\"settleCoin\":" + settleCoin +
                        ",\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\""
                        + VERSION + "\"}]");
    }

    public static String shopList() {
        return RpcUtil.request("com.alipay.antstall.shop.list",
                "[{\"freeTop\":false,\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" +
                        VERSION + "\"}]");
    }

    public static String preOneKeyClose() {
        return RpcUtil.request("com.alipay.antstall.user.shop.close.preOneKey",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\""
                        + VERSION + "\"}]");
    }

    public static String oneKeyClose() {
        return RpcUtil.request("com.alipay.antstall.user.shop.oneKeyClose",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\""
                        + VERSION + "\"}]");
    }

    public static String preShopClose(String shopId, String billNo) {
        return RpcUtil.request("com.alipay.antstall.user.shop.close.pre",
                "[{\"billNo\":\"" + billNo + "\",\"shopId\":\"" + shopId +
                        "\",\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" + VERSION + "\"}]");
    }

    public static String shopClose(String shopId) {
        return RpcUtil.request("com.alipay.antstall.user.shop.close",
                "[{\"shopId\":\"" + shopId + "\",\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" + VERSION + "\"}]");
    }

    public static String oneKeyOpen() {
        return RpcUtil.request("com.alipay.antstall.user.shop.oneKeyOpen",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\""
                        + VERSION + "\"}]");
    }

    public static String shopOpen(String friendSeatId, String friendUserId, String shopId) {
        return RpcUtil.request("com.alipay.antstall.user.shop.open",
                "[{\"friendSeatId\":\"" + friendSeatId + "\",\"friendUserId\":\"" + friendUserId + "\",\"shopId\":\"" +
                        shopId + "\",\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" + VERSION + "\"}]");
    }
    public static String rankCoinDonate() {
        return RpcUtil.request("com.alipay.antstall.rank.coin.donate",
                "[{\"source\":\"ANTFARM\",\"systemType\":\"android\",\"version\":\"" + VERSION + "\"}]");
    }
    public static String friendHome(String userId) {
        return RpcUtil.request("com.alipay.antstall.friend.home",
                "[{\"arouseAppParams\":{},\"friendUserId\":\"" + userId +
                        "\",\"source\":\"ANTFARM\",\"systemType\":\"android\",\"version\":\"" + VERSION + "\"}]");
    }


    public static String taskList() {
        return RpcUtil.request("com.alipay.antstall.task.list",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" +
                        VERSION + "\"}]");
    }

    public static String signToday() {
        return RpcUtil.request("com.alipay.antstall.sign.today",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" +
                        VERSION + "\"}]");
    }

    public static String finishTask(String outBizNo, String taskType) {
        return RpcUtil.request("com.alipay.antiep.finishTask",
                "[{\"outBizNo\":\"" + outBizNo +
                        "\",\"requestType\":\"RPC\",\"sceneCode\":\"ANTSTALL_TASK\",\"source\":\"AST\",\"systemType\":\"android\",\"taskType\":\"" +
                        taskType + "\",\"version\":\"" + VERSION + "\"}]");
    }

    public static String receiveTaskAward(String taskType) {
        return RpcUtil.request("com.alipay.antiep.receiveTaskAward",
                "[{\"ignoreLimit\":true,\"requestType\":\"RPC\",\"sceneCode\":\"ANTSTALL_TASK\",\"source\":\"AST\",\"systemType\":\"android\",\"taskType\":\"" +
                        taskType + "\",\"version\":\"" + VERSION + "\"}]");
    }

    public static String taskFinish(String taskType) {
        return RpcUtil.request("com.alipay.antstall.task.finish",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"taskType\":\"" + taskType + "\",\"version\":\"" +
                        VERSION + "\"}]");
    }

    public static String taskAward(String amount, String prizeId, String taskType) {
        return RpcUtil.request("com.alipay.antstall.task.award",
                "[{\"amount\":" + amount + ",\"prizeId\":\"" + prizeId +
                        "\",\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"taskType\":\""
                        + taskType + "\",\"version\":\"" + VERSION + "\"}]");
    }

    public static String taskBenefit() {
        return RpcUtil.request("com.alipay.antstall.task.benefit",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" +
                        VERSION + "\"}]");
    }

    public static String collectManure() {
        return RpcUtil.request("com.alipay.antstall.manure.collectManure",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" +
                        VERSION + "\"}]");
    }

    public static String queryManureInfo() {
        return RpcUtil.request("com.alipay.antstall.manure.queryManureInfo",
                "[{\"queryManureType\":\"ANTSTALL\",\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" +
                        VERSION + "\"}]");
    }

    public static String projectList() {
        return RpcUtil.request("com.alipay.antstall.project.list",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" + VERSION + "\"}]");
    }

    public static String projectDetail(String projectId) {
        return RpcUtil.request("com.alipay.antstall.project.detail",
                "[{\"projectId\":\"" + projectId +
                        "\",\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" + VERSION + "\"}]");
    }

    public static String projectDonate(String projectId) {
        return RpcUtil.request("com.alipay.antstall.project.donate",
                "[{\"bizNo\":\"" + UUID.randomUUID().toString() + "\",\"projectId\":\"" + projectId +
                        "\",\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" + VERSION + "\"}]");
    }

    public static String roadmap() {
        return RpcUtil.request("com.alipay.antstall.village.roadmap",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" + VERSION + "\"}]");
    }

    public static String nextVillage() {
        return RpcUtil.request("com.alipay.antstall.user.ast.next.village",
                "[{\"source\":\"ch_appcenter__chsub_9patch\",\"systemType\":\"android\",\"version\":\"" + VERSION + "\"}]");
    }
}
