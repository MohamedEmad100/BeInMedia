package com.m.emad.beinmedia.error;

import java.io.IOException;

import retrofit2.HttpException;
import retrofit2.Response;

/**
 * Craeted by M.Emad
 */
public class ErrorHandler {

    public static ErrorModel getErrorModel(Throwable e){
        // We had non-200 http error
        if (e instanceof HttpException) {
            HttpException httpException = (HttpException) e;
            Response response = httpException.response();
            return getBusinessErrorModel(response.message()) ;
        }
        // A network error happened
        if (e instanceof IOException) {
            return getNetworkErrorModel(e.getMessage());
        }
        return getGeneralErrorModel(e.getMessage());
    }

    private static ErrorModel getNetworkErrorModel(String errorMessage) {
        ErrorModel errorModel = new ErrorModel(ErrorModel.ErrorType.NETWORK_ERROR);
        errorModel.setErrorDes(errorMessage);
        return errorModel;
    }

    private static ErrorModel getGeneralErrorModel(String errorMessage){
        ErrorModel errorModel = new ErrorModel(ErrorModel.ErrorType.GENERAL_ERROR);
        errorModel.setErrorDes(errorMessage);
        return errorModel;
    }

    public static ErrorModel getBusinessErrorModel(String errorDesc) {
        ErrorModel errorModel = new ErrorModel(ErrorModel.ErrorType.BUSSINESS_ERROR);
        errorModel.setErrorDes(errorDesc);
        return errorModel;
    }

}
