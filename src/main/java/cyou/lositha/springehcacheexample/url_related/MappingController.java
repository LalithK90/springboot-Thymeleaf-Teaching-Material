package cyou.lositha.springehcacheexample.url_related;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {
    @Autowired
    private AnnotationService annotationService;

    @GetMapping("/test/mappedUrls")
    public ResponseEntity<List<String>> getUrls() {
        return new ResponseEntity<>(annotationService.getGetMappingUrls(), HttpStatus.OK);
    }

}
