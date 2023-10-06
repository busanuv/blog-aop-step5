package shop.mtcoding.aopstudy._core.error.ex;

import lombok.Getter;

@Getter
public class Exception400 extends RuntimeException {

    public Exception400(String msg) {
        super(msg);
    }
}
