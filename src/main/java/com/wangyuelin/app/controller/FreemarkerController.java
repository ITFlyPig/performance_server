package com.wangyuelin.app.controller;

import com.wangyuelin.app.bean.HomeMovieResp;
import com.wangyuelin.app.bean.MovieDetail;
import com.wangyuelin.app.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 *
 * @outhor wangyuelin
 * @create 2018-06-21 下午7:53
 */
@Controller
public class FreemarkerController {

    @Autowired
    private MovieController movieController;

    @RequestMapping("/demo")
    public String demo(Map<String, Object> map) {
        map.put("descrip", "It's a springboot integrate freemarker's demo!!!!");
        map.put("fuck", "freemarker");
        List<String> list = new ArrayList<String>();
        list.add("wang");
        list.add("yue");
        map.put("names", list);
        return "demo";
    }

    @RequestMapping("dlz_movie/home")
    @ResponseBody
    public String index(ModelMap modelMap) {
        HomeMovieResp resp = movieController.getHomeMovies();
//        Map<MovieTagBean, List<HomeMovieBean>> data = movieController.getHomeMovieByTag(MovieTag.ZUIXIN);
//        Iterator iterator =  data.keySet().iterator();
//        while (iterator.hasNext()) {
//            List<HomeMovieBean> list = data.get(iterator.next());
//            System.out.println("查询都的"+ list.toString());
//            modelMap.addAttribute("data", list);
//        }
        modelMap.addAttribute("data", resp);

//        HomeMovieBean movieBean = new HomeMovieBean();
//        movieBean.setName("侏罗纪");
//        movieBean.setId(9999);
//        movieBean.setYear("1992");
//        List<HomeMovieBean> list = new ArrayList<HomeMovieBean>();
//        list.add(movieBean);
////        m.addAttribute("data", list);
//        HashMap<String, List<HomeMovieBean>> map = new HashMap<String, List<HomeMovieBean>>();
//        map.put("最新", list);
//        m.put("name","草拟吗的");
//        System.out.println("请求到了");

//        Map<String, String> data = new HashMap<String, String>();
//        data.put("name", "望月");
//        data.put("name2", "大龄");
//        m.addAttribute("data", data);
//        System.out.println("请求到了");
//        modelMap.addAttribute("hello", "hello Thymeleaf!");
//        modelMap.addAttribute("movies", list);
        return "home_movie";
    }

    @RequestMapping("dlz_movie/detail")
    public ModelAndView detailMovie(@RequestParam("id") Integer id) {
        ModelAndView view = new ModelAndView();
        if (id == null) {
            view.setViewName(Constant.Page.P_404);
            return view;
        }
        MovieDetail detail = movieController.getMovieByid(id);
        if (detail == null) {
            view.setViewName(Constant.Page.P_404);
            return view;
        }
        detail.ensureOneValue();
        view.addObject("data", detail);
        view.setViewName("detail");
        return view;

    }


}