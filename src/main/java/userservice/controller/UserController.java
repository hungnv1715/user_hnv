package userservice.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import userservice.entity.User;
import userservice.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        System.out.println("-------------------------");
        User createdUser = userService.registerUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        System.out.println("2222");
        User user = userService.getUserByUsername(username);
        if (user == null) {
            return ResponseEntity.notFound().build(); // Nếu không tìm thấy user, trả về 404
        }
        return ResponseEntity.ok(user);
    }


    @GetMapping
    public List<User> getAllUser() {
        System.out.println("+++++------------------");
        return  userService.findAllUser();
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // tên của trang HTML hoặc template bạn muốn hiển thị
    }

    @GetMapping("/session")
    public String getSessionId(HttpSession session) {
        return "Session ID: " + session.getId();
    }

    @DeleteMapping("/logoutAllSessions")
    public String logoutAllSessions(@RequestParam String userId) {
        // Map<String, ? extends Session> userSessions = sessionRepository.findByIndexNameAndIndexValue(
        //     FindByIndexNameSessionRepository.PRINCIPAL_NAME_INDEX_NAME, userId);
    
        // if (userSessions != null && !userSessions.isEmpty()) {
        //     for (String sessionId : userSessions.keySet()) {
        //         // Invalidate session via sessionRepository to ensure cleanup
        //         sessionRepository.deleteById(sessionId);
    
        //         // Delete expiration keys associated with this session manually
        //         Set<String> expirationKeys = redisTemplate.keys("spring:session:expirations:*:" + sessionId);
        //         if (expirationKeys != null && !expirationKeys.isEmpty()) {
        //             redisTemplate.delete(expirationKeys);
        //         }
        //     }
    
        //     // Delete index key associated with userId
        //     String indexKey = "spring:session:index:" + 
        //         FindByIndexNameSessionRepository.PRINCIPAL_NAME_INDEX_NAME + ":" + userId;
        //     redisTemplate.delete(indexKey);
    
        //     return "All sessions logged out for user";
        // }
        return "No sessions found for user";
    }
    

    
    
}
