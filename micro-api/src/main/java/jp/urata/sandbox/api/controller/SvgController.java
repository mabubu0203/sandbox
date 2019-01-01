package jp.urata.sandbox.api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/svg")
class SvgController {

    /**
     * svgファイル出力のサンプル
     */
    @GetMapping(path = {"sample"}, produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public String svg() {
        StringBuilder sb = new StringBuilder();
        sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"600px\" height=\"400px\" viewBox=\"0 0 600 400\">");
        sb.append("</svg>");
        return sb.toString();
    }

}
