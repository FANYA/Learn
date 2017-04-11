package application;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fanya on 2017/4/10.
 */

@RestController
@RequestMapping("/user")
@Api(value = "Shop")
public class SpringBootController {

    @ApiOperation(value = "获取helloWorld", notes = "简单SpringMVC请求")
    @RequestMapping("/")
    String home() {
        return "HELLO WORLD";
    }

    @ApiOperation(value = "获得A+B", notes = "根据url的classNo和url的studentName获得请求参数的字符串相加，RestFul风格的请求")
    @ApiImplicitParams({@ApiImplicitParam(name = "classNo", value = "班级编号", required = true, dataType = "String"),
    })
    @RequestMapping(value = "/class/{classNo}/to/{studentName}", method = RequestMethod.GET)
    String world(@PathVariable("classNo") String classNo, @PathVariable("studentName") String studentName) {
        return classNo + "  " + studentName;
    }


}
