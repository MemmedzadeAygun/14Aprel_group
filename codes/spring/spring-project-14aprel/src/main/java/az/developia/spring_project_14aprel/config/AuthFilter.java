package az.developia.spring_project_14aprel.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.loader.WebappClassLoader;
import org.apache.catalina.startup.WebAnnotationSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import az.developia.spring_project_14aprel.util.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthFilter extends OncePerRequestFilter {
	
	@Autowired
	private JwtUtil jwtUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String header = request.getHeader("Authorization");
		if (header == null || !header.startsWith("Bearer ")) {
			filterChain.doFilter(request, response);
			return;
		}
		
		String token = header.substring(7); //Bearer sozunu at
		String username = jwtUtil.extractUsername(token);
		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			User userDetails = new User(username, "", new ArrayList<>());
			UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
			authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			
			SecurityContextHolder.getContext().setAuthentication(authToken);
		}
		
		filterChain.doFilter(request, response);
	}

}
