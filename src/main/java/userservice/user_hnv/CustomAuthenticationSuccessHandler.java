package userservice.user_hnv;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        // Lấy session hiện tại
        // HttpSession session = request.getSession();
        // String userId = authentication.getName(); // Giả sử userId là username

        // Lưu session ID vào Redis với userId làm khóa
        // session.setAttribute("userId", userId);
        System.out.println("login success");
        response.sendRedirect("/api/users/session"); // Hoặc một URL khác mà bạn muốn
    }
}
