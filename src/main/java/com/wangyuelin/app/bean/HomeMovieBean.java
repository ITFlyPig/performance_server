package com.wangyuelin.app.bean;

/**
 * 描述: web首页的电影的数据结构
 *
 * @outhor wangyuelin
 * @create 2018-06-25 下午3:33
 */
public class HomeMovieBean {
    private int id;
    private String name;//电影的名称
    private String year;//上映日期
    private float doubanRank;//豆瓣评分
    private String poster;//海报的url
    private String detailUrl;//详情页



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getDoubanRank() {
        return doubanRank;
    }

    public void setDoubanRank(float doubanRank) {
        this.doubanRank = doubanRank;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }
}