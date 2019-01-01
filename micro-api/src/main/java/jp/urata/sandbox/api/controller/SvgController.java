package jp.urata.sandbox.api.controller;

import jp.urata.sandbox.api.helper.SvgHelper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/svg")
class SvgController {

    private final SvgHelper helper;

    SvgController(SvgHelper helper) {
        this.helper = helper;
    }

    /**
     * svgファイル出力のサンプル
     *
     * @return 文字列
     */
    @GetMapping(path = {"sample"}, produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    String svg() {
        return helper.svg();
    }

}
