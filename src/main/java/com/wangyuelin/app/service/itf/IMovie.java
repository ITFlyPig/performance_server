package com.wangyuelin.app.service.itf;

import com.wangyuelin.app.bean.HomeMovieBean;
import com.wangyuelin.app.bean.MovieDetail;

import java.util.List;

/**
 * 描述:
 *
 * @outhor wangyuelin
 * @create 2018-06-25 下午4:21
 */
public interface IMovie {
    List<HomeMovieBean> getByTag(String tag);
     List<HomeMovieBean> getMoviesByNum(String tag, int num);
     List<MovieDetail> getMovieById(int id);

}