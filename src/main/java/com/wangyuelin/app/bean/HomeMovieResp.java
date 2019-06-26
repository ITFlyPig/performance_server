package com.wangyuelin.app.bean;

import com.wangyuelin.app.utils.MovieTag;

import java.util.List;
import java.util.Map;

/**
 * 描述: 返回的数据
 *
 * @outhor wangyuelin
 * @create 2018-06-25 下午3:37
 */
public class HomeMovieResp  extends BaseRespBean{
    private List<Map<String, List<HomeMovieBean>>> data;

    public List<Map<String, List<HomeMovieBean>>> getData() {
        return data;
    }

    public void setData(List<Map<String, List<HomeMovieBean>>> data) {
        this.data = data;
    }
}