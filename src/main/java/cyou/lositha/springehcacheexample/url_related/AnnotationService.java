package cyou.lositha.springehcacheexample.url_related;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class AnnotationService {

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
                    urls.add(newUrlString + string);
                }
            }
        }
        return urls;
    }

}
