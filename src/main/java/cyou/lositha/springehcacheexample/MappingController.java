package cyou.lositha.springehcacheexample;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class MappingController {
    @Autowired
    AnnotationService annotationService;

    @GetMapping("/test/mappedUrls")
    public ResponseEntity<List<String>> getUrls() {
        return new ResponseEntity<>(annotationService.getGetMappingUrls(), HttpStatus.OK);
    }

}

@Service
class AnnotationService {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private RequestMappingHandlerMapping handlerMapping;

    public List<String> getGetMappingUrls() {
        List<String> urls = new ArrayList<>();
        URL url = null;
        try {
            url = new URL(httpServletRequest.getRequestURL().toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        String newUrlString = url.getProtocol() + "://" + url.getHost() + ":" + url.getPort();

        Map<RequestMappingInfo, HandlerMethod> handlerMethods = handlerMapping.getHandlerMethods();
        for (Map.Entry<RequestMappingInfo, HandlerMethod> entry : handlerMethods.entrySet()) {
            HandlerMethod handlerMethod = entry.getValue();
            if (handlerMethod.getMethodAnnotation(GetMapping.class) != null) {
                for (String string : handlerMethod.getMethodAnnotation(GetMapping.class).path()) {
                    urls.add(newUrlString+string);
                }
            }
        }
        return urls;
    }


}
