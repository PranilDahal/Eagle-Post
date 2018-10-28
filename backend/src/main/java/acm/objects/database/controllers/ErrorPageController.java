package acm.objects.database.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.servlet4preview.RequestDispatcher;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorPageController implements ErrorController {

	@RequestMapping("/error")
	@ResponseBody
	public String handleError(HttpServletRequest request) {

		// TODO Issue #6 - Make this error page more responsive based on what type of
		// error it is.
		// Look at
		// https://www.logicbig.com/tutorials/spring-framework/spring-boot/implementing-error-controller.html
		// for example
		// Test it out on your browser anby making bad API calls to trigger those
		// specific errors.

		/**
		 * TYPES OF HTTP ERROR AND STATUS CODES
		 * 
		 * >100-199: information status >200-299: success status 
		 * >300-399: redirection status 
		 * >400-499: client errors >500-599: server errors
		 */

		// Getting HTTP status code of the error to determine a suitable error page to
		// display
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		// If there is an error...
		if (status != null) {
			int statusCode = Integer.valueOf(status.toString());
			if (statusCode == HttpStatus.BAD_REQUEST.value()) {
				return String.format("<html><body><h2>Error 400 - Bad Request: The server did not understand the request</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.UNAUTHORIZED.value()) {
				return String.format("<html><body><h2>Error 401 - Unauthorized: The requested page needs a username and a password </h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.PAYMENT_REQUIRED.value()) {
				return String.format("<html><body><h2>Error 402 - Payment Required: You cannot use this code yet /h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.FORBIDDEN.value()) {
				return String.format("<html><body><h2>Error 403 - Forbidden: Access is forbidden to the requested page </h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.NOT_FOUND.value()) {
				return String.format("<html><body><h2>Error 404 - Not Found: The server cannot find the requested page.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.METHOD_NOT_ALLOWED.value()) {
				return String.format("<html><body><h2>Error 405 - Method Not Allowed: The method specified in the request is not allowed.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.NOT_ACCEPTABLE.value()) {
				return String.format("<html><body><h2>Error 406 - Not Acceptable: The server can only generate a response that is not accepted by the client.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.PROXY_AUTHENTICATION_REQUIRED.value()) {
				return String.format("<html><body><h2>Error 407 - Proxy Authentication Required: You must authenticate with a proxy server before this request can be served.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.REQUEST_TIMEOUT.value()) {
				return String.format("<html><body><h2>Error 408 - Request Timeout: The request took longer than the server was prepared to wait.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.CONFLICT.value()) {
				return String.format("<html><body><h2>Error 409 - Conflict: The request could not be completed because of a conflict.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.GONE.value()) {
				return String.format("<html><body><h2>Error 410 - Gone: The requested page is no longer available.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.LENGTH_REQUIRED.value()) {
				return String.format("<html><body><h2>Error 411 - Length Required: The \"Content-Length\" is not defined. The server will not accept the request without it.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.PRECONDITION_FAILED.value()) {
				return String.format("<html><body><h2>Error 412 - Precondition Failed: The precondition given in the request evaluated to false by the server.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.REQUEST_ENTITY_TOO_LARGE.value()) {
				return String.format("<html><body><h2>Error 413 - Request Entity Too Large: The server will not accept the request, because the request entity is too large.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.REQUEST_URI_TOO_LONG.value()) {
				return String.format("<html><body><h2>Error 414 - Request URI Too Long: The server will not accept the request, because the url is too long. Occurs when you convert a \"post\" request to a \"get\" request with a long query information. </h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.UNSUPPORTED_MEDIA_TYPE.value()) {
				return String.format("<html><body><h2>Error 415 - Unsupported Media Type: The server will not accept the request, because the media type is not supported.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.EXPECTATION_FAILED.value()) {
				return String.format("<html><body><h2>Error 417 - Expectation Failed: Server expectaion failed.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				return String.format("<html><body><h2>Error 500 - Internal Server Error: The request was not completed. The server met an unexpected condition.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.NOT_IMPLEMENTED.value()) {
				return String.format("<html><body><h2>Error 501 - Not Implemented: The request was not completed. The server did not support the functionality required.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.BAD_GATEWAY.value()) {
				return String.format("<html><body><h2>Error 502 - Bad Gateway: The request was not completed. The server received an invalid response from the upstream server.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.SERVICE_UNAVAILABLE.value()) {
				return String.format("<html><body><h2>Error 503 - Service Unavailable: The request was not completed. The server is temporarily overloading or down.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.GATEWAY_TIMEOUT.value()) {
				return String.format("<html><body><h2>Error 504 - Gateway Timeout: The gateway has timed out.</h2><body></html>");
				
				
			} else if (statusCode == HttpStatus.HTTP_VERSION_NOT_SUPPORTED.value()) {
				return String.format("<html><body><h2>Error 505 - Http Version Not Supported: The server does not support the \"http protocol\" version.</h2><body></html>");
				
				
			} 
		}

		return String.format("<html><body><h2>Unrecognized Error Page</h2><body></html>");

	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}
