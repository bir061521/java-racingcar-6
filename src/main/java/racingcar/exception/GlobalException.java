package racingcar.exception;

public class GlobalException extends RuntimeException{//커스텀 예외클래스에 대한 부모 커스텀 예외 클래스
    public GlobalException(final String message){
        super(message);
    }
}
