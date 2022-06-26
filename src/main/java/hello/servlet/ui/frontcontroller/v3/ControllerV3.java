package hello.servlet.ui.frontcontroller.v3;

import hello.servlet.ui.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
