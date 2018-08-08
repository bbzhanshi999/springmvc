package com.demo.springmvc.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value=Exception.class)
    public void exception2View(HttpServletRequest request, HttpServletResponse response, Exception e){
        if(isAjax(request)){
            response.setContentType("application/json");
        }else{
            request.setAttribute("message",e);
            try {
                request.getRequestDispatcher("/WEB-INF/view/500.jsp").forward(request,response);
            } catch (ServletException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public boolean isAjax(HttpServletRequest request){
        String xReq = request.getHeader("x-request-with");
        return xReq!=null&& xReq.equalsIgnoreCase("XMLHttpResquest");
    }

}
