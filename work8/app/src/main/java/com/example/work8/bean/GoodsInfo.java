package com.example.work8.bean;

import com.example.work8.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "Armani", "纪梵希", "兰蔻菁纯", "魅可尤雾弹", "魅可冰纷烟花", "圣罗兰细管","香奈儿唇釉","香奈儿唇膏"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Armani/阿玛尼红管唇釉番茄色丝绒哑光口红405/208/209",
            "【官方正品】GIVENCHY纪梵希美炸红丝绒口红唇膏N37 哑光",
            "兰蔻全新菁纯柔雾哑光唇膏口红 888小野莓 196胡萝卜",
            "【官方正品】MAC/魅可尤雾弹唇膏口红大牌正品316/923奶茶色",
            "【圣诞提前抢】MAC/魅可冰纷烟花限定口红唇膏 Lisa同款314奶茶色",
            "【新品】YSL圣罗兰细管柔光口红小粉条哑光口红新色214琥珀南瓜棕",
            "【官方正品】CHANEL 香奈儿炫亮魅力印记唇釉哑光口红 154 836",
            "【官方正品】CHANEL 香奈儿炫亮魅力唇膏黑金系列 限定口红#117 "
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {310, 345, 285, 180, 180, 335,330,350};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.giorgio_s, R.drawable.givenchy_s, R.drawable.lancome_s,
            R.drawable.mac_s, R.drawable.mac1_s, R.drawable.ysl_s,
            R.drawable.chanel_s,R.drawable.chanel1_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.giorgio, R.drawable.givenchy, R.drawable.lancome,
            R.drawable.mac, R.drawable.mac1, R.drawable.ysl,
            R.drawable.chanel,R.drawable.chanel1
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
