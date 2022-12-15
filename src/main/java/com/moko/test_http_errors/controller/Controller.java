package com.moko.test_http_errors.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/exception/{exception_id}")
    public void getSpecificException(@PathVariable("exception_id") String pException) {
        // 400
        if("bad_request".equals(pException)) {
            throw new BadRequestException("bad request");
        }
        // 401
        else if("unauthorized".equals(pException)) {
            throw new UnauthorizedException("unauthorized");
        }
        // 403
        else if("forbidden".equals(pException)) {
            throw new ForbiddenException("forbidden");
        }
        // 404
        else if("not_found".equals(pException)) {
            throw new NotFoundException("not found");
        }
        // 500
        else if("internal_serveur_error".equals(pException)) {
            throw new InternalServerErrorException("internal server error");
        }
        // 502
        else if("bad_gateway".equals(pException)) {
            throw new BadGatewayException("bad gateway");
        }
        // 503
        else if("service_unavailable".equals(pException)) {
            throw new ServiceUnvailableException("service unavailable");
        }
        // 504
        else if("gateway_timeout".equals(pException)) {
            throw new GatewayTimeoutException("gateway timeout");
        }
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public class BadRequestException extends RuntimeException {

        public BadRequestException(String message) {
            super(message);
        }
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public class UnauthorizedException extends RuntimeException {

        public UnauthorizedException(String message) {
            super(message);
        }
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    public class ForbiddenException extends RuntimeException {

        public ForbiddenException(String message) {
            super(message);
        }
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class NotFoundException extends RuntimeException {

        public NotFoundException(String message) {
            super(message);
        }
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public class InternalServerErrorException extends RuntimeException {

        public InternalServerErrorException(String message) {
            super(message);
        }
    }

    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public class BadGatewayException extends RuntimeException {

        public BadGatewayException(String message) {
            super(message);
        }
    }

    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public class ServiceUnvailableException extends RuntimeException {

        public ServiceUnvailableException(String message) {
            super(message);
        }
    }

    @ResponseStatus(HttpStatus.GATEWAY_TIMEOUT)
    public class GatewayTimeoutException extends RuntimeException {

        public GatewayTimeoutException(String message) {
            super(message);
        }
    }
}
