package com.wangyuelin.app.bean;

/**
 * 描述:电影的类型，方便int和String类型对照起来
 *
 * @outhor wangyuelin
 * @create 2018-06-25 下午3:44
 */
public class MovieTagBean {
    private int tag;
    private String tagStr;

    public MovieTagBean(int tag, String tagStr) {
        this.tag = tag;
        this.tagStr = tagStr;
    }

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

    @Override
    public String toString() {

        return tag + "_" + tagStr;
    }
}