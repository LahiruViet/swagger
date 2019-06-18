package itsj.research.swagger.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "Hello Resource", description = "describe hello resource")
public class HelloResource {

    @ApiOperation(value = "Returns Hello")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "response code is 100"),
                    @ApiResponse(code = 200, message = "Successful response code")
            }
    )
    @GetMapping
    public String hello() {
        return "Hello";
    }

    @ApiOperation(value = "Returns Hello for post")
    @PostMapping("/post")
    public String hello(@RequestBody final String hello) {
        return hello;
    }

    @ApiOperation(value = "Returns Hello for put")
    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }
}
