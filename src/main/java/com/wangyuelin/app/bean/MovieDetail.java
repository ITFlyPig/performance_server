package com.wangyuelin.app.bean;

import com.wangyuelin.app.utils.TextUtil;

import java.util.List;

/**
 * 描述:
 *
 * @outhor wangyuelin
 * @create 2018-07-16 下午4:13
 */
public class MovieDetail {
    private int id;
    private String name;//中文名
    private String enName;//英文名和其他的的名
    private String nickName;//多个翻译名，使用/分隔
    private String director;//导演，多个以/分隔
    private String scriptwriter;//多个以/分隔
    private String actors;//演员 多个以/分隔
    private String types;//类型 多个以/分隔
    private String location;//国家和地区，多个以/分隔
    private String language;//语言
    private String showTime;//上映日期多个以/分隔
    private String showYear;//上映的年份 如2017
    private String movieTime;//片长 多个以/分隔
    private String intro;//简介
    private String detaiWeblUrl;//从第三方抓的详情页
    private String downloadWebUrl;//抓取下载链接的url，多个url用;分隔
    private float doubanRank;//豆瓣评分
    private String tag;//用来给电影打标签，比如最新，最热，豆瓣高分等，多个使用/号分隔
    private List<ActorBean> aboutPerson;//相关的影人
    private List<String> movieScreenshot;//电影的截图
    private String posters;//海报的url，多个url使用;分隔

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

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getScriptwriter() {
        return scriptwriter;
    }

    public void setScriptwriter(String scriptwriter) {
        this.scriptwriter = scriptwriter;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getShowYear() {
        return showYear;
    }

    public void setShowYear(String showYear) {
        this.showYear = showYear;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getDetaiWeblUrl() {
        return detaiWeblUrl;
    }

    public void setDetaiWeblUrl(String detaiWeblUrl) {
        this.detaiWeblUrl = detaiWeblUrl;
    }

    public String getDownloadWebUrl() {
        return downloadWebUrl;
    }

    public void setDownloadWebUrl(String downloadWebUrl) {
        this.downloadWebUrl = downloadWebUrl;
    }

    public float getDoubanRank() {
        return doubanRank;
    }

    public void setDoubanRank(float doubanRank) {
        this.doubanRank = doubanRank;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<ActorBean> getAboutPerson() {
        return aboutPerson;
    }

    public void setAboutPerson(List<ActorBean> aboutPerson) {
        this.aboutPerson = aboutPerson;
    }

    public List<String> getMovieScreenshot() {
        return movieScreenshot;
    }

    public void setMovieScreenshot(List<String> movieScreenshot) {
        this.movieScreenshot = movieScreenshot;
    }

    public String getPosters() {
        return posters;
    }

    public void setPosters(String posters) {
        this.posters = posters;
    }

    /**
     * 据不同的分隔符，返回第一个数据
     * @param str
     * @param splitC
     * @return
     */
    public String getOne(String str, String splitC) {
        if (TextUtil.isEmpty(splitC) || TextUtil.isEmpty(str)) {
            return str;
        }
        String[] array = str.split(splitC);
        if (array == null || array.length == 0) {
            return "";
        }
        return array[0];
    }


    /**
     * 保证以分隔符分隔的多个值的字段，只返回一个值
     */
    public void ensureOneValue() {
        setPosters(getOne(getPosters(), ";"));

    }

}