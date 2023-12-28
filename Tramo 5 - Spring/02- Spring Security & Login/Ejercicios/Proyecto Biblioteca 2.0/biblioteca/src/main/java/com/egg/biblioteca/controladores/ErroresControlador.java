package com.egg.biblioteca.controladores;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static jakarta.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR;


@Controller
public class ErroresControlador implements ErrorController {

    @RequestMapping(value = "/error", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView renderErrorPage(HttpServletRequest httpRequest) {

        ModelAndView errorPage = new ModelAndView("error");

        String errorMsg = "";

        int errorHttpCode = getErrorCode(httpRequest);

        switch (errorHttpCode) {
            case 400: {
                errorMsg = "El recurso solicitado no existe.";
                break;
            }
            case 401: {
                errorMsg = "No se encuentra autorizado.";
                break;
            }
            case 403: {
                errorMsg = "No tiene permisos para acceder a este recurso.";
                break;
            }
            case 404: {
                errorMsg = "El recurso no fue encontrado.";
                break;
            }
            case 500: {
                errorMsg = "Ocurrió un error interno.";
                break;
            }

        }
        errorPage.addObject("codigo", errorHttpCode);
        errorPage.addObject("mensaje", errorMsg);

        return errorPage;
    }

    private Integer getErrorCode(HttpServletRequest httpRequest) {

//        Integer code = (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");

        Object status = httpRequest.getAttribute(RequestDispatcher.ERROR_STATUS_CODE); // spring 3.1 +

        // work properly :^)

        return status != null ? Integer.valueOf(status.toString()) : SC_INTERNAL_SERVER_ERROR;

    }

    public String getErrorPath() {
        return "/error.html";
    }

}
