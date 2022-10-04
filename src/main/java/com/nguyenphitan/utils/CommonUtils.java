package com.nguyenphitan.utils;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.nguyenphitan.exception.AuthenticationException;
import com.nguyenphitan.logs.Loggable;

/**
 * CommonUtils
 */
@Component
public class CommonUtils extends Loggable {

    private static Logger logger = LoggerFactory.getLogger(CommonUtils.class);
    
    /**
     * Get token value from request.
     * 
     * @return token value.
     */
    public static String getTokenValue() {
        HttpServletRequest httpServletRequest = ((ServletRequestAttributes) RequestContextHolder
                .currentRequestAttributes()).getRequest();
        String token = httpServletRequest.getHeader(Constants.AUTH_HEADER_AUTHORIZATION);
        if (StringUtils.isEmptyOrBlank(token)) {
            String unAuthorizatedError = MessageUtils.DO_NOT_PERMISSION_TO_ACCESS;
            throw new AuthenticationException(unAuthorizatedError);
        } else {
            String[] tmp = token.split(" ");
            String tokenValue = tmp.length == 1 ? tmp[0] : tmp[1];
            return tokenValue;
        }
    }
}
