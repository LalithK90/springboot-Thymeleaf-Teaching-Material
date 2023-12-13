package cyou.lositha.springehcacheexample.url_related;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class MethodScanner {

    public static List<String> scanForGetMappingUrls(Class<?> controllerClass) {
        List<String> urls = new ArrayList<>();

        Method[] methods = controllerClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(GetMapping.class)) {
                GetMapping getMapping = method.getAnnotation(GetMapping.class);
                String[] mappingValues = getMapping.value();
                // Add the URL(s) to the list
                for (String mappingValue : mappingValues) {
                    urls.add(mappingValue);
                }
            }
        }

        return urls;
    }
}
