package com.wangyuelin.app.service;

import com.wangyuelin.app.bean.HomeMovieBean;
import com.wangyuelin.app.bean.MovieDetail;
import com.wangyuelin.app.mapper.MovieMapper;
import com.wangyuelin.app.service.itf.IMovie;
import com.wangyuelin.app.utils.TextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 *
 * @outhor wangyuelin
 * @create 2018-06-25 下午4:21
 */
@Service
public class MovieService implements IMovie {
    @Autowired
    private MovieMapper movieMapper;

    @Override
    public List<HomeMovieBean> getByTag(String tag) {
        if (TextUtil.isEmpty(tag)) {
            return null;
        }
        return movieMapper.getByTag(tag);
    }

    @Override
    public List<HomeMovieBean> getMoviesByNum(String tag, int num) {
        if (num <= 0 || TextUtil.isEmpty(tag)) {
            return null;
        }
        return movieMapper.getMovies(tag, num);

    }

    @Override
    public List<MovieDetail> getMovieById(int id) {
        if (id < 0) {
            return null;
        }
        return movieMapper.getMovieById(id);
    }
}