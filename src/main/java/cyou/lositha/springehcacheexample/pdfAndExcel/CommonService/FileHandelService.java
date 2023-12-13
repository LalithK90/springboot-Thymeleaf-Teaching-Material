package cyou.lositha.springehcacheexample.pdfAndExcel.CommonService;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Service;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class FileHandelService {
    private final ServletContext context;

    public FileHandelService(ServletContext context) {
        this.context = context;
    }

    public void fileDownload(String fullPath, HttpServletResponse response, String files) {
        File file = new File(fullPath);
        final int BUFFER_SIZE = 4096;
        if (file.exists()) {
            try {
                FileInputStream inputStream = new FileInputStream(file);
                String mimeType = context.getMimeType(fullPath);
                response.setContentType(mimeType);
                response.setHeader("content-disposition", "inline; filename=" + files);
                OutputStream outputStream = response.getOutputStream();
                byte[] buffer = new byte[BUFFER_SIZE];
                int bytestRead = -1;
                while ((bytestRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytestRead);

                }
                inputStream.close();

                outputStream.close();

                file.delete();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
