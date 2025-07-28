package org.surja.logging_mvc_annotations_demo;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Requestfilter extends HttpFilter {
    private static Logger LOGGER = LoggerFactory.getLogger(Requestfilter.class);
        /*
        normal flow of https request:
        client ---- internet ----  ==> tomcat ==> dispatcherServlet ==> bussiness layer

        normal flow of https reponse:
        client ---- internet ----  <== tomcat <== dispatcherServlet <== bussiness layer


        but if we add a filter layer then this look like this:
        client ---- internet ----  ==> tomcat ==> filter layer ==> dispatcherServlet ==> bussiness layer
        client ---- internet ----  <== tomcat <== filter layer <== dispatcherServlet <== bussiness layer
         */

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        LOGGER.info("Filtering https req. before sending it to dispatcherServelet");


        // in order to do some task like authentication,authorization before handling the request to the
        // dispatcherServelet we will do it before calling this method

        /*
        MDC is a logging utility provided by SLF4J/Logback that allows you to store contextual information
        (like requestId, userId, etc.) per request/thread, so it automatically appears in all your logs.
         */
        MDC.put("requestId",request.getHeader("requestId"));
        MDC.put("clientId",request.getHeader("clientId"));
        super.doFilter(request, response, filterChain);

        // in order to do some  before handling the response to the tomcat server
        // we will do it after calling this method
        LOGGER.info("Filtering https response before sending it client");
    }
}
