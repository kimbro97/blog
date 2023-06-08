package blog.backend.html;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HtmlController implements ErrorController {
    @GetMapping("/error")
    public String getIndexHtml(HttpServletRequest request) {
        String contextPath = request.getServletPath();
        System.out.println(contextPath);
        return "index.html";
    }

    @GetMapping("/console/**")
    public String getConsoleHtml(HttpServletRequest request) {
        String contextPath = request.getServletPath();
        System.out.println(contextPath);
        return "console.html";
    }
}
