package jp.urata.sandbox.api.helper;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@Component
public class SvgHelper {

    private final ResourceLoader resourceLoader;

    public SvgHelper(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    /**
     * svgファイル出力のサンプル
     *
     * @return svgファイル文字列
     */
    public String svg() {
        final String filePath = "statics/svg/sample.svg";

        try {
            Resource resource = resourceLoader.getResource("classpath:" + filePath);
            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8))) {
                br.lines().forEach(line -> sb.append(line));
                return sb.toString();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return "";
        }

    }
}
