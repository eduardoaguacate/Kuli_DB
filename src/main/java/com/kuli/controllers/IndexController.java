/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuli.controllers;

import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author Eduardo
 */
public class IndexController extends SimpleFormController {
    
    public IndexController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
    }
    
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        ModelAndView mv = new ModelAndView(getSuccessView());
        //Do something...
        return mv;
    }
     */
}
