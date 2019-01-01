package jp.urata.sandbox.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/svg")
class SvgController {

    /**
     * svgファイル出力のサンプル
     *
     * @return view
     */
    @GetMapping(path = {"sample"})
    String svg() {
        return "svg";
    }

}
