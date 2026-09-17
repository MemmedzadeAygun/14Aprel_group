package az.developia.spring_project_14aprel.util;

import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

	private final Key signinKey;
	
	public JwtUtil(@Value("${jwt.secret}") String secretKey) {
		byte[] decode = Base64.getDecoder().decode(secretKey);
		SecretKey hmacShaKeyFor = Keys.hmacShaKeyFor(decode);
		this.signinKey = hmacShaKeyFor;
	}
	
	public String generateToken(String username, List<String> authorities) {
		
		Map<String, String> claims = new HashMap<String, String>();
		String authorityList = String.join(",", authorities);
		claims.put("authorities", authorityList);
		
		return Jwts.builder()
				.setClaims(claims)
		.setSubject(username)
		.setIssuedAt(new Date())
		.setExpiration(new Date(System.currentTimeMillis()+ 8640000)) //1 gun
		.signWith(signinKey)
		.compact();
	}
	
	public String extractUsername(String token) {
		return Jwts.parserBuilder()
		.setSigningKey(signinKey)
		.build()
		.parseClaimsJws(token)
		.getBody()
		.getSubject();
	}
}
