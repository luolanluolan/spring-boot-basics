package com.origin.basics.api;

import com.sun.xml.internal.ws.resources.HttpserverMessages;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Api(tags = "缓存简单测试模块")
public interface TestExcelExportBasicAPI {
    public final String API_SWAGGERUI ="/swaggerUi";

    @GetMapping(value = API_SWAGGERUI+"/testReaderFileByByteStream/{id}",name = "通过id查询")
    @ResponseBody
    @ApiOperation(value = "字节流读入文件",notes = "字节流读入文件")
    public void testReaderFileByByteStream(HttpServletRequest reqeust) throws IOException;

    @GetMapping(value = API_SWAGGERUI+"/testReaderFileByCharacterStream/{id}",name = "通过id查询")
    @ResponseBody
    @ApiOperation(value = "字符流读入文件",notes = "字符流读入文件")
    public void testReaderFileByCharacterStream(@PathVariable Integer id) ;



}
