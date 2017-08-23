package com.opipo.bbcode.converter.controller;

import com.opipo.bbcode.converter.services.BBToHTMLConversionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Api(value = "REST API to get the HTML messages")
public class ConverterController {

    @Autowired
    private BBToHTMLConversionService bbToHTMLConversionService;

    @RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "Convert BBCode to HTML", notes = "Convert BBCode to HTML code")
    public ResponseEntity<String> convert(@ApiParam(value = "BBCode message", required = true) @RequestBody String bbCode) {
        return new ResponseEntity<String>(bbToHTMLConversionService.converText(bbCode), HttpStatus.ACCEPTED);
    }
}
