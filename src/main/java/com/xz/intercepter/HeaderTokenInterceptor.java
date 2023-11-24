package com.xz.intercepter;

import com.alibaba.fastjson.JSON;
import com.xz.utils.EnumCode;
import com.xz.utils.JWTUtil;
import com.xz.utils.ResponseData;
import com.xz.utils.SystemException;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : [皮皮怪的虾]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/9/19 9:45]
 * @updateUser : [hasee]
 * @updateTime : [2023/9/19 9:45]
 * @updateRemark : [说明本次修改内容]
 */
public class HeaderTokenInterceptor implements HandlerInterceptor {
    private int i=0;
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        ResponseData responseData = null;

        //直接通过OPTINGS请求，防止因为options不携带token而被拦截
        //上述主要目的是解决因为下面抛出自定义异常之后而产生的跨域问题
        if (HttpMethod.OPTIONS.toString().equals(request.getMethod())) {
            return true;
        }
        String token = request.getHeader ("Token");//取出前端放在请求头里面的token);
        if (!request.getRequestURI ().contains ("login")) {//如果不是登录页
            if (token == null) {
//                responseData = ResponseData.customerError ();
                throw new  SystemException(EnumCode.NOT_AUTHORITY);
            }
            try {
                // 对token进行更新与验证
                token = JWTUtil.updateToken (token);//每次访问非login页面都更新一次token，防止token过期
                /*如果token为空，则报空指针异常，进入catch块，*/
            } catch (Exception e) {
                // 当token验证出现异常返回错误信息,token不匹配
                responseData = ResponseData.customerError ();
                throw new SystemException (EnumCode.NOT_FOUND);
            }
        }
        /*如果去的不是login页面，且token值为空，则根据流程，responseData不会被赋值，则会走if*/
        if (responseData != null) {
            //如果有错误信息
//            response.getWriter ().write (JSON.toJSONString (responseData));
//            return false;
            throw new  SystemException(EnumCode.NOT_AUTHORITY);
        }
        /*如果去的是login页面，直接走这else
         * 如果去的不是login页面，但是token值不为空，也走这else*/
        else {
            // 将token加入返回页面的header
            response.setHeader ("token", token);
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
