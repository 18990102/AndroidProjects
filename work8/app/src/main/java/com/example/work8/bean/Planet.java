package com.example.work8.bean;

import com.example.work8.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = {R.drawable.chanel, R.drawable.chanel1, R.drawable.giorgio,
            R.drawable.givenchy, R.drawable.lancome, R.drawable.mac,R.drawable.mac1,R.drawable.ysl};
    private static String[] nameArray = { "Armani", "纪梵希", "兰蔻菁纯", "魅可尤雾弹", "魅可冰纷烟花", "圣罗兰细管","香奈儿唇釉","香奈儿唇膏"
    };
    private static String[] descArray = {
            "Armani/阿玛尼红管唇釉番茄色丝绒哑光口红405/208/209",
            "【官方正品】GIVENCHY纪梵希美炸红丝绒口红唇膏N37 哑光",
            "兰蔻全新菁纯柔雾哑光唇膏口红 888小野莓 196胡萝卜",
            "【官方正品】MAC/魅可尤雾弹唇膏口红大牌正品316/923奶茶色",
            "【圣诞提前抢】MAC/魅可冰纷烟花限定口红唇膏 Lisa同款314奶茶色",
            "【新品】YSL圣罗兰细管柔光口红小粉条哑光口红新色214琥珀南瓜棕",
            "【官方正品】CHANEL 香奈儿炫亮魅力印记唇釉哑光口红 154 836",
            "【官方正品】CHANEL 香奈儿炫亮魅力唇膏黑金系列 限定口红#117 "
    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
