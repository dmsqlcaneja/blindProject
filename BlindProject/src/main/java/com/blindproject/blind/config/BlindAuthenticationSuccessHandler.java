//package com.blindproject.blind.config;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.RedirectStrategy;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.savedrequest.SavedRequest;
//import org.springframework.stereotype.Component;
//
//import com.blindproject.blind.service.MybatisHomeService;
//
//
//@Component
//public class BlindAuthenticationSuccessHandler implements AuthenticationSuccessHandler{
//	
//	@Autowired 
//	private MybatisHomeService service;
//	
//	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//	@Override
//	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//			Authentication authentication) throws IOException, ServletException {
//		// TODO Auto-generated method stub
//		
//		   /*
//		    * 인터럽트 된 상태에서 로그인 처리 방법 
//		    
//		   
//		   HttpSession session = request.getSession();
//		   SavedRequest savedRequest = (SavedRequest) session.getAttribute("SPRING_SECURITY_SAVED_REQUEST");
//		   
//		   if(savedRequest != null) {
//			   
//			   String returnURL = savedRequest.getRedirectUrl();
//			   redirectStrategy.sendRedirect(request, response, returnURL);
//			   
//			   return;
//			   
//		   }
//		   
//		   /*
//		    *  인터럽트 되지 않은 로그인 처리 방법 
//		    */
//		   
//		   String employeeId = authentication.getName();
//		   String roleName = service.getDefaultRoleName(employeeId);
//		   
//		   switch(employeeId) {
//		   
//		   case "ROLE_EMPLOYEE":
//			   redirectStrategy.sendRedirect(request, response, "/employee/index");
//			   break;
//		   case "ROLE_ADMIN":   
//			   redirectStrategy.sendRedirect(request, response, "/admin/index");
//			   break;
//		   default:   
//			   redirectStrategy.sendRedirect(request, response, "/apply/index");
//		   }
//		
//	}
//
//}
