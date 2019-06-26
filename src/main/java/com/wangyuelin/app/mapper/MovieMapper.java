package com.wangyuelin.app.mapper;

import com.wangyuelin.app.bean.HomeMovieBean;
import com.wangyuelin.app.bean.MovieDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 描述:
 *
 * @outhor wangyuelin
 * @create 2018-06-25 下午4:26
 */
@Mapper
public interface MovieMapper {
    List<HomeMovieBean> getByTag(String tag);
    List<HomeMovieBean> getMovies(@Param("tag") String tag, @Param("num") int num);
    List<MovieDetail> getMovieById(int id);


}