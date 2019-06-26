package com.wangyuelin.app.utils;

/**
 * 描述:电影的标签
 *
 * @outhor wangyuelin
 * @create 2018-06-25 下午4:07
 */
public enum  MovieTag {
    REMEN(1, "热门"),
    JINGDIAN(2, "经典"),
    ZUIXIN(3, "最新");

    MovieTag(int tag, String tagStr) {
        this.tag = tag;
        this.tagStr = tagStr;
    }

    private int tag;
    private String tagStr;

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getTagStr() {
        return tagStr;
    }

    public void setTagStr(String tagStr) {
        this.tagStr = tagStr;
    }




//    /**
//     * 电影的tag
//     */
//    interface MovieTag{
//        String HOT = "热门";
//        String JINGDIAN = "经典";
//        String DOUBANGAOFEN = "豆瓣高分";
//        String NEW = "最新";
//        String LENGMENJIAPIAN = "冷门佳片";
//        String HUAYU = "华语";
//        String OUMEI = "欧美";
//        String HANGUO = "韩国";
//        String RIBEN = "日本";
//        String DONGZUO = "动作";
//        String XIJU = "喜剧";
//        String AIQING = "爱情";
//        String KEHUAN = "科幻";
//        String XUANYU = "悬疑";
//        String KONGBU = "恐怖";
//        String ZHIYU = "治愈";
//        String SHOWING = "正在上映";
//        String WILL_SHOW = "即将上映";
//    }

}