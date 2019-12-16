package com.origin.basics.controller;

import com.origin.basics.api.TestExcelExportBasicAPI;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

/**
 * @author LL
 * @date 2019/12/2 15:24
 * @describe
 */

@RestController
public class TestExportController implements TestExcelExportBasicAPI {

    Logger logger = LoggerFactory.getLogger(TestExportController.class);

    @Override
    public void testReaderFileByByteStream(HttpServletRequest request) throws IOException {

        OutputStreamWriter outputStream = null;
        try {
            File file = ResourceUtils.getFile("/excel/练习字符流.txt");
            System.out.println(file.getPath());
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader inputStream = new InputStreamReader(fis,CharsetUtil.UTF_8);
            BufferedReader bufferReader = new BufferedReader(inputStream);
            String content = bufferReader.readLine();

            String path = "C:\\Users\\l\\Desktop\\练习字符流1.txt";
            outputStream = new OutputStreamWriter(new FileOutputStream(path),CharsetUtil.UTF_8);
            BufferedWriter bufferWriter = new BufferedWriter(outputStream);
            bufferWriter.write(content.toString());

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            outputStream.flush();
            outputStream.close();
        }

    }

    @Override
    public void testReaderFileByCharacterStream(Integer id) {
        String path = "C:\\Users\\l\\Desktop\\练习字符流.txt";
        try {
            FileReader file = new FileReader(path);
            BufferedReader buffer = new BufferedReader(file);
            String content = buffer.readLine();
            logger.info(content);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
