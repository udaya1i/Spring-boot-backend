package ecommerce.backend.Configuration;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.*;

import javax.crypto.SecretKey;
import java.io.IOException;

public class JwtValidator extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

            String jwt = request.getHeader(JWTConst.jwt_Header);
        if (jwt != null) {
            jwt = jwt.substring(7);
            try {
                SecretKey key =
                }
            catch (Exception ex){
                System.out.println("error");
            }
        }
    }
}
