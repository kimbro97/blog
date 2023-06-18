package blog.backend.common.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UploadController {

    @PostMapping("/upload")
    public String fileUpload() {
        String path = "";
        return path;
    }

}
